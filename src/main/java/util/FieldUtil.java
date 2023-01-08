package util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FieldUtil {

	public static List<Field> getFields(Class<?> type) {
		List<Field> data = new ArrayList<>();
		while (type != null && type != Object.class) {
			Collections.addAll(data, type.getDeclaredFields());
			type = type.getSuperclass();
		}
		return data;
	}
}
