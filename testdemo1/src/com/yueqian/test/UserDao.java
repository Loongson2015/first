package com.yueqian.test;

/**
 * 用户的接口
 * @author user
 *
 */
public interface UserDao {
	
	/**
	 * 这是一个添加用户的方法
	 */
	void adduser();
	
	/**
	 * 这是修改的方法
	 */
	void update();
	
	/**
	 * admin创建的delete方法
	 */
	void delete();
	
	
	/**
	 * 李四写的查询用户的方法
	 */
	void queryUser();
	
	/**
	 * aa的方法
	 */
	void aa();
	

	/**
	 * admin最新写的edit的方法
	 */
	void editUser();

	
	
	
	/**
	 * testbranch写的findUserById方法
	 */
	void findUserById();
	
	/**
	 *根据id得到用户信息
	 * @return
	 */
	int getUserById();


	/**(
	 * 单元测试
	 */
	void fun2();
	
	//单元测试3
	void fun3();
	
	

}
