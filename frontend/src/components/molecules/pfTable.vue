<script lang="ts" setup>
import { onMounted } from 'vue'
import { Row /* , Cell */ } from '../../utils/ifaces/table.interface'
import PfButton from '../atoms/pfButton.vue'

export interface Props {
  columns: string[]
  rows?: Row[]
  viewCta?: string
  editCta?: string
  deleteCta?: string
}

const props = withDefaults(defineProps<Props>(), {
  columns: () => ['Column 1', 'Column 2'],
  viewCta: '',
  editCta: '',
  deleteCta: ''
})

onMounted(() => {
  if (props.rows) {
    console.log(props.rows)
    console.log(props.rows[0].cells)
  }
})
</script>

<template>
  <table class="pf-table">
    <thead class="pf-table-head">
      <tr class="pf-table-row">
        <th class="pf-table-header" v-for="column in columns" :key="column">{{ column }}</th>
      </tr>
    </thead>
    <tbody class="pf-table-body">
      <tr class="pf-table-row" v-for="row in rows" :key="row.id">
        <td class="pf-table-cell" v-for="cell in row.cells" :key="cell.value">
          <template v-if="!cell.action">{{ cell.value }}</template>
          <template v-else>
            <slot name="actions" :row="row">
              <div class="pf-table-actions">
                <router-link v-if="viewCta" :to="`${viewCta}/${row.id}`">
                  <pf-button label="View" />
                </router-link>
                <router-link v-if="editCta" :to="`${editCta}/${row.id}`">
                  <pf-button label="Edit" />
                </router-link>
                <router-link v-if="deleteCta" :to="`${deleteCta}/${row.id}`">
                  <pf-button label="Delete" btn-style="danger" />
                </router-link>
              </div>
            </slot>
          </template>
        </td>
      </tr>
    </tbody>
  </table>
</template>

<style lang="scss" scoped>
.pf-table {
  width: 100%;
  border-collapse: collapse;

  &-head {
    background-color: #f9f9f9;
  }

  &-row {
    border-bottom: 1px solid #ddd;
  }

  &-header {
    border: 1px solid #ddd;
    text-align: left;
    padding: 8px;
  }

  &-cell {
    border: 1px solid #ddd;
    text-align: left;
    padding: 8px;
  }

  &-actions {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 8px;
  }
}
</style>
