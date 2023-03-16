/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;
import javax.swing.JTextArea;
/**
 *
 * @author yusuf
 */
public class Item {
    
    String name;
    int id; //used to determine item type (heal hp, heal mp, recovery etc.) 
    int power; //used in calculations
    
    //default constructor, red potion without name
    public Item() {
        id = 0;
        power = 10;
    }
    
    //constructor that takes name, id and power parameters
    public Item(int id, int power, String name) {
        this.id = id;
        this.power = power;
        this.name = name;
    }
    
    //JTextArea is so that we can display messages here instead of on the main file
    public static void useItem(Item i, Player user, JTextArea text) {
        switch(i.id) { //check which type the item is
            
            case 0 -> { //HP Heal
                text.append("\n" + user.name + " regains " + ((user.maxhp - user.hp <= i.power) ? user.maxhp - user.hp : i.power) + " HP!");
                user.hp += i.power; //directly heal hp by power, overheal is dealt with the check functions on the main file
            }
            
            case 1 -> { //MP Heal
                
            }
            
            case 2 -> { //Revive, auto revives if potion is in inventory
                
            }
            
        }
    }
}
