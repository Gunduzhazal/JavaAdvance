package class11;

import java.util.ArrayList;

public class WhyWeNeedIterator {

    public static void main(String[] args) {

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        for (int i=0; i<beautyProducts.size(); i++) {
           if (beautyProducts.get(i).endsWith("r")) {
               beautyProducts.remove(i);
           }
        }

        System.out.println(beautyProducts);

    }
}
