package com.ogury.ad.internal;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public abstract class q3 {
    public static String a(o3 o3Var) {
        int i = o3Var == null ? -1 : p3.a[o3Var.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "sdk";
        }
        if (i == 2) {
            return POBConstants.KEY_FORMAT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
