/***
Chiming Wang
01/18/2022
Java Period 8
lesson22classwork
***/

import javax.swing.*;

public class NHLDriver {
  public static void main( String[] args )
  {
    String teamName = "";
    String teamConf = "";
    String teamDiv = "";
    int teamAge = 0;
   
    String playerName = "";
    int playerNum = 0;
    String playerPos = "";
    String playerCity = "";

   
    NHLTeam Team1 = new NHLTeam();
   
    Team1.setTeamName("Team1");
    Team1.setTeamConf("Eastern");
    Team1.setTeamDiv("Atlantic");
    Team1.setTeamAge(16);
   
    teamName = Team1.getTeamName();
    teamConf = Team1.getTeamConf();
    teamDiv = Team1.getTeamDiv();
    teamAge = Team1.getTeamAge();
   
    NHLPlayers spongebob = new NHLPlayers();
   
    spongebob.setPlayerName("spongebob");
    spongebob.setPlayerNum(1274712);
    spongebob.setPlayerPos("Sponge");
    spongebob.setPlayerCity("Pineapple Under the Sea");
   
    playerName = spongebob.getPlayerName();
    playerNum = spongebob.getPlayerNum();
    playerPos = spongebob.getPlayerPos();
    playerCity = spongebob.getPlayerCity();
    
    Arena KrustyKrab = new Arena();
    
    KrustyKrab.setArenaName("Krusty Krab");
    KrustyKrab.setArenaCity("yes");

    
    System.out.println(Team1);
    System.out.println(spongebob);
    System.out.println(KrustyKrab);



  }
}
