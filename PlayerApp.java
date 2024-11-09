import java.util.*;
class Player{
	private int id;
 	private String name;
 	private int runs;
 	public void setId(int id){
		this.id=id;
 	}
 	public int getId(){
		return id;
 	}
 	public void setName(String name){
		this.name=name;
 	}
 	public String getName(){
		return name;
 	}
 	public void setRuns(int runs){
		this.runs=runs;
 	}
 	public int getRuns(){
		return runs;
 	}
}
class Team{
	Player p[];
	void addPlayers(Player ...p){
		this.p=p;
	}
	void showPlayers(){
		System.out.print("\nDisplay Player Details:");
		System.out.print("\nId\tNPaer Name\tRuns\n");
		for(int i=0;i<p.length;i++){
		System.out.print(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRuns()+"\n");
		}
	}
}
public class PlayerApp{
	public static void main(String args[]){
		Player p1 = new Player();
        	p1.setId(1);
        	p1.setName("Rohit S.");
        	p1.setRuns(500);

        	Player p2 = new Player();
        	p2.setId(2);
        	p2.setName("Virat K.");
        	p2.setRuns(550);

        	Player p3 = new Player();
        	p3.setId(3);
        	p3.setName("Jadeja R.");
        	p3.setRuns(300);

        	Player p4 = new Player();
        	p4.setId(4);
        	p4.setName("KL.Rahul");
       		p4.setRuns(450);

        	Team t = new Team();
        	t.addPlayers(p1, p2, p3, p4);
        	t.showPlayers();
	}
}