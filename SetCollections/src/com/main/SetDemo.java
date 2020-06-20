package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.comparators.SingerComparator;
import com.comparators.TitleComparator;
import com.model.Song;

public class SetDemo {

	public static void main(String[] args) {
		
		
		List<Song> songsList = new ArrayList<> ();
		
		songsList.add(new Song("abc","pqr","xyz"));
		songsList.add(new Song("def","pqr","lmn"));
		songsList.add(new Song("hij","lmn","opq"));
		songsList.add(new Song("abc","fgh","xyz"));
		
		System.out.println("without comparator");
		
		Collections.sort(songsList);
		songsList.forEach(System.out::println);
		
		Collections.sort(songsList,new SingerComparator());
		System.out.println("comparing singer wise");
		songsList.forEach(System.out::println);
		System.out.println("comparing title wise");
		Collections.sort(songsList,new TitleComparator());
		songsList.forEach(System.out::println);
		System.out.println("comparing composer wise with anonymous class");
		Collections.sort(songsList,new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				
				return o1.getComposer().compareTo(o2.getComposer());
			}
			
		});
		songsList.forEach(System.out::println);
		System.out.println("comparing composer wise with lambda");
		Collections.sort(songsList, (o1,o2)->o1.getComposer().compareTo(o2.getComposer()));
		System.out.println("Using sort method on List using any of the above comparator java 1.8 feature instead of using Collections.sort");
		System.out.println("first using title comparator");
		songsList.sort(new TitleComparator());
		songsList.forEach(System.out::println);
		System.out.println("then using lambda with title");
		songsList.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		songsList.forEach(System.out::println);
		}

}
