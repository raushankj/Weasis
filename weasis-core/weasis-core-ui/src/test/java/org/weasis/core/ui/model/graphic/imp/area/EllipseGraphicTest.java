package org.weasis.core.ui.model.graphic.imp.area;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.List;

import org.weasis.core.api.service.WProperties;
import org.weasis.core.ui.test.testers.GraphicTester;

public class EllipseGraphicTest extends GraphicTester<EllipseGraphic> {
    private static final String XML_0 = "/graphic/ellipse/ellipse.graphic.0.xml"; //$NON-NLS-1$
    private static final String XML_1 = "/graphic/ellipse/ellipse.graphic.1.xml"; //$NON-NLS-1$
    
    public static final String BASIC_TPL = 
        "<ellipse fill=\"%s\" showLabel=\"%s\" thickness=\"%s\" uuid=\"%s\">" //$NON-NLS-1$
      +     "<paint rgb=\"%s\"/>" //$NON-NLS-1$
      +     "<pts/>" //$NON-NLS-1$
      + "</ellipse>"; //$NON-NLS-1$
    
    public static final EllipseGraphic COMPLETE_OBJECT =  new EllipseGraphic();
    static {
        COMPLETE_OBJECT.setUuid(GRAPHIC_UUID_1);
        
        List<Point2D.Double> pts = Arrays.asList(
            new Point2D.Double(1395.5, 1210.0),
            new Point2D.Double(2094.5, 1621.0),
            new Point2D.Double(2094.5, 1210.0),
            new Point2D.Double(1395.5, 1621.0),
            new Point2D.Double(1745.0, 1210.0),
            new Point2D.Double(1745.0, 1621.0),
            new Point2D.Double(2094.5, 1415.5),
            new Point2D.Double(1395.5, 1415.5)
        );
        COMPLETE_OBJECT.setPts(pts); 
    }
    
    @Override
    public String getTemplate() {
        return BASIC_TPL;
    }

    @Override
    public Object[] getParameters() {
        return new Object[]{ 
            EllipseGraphic.DEFAULT_FILLED, 
            EllipseGraphic.DEFAULT_LABEL_VISISIBLE,
            EllipseGraphic.DEFAULT_LINE_THICKNESS,
            getGraphicUuid(), 
            WProperties.color2Hexadecimal(EllipseGraphic.DEFAULT_COLOR, true) 
        };
    }

    @Override
    public String getXmlFilePathCase0() {
        return XML_0;
    }

    @Override
    public String getXmlFilePathCase1() {
        return XML_1;
    }

    @Override
    public EllipseGraphic getExpectedDeserializeCompleteGraphic() {
        return COMPLETE_OBJECT;
    }
}
