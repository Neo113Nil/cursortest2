package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhhn implements zzhlk {
    private final zzhhm zza;

    private zzhhn(zzhhm zzhhmVar) {
        zzhiu.zza(zzhhmVar, "output");
        this.zza = zzhhmVar;
        zzhhmVar.zze = this;
    }

    public static zzhhn zza(zzhhm zzhhmVar) {
        Object obj = zzhhmVar.zze;
        return obj != null ? (zzhhn) obj : new zzhhn(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzk(i, (zzhhb) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzM(int i, zzhjk zzhjkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            zzhhmVar.zzs(zzhjl.zzc(zzhjkVar, entry.getKey(), entry.getValue()));
            zzhjl.zzb(zzhhmVar, zzhjkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzM(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zze(int i, float f) throws IOException {
        this.zza.zzM(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzN(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzM(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzi(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzj(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzn(int i, zzhhb zzhhbVar) throws IOException {
        this.zza.zzk(i, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzL(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzL(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzN(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzr(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhgk zzhgkVar = (zzhgk) obj;
        zzhhmVar.zzJ(i, 2);
        zzhhmVar.zzs(zzhgkVar.zzaT(zzhkkVar));
        zzhkkVar.zzf(zzhgkVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzs(int i, Object obj, zzhkk zzhkkVar) throws IOException {
        zzhhm zzhhmVar = this.zza;
        zzhhmVar.zzJ(i, 3);
        zzhkkVar.zzf((zzhgk) obj, this);
        zzhhmVar.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzJ(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzJ(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzhhb) {
            this.zza.zzo(i, (zzhhb) obj);
        } else {
            this.zza.zzn(i, (zzhjs) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjd)) {
            while (i2 < list.size()) {
                this.zza.zzj(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzhjd zzhjdVar = (zzhjd) list;
        while (i2 < list.size()) {
            Object zzc = zzhjdVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzj(i, (String) zzc);
            } else {
                this.zza.zzk(i, (zzhhb) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            zzhjgVar.zzc(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhhm.zzA(((Integer) list.get(i4)).intValue());
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzL(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            i5 += zzhhm.zzA(zzhiiVar.zzf(i6));
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzs(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            zzhiiVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhhm.zzB(((Long) list.get(i4)).longValue());
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            i5 += zzhhm.zzB(zzhjgVar.zzc(i6));
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhgr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzq(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzhgr zzhgrVar = (zzhgr) list;
        if (!z) {
            while (i2 < zzhgrVar.size()) {
                this.zza.zzi(i, zzhgrVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhgrVar.size(); i6++) {
            zzhgrVar.zzf(i6);
            i5++;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhgrVar.size()) {
            zzhhmVar2.zzq(zzhgrVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhhm.zzB(((Integer) list.get(i4)).intValue());
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            i5 += zzhhm.zzB(zzhiiVar.zzf(i6));
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhhy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzhhy zzhhyVar = (zzhhy) list;
        if (!z) {
            while (i2 < zzhhyVar.size()) {
                this.zza.zzM(i, Float.floatToRawIntBits(zzhhyVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhhyVar.size(); i6++) {
            zzhhyVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhhyVar.size()) {
            zzhhmVar2.zzt(Float.floatToRawIntBits(zzhhyVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhho)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzhho zzhhoVar = (zzhho) list;
        if (!z) {
            while (i2 < zzhhoVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzhhoVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhhoVar.size(); i6++) {
            zzhhoVar.zzf(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhhoVar.size()) {
            zzhhmVar2.zzv(Double.doubleToRawLongBits(zzhhoVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzM(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            zzhiiVar.zzf(i6);
            i5 += 4;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzh(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            zzhjgVar.zzc(i6);
            i5 += 8;
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhhm.zzB(((Integer) list.get(i4)).intValue());
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                this.zza.zzK(i, zzhiiVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            i5 += zzhhm.zzB(zzhiiVar.zzf(i6));
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhii)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzhhmVar.zzL(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzhhm.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzhhmVar2.zzs(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzhhmVar2.zzs((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z) {
            while (i2 < zzhiiVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                int zzf = zzhiiVar.zzf(i2);
                zzhhmVar3.zzL(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhiiVar.size(); i6++) {
            int zzf2 = zzhiiVar.zzf(i6);
            i5 += zzhhm.zzA((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzhhmVar4.zzs(i5);
        while (i2 < zzhiiVar.size()) {
            int zzf3 = zzhiiVar.zzf(i2);
            zzhhmVar4.zzs((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzhhmVar.zzN(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzhhm.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzhhmVar2.zzs(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzhhmVar2.zzu((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                long zzc = zzhjgVar.zzc(i2);
                zzhhmVar3.zzN(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            long zzc2 = zzhjgVar.zzc(i6);
            i5 += zzhhm.zzB((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzhhmVar4.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            long zzc3 = zzhjgVar.zzc(i2);
            zzhhmVar4.zzu((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhhm.zzB(((Long) list.get(i4)).longValue());
            }
            zzhhmVar.zzs(i3);
            while (i2 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z) {
            while (i2 < zzhjgVar.size()) {
                this.zza.zzN(i, zzhjgVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhjgVar.size(); i6++) {
            i5 += zzhhm.zzB(zzhjgVar.zzc(i6));
        }
        zzhhmVar2.zzs(i5);
        while (i2 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i2));
            i2++;
        }
    }
}
