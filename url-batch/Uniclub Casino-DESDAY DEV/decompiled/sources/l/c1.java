package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0156a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0156a f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2972b;

    public c1(d1 d1Var) {
        this.f2972b = d1Var;
        Context context = d1Var.f2979a.getContext();
        CharSequence charSequence = d1Var.h;
        C0156a c0156a = new C0156a();
        c0156a.f2636e = 4096;
        c0156a.f2638g = 4096;
        c0156a.f2641l = null;
        c0156a.f2642m = null;
        c0156a.f2643n = false;
        c0156a.f2644o = false;
        c0156a.f2645p = 16;
        c0156a.i = context;
        c0156a.f2633a = charSequence;
        this.f2971a = c0156a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2972b;
        Window.Callback callback = d1Var.f2986k;
        if (callback == null || !d1Var.f2987l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2971a);
    }
}
