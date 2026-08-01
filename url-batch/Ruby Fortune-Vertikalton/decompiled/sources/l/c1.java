package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2963b;

    public c1(d1 d1Var) {
        this.f2963b = d1Var;
        Context context = d1Var.f2970a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2627e = 4096;
        c0145a.f2629g = 4096;
        c0145a.f2632l = null;
        c0145a.f2633m = null;
        c0145a.f2634n = false;
        c0145a.f2635o = false;
        c0145a.f2636p = 16;
        c0145a.i = context;
        c0145a.f2624a = charSequence;
        this.f2962a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2963b;
        Window.Callback callback = d1Var.f2977k;
        if (callback == null || !d1Var.f2978l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2962a);
    }
}
