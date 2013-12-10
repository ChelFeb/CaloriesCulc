//jQuery_1_8_3(function(){
$(function(){

    $('#open-add-product').click(function(e){
        $('#add-product-popup').lightbox_me({
            centered: true,
            onLoad: function() {}
            });
        e.preventDefault();
    })





});