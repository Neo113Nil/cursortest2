package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SafeParcelable.Class(creator = "DecagonRequestParcelCreator")
/* loaded from: classes5.dex */
public final class zzcbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbe> CREATOR = new zzcbf();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Constructor
    public zzcbe(@SafeParcelable.Param(id = 1) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
