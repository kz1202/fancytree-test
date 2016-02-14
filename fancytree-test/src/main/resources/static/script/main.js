/**
 * 
 */


$(function() {
	
	$('#tree').fancytree({
		extensions: ["childcounter"],
		source: {
			url: "/gettree",			//	ルートを取得
			cache: false
		},
		childcounter: {
	        deep: true,
	        hideZeros: true,
	        hideExpanded: true
		},		
		// Called when a lazy node is expanded for the first time
		lazyLoad: function(event, data){
			var node = data.node;
			// Load child nodes via ajax GET /getTreeData?mode=children&parent=1234
			data.result = {
					url: "/gettree",
					data: {mode: "children", parent: node.key},	//	子要素を取得
					cache: false
			};
		},
		loadChildren: function(event, data) {
	        // update node and parent counters after lazy loading
	        data.node.updateCounters();
	        if(data.node.lazy) {
	        	data.node.load();
	        }
	        
		},
		selectMode:2,
		checkbox:true,
	});
	
	
});