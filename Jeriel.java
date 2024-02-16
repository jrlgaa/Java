package jeriel;

public class Jeriel {
    
    public int bowValue;
    public int swordValue;
    public int staffValue;
    
    public void bow() {
        bowValue = (int)(Math.random()*100) + 1;
        System.out.println("Bow:   " + bowValue);
    }

    public void sword() {
        swordValue = (int)(Math.random()*100) + 1;
        System.out.println("Sword: " + swordValue);
    }

    public void staff() {
        staffValue = (int)(Math.random()*100) + 1;
        System.out.println("Staff: " + staffValue);
    }

    public static int getTotal(Jeriel jerielObj) {
        return jerielObj.bowValue + jerielObj.swordValue + jerielObj.staffValue;
    }

    public static void main(String[] args) {
        Jeriel jerielObj = new Jeriel();

        jerielObj.bow();
        jerielObj.sword();
        jerielObj.staff();  
        System.out.println("Total: " + getTotal(jerielObj));
    }
}