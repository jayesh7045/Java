package springDemo;

import lombok.*;

import java.lang.reflect.Constructor;


public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    private String name;

    private int id;

    private Address address;




    private void destroyBean(){
        System.out.println("Here i am in destroey method");
    }


}