package Shopping;
/**
 * Write a description of g here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
interface categories
{
String[] Furniture={"Sofa","Chair","Bed","Coffee Table","Dining Table","Office Table"};
String[] Mobiles={"Note","Tablet","Phablet","Phone"};
String[] GamingConsoles={"PS4 Slim","PS4 pro","PS3","Xbox one S","Xbox one X","Nintendo Switch","Play Station Portable"};
String[] Laptops={"i3 gen8","i5 gen8","i7 gen8","i7 gen9","i9 gen8","i9 gen9"};
int[] FurniturePrice={69000,11000,45000,9600,26500,88000};
int[] MobilesPrice={88999,36889,14999,74500};
int[] GamingConsolesPrice={36499,48599,25999,18999,34999,26899,9999};
int[] LaptopsPrice={45000,88000,145000,235000,445000,658000};
double FurnitureTax=0.18;
double MobilesTax=0.24;
double GamingConsolesTax=0.14;
double LaptopsTax=0.24;
void displayList();
}
