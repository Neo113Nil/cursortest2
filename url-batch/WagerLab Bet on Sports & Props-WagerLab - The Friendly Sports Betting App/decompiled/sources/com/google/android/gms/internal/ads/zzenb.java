package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import com.intercom.reactnative.IntercomErrorCodes;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzenb implements zzeun {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;
    public final Insets zzj;

    public zzenb(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2, Insets insets) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
        this.zzj = insets;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ad, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzof)).booleanValue() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i = zzrVar.zze;
        zzfdr.zzb(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        zzfdr.zzb(bundle, "smart_h", "auto", i2 == -2);
        zzfdr.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfdr.zzb(bundle, "rafmt", IntercomErrorCodes.IDENTIFIED_REGISTRATION, zzrVar.zzm);
        zzfdr.zzb(bundle, "rafmt", IntercomErrorCodes.SET_USER_HASH, zzrVar.zzn);
        zzfdr.zzb(bundle, "rafmt", IntercomErrorCodes.LOG_EVENT_HASH, zzrVar.zzo);
        zzfdr.zzd(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdr.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfdr.zze(bundle, "format", this.zzb);
        zzfdr.zzb(bundle, "fluid", "height", this.zzc);
        zzfdr.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfdr.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoe)).booleanValue()) {
        }
        Insets insets = this.zzj;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcuu) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcuu) obj).zzb);
    }
}
