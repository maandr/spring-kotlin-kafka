package maandr.starters.deserializer

import maandr.starters.model.Order
import org.springframework.kafka.support.serializer.JsonDeserializer

class OrderDeserializer : JsonDeserializer<Order>()