package nio;


import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
class DirList2 {
    public static void main(String[] args) throws IOException {
    String dirname = "C:\\Users\\Priyanshu Shukla\\IdeaProjects\\IO &  Try-with-Resources\\src";

    DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
        public boolean accept(Path filename) throws IOException {
            return Files.isWritable(filename);
        }
    };

    try(DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname), how))
        {
            System.out.println("Directory of " + dirname);
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.print("   ");
                System.out.println(entry.getName(1));
            }
        }
    catch(InvalidPathException e1)
        {
            System.out.println("Path Error " + e1);
        }
    catch(NotDirectoryException e2){
            System.out.println(dirname + " is not a directory.");
        }
    catch(
        IOException e)

        {
            System.out.println("I/O Error: " + e);
        }
    }
}


