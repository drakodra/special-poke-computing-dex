/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author gebruiker
 */
public class PokeData {

    private Pokemon[] pokelijst;

    public int getTypeNr(String type) {
        switch (type) {
            case "Normal":
            case "normal":
            case "NORMAL":
                return 0;
            case "Fire":
            case "fire":
            case "FIRE":
                return 1;
            case "Fighting":
            case "fighting":
            case "FIGHTING":
                return 2;
            case "Water":
            case "water":
            case "WATER":
                return 3;
            case "Flying":
            case "flying":
            case "FLYING":
                return 4;
            case "Grass":
            case "grass":
            case "GRASS":
                return 5;
            case "Poison":
            case "poison":
            case "POISON":
                return 6;
            case "Electric":
            case "electric":
            case "ELECTRIC":
                return 7;
            case "Ground":
            case "ground":
            case "GROUND":
                return 8;
            case "Psychic":
            case "psychic":
            case "PSYCHIC":
                return 9;
            case "Rock":
            case "rock":
            case "ROCK":
                return 10;
            case "Ice":
            case "ice":
            case "ICE":
                return 11;
            case "Bug":
            case "bug":
            case "BUG":
                return 12;
            case "Dragon":
            case "dragon":
            case "DRAGON":
                return 13;
            case "Ghost":
            case "ghost":
            case "GHOST":
                return 14;
            case "Dark":
            case "dark":
            case "DARK":
                return 15;
            case "Steel":
            case "steel":
            case "STEEL":
                return 16;
        }
        return -1;
    }

    public String getTypeString(int type) {
        switch (type) {
            case 0:
                return "Normal";
            case 1:
                return "Fire";
            case 2:
                return "Figthing";
            case 3:
                return "Water";
            case 4:
                return "Flying";
            case 5:
                return "Grass";
            case 6:
                return "Poison";
            case 7:
                return "Electric";
            case 8:
                return "Ground";
            case 9:
                return "Psychic";
            case 10:
                return "Rock";
            case 11:
                return "Ice";
            case 12:
                return "Bug";
            case 13:
                return "Dragon";
            case 14:
                return "Ghost";
            case 15:
                return "Dark";
            case 16:
                return "Steel";
        }
        return "-";
    }

    public PokeData(/*String[] pbst*/) {
        String[] pbst = new String[1];
        pbst[0] = " 35|CLEFAIRY  |GRASS/ROCK       |  45| 120|  28|  31|  26|  73|Cute Charm  |Magic Guard |Leppa Berry (common), Moon Stone (rare)";
        pokelijst = new Pokemon[pbst.length];
        String name;
        int type1I;
        int type2I;
        int hp;
        int attack;
        int defence;
        int speed;
        int specialAttack;
        int specialDefence;
        String ability1;
        String ability2;
        String item1;
        String item2;
        //for (int i = 0; i < pbst.length; i++) {
        name = pbst[0].substring(4, pbst[0].indexOf(" ", 3));
        if (pbst[0].contains("/")) {
            type1I = getTypeNr(pbst[0].substring(15, pbst[0].indexOf("/")));
            type2I = getTypeNr(pbst[0].substring(pbst[0].indexOf("/") + 1, pbst[0].indexOf(" ", 15)));
        } else {
            type1I = getTypeNr(pbst[0].substring(15, pbst[0].indexOf(" ", 15)));
            type2I = -1;
        }
        hp = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 37) + 1, 37));

        attack = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 42) + 1, 42));

        defence = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 47) + 1, 47));

        speed = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 52) + 1, 52));

        specialAttack = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 57) + 1, 57));

        specialDefence = Integer.parseInt(pbst[0].substring(pbst[0].lastIndexOf(" ", 62) + 1, 62));

        ability1 = pbst[0].substring(63, pbst[0].indexOf(" ", 63));

        ability2 = pbst[0].substring(76, pbst[0].indexOf(" ", 76));
        
        

        System.out.println(0 + "|" + name + "|" + type1I + "/" + type2I + "|"
                + hp + "|" + attack + "|" + defence + "|" + speed + "|" + specialAttack
                + "|" + specialDefence + "|" + ability1 + "|" + ability2);

        //pokelijst[i] = new Pokemon(i, name, type1I, type2I, hp, attack, 
        //        defence, speed, specialAttack, specialDefence, ability1, 
        //        ability2, item1, item2);
        //}
    }

    public static void main(String[] args) {
        PokeData data = new PokeData();
        System.out.println("done");
    }
}
