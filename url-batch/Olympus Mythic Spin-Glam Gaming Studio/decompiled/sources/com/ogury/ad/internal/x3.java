package com.ogury.ad.internal;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class x3 extends Lambda implements Function0 {
    public final /* synthetic */ InterstitialActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(InterstitialActivity interstitialActivity) {
        super(0);
        this.a = interstitialActivity;
    }

    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        final InterstitialActivity interstitialActivity = this.a;
        interstitialActivity.d = new OnBackInvokedCallback() { // from class: com.ogury.ad.internal.x3$$ExternalSyntheticLambda0
            public final void onBackInvoked() {
                x3.a(InterstitialActivity.this);
            }
        };
        onBackInvokedDispatcher = this.a.getOnBackInvokedDispatcher();
        OnBackInvokedCallback onBackInvokedCallback = this.a.d;
        Intrinsics.checkNotNull(onBackInvokedCallback);
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo4828invoke() {
        a();
        return Unit.INSTANCE;
    }

    public static final void a(InterstitialActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        w3 w3Var = new w3(this$0);
        u3 u3Var = InterstitialActivity.e;
        this$0.a(w3Var);
    }
}
