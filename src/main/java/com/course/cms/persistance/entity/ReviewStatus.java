package com.course.cms.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW_STATUS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewStatus {
    @Id
    @GeneratedValue
    private Long id;
    private boolean isValid;
    private Long taskId;
}
