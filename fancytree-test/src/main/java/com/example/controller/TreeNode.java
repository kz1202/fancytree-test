package com.example.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class TreeNode {

	private String title;
	private String key;
	private Boolean folder;
	private List<TreeNode> children;
	private Boolean lazy;
	
}
