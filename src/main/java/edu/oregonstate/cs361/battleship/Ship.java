package edu.oregonstate.cs361.battleship;

/**
 * Created by dudeman on 1/31/17.
 */
public class Ship {

    //          Member Variables
    private String name;
    private Point start;
    private Point end;
    private int length;
    private int health;

    //          Constructors
    public Ship() {
        setName("dummy");
        setLength(-1);
        setHealth(-1);
        start = new Point();
        end = new Point();
    }


    public Ship (String name) {

        setName(name);

        // size is based on name of ship, if unrecognized ship type the function sets size to 0
        if (name.toLowerCase().contains("aircraftcarrier")) {
            setLength(5);
            setHealth(5);

            start = new Point();
            end = new Point();
        }

        else if (name.toLowerCase().contains("battleship")) {
            setLength(4);
            setHealth(4);

            start = new Point();
            end = new Point();
        }

        else if (name.toLowerCase().contains("submarine") || name.toLowerCase().contains("cruiser")) {
            setLength(3);
            setHealth(3);

            start = new Point();
            end = new Point();
        }

        else if (name.toLowerCase().contains("destroyer")) {
            setLength(2);
            setHealth(2);

            start = new Point();
            end = new Point();
        }

        else if (name.toLowerCase().contains("clipper")) {
            setLength(3);
            setHealth(3);

            start = new Point();
            end = new Point();
        }

        else if (name.toLowerCase().contains("dinghy")) {
            setLength(1);
            setHealth(1);

            start = new Point();
            end = new Point();
        }

        else {
            setLength(0);
            setHealth(0);

            start = new Point();
            end = new Point();
        }

    }

    //          Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;               // shouldn't need to resize an existing ship, but here it is
    }

    public Point getStart() {
        return start;
    }

    public void setStart(int x, int y) {   // Setting Start and End points reqs passing x and y coordinates
        this.start = new Point(x, y);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(int x, int y) {
        this.end = new Point(x, y);
    }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

}
