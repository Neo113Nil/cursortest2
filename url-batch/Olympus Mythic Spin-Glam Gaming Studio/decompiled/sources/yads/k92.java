package yads;

import android.content.Context;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class k92 {
    public static final h92 d = new h92();
    public static volatile k92 e;
    public final o03 a;
    public final ok0 b;
    public final bb3 c;

    public k92(Context context) {
        int i;
        int i2;
        vw2 vw2Var;
        l21 l21Var = new l21();
        try {
            i = RangesKt.coerceAtMost(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, ((int) (((r3.widthPixels * r3.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            boolean z = ob1.a;
            i = 5120;
        }
        j92 j92Var = new j92(RangesKt.coerceAtLeast(i, 5120));
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
        bu2 a = vw2Var2.a(context);
        if (a != null && (r1 = a.w0) != null) {
            Integer num = num.intValue() == 0 ? null : num;
            if (num != null) {
                i2 = num.intValue();
                ep2 a2 = fp2.a(context, i2);
                a2.a();
                i92 i92Var = new i92(j92Var);
                this.c = new bb3(j92Var, l21Var);
                this.a = new o03(a2, i92Var, l21Var);
                this.b = new ok0(a2, context);
            }
        }
        i2 = 4;
        ep2 a22 = fp2.a(context, i2);
        a22.a();
        i92 i92Var2 = new i92(j92Var);
        this.c = new bb3(j92Var, l21Var);
        this.a = new o03(a22, i92Var2, l21Var);
        this.b = new ok0(a22, context);
    }
}
