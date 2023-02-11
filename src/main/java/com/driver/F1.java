package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Sport Car", 2);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed =0; //set the value of new speed by using currentSpeed and rate
        newSpeed=getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setGears(1);

        }
        //for all other cases, change the gear accordingly

        else if(newSpeed >=1 && newSpeed<=50) {

            setGears(1);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >=51 && newSpeed<=100) {
            setGears(2);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >=101 && newSpeed<=150) {
            setGears(3);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >=151 && newSpeed<=200) {
            setGears(4);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >=201 && newSpeed<=250) {
            setGears(5);
            setCurrentSpeed(newSpeed);
        }
        else if(newSpeed >250) {
            setGears(6);
            setCurrentSpeed(newSpeed);
        }

        if(newSpeed<0)
        {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
