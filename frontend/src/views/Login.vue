<script lang="ts" setup>
import { useRouter } from 'vue-router'
import pfForm from '../components/molecules/pfForm.vue'
import { nextTick } from 'vue'

const router = useRouter()

const inputs = [
  {
    label: 'Email',
    placeholder: 'Enter your email',
    type: 'email',
    name: 'email',
    value: ''
  },
  {
    label: 'Password',
    placeholder: 'Enter your password',
    type: 'password',
    name: 'password',
    value: ''
  }
]

function handleLogin(formdata: string[]) {
  console.log('login')
  console.log(formdata)

  if (true) {
    localStorage.setItem('connected', 'true')
    console.log('User is connected, redirecting to home page')
    //emit('login-success');
    nextTick(() => {
      router.push('/')
    })
  }
}
</script>

<template>
  <pf-form title="Login Form" :inputs @formsubmit="handleLogin" />
</template>

<style lang="scss" scoped>
.pf-login-container {
  display: flex;
  flex-direction: column;
  gap: 20px;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.pf-login-form {
  background: var(--grey-lighter);
  padding: 40px;
  border-radius: 25px;
  margin-left: auto;
  margin-right: auto;
  width: 300px;
  display: flex;
  flex-direction: column;
  gap: 20px;
}
</style>
