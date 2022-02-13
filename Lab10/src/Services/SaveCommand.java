package Services;
import Models.*;

public class SaveCommand implements Command{

    private Section section;

    public SaveCommand(Section section)
    {
        this.section=section;
    }

    @Override
    public void execute() throws Exception {
        this.section.add((new Paragraph("new paragraph")));
        DocumentManager.getInstance().getBook().addContent(this.section);
    }
}
