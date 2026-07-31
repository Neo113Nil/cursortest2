package yads;

/* loaded from: classes5.dex */
public final class dk extends Exception {
    public final int b;
    public final boolean c;
    public final jw0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dk(int i, int i2, int i3, int i4, jw0 jw0Var, boolean z, RuntimeException runtimeException) {
        super(r0.toString(), runtimeException);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        sb.append(z ? " (recoverable)" : "");
        this.b = i;
        this.c = z;
        this.d = jw0Var;
    }
}
