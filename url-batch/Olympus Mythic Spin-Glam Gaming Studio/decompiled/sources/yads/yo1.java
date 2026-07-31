package yads;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class yo1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ il b;
    public final /* synthetic */ zo1 c;

    public yo1(zo1 zo1Var, View view, il ilVar) {
        this.a = view;
        this.b = ilVar;
        this.c = zo1Var;
    }

    public static final void a(zo1 zo1Var) {
        ik3 ik3Var = zo1Var.b;
        qm2 qm2Var = zo1Var.d;
        KProperty kProperty = zo1.e[0];
        ik3Var.a((ViewGroup) qm2Var.a.get(), false);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Handler handler;
        boolean z = ob1.a;
        if (!this.a.isShown()) {
            return true;
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.a();
        handler = this.c.c;
        final zo1 zo1Var = this.c;
        handler.postDelayed(new Runnable() { // from class: yads.yo1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yo1.a(zo1.this);
            }
        }, 50L);
        return true;
    }
}
