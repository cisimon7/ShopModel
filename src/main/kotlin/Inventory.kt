import java.time.LocalDate
import java.time.LocalDateTime

// referring to an item
open class Inventory (
    open val name: String,
    open val price: Double,
    open val dateCreated: LocalDateTime = LocalDateTime.now(),
)

data class ClothInventory (
    override val name: String,
    val size: Int,
    override val price: Double
) : Inventory(name, price) {
    init {
        require(name.isNotEmpty())
        require(name.isNotBlank())
    }
}

data class FoodInventory(
    override val name: String,
    val expiration: LocalDate,
    override val price: Double
) : Inventory(name, price) {
    init {
        require(name.isNotEmpty())
        require(name.isNotBlank())
    }
}

data class PharmacyInventory(
    override val name: String,
    val expiration: LocalDate,
    override val price: Double
) : Inventory(name, price) {
    init {
        require(name.isNotEmpty())
        require(name.isNotBlank())
    }
}