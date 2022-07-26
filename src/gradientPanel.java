import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class gradientPanel extends JPanel {
	private Color startColor;
	  
    private Color endColor;

  
    public gradientPanel( Color startColor , Color endColor ) {
        super();
        this.startColor = startColor;
        this.endColor = endColor;
    }

    @Override protected void paintComponent( Graphics g ) {
        super.paintComponent( g );
        int panelHeight = getHeight();
        int panelWidth = getWidth();
        GradientPaint gradientPaint = new GradientPaint( panelWidth / 2 , panelHeight / 2 , startColor , panelWidth / 2 , panelHeight , endColor,false );
        if( g instanceof Graphics2D ) {
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.setPaint( gradientPaint );
            graphics2D.fillRect( 0 , 0 , panelWidth , panelHeight );
        }
    }
}
