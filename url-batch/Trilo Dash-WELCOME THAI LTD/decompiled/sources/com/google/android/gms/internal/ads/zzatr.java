package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzatr implements Comparator<zzatq>, Parcelable {
    public static final Parcelable.Creator<zzatr> CREATOR = new zzato();
    public final int zza;
    private final zzatq[] zzb;
    private int zzc;

    zzatr(Parcel parcel) {
        zzatq[] zzatqVarArr = (zzatq[]) parcel.createTypedArray(zzatq.CREATOR);
        this.zzb = zzatqVarArr;
        this.zza = zzatqVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzatq zzatqVar, zzatq zzatqVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzatq zzatqVar3 = zzatqVar;
        zzatq zzatqVar4 = zzatqVar2;
        UUID uuid5 = zzard.zzb;
        uuid = zzatqVar3.zze;
        if (uuid5.equals(uuid)) {
            UUID uuid6 = zzard.zzb;
            uuid4 = zzatqVar4.zze;
            return !uuid6.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzatqVar3.zze;
        uuid3 = zzatqVar4.zze;
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
        return Arrays.equals(this.zzb, ((zzatr) obj).zzb);
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

    public final zzatq zza(int i) {
        return this.zzb[i];
    }

    public zzatr(List list) {
        this(false, (zzatq[]) list.toArray(new zzatq[list.size()]));
    }

    private zzatr(boolean z, zzatq... zzatqVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzatqVarArr = z ? (zzatq[]) zzatqVarArr.clone() : zzatqVarArr;
        Arrays.sort(zzatqVarArr, this);
        int i = 1;
        while (true) {
            int length = zzatqVarArr.length;
            if (i >= length) {
                this.zzb = zzatqVarArr;
                this.zza = length;
                return;
            }
            uuid = zzatqVarArr[i - 1].zze;
            uuid2 = zzatqVarArr[i].zze;
            if (uuid.equals(uuid2)) {
                uuid3 = zzatqVarArr[i].zze;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(String.valueOf(uuid3))));
            }
            i++;
        }
    }

    public zzatr(zzatq... zzatqVarArr) {
        this(true, zzatqVarArr);
    }
}
