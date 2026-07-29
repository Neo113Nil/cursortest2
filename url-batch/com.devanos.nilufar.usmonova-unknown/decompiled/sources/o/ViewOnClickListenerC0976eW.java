package o;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* renamed from: o.eW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0976eW implements View.OnClickListener {
    public final C1667p1 h;
    public final /* synthetic */ C1108gW i;

    public ViewOnClickListenerC0976eW(C1108gW c1108gW) {
        this.i = c1108gW;
        Context context = c1108gW.a.getContext();
        CharSequence charSequence = c1108gW.h;
        C1667p1 c1667p1 = new C1667p1();
        c1667p1.e = 4096;
        c1667p1.g = 4096;
        c1667p1.l = null;
        c1667p1.m = null;
        c1667p1.n = false;
        c1667p1.f208o = false;
        c1667p1.p = 16;
        c1667p1.i = context;
        c1667p1.a = charSequence;
        this.h = c1667p1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1108gW c1108gW = this.i;
        Window.Callback callback = c1108gW.k;
        if (callback == null || !c1108gW.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.h);
    }
}
