package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046l extends AbstractC0050m {
    public final String a;

    public C0046l(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0046l) && Intrinsics.areEqual(this.a, ((C0046l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Normal(url=" + this.a + ')';
    }
}
