package com.communityhub.springbootproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="message")
@Getter
@Setter

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    @Column(name = "postedby")
    private String postedby;

    public Message() {

    }
    public Message(String title, String description, boolean published, String postedby) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.postedby = postedby;
    }
}
