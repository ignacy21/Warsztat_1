package zadanie3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Invoice> invoiceList = new ArrayList<>();
        Invoice invoice = new Invoice();

//        printAll("CEO: ADD INVOICE(123.40)", invoiceList, invoice);
//        printAll("CEO: ADD INVOICE(12.41)", invoiceList, invoice);
//        printAll("CEO: ADD INVOICE(429.10)", invoiceList, invoice);
//        printAll("ACCOUNTANT: PROCESS INVOICE", invoiceList, invoice);
//        printAll("CEO: ADD INVOICE(121.40)", invoiceList, invoice);
//        printAll("CEO: ADD INVOICE(812.41)", invoiceList, invoice);

        while (sc.hasNext()) {
            String command = sc.nextLine();
            if ("STOP".equals(command)) break;
            printAll(command, invoiceList, invoice);
        }


    }


    private static void printAll(String command, List<Invoice> invoiceList, Invoice invoice) {
        String[] strings = command.split(" ");

        if (command.contains("CEO: ADD INVOICE")) {
            int length = strings[2].length();
            String substring = strings[2].substring(0, 8);
            String substring1 = strings[2].substring(length - 1, length);
            if (
                            strings[0].equalsIgnoreCase("CEO:") &&
                            strings[1].equalsIgnoreCase("ADD") &&
                            substring.equalsIgnoreCase("INVOICE(") &&
                            substring1.equalsIgnoreCase(")")
            ) {
                printForCEO(command, invoice, invoiceList);
            }
        } else if (
                command.contains("ACCOUNTANT: PROCESS INVOICE")) {
            {
                printForACCOUNTANT(command, invoiceList);
            }
        } else {
            System.out.println("O co ci chodzi?");
        }

    }

    private static void printForCEO(String command, Invoice invoice, List<Invoice> invoiceList) {
        BigDecimal amountRed = returnAmountRed(command);
        BigDecimal amount = returnAmount(amountRed, invoice);
        Integer counter  = returnCounter(invoice);

        LocalDateTime now = LocalDateTime.now();
        String id = counter + "/" + now.getYear();

        Invoice finalInvoice = new Invoice(id, amountRed, counter);

        invoiceList.add(finalInvoice);

        System.out.println(command.toUpperCase());
        System.out.println("CEO added invoice: ID: " + finalInvoice.getId() + ", amount " + amountRed);
        System.out.println("Current invoices amount: " + amount + ". Invoices: " + invoiceList);
        System.out.println();
    }


    private static void printForACCOUNTANT(String command, List<Invoice> invoiceList) {
        BigDecimal amount = new BigDecimal(0);
        for (Invoice invoice : invoiceList) {
            amount = amount.add(invoice.getAmount());
        }

        System.out.println(command.toUpperCase());
        System.out.println("ACCOUNTANT processed invoice: " + invoiceList.get(invoiceList.size() - 1));
        invoiceList.remove(invoiceList.size() - 1);
        System.out.println("Current invoices amount: " + amount + ". Invoices: " + invoiceList);
        System.out.println();

    }

    private static BigDecimal returnAmountRed(String command) {
        String[] strings = command.split(" ");
        String s = strings[2];
        int length = strings[2].length();
        double convertStr_to_Doub = Double.parseDouble(s.substring(8, length - 1));

        return BigDecimal.valueOf(convertStr_to_Doub);
    }
    private static Integer returnCounter(Invoice invoice) {
        if (invoice.getCounter() == null) {
            invoice.setCounter(1);
        } else {
            invoice.setCounter(invoice.getCounter() + 1);
        }
        return invoice.getCounter();
    }
    private static BigDecimal returnAmount(BigDecimal bigDecimal, Invoice invoice) {
        if (invoice.getAmount() == null) {
            invoice.setAmount(bigDecimal);
        } else {
            invoice.setAmount(invoice.getAmount().add(bigDecimal));
        }
        return invoice.getAmount();
    }

}
