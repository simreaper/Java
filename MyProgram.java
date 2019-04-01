public class MyProgram {
public static void main(String[] args) {
String[] WordList1 = {"Sam","Dharmesh","Scarlett","Flipo","Abhinav"};
String[] WordList2 = {"Has to do","should","must","Have to have"};
String[] WordList3 = {"Work","Task","complete promise","follow the path"};
int length1 = WordList1.length;
int length2 = WordList2.length;
int length3 = WordList3.length;
int random1 = (int) (Math.random() * length1);
int random2 = (int) (Math.random() * length2);
int random3 = (int) (Math.random() * length3);
String phrase = WordList1[random1] + " " + WordList2[random2] + " " + WordList3[random3];

System.out.println("Hello " + phrase);

}
}
