package com.tuoppi.boot.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Tuoppi
 */
@Configuration
@EnableTransactionManagement
@PropertySource("WEB-INF/properties/database.properties")
public class PersistenceContext {
    
    @Autowired
    private Environment env;
    
    @Bean
    public LocalContainerEntityManagerFactoryBean emfb(DataSource ds,
            JpaVendorAdapter va) {
        
        LocalContainerEntityManagerFactoryBean emfb =
                new LocalContainerEntityManagerFactoryBean();
        emfb.setPackagesToScan("com.tuoppi.boot.model");
        emfb.setDataSource(ds);
        emfb.setJpaVendorAdapter(va);
        
        Properties jpaProperties = new Properties();
        jpaProperties.setProperty("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2dll.auto"));
        emfb.setJpaProperties(jpaProperties);
        
        return emfb;
    }
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));
        return ds;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf,
            DataSource ds) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(emf);
        txManager.setDataSource(ds);
        return txManager;
    }
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        va.setDatabase(Database.DERBY);
        va.setDatabasePlatform(env.getProperty("jdbc.dialect"));
        va.setGenerateDdl(true);
        va.setShowSql(true);
        return va;
    }
    
}