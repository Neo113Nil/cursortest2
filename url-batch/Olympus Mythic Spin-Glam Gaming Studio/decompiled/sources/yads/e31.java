package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class e31 {
    public Bitmap a;
    public final f31 b;
    public final String c;
    public final /* synthetic */ g31 d;

    public e31(g31 g31Var, Bitmap bitmap, String str, f31 f31Var) {
        this.d = g31Var;
        this.a = bitmap;
        this.c = str;
        this.b = f31Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.b == null) {
            return;
        }
        d31 d31Var = (d31) this.d.c.get(this.c);
        if (d31Var != null) {
            d31Var.d.remove(this);
            if (d31Var.d.size() == 0) {
                d31Var.a.a();
                this.d.c.remove(this.c);
                return;
            }
            return;
        }
        d31 d31Var2 = (d31) this.d.d.get(this.c);
        if (d31Var2 != null) {
            d31Var2.d.remove(this);
            if (d31Var2.d.size() == 0) {
                d31Var2.a.a();
            }
            if (d31Var2.d.size() == 0) {
                this.d.d.remove(this.c);
            }
        }
    }
}
