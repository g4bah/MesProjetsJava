*------------------------------------------------------------------------------------------
Le programme suivant donne le résultat de l'évaluation de a et b en fonction de l'opérateur
+,-,* et /
-------------------------------------------------------------------------------------------*/
/*
Algorithme: Evaluation de a et b en fonction de l'opérateur +,-,* et /
//Déclaration des variables 
VAR 
	a,b: entier positif,représente les valeurs à évaluer
	op: caracter  qui peut avoir pour valeur +,-,* ou /, représente l'opérateur
	c :entier, représente le resultat de l'evaluation de a op b (c=a op b)
//début du programme 
DEBUT
	//initialisaton
	a<--0
	b<--0
	c<--0
	op<--'+'
	//traitement
	si(op=='+') alors
		c<--a+b
	sinon
		si(op=='-') alors
			c<--a-b
		sinon
			si(op=='*') alors
				c<-a*b
			sinon
				c<--a/b
			finSi
		finSi
	finSi
FIN
2ième méthode
switch(op) {
	case '+': c=a+b; // si la variable op a pour valeur +, la case '+' correspond à l'execution de a+b qui sera affectéeà c
		break;
	case '-': c=a-b;
		break;
	case '*': c=a*b;
		break;
	case '/': c=a/b;
		break;
	default: afficher("opérateur inconu");
		break;
}
FIN

*/
import java.util.Scanner;
https://openclassrooms.com/courses/apprenez-a-programmer-en-java/lire-les-entrees-clavier
public class EXo {

	public static void main(String[] args) {
		int a,b,c=0;
		char op='+';
		//je vais créer un objet de la classe Scanner
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Taper la valeur de a");
		 a=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Taper la valeur de b");
		 b=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Taper la valeur de l'opérateur");
		 String st=sc.nextLine();
		 /*
		 la variable st cette chaine de caractères ne doit pas être vide sinon il 
		 y'aura une excepetion qui va être générer  à cause l'extraction du caractére op
		  */
		 op = st.charAt(0);
		 
		 sc.close();
		 
		//Calculer c= a op b 
		//l'expression op peut être pris parmi les suivants:+ - * /
		/*if(op=='+'){
		 * 
			c= a+b;
		}else if (op=='+'){
			c= a-b;
			}else if(op=='+'){
				c= a*b;
			}else 
				c= a/b;	
		*/
		 switch (op) {
		 	case '+':c= a+b;
				break;
		 	case '-':c= a-b; 
				break;
		 	case '*':c= a*b; 
				break;
		 	case '/':c= a/b;
				break;
		 	default:System.out.println("l'opérateur inconu");
		 		break;
		}
		System.out.println(c);
	}
}

/*-------------------------------------------------------------------
Le programme suivant Calcule la factorielle de n
-------------------------------------------------------------------*/
/*
Algorithme: calcule de factoriellle de n
//déclaration des variables
VAR 
	n: entier positif  //le nombre qu'on veut calculer sa factorielle
	fact:entier positif //  représente la factorielle de n
//début du programme
DEBUT
	i: entier //représente l'indice d'itteration
	//initialisation 
	fact<--1
	i<--1
	
	tant que (i<=n) faire {
		fact<--fact+1
		i<--i+1
	}
	finTantque
	afficher (fact)
FIN

2ième méthode:
DEBUT
	fact<--1
	pour(i=1;i<=n;i++){
		fact<--i*fact
	}
	finPour
	afficher(fact)
Fin

*/
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		//Calculer n!
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la valeur de n");
		n= sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i=i+1;
		}
		 System.out.println(fact);
		  //où
		int fact2=1;
		for(int j=1;j<=n;j++) {
			fact2=fact2*j;
		}
		 System.out.println(fact2);
	}

}

