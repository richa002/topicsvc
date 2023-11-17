package com.softech.topicsvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TopicEntity {
    @Id
    private long topicId;
    private String topicName;
    private int hours;
    private long courseId;
}



