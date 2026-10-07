package javaFiles;

import java.io.File;
import java.io.IOException;

public class DirectoriesDemo{
    public static void main(String[] args) throws IOException {
        String dir = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/new";

        File directory = new File(dir);

        directory.mkdirs();

        File file = new File(dir+"/test.txt");
        file.createNewFile();
        System.out.println(file.exists());
    }
}

class ReadingDirectories{
    public static void main(String[] args) {
        String dir = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/";

        File file = null;
        String[] paths;

        try{
            file = new File(dir);

            paths = file.list();

            for (String path : paths){
                System.out.println(path);
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}

class DeleteDirectories{
    public static void main(String[] args) {
        String dir = "/Users/raphtech/IdeaProjects/core_java/src/javaFiles/new";

        File f = new File(dir);
        File[] listOfFiles = f.listFiles();

        assert listOfFiles != null;
        for(File file:listOfFiles){

            if(file.isFile()){
                boolean success = file.delete();
                if(success){
                    System.out.println("File deleted successfully");
                }else{
                    System.out.println("File deletion failed");
                }
            }

            file.delete();
        }
    }
}