package maandr.starters.model

import java.math.BigDecimal

data class Order(
    val id: Long = 0,
    val items: Collection<LineItem> = emptyList(),
    val customer: Customer = Customer()
)

data class LineItem(
    val name: String = "",
    val amount: Int = 0,
    val price: BigDecimal = BigDecimal.ZERO
)

data class Customer(
    val name: String = ""
)