package com.campus.cafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Product[] products = new Product[10];
        int count = 0;
        int choice;
        do{
            System.out.println("\n --- Campus Cafe Inventory---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Total stock value");
            System.out.println("4. Average price");
            System.out.println("5. Restock a product");
            System.out.println("6. Duplicate a product");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice < 0 || choice > 6) {
                System.out.println("Error: Invalid choice, try again.");
            }
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    if(count==10)
                    {
                        System.out.println("Error: System is Full cannot add products in Inventory.");
                    }
                    else if (price <=0 || quantity <0)
                    {
                        System.out.println("Error: Price or Quantity cannot be negative");
                    }
                    else {
                        products[count] = new Product(name,price,quantity);
                        count++;
                    }
                break;
                case 2:
                    if(count ==0){
                        System.out.println("Error: No Products to Display");
                    }
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.print(i + 1 + " ");
                            products[i].display();
                        }
                    }
                    break;
                case 3:
                    if(count ==0)
                    {
                        System.out.println("Error: No Product in Inventory");
                    }
                    else {
                        double totalVal=0.0;
                        for (int i = 0; i < count; i++) {
                            totalVal+=products[i].stockValue();
                        }
                        System.out.println(totalVal);
                    }
                    break;
                case 4:
                    double avgPrice=0.0;
                    if(count==0)
                    {
                        System.out.println("Error: No Products in Inventory");
                    }
                    else {
                        for (int i = 0; i < count; i++) {
                            avgPrice += products[i].price;
                        }
                        System.out.println(avgPrice / count);
                        System.out.println("Rounded down: "+(int) (avgPrice / count));
                    }
                    break;
                case 5:
                    System.out.print("Product number: ");
                    int num = sc.nextInt();
                    System.out.print("Quantity to add: ");
                    int extra = sc.nextInt();
                    sc.nextLine();
                    if(num >=1 &&num<=count && extra>0)
                    {
                        products[num-1].quantity=products[num-1].quantity+extra;
                    }
                    else{
                        System.out.println("Error: Kindly Enter Valid Num and Quantity");
                        products[num-1].quantity=products[num-1].quantity+extra;
                    }
                    break;
                case 6:
                    System.out.print("Product number: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    if(n>=1 && n<=count)
                    {
                        products[count] = new Product(products[n-1]);
                        count++;
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }


        } while (choice != 0);
        System.out.println("Products created in total: " + Product.totalProducts);
    }
}
