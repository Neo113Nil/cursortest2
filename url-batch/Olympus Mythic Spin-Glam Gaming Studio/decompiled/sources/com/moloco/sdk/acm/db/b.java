package com.moloco.sdk.acm.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@TypeConverters
@Entity
/* loaded from: classes13.dex */
public final class b {

    @PrimaryKey
    public final long a;

    @NotNull
    public final String b;
    public final long c;

    @NotNull
    public final c d;

    @Nullable
    public final Long e;

    @NotNull
    public final List<String> f;

    public b(long j, @NotNull String name, long j2, @NotNull c eventType, @Nullable Long l, @NotNull List<String> tags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = j;
        this.b = name;
        this.c = j2;
        this.d = eventType;
        this.e = l;
        this.f = tags;
    }

    public final long a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    @NotNull
    public final c d() {
        return this.d;
    }

    @Nullable
    public final Long e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.areEqual(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f);
    }

    @NotNull
    public final List<String> f() {
        return this.f;
    }

    @Nullable
    public final Long g() {
        return this.e;
    }

    @NotNull
    public final c h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31;
        Long l = this.e;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f.hashCode();
    }

    public final long i() {
        return this.a;
    }

    @NotNull
    public final String j() {
        return this.b;
    }

    @NotNull
    public final List<String> k() {
        return this.f;
    }

    public final long l() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "EventEntity(id=" + this.a + ", name=" + this.b + ", timestamp=" + this.c + ", eventType=" + this.d + ", data=" + this.e + ", tags=" + this.f + ')';
    }

    @NotNull
    public final b a(long j, @NotNull String name, long j2, @NotNull c eventType, @Nullable Long l, @NotNull List<String> tags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new b(j, name, j2, eventType, l, tags);
    }

    public /* synthetic */ b(long j, String str, long j2, c cVar, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, cVar, (i & 16) != 0 ? null : l, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}
