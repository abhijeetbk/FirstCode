package com.comparators;

import java.util.Comparator;

import com.model.Song;

public class SingerComparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
