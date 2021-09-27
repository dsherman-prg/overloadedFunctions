fun main(){
    // Initialize variables
    var name = "x"
    var phoneNumber = "x"
    var business = "x"
    var selection = 1

    do{
        // Print menu
        println("Please enter the number of your selection:")
        println("1 Residential Customer")
        println("2 Business Customer")
        println("3 Exit")
        // Get user selection
        selection = readLine()!!.toInt()

        when (selection) {
            // Residential customer
            1 -> {
                println("Please enter your contact name")
                name = readLine()!!.toString()
                println("Please enter your phone number")
                phoneNumber = readLine()!!.toString()
                addUser(name, phoneNumber)
            }

            // Business Customer
            2 -> {
                println("Please enter your business name")
                business = readLine()!!.toString()
                println("Please enter your contact name")
                name = readLine()!!.toString()
                println("Please enter your phone number")
                phoneNumber = readLine()!!.toString()
                addUser(business, name, phoneNumber)
            }
            
            // Error if invalid selection entered
            !in 1..3 -> println("Invalid Entry. Please enter a valid selection.")
        }

    // Loop if invalid selection is entered
    }while (selection !in 1..3)
}

// Residential customer
fun addUser(name: String, phoneNumber: String){
    println(name)
    println(phoneNumber)
}

// Business Customer
fun addUser(business: String,name: String, phoneNumber: String){
    println(business)
    println(name)
    println(phoneNumber)
}