/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing1;

/**
 *
 * @author yusuf
 */
public class ItemDatabase { //Database of items for easy access, since it's static all you need to do is ItemDatabase.nameofitem
    
    public static Item pot_hp1 = new Item(0,10,"Red Potion");
    public static Item pot_hp2 = new Item(0,20,"Scarlet Potion");
    public static Item pot_hp3 = new Item(0,50,"Crimson Potion");
    
    public static Item pot_mp1 = new Item(1,10,"Blue Potion");
    public static Item pot_mp2 = new Item(1,20,"Azure Potion");
    public static Item pot_mp3 = new Item(1,50,"Cerulean Potion");
    
    public static Item pot_rev1 = new Item(2,50,"Green Potion"); //revived with power% of maxhp
    public static Item pot_rev2 = new Item(2,75,"Verdant Potion");
    public static Item pot_rev3 = new Item(2,100,"Chartreuse Potion");
    
}
