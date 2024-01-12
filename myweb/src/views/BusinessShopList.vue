<template>
  <div class="business-shop-list-container">
    <h1 class="page-title">商家店铺列表</h1>
    <ul class="shop-list">
      <li v-for="shop in shops" :key="shop.id">
        {{ shop.name }} - <button @click="viewShop(shop.id)">查看店铺</button>
      </li>
    </ul>

    <!-- Add the button to navigate to BusinessOrderList.vue -->
    <router-link to="/business/order-list">
      <button class="order-list-button">订单列表</button>
    </router-link>
  </div>
</template>

<script>
export default {
  name: 'BusinessShopList',
  data () {
    return {
      shops: [
        { id: 1, name: '店铺 A' },
        { id: 2, name: '店铺 B' }
        // Add more shops as needed
      ]
    }
  },
  methods: {
    viewShop (shopId) {
      this.$router.push(`/business/shop/${shopId}`)
    }
  }
}
</script>

<style scoped>
.business-shop-list-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
  background-color: #e0f7fa; /* 淡蓝色背景 */
}

.page-title {
  font-size: 32px;
  color: #009688; /* 深绿色标题 */
  margin-bottom: 20px;
  text-align: center;
}

.shop-list {
  list-style: none;
  padding: 0;
}

.shop-list li {
  margin-bottom: 10px;
}

button {
  background-color: #009688; /* 深绿色按钮 */
  color: #fff; /* 白色文字 */
  padding: 10px 20px;
  border: none;
  border-radius: 5px; /* 圆角 */
  cursor: pointer;
}

button:hover {
  background-color: #00796b; /* 深绿色按钮，悬停状态 */
}

.order-list-button {
  background-color: #009688;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-top: 20px;
}

.order-list-button:hover {
  background-color: #00796b;
}
</style>
