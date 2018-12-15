public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1= new Phone();
        Phone phone2= new Phone();
        Phone phone3= new Phone();

        phone1.setNumber("+380990000762");
        phone1.setModel("Xiaomi Redmi Note 5");
        phone1.setWeight(300);

        System.out.println(phone1.getNumber() +" "+ phone1.getModel()+ " " + phone1.getWeight());
        phone1.receiveCall("Nikita");
        System.out.println(phone1.getNumber());
        phone1.sendMessage("Для доступа к JoyCasino добавьте 2 перед JoyCasino ","+380990000762", "+380965369569", "+380951586789" );
        System.out.println(Phone.getCount());
    }

    }