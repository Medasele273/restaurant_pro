/**
 * 
 */

$('document').ready(function(){
	
	$('.table .btn ').on('click',function(event){
		
		event.preventDefault();
		
		var href =$(this).attr('href');
		$.get(href,function(menu,status){
			$('#IdEdit').val(menu.id);
			$('#nameEdit').val(menu.name);
			$('#typeEdit').val(menu.type);
			$('#priceEdit').val(menu.price.substr(0,10));
			
		});
		
		$('#editModal').modal();
		
	});
	
	$('.table #deleteButton').on('click',function(event){
		
		envent.preventDefault();
		
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);		
		$('#deleteModal').modal();
	});
	
});