package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
@SafeParcelable.Class(creator = "ScionActivityInfoCreator")
/* loaded from: classes14.dex */
public final class zzdj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdj> CREATOR = new zzdk();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @Nullable
    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final Intent zzc;

    @SafeParcelable.Constructor
    public zzdj(@SafeParcelable.Param(id = 1) int i, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdj zza(Activity activity) {
        return new zzdj(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdjVar = (zzdj) obj;
        return this.zza == zzdjVar.zza && Objects.equals(this.zzb, zzdjVar.zzb) && Objects.equals(this.zzc, zzdjVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
