package COSC381Baseball;

public class Player {
	public boolean drafted = false;
	//Just a couple of placeholders for now until we decide what to implement here.
	public double RBI;//Runs Batted in
	public double wl;//Win/Loss Ratio
	public String position;
	public String name;
	//stats tracked for ranking
	public double avg, obp, slg, ops, era, win, loss;
	
	//Constructor
	public Player(double RBI, double wl, String position, String name) {
		this.RBI=RBI;
		this.wl=wl;
		this.position=position;
		this.name = name;
	}
	//Will print out the player, unless they are already drafted
	public String toString() {
		String x = "";
		if(!drafted) {
			x+= this.name+" "+this.position+" W/L: "+wl+" RBI: "+RBI+"\n";
		}
		return x;
	}
	//Setters/Getters
	public void setDrafted(boolean drafted) {
		this.drafted=drafted;
	}
	public boolean getDrafted() {
		return this.drafted;
	}
	public double getRBI() {
		return this.RBI;
	}
	public double getwl() {
		return wl;
	}
	public String getPosition() {
		return this.position;
	}
	public String getName() {
		return this.name;
	}
	//stats
	public void setAvg(double a) {
		avg = a;
	}
	
	public void setObp(double o) {
		obp = o;
	}
	public void setSlg(double s) {
		slg = s;
	}
	public void setOps(double o) {
		ops = o;
	}
	
	public void setEra(double e) {
		era = e;
	}
	
	public void setWin(double w) {
		win = w;
	}
	
	public void setLoss(double l) {
		loss = l;
	}
	
	public double getAvg() {
		return avg;
	}
	public double getObp() {
		return obp;
	}
	public double getSlg() {
		return slg;
	}
	public double getOps() {
		return ops;
	}
	public double getEra() {
		return era;
	}
	public double getWin() {
		return win;
	}
	public double getLoss() {
		return loss;
	}
	
	
}
