package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.b;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevu implements zzfdg {
    public final com.google.android.gms.ads.internal.client.zzr zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;
    public final int zzi;
    public final boolean zzj;

    @Nullable
    public final Insets zzk;

    @Nullable
    public final zzevr zzl;

    public zzevu(com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, boolean z, String str2, float f, int i, int i2, @Nullable String str3, int i3, boolean z2, @Nullable Insets insets, @Nullable zzevr zzevrVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = i3;
        this.zzj = z2;
        this.zzk = insets;
        this.zzl = zzevrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        Bundle bundle = (Bundle) obj;
        int i = zzrVar.zze;
        zzfml.zzb(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        zzfml.zzb(bundle, "smart_h", "auto", i2 == -2);
        zzfml.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfml.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfml.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        zzfml.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfml.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfml.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfml.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfml.zze(bundle, POBConstants.KEY_FORMAT, this.zzb);
        zzfml.zzb(bundle, "fluid", "height", this.zzc);
        zzfml.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(b.JSON_KEY_SH, this.zzg);
        String str = this.zzh;
        zzfml.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i3 = this.zzi;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        zzevr zzevrVar = this.zzl;
        if (zzevrVar != null) {
            bundle.putInt("rc_tl", zzevrVar.zza);
            bundle.putInt("rc_tr", zzevrVar.zzb);
            bundle.putInt("rc_bl", zzevrVar.zzc);
            bundle.putInt("rc_br", zzevrVar.zzd);
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
}
