package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzfhb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfhb> CREATOR = new zzfhc();

    @Nullable
    public final Context zza;
    public final zzfgy zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfgy[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfhb(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfgy[] values = zzfgy.values();
        this.zzh = values;
        int[] zza = zzfgz.zza();
        this.zzl = zza;
        int[] zza2 = zzfha.zza();
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
    public static zzfhb zza(zzfgy zzfgyVar, Context context) {
        if (zzfgyVar == zzfgy.Rewarded) {
            return new zzfhb(context, zzfgyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfO)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfQ)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfS), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfK), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfM));
        }
        if (zzfgyVar == zzfgy.Interstitial) {
            return new zzfhb(context, zzfgyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfJ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfP)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfR)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfT), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfL), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfN));
        }
        if (zzfgyVar != zzfgy.AppOpen) {
            return null;
        }
        return new zzfhb(context, zzfgyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfW)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfY)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfZ)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfU), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfV), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfX));
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

    private zzfhb(@Nullable Context context, zzfgy zzfgyVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfgy.values();
        this.zzl = zzfgz.zza();
        this.zzm = zzfha.zza();
        this.zza = context;
        this.zzi = zzfgyVar.ordinal();
        this.zzb = zzfgyVar;
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
