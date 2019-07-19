import javax.swing.JOptionPane;
public class Detyra1 {

	public static void main (String[]args) {
		//Krijimi i objektit =ob
		jo_main ob = new jo_main();
		//Thirja e metodave me ane te objektit ob
		ob.mbushNotat();
		ob.mbushStudente();
		ob.notaNenMes(ob.getN());
		ob.llogMesKaluese(ob.getN());
		System.out.println("");
		/**Ky funksion bene qe programi te "fleje" per 5 sekonda para se te vazhdoje pjesa tjeter e programit. 
		eshte koduar thjesht per arsye aesthetike*/
		try {
			Thread.sleep(3000);                
			} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
			}
		//I kerkohet nje input useri-it 
		String k = JOptionPane.showInputDialog("Fusni nje note qe te shikoni kush student e ka marre ate");
		//Kthen Stringun ne integer
		int m=Integer.parseInt(k);
		//Thirja e metodave te tjera
		ob.emraNota(ob.getN(),ob.getM(),m);
		System.out.println("");
		ob.renditVektor(ob.getM(),ob.getN());
	}
}
