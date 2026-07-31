package yads;

/* loaded from: classes4.dex */
public final class xj {
    public static final xj e = new xj(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public xj(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = sb3.d(i3) ? sb3.a(i3, i2) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
