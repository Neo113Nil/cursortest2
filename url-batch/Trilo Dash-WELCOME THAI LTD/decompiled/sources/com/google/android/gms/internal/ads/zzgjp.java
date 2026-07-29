package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgjp implements zzgmj {
    private final zzgjo zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgjp(zzgjo zzgjoVar) {
        zzgky.zzf(zzgjoVar, "input");
        this.zza = zzgjoVar;
        zzgjoVar.zzc = this;
    }

    private final Object zzP(zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzgmrVar.zze();
            zzgmrVar.zzh(zze, this, zzgkaVar);
            zzgmrVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzgla.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final Object zzQ(zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        int zzn = this.zza.zzn();
        zzgjo zzgjoVar = this.zza;
        if (zzgjoVar.zza >= zzgjoVar.zzb) {
            throw new zzgla("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = zzgjoVar.zze(zzn);
        Object zze2 = zzgmrVar.zze();
        this.zza.zza++;
        zzgmrVar.zzh(zze2, this, zzgkaVar);
        zzgmrVar.zzf(zze2);
        this.zza.zzz(0);
        r5.zza--;
        this.zza.zzA(zze);
        return zze2;
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzgla.zzj();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzgla.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzgla.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzgla.zzg();
        }
    }

    public static zzgjp zzq(zzgjo zzgjoVar) {
        zzgjp zzgjpVar = zzgjoVar.zzc;
        return zzgjpVar != null ? zzgjpVar : new zzgjp(zzgjoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgln)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzn = this.zza.zzn();
            zzU(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzd() < zzd);
            return;
        }
        zzgln zzglnVar = (zzgln) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzglnVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzn2 = this.zza.zzn();
        zzU(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            zzglnVar.zzg(this.zza.zzo());
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkh)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i != 5) {
                throw zzgla.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgkh zzgkhVar = (zzgkh) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkhVar.zze(this.zza.zzc());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgla.zza();
        }
        do {
            zzgkhVar.zze(this.zza.zzc());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    @Deprecated
    public final void zzC(List list, zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzgla.zza();
        }
        do {
            list.add(zzP(zzgmrVar, zzgkaVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgkpVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgkpVar.zzh(this.zza.zzh());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgln)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgln zzglnVar = (zzgln) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzglnVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzglnVar.zzg(this.zza.zzp());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzF(List list, zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzgla.zza();
        }
        do {
            list.add(zzQ(zzgmrVar, zzgkaVar));
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i != 5) {
                throw zzgla.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkpVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgla.zza();
        }
        do {
            zzgkpVar.zzh(this.zza.zzk());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgln)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzn = this.zza.zzn();
            zzU(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzd() < zzd);
            return;
        }
        zzgln zzglnVar = (zzgln) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzglnVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzn2 = this.zza.zzn();
        zzU(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            zzglnVar.zzg(this.zza.zzt());
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgkpVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgkpVar.zzh(this.zza.zzl());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgln)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzu()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgln zzglnVar = (zzgln) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzglnVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzglnVar.zzg(this.zza.zzu());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgla.zza();
        }
        if (!(list instanceof zzglg) || z) {
            do {
                list.add(z ? zzu() : zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzglg zzglgVar = (zzglg) list;
        do {
            zzglgVar.zzi(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgkpVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgkpVar.zzh(this.zza.zzn());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgln)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Long.valueOf(this.zza.zzv()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgln zzglnVar = (zzgln) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzglnVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzglnVar.zzg(this.zza.zzv());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final boolean zzO() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final zzgjg zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    @Deprecated
    public final Object zzr(zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        zzS(3);
        return zzP(zzgmrVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final Object zzs(zzgmr zzgmrVar, zzgka zzgkaVar) throws IOException {
        zzS(2);
        return zzQ(zzgmrVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgiu)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgiu zzgiuVar = (zzgiu) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgiuVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgiuVar.zze(this.zza.zzD());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzgla.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgjx)) {
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzn = this.zza.zzn();
            zzU(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                list.add(Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzd() < zzd);
            return;
        }
        zzgjx zzgjxVar = (zzgjx) list;
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                zzgjxVar.zze(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzn2 = this.zza.zzn();
        zzU(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            zzgjxVar.zze(this.zza.zzb());
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            if (i != 2) {
                throw zzgla.zza();
            }
            int zzd = this.zza.zzd() + this.zza.zzn();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzd() < zzd);
            zzR(zzd);
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                zzgkpVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm2 = this.zza.zzm();
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        if (i2 != 2) {
            throw zzgla.zza();
        }
        int zzd2 = this.zza.zzd() + this.zza.zzn();
        do {
            zzgkpVar.zzh(this.zza.zzf());
        } while (this.zza.zzd() < zzd2);
        zzR(zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (!(list instanceof zzgkp)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i != 5) {
                throw zzgla.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        zzgkp zzgkpVar = (zzgkp) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzn2 = this.zza.zzn();
            zzT(zzn2);
            int zzd2 = this.zza.zzd() + zzn2;
            do {
                zzgkpVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd2);
            return;
        }
        if (i2 != 5) {
            throw zzgla.zza();
        }
        do {
            zzgkpVar.zzh(this.zza.zzg());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm2 = this.zza.zzm();
            }
        } while (zzm2 == this.zzb);
        this.zzd = zzm2;
    }
}
