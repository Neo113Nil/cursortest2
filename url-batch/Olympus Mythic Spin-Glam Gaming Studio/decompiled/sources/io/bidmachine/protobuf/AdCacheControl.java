package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes.dex */
public enum AdCacheControl implements Internal.EnumLite {
    AD_CACHE_CONTROL_DISABLED(0),
    AD_CACHE_CONTROL_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int AD_CACHE_CONTROL_DISABLED_VALUE = 0;
    public static final int AD_CACHE_CONTROL_ENABLED_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.AdCacheControl.1
        public AdCacheControl findValueByNumber(int i) {
            return AdCacheControl.forNumber(i);
        }
    };
    private static final AdCacheControl[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static AdCacheControl valueOf(int i) {
        return forNumber(i);
    }

    public static AdCacheControl forNumber(int i) {
        if (i == 0) {
            return AD_CACHE_CONTROL_DISABLED;
        }
        if (i != 1) {
            return null;
        }
        return AD_CACHE_CONTROL_ENABLED;
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
        return ExtensionsProto.getDescriptor().getEnumTypes().get(5);
    }

    public static AdCacheControl valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    AdCacheControl(int i) {
        this.value = i;
    }
}
