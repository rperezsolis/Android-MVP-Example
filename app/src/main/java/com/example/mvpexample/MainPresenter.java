package com.example.mvpexample;

public class MainPresenter implements InterfaceSquared.Presenter {
    private InterfaceSquared.View view;
    private InterfaceSquared.Model model;

    public MainPresenter(InterfaceSquared.View view){
        this.view = view;
        model = new MainModel(this);
    }

    @Override
    public void squared(String data) {
        if (view!=null){
            model.squared(data);
        }
    }

    @Override
    public void showResult(String result) {
        if (view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void showError(String error) {
        if (view!=null){
            view.showError(error);
        }
    }
}
