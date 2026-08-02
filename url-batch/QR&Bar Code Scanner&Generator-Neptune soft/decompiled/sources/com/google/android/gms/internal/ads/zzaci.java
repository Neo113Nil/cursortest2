package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaci implements zzbp {
    public static final Parcelable.Creator<zzaci> CREATOR = new zzach();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaci(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzaci(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzen.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzen.zzH(parcel.createByteArray());
    }

    public static zzaci zzb(zzef zzefVar) {
        int zze = zzefVar.zze();
        String zzx = zzefVar.zzx(zzefVar.zze(), zzfsk.zza);
        String zzx2 = zzefVar.zzx(zzefVar.zze(), zzfsk.zzc);
        int zze2 = zzefVar.zze();
        int zze3 = zzefVar.zze();
        int zze4 = zzefVar.zze();
        int zze5 = zzefVar.zze();
        int zze6 = zzefVar.zze();
        byte[] bArr = new byte[zze6];
        zzefVar.zzB(bArr, 0, zze6);
        return new zzaci(zze, zzx, zzx2, zze2, zze3, zze4, zze5, bArr);
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
            zzaci zzaciVar = (zzaci) obj;
            if (this.zza == zzaciVar.zza && this.zzb.equals(zzaciVar.zzb) && this.zzc.equals(zzaciVar.zzc) && this.zzd == zzaciVar.zzd && this.zze == zzaciVar.zze && this.zzf == zzaciVar.zzf && this.zzg == zzaciVar.zzg && Arrays.equals(this.zzh, zzaciVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        zzbkVar.zza(this.zzh, this.zza);
    }
}
