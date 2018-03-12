fun main(args: Array<String>) {

    val voltage: Double = args[0].toDouble();
    val voltageDrop: Double = args[1].toDouble();
    val currentInMilliAmps: Double = args[2].toDouble();

    val amps: Double = currentInMilliAmps * .001;
    println("Ohms Required: " + ((voltage-voltageDrop)/amps));

}
