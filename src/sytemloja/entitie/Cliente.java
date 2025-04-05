package sytemloja.entitie;

import sytemloja.entities.enums.OrderStatus;

import java.util.Date;

public class Cliente {

    private String name;
    private String email;
    private Date nascimento;

    public Cliente(){}

    public Cliente(String name, String email, Date nascimento){
        this.name = name;
        this.email = email;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
