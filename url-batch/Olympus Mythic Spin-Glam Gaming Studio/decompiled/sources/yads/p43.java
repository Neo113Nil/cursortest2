package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p43 implements ci {
    @Override // yads.ci
    public final boolean a(Object obj) {
        String str = (String) obj;
        return str.length() > 0 && !Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, str);
    }
}
