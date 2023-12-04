public class aoc_day1 {
    public static void main(String[] args) {
        dayOne d = new dayOne("two1nine\r\n" + //
                "eightwothree\r\n" + //
                "abcone2threexyz\r\n" + //
                "xtwone3four\r\n" + //
                "4nineeightseven2\r\n" + //
                "zoneight234\r\n" + //
                "7pqrstsixteen");
        System.out.println(d.sommaNumeri());
    }
}