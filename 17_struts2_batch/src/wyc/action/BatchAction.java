package wyc.action;

import java.util.List;

import wyc.entity.User;

/**
 * 批量操作Action
 * @author Yicheng Wang
 */
public class BatchAction {
	private List<User> users;

	public String execute() {
		for (User u : users) {
			System.out.println(u);
		}
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
