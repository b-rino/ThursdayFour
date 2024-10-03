public class Main{
	public static void main(String[] args){

		Team teamOne = new Team("De Uovervindelige");
		Team teamTwo = new Team("De Gode");
		Team teamThree = new Team("De Dårlige");
		Team teamFour = new Team("De Bedste");
		Team teamFive = new Team("De Middelmådige");
		Team teamSix = new Team("De Smukke");

		teamOne.addPlayer("Ole");
		teamOne.addPlayer("Per");
		teamOne.addPlayer("Ib");
		teamOne.addPlayer("Ulrik");


		teamOne.setRank(3);
		teamTwo.setRank(1);
		teamThree.setRank(2);
		teamFour.setRank(4);
		teamFive.setRank(6);
		teamSix.setRank(5);

		System.out.println(teamOne);
		System.out.println(teamTwo);
		System.out.println(teamThree);
		System.out.println(teamFour);
		System.out.println(teamFive);
		System.out.println(teamSix);
	}
}