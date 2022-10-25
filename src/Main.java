public class Main {
    public static void main(String[] args) {
        //homework04 started
        //chapter 1, task 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Congratulations! You are in a legal age now!");
        }
        if (age < 18) {
            System.out.println("You have to wait till you will be in a legal age!");
        }

        //chapter 1, task 2
        int age1 = 23;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("The child goes to school.");
        }
        if (age1 < 7) {
            System.out.println("The child does not go to school.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("The person has already graduated school and can go to university.");
        }
        if (age1 >= 24) {
            System.out.println("The person has already graduated university and now it's time to search the first job.");
        }

        //chapter 1, task3
        int places = 63;
        int totalPlaces = 102;
        int seatingPlaces = 60;
        int standingPlaces = 42;
        if (places == 0) {
            System.out.println("There are " + totalPlaces + " vacant places. " + seatingPlaces + " seating places and " + standingPlaces + " standing places.");
        }
        if (places >= 1 && places <= 60) {
            totalPlaces = totalPlaces - places;
            seatingPlaces = seatingPlaces - places;
            System.out.println("There are " + totalPlaces + " vacant places. " + seatingPlaces + " seating places and " + standingPlaces + " standing places.");
        }
        if (places >= 61 && places < 102) {
            seatingPlaces = 0;
            standingPlaces = totalPlaces - places;
            totalPlaces = totalPlaces - places;
            System.out.println("There are " + totalPlaces + " vacant places. " + seatingPlaces + " seating places and " + standingPlaces + " standing places.");
        }
        if (places >= 102) {
            System.out.println("There are no vacant places in the railcar.");
        }

        //chapter 2, task 1
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Congratulations! You are in a legal age now!");
        } else {
            System.out.println("You have to wait till you will be in a legal age!");
        }

        //chapter 2, task 2
        int age3 = 8;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("The child goes to school.");
        } else if (age3 < 7) {
            System.out.println("The child does not go to school.");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("The person has already graduated school and can go to university.");
        } else {
            System.out.println("The person has already graduated university and now it's time to search the first job.");
        }

        // chapter 2, task 3
        int places1 = 61;
        int totalPlaces1 = 102;
        int seatingPlaces1 = 60;
        int standingPlaces1 = 42;
        if (places1 == 0) {
            System.out.println("There are " + totalPlaces1 + " vacant places. " + seatingPlaces1 + " seating places and " + standingPlaces1 + " standing places.");
        } else if (places1 >= 1 && places1 <= 60) {
            totalPlaces1 = totalPlaces1 - places1;
            seatingPlaces1 = seatingPlaces1 - places1;
            System.out.println("There are " + totalPlaces1 + " vacant places. " + seatingPlaces1 + " seating places and " + standingPlaces1 + " standing places.");
        } else if (places1 >= 61 && places1 < 102) {
            seatingPlaces1 = 0;
            standingPlaces1 = totalPlaces1 - places1;
            totalPlaces1 = totalPlaces1 - places1;
            System.out.println("There are " + totalPlaces1 + " vacant places. " + seatingPlaces1 + " seating places and " + standingPlaces1 + " standing places.");
        } else {
            System.out.println("There are no vacant places in the railcar.");
        }

        //chapter 3, task 1
        int age4 = 26;
        boolean haveToGoToSchool = age4 >= 7 && age4 <= 18;
        boolean itIsTimeToGoToWork = age4 >= 24;
        boolean tooSmall = age4 <= 1;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("If the person's age equals " + age4 + " than he have to go to the kinder garden.");
        }
        if (haveToGoToSchool) {
            System.out.println("If the person's age equals " + age4 + " than he have to go to school.");
        } else if (age4 > 18 && age4 < 24) {
            System.out.println("If the person's age equals " + age4 + " than he have to go to the university.");
        } else if (itIsTimeToGoToWork) {
            System.out.println("If the person's age equals " + age4 + " than he have to go to work.");
        } else if (tooSmall) {
            System.out.println("If the person's age equals " + age4 + " than he is so small.");
        }

        //chapter 3, task 2
        int childAge = 15;
        boolean grownUp = childAge > 14;
        if (childAge <= 5) {
            System.out.println("The child is not allowed to ride on fun rides.");
        } else if (childAge > 5 && childAge <= 14) {
            System.out.println("The child can ride on fun rides with adult escort only.");
        } else if (grownUp) {
            System.out.println("The child can ride on fun rides without adult escort.");
        }

        //chapter 3, task 3
        int one = 15;
        int two = 75;
        int three = 250;
        boolean twoIsTheBiggest = two > one && two > three;
        if (one > two && one > three) {
            System.out.println("The biggest number is " + one);
        } else if (twoIsTheBiggest) {
            System.out.println("The biggest number is " + two);
        } else {
            System.out.println("The biggest number is " + three);
        }
    }
}
