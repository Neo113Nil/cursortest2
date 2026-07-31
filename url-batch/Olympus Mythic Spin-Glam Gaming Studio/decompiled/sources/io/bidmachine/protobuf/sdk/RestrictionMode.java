package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes13.dex */
public enum RestrictionMode implements Internal.EnumLite {
    RESTRICTION_MODE_STRICT(0),
    RESTRICTION_MODE_MODERATE(1),
    RESTRICTION_MODE_OPEN(2),
    UNRECOGNIZED(-1);

    public static final int RESTRICTION_MODE_MODERATE_VALUE = 1;
    public static final int RESTRICTION_MODE_OPEN_VALUE = 2;
    public static final int RESTRICTION_MODE_STRICT_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.sdk.RestrictionMode.1
        public RestrictionMode findValueByNumber(int i) {
            return RestrictionMode.forNumber(i);
        }
    };
    private static final RestrictionMode[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static RestrictionMode valueOf(int i) {
        return forNumber(i);
    }

    public static RestrictionMode forNumber(int i) {
        if (i == 0) {
            return RESTRICTION_MODE_STRICT;
        }
        if (i == 1) {
            return RESTRICTION_MODE_MODERATE;
        }
        if (i != 2) {
            return null;
        }
        return RESTRICTION_MODE_OPEN;
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
        return SDKContextProto.getDescriptor().getEnumTypes().get(1);
    }

    public static RestrictionMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    RestrictionMode(int i) {
        this.value = i;
    }
}
