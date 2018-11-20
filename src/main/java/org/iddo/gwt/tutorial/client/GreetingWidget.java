package org.iddo.gwt.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class GreetingWidget extends Composite {
    interface MyUiBinder extends UiBinder<Widget, GreetingWidget> {}
    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    ListBox nameSelector;

    @UiField
    Label greeting;

    public GreetingWidget(String greetingText, String... names) {
        // sets nameSelector
        initWidget(uiBinder.createAndBindUi(this));
        greeting.setText(greetingText);
        for (String name : names) {
            nameSelector.addItem(name);
        }
    }
}
