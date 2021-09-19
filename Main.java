// Java program to illustrate the
// concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_joy()
	{
		System.out.println("joy");
	}
}

class two extends one {
	public void print_play() { System.out.println("play"); }
}

class three extends two {
	public void print_enjoy()
	{
		System.out.println("enjoy");
	}
}

// Drived class
public class Main {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_joy();
		g.print_play();
		g.print_enjoy();
	}
}
