package org.add;

public class GreensTech {
 public void greensOmr(int no,int num,int numb,long number,float dnum,double dnumbers,char symbol,String alphapets,boolean check) {
	System.out.println(no+"\n"+num+"\n"+numb+"\n"+number+"\n"+dnum+"\t"+dnumbers+"\t"+symbol+"\t"+alphapets+"\t"+check);

}
 public static void main(String[] args) {
	GreensTech gt= new GreensTech();
    gt.greensOmr(01, 1234, 12345678, 123456787l, 1.12345f, 1.0987755444d, '#', "sharmi", true);
    
    byte a = 34;
    System.out.println(a);
    short s = 1234;
    System.out.println(s);
    
}
}
