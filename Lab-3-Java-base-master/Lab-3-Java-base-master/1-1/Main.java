import java.util.*;

public class Main
{
	public static void main(String[] args) {
	            class FoodItem extends GenericItem{
                Date dateOfIncome; // дата производства
                short expires; // срок годности
                @Override
                void printAll(){
                        System.out.printf("ID: %d , Name: %-20s , price:%5.2f \n", ID, name, price);
                        System.out.println("Category: " + category );
                        System.out.println("Date: " + dateOfIncome );
                        System.out.println("Expires: " + expires );
                        
                        }
                public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
                    this.name = name;
                    this.price = price;
                    this.dateOfIncome = date;
                    this.expires = expires;
                }
                public FoodItem(String name, float price, short expires){
                    this(name, price, null, null, expires);
                }
                public FoodItem(String name){
                    this(name, 0.00f, null, null, (short) 0);
                }
                public FoodItem(){
                    
                }
            }
            class TechnicalItem extends GenericItem{
                short warrantyTime; // гарантийный срок (суток)
                void printAll(){
                        System.out.printf("ID: %d , Name: %-20s , price:%5.2f \n", ID, name, price);
                        System.out.println("Category: " + category );
                        System.out.println("warrantyTime: " + warrantyTime );
                        }
            }
        GenericItem kek = new GenericItem();
        kek.ID = 123;
        kek.name = "Shrek";
        kek.price = 122;
        kek.printAll();
        GenericItem lol = new GenericItem();
        lol.ID = 123;
        lol.name = "Shrek";
        lol.price = 122;
        lol.printAll();
        GenericItem hah = new GenericItem();
        hah.ID = 123;
        hah.name = "Shrek";
        hah.price = 122;
        hah.printAll();
        FoodItem poilo = new FoodItem();
        TechnicalItem zubilo = new TechnicalItem();
        GenericItem[] ArrayOfItems = new GenericItem[2];
        ArrayOfItems[0] = zubilo;
        ArrayOfItems[1] = poilo;
        for (int i=0;i < 2;i++){
            ArrayOfItems[i].printAll();
        }


	}
}


