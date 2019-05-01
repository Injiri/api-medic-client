package com.apluss.org.symptomchecker.model;

public class HealthItem
{
	/// <summary>
    /// Item ID
    /// </summary>
    public int ID;
    
    /// <summary>
    /// Item name
    /// </summary>
    public String Name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "HealthItem{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