/*-------------------------------------------------------------------
Le programme suivant Calcule la somme de n-premiers nombre impairs
-------------------------------------------------------------------*/
/*
Algorithme: calcule de la somme de n-premiers nombres impairs
//déclaration des variables
VAR
	n: entier positif // les n-premiers nombres impairs
	impair:entier //un nombre impair
	som:entier //la somme des n-premiers nombres impairs
//début du programme
DEBUT
	i:entier //indice d'itteration
	//initialisation
	i<--0
	impair<-1
	som<--0
	tant que (i<n) faire {
		som<--som+impair
		impair<--impair+2
		i<--i+1
	}
	finTantque
	afficher (som)
FIN 

2ieme méthode 
DEBUT
	impair<--1
	som<--0
	pour (enier i=0;i<n;i++){
		som<--som+impair
		impair<--impair+2
	}
	finPour
	afficher(som)
FIN
3ième méthode 
DEBUT
	i<--0
	som<--0
	tant que (i<n){
		som<--2*i+1
		i<-i+1
	}
	finTanque
	afficher(som
FIN
*/
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		//je calcule la somme n-premiers impairs
		
		int n;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la valeur de n");
		n= sc.nextInt();
		int impair =1;
		int som=0;
		for(int i=0; i<n;i++) {
			som = som+impair;
			impair+=2;
		}
				
		System.out.println(som);
		
	}
	
	
}

/*-------------------------------------------------------------------
Le programme suivant Calcule la somme de n-premiers nombre pairs
-------------------------------------------------------------------*/
/*
Algorithme:calcule de la somme de n-premeirs nombres pairs
//déclaration des variables
VAR
	n: entier positif // les n-premeirs nombres pairs
	pair: entier positif //un nombre pair
	som: entier positif // la somme de n-premeirs nombres pairs
//début du programme
DEBUT
	//initialisation
	i:entier positif //l'indice de parcours
	i<--0
	pair<--0
	som<--0
	//traitement
	tant que (i<n) faire {
		som<--som+pair
		pair<--pair+2
		i<--i+1
	}
	finTanque
	afficher(som)
FIN
2 ieme méthode
DEBUT
	som<--0
	pour(entier i=1;i<=n;i++){
		som<--2*i
	}
	finPour
	affiecher(som)
FIN
*/
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		//je calcule la somme n-premiers pairs
		
		int n;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la valeur de n");
		n= sc.nextInt();
		int pair =0;
		int som=0;
		for(int i=0; i<n;i++) {
			som = som+pair;
			pair+=2;
		}
				
		System.out.println(som);
		
	}
	
	
}

/*-------------------------------------------------------------------
Le programme suivant permet la réalisation d'un jeux aux hasards
-------------------------------------------------------------------*/
import java.util.Random;
import java.util.Scanner;

public class EXo {
	
	public static void main(String[] args) {
		Random r = new Random();
		int nbAlea = 0 + r.nextInt(100 - 0);
		int nbDeviner;
		Boolean trouver = false;
		Scanner sc = new Scanner(System.in);
	
		while (trouver == false) {
			System.out.println("Veuillez saisir un nombre");
			sc = new Scanner(System.in);
			nbDeviner = sc.nextInt();
			if (nbDeviner > nbAlea) {
				System.out.println("Votre nombre est plus grand");
			} else if (nbDeviner < nbAlea){
				System.out.println("Votre nombre est plus petit");
				}
			else {
				trouver = true;
				System.out.println("bravo !! vous avez trouvé");
			}
		}
		sc.close();
	}



}

	/*-----------------------------
				ou 
	------------------------------*/
	import java.util.Random;
import java.util.Scanner;

public class EXo {
	static Random r = new Random();
	static int nbAlea = 0 + r.nextInt(100 - 0);
	
