package com.ogury.ad.internal;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class y3 extends Lambda implements Function0 {
    public final /* synthetic */ InterstitialActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(InterstitialActivity interstitialActivity) {
        super(0);
        this.a = interstitialActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        InterstitialActivity interstitialActivity = this.a;
        OnBackInvokedCallback onBackInvokedCallback = interstitialActivity.d;
        if (onBackInvokedCallback != null) {
            onBackInvokedDispatcher = interstitialActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            interstitialActivity.d = null;
        }
        return Unit.INSTANCE;
    }
}
