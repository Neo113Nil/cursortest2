package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class uw implements lp {
    public static final uw n = new uw();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final a k = new a(this);
    public final p1 l = new p1(11, this);
    public final uv m = new uv(this);

    public final void b() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(fp.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.lp
    public final a e() {
        return this.k;
    }
}
