package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzeok implements zzdom {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfld zzd;
    private final zzclm zze;
    private final zzflw zzf;
    private final zzbqk zzg;
    private final boolean zzh;
    private final zzelp zzi;
    private final zzeaj zzj;

    zzeok(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfld zzfldVar, zzclm zzclmVar, zzflw zzflwVar, boolean z, zzbqk zzbqkVar, zzelp zzelpVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfldVar;
        this.zze = zzclmVar;
        this.zzf = zzflwVar;
        this.zzg = zzbqkVar;
        this.zzh = z;
        this.zzi = zzelpVar;
        this.zzj = zzeajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // com.google.android.gms.internal.ads.zzdom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdec zzdecVar) {
        boolean z2;
        zzdmy zzdmyVar = (zzdmy) zzhcy.zzt(this.zzc);
        zzclm zzclmVar = this.zze;
        zzclmVar.zzag(true);
        boolean z3 = this.zzh;
        boolean z4 = false;
        boolean zzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        if (z3) {
            if (!this.zzg.zzd()) {
                z2 = false;
                z4 = true;
                float zze = !z4 ? this.zzg.zze() : 0.0f;
                zzfld zzfldVar = this.zzd;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfldVar.zzO, false);
                if (zzdecVar != null) {
                    zzdecVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                zzdob zzj = zzdmyVar.zzj();
                int i = zzfldVar.zzQ;
                VersionInfoParcel versionInfoParcel = this.zzb;
                String str = zzfldVar.zzB;
                zzfli zzfliVar = zzfldVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzclmVar, i, versionInfoParcel, str, zzlVar, zzfliVar.zzb, zzfliVar.zza, this.zzf.zzg, zzdecVar, !zzfldVar.zzb() ? this.zzi : null, zzclmVar.zzn()), true, this.zzj);
            }
            z4 = true;
        }
        z2 = z4;
        float zze2 = !z4 ? this.zzg.zze() : 0.0f;
        zzfld zzfldVar2 = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze2, -1, z, zzfldVar2.zzO, false);
        if (zzdecVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdob zzj2 = zzdmyVar.zzj();
        int i2 = zzfldVar2.zzQ;
        VersionInfoParcel versionInfoParcel2 = this.zzb;
        String str2 = zzfldVar2.zzB;
        zzfli zzfliVar2 = zzfldVar2.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzclmVar, i2, versionInfoParcel2, str2, zzlVar2, zzfliVar2.zzb, zzfliVar2.zza, this.zzf.zzg, zzdecVar, !zzfldVar2.zzb() ? this.zzi : null, zzclmVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    @Nullable
    public final zzfld zzb() {
        return this.zzd;
    }
}
