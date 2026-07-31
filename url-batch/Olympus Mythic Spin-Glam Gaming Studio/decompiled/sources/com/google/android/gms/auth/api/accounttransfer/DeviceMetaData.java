package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes12.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();
    final int zza;
    private boolean zzb;
    private long zzc;
    private final boolean zzd;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
