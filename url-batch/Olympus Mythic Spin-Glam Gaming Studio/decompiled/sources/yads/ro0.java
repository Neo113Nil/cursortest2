package yads;

import android.content.Context;
import java.io.File;

/* loaded from: classes10.dex */
public final class ro0 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r1 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lz2 a(Context context) {
        long j;
        vw2 vw2Var;
        File a = eh0.a(context, "mobileads-video-cache");
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a2 = vw2Var2.a(context);
        if (a2 != null) {
            j = a2.c;
        }
        j = 52428800;
        return new lz2(a, new yd1(xs1.a(context, 41943040L, j)), new kn0(context));
    }
}
