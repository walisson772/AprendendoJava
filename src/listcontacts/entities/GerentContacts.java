package listcontacts.entities;

public class GerentContacts {

    private Integer id;
    private String name;
    private String num;

    public GerentContacts(){}

    public GerentContacts(Integer id, String name, String num){
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getNum(){
        return num;
    }
    public void setNum(String num){
        this.num = num;
    }

    public void opcoes(){
        System.out.println("\n========= Gerenciador de Tarefas =========");
        System.out.println("1 - Adicionar um novo contato");
        System.out.println("2 - Listar todos os contatos");
        System.out.println("3 - Buscar um contato pelo nome");
        System.out.println("4 - Remover um contato pelo nome");
        System.out.println("5 - Sair");
        System.out.println("==========================================");
    }

    public String toString() {
        return "Id: "+id+" Nome: " + name +
                ", numero: " + num;
    }
}
