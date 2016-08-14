class area{
 int l;
 int h;
 int a;
area(){
l=10;
h=5;
a=h*l;
System.out.println(a);
}
area(int h1,int l1){

l=l1;
h=h1;
int a1=h1*l1/2;
System.out.println(a1);
}}
class consoverloading{
public static void main(String[] args){
area a=new area();
a.area();
area b=new area(5,6);
b.area();
}}
