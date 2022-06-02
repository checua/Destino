package com.example.destino.modelos;

public class Pagina {
    private int mImageId; //ID de la imagen
    private String mText; // id del string, creamos ahora la clase ocpión
    private Opcion mOpcion1;
    private Opcion mOpcion2;

    public Pagina(int ImageId, String Text, Opcion Opcion1, Opcion Opcion2) {
        mImageId = ImageId;
        mText = Text;
        mOpcion1 = Opcion1;
        mOpcion2 = Opcion2;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int ImageId) {
        mImageId = ImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String Text) {
        mText = Text;
    }

    public Opcion getOpcion1() {
        return mOpcion1;
    }

    public void setOpcion1(Opcion Opcion1) {
        mOpcion1 = Opcion1;
    }

    public Opcion getOpcion2() {
        return mOpcion2;
    }

    public void setOpcion2(Opcion Opcion2) {
        mOpcion2 = Opcion2;
    }
}
