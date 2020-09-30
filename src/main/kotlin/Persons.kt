
interface Person {
    val name: String
    val age: Int
    val gender: Gender
}

class Consumer(override val name: String, override val age: Int, override val gender: Gender) : Person {
    fun makeOrder(order: Order, shop: Shop) {
        assert(shop.isOrderPossible(order.inventory))
        shop.takeOrder(order)
    }

    init {
        require(age in 0..190)
    }
}


class Customer(override val name: String, override val age: Int, override val gender: Gender) : Person {
    init {
        require(age in 0..190)
    }
}