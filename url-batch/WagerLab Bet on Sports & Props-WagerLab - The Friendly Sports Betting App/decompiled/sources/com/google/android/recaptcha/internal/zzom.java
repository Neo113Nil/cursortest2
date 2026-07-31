package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int zzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzna) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int hashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        boolean zzO;
        zzpl zzplVar = this.zzb;
        Object zza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzovVar.zzd();
                int i = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        zznc zza2 = zzmoVar.zza(this.zza, zzd >>> 3);
                        if (zza2 != null) {
                            zznc zzncVar = zza2;
                            throw null;
                        }
                        zzO = zzplVar.zzk(zza, zzovVar, 0);
                    } else {
                        zzO = zzovVar.zzO();
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    zznc zzncVar2 = null;
                    zzle zzleVar = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzovVar.zzd();
                        if (zzd2 == 16) {
                            i = zzovVar.zzj();
                            zzncVar2 = zzmoVar.zza(this.zza, i);
                        } else if (zzd2 == 26) {
                            if (zzncVar2 != null) {
                                zznc zzncVar3 = zzncVar2;
                                throw null;
                            }
                            zzleVar = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVar == null) {
                        continue;
                    } else {
                        if (zzncVar2 != null) {
                            zznc zzncVar4 = zzncVar2;
                            throw null;
                        }
                        zzplVar.zzg(zza, i, zzleVar);
                    }
                }
            } finally {
                zzplVar.zzj(obj, zza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[EDGE_INSN: B:24:0x0091->B:25:0x0091 BREAK  A[LOOP:1: B:10:0x0051->B:18:0x0051], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        int i3;
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar == zzpm.zzc()) {
            zzpmVar = zzpm.zzf();
            zzndVar.zzc = zzpmVar;
        }
        zzpm zzpmVar2 = zzpmVar;
        ((zzna) obj).zzi();
        zznc zzncVar = null;
        while (i < i2) {
            int zzi = zzku.zzi(bArr, i, zzktVar);
            int i4 = zzktVar.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzkt zzktVar2 = zzktVar;
                int i6 = 0;
                zzle zzleVar = null;
                while (true) {
                    if (zzi >= i5) {
                        i3 = zzi;
                        break;
                    }
                    i3 = zzku.zzi(bArr2, zzi, zzktVar2);
                    int i7 = zzktVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzncVar != null) {
                                int i10 = zzos.zza;
                                throw null;
                            }
                            if (i9 == 2) {
                                zzi = zzku.zza(bArr2, i3, zzktVar2);
                                zzleVar = (zzle) zzktVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzi = zzku.zzo(i7, bArr2, i3, i5, zzktVar2);
                        }
                    } else if (i9 == 0) {
                        zzi = zzku.zzi(bArr2, i3, zzktVar2);
                        i6 = zzktVar2.zza;
                        zzncVar = zzktVar2.zzd.zza(this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zzleVar != null) {
                    zzpmVar2.zzj((i6 << 3) | 2, zzleVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzktVar = zzktVar2;
            } else if ((i4 & 7) == 2) {
                zzncVar = zzktVar.zzd.zza(this.zza, i4 >>> 3);
                if (zzncVar != null) {
                    int i11 = zzos.zza;
                    throw null;
                }
                i = zzku.zzh(i4, bArr, zzi, i2, zzpmVar2, zzktVar);
            } else {
                i = zzku.zzo(i4, bArr, zzi, i2, zzktVar);
            }
        }
        if (i != i2) {
            throw new zznn("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Iterator zzf = ((zzna) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
