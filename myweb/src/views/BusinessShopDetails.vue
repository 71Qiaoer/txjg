<template>
  <div class="business-shop-details-container">
    <h1>商家店铺详情</h1>
    <h2>{{ shopName }}</h2>
    <button @click="addItem">上架新商品</button>

    <div class="product-list" v-if="products.length > 0">
      <div v-for="product in products" :key="product.id" class="product-item">
        <h3>{{ product.name }}</h3>
        <p>价格：{{ product.price }}</p>
        <!-- Add more product details as needed -->
      </div>
    </div>

    <div v-else>
      <p>该店铺暂无商品上架。</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BusinessShopDetails',
  data () {
    return {
      shopName: '店铺名称', // Fetch this from your backend or set dynamically
      products: [
        { id: 1, name: '商品 A', price: 50 },
        { id: 2, name: '商品 B', price: 30 }
        // Add more products as needed
      ]
    }
  },
  methods: {
    addItem () {
      // 以弹窗形式输入新商品的名称和价格，模拟实际上架商品的逻辑
      const productName = prompt('请输入新商品的名称：')
      const productPrice = prompt('请输入新商品的价格：')

      // 确保输入不为空，然后创建新商品并添加到列表中
      if (productName && productPrice) {
        const newProduct = {
          id: this.products.length + 1,
          name: productName,
          price: parseFloat(productPrice)
        }
        this.products.push(newProduct)
      }
    }
  }
}
</script>

<style scoped>
.business-shop-details-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 20px;

}

h1, h2, h3, p {
  margin: 0;
}

h1 {
  font-size: 32px;
  color: #009688; /* 深绿色标题 */
}

h2 {
  font-size: 24px;
  margin-bottom: 20px;
}

button {
  background-color: #009688; /* 深绿色按钮 */
  color: #fff; /* 白色文字 */
  padding: 10px 20px;
  border: none;
  border-radius: 5px; /* 圆角 */
  cursor: pointer;
  margin-bottom: 20px;
}

button:hover {
  background-color: #00796b; /* 深绿色按钮，悬停状态 */
}

.product-list {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.product-item {
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 10px;
  margin: 10px;
  text-align: center;
}

</style>
