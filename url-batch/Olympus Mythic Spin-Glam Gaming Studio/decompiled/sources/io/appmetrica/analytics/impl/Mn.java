package io.appmetrica.analytics.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Mn {
    public final String a;
    public final long b;
    public final byte[] c;

    public Mn(String str, long j, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(Mn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCachePutTask");
        Mn mn = (Mn) obj;
        if (Intrinsics.areEqual(this.a, mn.a) && this.b == mn.b) {
            return Arrays.equals(this.c, mn.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TempCachePutTask(scope='" + this.a + "', timestamp=" + this.b + ", data=" + this.c + ')';
    }
}
