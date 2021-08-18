/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Cube {
    
    private int edgeLength;
    
    public Cube (int initEdgeLength){
        this.edgeLength = initEdgeLength;
    }
    
    public int volume(){
        return edgeLength * edgeLength * edgeLength;
    }
    
    public String toString(){
        return "The length of the edge is "+ edgeLength + " and the volume " + volume();
    }
}
