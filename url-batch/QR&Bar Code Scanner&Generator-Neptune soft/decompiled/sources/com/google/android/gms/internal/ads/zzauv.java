package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzauv implements Comparator<zzauu>, Parcelable {
    public static final Parcelable.Creator<zzauv> CREATOR = new zzaus();
    public final int zza;
    private final zzauu[] zzb;
    private int zzc;

    zzauv(Parcel parcel) {
        zzauu[] zzauuVarArr = (zzauu[]) parcel.createTypedArray(zzauu.CREATOR);
        this.zzb = zzauuVarArr;
        this.zza = zzauuVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzauu zzauuVar, zzauu zzauuVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzauu zzauuVar3 = zzauuVar;
        zzauu zzauuVar4 = zzauuVar2;
        UUID uuid5 = zzash.zzb;
        uuid = zzauuVar3.zze;
        if (uuid5.equals(uuid)) {
            UUID uuid6 = zzash.zzb;
            uuid4 = zzauuVar4.zze;
            return !uuid6.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzauuVar3.zze;
        uuid3 = zzauuVar4.zze;
        return uuid2.compareTo(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzauv) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb);
        this.zzc = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzauu zza(int i) {
        return this.zzb[i];
    }

    public zzauv(List list) {
        this(false, (zzauu[]) list.toArray(new zzauu[list.size()]));
    }

    private zzauv(boolean z, zzauu... zzauuVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzauuVarArr = z ? (zzauu[]) zzauuVarArr.clone() : zzauuVarArr;
        Arrays.sort(zzauuVarArr, this);
        int i = 1;
        while (true) {
            int length = zzauuVarArr.length;
            if (i >= length) {
                this.zzb = zzauuVarArr;
                this.zza = length;
                return;
            }
            uuid = zzauuVarArr[i - 1].zze;
            uuid2 = zzauuVarArr[i].zze;
            if (uuid.equals(uuid2)) {
                uuid3 = zzauuVarArr[i].zze;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(String.valueOf(uuid3))));
            }
            i++;
        }
    }

    public zzauv(zzauu... zzauuVarArr) {
        this(true, zzauuVarArr);
    }
}
