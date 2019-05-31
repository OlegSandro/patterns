package com.example.builder;

// Строитель файлов
public abstract class FileBuilder {

    protected File file;

    public void createNewFile(){
        file = new File();
    }

    public File getFile(){
        return file;
    }

    public abstract void buildStdName();
    public abstract void buildExtension();
    public abstract void buildInitContent();
}
