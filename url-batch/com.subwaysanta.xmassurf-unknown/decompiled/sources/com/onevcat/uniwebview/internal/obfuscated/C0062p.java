package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062p {
    public final String a;
    public final byte[] b;

    public C0062p(String str, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = str;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0062p)) {
            return false;
        }
        C0062p c0062p = (C0062p) obj;
        return Intrinsics.areEqual(this.a, c0062p.a) && Intrinsics.areEqual(this.b, c0062p.b);
    }

    public final int hashCode() {
        String str = this.a;
        return Arrays.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ParsedDataUrl(mediaType=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
