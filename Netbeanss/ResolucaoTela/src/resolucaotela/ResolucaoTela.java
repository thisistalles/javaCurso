package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Gtalles
 */
public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("Sua tela tem resolução: " +d.width + "x" + d.height);
    }
    
}
