package tilelandscape;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Tile {

	public int xPos = 0;
	public int yPos = 0;
	
        public boolean isDiscovered = false;
	
	/*
	Properties:
	1 = water;
	2 = grass;
	3 = roads;
        4 = trees;
	*/
	
	public int properties = 0;
        
        public Color locColor;
    
    
}