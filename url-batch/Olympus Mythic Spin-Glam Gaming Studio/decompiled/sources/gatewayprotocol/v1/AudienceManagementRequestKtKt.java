package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementRequestKt;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AudienceManagementRequestKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "-initializeaudienceManagementRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "audienceManagementRequest", "copy", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AudienceManagementRequestKtKt {
    @NotNull
    /* renamed from: -initializeaudienceManagementRequest, reason: not valid java name */
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest m7459initializeaudienceManagementRequest(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder newBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AudienceManagementRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(@NotNull AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(audienceManagementRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder = audienceManagementRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AudienceManagementRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }
}
