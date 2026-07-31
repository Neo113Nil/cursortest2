package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public final class zv1 extends uz2 {
    public final xb2 m = new xb2();

    @Override // yads.uz2
    public final c53 a(byte[] bArr, int i, boolean z) {
        s20 a;
        xb2 xb2Var = this.m;
        xb2Var.a = bArr;
        xb2Var.c = i;
        xb2Var.b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            xb2 xb2Var2 = this.m;
            int i2 = xb2Var2.c - xb2Var2.b;
            if (i2 <= 0) {
                return new aw1(arrayList);
            }
            if (i2 < 8) {
                throw new e53("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int a2 = xb2Var2.a();
            if (this.m.a() == 1987343459) {
                xb2 xb2Var3 = this.m;
                int i3 = a2 - 8;
                CharSequence charSequence = null;
                r20 r20Var = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new e53("Incomplete vtt cue box header found.");
                    }
                    int a3 = xb2Var3.a();
                    int a4 = xb2Var3.a();
                    int i4 = a3 - 8;
                    String a5 = sb3.a(xb2Var3.a, xb2Var3.b, i4);
                    xb2Var3.e(xb2Var3.b + i4);
                    i3 = (i3 - 8) - i4;
                    if (a4 == 1937011815) {
                        qo3 qo3Var = new qo3();
                        ro3.a(a5, qo3Var);
                        r20Var = qo3Var.a();
                    } else if (a4 == 1885436268) {
                        charSequence = ro3.a(null, a5.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (r20Var != null) {
                    r20Var.a = charSequence;
                    a = r20Var.a();
                } else {
                    Pattern pattern = ro3.a;
                    qo3 qo3Var2 = new qo3();
                    qo3Var2.c = charSequence;
                    a = qo3Var2.a().a();
                }
                arrayList.add(a);
            } else {
                xb2 xb2Var4 = this.m;
                xb2Var4.e(xb2Var4.b + (a2 - 8));
            }
        }
    }
}
