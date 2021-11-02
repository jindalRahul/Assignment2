package com.example.assignment.data.modal;

import com.google.gson.annotations.SerializedName;

public class PullRequest{

	@SerializedName("patch_url")
	private String patchUrl;

	@SerializedName("html_url")
	private String htmlUrl;

	@SerializedName("diff_url")
	private String diffUrl;

	@SerializedName("url")
	private String url;

	public String getPatchUrl(){
		return patchUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public String getDiffUrl(){
		return diffUrl;
	}

	public String getUrl(){
		return url;
	}
}