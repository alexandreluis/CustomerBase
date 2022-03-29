package controller;

import java.util.ArrayList;


/**
 *
 * @author alexandreluisrigotti
 */
public interface InterfacePerson<G>
{
    public int newId();
    public void add(G o);
    public void remove(G o);
    public ArrayList<G> getAll();
    public G getByDoc(String o);
}