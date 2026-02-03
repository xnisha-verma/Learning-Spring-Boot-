package com.example.jpa.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="resource_type") only with single table strategy
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;
    @OneToOne
    @JoinColumn(name="lecture_id", unique = true)
    private Lecture lecture;
}
