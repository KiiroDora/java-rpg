/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;
import java.util.*;
/**
 *
 * @author yusuf
 */
public class Player extends Entity {
    
    public static ArrayList<Item> inv = new ArrayList<>(); //start with empty inventory
    
    public Player (String name, int maxhp, int atk, int def)  {
        super(name, maxhp, atk, def);
    }
    
}
