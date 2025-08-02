package com.sprint.bstapp;

import com.sprint.bstapp.service.TreeEntryService;
import com.sprint.bstapp.model.TreeEntry;
import com.sprint.bstapp.repository.TreeEntryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TreeEntryServiceTest {

    @Test
    public void testSaveEntry() {
        TreeEntryRepository mockRepo = Mockito.mock(TreeEntryRepository.class);
        TreeEntryService service = new TreeEntryService(mockRepo);

        TreeEntry entry = new TreeEntry("1,2,3");
        when(mockRepo.save(any(TreeEntry.class))).thenReturn(entry);

        TreeEntry saved = service.saveEntry("1,2,3");
        assertEquals("1,2,3", saved.getInput());
    }

    @Test
    public void testGetAllEntries() {
        TreeEntryRepository mockRepo = Mockito.mock(TreeEntryRepository.class);
        TreeEntryService service = new TreeEntryService(mockRepo);

        TreeEntry e1 = new TreeEntry("1,2,3");
        TreeEntry e2 = new TreeEntry("4,5,6");

        when(mockRepo.findAll()).thenReturn(Arrays.asList(e1, e2));

        List<TreeEntry> entries = service.getAllEntries();
        assertEquals(2, entries.size());
    }
}
