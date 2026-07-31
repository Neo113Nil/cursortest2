package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* loaded from: classes14.dex */
public final class zzbru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbru> CREATOR = new zzbrv();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final String[] zzb;

    @SafeParcelable.Field(id = 3)
    public final String[] zzc;

    @SafeParcelable.Constructor
    zzbru(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
