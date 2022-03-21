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
public class Language
{
    private int languageId;
    private String languageName;
    
    public Language(){}

    public Language(int languageId, String languageName)
    {
        this.languageId = languageId;
        this.languageName = languageName;
    }
}