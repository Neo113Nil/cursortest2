package com.five_corp.ad.internal;

import android.util.Log;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes3.dex */
public final class l {
    public final m a;
    public final String b;
    public final Throwable c;

    public l(m mVar, String str, Throwable th) {
        this.a = mVar;
        this.b = str;
        this.c = th;
    }

    public final String a() {
        return "DetailedErrorCode: " + this.a.name() + ", information: " + String.valueOf(this.b) + ", exception: " + Log.getStackTraceString(this.c) + ", cause: " + POBCommonConstants.NULL_VALUE;
    }
}
