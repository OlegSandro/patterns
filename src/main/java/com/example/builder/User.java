package com.example.builder;

// Тот, кто будет использовать строителя
public class User {

    private FileBuilder fileBuilder;

    public File getFile(){
        return fileBuilder.getFile();
    }

    public void setFileBuilder(FileBuilder fileBuilder){
        this.fileBuilder = fileBuilder;
    }

    public void constructFile(){
        fileBuilder.createNewFile();
        fileBuilder.buildStdName();
        fileBuilder.buildExtension();
        fileBuilder.buildInitContent();
    }
}
