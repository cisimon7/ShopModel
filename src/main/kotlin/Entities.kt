import Gender.*
import java.time.LocalDate

val clothItem = ClothInventory(
    name = "T-Shirt",
    size = 13,
    price = 70.54
)

val foodItem = FoodInventory(
    name = "Burger",
    expiration = LocalDate.parse("2018-12-31"),
    price = 7.2
)

val drugItem = PharmacyInventory(
    name = "Paracetamol",
    expiration = LocalDate.parse("2020-09-24"),
    price = 10.4
)

val customer1 = Customer(
    name = "Pippin Took",
    age = 26,
    gender = Male
)

val customer2 = Customer(
    name = "Merry Took",
    age = 27,
    gender = Female
)

val consumer1 = Consumer(
    name = "Frodo Baggins",
    age = 33,
    gender = Male
)

val consumer2 = Consumer(
    name = "Sam Gamgee",
    age = 35,
    gender = Female
)