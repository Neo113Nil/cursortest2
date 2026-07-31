package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzies implements zziip {
    private final zzier zza;

    private zzies(zzier zzierVar) {
        zzierVar.getClass();
        this.zza = zzierVar;
        zzierVar.zza = this;
    }

    public static zzies zza(zzier zzierVar) {
        Object obj = zzierVar.zza;
        return obj != null ? (zzies) obj : new zzies(zzierVar);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (zziei) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzM(int i, zzigo zzigoVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            zzierVar.zzr(zzigp.zzc(zzigoVar, entry.getKey(), entry.getValue()));
            zzigp.zzb(zzierVar, zzigoVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zze(int i, float f) throws IOException {
        this.zza.zze(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzg(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzn(int i, zziei zzieiVar) throws IOException {
        this.zza.zzj(i, zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzf(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzr(int i, Object obj, zziho zzihoVar) throws IOException {
        zzier zzierVar = this.zza;
        zzidr zzidrVar = (zzidr) obj;
        zzierVar.zzb(i, 2);
        zzierVar.zzr(zzidrVar.zzaT(zzihoVar));
        zzihoVar.zzf(zzidrVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzs(int i, Object obj, zziho zzihoVar) throws IOException {
        zzier zzierVar = this.zza;
        zzierVar.zzb(i, 3);
        zzihoVar.zzf((zzidr) obj, this);
        zzierVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zziei) {
            this.zza.zzn(i, (zziei) obj);
        } else {
            this.zza.zzm(i, (zzigw) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigh)) {
            while (i2 < list.size()) {
                this.zza.zzi(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzigh zzighVar = (zzigh) list;
        while (i2 < list.size()) {
            Object zzc = zzighVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzi(i, (String) zzc);
            } else {
                this.zza.zzj(i, (zziei) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzigk zzigkVar = (zzigk) list;
        if (!z) {
            while (i2 < zzigkVar.size()) {
                this.zza.zzg(i, zzigkVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzigkVar.size(); i6++) {
            zzigkVar.zzc(i6);
            i5 += 8;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzigkVar.size()) {
            zzierVar2.zzu(zzigkVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.zzF(((Integer) list.get(i4)).intValue());
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzd(i, zzifnVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            i5 += zzier.zzF(zzifnVar.zzf(i6));
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zzierVar2.zzr(zzifnVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zze(i, zzifnVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            zzifnVar.zzf(i6);
            i5 += 4;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zzierVar2.zzs(zzifnVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.zzG(((Long) list.get(i4)).longValue());
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzigk zzigkVar = (zzigk) list;
        if (!z) {
            while (i2 < zzigkVar.size()) {
                this.zza.zzf(i, zzigkVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzigkVar.size(); i6++) {
            i5 += zzier.zzG(zzigkVar.zzc(i6));
        }
        zzierVar2.zzr(i5);
        while (i2 < zzigkVar.size()) {
            zzierVar2.zzt(zzigkVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzidy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzidy zzidyVar = (zzidy) list;
        if (!z) {
            while (i2 < zzidyVar.size()) {
                this.zza.zzh(i, zzidyVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidyVar.size(); i6++) {
            zzidyVar.zzf(i6);
            i5++;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzidyVar.size()) {
            zzierVar2.zzp(zzidyVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.zzG(((Integer) list.get(i4)).intValue());
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzc(i, zzifnVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            i5 += zzier.zzG(zzifnVar.zzf(i6));
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zzierVar2.zzq(zzifnVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z) {
            while (i2 < zzifdVar.size()) {
                this.zza.zze(i, Float.floatToRawIntBits(zzifdVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifdVar.size(); i6++) {
            zzifdVar.zzf(i6);
            i5 += 4;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifdVar.size()) {
            zzierVar2.zzs(Float.floatToRawIntBits(zzifdVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zziet)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zziet zzietVar = (zziet) list;
        if (!z) {
            while (i2 < zzietVar.size()) {
                this.zza.zzg(i, Double.doubleToRawLongBits(zzietVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzietVar.size(); i6++) {
            zzietVar.zzf(i6);
            i5 += 8;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzietVar.size()) {
            zzierVar2.zzu(Double.doubleToRawLongBits(zzietVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zze(i, zzifnVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            zzifnVar.zzf(i6);
            i5 += 4;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zzierVar2.zzs(zzifnVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzigk zzigkVar = (zzigk) list;
        if (!z) {
            while (i2 < zzigkVar.size()) {
                this.zza.zzg(i, zzigkVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzigkVar.size(); i6++) {
            zzigkVar.zzc(i6);
            i5 += 8;
        }
        zzierVar2.zzr(i5);
        while (i2 < zzigkVar.size()) {
            zzierVar2.zzu(zzigkVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.zzG(((Integer) list.get(i4)).intValue());
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzc(i, zzifnVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            i5 += zzier.zzG(zzifnVar.zzf(i6));
        }
        zzierVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zzierVar2.zzq(zzifnVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzier zzierVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzierVar.zzd(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzier zzierVar2 = this.zza;
            zzierVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzier.zzF((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzierVar2.zzr(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzierVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                zzier zzierVar3 = this.zza;
                int zzf = zzifnVar.zzf(i2);
                zzierVar3.zzd(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzier zzierVar4 = this.zza;
        zzierVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            int zzf2 = zzifnVar.zzf(i6);
            i5 += zzier.zzF((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzierVar4.zzr(i5);
        while (i2 < zzifnVar.size()) {
            int zzf3 = zzifnVar.zzf(i2);
            zzierVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigk)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzier zzierVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzierVar.zzf(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzier zzierVar2 = this.zza;
            zzierVar2.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzier.zzG((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzierVar2.zzr(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzierVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzigk zzigkVar = (zzigk) list;
        if (!z) {
            while (i2 < zzigkVar.size()) {
                zzier zzierVar3 = this.zza;
                long zzc = zzigkVar.zzc(i2);
                zzierVar3.zzf(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        zzier zzierVar4 = this.zza;
        zzierVar4.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzigkVar.size(); i6++) {
            long zzc2 = zzigkVar.zzc(i6);
            i5 += zzier.zzG((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzierVar4.zzr(i5);
        while (i2 < zzigkVar.size()) {
            long zzc3 = zzigkVar.zzc(i2);
            zzierVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziip
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzigk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzier zzierVar = this.zza;
            zzierVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzier.zzG(((Long) list.get(i4)).longValue());
            }
            zzierVar.zzr(i3);
            while (i2 < list.size()) {
                zzierVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzigk zzigkVar = (zzigk) list;
        if (!z) {
            while (i2 < zzigkVar.size()) {
                this.zza.zzf(i, zzigkVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzier zzierVar2 = this.zza;
        zzierVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzigkVar.size(); i6++) {
            i5 += zzier.zzG(zzigkVar.zzc(i6));
        }
        zzierVar2.zzr(i5);
        while (i2 < zzigkVar.size()) {
            zzierVar2.zzt(zzigkVar.zzc(i2));
            i2++;
        }
    }
}
