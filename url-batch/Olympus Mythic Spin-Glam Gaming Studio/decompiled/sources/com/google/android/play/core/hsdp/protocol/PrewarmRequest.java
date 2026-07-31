package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes10.dex */
public final class PrewarmRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<PrewarmRequest> CREATOR = new zzm();
    private final String zza;
    private final String zzb;
    private final IBinder zzc;
    private final Bundle zzd;

    /* synthetic */ PrewarmRequest(Parcel parcel, zzn zznVar) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.zza = readString;
        String readString2 = parcel.readString();
        Objects.requireNonNull(readString2);
        this.zzb = readString2;
        if (parcel.readByte() != 0) {
            this.zzc = parcel.readStrongBinder();
        } else {
            this.zzc = null;
        }
        Bundle readBundle = parcel.readBundle(PrewarmRequest.class.getClassLoader());
        this.zzd = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        IBinder iBinder = this.zzc;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.zzd);
    }

    public PrewarmRequest(String str, String str2, IBinder iBinder, Bundle bundle) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zza = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.zzb = str2;
        this.zzc = iBinder;
        this.zzd = bundle != null ? new Bundle(bundle) : Bundle.EMPTY;
    }
}
