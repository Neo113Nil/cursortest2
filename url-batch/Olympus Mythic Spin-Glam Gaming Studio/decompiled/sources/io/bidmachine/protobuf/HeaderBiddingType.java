package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes9.dex */
public enum HeaderBiddingType implements Internal.EnumLite {
    HEADER_BIDDING_TYPE_INVALID(0),
    HEADER_BIDDING_TYPE_DISABLED(-1),
    HEADER_BIDDING_TYPE_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int HEADER_BIDDING_TYPE_DISABLED_VALUE = -1;
    public static final int HEADER_BIDDING_TYPE_ENABLED_VALUE = 1;
    public static final int HEADER_BIDDING_TYPE_INVALID_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.HeaderBiddingType.1
        public HeaderBiddingType findValueByNumber(int i) {
            return HeaderBiddingType.forNumber(i);
        }
    };
    private static final HeaderBiddingType[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static HeaderBiddingType valueOf(int i) {
        return forNumber(i);
    }

    public static HeaderBiddingType forNumber(int i) {
        if (i == -1) {
            return HEADER_BIDDING_TYPE_DISABLED;
        }
        if (i == 0) {
            return HEADER_BIDDING_TYPE_INVALID;
        }
        if (i != 1) {
            return null;
        }
        return HEADER_BIDDING_TYPE_ENABLED;
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
        return ExtensionsProto.getDescriptor().getEnumTypes().get(4);
    }

    public static HeaderBiddingType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    HeaderBiddingType(int i) {
        this.value = i;
    }
}
