package com.sunglowsys.config;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Employee;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContext {

    @Bean("employee")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Employee getEmployee(){
        return new Employee();
    }


    @Bean("address")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Address getAddress() {
        return new Address();
    }

}
