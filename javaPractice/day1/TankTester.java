package day1;

public class TankTester {
  public static void main(String[] args) {
    Tank t1 = new Tank(10);
    Tank t2 = new Tank(20);
    System.out.println("1: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());
    t1 = t2;//1st tank obj is marked GC
    System.out.println("2: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());
    t1.setLevel(27);
    System.out.println("3: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());
    t2.setLevel(t1.getLevel()+10);
     System.out.println("4: t1.level: " + t1.getLevel() +
          ", t2.level: " + t2.getLevel());
  }
}