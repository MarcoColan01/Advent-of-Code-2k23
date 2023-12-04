import java.util.*;

public class dayOne {
    List<String> calibrazioni = new ArrayList<>();

    public dayOne(String calibrazioni) {
        /*
         * String regex =
         * "(?<=one|two|three|four|five|six|seven|eight|nine|1|2|3|4|5|6|7|8|9)";
         * String app = String.join(" ",
         * Arrays.stream(calibrazioni.split(regex)).filter(st ->
         * st.isEmpty()).toArray(String[]::new));
         */
        for (String s : calibrazioni.split("\n")) {
            this.calibrazioni.add(s);
        }
        System.out.println(this.calibrazioni.size());
    }

    public int sommaNumeri() {
        int somma = 0;
        for (String s : calibrazioni) {
            somma += trovaNumero(s);
        }
        return somma;
    }

    public int sommaNumeriLettere() {
        int somma = 0;
        for (String s : calibrazioni) {
            somma += trovaNumeroLettere(s);
        }
        return somma;
    }

    public int trovaNumeroLettere(String s) {

        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) {
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(converti(str));
            } else
                sb.append(converti(str));
        }
        if (sb.length() == 1)
            return Integer.valueOf(sb.append(sb.charAt(sb.length() - 1)).toString());
        return Integer.valueOf(sb.toString());
    }

    private int converti(String string) {
        try {
            return Integer.valueOf(string);
        } catch (Exception e) {
            switch (string) {
                case "one":
                    return 1;
                case "two":
                    return 2;
                case "three":
                    return 3;
                case "four":
                    return 4;
                case "five":
                    return 5;
                case "six":
                    return 6;
                case "seven":
                    return 7;
                case "eight":
                    return 8;
                case "nine":
                    return 9;
                default:
                    return 0;
            }
        }
    }

    public int trovaNumero(String s) {
        StringBuilder sb = new StringBuilder();
        for (char app : s.toCharArray()) {
            if (isDigit(app)) {
                if (sb.length() > 1) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(app);
                } else {
                    sb.append(app);
                }
            }
        }
        if (sb.length() == 1)
            return Integer.valueOf(sb.append(sb.charAt(sb.length() - 1)).toString());
        return Integer.valueOf(sb.toString());

    }

    public boolean isDigit(char c) {
        return (c >= 48 && c <= 57);
    }

}