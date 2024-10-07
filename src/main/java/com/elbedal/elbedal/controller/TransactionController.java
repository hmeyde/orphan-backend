package com.elbedal.elbedal.controller;

import com.elbedal.elbedal.model.Transaction;
import com.elbedal.elbedal.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{userId}")
    public List<Transaction> getTransactions(@PathVariable String userId) {
        return transactionService.getTransactionsByUserId(userId);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}
