package yads;

/* loaded from: classes9.dex */
public final class ja1 extends RuntimeException {
    public final String b;
    public final String c;

    public ja1(String str) {
        super(str);
        this.b = str;
        this.c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
