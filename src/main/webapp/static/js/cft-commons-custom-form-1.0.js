//給textarea輸入框加上 character limited提示
$('textarea[class*=autosize]').autosize({append: "\n"});
$('textarea.limited').inputlimiter({
			remText: '%n character%s remaining...',
			limitText: 'max allowed : %n.'			
});

//屏蔽掉 Enter键 防止提交表单
function NoSubmit(ev){
    if(ev.keyCode == 13){
        return false;
    }
    return true;
}
