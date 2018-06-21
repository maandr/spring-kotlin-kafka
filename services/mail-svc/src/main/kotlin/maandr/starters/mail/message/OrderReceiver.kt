package maandr.starters.mail.message

import maandr.starters.mail.orders.Order
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.Acknowledgment
import org.springframework.stereotype.Component

@Component
class OrderReceiver {

    private val log = LoggerFactory.getLogger(OrderReceiver::class.java)

    @KafkaListener(topics = ["Order"])
    fun receive(order: Order, acknowledgement: Acknowledgment) {
        log.info("Received order $order")
        acknowledgement.acknowledge()
    }
}