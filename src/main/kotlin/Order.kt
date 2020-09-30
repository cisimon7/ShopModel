import java.time.LocalDateTime

data class Order (
    val date: LocalDateTime,
    val inventory: Inventory,   //list of things consumer wants to buy
    val consumer: Consumer,
    val customer: Customer,
    val price: Double,
    val amount: Int
)