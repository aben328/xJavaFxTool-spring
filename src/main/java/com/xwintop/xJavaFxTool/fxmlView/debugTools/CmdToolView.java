package com.xwintop.xJavaFxTool.fxmlView.debugTools;

import com.xwintop.xJavaFxTool.model.CmdToolTableBean;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/debugTools/CmdTool.fxml")
public class CmdToolView extends AbstractFxmlView {
}