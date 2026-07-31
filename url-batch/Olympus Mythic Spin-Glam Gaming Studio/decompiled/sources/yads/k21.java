package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k21 implements ci {
    @Override // yads.ci
    public final boolean a(Object obj) {
        String str = ((q31) obj).c;
        return (str == null || str.length() <= 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, str)) ? false : true;
    }
}
