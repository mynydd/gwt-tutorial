package org.iddo.gwt.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UserDashboardWidget extends Composite {
    interface MyUiBinder extends UiBinder<Widget, UserDashboardWidget> {}
    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    public UserDashboardWidget() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiFactory GreetingWidget makeGreetingWidget() {
        return new GreetingWidget("How are you doing", "Dave", "Fred", "Sue");
    }
}
