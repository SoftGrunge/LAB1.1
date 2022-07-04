package university;

public class Main {
//EfimovDA
    //
    public static void main(String[] args) {

        Countries[] array = new Countries[]{
                new Countries("Russia", 17100000, 146700000, "Moscow", 12600000),
                new Countries("Finland", 338000, 5500000, "Helsinki", 655000),
                new Countries("France", 643800, 67800000, "Paris", 2100000),
                new Countries("Andorra", 467, 85400, "Andorra la Vella", 22600),
                new Countries("Singapore", 725, 5700000)

        };

        Countries.printAll(array);
    }
}