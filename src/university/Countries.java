package university;
// EfimovDA
    public class Countries {
        private String countryName;
        private int area;
        private int population;
        private String capital;
        private int capitalPopulation;



        public Countries(String countryName, int area, int population) {
            SetCountryName(countryName);
            SetArea(area);
            SetPopulation(population);
        }
    public Countries(String countryName, int area, int population, String capital, int capitalPopulation) {
        this (countryName, area, population);
        SetCapital(capital);
        SetCapitalPopulation(capitalPopulation);
    }
        public String getCountryName() {
            return countryName;
        }

        public int getArea() {
            return area;
        }

        public int getPopulation() {
            return population;
        }

        public String getCapital() {
            return capital;
        }

        public int getCapitalPopulation() {
            return capitalPopulation;
        }

        public double getPopulationDensity() {
            return ((double) population / area);
        }

        public void SetCountryName(String countryName) {
            if (countryName.isEmpty()) {
                System.out.println("Не может быть пустой ссылкой");
            } else {
                this.countryName = countryName;
            }
        }

        public void SetArea(int area) {
            if (area == 0) {
                throw new IllegalArgumentException("Площадь должна быть больше нуля");
            } else {
                this.area = area;
            }
        }

        public void SetPopulation(int population) {
            if (population == 0) {
                throw new IllegalArgumentException("Население должно быть больше нуля");
            } else {
                this.population = population;
            }
        }

        public void SetCapital(String capital) {
            if (capital.isEmpty()) {
                System.out.println("Не может быть пустой ссылкой");
            } else {
                this.capital = capital;
            }
        }

        public void SetCapitalPopulation(int capitalPopulation) {
            if (capitalPopulation == 0) {
                throw new IllegalArgumentException("Население столицы должно быть больше нуля");
            } else {
                this.capitalPopulation = capitalPopulation;
            }
        }

        public void print() {
            if (getCapital() != null) {
                System.out.println(getCountryName() + " Площадь страны " + getArea() + ", Население страны " + getPopulation() + ", Столица страны " + getCapital() + ", Население столицы " + getCapitalPopulation() + ", Плотность населения "  + getPopulationDensity());
            } else {
                System.out.println(getCountryName() + " Площадь страны " + getArea() + " ,Население страны " + getPopulation() + ", Плотность населения "+ getPopulationDensity());
            }
        }

        public static void printAll(Countries[] array) {
            for (Countries mass : array)
                mass.print();


        }
    }
