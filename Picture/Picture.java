
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Square door2;
    private Square trunk;
    private Triangle tree;
    private Square grass;
    private Circle knob;
    
    
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw();// nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("red");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        window.changeSize(20);
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        window2.changeSize(20);
        
        
        

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(65);
        sun.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.makeVisible();
        door.changeSize(20);
        door.moveHorizontal(40);
        door.moveVertical(140);
        
        
        
        
        door2 = new Square();
        door2.changeColor("black");
        door2.makeVisible();
        door2.changeSize(20);
        door2.moveHorizontal(40);
        door2.moveVertical(160);
        
        knob = new Circle();
        knob.changeColor("white");
        knob.makeVisible();
        knob.changeSize(5);
        knob.moveHorizontal(91);
        knob.moveVertical(142);
        
        
        grass = new Square();
        grass.changeColor("green");
        grass.makeVisible();
        grass.changeSize(6000);
        grass.moveHorizontal(-60);
        grass.moveVertical(172);
       
        trunk = new Square();
        trunk.changeColor("black");
        trunk.makeVisible();
        trunk.changeSize(15);
        trunk.moveHorizontal(160);
        trunk.moveVertical(165);
        
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.changeSize(70,30);
        tree.moveHorizontal(177);
        tree.moveVertical(130);
        
        
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
