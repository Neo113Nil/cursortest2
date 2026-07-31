package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.rx.AdvertisingIdFlowKt;
import com.mobilefuse.sdk.rx.Flow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MfxRequestAd.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "p1", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes8.dex */
final /* synthetic */ class MfxRequestAdKt$requestMfxAd$1 extends FunctionReferenceImpl implements Function1 {
    public static final MfxRequestAdKt$requestMfxAd$1 INSTANCE = new MfxRequestAdKt$requestMfxAd$1();

    MfxRequestAdKt$requestMfxAd$1() {
        super(1, AdvertisingIdFlowKt.class, "waitForAdvertisingId", "waitForAdvertisingId(Lcom/mobilefuse/sdk/rx/Flow;)Lcom/mobilefuse/sdk/rx/Flow;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Flow<HttpPostRequest<HttpParamsPostBody>> invoke(@NotNull Flow<HttpPostRequest<HttpParamsPostBody>> p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        return AdvertisingIdFlowKt.waitForAdvertisingId(p1);
    }
}
