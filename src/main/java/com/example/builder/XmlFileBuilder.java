package com.example.builder;

// Строитель XML-файлов
public class XmlFileBuilder extends FileBuilder {

    public void buildStdName() {
        String str = "NewXmlFile";
        file.setStdName(str);
    }

    public void buildExtension() {
        file.setExtension("xml");
    }

    public void buildInitContent() {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        file.setInitContent(str);
    }
}
