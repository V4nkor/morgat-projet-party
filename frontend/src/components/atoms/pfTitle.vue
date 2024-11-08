<script lang="ts" setup>
import { titleType } from "../../utils/ifaces/titleTypes.enum";

export interface Props {
  title: string;
  icon?: string;
  type?: titleType;
}

const props = withDefaults(defineProps<Props>(), {
  title: "",
  icon: "",
  type: "title",
});
</script>

<template>
  <h1 :class="`pf-title-${props.type}`">
    <span v-if="props.icon">{{ icon }}</span>
    <span v-if="props.title"> {{ title }} </span>
  </h1>
</template>

<style lang="scss" scoped>
.pf-title {
  &-title {
    font-size: 24px;
    font-weight: 700;
    color: var(--primary);
  }

  &-subtitle {
    font-size: 18px;
    font-weight: 400;
    color: var(--primary);
  }

  &-herotitle {
    font-size: 24px;
    font-weight: 700;
    color: var(--white);
  }

  &-herosubtitle {
    font-size: 18px;
    font-weight: 400;
    color: var(--white);
  }
}
</style>
