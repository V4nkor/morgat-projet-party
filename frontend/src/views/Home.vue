<script lang="ts" setup>
import { ref } from 'vue'
import pfTitle from '../components/atoms/pfTitle.vue'
import pfButton from '../components/atoms/pfButton.vue'
import pfHero from '../components/molecules/pfHero.vue'
import pfContent from '../components/molecules/pfContent.vue'

const images: string[] = ['./soiree_jdr.jpg', './soiree_alcool.png', './soiree_gaming.jpg']

const currentImg = ref<string>(images[0])

// Create
</script>

<template>
  <pf-hero :img="images[0]" :slideshow="images">
    <pf-title
      title="Bienvenue sur Party Finder, vous cherchez une soirée ? Vous êtes au bon endroit !"
      type="herotitle"
    />
    <pf-title
      title="Trouvez des soirées JDR, Alcool et Gaming près de chez vous !"
      type="herosubtitle"
    />
  </pf-hero>
  <pf-content>
    <pf-title title="Trouvons votre soirée !" type="title" />
    <p>Qu'elle type de soirée cherchez vous :</p>
    <div class="flex pf-buttongroup">
      <pf-button :stretch="false" label="🎲 JDR" :disabled="true" />
      <pf-button :stretch="false" label="🎮 Gaming" :disabled="true" />
      <pf-button :stretch="false" label="🍻 Alcool" :disabled="true" />
      <router-link to="/events"><pf-button label="🎉 Tout !!" /></router-link>
    </div>
  </pf-content>
</template>

<style lang="scss" scoped>
.pf-buttongroup {
  align-content: space-evenly;
  flex-wrap: wrap;
  width: 80%;
  gap: 1em;
}
</style>
