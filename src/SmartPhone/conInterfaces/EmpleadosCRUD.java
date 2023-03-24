package SmartPhone.conInterfaces;

import SmartPhone.sinInterfaces.Empleado;
import java.util.List;

public interface EmpleadosCRUD {

    void save(Empleado empleado);
    List<Empleado> findAll();

    void delete(Empleado empleado);
}
