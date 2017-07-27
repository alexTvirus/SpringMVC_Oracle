/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author Asus
 */
@Entity 
@Table(name = "USERS")

public class Userentity implements Serializable {

    @Id

    @Column(name = "iduser")
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;
    
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;



    public Userentity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    




    

 
}
