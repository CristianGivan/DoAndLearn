package Teme.Shelter;

public class Shelter {
    private final int MAX_ANIMAL_NR;
    private int nrOfAnimals;
    private Animal[] animals;

    public Shelter(int MAX_ANIMAL_NR) {
        this.MAX_ANIMAL_NR = MAX_ANIMAL_NR - 1;
        nrOfAnimals = 0;
        animals = new Animal[MAX_ANIMAL_NR];
    }

    public boolean addAnimal(Animal animal) {
        //< and not <=, because we don't want to exced the MAX_ANIMAL_NR with next increment
        if (nrOfAnimals < MAX_ANIMAL_NR) {
            nrOfAnimals++;
            this.animals[nrOfAnimals] = animal;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < nrOfAnimals; i++) {
            System.out.println("Animalul se numeste" + animals[i].getName() +
                    "and it is " + animals[i].getAge() + " old");
        }
    }


    public int getMAX_ANIMAL_NR() {
        return MAX_ANIMAL_NR;
    }

    public int getNrOfAnimals() {
        return nrOfAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }


}
