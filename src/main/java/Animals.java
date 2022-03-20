public class Animals {


    private String Dog;
    private String Cat;

    public Animals(String dog, String cat) {
        Dog = dog;
        Cat = cat;
    }

    public String getDog() {
        return Dog;
    }

    public void setDog(String dog) {
        Dog = dog;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String cat) {
        Cat = cat;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Dog='" + Dog + '\'' +
                ", Cat='" + Cat + '\'' +
                '}';
    }
}
