package COSC381Baseball;

import java.util.ArrayList;
import java.util.Comparator;
public class PlayerList {
	
	ArrayList<Player> playerList = new ArrayList<Player>();
	
	//Constructor
	public PlayerList() {}
	public PlayerList(Player player) {
		playerList.add(player);
	}
	
	//Getter
	public Player getPlayer(String name) {
		for(int i = 0; i<playerList.size();i++) {
			if(playerList.get(i).getName().equalsIgnoreCase(name))return playerList.get(i);
		}
		System.out.print("Player not found");
		return null;
	}
	public Player getPos(String pos) {
		for(int i = 0; i<playerList.size();i++) {
			if(playerList.get(i).getPosition().equalsIgnoreCase(pos)&&!playerList.get(i).ignore)return playerList.get(i);
		}
		return new Player("");
	}
	public boolean exists(String name) {
		for(int i = 0; i<playerList.size();i++) {
			if(playerList.get(i).getName().equalsIgnoreCase(name))return true;
		}
		return false;
	}
	public boolean exists(Player player) {
		for(int i = 0; i<playerList.size();i++) {
			if(playerList.get(i)==player)return true;
		}
		return false;
	}
	public void resetIgnore() {
		for(int i = 0; i<playerList.size();i++) {
			playerList.get(i).setIgnore(false);
		}
	}
	//Adds a player to the end of the list
	public void addPlayer(Player player) {
		playerList.add(player);
	}
	//Prints out all the players in the list
	public String toString() {
		String x = "";
		for(int i = 0; i<playerList.size();i++) {
			x+=playerList.get(i).toString();
		}
		return x;
	}
	//Prints out all the players in the list
		public String toStringSave() 
		{
			String x = "";
			for(int i = 0; i<playerList.size();i++) 
			{ 
				if(playerList.get(i).mlbTeam == null)
				{
					//Do nothing
				}
				else
				{
					x+=playerList.get(i).toStringSave();
				}
			}
			return x;
		}
	public ArrayList<Player> getPlayerList() {
		return playerList;
	}
}
