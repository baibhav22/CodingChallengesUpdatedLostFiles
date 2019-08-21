package com.baibhav.anonymousclass;

public class DriverClass {

    public static void main(String args[]){

        Telephone tel= new Telephone(){

            public void telePhoneOperator(String name){
                System.out.println("Telecom company provided is"+ name);
            }

        };
        tel.telePhoneOperator("Samsung");

    }
}
