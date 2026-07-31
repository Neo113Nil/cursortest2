package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetSafeguardedInitializationPolicy.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSafeguardedInitializationPolicy;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "<init>", "()V", "invoke", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    @NotNull
    public NativeConfigurationOuterClass.RequestPolicy invoke(@NotNull NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder builder = requestPolicy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        RequestPolicyKt.Dsl _create = companion._create(builder);
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = _create.getRetryPolicy();
        RequestRetryPolicyKt.Dsl.Companion companion2 = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder2 = retryPolicy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder2, "toBuilder(...)");
        RequestRetryPolicyKt.Dsl _create2 = companion2._create(builder2);
        _create2.setMaxDuration(RangesKt.coerceAtLeast(_create2.getMaxDuration(), 5000));
        _create2.setRetryWaitBase(RangesKt.coerceAtLeast(_create2.getRetryWaitBase(), 0));
        _create2.setRetryMaxInterval(RangesKt.coerceAtLeast(_create2.getRetryMaxInterval(), 0));
        _create2.setRetryScalingFactor(RangesKt.coerceAtLeast(_create2.getRetryScalingFactor(), 0.1f));
        _create2.setRetryJitterPct(RangesKt.coerceIn(_create2.getRetryJitterPct(), 0.0f, 100.0f));
        _create.setRetryPolicy(_create2._build());
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = _create.getTimeoutPolicy();
        RequestTimeoutPolicyKt.Dsl.Companion companion3 = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder3 = timeoutPolicy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder3, "toBuilder(...)");
        RequestTimeoutPolicyKt.Dsl _create3 = companion3._create(builder3);
        _create3.setConnectTimeoutMs(RangesKt.coerceAtLeast(_create3.getConnectTimeoutMs(), 1000));
        _create3.setReadTimeoutMs(RangesKt.coerceAtLeast(_create3.getReadTimeoutMs(), 1000));
        _create3.setWriteTimeoutMs(RangesKt.coerceAtLeast(_create3.getWriteTimeoutMs(), 1000));
        _create3.setOverallTimeoutMs(RangesKt.coerceAtLeast(_create3.getOverallTimeoutMs(), 1000));
        _create.setTimeoutPolicy(_create3._build());
        return _create._build();
    }
}
