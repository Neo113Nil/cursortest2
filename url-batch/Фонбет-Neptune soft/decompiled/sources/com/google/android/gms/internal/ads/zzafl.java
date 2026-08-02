package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzafl implements zzbj {
    public static final Parcelable.Creator<zzafl> CREATOR = new zzafk();
    public final String zza;
    public final String zzb;

    protected zzafl(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzet.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafl zzaflVar = (zzafl) obj;
            if (this.zza.equals(zzaflVar.zza) && this.zzb.equals(zzaflVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzbfVar.zzq(this.zzb);
            return;
        }
        if (c == 1) {
            zzbfVar.zze(this.zzb);
            return;
        }
        if (c == 2) {
            zzbfVar.zzd(this.zzb);
        } else if (c == 3) {
            zzbfVar.zzc(this.zzb);
        } else {
            if (c != 4) {
                return;
            }
            zzbfVar.zzh(this.zzb);
        }
    }

    public zzafl(String str, String str2) {
        this.zza = zzfuf.zzb(str);
        this.zzb = str2;
    }
}
