<template>
  <h1> Bot name: {{bot_name}}</h1>
  <h1> Bot rating: {{bot_rating}}</h1>
  <router-view/>
</template>

<script>
import $ from 'jquery';
import {ref} from 'vue';
  export default {
    name :"App",
    setup:() => {
      let bot_name = ref("")
      let bot_rating = ref("")
      $.ajax(
        {
          url:"http://localhost:8080/pk/getbotinfo/",
        type:"get",
          success: resp=>{
            console.log(resp);
            bot_name.value = resp.name;
            bot_rating.value = resp.rating;
          }
        });
      return {bot_name,bot_rating}
    }
  }
</script>
<style>

</style>
