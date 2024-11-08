<script lang="ts" setup>
import pfForm from '../../components/molecules/pfForm.vue'

const inputs = [
  {
    label: 'Event name',
    placeholder: 'Enter your the event name',
    type: 'input',
    name: 'event_name',
    value: ''
  },
  {
    label: 'Date',
    placeholder: 'Enter the date',
    type: 'date',
    name: 'date',
    value: ''
  },
  {
    label: 'Time',
    placeholder: 'Enter the time',
    type: 'time',
    name: 'time',
    value: ''
  },
  {
    label: 'Description',
    placeholder: 'Enter the description',
    type: 'textarea',
    name: 'description',
    value: ''
  },
  {
    label: 'Location',
    placeholder: 'Enter the location',
    type: 'input',
    name: 'location',
    value: ''
  },
  {
    label: 'Max participants',
    placeholder: 'Enter the max participants',
    type: 'number',
    name: 'max_participants',
    value: ''
  },
  {
    label: 'Theme',
    placeholder: 'Enter the theme',
    type: 'input',
    name: 'theme',
    value: ''
  },
  {
    label: 'Price',
    placeholder: 'Enter the price',
    type: 'number',
    name: 'price',
    value: ''
  }
]
</script>

<template>
  <pf-form title="Create Event" :inputs />
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
