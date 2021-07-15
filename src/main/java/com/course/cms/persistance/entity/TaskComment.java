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
@Table(name = "TASK_COMMENTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskComment {
    @Id
    @GeneratedValue
    private Long id;
    private String content;
    private Long taskId;
    private Long userId;
}
