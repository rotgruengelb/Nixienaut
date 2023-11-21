package net.rotgruengelb.nixienaut;

public class RGB {
    private final ClampedNum<Integer> r = new ClampedNum<>(0, 255);
    private final ClampedNum<Integer> g = new ClampedNum<>(0, 255);
    private final ClampedNum<Integer> b = new ClampedNum<>(0, 255);

    public RGB(int r, int g, int b) {
        this.r.setValue(r);
        this.g.setValue(g);
        this.b.setValue(b);
    }

    public static RGB fromInt(int color) {
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;

        return new RGB(r, g, b);
    }

    public static RGB fromHex(String hex) {
        hex = hex.replace("#", "");
        int rgbInt = Integer.parseInt(hex, 16);
        return fromInt(rgbInt);
    }

    public int toInt() {
        return (this.r() << 16) | (this.g() << 8) | this.b();
    }

    public String toString() {
        return "RGB(" + this.r() + ", " + this.g() + ", " + this.b() + ")";
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", this.r(), this.g(), this.b());
    }

    public int[] toArray() {
        return new int[]{this.r(), this.g(), this.b()};
    }

    public int r() {
        return this.r.getValue();
    }

    public int g() {
        return this.g.getValue();
    }

    public int b() {
        return this.b.getValue();
    }

    public void r(int value) {
        this.r.setValue(value);
    }

    public void g(int value) {
        this.g.setValue(value);
    }

    public void b(int value) {
        this.b.setValue(value);
    }

}