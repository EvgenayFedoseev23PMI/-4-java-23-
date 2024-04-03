package com.company;

public class Money {
    private long rubles;
    private int kopeks;
    public Money(long rubles, int kopeks) {
        if (kopeks >= 100 || kopeks < 0) {
            throw new IllegalArgumentException("Копейки могут быть в диапозоне от 0 до 99");
        }
        this.rubles = rubles;
        this.kopeks = kopeks;
    }
public Money add(Money other){
    long newRubles=this.rubles + other.rubles;
    int newKopeks=this.kopeks + other.kopeks;
    if (newKopeks>=100){
        newRubles++;
        newKopeks -= 100;
    }
    return new Money(newRubles, newKopeks);
}
public Money subtract(Money other)
{
    long newRubles=this.rubles - other.rubles;
    int newKopeks=this.kopeks - other.kopeks;
    if (newRubles<0){
      throw new IllegalArgumentException("Разница не должна быть отрицательной");
    }
    return  new Money(newRubles,newKopeks);
}
public Money divide(int delitel)
{
    if (delitel==0){
        throw new IllegalArgumentException("Делитель не должен равняться нулю");
    }
    long newRubles=this.rubles/delitel;
    int newKopeks=this.kopeks/delitel;
    return new Money(newRubles, newKopeks);
}
public  Money divide(double delitel)
{
    if (delitel==0.0){
        throw new IllegalArgumentException("Делитель не должен равняться нулю");
    }
    double totalAmount=this.rubles+(double)this.kopeks;
    double result= totalAmount/delitel;
    long newRubles=(long)result;
    int newKopeks=(int)(result-newRubles);
    return new Money(newRubles, newKopeks);
}
public Money multiply(double multiplier){
    double totalAmount=this.rubles+(double)this.kopeks/100;
    double result= totalAmount*multiplier;
    long newRubles=(long)result;
    int newKopeks=(int)((result-newRubles)*100);
    return new Money(newRubles, newKopeks);
}
public int compareTo(Money other){
    if (this.rubles==other.rubles && this.kopeks==other.kopeks)
    {
        return 0;
    }
    if (this.rubles>other.rubles ||(this.rubles==other.rubles && this.kopeks > other.kopeks))
    {
        return 1;
    }
    return -1;
}
public String toString(){
    return rubles + "," + String.format("%02d",kopeks);
}
}




