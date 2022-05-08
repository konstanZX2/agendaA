public class Main  {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("1");
        agenda.add(new Contacto("1","maskofshadow","63336532","MOS@gmail.com","castelloon xd"));
        System.out.println(agenda.getContacto(0));

    }
}
