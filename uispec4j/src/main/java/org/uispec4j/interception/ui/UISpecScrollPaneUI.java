package org.uispec4j.interception.ui;

import org.uispec4j.interception.toolkit.Empty;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.awt.*;

///CLOVER:OFF

public class UISpecScrollPaneUI extends BasicScrollPaneUI {
  public static ComponentUI createUI(JComponent component) {
    return new UISpecScrollPaneUI();
  }

  public void paint(Graphics g, JComponent c) {
  }

  protected void maybeUpdateLayoutState() {
  }

  public Dimension getPreferredSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  public Dimension getMaximumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  public Dimension getMinimumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }
}
