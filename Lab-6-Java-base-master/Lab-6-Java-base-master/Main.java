package ru.itmo;

import ru.billing.client.CatalogFileLoader;
import ru.billing.client.CatalogLoader;
import ru.billing.client.CatalogStubLoader;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.sync.Bank;
import ru.billing.sync.BankThread;
import ru.billing.warehouse.ItemCatalog;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        task1();

        System.out.println("Task2");
        task2();

        System.out.println("Task3");
        task3();
    }

    public static void task1() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();

        try {
            loader.load(catalog);
            catalog.addItem(catalog.findItemByID(1));
        } catch (CatalogLoadException | ItemAlreadyExistsException ex) {
            ex.printStackTrace();
        }
    }
    public static void task2() {
        Bank bankMain = new Bank();
        Thread threadOne = new BankThread(bankMain, 100, 2000);
        threadOne.setName("ThreadOne");
        threadOne.setPriority(Thread.MAX_PRIORITY);

        Thread threadTwo = new BankThread(bankMain, 50, 300);
        threadTwo.setName("ThreadTwo");
        threadTwo.setPriority(Thread.MAX_PRIORITY);

        threadOne.start();
        threadTwo.start();

        System.out.println(Thread.currentThread().getName());
    }

    public static void task3() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader catalogLoader = new CatalogFileLoader("file.txt");

        try {
            catalogLoader.load(catalog);
        } catch (CatalogLoadException ex) {
            ex.printStackTrace();
        }

        System.out.println(catalog);
    }
        }


}
