package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4126kb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String str = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        String str3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        String str4 = readString4 == null ? "" : readString4;
        String readString5 = parcel.readString();
        String str5 = readString5 == null ? "" : readString5;
        String readString6 = parcel.readString();
        String str6 = readString6 == null ? "" : readString6;
        boolean z = parcel.readByte() != 0;
        String readString7 = parcel.readString();
        C4178mb c4178mb = new C4178mb(readLong, str, str2, str3, str4, str5, str6, z, readString7 == null ? "" : readString7);
        String readString8 = parcel.readString();
        C4152lb c4152lb = new C4152lb(c4178mb, readString8 == null ? "" : readString8, parcel.readInt(), parcel.readLong());
        c4152lb.e = parcel.readInt();
        c4152lb.f = parcel.readString();
        return c4152lb;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C4152lb[i];
    }
}
