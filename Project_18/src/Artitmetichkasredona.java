
public class Artitmetichkasredona {
int a;
int b;
int c;

Artitmetichkasredona(int a, int b, int c){
	this.a=a;
	this.b=b;
	this.c=c;
	
}
void calcilateArtitmetichkasredona() {
	System.out.println((a+b+c)/3);
	
}
public static void main (String args[]) {
	Artitmetichkasredona firstN=new Artitmetichkasredona(3,5,7);
	Artitmetichkasredona secondN=new Artitmetichkasredona(13,25,29);
	
	firstN.calcilateArtitmetichkasredona();
	secondN.calcilateArtitmetichkasredona();

}
}
