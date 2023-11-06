package com.day3_problems;
import java.util.Random;

class EmployeeWageComputation {
    // Constants
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("START\n");

        // Check Employee is Present or Absent (UC 1)
        int attendance = checkAttendance();
        System.out.println("Employee is " + (attendance == FULL_TIME ? "Present" : "Absent"));

        // Calculate Daily Employee Wage (UC 2)
        int dailyWage = calculateDailyWage(FULL_DAY_HOURS);
        System.out.println("Daily Employee Wage: Rs. " + dailyWage);

        // Add Part-time Employee & Wage (UC 3)
        dailyWage = calculateDailyWage(PART_TIME_HOURS);
        System.out.println("Part-time Employee Wage: Rs. " + dailyWage);

        // Solving using Switch Case Statement (UC 4)
        int employeeType = getRandomEmployeeType();
        dailyWage = calculateWageUsingSwitch(employeeType);
        System.out.println("Employee Wage using Switch Case: Rs. " + dailyWage);

        // Calculating Wages for a Month (UC 5)
        int monthlyWage = calculateMonthlyWage();
        System.out.println("Monthly Employee Wage: Rs. " + monthlyWage);

        // Calculate Wages till a condition of total working hours or days is reached for a month (UC 6)
        int totalWage = calculateWagesTillCondition();
        System.out.println("Total Employee Wage till condition: Rs. " + totalWage);

        System.out.println("\nThank You");
    }

    // Method to check if employee is present or absent
    static int checkAttendance() {
        return new Random().nextInt(2) + 1;
    }

    // Method to calculate daily employee wage
    static int calculateDailyWage(int hoursWorked) {
        return WAGE_PER_HOUR * hoursWorked;
    }

    // Method to get a random employee type (Full-time or Part-time)
    static int getRandomEmployeeType() {
        return new Random().nextInt(2) + 1;
    }

    // Method to calculate employee wage using Switch Case
    static int calculateWageUsingSwitch(int employeeType) {
        return switch (employeeType) {
            case FULL_TIME -> calculateDailyWage(FULL_DAY_HOURS);
            case PART_TIME -> calculateDailyWage(PART_TIME_HOURS);
            default -> 0;
        };
    }

    // Method to calculate monthly employee wage
    static int calculateMonthlyWage() {
        return WORKING_DAYS_PER_MONTH * calculateDailyWage(FULL_DAY_HOURS);
    }

    // Method to calculate employee wage till a condition is reached
    static int calculateWagesTillCondition() {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < WORKING_DAYS_PER_MONTH && totalWorkingHours < MAX_WORKING_HOURS) {
            int employeeType = getRandomEmployeeType();
            int dailyWage = calculateWageUsingSwitch(employeeType);

            totalWage += dailyWage;
            totalWorkingDays++;
            totalWorkingHours += (employeeType == FULL_TIME) ? FULL_DAY_HOURS : PART_TIME_HOURS;
        }

        return totalWage;
    }
}
