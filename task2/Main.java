public class Main {
    public static void main(String[] args) {
        FootballClub chelsea = new FootballClub("Chelsea F.C", "Enzo Maresca", new Team(
            new String[]{
                "1 Robert Sanchez GK",
                "12 Filip Jorgensen GK",
                "13 Marcus Bettinelli GK",
                "47 Lucas Bergstrom GK"
            },
            new String[]{
                "3 Marc Cucurella DF",
                "4 Tosin Adarabioyo DF",
                "5 Benoit Badiashile DF",
                "6 Levi Colwill DF",
                "24 Reece James DF",
                "27 Malo Gusto DF",
                "29 Wesley Fofana DF",
                "34 Josh Acheampong DF"
            },
            new String[]{
                "8 Enzo Fernandez MF",
                "20 Cole Palmer MF",
                "22 Kiernan Dewsbury-Hall MF",
                "25 Moises Caicedo MF",
                "37 Omari Kellyman MF",
                "45 Romeo Lavia MF"
            },
            new String[]{
                "10 Mykhailo Mudryk FW",
                "11 Noni Madueke FW",
                "15 Nicolas Jackson FW",
                "18 Christopher Nkunku FW",
                "19 Jadon Sancho FW",
                "32 Tyrique George FW",
                "38 Marc Guiu FW"
            }
        ));

        FootballClub liverpool = new FootballClub("Liverpool F.C.", "Arne Slot", new Team(
            new String[]{
                "1 Alisson Becker GK",
                "56 Vitezslav Jaros GK",
                "62 Caoimhín Kelleher GK",
                "95 Harvey Davies GK"
            },
            new String[]{
                "2 Joe Gomez DF",
                "4 Virgil van Dijk DF",
                "5 Ibrahima Konaté DF",
                "21 Konstantinos Tsimikas DF",
                "26 Andrew Robertson DF",
                "66 Trent Alexander-Arnold DF",
                "78 Jarell Quansah DF",
                "84 Conor Bradley DF"
            },
            new String[]{
                "3 Wataru Endo MF",
                "8 Dominik Szoboszlai MF",
                "10 Alexis Mac Allister MF",
                "17 Curtis Jones MF",
                "19 Harvey Elliott MF",
                "38 Ryan Gravenberch MF",
                "80 Tyler Morton MF"
            },
            new String[]{
                "7 Luis Díaz FW",
                "9 Darwin Núñez FW",
                "11 Mohamed Salah FW",
                "14 Federico Chiesa FW",
                "18 Cody Gakpo FW",
                "20 Diogo Jota FW"
            }
        ));

        FootballClub mancity = new FootballClub("Manchester City F.C.", "Pep Guardiola", new Team(
            new String[]{
                "18 Stefan Ortega GK",
                "31 Ederson GK",
                "33 Scott Carson GK"
            },
            new String[]{
                "2 Kyle Walker DF",
                "3 Ruben Dias DF",
                "5 John Stones DF",
                "6 Nathan Ake DF",
                "22 Vitor Reis DF",
                "24 Josko Gvardiol DF",
                "25 Manuel Akanji DF",
                "45 Abdukodir Khusanov DF",
                "82 Rico Lewis DF",
                "97 Joshua Wilson-Esbrand DF"
            },
            new String[]{
                "8 Mateo Kovacic MF",
                "10 Jack Grealish MF",
                "16 Rodrigo MF",
                "17 Kevin De Bruyne MF",
                "19 Ilkay Gundogan MF",
                "20 Bernardo Silva MF",
                "27 Matheus Nunes MF",
                "47 Phil Foden MF",
                "52 Oscar Bobb MF",
                "87 James McAtee MF"
            },
            new String[]{
                "7 Omar Marmoush FW",
                "9 Erling Haaland FW",
                "11 Jeremy Doku FW",
                "26 Savinho FW"
            }
        ));

        System.out.println(mancity.getName());
        System.out.println("Manager: " + mancity.getManager());
        String[] sq = mancity.makeSquad();
        for (String sq1 : sq) {
            System.out.println(sq1);
        }
    }
}
