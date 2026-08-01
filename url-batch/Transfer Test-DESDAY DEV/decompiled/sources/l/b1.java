package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0152a;

/* loaded from: classes.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0152a f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f2979b;

    public b1(c1 c1Var) {
        this.f2979b = c1Var;
        Context context = c1Var.f2982a.getContext();
        CharSequence charSequence = c1Var.h;
        C0152a c0152a = new C0152a();
        c0152a.f2701e = 4096;
        c0152a.f2703g = 4096;
        c0152a.f2706l = null;
        c0152a.f2707m = null;
        c0152a.f2708n = false;
        c0152a.f2709o = false;
        c0152a.f2710p = 16;
        c0152a.i = context;
        c0152a.f2698a = charSequence;
        this.f2978a = c0152a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c1 c1Var = this.f2979b;
        Window.Callback callback = c1Var.f2989k;
        if (callback == null || !c1Var.f2990l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2978a);
    }
}
