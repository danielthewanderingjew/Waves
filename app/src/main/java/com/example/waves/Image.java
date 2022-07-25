package com.example.waves;

import java.io.Serializable;

//Image is a dataclass for each image inside ImageAdapter, should be in ui->Home->data
public class Image implements Serializable {
    public String Id;
    public String URL;

    public Image(String id, String url) {
        Id = id;
        URL = url;
    }
}
