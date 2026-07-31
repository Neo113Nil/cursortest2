package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.MobileFuseSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetEidSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* synthetic */ class GetEidSourceKt$getEidSource$3 extends FunctionReferenceImpl implements Function0 {
    GetEidSourceKt$getEidSource$3(MobileFuseSettings mobileFuseSettings) {
        super(0, mobileFuseSettings, MobileFuseSettings.class, "getAdvertisingId", "getAdvertisingId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: invoke */
    public final String mo4828invoke() {
        return MobileFuseSettings.getAdvertisingId();
    }
}
