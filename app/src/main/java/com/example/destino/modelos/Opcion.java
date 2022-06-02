package com.example.destino.modelos;

public class Opcion {
    private String mText;
    private int mNextPage;

    public Opcion(String Text, int NextPage) {
        mText = Text;
        mNextPage = NextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String Text) {
        mText = Text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int NextPage) {
        mNextPage = NextPage;
    }
}
