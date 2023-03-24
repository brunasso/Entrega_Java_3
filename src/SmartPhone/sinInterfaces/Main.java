package SmartPhone.sinInterfaces;

import java.util.List;
public class Main {

    public static void main(String[] args){
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

    Empleado Jorge = new Empleado("Jorge", 25, 25.200, true);
    Empleado Andrea = new Empleado("Jorge", 25, 25.200, true);
    Empleado Mohana = new Empleado("Jorge", 25, 25.200, true);


        empleadoCRUD.save(Jorge);
        empleadoCRUD.save(Andrea);
        empleadoCRUD.save(Mohana);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
