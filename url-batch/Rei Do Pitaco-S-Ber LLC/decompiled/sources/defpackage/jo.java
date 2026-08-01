package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jo extends qd {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public jo(View view) {
        this.b = view;
    }

    @Override // defpackage.qd
    public final void a(ja0 ja0Var) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.qd
    public final void b(ja0 ja0Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.qd
    public final db0 c(db0 db0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((ja0) it.next()).a.d() & 8) != 0) {
                this.b.setTranslationY(y2.c(this.d, 0, r0.a.c()));
                break;
            }
        }
        return db0Var;
    }

    @Override // defpackage.qd
    public final o4 d(ja0 ja0Var, o4 o4Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return o4Var;
    }
}
