package com.course.cms.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHAPTERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chapter {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double progress;
    private Long moduleId;
}
