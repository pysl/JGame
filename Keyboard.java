
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Keyboard extends KeyAdapter {
    public static String key = "";
    public boolean isRunning = false;
    public Keyboard(boolean active) {
        isRunning = active;
    }


            public void keyPressed(KeyEvent event) {
                System.out.println("keyPressed");
                int keyCode = event.getKeyCode();

                if(keyCode==event.VK_A) {
                    key = "A";
                    }
                if(keyCode==event.VK_B) {
                    key = "B";
                    }
                if(keyCode==event.VK_C) {
                    key = "C";
                    }
                if(keyCode==event.VK_D) {
                    key = "D";
                    }
                if(keyCode==event.VK_E) {
                    key = "E";
                    }
                if(keyCode==event.VK_F) {
                    key = "F";
                    }
                if(keyCode==event.VK_G) {
                    key = "G";
                    }
                if(keyCode==event.VK_H) {
                    key = "H";
                    }
                if(keyCode==event.VK_I) {
                    key = "I";
                    }
                if(keyCode==event.VK_J) {
                    key = "J";
                    }
                if(keyCode==event.VK_K) {
                    key = "K";
                    }
                if(keyCode==event.VK_L) {
                    key = "L";
                    }
                if(keyCode==event.VK_M) {
                    key = "M";
                    }
                if(keyCode==event.VK_N) {
                    key = "N";
                    }
                if(keyCode==event.VK_O) {
                    key = "O";
                    }
                if(keyCode==event.VK_P) {
                    key = "P";
                    }
                if(keyCode==event.VK_Q) {
                    key = "Q";
                    }
                if(keyCode==event.VK_R) {
                    key = "R";
                    }
                if(keyCode==event.VK_S) {
                    key = "S";
                    }
                if(keyCode==event.VK_T) {
                    key = "T";
                    }
                if(keyCode==event.VK_U) {
                    key = "U";
                    }
                if(keyCode==event.VK_V) {
                    key = "V";
                    }
                if(keyCode==event.VK_W) {
                    key = "W";
                    }
                if(keyCode==event.VK_X) {
                    key = "X";
                }
                if(keyCode==event.VK_Y) {
                    key = "Y";
                }
                if(keyCode==event.VK_Z) {
                    key = "Z";
                }
                if(keyCode==event.VK_UP) {
                    key = "UP";
                }
                if(keyCode==event.VK_DOWN) {
                    key = "DOWN";

                }
                if(keyCode==event.VK_LEFT) {
                    key = "LEFT";

                }
                if(keyCode==event.VK_RIGHT) {
                    key = "RIGHT";
                }

            }
        }
    }










        public void keyReleased(KeyEvent event) {
            System.out.println("keyReleased");
            key = "";
        }
    public String getKey() {
        return key;
    }
}