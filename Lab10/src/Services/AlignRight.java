package Services;

import Models.Context;
import Models.Paragraph;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph paragraph, Context context)
    {
        System.out.println("Align right: "+paragraph);
    }
}
