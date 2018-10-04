package ru.geekbrains.Lesson7;

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }

    boolean dicreaseFood(int food) {
		if (this.food-food>=0) {
			this.food -= food;
			return true;
		}
		else {
			return false;
		}
    }
	void encreaseFood(int food) {
		this.food += food;
	}

    void info() { System.out.println("Plate: "+food); }
    @Override
    public String toString() {
        return "Food: " + food;
    }
}




