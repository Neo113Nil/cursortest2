package com.my.target.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class MyTargetPrivacy {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static boolean d;

    @Nullable
    public final Boolean ccpaUserConsent;

    @Nullable
    public final Boolean iabUserConsent;
    public final boolean userAgeRestricted;

    @Nullable
    public final Boolean userConsent;

    public MyTargetPrivacy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, boolean z) {
        this.userConsent = bool;
        this.ccpaUserConsent = bool2;
        this.iabUserConsent = bool3;
        this.userAgeRestricted = z;
    }

    @NonNull
    public static MyTargetPrivacy currentPrivacy() {
        return new MyTargetPrivacy(a, b, c, d);
    }

    public static void setCcpaUserConsent(boolean z) {
        b = Boolean.valueOf(z);
    }

    public static void setIabUserConsent(boolean z) {
        c = Boolean.valueOf(z);
    }

    public static void setUserAgeRestricted(boolean z) {
        d = z;
    }

    public static void setUserConsent(boolean z) {
        a = Boolean.valueOf(z);
    }

    public boolean isConsent() {
        Boolean bool = Boolean.FALSE;
        return (bool.equals(this.userConsent) || bool.equals(this.ccpaUserConsent) || bool.equals(this.iabUserConsent)) ? false : true;
    }
}
