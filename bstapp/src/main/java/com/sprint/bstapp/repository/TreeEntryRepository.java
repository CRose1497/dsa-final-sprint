package com.sprint.bstapp.repository;

import com.sprint.bstapp.model.TreeEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeEntryRepository extends JpaRepository<TreeEntry, Long> {
}
