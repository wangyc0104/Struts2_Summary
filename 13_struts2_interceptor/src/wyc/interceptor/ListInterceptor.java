package wyc.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 方法拦截器
 * @author Yicheng Wang
 */
@SuppressWarnings("serial")
public class ListInterceptor extends MethodFilterInterceptor {
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("方法拦截器被执行");
		return invocation.invoke();
	}
	
}
