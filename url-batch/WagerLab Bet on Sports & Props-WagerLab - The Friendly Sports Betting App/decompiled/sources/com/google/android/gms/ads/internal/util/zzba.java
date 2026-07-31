package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfee;
import com.google.android.gms.internal.ads.zzghs;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    public final String zza;
    public final int zzb;

    zzba(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzba zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zza = zzfee.zza(th);
        return new zzba(zzghs.zzc(th.getMessage()) ? zza.zzb : th.getMessage(), zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaz zzb() {
        return new zzaz(this.zza, this.zzb);
    }
}
