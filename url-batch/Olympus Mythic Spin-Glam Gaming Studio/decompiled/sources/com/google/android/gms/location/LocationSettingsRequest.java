package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();
    private final List zza;
    private final boolean zzb;
    private final boolean zzc;
    private zzbj zzd;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final ArrayList zza = new ArrayList();
        private boolean zzb = false;
        private boolean zzc = false;
    }

    LocationSettingsRequest(List list, boolean z, boolean z2, zzbj zzbjVar) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
