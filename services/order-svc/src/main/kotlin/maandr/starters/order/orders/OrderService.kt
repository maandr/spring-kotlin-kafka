package maandr.starters.order.orders

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class OrderService(
    val kafkaTemplate: KafkaTemplate<String, Order>
) {
    private val log = LoggerFactory.getLogger(OrderService::class.java)

    fun createOrder(customer: Customer, items: Collection<LineItem>) {
        val order = Order(id = 1001, customer = customer, items = items)
        log.info("created order: $order")
        kafkaTemplate.send("Order", "${order.id}-created", order)
    }
}