package com.example.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lecture extends  BaseEntity {
    private String name;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    // ONE lecture → ONE resource (inverse side)
    @OneToOne(mappedBy = "lecture", cascade = CascadeType.ALL)
    private Resource resource;
}
