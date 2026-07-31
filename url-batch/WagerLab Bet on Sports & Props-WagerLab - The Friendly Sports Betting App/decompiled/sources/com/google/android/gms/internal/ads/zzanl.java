package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzanl implements zzand {
    final /* synthetic */ zzann zza;
    private final zzee zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzanl(zzann zzannVar, int i) {
        Objects.requireNonNull(zzannVar);
        this.zza = zzannVar;
        this.zzb = new zzee(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        zzann zzannVar;
        int i;
        zzee zzeeVar;
        int i2;
        int i3;
        if (zzefVar.zzs() != 2) {
            return;
        }
        zzann zzannVar2 = this.zza;
        zzel zzelVar = (zzel) zzannVar2.zza().get(0);
        if ((zzefVar.zzs() & 128) != 0) {
            zzefVar.zzk(1);
            int zzt = zzefVar.zzt();
            int i4 = 3;
            zzefVar.zzk(3);
            zzee zzeeVar2 = this.zzb;
            zzefVar.zzl(zzeeVar2, 2);
            zzeeVar2.zzh(3);
            int i5 = 13;
            zzannVar2.zzp(zzeeVar2.zzj(13));
            zzefVar.zzl(zzeeVar2, 2);
            int i6 = 4;
            zzeeVar2.zzh(4);
            int i7 = 12;
            zzefVar.zzk(zzeeVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int zzd = zzefVar.zzd();
            while (zzd > 0) {
                int i8 = 5;
                zzefVar.zzl(zzeeVar2, 5);
                int zzj = zzeeVar2.zzj(8);
                zzeeVar2.zzh(i4);
                int zzj2 = zzeeVar2.zzj(i5);
                zzeeVar2.zzh(i6);
                int zzj3 = zzeeVar2.zzj(i7);
                int zzg = zzefVar.zzg();
                int i9 = zzg + zzj3;
                String str = null;
                ArrayList arrayList = null;
                int i10 = -1;
                int i11 = 0;
                while (zzefVar.zzg() < i9) {
                    int zzs = zzefVar.zzs();
                    int zzg2 = zzefVar.zzg() + zzefVar.zzs();
                    if (zzg2 > i9) {
                        break;
                    }
                    if (zzs == i8) {
                        long zzz = zzefVar.zzz();
                        if (zzz != 1094921523) {
                            if (zzz != 1161904947) {
                                if (zzz != 1094921524) {
                                    if (zzz == 1212503619) {
                                        i3 = 36;
                                        zzannVar = zzannVar2;
                                        i10 = i3;
                                        i = zzg2;
                                        zzeeVar = zzeeVar2;
                                        i2 = zzd;
                                    }
                                    zzannVar = zzannVar2;
                                    i = zzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = zzd;
                                }
                                zzannVar = zzannVar2;
                                i = zzg2;
                                zzeeVar = zzeeVar2;
                                i2 = zzd;
                                i10 = 172;
                            }
                            zzannVar = zzannVar2;
                            zzeeVar = zzeeVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzefVar.zzk(i - zzefVar.zzg());
                            zzd = i2;
                            zzeeVar2 = zzeeVar;
                            zzannVar2 = zzannVar;
                            i8 = 5;
                        }
                        zzannVar = zzannVar2;
                        i = zzg2;
                        zzeeVar = zzeeVar2;
                        i2 = zzd;
                        i10 = 129;
                    } else {
                        if (zzs != 106) {
                            if (zzs != 122) {
                                if (zzs == 127) {
                                    int zzs2 = zzefVar.zzs();
                                    if (zzs2 != 21) {
                                        if (zzs2 == 14) {
                                            i3 = TsExtractor.TS_STREAM_TYPE_DTS_HD;
                                        } else {
                                            if (zzs2 == 33) {
                                                i3 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                            }
                                            zzannVar = zzannVar2;
                                            i = zzg2;
                                            zzeeVar = zzeeVar2;
                                            i2 = zzd;
                                        }
                                    }
                                    zzannVar = zzannVar2;
                                    i = zzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = zzd;
                                    i10 = 172;
                                } else if (zzs == 123) {
                                    i3 = TsExtractor.TS_STREAM_TYPE_DTS;
                                } else if (zzs == 10) {
                                    String trim = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    i11 = zzefVar.zzs();
                                    zzannVar = zzannVar2;
                                    str = trim;
                                    i = zzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = zzd;
                                } else {
                                    if (zzs == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzefVar.zzg() < zzg2) {
                                            int i12 = zzg2;
                                            String trim2 = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzefVar.zzs();
                                            int i13 = zzd;
                                            byte[] bArr = new byte[4];
                                            zzefVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new zzano(trim2, zzs3, bArr));
                                            zzd = i13;
                                            zzg2 = i12;
                                            zzeeVar2 = zzeeVar2;
                                            zzannVar2 = zzannVar2;
                                        }
                                        zzannVar = zzannVar2;
                                        i = zzg2;
                                        zzeeVar = zzeeVar2;
                                        i2 = zzd;
                                        arrayList = arrayList2;
                                        i10 = 89;
                                    } else {
                                        zzannVar = zzannVar2;
                                        i = zzg2;
                                        zzeeVar = zzeeVar2;
                                        i2 = zzd;
                                        if (zzs == 111) {
                                            i10 = 257;
                                        }
                                    }
                                    zzefVar.zzk(i - zzefVar.zzg());
                                    zzd = i2;
                                    zzeeVar2 = zzeeVar;
                                    zzannVar2 = zzannVar;
                                    i8 = 5;
                                }
                                zzannVar = zzannVar2;
                                i10 = i3;
                                i = zzg2;
                                zzeeVar = zzeeVar2;
                                i2 = zzd;
                            }
                            zzannVar = zzannVar2;
                            zzeeVar = zzeeVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzefVar.zzk(i - zzefVar.zzg());
                            zzd = i2;
                            zzeeVar2 = zzeeVar;
                            zzannVar2 = zzannVar;
                            i8 = 5;
                        }
                        zzannVar = zzannVar2;
                        i = zzg2;
                        zzeeVar = zzeeVar2;
                        i2 = zzd;
                        i10 = 129;
                    }
                    zzefVar.zzk(i - zzefVar.zzg());
                    zzd = i2;
                    zzeeVar2 = zzeeVar;
                    zzannVar2 = zzannVar;
                    i8 = 5;
                }
                zzann zzannVar3 = zzannVar2;
                zzee zzeeVar3 = zzeeVar2;
                int i14 = zzd;
                zzefVar.zzh(i9);
                zzanp zzanpVar = new zzanp(i10, str, i11, arrayList, Arrays.copyOfRange(zzefVar.zzi(), zzg, i9));
                if (zzj == 6 || zzj == 5) {
                    zzj = zzanpVar.zza;
                }
                zzd = i14 - (zzj3 + 5);
                if (!zzannVar3.zzj().get(zzj2)) {
                    zzans zzb = zzannVar3.zzb().zzb(zzj, zzanpVar);
                    sparseIntArray.put(zzj2, zzj2);
                    sparseArray.put(zzj2, zzb);
                }
                i6 = 4;
                zzeeVar2 = zzeeVar3;
                zzannVar2 = zzannVar3;
                i4 = 3;
                i5 = 13;
                i7 = 12;
            }
            zzann zzannVar4 = zzannVar2;
            int size = sparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = sparseIntArray.keyAt(i15);
                int valueAt = sparseIntArray.valueAt(i15);
                zzannVar4.zzj().put(keyAt, true);
                zzannVar4.zzk().put(valueAt, true);
                zzans zzansVar = (zzans) sparseArray.valueAt(i15);
                if (zzansVar != null) {
                    zzansVar.zza(zzelVar, zzannVar4.zzl(), new zzanr(zzt, keyAt, 8192));
                    zzannVar4.zzc().put(valueAt, zzansVar);
                }
            }
            zzannVar4.zzc().remove(this.zze);
            zzannVar4.zzn(0);
            if (zzannVar4.zzm() == 0) {
                zzannVar4.zzl().zzv();
                zzannVar4.zzo(true);
            }
        }
    }
}
