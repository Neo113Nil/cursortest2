package io.bidmachine;

import io.bidmachine.util.DeviceType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProtobufDeviceType", "Lcom/explorestack/protobuf/adcom/DeviceType;", "Lio/bidmachine/util/DeviceType;", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class DeviceInfoKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.TABLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.PHONE_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceType.CTV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final com.explorestack.protobuf.adcom.DeviceType toProtobufDeviceType(@NotNull DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i == 1) {
            return com.explorestack.protobuf.adcom.DeviceType.DEVICE_TYPE_TABLET;
        }
        if (i == 2) {
            return com.explorestack.protobuf.adcom.DeviceType.DEVICE_TYPE_PHONE_DEVICE;
        }
        if (i == 3) {
            return com.explorestack.protobuf.adcom.DeviceType.DEVICE_TYPE_CTV;
        }
        throw new NoWhenBranchMatchedException();
    }
}
