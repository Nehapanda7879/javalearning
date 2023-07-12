package multidiam.max.method;

 class acessmodifier {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int i){
        id=1;
    }
    public int getId(){
        return id;
    }


}
public class modifier {
    public static void main(String[] args) {
        acessmodifier neha = new acessmodifier();
        neha.setName("code with harry");
        System.out.println(neha.getName());
    }

}

