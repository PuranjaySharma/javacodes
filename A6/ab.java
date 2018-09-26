abstract class vehicle {
	public abstract void start();
	public void stop(){
		System.out.println("Stopping Vehicle in abstract class");
	}}
class twowheeler extends vehicle{
	public void start() { 
		System.out.println("Start Two Wheeler");
}}
class fourwheeler extends vehicle{
	public void start() {
		System.out.println("Start Four Wheeler");
	}}
public class ab {
	public static void main(String[] args) {
		twowheeler a = new twowheeler();
		fourwheeler b = new fourwheeler();
		a.start();
		a.stop();
		b.start();
		b.stop();
	}
}