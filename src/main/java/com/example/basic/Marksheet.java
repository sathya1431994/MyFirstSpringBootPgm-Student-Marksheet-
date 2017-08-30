package com.example.basic;

import javax.persistence.*;

@Entity
class Marksheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int english;
    private int maths;
    private int physics;
    private int chemistry;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "S_ID")
    private Student student;

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getId() {
        return Id;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getEnglish() {
        return english;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getMaths() {
        return maths;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getPhysics() {
        return physics;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public int getChemistry() {
        return chemistry;
    }

    
    public void setStudent(Student student) {
        this.student =student;
    }

}