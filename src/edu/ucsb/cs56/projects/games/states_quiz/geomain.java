package edu.ucsb.cs56.projects.games.states_quiz;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

/** Geomain sets and initializes the frame and qManager.
    @author Nina Kaufman
*/

public class geomain{

	private static GUI frame;
	private static QManager qManager;

	public static void main (String[] args){
		qManager = new QManager();		
		frame = new GUI();
		qManager.init();
	}

	public static GUI getGUI(){
		return frame;
	}

	public static QManager getQManager()
	{
		return qManager;
	}


}
