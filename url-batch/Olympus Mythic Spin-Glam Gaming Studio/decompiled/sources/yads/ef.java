package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ef extends sz2 {
    @Override // yads.sz2
    public final ht1 a(jt1 jt1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        wb2 wb2Var = new wb2(byteBuffer.array(), byteBuffer.limit());
        wb2Var.c(12);
        int c = (wb2Var.c() + wb2Var.a(12)) - 4;
        wb2Var.c(44);
        wb2Var.d(wb2Var.a(12));
        wb2Var.c(16);
        ArrayList arrayList = new ArrayList();
        while (wb2Var.c() < c) {
            wb2Var.c(48);
            int a = wb2Var.a(8);
            wb2Var.c(4);
            int c2 = wb2Var.c() + wb2Var.a(12);
            String str = null;
            String str2 = null;
            while (wb2Var.c() < c2) {
                int a2 = wb2Var.a(8);
                int a3 = wb2Var.a(8);
                int c3 = wb2Var.c() + a3;
                if (a2 == 2) {
                    int a4 = wb2Var.a(16);
                    wb2Var.c(8);
                    if (a4 == 3) {
                        while (wb2Var.c() < c3) {
                            str = wb2Var.a(wb2Var.a(8), zt.a);
                            int a5 = wb2Var.a(8);
                            for (int i = 0; i < a5; i++) {
                                wb2Var.d(wb2Var.a(8));
                            }
                        }
                    }
                } else if (a2 == 21) {
                    str2 = wb2Var.a(a3, zt.a);
                }
                wb2Var.b(c3 * 8);
            }
            wb2Var.b(c2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new df(a, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ht1(arrayList);
    }
}
