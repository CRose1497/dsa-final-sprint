package com.sprint.bstapp.service;

import com.sprint.bstapp.model.TreeEntry;
import com.sprint.bstapp.repository.TreeEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeEntryService {
    private final TreeEntryRepository repository;

    public TreeEntryService(TreeEntryRepository repository) {
        this.repository = repository;
    }

    public TreeEntry saveEntry(String input) {
        return repository.save(new TreeEntry(input));
    }

    public List<TreeEntry> getAllEntries() {
        return repository.findAll();
    }
}
