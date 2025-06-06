import models.Buy;
import models.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Buy> buys = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        int continuar = 1;
        double limite = scanner.nextDouble();
        Card card = new Card(limite);
        while (limite <= card.getLimit() || continuar == 1){
            System.out.println("Digite a descrição da compra:");
            String description = scanner.next();
            System.out.println("Digite o valor da compra: ");
            double priceBuy = scanner.nextDouble();
            if(priceBuy > card.getLimit()){
                System.out.println("Saldo Insuficiente!");
                break;

            }else{
                buys.add(new Buy(description,priceBuy));
                System.out.println("Compra Realizada!");
                card.BuyRealized(priceBuy);
            }
            System.out.println("Digite 0 para sair ou 1 pra continuar");
            continuar = scanner.nextInt();
            if (continuar == 0){
                break;
            }
            else {
                continue;
            }
        }

        System.out.println("********************************");
        System.out.println("Compras Realizadas:");
        System.out.println();
        Collections.sort(buys);
        for (Buy buy : buys) {
            System.out.print(buy);
        }
        System.out.println();
        System.out.println(card);
    }
}