package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzffx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffx> CREATOR = new zzffy();

    @Nullable
    public final Context zza;
    public final zzffu zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzffu[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzffx(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzffu[] values = zzffu.values();
        this.zzh = values;
        int[] zza = zzffv.zza();
        this.zzl = zza;
        int[] zza2 = zzffw.zza();
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
    public static zzffx zza(zzffu zzffuVar, Context context) {
        if (zzffuVar == zzffu.Rewarded) {
            return new zzffx(context, zzffuVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfE)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfG), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfy), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfA));
        }
        if (zzffuVar == zzffu.Interstitial) {
            return new zzffx(context, zzffuVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfF)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfH), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfz), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfB));
        }
        if (zzffuVar != zzffu.AppOpen) {
            return null;
        }
        return new zzffx(context, zzffuVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfK)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfM)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfN)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfI), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfJ), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfL));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzffx(@Nullable Context context, zzffu zzffuVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzffu.values();
        this.zzl = zzffv.zza();
        this.zzm = zzffw.zza();
        this.zza = context;
        this.zzi = zzffuVar.ordinal();
        this.zzb = zzffuVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
