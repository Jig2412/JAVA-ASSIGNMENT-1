public class TextProfile {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);

        Profile p1 = new Profile(name, age, height);

        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeightMetres());

        String ageText = Integer.toString(age);
        String heightText = Double.toString(height);

        System.out.println(ageText);
        System.out.println(heightText);
    }
}

class Profile {
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {
        if (name!=null && !name.trim().isEmpty() && age>=0 && heightMetres>0) {
            this.name = name;
            this.age = age;
            this.heightMetres = heightMetres;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightMetres() {
        return heightMetres;
    }

    @Override
    public String toString() {
        return "Profile{name='" + name + "', age=" + age + ", height=" + heightMetres + "}";
    }
}
