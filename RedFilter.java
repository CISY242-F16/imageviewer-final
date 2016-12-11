import java.awt.Color;

/**
 * An image filter that displays only the current red values in the image while setting
 * the green and blue values to zero
 * 
 * @author Dana Sabatino
 * @version 1.0
 */
public class RedFilter extends Filter
{
    /**
     * Constructor for objects of class RedFilter.
     * @param name The name of the filter.
     */
    public RedFilter(String name)
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
                image.setPixel(x, y, new Color(image.getPixel(x,y).getRed(), 0, 0));
            }
        }
    }
}