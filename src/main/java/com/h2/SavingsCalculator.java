package com.h2;

public class SavingsCalculator {
private  float debits[];
private float credits[];

public SavingsCalculator(float credits[],float debits[]){
 this.credits=credits;
 this.debits=debits;
}
private float sumOfCredits(){
    //return 0.0f;
    float sum=0.0f;
    for (int i; i<credits.length;i++){
        sum+=credits[i];
    }
    return sum;
}
}
