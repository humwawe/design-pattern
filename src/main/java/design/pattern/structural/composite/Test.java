package design.pattern.structural.composite;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent mainCourseCatalog = new CourseCatalog("Main Course", 1);
        CatalogComponent linuxCourse = new Course("Linux Course", 11);
        CatalogComponent windowsCourse = new Course("Windows Course", 11);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java Course Catalog", 2);
        CatalogComponent javaCourse1 = new Course("Java Course1", 55);
        CatalogComponent javaCourse2 = new Course("Java Course2", 66);
        CatalogComponent javaCourse3 = new Course("Java Course1", 77);
        javaCourseCatalog.add(javaCourse1);
        javaCourseCatalog.add(javaCourse2);
        javaCourseCatalog.add(javaCourse3);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();


    }
}
