/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;
/**
 *
 * @author yusuf
 */
public class Enemy extends Entity {
    
    public Item loot; //Item dropped when dead, code yet to be implemented
    // ^^^ Intended result is picking an item from a loot array according to item rarity and returning that as the loot dropped
    // for now we're keeping it simple
    
    public Enemy (String name, int maxhp, int atk, int def, Item loot) {
        super(name, maxhp, atk, def);
        this.loot = loot;
    }
    
    /*
    todo:
    Wave 1
    -enemy turn function to menu1 so it doesn't always attack
    
    Wave 2
    -add mp, matk, mdef and speed stats
    -proper damage and crit calculation
    -run and skill functions
    -level system and exp
    
    Wave 3
    -player and enemy generation
    -fighting enemies in a row
    -loot percentage
    -terrains and enemy lists in each terrain
    
    TBC
    -hub mode
    -design!!
    */
}
