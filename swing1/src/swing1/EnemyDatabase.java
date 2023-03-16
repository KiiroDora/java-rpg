/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;
/**
 *
 * @author yusuf
 */
public class EnemyDatabase { //Database of enemies for easy access, since it's static all you need to do is EnemyDatabase.nameofenemy
    
    public static Enemy slime = new Enemy("Slime",5,1,1,ItemDatabase.pot_hp1);
 
}
