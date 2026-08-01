package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hk implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public hk(ik ikVar, a aVar) {
        this.h = ikVar;
        this.g = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                dk dkVar = aVar.c;
                aVar.k();
                re.f((ViewGroup) dkVar.J.getParent(), ((ik) obj).f.E()).e();
                break;
            default:
                ((ViewGroup) obj2).addView((f40) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f) {
            case 0:
                break;
            default:
                ((ViewGroup) this.g).addView((f40) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public hk(ViewGroup viewGroup, f40 f40Var) {
        this.g = viewGroup;
        this.h = f40Var;
    }

    private final void a(View view) {
    }
}
