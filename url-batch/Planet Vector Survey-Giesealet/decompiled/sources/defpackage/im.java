package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class im extends c11 {
    public final /* synthetic */ jm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar) {
        super(1);
        this.f = jmVar;
    }

    @Override // defpackage.c11
    public final d21 d(d21 d21Var, List list) {
        jm jmVar = this.f;
        if (!jmVar.o) {
            View childAt = jmVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, jmVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, jmVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return d21Var.a.m(max, max2, max3, max4);
            }
        }
        return d21Var;
    }

    @Override // defpackage.c11
    public final j3 e(l11 l11Var, j3 j3Var) {
        jm jmVar = this.f;
        if (!jmVar.o) {
            View childAt = jmVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, jmVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, jmVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                oy c = oy.c(max, max2, max3, max4);
                int i = c.a;
                oy oyVar = (oy) j3Var.e;
                int i2 = c.b;
                int i3 = c.c;
                int i4 = c.d;
                return new j3(17, d21.a(oyVar, i, i2, i3, i4), d21.a((oy) j3Var.f, i, i2, i3, i4));
            }
        }
        return j3Var;
    }
}
