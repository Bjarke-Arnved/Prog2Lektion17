package opgave03;

import opgave03.models.DropOutStack;

public class Opgave03 {
    public static void main(String[] args) {
        DropOutStack<String> heros = new DropOutStack<String>(3);
        heros.push("Poul Benden");
        heros.push("Emily Boll");
        heros.push("Kenjo Fusaiyuki");
        heros.push("Salla Telgar");
        System.out.println(heros.size());

        heros.pop();
        heros.clear();
        System.out.println(heros.size());


    }
}
