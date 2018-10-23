function changes(url,title,index){
    $.ajax({
        url:url,
        type:"get",
        success:function(data){
            switch (index) {
                case 1:
                    $("#page1").empty().append(data);
                    $("#page1_name").empty().append(title);
                    break;
                case 2:
                    $("#page2").empty().append(data);
                    $("#page2_name").empty().append(title);
                    break;
            }
        },
        error:function(){
            alert("false");
        }
    })
}
function chackUserlogin() {
    $.ajax({
        url: "http://localhost:8080/index/getUserData.do",
        type: "POST",
        success: function (data) {
        },
        dataType: "json",
        error: function () {
            // alert("获取用户信息失败");
            $(".have-userdata").addClass("hidden");
        }
    })
}
function initRow() {
    $(".row").css({
        "margin-top": "10px",
        "margin-left": "0px",
        "margin-right": "0px",
        "border-radius": "6px"
    });
}
function resetHerfList(item,data,clazz) {
    // language=JQuery-CSS
    item.empty();
    var Data=data;
    for(var key in Data) {
        // alert("键：" + key + ",值 :"+ Data[key]);
        var nexts="<a href=\""+Data[key]+"\" class=\""+clazz+"\">\n" +
            "<p class=\"collapse-list-in\">"+key+"</p>\n" +
            "</a>";
        item.append(nexts);
    }
}