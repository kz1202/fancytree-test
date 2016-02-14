package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	//	必要なAPIの一覧
	//		ルート取得
	//		子要素取得（１階層分）
	//		削除
	//		移動
	//		リネーム
	//		属性変更
	//		フォルダー追加
	//		ファイル追加
	//		ビューに含まれるオブジェクト一覧（ページング）

	@RequestMapping(value="gettree")
	public List<TreeNode> getTree() {
//		[{"title": "Node 1", "key": "1"},
//		 {"title": "Folder 2", "key": "2", "folder": true, "children": [
//		    {"title": "Node 2.1", "key": "3"},
//		    {"title": "Node 2.2", "key": "4"}
//		  ]}
//		]		
		lombok.val result = new ArrayList<TreeNode>();
		
		result.add(new TreeNode("folder", UUID.randomUUID().toString(), true, null, true));
		for(int i = 0; i < 30; i++) {
			result.add(new TreeNode("file" + i, UUID.randomUUID().toString(), null, null, null));
		}
//		
//				new ArrayList<TreeNode>() {
//					private static final long serialVersionUID = 1L;
//				{
//					add(new TreeNode("Node2.1", UUID.randomUUID().toString(), null, null));
//					add(new TreeNode("Node2.2", UUID.randomUUID().toString(), null, null)); 
//				}}
//				));
//		
		return result;
		
	}
	
	
}
