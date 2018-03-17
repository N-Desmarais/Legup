package model.gameboard;

import model.rules.CaseRule;

import java.util.ArrayList;

public abstract class Board
{
    protected ArrayList<ElementData> elementData;
    protected ArrayList<ElementData> modifiedData;
    protected boolean isModifiable;
    protected CaseRule caseRule;

    /**
     * Board Constructor - creates an empty board
     */
    public Board()
    {
        this.elementData = new ArrayList<>();
        this.modifiedData = new ArrayList<>();
        this.isModifiable = true;
        this.caseRule = null;
    }

    /**
     * Gets a specific Element on the board
     *
     * @param index index of the element
     * @return ElementData at the specified index
     */
    public ElementData getElementData(int index)
    {
        return elementData.get(index);
    }

    /**
     * Sets a specific Element on the board
     *
     * @param index index of the element
     * @param element new element at the index
     */
    public void setElementData(int index, ElementData element)
    {
        elementData.set(index, element);
    }

    /**
     * Gets the number of elements on the board
     *
     * @return number of elements on the board
     */
    public int getElementCount()
    {
        return elementData.size();
    }

    /**
     * Gets the elements on the board
     *
     * @return elements on the board
     */
    public ArrayList<ElementData> getElementData()
    {
        return elementData;
    }

    /**
     * Sets the elements on the board
     *
     * @param elementData elements on the board
     */
    public void setElementData(ArrayList<ElementData> elementData)
    {
        this.elementData = elementData;
    }

    /**
     * Gets the modifiable attribute for the board
     *
     * @return true if the board is modifiable, false otherwise
     */
    public boolean isModifiable()
    {
        return isModifiable;
    }

    /**
     * Sets the modifiable attribute for the board
     *
     * @param isModifiable true if the board is modifiable, false otherwise
     */
    public void setModifiable(boolean isModifiable)
    {
        this.isModifiable = isModifiable;
    }

    /**
     * Gets whether the data of this board has been modified by the user
     *
     * @return true if the board has been modified, false otherwise
     */
    public boolean isModified()
    {
        return !modifiedData.isEmpty();
    }

    public ArrayList<ElementData> getModifiedData()
    {
        return modifiedData;
    }

    public void addModifiedData(ElementData data)
    {
        if(!modifiedData.contains(data))
        {
            modifiedData.add(data);
        }
    }

    public void removeModifiedData(ElementData data)
    {
        modifiedData.remove(data);
    }

    public CaseRule getCaseRule()
    {
        return caseRule;
    }

    public void setCaseRule(CaseRule caseRule)
    {
        this.caseRule = caseRule;
    }

    /**
     * Performs a deep copy of the Board
     *
     * @return a new copy of the board that is independent of this one
     */
    public abstract Board copy();
}
