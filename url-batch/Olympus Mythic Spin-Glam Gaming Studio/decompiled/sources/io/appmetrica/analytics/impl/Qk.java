package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Qk implements ServiceStorageProvider {
    public final Context a;
    public final Ol b;
    public final SQLiteOpenHelper c;

    public Qk(@NotNull Context context, @NotNull Ol ol, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = context;
        this.b = ol;
        this.c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(@NotNull String str, @NotNull ProtobufStateSerializer<P> protobufStateSerializer, @NotNull ProtobufConverter<T, P> protobufConverter) {
        AbstractC5343fn.a.getClass();
        return new C5317en(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        Kn kn;
        Pk B = Ka.I.B();
        Context context = this.a;
        synchronized (B) {
            try {
                kn = B.h;
                if (kn == null) {
                    EnumC5446jn enumC5446jn = EnumC5446jn.SERVICE;
                    Jn jn = B.g;
                    if (jn == null) {
                        jn = new Jn(new Kl(B.f(context)), "temp_cache");
                        B.g = jn;
                    }
                    kn = new Kn(context, enumC5446jn, jn);
                    B.h = kn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new Vb(this.b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C5644rd(str, this.b);
    }
}
