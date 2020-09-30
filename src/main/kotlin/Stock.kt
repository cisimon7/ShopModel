
data class Stock(
    private val category: Category,
    val inventories: MutableMap<Inventory, Double> = mutableMapOf()
)