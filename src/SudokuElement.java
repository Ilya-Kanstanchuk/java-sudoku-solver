public class SudokuElement {
    private String elementContent;
    private boolean isThisConstant;
    public SudokuElement(String elementContent)
    {
        this.elementContent = elementContent;
        if (elementContent.isEmpty())
        {
            isThisConstant = false;
        }
        else
        {
            isThisConstant = true;
        }
    }

    public String getElementContent() {
        return elementContent;
    }

    public void setElementContent(String elementContent) {
        this.elementContent = elementContent;
    }

    public boolean isThisConstant() {
        return isThisConstant;
    }
}
