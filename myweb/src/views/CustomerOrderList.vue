<template>
  <div class="order-details-container">
    <h1>顾客订单详情</h1>
    <h3>订单号：{{ order.orderNumber }}</h3>
    <p>总价：￥{{ order.totalPrice }}</p>
    <ul>
      <li v-for="product in order.products" :key="product.id">
        {{ product.name }} - ￥{{ product.price }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'CustomerOrderDetails',
  data () {
    return {
      order: {
        orderNumber: '2021001',
        totalPrice: 330,
        products: [
          { id: 1, name: '商品1', price: 100 },
          { id: 2, name: '商品2', price: 150 },
          { id: 3, name: '商品3', price: 80 }
        ]
      }
    }
  },
  methods: {
    cancelOrder (orderId) {
      // 处理取消订单逻辑
    }
  }
}
</script>

<style scoped>
.order-details-container {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 8px;
  background-color: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
  font-size: 24px;
  color: #009688;
}

h3 {
  font-size: 18px;
  margin-top: 10px;
}

p {
  font-size: 16px;
  margin-bottom: 15px;
}

ul {
  list-style: none;
  padding: 0;
}

li {
  font-size: 14px;
  margin-bottom: 8px;
}

</style>
