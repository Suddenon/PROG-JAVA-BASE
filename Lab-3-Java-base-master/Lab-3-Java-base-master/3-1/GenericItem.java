public class GenericItem {
                public int ID;
                public String name;
                public float price;
                public GenericItem analog;
                static int currentID;
                Category category = Category.GENERAL;
                void printAll(){
                        System.out.printf("ID: %d , Name: %-20s , price:%5.2f \n", ID, name, price);
                        System.out.println("Category: " + category );
                        }
                public GenericItem(String name, float price, Category category){
                    this.name = name;
                    this.price = price;
                    this.category = Category.GENERAL;
                    this.ID = GenericItem.currentID++;
                }
                public GenericItem(String name, float price, GenericItem analog){
                    this.name = name;
                    this.price = price;
                    this.analog = analog;
                    this.ID = GenericItem.currentID++;
                }
                public GenericItem() {
                    this.ID = GenericItem.currentID++;
                }
                public enum Category { FOOD, PRINT, DRESS, GENERAL };
                }
