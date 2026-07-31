package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4475xh extends FunctionReferenceImpl implements Function1 {
    public C4475xh(Ah ah) {
        super(1, ah, Ah.class, "instantiateBillingClientV6", "instantiateBillingClientV6(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p0 = (Context) obj;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Ah) this.receiver).getClass();
        return Ah.a(p0);
    }
}
