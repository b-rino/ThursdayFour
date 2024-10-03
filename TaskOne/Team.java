import java.util.ArrayList;

public class Team{
	private String teamName; 
	private int rank; 
	private ArrayList <String> playerNames = new ArrayList<>(); 

	public Team(String teamName){
		this.teamName = teamName; 
	}

	public void setRank(int rank){
		if(rank > 0 && rank < 10){
			this.rank = rank;
		}
	}
	public int getRank(){
		return this.rank;
	}

	public String toString(){
		return "Hold: " + teamName + " på rank: " + rank + " med spillerne: " + playerNames;
	}

	public void addPlayer(String playerName){
		playerNames.add(playerName);

	}
}