import javax.swing.JOptionPane;
import java.util.Arrays;
public class jo_main {

	/**Keto variabla vihen jasht cdo metode ne menyre qe te aksesohen nga cdo metode.
	Ne te kundert vetem 1 metode do te mund ti aksesonte ato.
	*/
	public int[] notat = new int[25];
	public String[] studentet =new String[25];
	
	
	public int[] mbushNotat() {
		String[]m =new String[25];
		for(int i=0;i<25;i++) {
			//I kerkohet input perdoruesit.
	      m[i]=JOptionPane.showInputDialog("Nota e nxenesit");
	      //Nqs user-i nuk ben input asnje numer do te behet translate sikur  inputi eshte nota 4 mqs eshte nota me e ulet.
          if(m[i].equals("")||m[i].equals(" ")) {
	    	 m[i]="4";
	    	 }
          //Kthimi i Stringut ne integer
	     notat[i] = Integer.parseInt(m[i]);
	       }
		//Printimi i array-it ne console . Kjo mund te fshihet ne qofte se nuk duam print ne console
		System.out.println(Arrays.toString(notat));
		return notat;
	}
    /**Eshte krijuar kjo metode ne menyre qe te merret nje vlere per metoden notaNenMes
	prandaj dhe kthen return notat;
	*/
	public int[] getN() {

		return notat;
	}
    //Eshte krijuar kjo metode ne menyre qe te merret nje vlere per metoden emraNota	
    public String[] getM() {
		return studentet;
	}
	public String[] mbushStudente() {
		
		for(int i=0;i<25;i++) {
			studentet[i]=JOptionPane.showInputDialog("Emri dhe mbiemri i nxenesit");
		}
		System.out.println(Arrays.toString(studentet));
		return studentet;
	}
	public void notaNenMes ( int[]notat) {
		int mes=0;
		//Count perdoret per te percaktuar sa numra te perseritur ndodhen ne 1 array . 
		int count=0;
		//Gjejme shumen e gjithe numrave
		for(int i=0;i<25;i++) {
			mes=mes+notat[i];
		}
		//Pastaj pjesetojme me 25 qe te gjejme mesataren e klases.
		mes=mes/25;
		//Kemi bere loopin i cili na tregon se sa nxenes kane mare mbi mesataren e klases . kjo behet count nga variabli count.
		for(int i=0;i<25;i++) {
			if(notat[i]>mes) {
				count +=1;
			}
		}
		System.out.println("Mesatarja e klases eshte = "+mes);
		System.out.println("Nxenes qe kane marre mbi mesatare jane = " + count);
	}
	public double llogMesKaluese( int[] notat) {
		double mes=0;
		/**Gjejme mesataren qe duhet per te kaluar . Mqs kjo nuk ka 1 formule por 
		   dhe nuk eshte percaktuar po e marrim mesataren kaluese si mesatarja e klases . 
		*/
		for(int i=0;i<25;i++) {
			mes=notat[i]+mes;
		}
		mes=mes/25;
		System.out.println("Mesatarja kaluese e lendes eshte = "+ mes);
		return mes;
	}
	public void emraNota(int[] notat,String[] studentet ,int notaKerko) {
		for(int i=0;i<25;i++) {
			//Gjejme se cilet nxenes kane marre noten e kerkuar nga user-i
			if(notaKerko ==notat[i]) {
				System.out.println("Nxenesit qe kane mare noten e kerkuar jane " + studentet[i] );
			//Dhe nqs as1 nxenes nuk ka marre noten e kerkuar nga user-i do te printohet kjo ne console.
			}
			else if(notaKerko==0) {
				System.out.println("Asnje nga keta nxenes se ka mare kete note");
			}
		}
	}
	public void renditVektor(String[ ] studentet , int[ ] notat) {
		//Variabla temporal 
		int temp = 0;
		 String temp2;
		 /**Renditja e array-it nga numri me i madh ne me te voglin .Mqs nuk ka nje menyre per te renditur strings
		  * do te perdorim numrat si drejtuese per array-ing e strings.Keshtu qe kur behen swap numrat ne array[] notat
		  * dhe Strings ne array[]studentet do te behen swap. 
		 */
	        for (int i = 0; i < notat.length - 1; i++) {
	            for (int j = i + 1; j < notat.length; j++) {
	                if (notat[i] <notat[j]) {
	                    temp = notat[j];
	                    notat[j] = notat[i];
	                    notat[i] = temp;
	                    temp2=studentet[j];
	                    studentet[j]=studentet[i];
	                    studentet[i]=temp2;
	                }
	            }
	        }
	        //Printimi i array-it ne console. 
	        System.out.println("Array i notave i renditur nga numri me i madh te me i vogli ");
			System.out.println(Arrays.toString(notat));
			System.out.println("Array i emrave perkates te studenteve nga ai student qe ka marr noten me te larte te nota me e vogel");
			System.out.println(Arrays.toString(studentet));
			System.out.println("Nota me e larte ne klase eshte "+ notat[0]);
			//Perdorim variablin temporal count per te gjetur numrin e studenteve qe kane marr noten me te larte.
			int count=0;
			//Mqs array eshte bere sort-ed nga numri me i madh te me i vogli . Numri me i madh eshte gjithmone notat[0]
			for(int i=0;i<25;i++) {
				if(notat[0]==notat[i]) {
					count = count+1;
				}
				}
				System.out.print("dhe e kane marre "+  count +"nxenes");
			
			}
			
	}

