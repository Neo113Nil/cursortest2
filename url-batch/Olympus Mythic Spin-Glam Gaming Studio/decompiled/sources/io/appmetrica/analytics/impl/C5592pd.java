package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5592pd implements ModuleEventServiceHandlerReporter {
    public final String a;
    public final boolean b;
    public final E9 c;
    public final C5326f6 d;

    public C5592pd(@Nullable String str, boolean z, @NotNull E9 e9, @NotNull C5326f6 c5326f6) {
        this.a = str;
        this.b = z;
        this.c = e9;
        this.d = c5326f6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    @Nullable
    public final String getApiKey() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        C5326f6 d = C5326f6.d(this.d);
        d.d = counterReportApi.getType();
        d.e = counterReportApi.getCustomType();
        d.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d.setValueBytes(valueBytes);
        }
        d.g = counterReportApi.getBytesTruncated();
        E9 e9 = this.c;
        e9.a(d, C5470kl.a(e9.c.b(d), d.i));
    }
}
