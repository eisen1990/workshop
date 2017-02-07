package com.eisen.mybatis;

public class Board {
	private int _number;
	private String _id;
	private String _title;
	private String _content;
	
	public int get_number() {
		return _number;
	}
	public void set_number(int _number) {
		this._number = _number;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_content() {
		return _content;
	}
	public void set_content(String _content) {
		this._content = _content;
	}
}
