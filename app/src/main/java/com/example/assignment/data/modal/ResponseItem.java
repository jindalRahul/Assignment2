package com.example.assignment.data.modal;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseItem implements Serializable {


	@SerializedName("assignees")
	private List<Object> assignees;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("title")
	private String title;

	@SerializedName("body")
	private String body;

	@SerializedName("labels_url")
	private String labelsUrl;

	@SerializedName("author_association")
	private String authorAssociation;

	@SerializedName("number")
	private int number;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("performed_via_github_app")
	private Object performedViaGithubApp;

	@SerializedName("comments_url")
	private String commentsUrl;

	@SerializedName("active_lock_reason")
	private Object activeLockReason;

	@SerializedName("repository_url")
	private String repositoryUrl;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private String state;

	@SerializedName("locked")
	private boolean locked;

	@SerializedName("timeline_url")
	private String timelineUrl;

	@SerializedName("pull_request")
	private PullRequest pullRequest;

	@SerializedName("comments")
	private int comments;

	@SerializedName("closed_at")
	private Object closedAt;

	@SerializedName("url")
	private String url;

	@SerializedName("labels")
	private List<Object> labels;

	@SerializedName("milestone")
	private Object milestone;

	@SerializedName("events_url")
	private String eventsUrl;

	@SerializedName("html_url")
	private String htmlUrl;

//	@SerializedName("reactions")
//	private Reactions reactions;

	@SerializedName("assignee")
	private Object assignee;

	@SerializedName("user")
	private User user;

	@SerializedName("node_id")
	private String nodeId;

	public List<Object> getAssignees(){
		return assignees;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getTitle(){
		return title;
	}

	public String getBody(){
		return body;
	}

	public String getLabelsUrl(){
		return labelsUrl;
	}

	public String getAuthorAssociation(){
		return authorAssociation;
	}

	public int getNumber(){
		return number;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public Object getPerformedViaGithubApp(){
		return performedViaGithubApp;
	}

	public String getCommentsUrl(){
		return commentsUrl;
	}

	public Object getActiveLockReason(){
		return activeLockReason;
	}

	public String getRepositoryUrl(){
		return repositoryUrl;
	}

	public int getId(){
		return id;
	}

	public String getState(){
		return state;
	}

	public boolean isLocked(){
		return locked;
	}

	public String getTimelineUrl(){
		return timelineUrl;
	}

	public PullRequest getPullRequest(){
		return pullRequest;
	}

	public int getComments(){
		return comments;
	}

	public Object getClosedAt(){
		return closedAt;
	}

	public String getUrl(){
		return url;
	}

	public List<Object> getLabels(){
		return labels;
	}

	public Object getMilestone(){
		return milestone;
	}

	public String getEventsUrl(){
		return eventsUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

//	public Reactions getReactions(){
//		return reactions;
//	}

	public Object getAssignee(){
		return assignee;
	}

	public User getUser(){
		return user;
	}

	public String getNodeId(){
		return nodeId;
	}
}