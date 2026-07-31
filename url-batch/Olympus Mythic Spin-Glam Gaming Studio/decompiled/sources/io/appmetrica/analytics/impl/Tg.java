package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class Tg implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public Tg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tg)) {
            return false;
        }
        Tg tg = (Tg) obj;
        return this.a == tg.a && this.b == tg.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.a + ", lastUpdateTime=" + this.b + ')';
    }

    @NotNull
    public final Tg a(long j, long j2) {
        return new Tg(j, j2);
    }

    public static Tg a(Tg tg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tg.a;
        }
        if ((i & 2) != 0) {
            j2 = tg.b;
        }
        tg.getClass();
        return new Tg(j, j2);
    }
}
