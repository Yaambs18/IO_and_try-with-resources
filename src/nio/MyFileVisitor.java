package nio;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path.getName(6));
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String[] args) {
        String dirname = "C:/Users/Priyanshu Shukla/IdeaProjects/IO &  Try-with-Resources/src/nio";
        System.out.println("Directory tree starting with " + dirname + ": \n");
        try {
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }
}


