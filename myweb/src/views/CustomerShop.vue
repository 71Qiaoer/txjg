<template>
  <div class="customer-store-container">
    <h1 class="store-title">顾客店铺</h1>
    <div v-for="product in products" :key="product.id" class="product-item">
      <h3>{{ product.name }}</h3>
      <p>价格：{{ product.price }}</p>
      <div class="quantity-control">
        <button @click="decreaseQuantity(product)">-</button>
        <span>{{ getCartItemQuantity(product) }}</span>
        <button @click="increaseQuantity(product)">+</button>
        <button @click="addToCart(product)">加入购物车</button>
      </div>
    </div>

    <!-- 结算按钮 -->
    <button @click="checkout" class="checkout-button">立即结算</button>
  </div>
</template>

<script>
export default {
  name: 'CustomerStore',
  data () {
    return {
      products: [
        { id: 1, name: '商品1', price: 100 },
        { id: 2, name: '商品2', price: 150 },
        { id: 3, name: '商品3', price: 80 }
      ],
      cartItems: []
    }
  },
  methods: {
    addToCart (product) {
      const existingItem = this.cartItems.find((item) => item.id === product.id)
      if (existingItem) {
        existingItem.quantity++
      } else {
        this.cartItems.push({
          id: product.id,
          name: product.name,
          price: product.price,
          quantity: 1
        })
      }
    },
    decreaseQuantity (product) {
      const existingItem = this.cartItems.find((item) => item.id === product.id)
      if (existingItem && existingItem.quantity > 0) {
        existingItem.quantity--
      }
    },
    increaseQuantity (product) {
      const existingItem = this.cartItems.find((item) => item.id === product.id)
      if (existingItem) {
        existingItem.quantity++
      }
    },
    getCartItemQuantity (product) {
      const existingItem = this.cartItems.find((item) => item.id === product.id)
      return existingItem ? existingItem.quantity : 0
    },
    checkout () {
      // 跳转到订单结算页面
      this.$router.push('/customer/checkout')
    }
  }
}
</script>

<style scoped>
.customer-store-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
}

.store-title {
  font-size: 24px;
  color: #009688;
  margin-bottom: 20px;
}

.product-item {
  background-color: #ffffff;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  padding: 20px;
  margin-bottom: 20px;
  width: 300px;
  text-align: center;
}

.product-item h3 {
  font-size: 18px;
  margin-bottom: 10px;
}

.product-item p {
  font-size: 14px;
  color: #666;
  margin-bottom: 15px;
}

.quantity-control {
  display: flex;
  justify-content: space-around;
  align-items: center;
  margin-top: 10px;
}

.quantity-control button {
  background-color: #009688;
  color: #fff;
  padding: 5px 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.quantity-control span {
  margin: 0 10px;
}

.quantity-control button:hover {
  background-color: #00796b;
}

.checkout-button {
  background-color: #009688;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-top: 20px;
  font-size: 18px;
}

.checkout-button:hover {
  background-color: #009688;
}
</style>
