package com.javayh.util.excel.annotation;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.lang.annotation.*;

/**
 * 列属性信息
 *
 *      支持Java对象数据类型：Boolean、String、Short、Integer、Long、Float、Double、Date
 *      支持Excel的Cell类型为：String
 *
 * @author Dylan Yang
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExcelField {

    /**
     * 列名称
     *
     * @return String
     */
    String name() default "";

    /**
     * 列宽 (大于0时生效; 如果不指定列宽，将会自适应调整宽度；)
     *
     * @return int
     */
    int width() default 0;

    /**
     * 列高 (大于0时生效; 如果不指定列宽，将会自适应调整宽度；)
     *
     * @return int
     */
    int height() default 0;

    /**
     * 水平对齐方式
     *
     * @return HorizontalAlignment
     */
    HorizontalAlignment align() default HorizontalAlignment.CENTER_SELECTION;

    /**
     * 时间格式化，日期类型时生效
     *
     * @return String
     */
    String dateformat() default "yyyy-MM-dd HH:mm:ss";

}
