package com.example.mvpexample;

public class InterfaceSquared {

    interface View {
        void showResult(String result);
        void showError(String error);
    }

    interface Presenter {
        void squared(String data);
        void showResult(String result);
        void showError(String error);
    }

    interface Model {
        void squared(String data);
    }
}