	public static void main(String[] args) {
		int nbDeviner;
		Boolean trouver = false;
		Scanner sc = new Scanner(System.in);
		String rep;
		while (trouver == false) {
			System.out.println("Veuillez saisir un nombre");
			sc = new Scanner(System.in);
			nbDeviner = sc.nextInt();
			rep=jouer(nbDeviner);
			System.out.println(rep);
			if(rep.equals("bravo !! vous avez trouvé")) {
				trouver = true;
				sc.close();
			}

		}

	}

	public static String jouer(int nbDev) {
		String resultat = null;
		if (nbDev > nbAlea) {
			resultat = "Votre nombre est plus grand";
		} else if (nbDev < nbAlea) {
			resultat = "Votre nombre est plus petit";
		} else {
			resultat = "bravo !! vous avez trouvé";
		}
		return resultat;

	}

}

public String jouer(int nbDev) {
		String resultat = null;
		if (nbDev > nbAlea) {
			System.out.println("Votre nombre est plus grand");
		} else if (nbDev < nbAlea){
			System.out.println("Votre nombre est plus petit");
			}
		else {
			System.out.println("bravo !! vous avez trouvé");
		}
		return resultat;
		
	}


/*--------------------------------------------------------------------------------------
Le programme suivant affiche une lettre correspondant à des points sur 20 en suivant la
 correspondance suivante : A (18–20), B (16–18), C (14–16), D (12–14) et F (0–12)
--------------------------------------------------------------------------------------*/
/*
Algorithme: Affciher la lettre correspond à chacun des cas: A (18–20), B (16–18), C (14–16), D (12–14) et F (0–12)
//Déclaration des variables 
	
*/
import java.util.Scanner;

public class EXo {
	
	public static void main(String[] args) {
		//A (18–20), B (16–18), C (14–16), D (12–14) et F (0–12)
		int points = 0; //décalaration de la variable qui répresente les points
		char grade; // variable qui répresente la grade
		
		System.out.println("Veuillez saisir ses points");
		Scanner sc = new Scanner(System.in);
		points = sc.nextInt();
		
		if(18<=points && points<=20) {
			grade ='A';
		}
		else if(16<=points && points<18) {
			grade ='B';
		}
		else if(14<=points && points<16) {
			grade ='C';
		}
		else if(12<=points && points<14) {
			grade ='D';
		}
		else
			grade ='F';
		
		System.out.println(grade);
	}

}

/*--------------------------------------------------------------------------------------
Le programme suivant permet de calculer le bonus d'un salarié. 
Si son  niveau est plus grand que 7, son bonus sera 35% de son salaire
s'il a niveau plus petit ou égal 7, son bonus sera 20% de son salaire
--------------------------------------------------------------------------------------*/
import java.util.Scanner;

public class EXo {
	private static int salaire;
	private static int niveau;
	private static double bon;
	public static void main(String[] args) {
		salaire = 0;
		niveau = 0;
		bon = 0;
		System.out.println("Veuiller saisir son salaire");
		Scanner sc =new Scanner(System.in);
		salaire = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuiller saisir son niveau");
		niveau = sc.nextInt();
		sc.nextLine();
		sc.close();
		bon= bonus(salaire, niveau);
		System.out.println("Son bonus est:");
		System.out.println(bon);
	}

	public static double bonus(int sal, int level) {
		double b = 0;
		if (level <= 7) {
			b = 0.2 * sal;
		} else
			b = 0.35 * sal;
		return b;
	}
}
----------------------------------------------------------------------------------------------
Algorithme qui simule le lancé d'un dé et qui demande à une personne de deviner la valeur et 
affiche bravo!! s'il trouve le nombre
----------------------------------------------------------------------------------------------
/*Déclaration des variables 
VAR
	val_de:entier
	val_dev:entier

/début du programme
DEBUT	
	val_de<--aleotoire(6)
	val_dev<--0
	
	Tant que (val_de!=val_dev) faire
		saisir val_dev
	finTantque
	Afficher bravo
FIN
*/

