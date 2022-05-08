import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Agenda {
    private String nombreAgenda;
    private ArrayList<Contacto> contactos;

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }


    public Agenda(String nombreAgenda, ArrayList<Contacto> contactos) {
        this.nombreAgenda = nombreAgenda;
        this.contactos = contactos;
    }
    public Agenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
        this.contactos = new ArrayList<>();
    }

    public Contacto getContacto(int indice) {

        return contactos.get(indice);

    }

    public boolean removeContacto(int indice) {
        Contacto remove = contactos.remove(indice);
        if (remove == null) {
            return false;

        } else {
            return true;
        }


    }
    public boolean add(Contacto contacto){
        return contactos.add(contacto);

    }


}
