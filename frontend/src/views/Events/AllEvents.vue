<script lang="ts" setup>
import { onMounted } from 'vue'
import axiosAPI from '../../axios.instance'
//import { Lesson } from '../../utils/ifaces/lesson.interface'
import { /* Cell,  */ Row } from '../../utils/ifaces/table.interface'
import pfTitle from '../../components/atoms/pfTitle.vue'
import pfButton from '../../components/atoms/pfButton.vue'
import pfTable from '../../components/molecules/pfTable.vue'
import pfContent from '../../components/molecules/pfContent.vue'

const columns = ['Event name', 'Date', 'Players', 'Game master', 'Players max', 'Actions']
const rows: Row[] = [
  {
    id: 1,
    cells: [
      { value: 'Soirée JDR' },
      { value: '2022-01-01' },
      { value: '4' },
      { value: 'John Doe' },
      { value: '6' },
      { value: '', action: true }
    ]
  },
  {
    id: 2,
    cells: [
      { value: 'Soirée Alcool' },
      { value: '2022-01-01' },
      { value: '4' },
      { value: 'John Doe' },
      { value: '6' },
      { value: '', action: true }
    ]
  },
  {
    id: 3,
    cells: [
      { value: 'Soirée Gaming' },
      { value: '2022-01-01' },
      { value: '4' },
      { value: 'John Doe' },
      { value: '6' },
      { value: '', action: true }
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
  <pf-content>
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
  </pf-content>
</template>

<style lang="scss" scoped></style>
