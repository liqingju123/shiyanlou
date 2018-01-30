package 实验楼;

public class StringUtils {
	
	public static boolean allIsNotNull(String... s) {
		if(s ==null||s.length ==0)
			return false;
		for (String oneS : s) {
			if (oneS == null) {
				return false;
			}

		}

		return true;
	}

	public static boolean allIsNotEmpty(String... s) {
		if(s ==null||s.length ==0)
			return false;
		for (String oneS : s) {
			if (oneS == null || "".equals(oneS)) {
				return false;
			}

		}
		return true;

	}

}
