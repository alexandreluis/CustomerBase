/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alexandreluisrigotti
 */
public abstract class Person
{
    private String personName;
    private int personAge;
    private int personCPF;
    private Language language;

    
    public Person(){}
    
    public Person(String personName, int personAge, int personCPF, Language language)
    {
        this.personName = personName;
        this.personAge = personAge;
        this.personCPF = personCPF;
        this.language = language;
    }

    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    public int getPersonAge()
    {
        return personAge;
    }

    public void setPersonAge(int personAge)
    {
        this.personAge = personAge;
    }

    public int getPersonCPF()
    {
        return personCPF;
    }

    public void setPersonCPF(int personCPF)
    {
        this.personCPF = personCPF;
    }

    public Language getLanguage()
    {
        return language;
    }

    public void setLanguage(Language language)
    {
        this.language = language;
    }

    @Override
    public abstract String toString();
}