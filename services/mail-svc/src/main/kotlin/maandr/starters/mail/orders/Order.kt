package maandr.starters.mail.orders

import org.springframework.stereotype.Component
import java.math.BigDecimal

data class Order(
    val id: Long,
    val items: Collection<LineItem>,
    val customer: Customer
)

data class LineItem(
    val name: String,
    val amount: Int,
    val price: BigDecimal
)

data class Customer(
    val name: String
)