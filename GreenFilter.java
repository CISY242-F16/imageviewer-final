import java.awt.Color;

/**
 * An image filter that displays only the green light of an image while not displaying
 * the red and blue light
 * 
 * @author Dana Sabatno
 * @version 1.0
 */
public class GreenFilter extends Filter
{
    /**
     * Constructor for objects of class GreenFilter.
     * @param name The name of the filter.
     */
    public GreenFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                image.setPixel(x, y, new Color(0, image.getPixel(x,y).getGreen(), 0));
            }
        }
    }
}