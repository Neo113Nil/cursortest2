package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C2690Vm c2690Vm) {
        if (c2690Vm.A03().isPublicError()) {
            return new AdError(c2690Vm.A03().getErrorCode(), c2690Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
