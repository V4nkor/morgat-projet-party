<script lang="ts" setup>
import { onMounted } from 'vue'
import axiosAPI from '../../axios.instance'
//import { Lesson } from '../../utils/ifaces/lesson.interface'
import { /* Cell,  */ Row } from '../../utils/ifaces/table.interface'
import pfTitle from '../../components/atoms/pfTitle.vue'
import pfButton from '../../components/atoms/pfButton.vue'
import pfTable from '../../components/molecules/pfTable.vue'

const columns = ['Event name', 'Date', 'Players', 'Game master', 'Players max', 'Actions']
const rows: Row[] = [
  {
    id: 1,
    cells: [
      { value: 'Soirée JDR', type: 'text' },
      { value: '2022-01-01', type: 'date' },
      { value: '4', type: 'number' },
      { value: 'John Doe', type: 'text' },
      { value: '6', type: 'number' }
    ]
  },
  {
    id: 2,
    cells: [
      { value: 'Soirée Alcool', type: 'text' },
      { value: '2022-01-01', type: 'date' },
      { value: '4', type: 'number' },
      { value: 'John Doe', type: 'text' },
      { value: '6', type: 'number' }
    ]
  },
  {
    id: 3,
    cells: [
      { value: 'Soirée Gaming', type: 'text' },
      { value: '2022-01-01', type: 'date' },
      { value: '4', type: 'number' },
      { value: 'John Doe', type: 'text' },
      { value: '6', type: 'number' }
    ]
  }
]

onMounted(() => {
  if (axiosAPI) {
    console.log('axiosAPI is defined')
    //Waiting for correct endpoint to uncomment
    /* axiosAPI
      .get('/events')
      .then((response) => {
        console.log(response.data)
      })
      .catch((error) => {
        console.error(error)
      }) */
  } else {
    console.error('axiosAPI is not defined')
  }
})
</script>

<template>
  <pf-title title="Events (With fake data)" />
  <router-link to="/events/create" style="width: fit-content">
    <pf-button label="Create new event" />
  </router-link>
  <pf-table
    :columns
    :rows
    view-cta="/events/view"
    edit-cta="/events/edit"
    delete-cta="/events/delete"
  />
</template>

<style lang="scss" scoped></style>
