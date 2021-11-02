package com.example.assignment.data.modal;

import com.google.gson.annotations.SerializedName;

public class Reactions{

	@SerializedName("confused")
	private int confused;

	@SerializedName("-1")
	private int jsonMember1;

	@SerializedName("total_count")
	private int totalCount;

//	@SerializedName("+1")
//	private int jsonMember1;

	@SerializedName("rocket")
	private int rocket;

	@SerializedName("hooray")
	private int hooray;

	@SerializedName("eyes")
	private int eyes;

	@SerializedName("url")
	private String url;

	@SerializedName("laugh")
	private int laugh;

	@SerializedName("heart")
	private int heart;

	public int getConfused(){
		return confused;
	}

	public int getJsonMember1(){
		return jsonMember1;
	}

	public int getTotalCount(){
		return totalCount;
	}

//	public int getJsonMember1(){
//		return jsonMember1;
//	}

	public int getRocket(){
		return rocket;
	}

	public int getHooray(){
		return hooray;
	}

	public int getEyes(){
		return eyes;
	}

	public String getUrl(){
		return url;
	}

	public int getLaugh(){
		return laugh;
	}

	public int getHeart(){
		return heart;
	}
}