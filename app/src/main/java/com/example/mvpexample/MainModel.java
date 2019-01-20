package com.example.mvpexample;

public class MainModel implements InterfaceSquared.Model {
    private InterfaceSquared.Presenter presenter;
    private double result;

    public MainModel(InterfaceSquared.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void squared(String data) {
        if (data.equals("")){
            presenter.showError("The input field is empty");
        } else {
            result = Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(result));
        }
    }
}
