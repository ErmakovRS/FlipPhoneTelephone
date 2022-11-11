public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("11 pro", 3, 194);
        String iphoneModel = iphone.getModel();
        int iphoneAge = iphone.getAge();
        int iphoneWeight = iphone.getWeight();

        Phone samsung= new Phone("Galaxy s22", 2, 180);
        String samsungModel = samsung.getModel();
        int samsungAge = samsung.getAge();
        int samsungWeight = samsung.getWeight();

        Phone xiaomi = new Phone("Mi 8", 3, 250);
        String xiaomiModel = xiaomi.getModel();
        int xiaomiAge = xiaomi.getAge();
        int xiaomiWeight = xiaomi.getWeight();

        System.out.println("Модель телефона" + iphoneModel);
        System.out.println("Возраст телефона" + iphoneAge);

        System.out.println("Модель телефона" + samsungModel);
        System.out.println("Возраст телефона" + samsungAge);

        System.out.println("Модель телефона" + xiaomiModel);
        System.out.println("Возраст телефона" + xiaomiAge);
    }
}