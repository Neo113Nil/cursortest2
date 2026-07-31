package com.mobilefuse.sdk.privacy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PrivacyCenter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes.dex */
final /* synthetic */ class PrivacyCenter$isDntLimitsUserData$1 extends FunctionReferenceImpl implements Function0 {
    PrivacyCenter$isDntLimitsUserData$1(PrivacyCenter privacyCenter) {
        super(0, privacyCenter, PrivacyCenterKt.class, "dntFactory", "dntFactory(Lcom/mobilefuse/sdk/privacy/PrivacyCenter;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        return Boolean.valueOf(invoke());
    }

    public final boolean invoke() {
        return PrivacyCenterKt.dntFactory((PrivacyCenter) this.receiver);
    }
}
