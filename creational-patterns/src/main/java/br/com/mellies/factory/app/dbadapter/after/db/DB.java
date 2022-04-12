package br.com.mellies.factory.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
