package yads;

import kotlin.text.Charsets;

/* loaded from: classes10.dex */
public final class t43 {
    public final Object a(yp2 yp2Var) {
        byte[] bArr = yp2Var.b.a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, xz0.a(yp2Var.c));
        } catch (Exception unused) {
            return new String(bArr, Charsets.UTF_8);
        }
    }
}
