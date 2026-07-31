package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class We {
    public final long a;
    public final Map b;
    public final int c;
    public final String d;

    public We(long j, Map headers, int i, String str) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.a = j;
        this.b = headers;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof We)) {
            return false;
        }
        We we = (We) obj;
        return this.a == we.a && Intrinsics.areEqual(this.b, we.b) && this.c == we.c && Intrinsics.areEqual(this.d, we.d);
    }

    public final int hashCode() {
        int a = Ai.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.a + ", headers=" + this.b + ", contentLength=" + this.c + ", contentType=" + this.d + ")";
    }
}
