
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println("");
        Main main = new Main();
        main.sum(1, 2);
        main.diff(3, 2);
        main.pro(4, 5);
        main.quo(9, 2);
    }

    int sum(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    int diff(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }

    int pro(int num1, int num2) {
        int total = num1 * num2;
        return total;
    }

    int quo(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Not posible divide with zero.");
        } else {
            int var10000 = num1 / num2;
        }

        int total_2 = -10;
        System.out.println("");
        System.out.println("Task 1aa");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        int number;
        while(total_2 != 0) {
            System.out.print("Enter a positive number (or negative to exit): ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
        }

        System.out.println("Loop is over.");
        System.out.println("");
        System.out.println("Task 1aaa");
        System.out.println("");

        do {
            System.out.print("Enter a positive number (or negative to exit): ");
            number = scanner.nextInt();
        } while(number >= 0);

        System.out.println("You entered a negative number. Exiting the loop.");
        System.out.println("");
        System.out.println("Task 1b with all its modifications up to 1f");
        System.out.println("");
        int total = 0;
        scanner.nextLine();

        while(true) {
            System.out.println("Which operation would you like to use: *, /, +, -, or = to finish?");
            String operation = scanner.nextLine();
            if (operation.equals("=")) {
                break;
            }

            System.out.println("Please enter any integer : ");
            String input = scanner.nextLine();
            int number_b = Integer.parseInt(input);
            if (number_b == -1000) {
                break;
            }

            if (operation.equals("+")) {
                total = this.sum(total, number_b);
            } else if (operation.equals("-")) {
                total = this.diff(total, number_b);
            } else if (operation.equals("*")) {
                total = this.pro(total, number_b);
            } else if (operation.equals("/")) {
                total = this.quo(total, number_b);
            } else {
                System.out.println("Unknown operation");
            }
        }

        System.out.println("Calculator Result is: " + total);
        System.out.println("");
        System.out.println("Task2");
        System.out.println("");
        int[] numbers = new int[10];
        int count = 0;
        boolean arrNum = true;

        while(true) {
            while(true) {
                int option;
                int x;
                int i;
                int number_3;
                String answer;
                int[] newNum;
                while(arrNum) {
                    System.out.println("Enter a number (enter -10 to stop): ");
                    option = scanner.nextInt();
                    if (option == -10) {
                        System.out.println("You have entered the following numbers: ");

                        for(number_3 = 0; number_3 < count; ++number_3) {
                            System.out.print(numbers[number_3] + " ");
                        }

                        System.out.println("\nDo you want to add more numbers? (y/n)");
                        answer = scanner.next();
                        if (answer.equalsIgnoreCase("y")) {
                            newNum = new int[numbers.length * 10];

                            for(i = 0; i < count; ++i) {
                                newNum[i] = numbers[i];
                            }

                            numbers = newNum;
                        } else {
                            arrNum = false;
                        }
                    } else {
                        if (count == numbers.length) {
                            newNum = new int[numbers.length * 2];

                            for(x = 0; x < count; ++x) {
                                newNum[x] = numbers[x];
                            }

                            numbers = newNum;
                        }

                        numbers[count] = option;
                        ++count;
                    }
                }

                System.out.println("End of program.");
                System.out.println("");
                System.out.println("Task3");
                System.out.println("");
                option = 0;

                while(true) {
                    while(option != 4) {
                        System.out.println("Choose an option:");
                        System.out.println("1. Is string a palindrome");
                        System.out.println("2. Filter an array");
                        System.out.println("3. Number is divisible by X");
                        System.out.println("4. Exit");
                        option = scanner.nextInt();
                        if (option == 1) {
                            System.out.println("Enter a string:");
                            answer = scanner.next();
                            if (isPalindrome(answer)) {
                                System.out.println("String is a palindrome.");
                            } else {
                                System.out.println("String is not a palindrome.");
                            }
                        } else if (option != 2) {
                            if (option == 3) {
                                System.out.println("Enter a number:");
                                number_3 = scanner.nextInt();
                                System.out.println("Enter a number X:");
                                x = scanner.nextInt();
                                if (isDivisible(number_3, x)) {
                                    System.out.println("" + number_3 + " is divisible by " + x + ".");
                                } else {
                                    System.out.println("" + number_3 + " is not divisible by " + x + ".");
                                }
                            } else if (option == 4) {
                                System.exit(0);
                            } else {
                                System.out.println("Invalid option, please try again.");
                            }
                        } else {
                            System.out.println("Enter numbers for the array, separated by comma:");
                            String[] nums = scanner.next().split(",");
                            newNum = new int[nums.length];

                            for(i = 0; i < nums.length; ++i) {
                                newNum[i] = Integer.parseInt(nums[i]);
                            }

                            System.out.println("Enter a number to remove from the array:");
                            i = scanner.nextInt();
                            int[] filteredArr = filterArray(newNum, i);
                            System.out.print("Filtered array: ");
                            int[] var15 = filteredArr;
                            int var16 = filteredArr.length;

                            for(int var17 = 0; var17 < var16; ++var17) {
                                i = var15[var17];
                                System.out.print("" + i + " ");
                            }

                            System.out.println();
                        }
                    }

                    return total_2;
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;

        for(int j = str.length() - 1; i < j; --j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            ++i;
        }

        return true;
    }

    public static int[] filterArray(int[] arr, int num) {
        int count = 0;
        int[] filteredArr = arr;
        int j = arr.length;

        int i;
        for(int var5 = 0; var5 < j; ++var5) {
            i = filteredArr[var5];
            if (i != num) {
                ++count;
            }
        }

        filteredArr = new int[count];
        j = 0;
        int[] var9 = arr;
        i = arr.length;

        for(int var7 = 0; var7 < i; ++var7) {
            i = var9[var7];
            if (i != num) {
                filteredArr[j] = i;
                ++j;
            }
        }

        return filteredArr;
    }

    public static boolean isDivisible(int number_3, int x) {
        return number_3 % x == 0;
    }
}
