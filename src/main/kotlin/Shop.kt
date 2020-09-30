@file:Suppress("ArrayInDataClass")

import Category.*
import java.time.LocalDate
import java.time.LocalDateTime

data class Shop (
    private val name: String,
    private val location: String,
    private val consumers: MutableList<Consumer> = mutableListOf(),
    private val customers: MutableList<Customer> = mutableListOf(),
    private val orders: MutableList<Order> = mutableListOf(),
    private val inventoryStocks: Map<Category, Stock> = mapOf(  //stock of items
        Clothes to Stock(Clothes),
        Food to Stock(Food),
        Pharmacy to Stock(Pharmacy)
    )
) {

    fun addConsumer(consumer: Consumer) {
        consumers.add(consumer)
    }

    fun addCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun addInventory(inventory: Inventory, stockCategory: Category) {
        inventoryStocks.getValue(stockCategory).inventories[inventory] = 0.0
    }

    fun remInventory(inventoryName: String, stockCategory: Category) {
        inventoryStocks.getValue(stockCategory).inventories.removeByName { it == inventoryName }
    }

    fun takeOrder(order: Order) {
        orders.add(order)
    }

    fun isOrderPossible(inventory: Inventory): Boolean {
        when (inventory) {
            is FoodInventory -> { inventory.expiration > LocalDate.now() }
            is PharmacyInventory -> { inventory.expiration > LocalDate.now() }
            is ClothInventory -> { inventory.size < inventoryStocks.getValue(Clothes).inventories.size }
        }
        return false
    }
}

fun MutableMap<Inventory, Double>.removeByName(predicate: (String) -> Boolean) {
    val inventory = this.keys.first { predicate(it.name) }
    this.remove(inventory)
}

enum class Category { Clothes, Food, Pharmacy }

enum class Gender { Male, Female }