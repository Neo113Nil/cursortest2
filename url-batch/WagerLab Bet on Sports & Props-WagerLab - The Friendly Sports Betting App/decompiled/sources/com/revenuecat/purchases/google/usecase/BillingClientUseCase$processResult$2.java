package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.BillingResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingClientUseCase.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class BillingClientUseCase$processResult$2 extends FunctionReferenceImpl implements Function1<BillingResult, Unit> {
    BillingClientUseCase$processResult$2(Object obj) {
        super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BillingResult billingResult) {
        invoke2(billingResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BillingResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BillingClientUseCase) this.receiver).forwardError(p0);
    }
}
