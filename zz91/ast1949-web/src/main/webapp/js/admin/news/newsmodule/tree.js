Ext.namespace("ast.ast1949.admin.news.newsmodule");

ast.ast1949.admin.news.newsmodule.treePanel = function(_cfg){

	if(_cfg==null){
		_cfg = {};
	}

	var _el = _cfg["el"] || "";
	var _rootData = _cfg["rootData"] || "";

	var root = new Ext.tree.AsyncTreeNode({
		text:"所有模块",
		draggable:false,
		id:"node-0",
		data:_rootData
	});
	var data = new Ext.tree.TreeLoader({
		url: Context.ROOT+Context.PATH+"/admin/news/newsmodule/child.htm"
	});
	
	var tree = new Ext.tree.TreePanel({
		el:_el,
		id:"news-module-tree",
		root:root,
		autoHight:true,
		height:"100%",
		border:false,
		autoScroll:false,
		loader:data
	});

	data.on("beforeload",function(treeLoader,node){
		this.baseParams["id"] = node.attributes["data"];},data);
	tree.setRootNode(root);
	tree.render();
	root.expand();

	return tree;
}