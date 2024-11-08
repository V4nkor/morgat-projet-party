<script lang="ts" setup>
import { defineEmits } from 'vue'
import pfTitle from '../atoms/pfTitle.vue'
import pfInput from '../atoms/pfInput.vue'
import pfButton from '../atoms/pfButton.vue'

interface Input {
  label: string
  placeholder: string
  type: string
  name: string
  value: string
}

export interface Props {
  title?: string
  inputs?: Input[]
  submitLabel?: string
}

const emits = defineEmits(['formsubmit'])

const props = withDefaults(defineProps<Props>(), {
  title: '',
  inputs: () => [],
  submitLabel: 'Submit'
})

function handleSubmit() {
  let formdata = props.inputs.map((input) => input.value)
  emits('formsubmit', formdata)
}
</script>

<template>
  <div class="pf-form-container">
    <pf-title :title="props.title" />
    <form class="pf-form-element" :style="{ 
        width: props.inputs.length > 5 ? '' : '300px',
        display: props.inputs.length > 5 ? 'flex' : 'block',
      }">
      <span v-if="props.inputs.length === 0">No inputs found!</span>
      <div v-else-if="props.inputs.length > 5" class="flex flex-wrap" style="gap: 1em">
        <div class="flex-col" style="gap: 1em">
          <pf-input
            v-for="input in props.inputs.slice(0, 5)"
            :label="input.label"
            :placeholder="input.placeholder"
            :type="input.type"
            :name="input.name"
            v-model="input.value"
          />
        </div>
        <div class="flex-col" style="gap: 1em">
          <pf-input
            v-for="input in props.inputs.slice(5)"
            :label="input.label"
            :placeholder="input.placeholder"
            :type="input.type"
            :name="input.name"
            v-model="input.value"
          />
        </div>
      </div>
      <pf-input
        v-else
        v-for="input in props.inputs"
        :label="input.label"
        :placeholder="input.placeholder"
        :type="input.type"
        :name="input.name"
        v-model="input.value"
      />
      <pf-button :label="props.submitLabel" @click="handleSubmit" />
    </form>
  </div>
</template>

<style lang="scss" scoped>
.pf-form-container {
  display: flex;
  flex-direction: column;
  gap: 20px;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.pf-form-element {
  background: var(--grey-lighter);
  padding: 40px;
  border-radius: 25px;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  flex-direction: column;
  gap: 20px;
  margin-left: 20px;
  margin-right: 20px;
  margin-bottom: 20px;
}
</style>
