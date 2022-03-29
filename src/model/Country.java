package model;

/**
 *
 * @author alexandreluisrigotti
 */
public class Country
{
    private int CountryId;
    private String nameCountry;

    
    public int getCountryId()
    {
        return CountryId;
    }

    public void setCountryId(int CountryId)
    {
        this.CountryId = CountryId;
    }

    public String getNameCountry()
    {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry)
    {
        this.nameCountry = nameCountry;
    }
}