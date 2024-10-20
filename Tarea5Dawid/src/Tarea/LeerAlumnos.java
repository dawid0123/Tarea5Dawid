package Tarea;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LeerAlumnos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Dime el fichero que quieres leer");
			String fichero=sc.nextLine();
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
			
			while(true) {
				try {
					Alumno alumno= (Alumno) ois.readObject();
					System.out.println(alumno);
				}catch(EOFException e) {
					break;
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			ois.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}

}
