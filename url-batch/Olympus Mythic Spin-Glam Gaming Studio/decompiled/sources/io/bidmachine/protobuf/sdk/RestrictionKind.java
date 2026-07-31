package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes3.dex */
public enum RestrictionKind implements Internal.EnumLite {
    RESTRICTION_KIND_NONE(0),
    RESTRICTION_KIND_COPPA(1),
    RESTRICTION_KIND_NON_PERSONALIZED(2),
    RESTRICTION_KIND_GDPR_NO_CONSENT(3),
    RESTRICTION_KIND_CCPA_OPT_OUT(4),
    UNRECOGNIZED(-1);

    public static final int RESTRICTION_KIND_CCPA_OPT_OUT_VALUE = 4;
    public static final int RESTRICTION_KIND_COPPA_VALUE = 1;
    public static final int RESTRICTION_KIND_GDPR_NO_CONSENT_VALUE = 3;
    public static final int RESTRICTION_KIND_NONE_VALUE = 0;
    public static final int RESTRICTION_KIND_NON_PERSONALIZED_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: io.bidmachine.protobuf.sdk.RestrictionKind.1
        public RestrictionKind findValueByNumber(int i) {
            return RestrictionKind.forNumber(i);
        }
    };
    private static final RestrictionKind[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static RestrictionKind valueOf(int i) {
        return forNumber(i);
    }

    public static RestrictionKind forNumber(int i) {
        if (i == 0) {
            return RESTRICTION_KIND_NONE;
        }
        if (i == 1) {
            return RESTRICTION_KIND_COPPA;
        }
        if (i == 2) {
            return RESTRICTION_KIND_NON_PERSONALIZED;
        }
        if (i == 3) {
            return RESTRICTION_KIND_GDPR_NO_CONSENT;
        }
        if (i != 4) {
            return null;
        }
        return RESTRICTION_KIND_CCPA_OPT_OUT;
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
        return SDKContextProto.getDescriptor().getEnumTypes().get(0);
    }

    public static RestrictionKind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    RestrictionKind(int i) {
        this.value = i;
    }
}
