<?xml version="1.0" encoding="utf-8"?>
<order-order>
	<id>$id$</id>
	<orderName>$orderName$</orderName>
	<date>$orderDate$</date>
	<date>$deliveryDate$</date>
$itemlist: { it |
	<item>
		<itemCode>$it.itemCode$</itemCode>
		<itemName>$it.itemName$</itemName>
		<price>$it.price$</price>
		<quantity>$it.quantity$</quantity>
	</item>
}$
</order-order>