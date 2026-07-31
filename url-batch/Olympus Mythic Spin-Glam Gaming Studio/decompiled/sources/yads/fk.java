package yads;

/* loaded from: classes5.dex */
public final class fk extends Exception {
    public final int b;
    public final boolean c;
    public final jw0 d;

    public fk(int i, jw0 jw0Var, boolean z) {
        super(gg2.a(i, "AudioTrack write failed: "));
        this.c = z;
        this.b = i;
        this.d = jw0Var;
    }
}
