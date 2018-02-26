class Card(value: Int, suit: String, faceUp: Boolean) {
//    raise error
    val value: Int
    val suit: String = ""
    var faceUp: Boolean = false

    init {
        // remove above error
        this.value = value
    }
}
