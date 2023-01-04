package CLONE;

/**
 *
 * @author CLONE
 */
public class Lingkaran {
    private float r;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double getLuasLingkaran() {
        double luaslingkaran;
        luaslingkaran = 3.14 * r * r;
        return luaslingkaran;
    }

    public double getKelilingligkaran() {
        double kelilinglingkaran;
        kelilinglingkaran = 2 * 3.14 * r;
        return kelilinglingkaran;
    }
}
