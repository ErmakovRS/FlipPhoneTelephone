public class Main {
    public static void main(String[] args) {
    }
    public String ring () {
        String name = " Mark ";
        String surname = " Bebryakin ";
        String caller = name + surname;
        String num = " 623645 ";
        if (caller == num) {
            System.out.println(" SPAM ");
        } else if (caller == name + surname) {
            System.out.println(" Вам звонит" + name + surname);

        } else if (hasSimCard == false) {
            System.out.println(" Звонок невозможен ");
        }
    }
}
