package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uh0 implements o20 {
    public static final uh0 l = new uh0();
    public int d;
    public int e;
    public Handler h;
    public boolean f = true;
    public boolean g = true;
    public final q20 i = new q20(this, true);
    public final w2 j = new w2(6, this);
    public final p01 k = new p01(14, this);

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            if (this.f) {
                this.i.e(e20.ON_RESUME);
                this.f = false;
            } else {
                Handler handler = this.h;
                handler.getClass();
                handler.removeCallbacks(this.j);
            }
        }
    }

    @Override // defpackage.o20
    public final g20 getLifecycle() {
        return this.i;
    }
}
