package yads;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes5.dex */
public final class va2 implements ta2 {
    public final AdActivity a;
    public final u1 b;
    public final OnBackInvokedCallback c = new OnBackInvokedCallback() { // from class: yads.va2$$ExternalSyntheticLambda0
        public final void onBackInvoked() {
            va2.a(va2.this);
        }
    };

    public va2(AdActivity adActivity, u1 u1Var) {
        this.a = adActivity;
        this.b = u1Var;
    }

    public static final void a(va2 va2Var) {
        u1 u1Var = va2Var.b;
        if (u1Var == null || !u1Var.c.d()) {
            return;
        }
        va2Var.a.finish();
    }

    @Override // yads.ta2
    public final void destroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.c);
    }

    @Override // yads.ta2
    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.c);
    }
}
