package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfsv {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzhdj zzc;

    @Nullable
    private final zzfsw zzd;

    @Nullable
    private final zzcny zze;

    public zzfsv(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzhdj zzhdjVar, @Nullable zzfsw zzfswVar, @Nullable zzcny zzcnyVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzhdjVar;
        this.zzd = zzfswVar;
        this.zze = zzcnyVar;
    }

    private final ListenableFuture zze(final String str, final long j, final int i) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfsw zzfswVar = this.zzd;
            if (zzfswVar == null || !zzxVar.zzd()) {
                return zzhcy.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfswVar.zza(str, "", 2);
            return zzhcy.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjW)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append(X3.j.c);
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfsu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfsv.this.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzhdj zzhdjVar = this.zzc;
            return zzhcy.zzj(zzhdjVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfst
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfsv.this.zzd(str2);
                }
            }), zzhcgVar, zzhdjVar);
        }
        zzhdj zzhdjVar2 = this.zzc;
        return zzhcy.zzj(zzhdjVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfss
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfsv.this.zzc(str2);
            }
        }, j, TimeUnit.MILLISECONDS), zzhcgVar, zzhdjVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzcny zzcnyVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzko)).booleanValue() || (zzcnyVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzb.zzc(str, null);
        }
        String zzb = zzcnyVar.zzb();
        HashMap hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkp), zzb);
        }
        return this.zzb.zzc(str, hashMap);
    }

    public final ListenableFuture zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhcy.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzhcy.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    final /* synthetic */ ListenableFuture zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzhcy.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long zzb = zzxVar.zzb();
        if (i != 1) {
            zzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, zzb, i + 1);
    }
}
