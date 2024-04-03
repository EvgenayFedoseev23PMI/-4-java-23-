package com.company;

public class Main {

    public static void main(String[] args) {
	Money money_1 = new Money(11,55);
	Money money_2 = new Money(6,36);
	System.out.println(money_1);
	System.out.println(money_2);
	Money summ=money_1.add(money_2);
	System.out.println(summ);
	Money differnce=money_1.subtract(money_2);
	System.out.println(differnce);
	Money division=money_1.divide(2);
	System.out.println(division);
	Money divisionDouble=money_1.divide(3.5);
	System.out.println(divisionDouble);
	Money multiplication=money_1.multiply(1.5);
	System.out.println(multiplication);
	int comparison=money_1.compareTo(money_2);
	if (comparison==0){
	    System.out.println("Деньги_1 равны деньги_2");
    }
	else if(comparison>0)
    {
        System.out.println("Деньги 1 больше Денег_2");
    }
	else
    {
        System.out.println("Деньги 1 меньше Денег_2");
    }
    }
}
