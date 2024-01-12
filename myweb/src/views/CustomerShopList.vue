<template>
  <div class="store-list-container">
    <h1 class="store-list-title">顾客店铺列表</h1>
    <div v-for="store in stores" :key="store.id" class="store-item">
      <h3>{{ store.name }}</h3>
      <p>{{ store.description }}</p>
      <button @click="viewStore(store.id)">进入店铺</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'CustomerStoreList',
  data () {
    return {
      stores: [
        { id: 1, name: '店铺1', description: '这是店铺1的描述' },
        { id: 2, name: '店铺2', description: '这是店铺2的描述' },
        { id: 3, name: '店铺3', description: '这是店铺3的描述' }
      ]
    }
  },
  methods: {
    viewStore (storeId) {
      // 处理进入店铺的逻辑，并跳转到店铺界面
      this.$router.push(`/customer/store/${storeId}`)
    }
  }
}
</script>

<style scoped>
.store-list-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
}

.store-list-title {
  font-size: 24px;
  color: #009688; /* 深绿色标题 */
  margin-bottom: 20px;
}

.store-item {
  background-color: #ffffff; /* 白色背景 */
  border-radius: 10px; /* 圆角 */
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 淡淡的阴影效果 */
  padding: 20px;
  margin-bottom: 20px;
  width: 300px;
  text-align: center;
}

.store-item h3 {
  font-size: 18px;
  margin-bottom: 10px;
}

.store-item p {
  font-size: 14px;
  color: #666; /* 中灰色文字 */
  margin-bottom: 15px;
}

.store-item button {
  background-color: #009688; /* 深绿色按钮 */
  color: #fff; /* 白色文字 */
  padding: 10px 20px;
  border: none;
  border-radius: 5px; /* 圆角 */
  cursor: pointer;
}

.store-item button:hover {
  background-color: #00796b; /* 深绿色按钮，悬停状态 */
}
</style>
