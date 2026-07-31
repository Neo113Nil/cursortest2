package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgcf implements zzinw {
    private final zziof zza;

    private zzgcf(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzgcf zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgcf(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcoi) this.zza).zza();
        zzgcj coroutineScopeProvider = zzcom.zzc();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        DataStore create$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, zzgcd.zza, null, null, coroutineScopeProvider.zza(), new Function0() { // from class: com.google.android.gms.internal.ads.zzgce
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final /* synthetic */ Object mo4828invoke() {
                return DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zzioe.zzb(create$default);
        return create$default;
    }
}
