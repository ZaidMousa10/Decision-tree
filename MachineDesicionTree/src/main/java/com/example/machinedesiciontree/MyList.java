package com.example.machinedesiciontree;

import com.example.machinedesiciontree.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
	private List<Entity> list;

	public MyList() {
		this.list = new ArrayList<>();
	}

	public int getNumber_of_objects() {
		return list.size();
	}

	public void addToList(Entity entity) {
		list.add(entity);
	}

	public Entity getObject(int index) {
		return list.get(index);
	}

	public MyList subList(int fromIndex, int toIndex) {
		MyList subList = new MyList();
		subList.list.addAll(this.list.subList(fromIndex, toIndex));
		return subList;
	}

	public void shuffle() {
		Collections.shuffle(list);
	}

	public List<Entity> getList() {
		return list;
	}
}
