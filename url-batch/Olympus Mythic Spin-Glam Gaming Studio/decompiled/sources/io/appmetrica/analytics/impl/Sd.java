package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public abstract class Sd extends AbstractC5646rf {
    public Sd(@NotNull InterfaceC5357gb interfaceC5357gb, @Nullable String str) {
        super(interfaceC5357gb, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @Nullable
    public final String a(@NotNull String str, @Nullable String str2) {
        return this.a.getString(g(str), str2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NotNull
    public final Ol b(@NotNull String str, @Nullable String str2) {
        return d(g(str), str2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NotNull
    public Ol e(@NotNull String str) {
        return f(g(str));
    }

    @NotNull
    public abstract String g(@NotNull String str);

    public Sd(@NotNull InterfaceC5357gb interfaceC5357gb) {
        this(interfaceC5357gb, null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NotNull
    public final Ol b(@NotNull String str, int i) {
        return d(g(str), i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    public final int a(@NotNull String str, int i) {
        return this.a.getInt(g(str), i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NotNull
    public final Ol b(@NotNull String str, long j) {
        return d(g(str), j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NotNull
    public final Ol b(@NotNull String str, boolean z) {
        return d(g(str), z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    public final long a(@NotNull String str, long j) {
        return this.a.getLong(g(str), j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    public final boolean b(@NotNull String str) {
        return this.a.a(g(str));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    public final boolean a(@NotNull String str, boolean z) {
        return this.a.getBoolean(g(str), z);
    }
}
