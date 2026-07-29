package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042k extends AbstractC0050m {
    public final String a;
    public final byte[] b;

    public C0042k(String url, byte[] data) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = url;
        this.b = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0042k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
        }
        C0042k c0042k = (C0042k) obj;
        if (Intrinsics.areEqual(this.a, c0042k.a)) {
            return Arrays.equals(this.b, c0042k.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DataUrl(url=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
