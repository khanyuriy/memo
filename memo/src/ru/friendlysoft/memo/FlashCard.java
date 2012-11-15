package ru.friendlysoft.memo;

public class FlashCard {
	private String front;
	private String back;
	private long id;
	
	public String getFront() {
		return front;
	}
	
	public void setFront(String front) {
		this.front = front;
	}
	
	public String getBack() {
		return back;
	}
	
	public void setBack(String back) {
		this.back = back;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
