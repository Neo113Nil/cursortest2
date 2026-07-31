package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class t21 implements f31 {
    public final /* synthetic */ u21 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ q31 c;

    public t21(u21 u21Var, Map map, q31 q31Var) {
        this.a = u21Var;
        this.b = map;
        this.c = q31Var;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        boolean z = ob1.a;
        u21 u21Var = this.a;
        Map map = this.b;
        if (u21Var.e.decrementAndGet() == 0) {
            u21Var.c.a(map);
        }
    }

    @Override // yads.f31
    public final void a(e31 e31Var, boolean z) {
        String str = this.c.c;
        Bitmap bitmap = e31Var.a;
        if (bitmap != null) {
            if (str != null) {
                this.b.put(str, bitmap);
                this.a.c.a(str, bitmap);
            }
            u21 u21Var = this.a;
            Map map = this.b;
            if (u21Var.e.decrementAndGet() == 0) {
                u21Var.c.a(map);
            }
        }
    }
}
