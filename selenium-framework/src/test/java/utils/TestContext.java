package utils;

import java.util.Map;

public class TestContext {
	private static ThreadLocal<Map<String, String>> testData = new ThreadLocal<>();

    public static void setData(Map<String, String> data) {
        testData.set(data);
    }

    public static String getData(String key) {
        return testData.get().get(key);
    }
}
