/**
 * 1. 从后台获取商品分类以及区域信息填充到页面中
 * 2. 将页面的数据提交到后台
 */
$(function() {
	// 初始化页面url
	var initUrl = '/o2o/shopadmin/getshopinitinfo';
	// 注册店铺信息url
	var registerShopUrl = '/o2o/shopadmin/registershop';
	getShopInitInfo();
	alert(initUrl);
	// 从后台获取商品分类以及区域信息填充到页面中
	function getShopInitInfo() {
		$.getJSON(initUrl, function(data) {
			if(data.success) {
				var tempHtml = '';
				var tempAreaHtml = '';
				// 遍历商店种类信息
				data.shopCategoryList.map(function(item, index) {
					tempHtml += '<option data-id="' + item.shopCategoryId + '">'
					+ item.shopCategoryName + '</option>';
				});
				// 遍历区域信息
				data.areaList.map(function(item, index) {
					tempAreaHtml += '<option data-id="' + item.areaId + '">'
					+ item.areaName + '</option>';
				});
				$('#shop-category').html(tempHtml);
				$('#area').html(tempAreaHtml);
			}
		});
		
		$('#submit').click(function() {
			var shop = {};
			shop.shopName = $('#shop-name').val();
			shop.shopAddr = $('#shop-addr').val();
			shop.phone = $('#shop-phone').val();
			shop.shopDesc = $('#shop-desc').val();
			shop.shopCategory = {
					shopCategoryId:$('#shop-category').find('option').not(function() {
						return !this.selected;
					}).data('id')
			};
			shop.area = {
					areaId:$('#area').find('option').not(function() {
						return !this.selected;
					}).data('id')
			};
			var shopImg = $('#shop-img')[0].files[0];
			var formData = new FormData();
			formData.append('shopImg', shopImg);
			formData.append('shopStr', JSON.stringify(shop));
			$.ajax({
				url:registerShopUrl,
				type:'POST',
				data:formData,
				contentType:false,
				processData:false,
				cache:false,
				success:function(data){
					if(data.success) {
						$.toast('提交成功！');
					} else{
						$.toast('提交失败！' + data.errMsg);
					}
				}
			});
		});
	}
	
	// 将页面的数据提交到后台
	
})