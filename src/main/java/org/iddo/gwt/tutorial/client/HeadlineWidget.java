package org.iddo.gwt.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class HeadlineWidget extends Composite {
    interface MyUiBinder extends UiBinder<Widget, HeadlineWidget> {}
    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    HTML headline;

    public HeadlineWidget() {
        initWidget(uiBinder.createAndBindUi(this));
        headline.setHTML("some headline");
    }
}
