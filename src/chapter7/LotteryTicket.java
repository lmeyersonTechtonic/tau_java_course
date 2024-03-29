package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i = 0; i < LENGTH; i++) {
            int randomNumber;
//            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Performs a sequential search on an array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found; false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        // enhanced loop
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }

        return false;

    }

    public static void printTicket(int[] ticket) {
        for(int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        // sort array
        Arrays.sort(array);

        int idx = Arrays.binarySearch(array, numberToSearchFor);
        if (idx >= 0) {
            return true;
        } else return false;


    }

}
