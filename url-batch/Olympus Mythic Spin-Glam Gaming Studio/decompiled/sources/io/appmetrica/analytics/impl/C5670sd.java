package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5670sd implements JsonParser, Converter {
    public final RemoteConfigExtensionConfiguration a;
    public final /* synthetic */ JsonParser b;
    public final /* synthetic */ Converter c;

    public C5670sd(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.a = remoteConfigExtensionConfiguration;
        this.b = remoteConfigExtensionConfiguration.getJsonParser();
        this.c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    public final byte[] a(@NotNull Object obj) {
        return (byte[]) this.c.fromModel(obj);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.c.toModel((byte[]) obj);
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] bArr) {
        return this.c.toModel(bArr);
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.a;
    }
}
