package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4074ib {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final InlineParams e;

    public C4074ib(boolean z, String landingScheme, boolean z2, boolean z3, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.a = z;
        this.b = landingScheme;
        this.c = z2;
        this.d = z3;
        this.e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4074ib)) {
            return false;
        }
        C4074ib c4074ib = (C4074ib) obj;
        return this.a == c4074ib.a && Intrinsics.areEqual(this.b, c4074ib.b) && this.c == c4074ib.c && this.d == c4074ib.d && Intrinsics.areEqual(this.e, c4074ib.e);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.e;
        return hashCode + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.a + ", landingScheme=" + this.b + ", isCCTEnabled=" + this.c + ", isPartialTabsEnabled=" + this.d + ", inlineParams=" + this.e + ")";
    }

    public /* synthetic */ C4074ib(boolean z, String str, boolean z2, int i) {
        this(z, (i & 2) != 0 ? "DEFAULT" : str, z2, false, null);
    }
}
