class student{
    void exam() {
    System.out.println("he went to exam hall");
    }
    }
    
    class boy extends student{
    void boy() {
    System.out.println("he sat at his place");
    }
    }
    
    class girl extends student {
    void girl() {
    System.out.println("he saw a girl");
    }
    }
    
    class crush extends student {
    void crushed() {
    System.out.println("he had a crush on her");
    }
    }
    class Hierarchical{
    public static void main (String args[]) {
    boy charan = new boy();
    girl rt = new girl();
    crush r2 = new crush();

    charan.exam();
    charan.boy();
    rt.exam();
    rt.girl();
    r2.exam();
    r2.crushed();
    
    }
    }
    