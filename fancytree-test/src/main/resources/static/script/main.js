/**
 * 
 */


$(function() {
	
	$('#tree').fancytree({
		// Initial node data that sets 'lazy' flag on some leaf nodes
		  source: {
				url: "/gettree",			//	ルートを取得
			    cache: false
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
		  }
	});
	
	
});