package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheeseprice;
    private int Toppingsprice;
    private int Takeawayprice;
    boolean isCheeseAdded ;
    boolean isToppingsAdded;
    boolean isTakeawayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.Cheeseprice=80;
        this.Takeawayprice=20;
        if(isVeg == true){
            this.price=300;
            this.Toppingsprice=70;
        }
        else{
            this.price=400;
            this.Toppingsprice=120;
        }
        this.isCheeseAdded=false;
        this.isTakeawayAdded=false;
        this.isToppingsAdded=false;
        this.bill= "Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false)
           this.price=this.price+this.Cheeseprice;
           isCheeseAdded =true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            this.price=this.price+this.Toppingsprice;
            isToppingsAdded =true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeawayAdded == false){
            this.price=this.price+this.Takeawayprice;
            isTakeawayAdded =true;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false){
            if(isCheeseAdded == true){
                this.bill=this.bill+"Extra Cheese Added: "+this.Cheeseprice+"\n";
            }
            if(isToppingsAdded == true){
                this.bill=this.bill+"Extra Toppings Added: "+this.Toppingsprice+"\n";
            }
            if(isTakeawayAdded == true){
                this.bill=this.bill+"Paperbag Added: "+this.Takeawayprice+"\n";
            }
            this.bill =this.bill+"Total Price: "+this.price+"\n";

            isBillGenerated=true;
        }
        return this.bill;
    }
}
