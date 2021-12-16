package interfaceenum;

import java.awt.*;

public enum Season{
    WINTER(Color.WHITE),
    SPRING(Color.GREEN),
    SUMMER(Color.BLUE),
    AUTUMN(Color.YELLOW);

    public Color getColour() {
        return this.colour;
    }

    private Color colour;

    Season (Color colour)
    {this.colour=colour;}

}
