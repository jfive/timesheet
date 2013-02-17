$(document).ready(function(){
    $("span.accordion").click(function(){
        $(this).parent().find("div.accordion").slideToggle("slow")
    });
});