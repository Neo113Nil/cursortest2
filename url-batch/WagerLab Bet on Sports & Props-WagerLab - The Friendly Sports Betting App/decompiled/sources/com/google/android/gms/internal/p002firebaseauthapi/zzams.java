package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzams<T> implements zzanb<T> {
    private final zzamm zza;
    private final zzanu<?, ?> zzb;
    private final boolean zzc;
    private final zzakw<?> zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t) {
        zzanu<?, ?> zzanuVar = this.zzb;
        int zzb = zzanuVar.zzb(zzanuVar.zzd(t));
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    static <T> zzams<T> zza(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        return new zzams<>(zzanuVar, zzakwVar, zzammVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        zzamm zzammVar = this.zza;
        if (zzammVar instanceof zzalf) {
            return (T) ((zzalf) zzammVar).zzo();
        }
        return (T) zzammVar.zzq().zzf();
    }

    private zzams(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        this.zzb = zzanuVar;
        this.zzc = zzakwVar.zza(zzammVar);
        this.zzd = zzakwVar;
        this.zza = zzammVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, T t2) {
        zzand.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzand.zza(this.zzd, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzanc zzancVar, zzaku zzakuVar) throws IOException {
        boolean z;
        zzanu<?, ?> zzanuVar = this.zzb;
        zzakw<?> zzakwVar = this.zzd;
        Object zzc = zzanuVar.zzc(t);
        zzakx<?> zzb = zzakwVar.zzb(t);
        while (zzancVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzancVar.zzd();
                int i = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzakwVar.zza(zzakuVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzakwVar.zza(zzancVar, zza, zzakuVar, zzb);
                        } else {
                            z = zzanuVar.zza((zzanu<?, ?>) zzc, zzancVar, 0);
                        }
                    } else {
                        z = zzancVar.zzt();
                    }
                    if (z) {
                        return;
                    }
                } else {
                    Object obj = null;
                    zzajv zzajvVar = null;
                    while (zzancVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzancVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzancVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzakwVar.zza(zzancVar, obj, zzakuVar, zzb);
                            } else {
                                zzajvVar = zzancVar.zzp();
                            }
                        } else {
                            i = zzancVar.zzj();
                            obj = zzakwVar.zza(zzakuVar, this.zza, i);
                        }
                    }
                    if (zzancVar.zzd() != 12) {
                        throw zzall.zzb();
                    }
                    if (zzajvVar != null) {
                        if (obj != null) {
                            zzakwVar.zza(zzajvVar, obj, zzakuVar, zzb);
                        } else {
                            zzanuVar.zza((zzanu<?, ?>) zzc, i, zzajvVar);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            } finally {
                zzanuVar.zzb((Object) t, (T) zzc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        int i3;
        zzalf zzalfVar = (zzalf) t;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar == zzanx.zzc()) {
            zzanxVar = zzanx.zzd();
            zzalfVar.zzb = zzanxVar;
        }
        zzanx zzanxVar2 = zzanxVar;
        ((zzalf.zzd) t).zza();
        zzalf.zzf zzfVar = null;
        while (i < i2) {
            int zzc = zzajr.zzc(bArr, i, zzajuVar);
            int i4 = zzajuVar.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzaju zzajuVar2 = zzajuVar;
                int i6 = 0;
                zzajv zzajvVar = null;
                while (true) {
                    if (zzc >= i5) {
                        i3 = zzc;
                        break;
                    }
                    i3 = zzajr.zzc(bArr2, zzc, zzajuVar2);
                    int i7 = zzajuVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzfVar != null) {
                                zzamx.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i9 == 2) {
                                zzc = zzajr.zza(bArr2, i3, zzajuVar2);
                                zzajvVar = (zzajv) zzajuVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzc = zzajr.zza(i7, bArr2, i3, i5, zzajuVar2);
                        }
                    } else if (i9 == 0) {
                        zzc = zzajr.zzc(bArr2, i3, zzajuVar2);
                        i6 = zzajuVar2.zza;
                        zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar2.zzd, this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zzajvVar != null) {
                    zzanxVar2.zza((i6 << 3) | 2, zzajvVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzajuVar = zzajuVar2;
            } else if ((i4 & 7) == 2) {
                zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar.zzd, this.zza, i4 >>> 3);
                if (zzfVar != null) {
                    zzamx.zza();
                    throw new NoSuchMethodError();
                }
                i = zzajr.zza(i4, bArr, zzc, i2, zzanxVar2, zzajuVar);
            } else {
                i = zzajr.zza(i4, bArr, zzc, i2, zzajuVar);
            }
        }
        if (i != i2) {
            throw zzall.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, zzaol zzaolVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzakz zzakzVar = (zzakz) next.getKey();
            if (zzakzVar.zzc() != zzaoj.MESSAGE || zzakzVar.zze() || zzakzVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzalp) {
                zzaolVar.zza(zzakzVar.zza(), (Object) ((zzalp) next).zza().zzb());
            } else {
                zzaolVar.zza(zzakzVar.zza(), next.getValue());
            }
        }
        zzanu<?, ?> zzanuVar = this.zzb;
        zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t), zzaolVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t) {
        return this.zzd.zza(t).zzg();
    }
}
