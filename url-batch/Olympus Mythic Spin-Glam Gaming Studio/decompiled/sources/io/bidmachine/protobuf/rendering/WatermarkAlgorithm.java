package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes14.dex */
public enum WatermarkAlgorithm implements Internal.EnumLite {
    WM_ALGO_UNSPECIFIED(0),
    WM_ALGO_RGB_STRIP(1),
    UNRECOGNIZED(-1);

    public static final int WM_ALGO_RGB_STRIP_VALUE = 1;
    public static final int WM_ALGO_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.rendering.WatermarkAlgorithm.1
        public WatermarkAlgorithm findValueByNumber(int i) {
            return WatermarkAlgorithm.forNumber(i);
        }
    };
    private static final WatermarkAlgorithm[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static WatermarkAlgorithm valueOf(int i) {
        return forNumber(i);
    }

    public static WatermarkAlgorithm forNumber(int i) {
        if (i == 0) {
            return WM_ALGO_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return WM_ALGO_RGB_STRIP;
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
        return RenderingProto.getDescriptor().getEnumTypes().get(0);
    }

    public static WatermarkAlgorithm valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    WatermarkAlgorithm(int i) {
        this.value = i;
    }
}
