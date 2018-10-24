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
        url: "http://2x24l52465.iok.la/webControllor/index/getUserData.do",
        type: "POST",
        success: function (data) {
            var accsess = getAccess();
            if (accsess == 9) {
                $(".access-9").addClass("hidden");
                $(".access-8").addClass("hidden");
                $(".access-7").addClass("hidden");
                $(".access-6").addClass("hidden");
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 8) {
                $(".access-8").addClass("hidden");
                $(".access-7").addClass("hidden");
                $(".access-6").addClass("hidden");
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 7) {
                $(".access-7").addClass("hidden");
                $(".access-6").addClass("hidden");
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 6) {
                $(".access-6").addClass("hidden");
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 5) {
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 4) {
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 3) {
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 2) {
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 1) {
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            } else if (accsess == 0) {
                $(".access-0").addClass("hidden");
            } else {
                $(".access-10").addClass("hidden");
                $(".access-9").addClass("hidden");
                $(".access-8").addClass("hidden");
                $(".access-7").addClass("hidden");
                $(".access-6").addClass("hidden");
                $(".access-5").addClass("hidden");
                $(".access-4").addClass("hidden");
                $(".access-3").addClass("hidden");
                $(".access-2").addClass("hidden");
                $(".access-1").addClass("hidden");
                $(".access-0").addClass("hidden");
            }
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

function getAccess() {
    $.ajax({
        url:"http://2x24l52465.iok.la/webControllor/index/getUserAccess.do",
        type:"post",
        success:function(data){
            return data;
        },
        dataType:"json",
        error:function(){
            return null;
        }
    })
}