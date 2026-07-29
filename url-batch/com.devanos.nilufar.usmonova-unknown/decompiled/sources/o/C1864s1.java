package o;

import android.content.Context;
import android.view.View;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864s1 extends C1746qC {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ C2128w1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864s1(C2128w1 c2128w1, Context context, MenuC0825cC menuC0825cC, View view) {
        super(context, menuC0825cC, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = c2128w1;
        this.f = 8388613;
        Y1 y1 = c2128w1.D;
        this.h = y1;
        AbstractC1614oC abstractC1614oC = this.i;
        if (abstractC1614oC != null) {
            abstractC1614oC.g(y1);
        }
    }

    @Override // o.C1746qC
    public final void c() {
        switch (this.l) {
            case 0:
                C2128w1 c2128w1 = this.m;
                c2128w1.A = null;
                c2128w1.getClass();
                super.c();
                break;
            default:
                C2128w1 c2128w12 = this.m;
                MenuC0825cC menuC0825cC = c2128w12.j;
                if (menuC0825cC != null) {
                    menuC0825cC.c(true);
                }
                c2128w12.z = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864s1(C2128w1 c2128w1, Context context, SubMenuC0909dU subMenuC0909dU, View view) {
        super(context, subMenuC0909dU, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = c2128w1;
        if ((subMenuC0909dU.A.x & 32) != 32) {
            View view2 = c2128w1.p;
            this.e = view2 == null ? (View) c2128w1.f236o : view2;
        }
        Y1 y1 = c2128w1.D;
        this.h = y1;
        AbstractC1614oC abstractC1614oC = this.i;
        if (abstractC1614oC != null) {
            abstractC1614oC.g(y1);
        }
    }
}
