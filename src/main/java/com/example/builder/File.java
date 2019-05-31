package com.example.builder;

// Файл, будет конструироваться при помощи строителя
public class File {

    private String stdName;
    private String extension;
    private String initContent;

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setInitContent(String initContent) {
        this.initContent = initContent;
    }

    @Override
    public String toString() {
        String str = "File: \nstdName = " + stdName+ " \nextension = " + extension + " \ninitContent = " + initContent;
        return str;
    }
}
