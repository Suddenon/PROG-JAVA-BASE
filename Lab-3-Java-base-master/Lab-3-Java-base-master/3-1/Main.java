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
        
            
        String line = "Конфеты 'Маска';45;120";

        String[] item_fld = new String[3];

        int cont = 0;
        for (String pice : line.split(";")){
            item_fld[cont] = pice;
            cont++;
        }

        FoodItem maskcandy = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        maskcandy.printAll();
        }


	}

