package yads;

/* loaded from: classes3.dex */
public final class wo0 {
    public final x73 a;
    public final int[] b;

    public wo0(int i, x73 x73Var, int[] iArr) {
        if (iArr.length == 0) {
            gh1.b("ETSDefinition", gh1.a("Empty tracks are not allowed", new IllegalArgumentException()));
        }
        this.a = x73Var;
        this.b = iArr;
    }
}
