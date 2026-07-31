package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4448wh implements BillingClientStateListener {
    public final /* synthetic */ Ah a;
    public final /* synthetic */ Function1 b;

    public C4448wh(Function1 function1, Ah ah) {
        this.a = ah;
        this.b = function1;
    }

    public static final void a(Function1 function1, AbstractC4422vh abstractC4422vh) {
        function1.invoke(abstractC4422vh);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.a.getClass();
        final Function1 function1 = this.b;
        final Ah ah = this.a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.wh$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4448wh.a(Function1.this, ah);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        final AbstractC4422vh c4369th;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c4369th = C4396uh.a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            c4369th = new C4369th(debugMessage, responseCode);
        }
        final Function1 function1 = this.b;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.wh$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4448wh.a(Function1.this, c4369th);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void a(Function1 function1, Ah ah) {
        ah.getClass();
        function1.invoke(new C4369th("Billing Service Disconnected", -1));
    }
}
