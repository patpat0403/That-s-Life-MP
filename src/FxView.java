import javafx.application.*; // Application
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.*; // Stage
import javafx.scene.*;
import javafx.scene.control.*; // Button
import javafx.scene.shape.*;	//Scene
import javafx.scene.layout.*; //FlowPane
import javafx.geometry.*; // Pos - alignment
import javafx.scene.image.*; // Image, ImageView


import java.io.*; // fileinputstream
import javafx.scene.input.*; // mouseevent
import javafx.event.*;
import javafx.animation.*;

public class FxView extends Application
{
	private Button spinner;
	private Button increment;
	private Button decrement;
	private Button start1;
	private Button start2;
	Stage window;
	Scene scene1;
	Scene scene2;
	Scene scene3;
	Label menu;



	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Canvas canva= new Canvas(300,500);
		GraphicsContext gc = canva.getGraphicsContext2D();

		for(int i=1; i<=4;i++)
		{
			switch(i)
			{
				case 1: gc.setFill(Color.ORANGE); break;
				case 2: gc.setFill(Color.BLUE); break;
				case 3: gc.setFill(Color.GREEN);break;
				case 4: gc.setFill(Color.MAGENTA); break;
			}


			gc.fillRect(50*i,50,50,50);


		}

		Group root=new Group();


		root.getChildren().add(canva);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();


	}
}
