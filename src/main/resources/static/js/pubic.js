$(function(){
    // 到达顶部功能
    window.onscroll = function () {
        if($(document).scrollTop() > 600) {
           $('.toTop').css('display','block')
        }else{
            $('.toTop').css('display','none')
        }
    }
    // 点击返回顶部
    $('.toTop').click(function(){
        $('html,body').animate({'scrollTop': 0},500,function(){
            $('.toTop').css('display','none');
        })
    })
})