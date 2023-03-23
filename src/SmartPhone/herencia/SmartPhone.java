package SmartPhone.herencia;

import SmartPhone.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    int screenNits;
    int voltageBattery;

    public SmartPhone(){}
    public SmartPhone(int height,int  width,int screenInches, int batteryLife, int voltageBattery, int screenNits ){
        super(height, screenInches, batteryLife, width);
        this.voltageBattery = voltageBattery;
        this.screenNits = screenNits;
    }

    @Override
    public String toString() {
        return super.toString() + " Nits de la pantalla: " + this.screenNits + " Voltage de carga de batería: " + this.voltageBattery;
    }
}
