package services;

import models.Transaction;
import repositories.TransactionRepository;

import java.util.List;

public class TransactionService {

    private static TransactionRepository transactionRepository = new TransactionRepository();

    public void saveTransaction() {
        Transaction transaction = new Transaction();

        transaction.setMerchant("Merchant 1");
        transaction.setAmount(300);

        transactionRepository.saveTransaction(transaction);
        System.out.println("Saved transaction!");
    }

    public void getTransactions() {
        List<Transaction> transactionList = transactionRepository.getTransactions();

        transactionList.forEach(System.out::println);
    }
}
