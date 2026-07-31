package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3966eb extends AbstractC3994fb {
    public final Activity a;
    public final String b;

    public C3966eb(Activity activity, String finalUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(finalUrl, "finalUrl");
        this.a = activity;
        this.b = finalUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3966eb)) {
            return false;
        }
        C3966eb c3966eb = (C3966eb) obj;
        return Intrinsics.areEqual(this.a, c3966eb.a) && Intrinsics.areEqual(this.b, c3966eb.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.a + ", finalUrl=" + this.b + ")";
    }
}
