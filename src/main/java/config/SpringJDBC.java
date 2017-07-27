/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//co the cau hinh bang ca xml va anotation
@Configuration
// duong dan file luu cau hinh src\main\resources
@PropertySource("classpath:SpringConfig/jdbc-mysql.properties")
public class SpringJDBC {

    @Autowired
    private Environment env;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user")); // ten database
        dataSource.setPassword(env.getProperty("jdbc.pass"));// password
        return (DataSource) dataSource;
    }

}
