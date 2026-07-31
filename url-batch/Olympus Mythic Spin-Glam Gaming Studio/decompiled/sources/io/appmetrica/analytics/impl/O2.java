package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class O2 implements ExternalAttribution {
    public final V9 a;

    public O2(@NotNull V9 v9) {
        this.a = v9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + AbstractC5330fa.a(this.a.a) + "`value=`" + new String(this.a.b, Charsets.UTF_8) + "`)";
    }
}
