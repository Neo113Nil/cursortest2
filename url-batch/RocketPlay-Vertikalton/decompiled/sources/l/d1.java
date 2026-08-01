package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0190a;

/* loaded from: classes.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0190a f3412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f3413b;

    public d1(e1 e1Var) {
        this.f3413b = e1Var;
        Context context = e1Var.f3414a.getContext();
        CharSequence charSequence = e1Var.h;
        C0190a c0190a = new C0190a();
        c0190a.f3132e = 4096;
        c0190a.f3134g = 4096;
        c0190a.f3137l = null;
        c0190a.f3138m = null;
        c0190a.f3139n = false;
        c0190a.f3140o = false;
        c0190a.f3141p = 16;
        c0190a.i = context;
        c0190a.f3129a = charSequence;
        this.f3412a = c0190a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e1 e1Var = this.f3413b;
        Window.Callback callback = e1Var.f3421k;
        if (callback == null || !e1Var.f3422l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3412a);
    }
}
