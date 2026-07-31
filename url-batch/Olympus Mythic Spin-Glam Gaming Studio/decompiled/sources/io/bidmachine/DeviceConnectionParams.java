package io.bidmachine;

import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.utils.DeviceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lio/bidmachine/DeviceConnectionParams;", "", "()V", "build", "", "context", "Landroid/content/Context;", "deviceBuilder", "Lcom/explorestack/protobuf/adcom/Context$Device$Builder;", "connectionType", "Lcom/explorestack/protobuf/adcom/ConnectionType;", "Lio/bidmachine/protobuf/sdk/Device$Builder;", "buildConnection", "Lcom/explorestack/protobuf/adcom/Context$Device$Connection;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceConnectionParams {
    private final Context.Device.Connection buildConnection(android.content.Context context, ConnectionType connectionType) {
        Context.Device.Connection build = Context.Device.Connection.newBuilder().setType(connectionType).setVpn(DeviceUtils.getVpnStatus(context)).setProxy(DeviceUtils.getProxyStatus(context)).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …xt))\n            .build()");
        return build;
    }

    public final void build(@NotNull android.content.Context context, @NotNull Context.Device.Builder deviceBuilder, @NotNull ConnectionType connectionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceBuilder, "deviceBuilder");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        deviceBuilder.setConnection(buildConnection(context, connectionType));
    }

    public final void build(@NotNull android.content.Context context, @NotNull Device.Builder deviceBuilder, @NotNull ConnectionType connectionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceBuilder, "deviceBuilder");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        deviceBuilder.setConnection(buildConnection(context, connectionType));
    }
}
