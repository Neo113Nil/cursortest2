package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fk extends m60 implements t80, lp, x00, vk {
    public final b3 u;
    public final b3 v;
    public final Handler w;
    public final sk x;
    public final /* synthetic */ b3 y;

    public fk(b3 b3Var) {
        this.y = b3Var;
        Handler handler = new Handler();
        this.x = new sk();
        this.u = b3Var;
        this.v = b3Var;
        this.w = handler;
    }

    @Override // defpackage.m60
    public final View L(int i) {
        return this.y.findViewById(i);
    }

    @Override // defpackage.m60
    public final boolean M() {
        Window window = this.y.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.x00
    public final h3 a() {
        return this.y.i.b;
    }

    @Override // defpackage.t80
    public final s80 d() {
        return this.y.d();
    }

    @Override // defpackage.lp
    public final a e() {
        return this.y.A;
    }

    @Override // defpackage.vk
    public final void b() {
    }
}
