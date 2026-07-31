package yads;

/* loaded from: classes6.dex */
public abstract class zb3 {
    public static bc3 a(int i, String str, String str2) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return new bc3(ac3.i, str, str2);
    }
}
