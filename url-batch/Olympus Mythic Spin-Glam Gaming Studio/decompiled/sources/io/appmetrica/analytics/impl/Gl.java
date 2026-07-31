package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes10.dex */
public final class Gl implements FunctionWithThrowable {
    public final /* synthetic */ Hl a;

    public Gl(Hl hl) {
        this.a = hl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        Hl hl = this.a;
        if (hl.b.hasPermission(hl.a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
