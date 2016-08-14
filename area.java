class area1{
public int l=10;
public int h=10;
}
class triangle extends area1{
void AREA(){
int A=(l*h)/2;
System.out.println(A);}

}

class rectangle extends area1{
void AREA(){
int B=l*l;
System.out.println(B);}

}

class area{
public static void main(String[] args){
triangle tr=new triangle();
rectangle re=new rectangle();
tr.AREA();
re.AREA();}}
