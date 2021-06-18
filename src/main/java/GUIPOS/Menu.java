/*
Old classes from Week 5 - Laboratory Exercise
These classes can be reused in the GUI version of the program

Simply import this file on POS.java using
import GUIPOS.Menu;
 */

package GUIPOS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

// All text display related functions
class Display {
    public static void menu() {
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t      WELCOME TO PLM PIZZAZERIA");
            System.out.println("\t\t\t\t        [1] New Order");
            System.out.println("\t\t\t\t        [2] About pizzaPOS");
            System.out.println("\t\t\t\t        [3] Exit");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void order(Purchase t_purchase) {
            System.out.println("\n\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t           ORDER NO. " + t_purchase.getNumber());
            System.out.println("\t\t\t\t        [1] Add Food");
            System.out.println("\t\t\t\t        [2] Pay and Finish Order");
            System.out.println("\t\t\t\t        [3] Cancel Order");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            t_purchase.listOrders();
    }
    
    public static void food() {
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t           MENU");
            System.out.println("\t\t\t\t        [1] Pizza");
            System.out.println("\t\t\t\t        [2] Pasta");
            System.out.println("\t\t\t\t        [3] Chicken");
            System.out.println("\t\t\t\t        [4] Beverage");
            System.out.println("\t\t\t\t        [5] CANCEL");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public static void pay() {
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t          PAYMENT METHOD");
            System.out.println("\t\t\t\t        [1] Cash");
            System.out.println("\t\t\t\t        [2] Credit Card");
            System.out.println("\t\t\t\t        [3] Debit Card");
            System.out.println("\t\t\t\t        [4] PayMaya");
            System.out.println("\t\t\t\t        [5] GCash");
            System.out.println("\t\t\t\t        [6] CANCEL ORDER");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void PizzaOrder() {
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Pizza Menu               ");
        System.out.println("\t\t\t\t        	Name			REGULAR [R]			LARGE [L]			PARTY[P]");
        System.out.println("\t\t\t\t        [P] Pepperoni        		   349				  599				  799");
        System.out.println("\t\t\t\t        [H] Hawaiian           		   349				  599				  799");
        System.out.println("\t\t\t\t        [4] 4 Cheese           		   349			 	  599				  799");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void PastaOrder() {
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Pasta Menu               ");
        System.out.println("\t\t\t\t        	Name			Solo [S]			Pan [P]");
        System.out.println("\t\t\t\t        [S] Spaghetti        		   99				  249");
        System.out.println("\t\t\t\t        [C] Carbonara           	   99				  249");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void ChickenOrder() {
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Bucket of Chicken Menu               ");
        System.out.println("\t\t\t\t        	Name					Price");
        System.out.println("\t\t\t\t        [S] Small Bucket       		   299");
        System.out.println("\t\t\t\t        [M] Medium Bucket	           549");
        System.out.println("\t\t\t\t        [L] Large Bucket	           799");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public static void BeverageOrder() {
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Beverages Menu               ");
        System.out.println("\t\t\t\t        	Name			Tin Can [T]			Pitcher [P]");
        System.out.println("\t\t\t\t        [P] Pepsi       		   49				  99");
        System.out.println("\t\t\t\t        [C] Coke	          	   49				  99");
        System.out.println("\t\t\t\t        [S] Sprite	          	   49				  99");
        System.out.println("\t\t\t\t        [Ro] Royal	          	   49				  99");
        System.out.println("\t\t\t\t        [Rb] Root Beer         	   49				  99"); 
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printReceipt(Purchase t_purchase) {
        DecimalFormat formatter = new DecimalFormat("#.00");
        System.out.println("\n\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t                Receipt");
        t_purchase.listOrders();
        System.out.println("\t\t\t\t     Amount Paid: " + formatter.format(t_purchase.getAmount()));
        System.out.println("\t\t\t\t          Change: " + formatter.format(t_purchase.getChange()));
        System.out.println("\n\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void paymentSuccess() {
        
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t            Enjoy your meal!");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void error(String t_paymentStatus) {
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Uh-oh somthing went wrong with your transaction               ");
        System.out.println("\t\t\t\t        Status: " + t_paymentStatus); 
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }

    public static void about() {
        System.out.println();
        System.out.print("                                               8b,dPPYba,  ,d8888888b, ,d888888888\n" +
        "            88                                 88P'    \"8a 88\"     \"88 8877777777 \n" +
        "            \"\"                                 88       d8 88       88 88         \n" +
        "                                               88       dP 88       88 88,        \n" +
        "8b,dPPYba,  88 888888888 888888888 ,adPPYYba,  88b,   ,a8\" 88       88 `888888888b\n" +
        "88P'    \"8a 88      a8P\"      a8P\" \"\"     `Y8  88`YbbddP   88       88         `b8\n" +
        "88       d8 88   ,d8P'     ,d8P'   ,adPPPPP88  88          88       88         ,d8\n" +
        "88b,   ,a8\" 88 ,d8\"      ,d8\"      88,    ,88  88          88,     ,88  aaaaaaaa88\n" +
        "88`YbbdP\"'  88 888888888 888888888 `\"8bbdP\"Y8  88          `\"8888888\"` 888888888P \n" +
        "88                                                                                \n" +
        "88                                                                                \n");
        System.out.println();
        System.out.println("Group 1");
        System.out.println("Sacayanan, Christian John P.");
        System.out.println("Paz, Kristel Erica D.");
        System.out.println("Lenizo, Jackilyn O.");
        System.out.println("Dela Cruz, Rica V.");
        System.out.println("Cruz, James Laurence A.\n");
        System.out.println("BS CpE 2-3 | Software Design (Lab)\n\n");
        System.out.println("Enter any key to go back.");
        Scanner input = new Scanner(System.in);
        input.next();
    }
}

// ABSTRACTION: Abstract class only to be used for the sake of inheritance
// The transaction class isn't really a necessary real-world object
// it only exists to hold abstract data, which is the transactionNumber
abstract class Transaction {
    // ENCAPSULATION: transactionNumber is a private variable, it only has a
    // getter and no setter, therefore is non-editable after construction.
    private int transactionNumber;        

    public Transaction(int t_transactionNumber) {
        super();
        this.transactionNumber = t_transactionNumber;
    }

    public int getNumber() {
        return transactionNumber;
    }
}

// INHERITANCE: Transaction is the superclass, Purchase is the subclass
class Purchase extends Transaction {
    // ENCAPSULATION: The following variables are privated, and can only be
    // accessed and edited through getters and setters below. The following are
    // encapsulated for protecting against overwriting data which makes the purchase
    // invalid. ex. Cashier manually editing the subtotal without properly computing
    private double subtotal;
    private double amountPaid;
    private double amountChange;
    private final double VAT = 0.12;
    private ArrayList<Menu> orderList = new ArrayList(); // ArrayList in Java are just dynamic arrays
    
    private DecimalFormat formatter = new DecimalFormat("#.00");

    public Purchase(int t_transactionNumber) {
        super(t_transactionNumber);
    }

    public void addOrder(Menu t_item) {
        this.orderList.add(t_item);
    }
    
    public void listOrders() {
        System.out.println("\n\t\t\t\t\tOrders (" + orderList.size() + ")");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (orderList.isEmpty()) {
            System.out.println("\t\t\t\tThere are no orders yet, add one by pressing [1]");
        } else {
            for (int i = 0; i < orderList.size(); i++) {
                System.out.println("\t\t\t\t" + orderList.get(i).getName() + " - " + orderList.get(i).getPrice());
            }
        }
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t        Subtotal: " + formatter.format(getSubtotal()));
        System.out.println("\t\t\t\t             VAT: " + formatter.format(getVAT()));
        System.out.println("\t\t\t\t           Total: " + formatter.format(getTotal()));
    }
    
    public double getSubtotal() {
        subtotal = 0; // Reset subtotal to 0 first or else we count the previous getSubtotal() value
        for (int i=0; i < orderList.size(); i++) {
            subtotal = subtotal + orderList.get(i).price; // Get price of every item in orderList
        }
        return subtotal;
    }

    public double getVAT() {
        return subtotal * VAT;
    }

    public double getTotal() {
        return subtotal * (1 + VAT);
    }

    public double getAmount() {
        return amountPaid;
    }

    public double getChange() {
        return amountChange;
    }
    
    public String pay(Payment t_payment) {
        if (t_payment.getAmount() >= subtotal * (1 + VAT) && t_payment.isValid()) {
        // Pag tama amount ng pera nung bumili, ibig sabihin proceed, else return an error code
            this.amountPaid = t_payment.getAmount();
            this.amountChange = t_payment.getAmount() - subtotal * (1 + VAT);
            return "Success";
        } else if (t_payment.getAmount() < subtotal * (1 + VAT)) {
            return "Insufficient payment";
        } else if (!t_payment.isValid()) {
            return "Invalid payment details";
        } else {
            return "Unknown Error";
        }
    }
}

class Payment {
    // ENCAPSULATION: This class lumps together data that is related to the
    // customer's payment. It stores the payment method, amount paid, and
    // card details.
    // Encapsulation in this example is also used for data hiding. The
    // customer's card details are private, and also there are no getters for it
    // therefore, it cannot be read from anywhere else outside this class

    private String method; // Method can be "cash" or "card/online"
    private double amount;
    private String cardNumber;
    private String pin;
    private String accountHolder;

    // POLYMORPHISM: The Payment constructor is overloaded to handle either 
    // 2 parameters, or 6 parameters. Cash payments only need the method and
    // amount paid. But card payments need extra details, hence 6 parameters.
    public Payment(String t_method, double t_amount) {
        this.method = t_method;
        this.amount = t_amount;
    }
    
    public Payment(String t_method,
                    double t_amount,
                    String t_cardNumber,
                    String t_pin,
                    String t_accountHolder) {
        this.method = t_method;
        this.amount = t_amount;
        this.cardNumber = t_cardNumber;
        this.pin = t_pin;
        this.accountHolder = t_accountHolder;
    }
    
    // ENCAPSULATION: The opposite is used in the amount variable. It can only
    // be read, but the initial value from the constructor cannot be overwritten
    // because there is no getter. This is another example of encapsulation for
    // data protection
    public double getAmount() {
        return this.amount;    
    }
    
    public boolean isValid() {
        // To be a valid cash payment, only non-zero amt is needed
        // To be a valid online/card payment, check lengths of details
        if (method.equals("Cash") && amount != 0) {
            return true;
        } else if (method.equals("Card/Online")) {
            if (!(cardNumber.isEmpty() && pin.isEmpty() && accountHolder.isEmpty())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

// ABSTRACTION: The menu class cannot be instantiated on its own, because there
// is no such food that is "menu". This class' purpose is for it to be derived
// in the actual menu items that follows
abstract class Menu {
    protected String name;
    protected double price;
    
    public Menu(){
        super();
    }
    
    public Menu(String t_name, double t_price){
        this.name = t_name;
        this.price = t_price;
    }

    public void setName(String t_name) {
        this.name = t_name;
    }

    public void setPrice(double t_price) {
        this.price = t_price;
    }
    
    public String getName() {
        return name;        
    }

    public double getPrice() {
        return price;        
    }
}

// INHERITANCE: This class is derived from the Menu class, which makes Pizza a
// subclass of Menu
class Pizza extends Menu{
    private String size;
    private String flavor;
    
    public Pizza(){
        super();
    }
    
    public Pizza(String t_size, String t_flavor){
        if (null != t_size) {
            switch (t_size) {
            case "Regular"://regular
                this.setPrice(349);
                this.size = "Regular";
                break;
            case "Large"://large
                this.setPrice(599);
                this.size = "Large";
                break;
            case "Party"://party
                this.setPrice(799);
                this.size = "Party";
                break;
            default:
                System.out.println("Invalid option.");
            }
        }
        if (null != t_flavor) {
            this.flavor = t_flavor;
        }
        this.name = this.flavor + " " + this.size;
    }
}

// INHERITANCE: This class is derived from the Menu class, which makes Pasta a
// subclass of Menu
class Pasta extends Menu{
    private String serving;
    private String typeofPasta;
    
    public Pasta(){
        super();
    }
    
    public Pasta (String t_serving, String t_typeofPasta){
        if (null != t_serving) {
            switch (t_serving) {
              case "Solo": //solo
                    this.price = 99;
                    this.serving = "Solo";
                    break;
              case "Pan": //pan
                    this.price = 249;
                    this.serving = "Pan";
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        if (null != t_typeofPasta) {
            this.typeofPasta = t_typeofPasta;
        }
        this.name = this.serving + " " + this.typeofPasta;
    } 
}

// INHERITANCE: This class is derived from the Menu class, which makes Beverage a
// subclass of Menu
class Beverage extends Menu{
    public String size;
    public String drink;
    
    public Beverage() {
        super();
    }
    
    public Beverage(String t_size, String t_drink){
        if (null != t_size) {
            switch (t_size) {
                case "16 Oz":
                    this.size = "16 Oz";
                    this.price = 49;
                    break;
                case "1.5 Liter":
                    this.size = "1.5 Liter";
                    this.price = 99;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        if (null != t_drink) {
            this.drink = t_drink;
        }
        this.name = this.size + " " + this.drink;
    } 
}

// INHERITANCE: This class is derived from the Menu class, which makes Chicken a
// subclass of Menu
class Chicken extends Menu {
    public String size;
    public String flavor;
        
    public Chicken(){
        super();
    }
    
    public Chicken(String t_size, String t_flavor){
        if (null != t_size) {
            switch (t_size) {
            case "Small Bucket":
                this.size = "Small Bucket";
                this.price = 299;
                break;
            case "Medium Bucket":
                this.size = "Medium Bucket";
                this.price = 549;
                break;
            case "Large Bucket":
                this.size = "Large Bucket";
                this.price = 799;
                break;
            default:
                System.out.println("Invalid option.");
            }
        }
        
        this.flavor = t_flavor;
        
        this.name = this.flavor + " " + this.size + " Chicken";
    }
}
