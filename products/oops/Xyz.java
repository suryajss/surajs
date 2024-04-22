import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public int getPid() {
        return pid;
    }
}

class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("Enter product information for 5 products:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        int highestPricePid = findHighestPricePid(products);
        System.out.println("PID of the product with the highest price: " + highestPricePid);
    }

    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getTotalPrice();
        }
        return totalAmount;
    }

    public static int findHighestPricePid(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int highestPricePid = -1;

        for (Product product : products) {
            if (product.getTotalPrice() > maxPrice) {
                maxPrice = product.getTotalPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }
}
