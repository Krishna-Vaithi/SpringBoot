package aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    void checkOut(String status){
        /*Logging
          Authentication & Authorization
          Sanitize the Data
         */
        System.out.println("CheckOut method from ShoppingCart class is called.");
    }

    public int quantity(){
        return 2;
    }
}
