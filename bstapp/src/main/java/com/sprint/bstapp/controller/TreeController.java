package com.sprint.bstapp.controller;

import com.sprint.bstapp.model.BinarySearchTree;
import com.sprint.bstapp.model.TreeEntry;
import com.sprint.bstapp.service.TreeEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class TreeController {

    @Autowired
    private TreeEntryService treeEntryService;

    @GetMapping("/")
    public String showForm() {
        return "enter-numbers";
    }

    @PostMapping("/build")
    public String buildTree(@RequestParam("numbers") String numbers, Model model) {
        String[] parts = numbers.split(",");
        BinarySearchTree bst = new BinarySearchTree();

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part.trim());
                bst.insert(number);
            } catch (NumberFormatException e) {
                model.addAttribute("error", "Invalid input: " + part);
                return "enter-numbers";
            }
        }

        String treeStructure = bst.inOrder();
        TreeEntry entry = new TreeEntry(numbers, treeStructure);
        treeEntryService.saveTreeEntry(entry);

        model.addAttribute("originalInput", numbers);
        model.addAttribute("treeStructure", treeStructure);

        return "results";
    }

    @GetMapping("/previous")
    public String showPreviousTrees(Model model) {
        model.addAttribute("entries", treeEntryService.getAllEntries());
        return "results";
    }
}
