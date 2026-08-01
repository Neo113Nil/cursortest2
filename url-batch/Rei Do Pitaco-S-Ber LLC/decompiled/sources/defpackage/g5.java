package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g5 extends oo {
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ WeakReference q;
    public final /* synthetic */ l5 r;

    public g5(l5 l5Var, int i, int i2, WeakReference weakReference) {
        this.r = l5Var;
        this.o = i;
        this.p = i2;
        this.q = weakReference;
    }

    @Override // defpackage.oo
    public final void C(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.o) != -1) {
            typeface = k5.a(typeface, i, (this.p & 2) != 0);
        }
        l5 l5Var = this.r;
        if (l5Var.m) {
            l5Var.l = typeface;
            TextView textView = (TextView) this.q.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = l5Var.j;
                if (isAttachedToWindow) {
                    textView.post(new h5(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.oo
    public final void B(int i) {
    }
}
