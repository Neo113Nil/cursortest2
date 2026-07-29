package o;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class J3 {
    public static final Matrix f = new Matrix();
    public final io.flutter.embedding.engine.renderer.e a;
    public final C0208Hx b;
    public final boolean c;
    public final HashMap d = new HashMap();
    public int e;

    public J3(io.flutter.embedding.engine.renderer.e eVar, boolean z) {
        this.a = eVar;
        if (C0208Hx.k == null) {
            C0208Hx.k = new C0208Hx(7);
        }
        this.b = C0208Hx.k;
        this.c = z;
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            if (i == 5) {
                return 4;
            }
            if (i != 6) {
                if (i == 2) {
                    return 5;
                }
                if (i != 7) {
                    if (i == 3) {
                        return 0;
                    }
                    if (i != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v7 int, still in use, count: 2, list:
          (r11v7 int) from 0x00a6: IF  (r11v7 int) == (-1 int)  -> B:3:0x000d A[HIDDEN] (LINE:167)
          (r11v7 int) from 0x00ac: PHI (r11v2 int) = (r11v1 int), (r11v7 int) binds: [B:90:0x00aa, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.J3.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }
}
