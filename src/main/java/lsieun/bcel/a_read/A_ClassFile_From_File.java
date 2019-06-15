package lsieun.bcel.a_read;

import java.io.File;
import java.io.IOException;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;

public class A_ClassFile_From_File {
    public static void main(String[] args) throws IOException {
        String fqcn = "lsieun.sample.HelloWorld";
        String dir = A_ClassFile_From_File.class.getClassLoader().getResource("").getPath();
        String filename =  dir + fqcn.replace('.', File.separatorChar) + ".class";
        System.out.println("file://" + filename);

        ClassParser classParser = new ClassParser(filename);
        JavaClass javaClass = classParser.parse();

        Class2HTML class2HTML = new Class2HTML(javaClass, dir);
        System.out.println("Done.");
    }
}
