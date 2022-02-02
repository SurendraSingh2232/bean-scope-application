package com.sunglowsys;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Employee;

import com.sunglowsys.config.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Employee employee1 = context.getBean(Employee.class);
        System.out.println("id: " + employee1.getId());
        System.out.println("empId: " + employee1.getEmpId());
        System.out.println("dept: " + employee1.getDept());
        System.out.println("salary: " + employee1.getSalary());

        System.out.println();

        Employee employee2 = context.getBean(Employee.class);
        System.out.println("id: " + employee2.getId());
        System.out.println("empId: " + employee2.getEmpId());
        System.out.println("dept: " + employee2.getDept());
        System.out.println("salary: " + employee2.getSalary());

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        Address add = context.getBean(Address.class);

        System.out.println(add.getId());
        System.out.println(add.getHouseNo());
        System.out.println(add.getCity());
        System.out.println(add.getStreet());
        System.out.println(add.getZipcode());

        Address add2 = context.getBean(Address.class);

        System.out.println(add2.getId());
        System.out.println(add2.getHouseNo());
        System.out.println(add2.getCity());
        System.out.println(add2.getStreet());
        System.out.println(add2.getZipcode());


        System.out.println(add.hashCode());
        System.out.println(add2.hashCode());

    }
}
