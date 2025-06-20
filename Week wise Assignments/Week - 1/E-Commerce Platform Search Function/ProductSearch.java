import java.util.Arrays;
import java.util.Comparator;


/*
  Linear Search: O(n) - Scans each product until it finds the target
      - Best Case: O(1)       Target is at the beginning
      - Average Case: O(n/2)  Target is in the middle
      - Worst Case: O(n)      Target is at the end or not found
      
  Binary Search: O(log n) - Divides the search space in half each time
      - Best Case: O(1)        Target is at the middle
      - Average Case: O(log n) Target is somewhere in the array
      - Worst Case: O(log n)   Target is not found or at the ends

  For an e-commerce platform:
   - If the product list is large and sorted then Binary Search is more efficient
   - If the list is small or unsorted then Linear Search is simpler 

   In production, search operations are usually optimized by Binary search

 */

 
public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search 
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) return products[mid];
            else if (products[mid].productId < targetId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        // 🛍️ Sample products
        Product[] products = {
            new Product(101, "Shoes", "Fashion"),
            new Product(205, "Laptop", "Electronics"),
            new Product(309, "Watch", "Accessories"),
            new Product(404, "Camera", "Electronics")
        };

        // Linear Search
        Product result1 = linearSearch(products, 205);
        System.out.println("Linear Search Result: " + result1);

        // Array must be sorted by productId
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        
        // Binary Search
        Product result2 = binarySearch(products, 205);
        System.out.println("Binary Search Result: " + result2);
    }
}

