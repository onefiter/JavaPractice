package com.onefiter.innerClass;

/**
 * @author onefiter
 * @Date 2023/5/26
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void fire(Employee e) {
        System.out.println(name + " fire " + e.no);
    }

    public class Employee {
        private int no;

        public Employee(int no) {
            this.no = no;
        }

        public void show() {
            System.out.println(name + " : " + no);
        }
    }
}
