package yads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class qb implements cj1 {
    public final boolean a;
    public final tg0 b;
    public final yg0 c;
    public final Context d;

    public qb(Activity activity, int i) {
        boolean z = (i & 2) == 0;
        tg0 tg0Var = new tg0();
        yg0 yg0Var = new yg0();
        this.a = z;
        this.b = tg0Var;
        this.c = yg0Var;
        this.d = activity.getApplicationContext();
    }

    @Override // yads.cj1
    public final bj1 a(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            int e = hl3.e(this.d);
            yg0 yg0Var = this.c;
            Context context = this.d;
            yg0Var.getClass();
            int a = yg0.a(context, 420.0f);
            int i3 = this.d.getResources().getConfiguration().orientation;
            if (this.b.a(this.d) != sg0.b || i3 != 1) {
                e = (int) Math.min(e, a);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(e, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z = this.a;
            int c = hl3.c(this.d);
            yg0 yg0Var2 = this.c;
            Context context2 = this.d;
            yg0Var2.getClass();
            int a2 = yg0.a(context2, 350.0f);
            if (!z) {
                c = (int) Math.min(c, a2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) Math.min(c, size2), 1073741824);
        }
        bj1 bj1Var = new bj1();
        bj1Var.b = i2;
        bj1Var.a = i;
        return bj1Var;
    }
}
