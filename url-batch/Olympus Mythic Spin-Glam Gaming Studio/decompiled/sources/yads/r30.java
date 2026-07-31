package yads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class r30 extends IOException {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public r30(int i) {
        this.b = i;
    }

    public r30(Exception exc, int i) {
        super(exc);
        this.b = i;
    }

    public r30(String str, Exception exc, int i) {
        super(str, exc);
        this.b = i;
    }
}
