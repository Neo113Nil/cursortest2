package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0146a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0146a f2946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2947b;

    public c1(d1 d1Var) {
        this.f2947b = d1Var;
        Context context = d1Var.f2954a.getContext();
        CharSequence charSequence = d1Var.h;
        C0146a c0146a = new C0146a();
        c0146a.f2611e = 4096;
        c0146a.f2613g = 4096;
        c0146a.f2616l = null;
        c0146a.f2617m = null;
        c0146a.f2618n = false;
        c0146a.f2619o = false;
        c0146a.f2620p = 16;
        c0146a.i = context;
        c0146a.f2608a = charSequence;
        this.f2946a = c0146a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2947b;
        Window.Callback callback = d1Var.f2961k;
        if (callback == null || !d1Var.f2962l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2946a);
    }
}
