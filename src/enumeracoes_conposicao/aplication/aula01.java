package enumeracoes_conposicao.aplication;

import enumeracoes_conposicao.entites.Order;
import enumeracoes_conposicao.entities.enums.OrderStatus;

import java.util.Date;

public class aula01 {
    public static void main(String[] args){

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSANDO);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}