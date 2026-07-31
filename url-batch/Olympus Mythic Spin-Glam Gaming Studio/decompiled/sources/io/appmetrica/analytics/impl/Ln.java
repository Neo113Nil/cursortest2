package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Ln implements TempCacheStorage.Entry {
    public final long a;
    public final String b;
    public final long c;
    public final byte[] d;

    public Ln(long j, @NotNull String str, long j2, @NotNull byte[] bArr) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(Ln.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        Ln ln = (Ln) obj;
        if (this.a == ln.a && Intrinsics.areEqual(this.b, ln.b) && this.c == ln.c) {
            return Arrays.equals(this.d, ln.d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.a + ", scope='" + this.b + "', timestamp=" + this.c + ", data=array[" + this.d.length + "])";
    }
}
