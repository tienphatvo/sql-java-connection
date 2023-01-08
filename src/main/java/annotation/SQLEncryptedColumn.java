package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import constant.SQLDataType;

@Retention(RetentionPolicy.RUNTIME)
public @interface SQLEncryptedColumn {

	public SQLDataType datatype();
}