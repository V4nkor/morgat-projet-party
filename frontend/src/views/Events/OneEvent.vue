<script lang="ts" setup>
//import { Event } from '../../utils/ifaces/event.interface'
import pfTitle from '../../components/atoms/pfTitle.vue'
import pfButton from '../../components/atoms/pfButton.vue'

interface Event {
  id: number
  name: string
  date: string
  players: number
  gameMaster: string
  playersMax: number
}

const event: Event = {
  id: 1,
  name: 'Soirée JDR',
  date: '2022-01-01',
  players: 4,
  gameMaster: 'John Doe',
  playersMax: 6
}

// TODO Get event from backend
// TODO Display event
// TODO Display event content
</script>

<template>
  <pf-title :title="`Event (fake data) : ${event.name}`" />
  <div class="pf-button-group">
    <router-link :to="`/events/edit/${event.id}`">
      <pf-button label="Edit" />
    </router-link>
    <router-link :to="`/events/delete/${event.id}`">
      <pf-button label="Delete" />
    </router-link>
  </div>
  <pf-title title="Content" type="subtitle" />
  <span>Event name: {{ event.name }}</span>
  <span>Date: {{ event.date }}</span>
  <span>Players: {{ event.players }}</span>
  <span>Game master: {{ event.gameMaster }}</span>
  <span>Players max: {{ event.playersMax }}</span>
</template>

<style lang="scss" scoped>
.pf-button-group {
  display: flex;
  gap: 20px;
  padding-left: 20px;

  &-section {
    display: flex;
    align-items: center;
    gap: 20px;
  }
}
</style>
