/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package music.music;

/**
 *
 * @author s11219885
 */
public class Music {
    public void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);  // Play the MIDDLE_C note
        instrument.play(Note.C_SHARP);   // Play the C_SHARP note
    }

    public static void main(String[] args) {
        Music music = new Music();

        // Create instances of Flute and Guitar
        Instrument flute = new Flute();
        Instrument guitar = new Guitar();

        // Tune the instruments
        music.tune(flute);
        music.tune(guitar);
    }
}