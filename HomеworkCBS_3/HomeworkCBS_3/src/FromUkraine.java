import java.util.Random;

class FromUkraine {
    String sml = "11111@#$tVD";

    FromUkraine() {
    }

    FromUkraine(String sml) {
        this.sml = sml;
    }

    void printFromUkraine(String myColor, int... indexSimvol) {
        System.out.println();
        int j = 0;
        switch (sml) {
            case "11111@#$tVD": {
                Random zeroOne = new Random();
                for (int i = 0; i < indexSimvol.length; i++) {
                    while (j < 65) {
                        if (indexSimvol[i] == j)
                            System.out.print((char) 27 + myColor + zeroOne.nextInt(2) + zeroOne.nextInt(2));
                        else try {
                            if (j < indexSimvol[i + 1]) {
                                System.out.print("  ");
                            } else break;
                        } catch (ArrayIndexOutOfBoundsException r) {
                        }
                        j = j + 1;
                    }
                }
                break;
            }

            default: {
                for (int i = 0; i < indexSimvol.length; i++) {
                    while (j < 65) {
                        if (indexSimvol[i] == j)
                            System.out.print((char) 27 + myColor + sml);
                        else try {
                            if (j < indexSimvol[i + 1]) {
                                System.out.print("  ");
                            } else break;
                        } catch (ArrayIndexOutOfBoundsException r) {
                        }
                        j = j + 1;
                    }
                }
            }


        }

    }
}
