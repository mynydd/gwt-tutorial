package org.iddo.gwt.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Tutorial implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
      // add button to change font to big when clicked.
      Button btn1 = new Button("Big Text");
      btn1.addClickHandler(new ClickHandler() {
          public void onClick(ClickEvent event) {
              RootPanel.get("mytext").setStyleName("gwt-Big-Text");
          }
      });

      // add button to change font to small when clicked.
      Button Btn2 = new Button("Small Text");
      Btn2.addClickHandler(new ClickHandler() {
          public void onClick(ClickEvent event) {
              RootPanel.get("mytext").setStyleName("gwt-Small-Text");
          }
      });

      RootPanel.get("gwtGreenButton").add(btn1);
      RootPanel.get("gwtRedButton").add(Btn2);
   }
}
