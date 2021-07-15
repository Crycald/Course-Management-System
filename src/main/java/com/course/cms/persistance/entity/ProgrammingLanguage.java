package com.course.cms.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROGRAMMING_LANGUAGES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProgrammingLanguage {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
