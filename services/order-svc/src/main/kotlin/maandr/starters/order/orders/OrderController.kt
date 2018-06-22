package maandr.starters.order.orders

import maandr.starters.model.Customer
import maandr.starters.model.LineItem
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class OrderController(
    val orderService: OrderService
) {
    @PostMapping("/order")
    fun createOrder(@RequestBody name: String) {
        orderService.createOrder(
            Customer(name = name),
            listOf(
                LineItem(name = "Starship", amount = 1, price = BigDecimal(500.00)),
                LineItem(name = "Cloaking Device", amount = 1, price = BigDecimal(75.50))
            )
        )
    }
}