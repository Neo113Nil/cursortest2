package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxe implements zzhbh {
    private final zzgxd zza;

    private zzgxe(zzgxd zzgxdVar) {
        zzgyl.zzc(zzgxdVar, AgentOptions.OUTPUT);
        this.zza = zzgxdVar;
        zzgxdVar.zze = this;
    }

    public static zzgxe zza(zzgxd zzgxdVar) {
        zzgxe zzgxeVar = zzgxdVar.zze;
        return zzgxeVar != null ? zzgxeVar : new zzgxe(zzgxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzN(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzd(int i, zzgwm zzgwmVar) throws IOException {
        this.zza.zzO(i, zzgwmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzO(i, (zzgwm) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzq(int i, Object obj, zzhae zzhaeVar) throws IOException {
        zzgxd zzgxdVar = this.zza;
        zzgxdVar.zzs(i, 3);
        zzhaeVar.zzj((zzgzj) obj, zzgxdVar.zze);
        zzgxdVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzv(int i, Object obj, zzhae zzhaeVar) throws IOException {
        this.zza.zzn(i, (zzgzj) obj, zzhaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgwm) {
            this.zza.zzp(i, (zzgwm) obj);
        } else {
            this.zza.zzo(i, (zzgzj) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyv)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzgyv zzgyvVar = (zzgyv) list;
        while (i2 < list.size()) {
            Object zzc = zzgyvVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzq(i, (String) zzc);
            } else {
                this.zza.zzO(i, (zzgwm) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxd.zzD(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                this.zza.zzt(i, zzgxzVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            i5 += zzgxd.zzD(zzgxzVar.zzd(i6));
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            this.zza.zzu(zzgxzVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxd.zzE(((Long) list.get(i4)).longValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z) {
            while (i2 < zzgyyVar.size()) {
                this.zza.zzv(i, zzgyyVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyyVar.size(); i6++) {
            i5 += zzgxd.zzE(zzgyyVar.zza(i6));
        }
        this.zza.zzu(i5);
        while (i2 < zzgyyVar.size()) {
            this.zza.zzw(zzgyyVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                this.zza.zzh(i, zzgxzVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            zzgxzVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            this.zza.zzi(zzgxzVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z) {
            while (i2 < zzgyyVar.size()) {
                this.zza.zzj(i, zzgyyVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyyVar.size(); i6++) {
            zzgyyVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyyVar.size()) {
            this.zza.zzk(zzgyyVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgwc)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzM(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzgwc zzgwcVar = (zzgwc) list;
        if (!z) {
            while (i2 < zzgwcVar.size()) {
                this.zza.zzN(i, zzgwcVar.zzh(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgwcVar.size(); i6++) {
            zzgwcVar.zzh(i6);
            i5++;
        }
        this.zza.zzu(i5);
        while (i2 < zzgwcVar.size()) {
            this.zza.zzM(zzgwcVar.zzh(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxd.zzE(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                this.zza.zzl(i, zzgxzVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            i5 += zzgxd.zzE(zzgxzVar.zzd(i6));
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            this.zza.zzm(zzgxzVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z) {
            while (i2 < zzgyyVar.size()) {
                this.zza.zzj(i, zzgyyVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyyVar.size(); i6++) {
            zzgyyVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyyVar.size()) {
            this.zza.zzk(zzgyyVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzgxf zzgxfVar = (zzgxf) list;
        if (!z) {
            while (i2 < zzgxfVar.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgxfVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxfVar.size(); i6++) {
            zzgxfVar.zzd(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxfVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzgxfVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzgxp zzgxpVar = (zzgxp) list;
        if (!z) {
            while (i2 < zzgxpVar.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgxpVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxpVar.size(); i6++) {
            zzgxpVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxpVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzgxpVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                this.zza.zzh(i, zzgxzVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            zzgxzVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            this.zza.zzi(zzgxzVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzgxd zzgxdVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzgxdVar.zzt(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzgxd.zzD((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                zzgxd zzgxdVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzgxdVar2.zzu((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                zzgxd zzgxdVar3 = this.zza;
                int zzd = zzgxzVar.zzd(i2);
                zzgxdVar3.zzt(i, (zzd >> 31) ^ (zzd + zzd));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            int zzd2 = zzgxzVar.zzd(i6);
            i5 += zzgxd.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            zzgxd zzgxdVar4 = this.zza;
            int zzd3 = zzgxzVar.zzd(i2);
            zzgxdVar4.zzu((zzd3 >> 31) ^ (zzd3 + zzd3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzgxd zzgxdVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzgxdVar.zzv(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzgxd.zzE((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                zzgxd zzgxdVar2 = this.zza;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzgxdVar2.zzw((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z) {
            while (i2 < zzgyyVar.size()) {
                zzgxd zzgxdVar3 = this.zza;
                long zza = zzgyyVar.zza(i2);
                zzgxdVar3.zzv(i, (zza >> 63) ^ (zza + zza));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyyVar.size(); i6++) {
            long zza2 = zzgyyVar.zza(i6);
            i5 += zzgxd.zzE((zza2 >> 63) ^ (zza2 + zza2));
        }
        this.zza.zzu(i5);
        while (i2 < zzgyyVar.size()) {
            zzgxd zzgxdVar4 = this.zza;
            long zza3 = zzgyyVar.zza(i2);
            zzgxdVar4.zzw((zza3 >> 63) ^ (zza3 + zza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxd.zzE(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxz zzgxzVar = (zzgxz) list;
        if (!z) {
            while (i2 < zzgxzVar.size()) {
                this.zza.zzl(i, zzgxzVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxzVar.size(); i6++) {
            i5 += zzgxd.zzE(zzgxzVar.zzd(i6));
        }
        this.zza.zzu(i5);
        while (i2 < zzgxzVar.size()) {
            this.zza.zzm(zzgxzVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxd.zzE(((Long) list.get(i4)).longValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z) {
            while (i2 < zzgyyVar.size()) {
                this.zza.zzv(i, zzgyyVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyyVar.size(); i6++) {
            i5 += zzgxd.zzE(zzgyyVar.zza(i6));
        }
        this.zza.zzu(i5);
        while (i2 < zzgyyVar.size()) {
            this.zza.zzw(zzgyyVar.zza(i2));
            i2++;
        }
    }
}
