package com.eisen.mybatis;

public class Member {
	private String _id;
	private String _password;
	private String _name;
	private String _group;
	private int _level;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String _password) {
		this._password = _password;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_group() {
		return _group;
	}
	public void set_group(String _group) {
		this._group = _group;
	}
	public int get_level() {
		return _level;
	}
	public void set_level(int _level) {
		this._level = _level;
	}
}
