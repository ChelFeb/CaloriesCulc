//jQuery_1_8_3(function(){
$(function(){

    $('#open-add-product').click(function(e){
        $('#add-product-popup').lightbox_me({
            centered: true,
            onLoad: function() {}
            });
        e.preventDefault();
    })

    $('#open-registration').click(function(e){
        $('#registration-popup').lightbox_me({
            centered: true,
            onLoad: function() {}
        });
        e.preventDefault();
    })


    $('#productHistory').ionCalendar({
        lang: "ru",                     // язык календаря
        sundayFirst: false,             // первый день недели
        years: "5",                    // диапазон лет
        format: "DD.MM.YYYY",           // формат возвращаемой даты
        onClick: function(date){        // клик по дням вернет сюда дату
            console.log(date);
        }
    });



});