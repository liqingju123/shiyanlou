package IOC;


public class Main {
  
    public static void  ioc(String className,Shiyanlou s,String methodName, String name){
    	Test ss ;
    	try {
			 ss =	(Test)Class.forName(className).newInstance();//反射获取实体类
			 Class[]  Interfaces =s.getClass().getInterfaces();
			 if(Interfaces.length !=1){
				 new Exception("现阶段不支持多继承");
			 }

			 Class.forName(className).getMethod(String.format("set%s", s.getClass().getSimpleName()), Interfaces[0]).invoke(ss, s); //利用setXXX方法注实现类
			 Class.forName(className).getMethod(methodName, name.getClass()).invoke(ss, name);//调用测试 正式注入成功
			 System.out.println( Class.forName(className).getMethod(methodName, name.getClass()).invoke(ss, name)); 
		} catch (Exception e) {
			e.printStackTrace();
		}	
    }
   public static void main(String[] args) {
	System.out.println(ShiyanlouImpl.class.getInterfaces()[0]);
	ioc(Test.class.getName(),new ShiyanlouImpl(),"updateString","liqingju");
}
}
