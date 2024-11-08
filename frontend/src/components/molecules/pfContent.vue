<script lang="ts" setup></script>

<template>
  <div class="pf-content">
    <slot></slot>
  </div>
</template>

<style lang="scss" scoped>
.pf-content {
  display: flex;
  flex-direction: column;
  gap: 1em;
  padding: 1em;
}
</style>
