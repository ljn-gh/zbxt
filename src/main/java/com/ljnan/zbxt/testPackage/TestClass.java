package com.ljnan.zbxt.testPackage;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

/**
 * @author lijianan
 * @date 2020-04-13 15:31
 * @description
 */
public class TestClass {
    @Test
    public void test() {
        XSSFWorkbook xwb = null;
        try {
            xwb = new XSSFWorkbook(new FileInputStream("D:/IdeaProjects/springbootTest/src/main/java/com/example/demo/testPackage/test.xlsx"));
            Map<String, List<List<String>>> source = new HashMap<>();
            int numberOfSheets = xwb.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                List<List<String>> listlist = new ArrayList<>();
                XSSFSheet sheet = xwb.getSheetAt(i);
                int rowNum = sheet.getLastRowNum();
                for (int j = 1; j <= rowNum; j++) {
                    List<String> list = new ArrayList<>();
                    XSSFRow row = sheet.getRow(j);
                    int cellNum = row.getLastCellNum();
                    for (int k = 0; k <= cellNum; k++) {
                        try {
                            XSSFCell cell = row.getCell(k);
                            if (cell != null) {
                                System.out.println(cell.getCellType());
                                cell.setCellType(CellType.STRING);
                                if (k == 3) {

                                    System.out.println(new Date((long) cell.getNumericCellValue()));
                                }
                                list.add(cell.getStringCellValue());
                            } else {
                                list.add(null);
                            }
                            listlist.add(list);
                        } catch (IllegalStateException e) {
                            System.out.println(e.toString());
                            System.out.println("第" + (i + 1) + "页第" + (j + 1) + "行第" + (k + 1) + "列格式不正确");
                        } catch (NullPointerException e2) {
                            System.out.println(e2.toString());
                            System.out.println("第" + (i + 1) + "页第" + (j + 1) + "行第" + (k + 1) + "列为空值");
                        }
                    }
                }
                source.put("第" + (i + 1) + "个sheet", listlist);
            }
            System.out.println(source);
        } catch (FileNotFoundException e1) {
            System.out.println("未找到文件");
        } catch (IOException e2) {
            System.out.println(e2.toString());
        }
    }

    @Test
    public void sl() {
        String s = "aaaa,llll";
        String[] split = s.split(",");
        System.out.println(split);
    }

    @Test
    public void removeIf() {
        List<String> list = Arrays.asList("张三", "李四", "王五", "赵六");
        list.forEach(item -> {
            if ("王五".equals(item)) {
                item = "找到王五";
            }
        });
        System.out.println(Arrays.toString(list.toArray()));

        List<Student> students = new ArrayList<>(Arrays.asList(new Student("1", "张三"),
                new Student("2", "王五"), new Student("3", "赵六")));
        students.forEach(item -> {
            if ("1".equals(item.getXh())) {
                item.setName("找到" + item.getName());
            }
        });
        System.out.println(Arrays.toString(students.toArray()));
        students.removeIf(item -> "1".equals(item.getXh()));
        System.out.println(Arrays.toString(students.toArray()));
    }

    @Test
    public void intStream() {
        IntStream intStream = new Random().ints(0, 1).limit(20);
        System.out.println(Arrays.toString(intStream.toArray()));
    }
}

class Student {
    private String xh;
    private String name;

    public Student(String xh, String name) {
        this.xh = xh;
        this.name = name;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "xh='" + xh + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
