function getCode(code) {
    //赋值部分
    $.ajax({
        url: "/admin/base/getCode/"+code,
        type: "post",
        dataType: "json",
        success: function(result) {
            $("#partnersName").val(result.partnersName);
            //select赋值
            $("#partnersType").val(result.partnersType);
            $("#partnersStatus").val(result.partnersStatus);
            renderForm();//表单重新渲染，要不然添加完显示不出来新的
            $("#partnersProprotion").val(result.partnersProprotion);
            $("#partnersAddress").val(result.partnersAddress);
            $("#partnersMan").val(result.partnersMan);
            $("#partnersContact").val(result.partnersContact);
        }
    });
}

function checkPwd(data) {
    $.ajax({
        url: "/admin/user/checkDel/pwd/",
        type: "post",
        dataType: "json",
        data: {pwd:data},
        success: function (data) {
            if (data.code == "success") {
                return true;
            } else {
                return false;
            }
        },
        error: function (data) {
            $.layer.alert('错误', data.msg);
        }
    });
};