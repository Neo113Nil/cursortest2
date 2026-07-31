package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgnu implements zzgni {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgfh zzc;
    private final String zzd;
    private final String zze;
    private final zzgrh zzf;
    private final zzgnw zzg;
    private final int zzh;

    zzgnu(Context context, ExecutorService executorService, zzgei zzgeiVar, zzgfh zzgfhVar, zzgrh zzgrhVar, zzgnw zzgnwVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgfhVar;
        this.zzf = zzgrhVar;
        this.zzg = zzgnwVar;
        this.zzd = zzgeiVar.zzd();
        this.zzh = zzbel.zzb(zzgeh.zza(zzgeiVar.zzM()));
        this.zze = zzgeiVar.zzk().zzc();
    }

    private static zzggr zze(int i) {
        zzggq zzd = zzggr.zzd();
        zzd.zzd(i);
        return (zzggr) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final ListenableFuture zza() {
        int i;
        zzbdz zza = zzbea.zza();
        byte[] zza2 = zzavo.zza();
        zziei zzieiVar = zziei.zza;
        zza.zza(zziei.zzt(zza2, 0, zza2.length));
        zza.zzb(Build.VERSION.SDK_INT);
        zza.zzc(Build.MODEL);
        Context context = this.zza;
        zza.zzd(context.getPackageName());
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        zzgfh zzgfhVar = this.zzc;
        zzgrh zzgrhVar = this.zzf;
        zza.zze(i);
        zza.zzf(this.zzd);
        zza.zzg(3);
        zza.zzh(this.zzh);
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk(zzhcq.zzw(zzgfhVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgfd.zza(((zzbea) zza.zzbu()).zzaN(), true)).build().toString())), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgnu.this.zzb((zzgfg) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzgnr
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgnu.this.zzc((UnknownHostException) obj);
            }
        }, zzhdp.zza()), SocketException.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzgns
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgnu.this.zzd((SocketException) obj);
            }
        }, zzhdp.zza());
        zzgrhVar.zze(20002, zzhcqVar);
        return zzhcqVar;
    }

    final /* synthetic */ zzggr zzb(zzgfg zzgfgVar) {
        zzggr zze;
        if (zzgfgVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzavo.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String zzb = zzgfgVar.zzb();
            if (TextUtils.isEmpty(zzb)) {
                this.zzf.zzb(20004);
                zze = zze(8);
            } else {
                zzbec zzc = zzbec.zzc(zzgfd.zzb(zzb, true), zziew.zzc());
                if (zzc.zza().zzc() && zzc.zza().zza()) {
                    if (this.zzg.zza(zzc)) {
                        zzggq zzd = zzggr.zzd();
                        zzggs zzg = zzggt.zzg();
                        zzg.zzb(zzc.zza().zzb());
                        zzg.zzd(zzc.zzb());
                        zzd.zza((zzggt) zzg.zzbu());
                        zzd.zzb(zzc.zza().zzd());
                        zzd.zzd(2);
                        zze = (zzggr) zzd.zzbu();
                    } else {
                        this.zzf.zzb(20006);
                        zze = zze(12);
                    }
                }
                this.zzf.zzb(20004);
                zze = zze(8);
            }
            return zze;
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    final /* synthetic */ zzggr zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    final /* synthetic */ zzggr zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
