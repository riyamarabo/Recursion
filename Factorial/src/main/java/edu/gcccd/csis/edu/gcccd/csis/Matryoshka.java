package edu.gcccd.csis.edu.gcccd.csis;

    import java.util.*;

    public class Matryoshka {

        private final int value;
        private final Matryoshka smallerDoll;

        public Matryoshka(final Matryoshka smallerDoll) {
            this.smallerDoll = smallerDoll;
            this.value = smallerDoll==null ? 1 : 2 * smallerDoll.value;	  //1,2,4,8,16,32,..
        }

        @Override
        public String toString() {
            return String.format("The value of this Matryoshka is %d", value);
        }

        public static void main(String[] args) {
            final int k = new Random().nextInt(10);
            Matryoshka m =  null;
            for (int i = 0; i<k; i++) {
                m = new Matryoshka(m);
            }
            System.out.format("%d dolls created. %s\n", k, m);
        }
    }

