<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .leftnav {
        width: 250px;
        height: 100%;
        padding: 15px 0px;
        border-right: 1px solid lightgrey;
    }
    .left-category {
        width: 220px;
        height: 45px;
        border-bottom: 1px solid lightgrey;
        font-size: 13px;
        padding: 15px 0px;
        margin: 0px 15px;
        font-weight: bold;
        text-align: left;
    }
    .left-category:hover {
        background-color: #F2F2F2;
    }
    .left-category-ko {
        color: #222222;
    }
    .left-category-en {
        color: lightgrey;
    }
    .left-category span {
        font-size: 11px;
    }
</style>
<script>
    let category = {
        init: function () {
            $('#top').click(function () {
                alert("Clicked")
                $.ajax({
                    url: '/item/top',
                    data: {'cateNo': 100}, // 'id' 라는 이름으로 id를 전송하 겠다
                    success: function (result) {
                        console.log(20000);
                    }  //주의!!!success일때는 세미콜론, 컴마가 없다!!!!!!!!!!!!!!!!!!!!
                });
                console.log("data gone");
            });
        }
    };

    $(function (){
        category.init();
    });
</script>

<%--leftnav--%>
<div class="col-sm-2 leftnav">
    <div class="left-category" id="top">
        <a href="/item/top" class="left-category-ko" >상의</a>
        <span class="left-category-en" >
           TOP
        </span>    </div>
    <div class="left-category">
        <a href="/item/bottom" class="left-category-ko">하의</a>
        <span class="left-category-en">Bottom</span>
    </div>
    <div class="left-category">
        <a href="/item/shoes" class="left-category-ko">신발</a>
        <span class="left-category-en">Shoes</span>
    </div>
    <br/><br/>
    <p style="border-bottom: 1px solid lightgrey; padding: 15px"/>
    <div style="margin:15px;height: 150px;text-align: left">
        <h3 class="glyphicon glyphicon-earphone">1544-0000</h3>
        <p style="font-size: 11px;color:darkgrey;">오전10시~오후5시 운영 / 금,토,일,휴일 휴무</p>
        <div style="border-top: 1px solid lightgrey; font-size: 11px;padding-top: 15px">
            <p>- 전화 전 <a href="#">자주 묻는 질문</a>을 확인하세요.</p>
            <p>- <a href="#">1:1문의</a>를 통해서도 상담이 가능합니다.</p>
            <p>- 상담문의는 각 상품 Q&A를 이용하세요.</p>
        </div>
    </div>
</div>