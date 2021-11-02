package com.example.assignment.data.modal;

import com.google.gson.annotations.SerializedName;

public class LabelsItem{

	@SerializedName("default")
	private boolean jsonMemberDefault;

	@SerializedName("color")
	private String color;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private Object description;

	@SerializedName("id")
	private int id;

	@SerializedName("url")
	private String url;

	@SerializedName("node_id")
	private String nodeId;

	public boolean isJsonMemberDefault(){
		return jsonMemberDefault;
	}

	public String getColor(){
		return color;
	}

	public String getName(){
		return name;
	}

	public Object getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}

	public String getNodeId(){
		return nodeId;
	}
}