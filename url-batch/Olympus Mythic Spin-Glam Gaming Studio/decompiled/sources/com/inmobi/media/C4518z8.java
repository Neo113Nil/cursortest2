package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4518z8 {
    public final ArrayList a;
    public final Map b;
    public final String c;
    public final String d;
    public final boolean e;

    public C4518z8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z) {
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        this.a = omidTrackers;
        this.b = macros;
        this.c = customReferenceData;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4518z8)) {
            return false;
        }
        C4518z8 c4518z8 = (C4518z8) obj;
        return Intrinsics.areEqual(this.a, c4518z8.a) && Intrinsics.areEqual(this.b, c4518z8.b) && Intrinsics.areEqual(this.c, c4518z8.c) && Intrinsics.areEqual(this.d, c4518z8.d) && this.e == c4518z8.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.a + ", macros=" + this.b + ", customReferenceData=" + this.c + ", contentUrl=" + this.d + ", isolateVerificationScripts=" + this.e + ")";
    }
}
