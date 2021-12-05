package org.uispec4j.interception.ui;

import org.uispec4j.interception.toolkit.Empty;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextUI;
import java.awt.*;

///CLOVER:OFF

public class UISpecTextUI extends BasicTextUI {
  public static ComponentUI createUI(JComponent component) {
    return new UISpecTextUI();
  }

  public Dimension getPreferredSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  protected String getPropertyPrefix() {
    return "";
  }

  public Dimension getMaximumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  public Dimension getMinimumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }
}
