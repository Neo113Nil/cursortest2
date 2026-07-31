package yads;

import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class pm3 {
    public static le3 a(hm3 hm3Var) {
        if (hm3Var instanceof em0) {
            return ke3.a((em0) hm3Var);
        }
        if (hm3Var instanceof zb2) {
            return ke3.a();
        }
        u82 u82Var = hm3Var.b;
        if (u82Var == null) {
            return ke3.a(hm3Var.getMessage());
        }
        int i = u82Var.a;
        if (i >= 500) {
            return ke3.b();
        }
        String str = ("Network Error.  Code: " + i + ".") + " Data: \n" + new String(u82Var.b, Charsets.UTF_8);
        boolean z = ob1.a;
        return ke3.b(str);
    }
}
