package Shopping;

import java.io.*;
import java.util.*;
class outOfLimitException extends Exception{
    public outOfLimitException(String s){
        System.out.print(" ");
    }
}
class Shopping implements cart,categories
{
public double[] price=new double[11];
public int[] list=new int[11];
public int track;
public void addItems(int code)
{
list[track]=code;
track++;
}
public void displayList()
{
System.out.println("s.no."+"\t"+"Item"+"\t\t"+"Tax");
System.out.println(1+"\t"+"Furniture"+"\t"+FurnitureTax);
System.out.println(2+"\t"+"Mobiles\t\t"+MobilesTax);
System.out.println(3+"\t"+"GamingsConsoles"+"\t"+GamingConsolesTax);
System.out.println(4+"\t"+"Laptops\t\t"+LaptopsTax);
}
public void select()
{
track=0;
Scanner sc=new Scanner(System.in);
int choice=0;
while(true)
{
String input = new String();
if(track>0){
System.out.println("Do you want to continue shopping?(yes/no)");
input = sc.next();
}
if(input.equals("no"))
break;
displayList();
System.out.println("Enter your choice");
choice=sc.nextInt();
if(choice==1)
{
for(int i=0;i<Furniture.length;i++)
System.out.println(i+"\t"+Furniture[i]+"\t"+FurniturePrice[i]);
System.out.println("Enter Number of items you want to choose");
int n;
while(true){
n=sc.nextInt();
if(n>(10-track)||n>10){
if(n>(10-track)){
    System.out.println("Maximum limit is "+(10-track));
}
System.out.println("Exceeding Limit,there are already "+track+" number of items in cart"+"\nEnter n Again");
}
else break;
}
int tr=0;
while(tr<n)
{
System.out.println("Enter your choice");
try{
    choice=sc.nextInt();
    tr++;
    if(choice>=Furniture.length)
    throw new outOfLimitException(" ");
    else
    addItems(600+choice);
}
catch(outOfLimitException ex){
    System.out.println("Wrong input enter Again");
    tr--;
}
}
}
else if(choice==2)
{
for(int i=0;i<Mobiles.length;i++)
System.out.println(i+"\t"+Mobiles[i]+"\t"+MobilesPrice[i]);
System.out.println("Enter Number of items you want to choose");
int n;
while(true){
n=sc.nextInt();
if(n>(10-track)||n>10){
if(n>(10-track)){
    System.out.println("Maximum limit is "+(10-track));
}
System.out.println("Exceeding Limit,there are already "+track+" number of items in cart"+"\nEnter n Again");
}
else break;
}
int tr=0;
while(tr<n)
{
System.out.println("Enter your choice");
try{
    choice=sc.nextInt();
    tr++;
    if(choice>=Mobiles.length)
    throw new outOfLimitException(" ");
    else
    addItems(1300+choice);
}
catch(outOfLimitException ex){
    System.out.println("Wrong input enter Again");
    tr--;
}
}
}
else if(choice==3)
{
for(int i=0;i<GamingConsoles.length;i++)
System.out.println(i+"\t"+GamingConsoles[i]+"\t"+GamingConsolesPrice[i]);
System.out.println("Enter Number of items you want to choose");
int n;{
while(true){
n=sc.nextInt();
if(n>(10-track)||n>10){
if(n>(10-track)){
    System.out.println("Maximum limit is "+(10-track));
}
System.out.println("Exceeding Limit,there are already "+track+" number of items in cart"+"\nEnter n Again");
}
else break;
}
int tr=0;
while(tr<n)
{
System.out.println("Enter your choice");
try{
    choice=sc.nextInt();
    tr++;
    if(choice>=GamingConsoles.length)
    throw new outOfLimitException(" ");
    else
    addItems(700+choice);
}
catch(outOfLimitException ex){
    System.out.println("Wrong input enter Again");
    tr--;
}
}
}
}
else if(choice==4)
{
for(int i=0;i<Laptops.length;i++)
System.out.println(i+"\t"+Laptops[i]+"\t"+LaptopsPrice[i]);
System.out.println("Enter Number of items you want to choose");
int n;
while(true){
n=sc.nextInt();
if(n>(10-track)||n>10){
if(n>(10-track)){
    System.out.println("Maximum limit is "+(10-track));
}
System.out.println("Exceeding Limit,there are already "+track+" number of items in cart"+"\nEnter n Again");
}
else break;
}
int tr=0;
while(tr<n)
{
System.out.println("Enter your choice");
try{
    choice=sc.nextInt();
    tr++;
    if(choice>=Laptops.length)
    throw new outOfLimitException(" ");
    else
    addItems(1200+choice);
}
catch(outOfLimitException ex){
    System.out.println("Wrong input enter Again");
    tr--;
}
}
}
else if(choice==0)
break;
else
{
System.out.println("Wrong choice: Enter Again");
}
try{
    if(track==10)
    throw new outOfLimitException(" ");
}
catch(outOfLimitException ex){
    System.out.println("Maximum Limit in Cart reached");
    break;
}
}
}
public void price(){
for(int i=0;i<=track;i++)
{
if(list[i]/100==6)
{
price[i]=FurniturePrice[(list[i]%600)]*(1+FurnitureTax);
System.out.println("Price of "+Furniture[(list[i]%600)]+"="+price[i]);
}
else if(list[i]/100==13)
{
price[i]=MobilesPrice[(list[i]%1300)]*(1+MobilesTax);
System.out.println("Price of "+Mobiles[(list[i]%1300)]+"="+price[i]);
}
else if(list[i]/100==7)
{
price[i]=GamingConsolesPrice[(list[i]%700)]*(1+GamingConsolesTax);
System.out.println("Price of "+GamingConsoles[(list[i]%700)]+"="+price[i]);
}
else if(list[i]/100==12)
{
price[i]=LaptopsPrice[(list[i]%1200)]*(1+LaptopsTax);
System.out.println("Price of "+Laptops[(list[i]%1200)]+"="+price[i]);
}
}
double p=0;
for(int j=0;j<=track;j++){
p=p+price[j];
}
System.out.println("Total Price in cart="+p);
}
}
public class Shop{
    public void Shop()
{
Shopping o=new Shopping();
o.select();
o.price();	
}
}

