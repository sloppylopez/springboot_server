package com.rabobank.demo.service;

import com.rabobank.demo.model.Transactions;

import java.util.Optional;

public interface TransactionsService {
    Optional<Transactions> findAllRecords();
}
