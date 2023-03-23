package SmartPhone;

import SmartPhone.herencia.SmartPhone;
import SmartPhone.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartWatch BrunoWatch = new SmartWatch(2, 4, 6, 4000, false, "batery");
        SmartPhone BrunoPhone = new SmartPhone(25, 48, 6, 1500, 33, 991);


        System.out.println(BrunoPhone);
        System.out.println(BrunoWatch);
    }
}