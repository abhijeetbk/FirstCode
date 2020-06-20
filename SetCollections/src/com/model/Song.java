package com.model;

public class Song implements Comparable<Song> {
	 private String name;
	 private String singer;
	 private String composer;
	 
	public Song(String name, String singer, String composer) {
		super();
		this.name = name;
		this.singer = singer;
		this.composer = composer;
	}

	@Override
	public boolean equals(Object obj) {
		Song s = (Song)obj;
		if(this.getName().equals(s.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return this.name.hashCode();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + ", composer=" + composer + "]";
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}

	

	@Override
	public int compareTo(Song o) {
		if(this.getName().equals(o.getName())) {
			return this.getSinger().compareTo(o.getSinger());
		}
		return this.getName().compareTo(o.getName());
	}

	
}
