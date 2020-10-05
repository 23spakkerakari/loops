public class SelectionsIfElse {
    public static void main(String[] args) {
        //Scanner

        int userNum; //fill with Scanner method call

        System.out.println("IF ELSE IF SECTION");
        System.out.println("====================");
        if (userNum >= 10) {
            System.out.println(userNum + " is greater than 10");
        } else if (userNum >= 8) {
            System.out.println(userNum + " is greater than 8");
        } else if (userNum >= 5) {
            System.out.println(userNum + " is greater than 5");
        } else {
            System.out.println(userNum + " is less than 5");
        }


        //Logical OR
        System.out.println();
        System.out.println("LOGICAL OR");
        System.out.println("====================");
        if (userNum > 2 || userNum < 5) {
            System.out.println("Could be any value...?");
        }

        int result = userNum % 3;
        if (userNum > 15 || result == 0) {
            System.out.println("number is either greater than 15 " +
                    "or divisible by 3...");
        }

        //Logic AND
        System.out.println();
        System.out.println("LOGICAL AND");
        System.out.println("====================");
        if (userNum > 2 && userNum <= 5) {
            System.out.println("Could be any value...?");
        }

        //Logical NOT
        System.out.println();
        System.out.println("LOGICAL NOT");
        System.out.println("====================");
        boolean isDivisibleBy10 = userNum % 10 == 0;

        System.out.println("Boolean variables can hold true or false");
        System.out.println("Our variable has value of " + isDivisibleBy10);


        if (isDivisibleBy10) {
            System.out.println(userNum + " is divisible by 10");
        }


        if ( !(userNum % 4 == 0) ) {
            System.out.println("end up here when NOT divisible by 4");
        } else {
            System.out.println("end up here when divisible by 4");
        }

        if (userNum != 9) {
            System.out.println("Why are you not 9?");
        }

    }//end of main
}//end of class
