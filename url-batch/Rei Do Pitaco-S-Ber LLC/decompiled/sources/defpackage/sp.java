package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sp {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((dz) this.k.get(i2)).a;
            oy oyVar = (oy) view3.getLayoutParams();
            if (view3 != view && !oyVar.a.h() && (b = (oyVar.a.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                } else {
                    i = b;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((oy) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(ty tyVar) {
        List list = this.k;
        if (list == null) {
            View d = tyVar.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((dz) this.k.get(i)).a;
            oy oyVar = (oy) view.getLayoutParams();
            if (!oyVar.a.h() && this.d == oyVar.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
