package homework.homework9.Exceptions;

public class Computer {
    private String name;
    private RAM ram;
    private Monitor monitor;


    public Computer(String name, RAM ram, Monitor monitor)
            {
        this.name = name;
        this.ram = ram;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public RAM getRam() {
        return ram;
    }

    public Monitor getMonitor() {
        return monitor;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRam(RAM ram)throws RamException {
        if (size()<0)
            throw new RamException();
        this.ram = ram;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public static void main(String[] args)  {

    }
}
