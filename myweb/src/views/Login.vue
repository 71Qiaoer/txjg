<template>
  <div class="login-container">
    <h1 class="login-title">用户登录</h1>
    <div class="login-form-background">
      <form @submit.prevent="login" class="login-form">
        <div class="form-group">
          <label for="username">用户名：</label>
          <input type="text" id="username" v-model="username" required>
        </div>
        <div class="form-group">
          <label for="password">密码：</label>
          <input type="password" id="password" v-model="password" required>
        </div>
        <button type="submit">登录</button>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: 'Login',
  data () {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    login () {
      // 处理登录逻辑
      if (this.username === 'customer' && this.password === '123') {
        // 登录成功，跳转到顾客店铺列表界面
        this.$router.push('/customer/store-list')
      } else if (this.username === 'business' && this.password === '123') {
        // 登录成功，跳转到商家店铺列表界面
        this.$router.push('/business/shop-list')
      } else {
        // 登录失败，处理错误逻辑，例如显示错误信息
        alert('用户名或密码错误')
      }
    }
  }
}
</script>

<style scoped>
.login-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
  background-color: #e0f7fa;
}

.login-title {
  font-size: 32px;
  color: #009688; /* 深绿色标题 */
  margin-bottom: 20px;
  text-align: center;
}

.login-form-background {
  background-color: #ffffff; /* 白色背景 */
  border-radius: 10px; /* 圆角 */
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 淡淡的阴影效果 */
  padding: 20px;
  margin: 20px 50px; /* 左右留出相同的间距 */
}

.login-form {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.form-group {
  margin-bottom: 15px;
}

label {
  font-size: 16px;
  color: #333; /* 深灰色文字 */
  display: block;
  margin-bottom: 5px;
}

input {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc; /* 浅灰色边框 */
  border-radius: 5px; /* 圆角 */
  box-sizing: border-box; /* 让padding不影响总宽度 */
  margin-bottom: 10px; /* 调整输入框之间的间距 */
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
</style>
