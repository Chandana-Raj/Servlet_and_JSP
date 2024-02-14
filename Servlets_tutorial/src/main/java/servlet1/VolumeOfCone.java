package servlet1;

import java.io.Serializable;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class VolumeOfCone
 */
@SuppressWarnings("serial")
@WebServlet("/VolumeOfCone")
public class VolumeOfCone implements Serializable {
	private double radius;
	private double height;
	public VolumeOfCone() {
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public static void main(String[] args) {
		VolumeOfCone volume=new VolumeOfCone();
		volume.setHeight(20.7);
		volume.setRadius(14.0);
		System.out.println("Volume="+(1.0/3.0)*Math.PI*Math.pow(volume.getRadius(), 2)*volume.getHeight());
	}
	
}
	