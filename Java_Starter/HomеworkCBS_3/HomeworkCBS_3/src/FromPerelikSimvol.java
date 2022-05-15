class FromPerelikSimvol {
    String sml = "11111@#$tVD";

    FromPerelikSimvol(String sml) {
        this.sml = sml;
    }

    FromPerelikSimvol() {
    }

    void printUkraine() {
        FromUkraine obj2 = new FromUkraine(sml);
        obj2.printFromUkraine("[01;34m", 0, 4, 7, 11, 17, 18, 24, 27, 30, 33, 36, 37, 38, 43, 44, 48, 51, 54, 57, 60, 64); // "[01;34m" // blue - 01 полужирний
        obj2.printFromUkraine("[01;34m", 0, 1, 3, 4, 7, 11, 16, 19, 24, 27, 30, 32, 36, 39, 42, 45, 48, 50, 51, 54, 57, 60, 64);
        obj2.printFromUkraine("[01;34m", 0, 2, 4, 7, 11, 16, 24, 27, 30, 31, 36, 39, 42, 45, 48, 50, 51, 54, 57, 60, 64);
        obj2.printFromUkraine("[01;34m", 0, 2, 4, 7, 8, 11, 16, 25, 26, 27, 30, 36, 37, 38, 42, 43, 44, 45, 48, 49, 51, 54, 55, 56, 57, 60, 61, 64);
        obj2.printFromUkraine("[01;33m", 0, 4, 7, 9, 11, 16, 27, 30, 31, 36, 42, 45, 48, 49, 51, 54, 57, 60, 62, 64);   // "[01;34m" // blue - 01 полужирний
        obj2.printFromUkraine("[01;33m", 0, 4, 7, 9, 11, 16, 19, 27, 30, 32, 36, 42, 45, 48, 51, 54, 57, 60, 62, 64);
        obj2.printFromUkraine("[01;33m", 0, 4, 7, 8, 11, 17, 18, 25, 26, 30, 33, 36, 42, 45, 48, 51, 54, 57, 60, 61, 64);
    }
}
