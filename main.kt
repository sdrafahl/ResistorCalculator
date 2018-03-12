fun main(args: Array<String>) {

    val voltage: Long = args[0].toLong();
    val voltageDrop: Long = args[1].toLong();
    val currentInMilliAmps: Long = args[2].toLong();

    val amps: Double = currentInMilliAmps * .001;
    println("Ohms Required: " + ((voltage-voltageDrop)/amps));

}
