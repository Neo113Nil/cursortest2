package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfjm {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgpe zzc;
    private final zzfjn zzd;

    public zzfjm(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgpe zzgpeVar, zzfjn zzfjnVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgpeVar;
        this.zzd = zzfjnVar;
    }

    public final ListenableFuture zza(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }

    final /* synthetic */ ListenableFuture zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgot.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long zzb = zzxVar.zzb();
        if (i != 1) {
            zzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, zzb, i + 1);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        return this.zzb.zza(str);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        return this.zzb.zza(str);
    }

    private final ListenableFuture zze(final String str, final long j, final int i) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfjn zzfjnVar = this.zzd;
            if (zzfjnVar == null || !zzxVar.zzd()) {
                return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfjnVar.zza(str, "", 2);
            return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjp)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append("&");
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfjm.this.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzgpe zzgpeVar = this.zzc;
            return zzgot.zzj(zzgpeVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfjm.this.zzd(str2);
                }
            }), zzgobVar, zzgpeVar);
        }
        zzgpe zzgpeVar2 = this.zzc;
        return zzgot.zzj(zzgpeVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfjm.this.zzc(str2);
            }
        }, j, TimeUnit.MILLISECONDS), zzgobVar, zzgpeVar2);
    }
}
