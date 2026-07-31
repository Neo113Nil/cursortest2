package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzcbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbc> CREATOR = new zzcbd();

    @SafeParcelable.Field(id = 2)
    public final boolean zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzcbc() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcbc(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z;
        this.zzb = list;
    }
}
