/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

/**
 *
 * @author yusuf
 */
public class Entity {
    
    //fields for name and stats
    public String name;
    public int maxhp;
    public int hp;
    public int atk;
    public int def;
    
    //default constructor, nameless entity with 0 in all stats
    public Entity() {
        this.name = "";
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }
    
    //takes name and each stat as parameters
    public Entity(String name, int maxhp, int atk, int def) {
        this.name = name;
        this.maxhp = maxhp;
        hp = maxhp;
        this.atk = atk;
        this.def = def;
    }
    
    
}
