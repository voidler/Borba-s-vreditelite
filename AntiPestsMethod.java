import java.util.Scanner;

public class AntiPestsMethod<random_int> {
    public static void main(String[] args) {
         RobotNavigation();
        ProgrammingFightingSystem();
         BatteryChargingSystem();
         RobotCommunication();
    }

    public static void RobotNavigation() {
        Scanner RobotInstructions = new Scanner(System.in);
        String object = RobotInstructions.next();
        switch (object) {
            case "wall":
                System.out.println("Go Sideaway");
                break;
            case "chair":
                System.out.println("Jump");
                break;
            case "nothing":
                System.out.println("Forward");
                break;
        }
    }

    public static void ProgrammingFightingSystem() {
        Scanner RobotInstructions2 = new Scanner(System.in);
        int pixels = RobotInstructions2.nextInt();
        if (pixels % 2 == 0) {
            System.out.println("Mouse detected! Ready to attack!");
            int count = 0;
            final int TOTAL_PUNCHES = 4;
            int punches = RobotInstructions2.nextInt();
            if (punches < TOTAL_PUNCHES) {
                System.out.println("One more punch left before exhaustion of the batteries");


                int min = 1;
                int max = 10;
                System.out.println("Random number from " + min + " to " + max + " :");
                int random_int = (int) (Math.random() * (max - min + 1) + min);
                System.out.println(random_int);
                if (5 == random_int)  {
                    System.out.println("Furnitures destroyed");
                } else {
                    System.out.println("Mouse destroyed. "); ++count;
                    if ((punches + count) < TOTAL_PUNCHES) {
                        System.out.println("Detect next victim");
                    } else {
                        System.out.println("Needs recharge");
                    }
                }
            } else {
                System.out.println("Batteries exhausted . Needs recharging");
            }
        } else {
            System.out.println("Mouse not detected");
        }
    }

        public static void BatteryChargingSystem () {
            int min = 1;
            int max = 1000;
            int random_int1 = (int) (Math.random() * (max - min + 1) + min);
            int random_int2 = (int) (Math.random() * (max - min + 1) + min);
            if (random_int1 > random_int2) {
                System.out.println("There is electricity in the socket");
            } else if (random_int1 < random_int2) {
                System.out.println("There is no electricity in the socket");
            } else if (random_int1 == random_int2) {
                System.out.println("Repeat");
                int random_int3 = (int) (Math.random() * (max - min + 1) + min);
                int random_int4 = (int) (Math.random() * (max - min + 1) + min);
                if (random_int3 > random_int4) {
                    System.out.println("There is electricity in the socket");
                } else if (random_int3 < random_int4) {
                    System.out.println("There is no electricity in the socket");
                }
            }
        }
        public static void RobotCommunication () {
            int number = 10;
            while (number >= 1) {
                System.out.println(number);
                number--;
                if (number % 2 == 0) {
                    System.out.println("I am a Robottttt " + number);
                }
            }
        }
    }




