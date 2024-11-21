public class Rotulo {
    private int id;
    private String rotulo;

    public Rotulo(int id, String rotulo){
        this.id = id;
        this.rotulo = rotulo;
    }

    public Rotulo(int id){
        this.id = id;
        this.rotulo = "";
    }

    public int getId(){
        return this.id;
    }

    public String getRotulo(){
        return this.rotulo;
    }

    public void setRotulo(String rotulo){
        this.rotulo = rotulo;
    }

    public String toString(){
        return this.id + " " + this.rotulo;
    }
}
