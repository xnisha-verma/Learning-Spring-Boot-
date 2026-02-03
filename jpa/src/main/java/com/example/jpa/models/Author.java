package com.example.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
//@Table(
//    name="AUTHOR_TBL"
//)
public class Author extends  BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(
            name="f_name",
            length = 40
    )
    private String fname; 
    private String lname;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private  int age;
    @Column(
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;
//
    @ManyToMany(mappedBy = "authors")
    private List<Course> courseList;

}
