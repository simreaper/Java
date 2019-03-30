public class MyProgram {
public static void main(String[] args) {
String[] WordList1 = {"Ankit","Dharmesh","Scarlett","Flipo","Abhinav"};
String[] WordList2 = {"Has to do","should","must","Have to have"};
String[] WordList3 = {"Work","Task","complete promise","follow the path"};

int length1 = WordList1.length;
int length2 = WordList2.length;
int length3 = WordList3.length;

int rand1 = (int) (Math.random() * length1);
int rand2 = (int) (Math.random() * length2);
int rand3 = (int) (Math.random() * length3);

String phrase = WordList1[rand1] + " " + WordList2[rand2] + " " + WordList3[rand3];

System.out.println("Hello " + phrase);

}

}