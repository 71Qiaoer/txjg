<template>
  <div class="business-order-list-container">
    <h1>商家店铺订单列表</h1>
    <div v-for="order in orders" :key="order.id" class="order-item">
      <h3>订单号：{{ order.orderNumber }}</h3>
      <p>总价：{{ order.totalPrice }}</p>
      <div class="order-actions">
        <button @click="confirmOrder(order)" :disabled="order.status !== '待操作'">确认订单</button>
        <button @click="refundOrder(order)" :disabled="order.status !== '待操作'">退款</button>
      </div>
      <p>Status: {{ order.status }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MerchantOrderList',
  data () {
    return {
      orders: [
        { id: 1, orderNumber: '2021001', totalPrice: 330, status: '待操作' },
        { id: 2, orderNumber: '2021002', totalPrice: 180, status: '待操作' },
        { id: 3, orderNumber: '2021003', totalPrice: 350, status: '待操作' }
      ]
    }
  },
  methods: {
    confirmOrder (order) {
      // Update the order status to '已确认'
      if (order.status === '待操作') {
        order.status = '已确认'
      }
    },
    refundOrder (order) {
      // Update the order status to '已退款'
      if (order.status === '待操作') {
        order.status = '已退款'
      }
    }
  }
}
</script>

<style scoped>
.business-order-list-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.order-item {
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 15px;
  margin-bottom: 15px;
}

.order-actions {
  display: flex;
  gap: 10px;
}

button {
  background-color: #009688;
  color: #fff;
  padding: 8px 15px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

button:disabled {
  background-color: #ccc;
  cursor: not-allowed;
}
</style>
