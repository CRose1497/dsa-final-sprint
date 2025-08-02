package com.sprint.bstapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TreeEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String input;
    private LocalDateTime createdAt;

    public TreeEntry() {
        this.createdAt = LocalDateTime.now();
    }

    public TreeEntry(String input) {
        this.input = input;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getInput() { return input; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setInput(String input) { this.input = input; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
