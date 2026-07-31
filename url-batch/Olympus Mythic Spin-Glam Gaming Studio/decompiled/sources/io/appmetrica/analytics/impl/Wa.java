package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Wa implements HostRetryInfoProvider {
    public final C5698tf a;
    public final EnumC5567oe b;

    public Wa(@NotNull C5698tf c5698tf, @NotNull EnumC5567oe enumC5567oe) {
        this.a = c5698tf;
        this.b = enumC5567oe;
    }

    @NotNull
    public final EnumC5567oe a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.a.a(this.b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.a.a(this.b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.a.b(this.b, j);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.a.b(this.b, i);
    }
}
