package com.sprint.bstapp.controller;

import com.sprint.bstapp.model.BinarySearchTree;
import com.sprint.bstapp.model.TreeNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TreeController {

    private BinarySearchTree bst = new BinarySearchTree();

    @GetMapping("/enter-numbers")
    public String showForm() {
        return "enter-numbers";
    }

    @PostMapping("/process-numbers")
    public String processNumbers(@RequestParam("numbers") String numbers, Model model) {
        String[] numArray = numbers.split(",");

        for (String numStr : numArray) {
            try {
                int num = Integer.parseInt(numStr.trim());
                bst.insert(num);
            } catch (NumberFormatException ignored) {}
        }

        TreeNode root = bst.getRoot();
        model.addAttribute("root", root);
        return "result"; // You’ll build this next
    }
}
