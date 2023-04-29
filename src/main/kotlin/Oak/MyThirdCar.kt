package Oak

class MyThirdCar {
    var name: String? = null
    var model: Int? = null
        private set
        get

    constructor(name: String, model: Int) {
        /* the this keyword represents a class to which the method is bound. So here it represents the mySecondCars class. */
        this.name = name
        this.model = model

    }
}