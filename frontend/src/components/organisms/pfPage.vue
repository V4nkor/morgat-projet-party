<script lang="ts" setup>
import pfFooter from "../molecules/pfFooter.vue";
import pfHeader from "../molecules/pfHeader.vue";
</script>

<template>
  <div class="pf-page">
    <pf-header />
    <div class="pf-page-container">
      <main class="pf-page-main">
        <div class="pf-page-content">
          <slot></slot>
        </div>
      </main>
      <pf-footer />
    </div>
  </div>
</template>

<style lang="scss" scoped>
.pf-page {
  display: flex;
  flex-direction: column;
  height: 100vh;
  overflow: scroll;

  &-container {
    display: flex;
    flex-direction: column;
    height: 100%;
    width: 100%;
    //background-color: var(--background);
    overflow: scroll;
  }

  &-main {
    display: flex;
    flex-direction: column;
    flex: 1;
    //padding: 2em;
    gap: 1em;
  }

  &-content {
    display: flex;
    flex-direction: column;
    flex: 1;
    //padding: 1em;
    //border-radius: 15px;
    gap: 1em;
    background-color: var(--white);
  }
}
</style>
