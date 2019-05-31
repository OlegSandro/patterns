package com.example.builder;

// Строитель JSP-файлов
public class JspFileBuilder extends FileBuilder {

    public void buildStdName() {
        String str = "NewJspFile";
        file.setStdName(str);
    }

    public void buildExtension() {
        file.setExtension("jsp");
    }

    public void buildInitContent() {
        String str = "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>";
        file.setInitContent(str);
    }
}
