package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonUniversalRequestTtlValidator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0002¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonUniversalRequestTtlValidator;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "<init>", "()V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    @Override // com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator
    public boolean invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(universalRequest, "universalRequest");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        return System.currentTimeMillis() - (universalRequest.getSharedData().getTimestamps().getTimestamp().getSeconds() * ((long) 1000)) < ((long) requestPolicy.getMaxDuration());
    }
}
