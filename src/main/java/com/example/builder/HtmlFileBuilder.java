package com.example.builder;

// Строитель HTML-файлов
public class HtmlFileBuilder extends FileBuilder {

    public void buildStdName() {
        String str = "NewHtmlFile";
        file.setStdName(str);
    }

    public void buildExtension() {
        file.setExtension("html");
    }

    public void buildInitContent() {
        String str = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n" +
                "        \"http://www.w3.org/TR/html4/loose.dtd\">";
        file.setInitContent(str);
    }
}
