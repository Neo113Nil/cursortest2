package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeud implements zzevo {
    private final Context zza;
    private final zzgcu zzb;
    private final zzffg zzc;
    private final VersionInfoParcel zzd;

    zzeud(Context context, zzgcu zzgcuVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgcuVar;
        this.zzc = zzffgVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeud.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcE)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfsb.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcR)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcF)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfsc.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        if (r8.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcN)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcS)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcH)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcG)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeue zzc() throws Exception {
        try {
            Context context = this.zza;
            boolean zzb = this.zzc.zzb();
            zzfry zzfryVar = new zzfry();
            zzfry zzfryVar2 = new zzfry();
            boolean z = true;
            if (zzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcI)).booleanValue()) {
                    return new zzeue(true);
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcO)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcN)).intValue()) {
                    zzfsc.zzi(context).zzj();
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            zzfry zzfryVar3 = zzfryVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzeue(zzfryVar, zzfryVar3, z2, z3, zzb);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "PerAppIdSignal");
            return new zzeue(this.zzc.zzb());
        }
    }
}
