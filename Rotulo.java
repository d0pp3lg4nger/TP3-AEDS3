import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import aed3.Registro;

public class Rotulo implements Registro {
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

    public void setId(int id){
        this.id = id;
    }

    public String getRotulo(){
        return this.rotulo;
    }

    public void setRotulo(String rotulo){
        this.rotulo = rotulo;
    }

    public String toString(){
        return "\nID:       : " + this.id + 
               "\nRotulo:   : " + this.rotulo;
    }

    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(id);
        dos.writeUTF(rotulo);
        return baos.toByteArray();
    }

    public void fromByteArray(byte[] ba) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(ba);
        DataInputStream dis = new DataInputStream(bais);
        id = dis.readInt();
        rotulo = dis.readUTF();
    }

    public int compareTo(Object o) {
        return this.id - ((Rotulo)o).id;
    }
}
