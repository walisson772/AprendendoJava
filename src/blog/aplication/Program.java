package blog.aplication;

import blog.entities.Coments;
import blog.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coments c1 = new Coments("Have a nice trip!");
        Coments c2 = new Coments("Wow that's awesome");
        Post p1 = new Post(fmt.parse("03/04/2025 19:31:49 "),
                "Traveling to new zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComents(c1);
        p1.addComents(c2);

        System.out.println(p1);
    }
}
