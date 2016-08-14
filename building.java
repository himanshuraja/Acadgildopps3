class shape{
public int nofloors=4;
public int nofworker=5;
public int getnofloors(){
return nofloors;
}
public void setnofloors(int nofloors){
this.nofloors=nofloors;
}}
class shape1 extends shape{
int nofloors=5;
}
class shape2 extends shape{
int nofloors=1;}
class building{
public static void main(String[] args){
shape1 sh=new shape1();
sh.getnofloors();
shape2 sh2=new shape2();
sh2.getnofloors();
}}
