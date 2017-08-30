package com.example.basic;

import java.util.List;
import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="S_ID")
    private Long Id;
    private String sname;
    private String slocation;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "S_ID")
    private List<Marksheet> marksheets;

    public void setId(Long Id) {
        this.Id =Id;
    }

    public Long getId() {
        return Id;
    }

    public void setName(String sname) {
        this.sname = sname;
    }

    public String getName() {
        return sname;
    }

    public void setLocation(String slocation) {
        this.slocation = slocation;
    }

    public String getLocation() {
        return slocation;
    }
    public void setMarksheets(List<Marksheet> marksheets) {
        this.marksheets = marksheets;
    }

    public List<Marksheet> getMarksheets() {
        return marksheets;
    }
}