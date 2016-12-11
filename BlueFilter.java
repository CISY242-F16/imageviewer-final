import java.awt.Color;

/**
 * An image filter that displays only the blue light in an image, while not displaying the
 * green and red light of the image
 * 
 * @author Dana Sabatino
 * @version 1.0
 */
public class BlueFilter extends Filter
{
    /**
     * Constructor for objects of class BlueFilter.
     * @param name The name of the filter.
     */
    public BlueFilter(String name)
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
                image.setPixel(x, y, new Color(0, 0, image.getPixel(x,y).getBlue()));
            }
        }
    }
}