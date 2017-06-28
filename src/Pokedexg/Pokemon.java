/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedexg;

/**
 *
 * @author gebruiker
 */
public class Pokemon {

    protected int dexNr;
    protected String name;
    protected int type1;
    protected int type2;
    protected int hp;
    protected int attack;
    protected int defence;
    protected int speed;
    protected int specialAttack;
    protected int specialDefence;
    protected String ability1;
    protected String ability2;
    protected String item1;
    protected String item2;
    protected int[] movelvls;
    protected String[] moves;
    protected boolean seen;
    protected boolean caught;

    public Pokemon(int dexNr, String name, int type1, int type2, int hp,
            int attack, int defence, int speed, int specialAttack,
            int specialDefence, String ability1, String ability2, String item1,
            String item2) {
        this.dexNr = dexNr;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.specialAttack = specialAttack;
        this.specialDefence = specialDefence;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.item1 = item1;
        this.item2 = item2;
        this.seen = false;
        this.caught = false;
    }

    public void importMoves(int[] moveLvls, String[] moves) {
        this.movelvls = new int[moveLvls.length];
        this.moves = new String[moves.length];
        for (int i = 0; i < moveLvls.length; i++) {
            this.movelvls[i] = moveLvls[i];
        }
        for (int i = 0; i < moves.length; i++) {
            this.moves[i] = moves[i];
        }
    }
}
