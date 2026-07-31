package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@SafeParcelable.Class(creator = "PreloadConfigurationParcelCreator")
/* loaded from: classes12.dex */
public final class zzfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final zzm zzc;

    @SafeParcelable.Field(id = 4)
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final boolean zze;

    @SafeParcelable.Constructor
    public zzfp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) zzm zzmVar, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmVar;
        this.zzd = i2;
        this.zze = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfp) {
            zzfp zzfpVar = (zzfp) obj;
            if (this.zza.equals(zzfpVar.zza) && this.zzb == zzfpVar.zzb && this.zzc.zza(zzfpVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzfp zza(int i) {
        if (i <= 0) {
            i = this.zzd;
        }
        zzm zzmVar = this.zzc;
        int i2 = this.zzb;
        return new zzfp(this.zza, i2, zzmVar, i, this.zze);
    }
}
