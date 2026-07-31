package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MonitoringEventRequestKt.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/MonitoringEventRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "-initializemonitoringEventRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "monitoringEventRequest", "copy", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "getMonitoringEventOrNull", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequestOrBuilder;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "monitoringEventOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonitoringEventRequestKtKt {
    @NotNull
    /* renamed from: -initializemonitoringEventRequest, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest m7495initializemonitoringEventRequest(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MonitoringEventRequestKt.Dsl.Companion companion = MonitoringEventRequestKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder newBuilder = MonitoringEventRequestOuterClass.MonitoringEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        MonitoringEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest copy(@NotNull MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(monitoringEventRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MonitoringEventRequestKt.Dsl.Companion companion = MonitoringEventRequestKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEventRequest.Builder builder = monitoringEventRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MonitoringEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(monitoringEventRequestOrBuilder, "<this>");
        if (monitoringEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return monitoringEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(monitoringEventRequestOrBuilder, "<this>");
        if (monitoringEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return monitoringEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final MonitoringEventRequestOuterClass.MonitoringEvent getMonitoringEventOrNull(@NotNull MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder monitoringEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(monitoringEventRequestOrBuilder, "<this>");
        if (monitoringEventRequestOrBuilder.hasMonitoringEvent()) {
            return monitoringEventRequestOrBuilder.getMonitoringEvent();
        }
        return null;
    }
}
