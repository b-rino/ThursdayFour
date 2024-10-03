import java.util.Scanner;

import java.util.ArrayList;

class GameMenu{
	private ArrayList <String> actions = new ArrayList<>();


	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	public void displayMenu(ArrayList a){
		System.out.println(a);
	}

	public int getAction(){
		System.out.println("Type a number to choose an action:");
		for(int i = 0; i < actions.size(); i ++){
		System.out.println((i + 1) + " " + actions.get(i));
		}
	Scanner scanner = new Scanner(System.in);
	int userChoice = scanner.nextInt();
	return userChoice;
	}
}