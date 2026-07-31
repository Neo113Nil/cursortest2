package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes6.dex */
public enum WatermarkPayloadType implements Internal.EnumLite {
    WM_PAYLOAD_UNSPECIFIED(0),
    WM_PAYLOAD_BID_ID(1),
    WM_PAYLOAD_RAW_CRID(2),
    UNRECOGNIZED(-1);

    public static final int WM_PAYLOAD_BID_ID_VALUE = 1;
    public static final int WM_PAYLOAD_RAW_CRID_VALUE = 2;
    public static final int WM_PAYLOAD_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.rendering.WatermarkPayloadType.1
        public WatermarkPayloadType findValueByNumber(int i) {
            return WatermarkPayloadType.forNumber(i);
        }
    };
    private static final WatermarkPayloadType[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static WatermarkPayloadType valueOf(int i) {
        return forNumber(i);
    }

    public static WatermarkPayloadType forNumber(int i) {
        if (i == 0) {
            return WM_PAYLOAD_UNSPECIFIED;
        }
        if (i == 1) {
            return WM_PAYLOAD_BID_ID;
        }
        if (i != 2) {
            return null;
        }
        return WM_PAYLOAD_RAW_CRID;
    }

    public static Internal.EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(1);
    }

    public static WatermarkPayloadType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    WatermarkPayloadType(int i) {
        this.value = i;
    }
}
