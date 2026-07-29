package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzauh {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzaup zzc = new zzaup();
    private int zzd;
    private int zze;
    private long zzf;
    private zzauk zzg;

    zzauh() {
    }

    private final long zzd(zzatu zzatuVar, int i) throws IOException, InterruptedException {
        zzatuVar.zzh(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzauk zzaukVar) {
        this.zzg = zzaukVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x008b, code lost:
    
        if (r0 == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzatu zzatuVar) throws IOException, InterruptedException {
        String str;
        int zzb;
        int zzc;
        long j;
        int i;
        zzayy.zze(this.zzg != null);
        while (true) {
            if (!this.zzb.isEmpty()) {
                long zzd = zzatuVar.zzd();
                j = ((zzaug) this.zzb.peek()).zzb;
                if (zzd >= j) {
                    zzauk zzaukVar = this.zzg;
                    i = ((zzaug) this.zzb.pop()).zza;
                    zzaukVar.zza.zzb(i);
                    return true;
                }
            }
            int i2 = this.zzd;
            if (i2 == 0) {
                long zze = this.zzc.zze(zzatuVar, true, false, 4);
                if (zze == -2) {
                    zzatuVar.zze();
                    while (true) {
                        zzatuVar.zzg(this.zza, 0, 4, false);
                        zzb = zzaup.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzaup.zzc(this.zza, zzb, false);
                            zzaun zzaunVar = this.zzg.zza;
                            if (zzaun.zzm(zzc)) {
                                break;
                            }
                        }
                        zzatuVar.zzi(1, false);
                    }
                    zzatuVar.zzi(zzb, false);
                    zze = zzc;
                }
                if (zze == -1) {
                    return false;
                }
                this.zze = (int) zze;
                this.zzd = 1;
            }
            this.zzf = this.zzc.zze(zzatuVar, false, true, 8);
            this.zzd = 2;
            zzauk zzaukVar2 = this.zzg;
            int i3 = this.zze;
            zzaun zzaunVar2 = zzaukVar2.zza;
            int zzl = zzaun.zzl(i3);
            if (zzl != 0) {
                if (zzl == 1) {
                    long zzd2 = zzatuVar.zzd();
                    this.zzb.add(new zzaug(i3, this.zzf + zzd2, null));
                    this.zzg.zza.zzi(this.zze, zzd2, this.zzf);
                    this.zzd = 0;
                    return true;
                }
                if (zzl == 2) {
                    long j2 = this.zzf;
                    if (j2 <= 8) {
                        zzaukVar2.zza.zzh(i3, zzd(zzatuVar, (int) j2));
                        this.zzd = 0;
                        return true;
                    }
                    throw new zzarv("Invalid integer size: " + j2);
                }
                if (zzl == 3) {
                    long j3 = this.zzf;
                    if (j3 > 2147483647L) {
                        throw new zzarv("String element size: " + j3);
                    }
                    int i4 = (int) j3;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i4];
                        zzatuVar.zzh(bArr, 0, i4, false);
                        str = new String(bArr);
                    }
                    zzaukVar2.zza.zzj(i3, str);
                    this.zzd = 0;
                    return true;
                }
                if (zzl == 4) {
                    zzaunVar2.zzk(i3, (int) this.zzf, zzatuVar);
                    this.zzd = 0;
                    return true;
                }
                long j4 = this.zzf;
                if (j4 != 4 && j4 != 8) {
                    throw new zzarv("Invalid float size: " + j4);
                }
                int i5 = (int) j4;
                zzaukVar2.zza.zzc(i3, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzatuVar, i5)));
                this.zzd = 0;
                return true;
            }
            zzatuVar.zzi((int) this.zzf, false);
            this.zzd = 0;
        }
    }
}
