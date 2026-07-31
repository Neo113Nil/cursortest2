package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class g31 {
    public final ep2 a;
    public final i92 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final Handler e = new Handler(Looper.getMainLooper());
    public c31 f;

    public g31(ep2 ep2Var, i92 i92Var) {
        this.a = ep2Var;
        this.b = i92Var;
    }

    public final e31 a(String str, f31 f31Var, int i, int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((o03) this).g.getClass();
        String a = l21.a(str, scaleType);
        Bitmap a2 = this.b.a(a);
        if (a2 != null) {
            e31 e31Var = new e31(this, a2, null, null);
            f31Var.a(e31Var, true);
            return e31Var;
        }
        e31 e31Var2 = new e31(this, null, a, f31Var);
        f31Var.a(e31Var2, true);
        d31 d31Var = (d31) this.c.get(a);
        if (d31Var == null) {
            d31Var = (d31) this.d.get(a);
        }
        if (d31Var != null) {
            d31Var.d.add(e31Var2);
        } else {
            k31 k31Var = new k31(str, new a31(this, a), i, i2, scaleType, Bitmap.Config.RGB_565, new b31(this, a));
            this.a.a(k31Var);
            this.c.put(a, new d31(k31Var, e31Var2));
        }
        return e31Var2;
    }
}
