import Category.*

fun main() {
    createShop()
}

fun createShop() {

    val shop = Shop(
        name = "Alibaba Express",
        location = "Innopolis University, Kazan, Russia"
    )

    shop.addInventory(clothItem, stockCategory = Clothes)
    shop.addInventory(foodItem, stockCategory = Food)
    shop.addInventory(drugItem, stockCategory = Pharmacy)

    shop.addCustomer(customer1)
    shop.addCustomer(customer2)

    shop.addConsumer(consumer1)
    shop.addConsumer(consumer2)

    shop.addCustomer(customer1)
}

