package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfey> CREATOR = new zzfez();

    @Nullable
    public final Context zza;
    public final zzfev zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfev[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfey(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfev[] values = zzfev.values();
        this.zzh = values;
        int[] zza = zzfew.zza();
        this.zzl = zza;
        int[] zza2 = zzfex.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzfey zza(zzfev zzfevVar, Context context) {
        if (zzfevVar == zzfev.Rewarded) {
            return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgM)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgS)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgU)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgW), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgO), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgQ));
        }
        if (zzfevVar == zzfev.Interstitial) {
            return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgN)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgT)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgV)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgX), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgP), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgR));
        }
        if (zzfevVar != zzfev.AppOpen) {
            return null;
        }
        return new zzfey(context, zzfevVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzha)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhc)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhd)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgY), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgZ), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfey(@Nullable Context context, zzfev zzfevVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfev.values();
        this.zzl = zzfew.zza();
        this.zzm = zzfex.zza();
        this.zza = context;
        this.zzi = zzfevVar.ordinal();
        this.zzb = zzfevVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
