package Practice_Set11;   //Question 6 & 7 solved........
interface TVRemote{
    void TurnOn();
    void TurnOff();
}

interface SmartTVRemote extends TVRemote{
    void menu();
    void exit();
    void volUp();
    void volDown();
}

class TataSky implements SmartTVRemote{


    public void TurnOn()
    {
        System.out.println("Turned on TV");
    }

    public void TurnOff()
    {
        System.out.println("Turned off TV");
    }

    public void menu()
    {
        System.out.println("Menu is that");
    }

    public void exit()
    {
        System.out.println("exiting");
    }

    public void volUp()
    {
        System.out.println("volume upping");
    }

    public void volDown()
    {
        System.out.println("volume downning");
    }
    
}
public class Problem6 {


    public static void main(String[] args) {
        TataSky user1 = new TataSky();
        user1.TurnOn();
        user1.TurnOff();
        user1.menu();
        user1.exit();
        user1.volUp();
        user1.volDown();

    }
}
