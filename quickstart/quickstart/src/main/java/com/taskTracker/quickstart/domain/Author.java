package com.taskTracker.quickstart.domain;

import jdk.jshell.Snippet;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Author {
    private Long id;
    private String name;
    private Integer age;

//    public void setName(String tss) {
//        this.name=tss;
//    }
}
