package SmartPhone.herencia;

import SmartPhone.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    boolean waterResistant;
    String typeOfEnergy;

    public SmartWatch(){}
    public SmartWatch(int height,int  width,int screenInches, int batteryLife, boolean waterResistant, String typeOfEnergy ){
        super(height, screenInches, batteryLife, width);
        this.typeOfEnergy = typeOfEnergy;
        this.waterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo de batería: " + this.typeOfEnergy;
    }
}
