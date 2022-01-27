package exercises.lsn6inheritance.technology;

public class Computer {

    private String manufacturer;
    private String operatingSystem;
    private int memory;

    public Computer(String aManufacturer, String aOperatingSystem, int aMemory) {
        manufacturer = aManufacturer;
        operatingSystem = aOperatingSystem;
        memory = aMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
