/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Angga
 */
public class Cobalah {
public static void main(String[] args) {
Line coba = new Line(2.5,3,4,5);
Line a = new Line(3,4,5,6);
coba.getLength();
coba.isGreater(coba, a);
System.out.println(coba.isGreater(coba, a));
}
}

