package com.communityhub.springbootproject.dao;

import com.communityhub.springbootproject.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByPublished(boolean published);
    List<Message> findByTitleContaining(String title);
}