import java.util.Random;
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		int val_de;// la variable qui stock la valeur du dè
		int val_dev; // la variable qui stock la valeur déviner
		Random r= new Random(); //créer un objet de type Random et  j'affecte sa référence à la variable r
		Scanner sc =new Scanner(System.in);
		
		val_de=r.nextInt(6-0);//permet de généer un nombre aléatoire compris entre 0 et 6
		val_dev=0; // j'initialise val_dev à 0
		
		while((val_de != val_dev)){
			System.out.println("Dévinez une valeur");
			val_dev = sc.nextInt();
			
		}	
		System.out.println("Bravo!!!!");
		sc.close();
		
						
	}

	
}

----------------------------------------------------------------------------------------------
Algorithme qui simule le lancé d'un dé et qui demande à une personne de deviner la valeur et 
affiche bravo!! s'il trouve le nombre. Le programme doit afficher aussi si la valeur deviner 
et plus petit ou grand
----------------------------------------------------------------------------------------------
import java.util.Random;
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		int val_de;// la variable qui stock la valeur du dè
		int val_dev; // la variable qui stock la valeur déviner
		Random r= new Random(); //créer un objet de type Random et  j'affecte sa référence à la variable r
		Scanner sc =new Scanner(System.in);
		
		val_de=r.nextInt(6-0);// 
		val_dev=0; // j'initialise val_dev à 0
		System.out.println(val_de);
		if(val_de==0) { //permet exclure la valeur zéro parmis le nombre à déviner
			val_de=r.nextInt(6-0);
		}
		System.out.println(val_de);
		
		while((val_de != val_dev)){
			System.out.println("Dévinez une valeur");
			val_dev = sc.nextInt();
			if(val_de <val_dev) {
				System.out.println("votre nombre est plus grand");
			}
			else if(val_de >val_dev) {
				System.out.println("votre nombre est plus petit");
			}else 
				System.out.println("Bravo!!!");
				
		}	
		sc.close();
		
						
	}

	
}
//2iéme méthode 

import java.util.Random;
import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		int val_de;// la variable qui stock la valeur du dè
		int val_dev; // la variable qui stock la valeur déviner
		Random r= new Random(); //créer un objet de type Random et  j'affecte sa référence à la variable r
		Scanner sc =new Scanner(System.in);
		
		val_de=0;// j'initialise val_de à 0
		val_dev=0; // j'initialise val_dev à 0
		
		while(val_de==0) { //permet exclure la valeur zéro parmis le nombre à déviner
			val_de=r.nextInt(6-0);
		}
		//System.out.println(r.nextInt(6-0));
		
		while((val_de != val_dev)){
			System.out.println("Dévinez une valeur");
			val_dev = sc.nextInt();
			if(val_de <val_dev) {
				System.out.println("votre nombre est plus grand");
			}
			else if(val_de >val_dev) {
				System.out.println("votre nombre est plus petit");
			}else 
				System.out.println("Bravo!!!");
				
		}	
		sc.close();
		
						
	}

	
}

/*--------------------------------------------------------------------------------
Programme qui determine si un nombre est pair ou impair
------------------------------------------------------------------------------*/
/*
Algorithme : déterminser si un nombre est pair ou impair
//déclaration des variables
VAR
	n: entier positif, représente la valeur à tester
	reste: entier, représente le reste de la division euclidienne de n par 2
//début du programme
DEBUT
	reste<--n%2
	
	si(reste==0) alors
		afficher n est pair
	sinon 
		afficher n est imppair
	finSi
FIN
*/

import java.util.Scanner;

public class EXo {

	public static void main(String[] args) {
		int a;
		int rest;
		//je vais créer un objet de la classe Scanner
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Taper la valeur de a");
		 a=sc.nextInt();
		 sc.nextLine();
		 rest=a%2;
		 
		 if(rest==0) {
			 System.out.println(a+" est un nombre pair");
		 }
		 else
			 System.out.println(a+" est un nombre impair");
	}

	
}





