package com.sh.upload;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport{
	private File photoUpload;
	private String photoUploadContentType;
	private String photoUploadFileName;

	public File getPhotoUpload() {
		return photoUpload;
	}

	public void setPhotoUpload(File photoUpload) {
		this.photoUpload = photoUpload;
	}

	public String getPhotoUploadContentType() {
		return photoUploadContentType;
	}

	public void setPhotoUploadContentType(String photoUploadContentType) {
		this.photoUploadContentType = photoUploadContentType;
	}

	public String getPhotoUploadFileName() {
		return photoUploadFileName;
	}

	public void setPhotoUploadFileName(String photoUploadFileName) {
		this.photoUploadFileName = photoUploadFileName;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String display() {
		return NONE;
	}
}
