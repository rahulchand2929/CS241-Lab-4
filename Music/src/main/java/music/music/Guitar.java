/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package music.music;

/**
 *
 * @author s11219885
 */
public class Guitar extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Guitar is playing note " + n);
    }
}   