import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/Login.vue'
import CustomerStoreList from '../views/CustomerShopList.vue'
import CustomerStore from '../views/CustomerShop.vue'
import CustomerOrderCheckout from '../views/CustomerOrderCheckout.vue'
import CustomerOrderList from '../views/CustomerOrderList.vue'

import BusinessShopDetails from '../views/BusinessShopDetails.vue'
import BusinessOrderList from '../views/BusinessOrderList.vue'
import BusinessShopList from '../views/BusinessShopList.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    redirect: '/login'
  },
  {
    path: '/login',
    name: '登录',
    component: Login
  },
  {
    path: '/customer/store-list',
    name: '顾客店铺列表',
    component: CustomerStoreList
  },
  {
    path: '/customer/store/:storeId',
    name: '顾客店铺',
    component: CustomerStore
  },
  {
    path: '/customer/checkout',
    name: '顾客订单结账',
    component: CustomerOrderCheckout
  },
  {
    path: '/customer/order-list',
    name: '顾客订单列表',
    component: CustomerOrderList
  },

  {
    path: '/business/shop-list',
    name: '商家店铺列表',
    component: BusinessShopList
  },
  {
    path: '/business/shop/:shopId',
    name: '商家店铺',
    component: BusinessShopDetails
  },
  {
    path: '/business/order-list',
    name: '商家订单列表',
    component: BusinessOrderList
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
