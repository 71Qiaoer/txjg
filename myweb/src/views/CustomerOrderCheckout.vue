<template>
  <div class="order-checkout-container">
    <h1 class="checkout-title">订单结算</h1>
    <div class="order-summary">
      <h2>订单详情</h2>
      <ul>
        <li v-for="item in fixedItems" :key="item.id">
          {{ item.name }} - 价格：{{ item.price }} - 数量：{{ item.quantity }}
        </li>
      </ul>
      <p>总金额：330</p>
      <button @click="completeOrder">完成付款</button>
      <button @click="cancelOrder">取消订单</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'OrderCheckout',
  data () {
    return {
      fixedItems: [
        { id: 1, name: '商品1', price: 100, quantity: 1 },
        { id: 2, name: '商品2', price: 150, quantity: 1 },
        { id: 3, name: '商品3', price: 80, quantity: 1 }
      ]
    }
  },
  methods: {
    completeOrder () {
      // 模拟支付流程后，跳转到订单列表页面
      console.log('订单已完成支付')
      this.$router.push('/customer/order-list')
    },
    cancelOrder () {
      // 取消订单后，回到商店页面
      console.log('订单已取消')
      // eslint-disable-next-line no-template-curly-in-string
      this.$router.push('/customer/store/${storeId}')
    }
  }
}
</script>

<style scoped>
/* Styles remain unchanged */
</style>

<style scoped>
.order-checkout-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
}

.checkout-title {
  font-size: 24px;
  color: #009688;
  margin-bottom: 20px;
}

.order-summary {
  background-color: #ffffff;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  padding: 20px;
  margin-top: 20px;
  width: 300px;
  text-align: center;
}

.order-summary h2 {
  font-size: 18px;
  margin-bottom: 10px;
}

.order-summary ul {
  list-style: none;
  padding: 0;
}

.order-summary li {
  margin-bottom: 10px;
}

.order-summary button {
  background-color: #009688;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-top: 10px;
}

.order-summary button:hover {
  background-color: #00796b;
}
</style>
