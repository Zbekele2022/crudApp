package com.example.crudApp;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import crudApp.UserDao;

@SpringBootApplication
public class crudApp {
    
	 public static void main(String[] args) {
	        SpringApplication.run(crudApp.class, args);
        
		
		UserDao userDao = new UserDao();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Users");
            System.out.println("2. Read Users");
            System.out.println("3. Update Users");
            System.out.println("4. Delete Users");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    userDao.createUser(name, email);
                    break;
                case 2:
                    userDao.readUsers();
                    break;
                case 3:
                    System.out.println("Enter user ID to update:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new email:");
                    String newEmail = scanner.nextLine();
                    userDao.updateUser(updateId, newName, newEmail);
                    break;
                case 4:
                    System.out.println("Enter users ID to delete:");
                    int deleteId = scanner.nextInt();
                    userDao.deleteUser(deleteId);
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
