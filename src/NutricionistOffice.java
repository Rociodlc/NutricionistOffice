public class NutricionistOffice {public class patient {
    private String name;
    private int age;
    private double weight;
    private double Height;
    private String gender;
    private boolean Hasdisease;

    // Constructor
    public patient(String name, int age, double weight, double height, String gender, boolean Hasdisease) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.Height = Height;
        this.gender = gender;
        this.Hasdisease = Hasdisease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasdisease() {
        return Hasdisease;
    }

    public void setHasdisease(boolean hasdisease) {
        Hasdisease = hasdisease;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public class IMCCalculator {

        public static double calcularIMC(double Weight, double height) {
            return Weight / (height * height);
        }

        public static String indicarEstadoPeso(double imc) {
            if (imc < 18.5) {
                return "Bajo peso";
            } else if (imc >= 18.5 && imc <= 24.9) {
                return "Peso normal (en el rango ideal)";
            } else if (imc >= 25 && imc <= 29.9) {
                return "Sobrepeso";
            } else {
                return "Obesidad";
            }
        }

        public static void main(String[] args) {
            double Weight = 70; // En kilogramos
            double altura = 1.75; // En metros

            double imc = calcularIMC(Weight, altura);
            System.out.println("El IMC es: " + imc);
            System.out.println("El estado del peso es: " + indicarEstadoPeso(imc));
        }
    }

    }
}



