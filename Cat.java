package ru.geekbrains.Lesson7;

class Cat {
    protected String name;
    private int appetite;
	protected boolean stomackfull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
		this.stomackfull = false;
    }

    void eat(Plate plate) {
		if (plate.dicreaseFood(appetite)) this.stomackfull = true;
    }
}




