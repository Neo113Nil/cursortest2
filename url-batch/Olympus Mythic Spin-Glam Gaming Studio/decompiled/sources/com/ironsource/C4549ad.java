package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4549ad implements J7 {

    @NotNull
    private final B3 a;

    @NotNull
    private ConcurrentHashMap<String, Long> b;

    public C4549ad(@NotNull B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.J7
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.b.get(identifier);
        if (l != null) {
            return l;
        }
        Long b = this.a.b(identifier);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.J7
    public void a(long j, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Long.valueOf(j));
        this.a.a(identifier, j);
    }
}
