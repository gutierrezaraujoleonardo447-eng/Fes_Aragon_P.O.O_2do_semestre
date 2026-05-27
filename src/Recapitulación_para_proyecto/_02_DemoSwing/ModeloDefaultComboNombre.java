package Recapitulación_para_proyecto._02_DemoSwing;

import javax.swing.*;
import java.util.ArrayList;

public class ModeloDefaultComboNombre extends DefaultComboBoxModel {
    public ModeloDefaultComboNombre() {
    }
    public ModeloDefaultComboNombre(ArrayList nombres) {
        super(nombres.toArray());
    }

}
