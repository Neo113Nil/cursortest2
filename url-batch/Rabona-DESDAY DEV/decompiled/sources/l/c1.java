package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0146a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0146a f2968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2969b;

    public c1(d1 d1Var) {
        this.f2969b = d1Var;
        Context context = d1Var.f2976a.getContext();
        CharSequence charSequence = d1Var.h;
        C0146a c0146a = new C0146a();
        c0146a.f2633e = 4096;
        c0146a.f2635g = 4096;
        c0146a.f2638l = null;
        c0146a.f2639m = null;
        c0146a.f2640n = false;
        c0146a.f2641o = false;
        c0146a.f2642p = 16;
        c0146a.i = context;
        c0146a.f2630a = charSequence;
        this.f2968a = c0146a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2969b;
        Window.Callback callback = d1Var.f2983k;
        if (callback == null || !d1Var.f2984l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2968a);
    }
}
