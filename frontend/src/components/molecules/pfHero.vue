<script lang="ts" setup>
import { onMounted, ref } from 'vue'

export interface Props {
  img: String
  slideshow: String[]
}

const props = withDefaults(defineProps<Props>(), {
  img: '',
  slideshow: []
})

const currentImg = ref()

onMounted(() => {
  if (props.slideshow.length === 0) {
    return
  }

  currentImg.value = props.slideshow[0]

  let i = 0
  setInterval(() => {
    i++
    if (i >= props.slideshow.length) {
      i = 0
    }
    currentImg.value = props.slideshow[i]
  }, 5000)
})
</script>

<template>
  <div class="pf-hero">
    <img
      v-if="props.slideshow.length > 0"
      class="pf-hero-background pf-hero-slideshow-fade"
      :src="currentImg"
      alt="Hero image"
    />
    <img v-else class="pf-hero-background" :src="img" alt="Hero image" />

    <div class="pf-hero-content">
      <slot></slot>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.pf-hero {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 50vh;
  overflow: hidden;

  &-background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100%;
    object-fit: cover;
    filter: brightness(0.5);
  }

  &-content {
    position: relative;
    z-index: 1;
    text-align: center;
    color: white;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1em;
  }

  &-slideshow-fade {
    animation: fade 1s;
  }
}
</style>
