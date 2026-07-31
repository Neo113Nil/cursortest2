package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Lk implements ModuleRemoteConfig {
    public final SdkIdentifiers a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public Lk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = obj;
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.a;
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lk)) {
            return false;
        }
        Lk lk = (Lk) obj;
        return Intrinsics.areEqual(this.a, lk.a) && Intrinsics.areEqual(this.b, lk.b) && Intrinsics.areEqual(this.c, lk.c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.a + ", remoteConfigMetaInfo=" + this.b + ", featuresConfig=" + this.c + ')';
    }

    @NotNull
    public final Lk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new Lk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public static Lk a(Lk lk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = lk.a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = lk.b;
        }
        if ((i & 4) != 0) {
            obj = lk.c;
        }
        lk.getClass();
        return new Lk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
