package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzvf extends zzvk {
    public static final /* synthetic */ int zza = 0;
    private static final zzfsp zzb = zzfsp.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuo
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzvf.zza;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfsp zzc = zzfsp.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzup
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzvf.zza;
            return 0;
        }
    });
    private final AtomicReference zzd;
    private final zzue zze;

    @Deprecated
    public zzvf() {
        zzuu zzuuVar = zzuu.zzC;
        throw null;
    }

    protected static int zza(zzad zzadVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzadVar.zzd)) {
            return 4;
        }
        String zzf = zzf(str);
        String zzf2 = zzf(zzadVar.zzd);
        if (zzf2 == null || zzf == null) {
            return (z && zzf2 == null) ? 1 : 0;
        }
        if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
            return 3;
        }
        return zzeg.zzag(zzf2, "-")[0].equals(zzeg.zzag(zzf, "-")[0]) ? 2 : 0;
    }

    protected static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static boolean zzi(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzo(zztz zztzVar, zzcp zzcpVar, Map map) {
        for (int i = 0; i < zztzVar.zzc; i++) {
            if (((zzcm) zzcpVar.zzA.get(zztzVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzp(int i, zzvj zzvjVar, int[][][] iArr, zzva zzvaVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzvj zzvjVar2 = zzvjVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzvjVar2.zzc(i2)) {
                zztz zzd = zzvjVar2.zzd(i2);
                for (int i3 = 0; i3 < zzd.zzc; i3++) {
                    zzck zzb2 = zzd.zzb(i3);
                    List zza2 = zzvaVar.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (true) {
                        int i7 = zzb2.zzb;
                        if (i6 <= 0) {
                            zzvb zzvbVar = (zzvb) zza2.get(i6);
                            int zzb3 = zzvbVar.zzb();
                            if (!zArr[i6] && zzb3 != 0) {
                                if (zzb3 == i5) {
                                    randomAccess = zzfrh.zzp(zzvbVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(zzvbVar);
                                    int i8 = i6 + 1;
                                    while (true) {
                                        int i9 = zzb2.zzb;
                                        if (i8 > 0) {
                                            break;
                                        }
                                        zzvb zzvbVar2 = (zzvb) zza2.get(i8);
                                        if (zzvbVar2.zzb() == 2 && zzvbVar.zzc(zzvbVar2)) {
                                            arrayList2.add(zzvbVar2);
                                            zArr[i8] = true;
                                        }
                                        i8++;
                                    }
                                    randomAccess = arrayList2;
                                }
                                arrayList.add(randomAccess);
                            }
                            i6++;
                            i5 = 1;
                        }
                    }
                }
            }
            i2++;
            zzvjVar2 = zzvjVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzvb) list.get(i10)).zzc;
        }
        zzvb zzvbVar3 = (zzvb) list.get(0);
        return Pair.create(new zzvg(zzvbVar3.zzb, iArr2, 0), Integer.valueOf(zzvbVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    protected final Pair zzb(zzvj zzvjVar, int[][][] iArr, final int[] iArr2, zzsb zzsbVar, zzci zzciVar) throws zzgu {
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        int[][][] iArr4 = iArr;
        final zzuu zzuuVar = (zzuu) this.zzd.get();
        int i2 = 2;
        zzvg[] zzvgVarArr = new zzvg[2];
        Pair zzp = zzp(2, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzuk
            /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzva
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i3, zzck zzckVar, int[] iArr5) {
                int i4;
                int i5;
                int i6;
                Point point;
                int i7;
                int i8;
                zzuu zzuuVar2 = zzuu.this;
                int[] iArr6 = iArr2;
                int i9 = zzvf.zza;
                int i10 = iArr6[i3];
                int i11 = zzuuVar2.zzl;
                int i12 = zzuuVar2.zzm;
                boolean z2 = zzuuVar2.zzn;
                int i13 = Integer.MAX_VALUE;
                if (i11 == Integer.MAX_VALUE) {
                    i13 = Integer.MAX_VALUE;
                } else if (i12 != Integer.MAX_VALUE) {
                    int i14 = 0;
                    int i15 = Integer.MAX_VALUE;
                    while (true) {
                        int i16 = zzckVar.zzb;
                        if (i14 > 0) {
                            break;
                        }
                        zzad zzb2 = zzckVar.zzb(i14);
                        int i17 = zzb2.zzr;
                        if (i17 > 0 && (i4 = zzb2.zzs) > 0) {
                            if (z2) {
                                if ((i17 > i4) != (i11 > i12)) {
                                    i6 = i11;
                                    i5 = i12;
                                    int i18 = i17 * i6;
                                    int i19 = i4 * i5;
                                    point = i18 < i19 ? new Point(i5, zzeg.zze(i19, i17)) : new Point(zzeg.zze(i18, i4), i6);
                                    i7 = zzb2.zzr;
                                    i8 = zzb2.zzs * i7;
                                    if (i7 >= ((int) (point.x * 0.98f)) && zzb2.zzs >= ((int) (point.y * 0.98f)) && i8 < i15) {
                                        i15 = i8;
                                    }
                                }
                            }
                            i5 = i11;
                            i6 = i12;
                            int i182 = i17 * i6;
                            int i192 = i4 * i5;
                            if (i182 < i192) {
                            }
                            i7 = zzb2.zzr;
                            i8 = zzb2.zzs * i7;
                            if (i7 >= ((int) (point.x * 0.98f))) {
                                i15 = i8;
                            }
                        }
                        i14++;
                    }
                    i13 = i15;
                }
                zzfre zzi = zzfrh.zzi();
                int i20 = 0;
                while (true) {
                    int i21 = zzckVar.zzb;
                    if (i20 > 0) {
                        return zzi.zzg();
                    }
                    int zza2 = zzckVar.zzb(i20).zza();
                    zzi.zze(new zzve(i3, zzckVar, i20, zzuuVar2, iArr5[i20], i10, i13 == Integer.MAX_VALUE || (zza2 != -1 && zza2 <= i13)));
                    i20++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfqw.zzj().zzc((zzve) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zzd((zzve) obj3, (zzve) obj4);
                    }
                }), (zzve) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zzd((zzve) obj3, (zzve) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zzd((zzve) obj3, (zzve) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzve) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zza((zzve) obj3, (zzve) obj4);
                    }
                }), (zzve) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zza((zzve) obj3, (zzve) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzve.zza((zzve) obj3, (zzve) obj4);
                    }
                }).zza();
            }
        });
        if (zzp != null) {
            zzvgVarArr[((Integer) zzp.second).intValue()] = (zzvg) zzp.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            }
            if (zzvjVar.zzc(i3) == 2 && zzvjVar.zzd(i3).zzc > 0) {
                z = true;
                break;
            }
            i3++;
        }
        Pair zzp2 = zzp(1, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzui
            @Override // com.google.android.gms.internal.ads.zzva
            public final List zza(int i4, zzck zzckVar, int[] iArr5) {
                zzuu zzuuVar2 = zzuu.this;
                boolean z2 = z;
                int i5 = zzvf.zza;
                zzfre zzi = zzfrh.zzi();
                int i6 = 0;
                while (true) {
                    int i7 = zzckVar.zzb;
                    if (i6 > 0) {
                        return zzi.zzg();
                    }
                    zzi.zze(new zzuq(i4, zzckVar, i6, zzuuVar2, iArr5[i6], z2));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzuq) Collections.max((List) obj)).zza((zzuq) Collections.max((List) obj2));
            }
        });
        if (zzp2 != null) {
            zzvgVarArr[((Integer) zzp2.second).intValue()] = (zzvg) zzp2.first;
        }
        final String str = zzp2 == null ? null : ((zzvg) zzp2.first).zza.zzb(((zzvg) zzp2.first).zzb[0]).zzd;
        int i4 = 3;
        Pair zzp3 = zzp(3, zzvjVar, iArr4, new zzva() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzva
            public final List zza(int i5, zzck zzckVar, int[] iArr5) {
                zzuu zzuuVar2 = zzuu.this;
                String str2 = str;
                int i6 = zzvf.zza;
                zzfre zzi = zzfrh.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzckVar.zzb;
                    if (i7 > 0) {
                        return zzi.zzg();
                    }
                    zzi.zze(new zzuz(i5, zzckVar, i7, zzuuVar2, iArr5[i7], str2));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzun
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzuz) ((List) obj).get(0)).zza((zzuz) ((List) obj2).get(0));
            }
        });
        if (zzp3 != null) {
            zzvgVarArr[((Integer) zzp3.second).intValue()] = (zzvg) zzp3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int zzc2 = zzvjVar.zzc(i5);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i4) {
                zztz zzd = zzvjVar.zzd(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                zzck zzckVar = null;
                int i7 = 0;
                zzur zzurVar = null;
                while (i6 < zzd.zzc) {
                    zzck zzb2 = zzd.zzb(i6);
                    int[] iArr6 = iArr5[i6];
                    zzur zzurVar2 = zzurVar;
                    int i8 = 0;
                    while (true) {
                        int i9 = zzb2.zzb;
                        if (i8 <= 0) {
                            if (zzi(iArr6[i8], zzuuVar.zzP)) {
                                zzur zzurVar3 = new zzur(zzb2.zzb(i8), iArr6[i8]);
                                if (zzurVar2 == null || zzurVar3.compareTo(zzurVar2) > 0) {
                                    i7 = i8;
                                    zzurVar2 = zzurVar3;
                                    zzckVar = zzb2;
                                }
                            }
                            i8++;
                        }
                    }
                    i6++;
                    zzurVar = zzurVar2;
                }
                zzvgVarArr[i5] = zzckVar == null ? null : new zzvg(zzckVar, new int[]{i7}, 0);
            }
            i5++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzo(zzvjVar.zzd(i10), zzuuVar, hashMap);
        }
        zzo(zzvjVar.zze(), zzuuVar, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzcm) hashMap.get(Integer.valueOf(zzvjVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int[] iArr7 = null;
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            zztz zzd2 = zzvjVar.zzd(i12);
            if (zzuuVar.zzg(i12, zzd2)) {
                zzvgVarArr[i12] = (zzuuVar.zze(i12, zzd2) == null || iArr7.length == 0) ? null : new zzvg(zzd2.zzb(0), iArr7, 0);
            }
            i12++;
            iArr7 = null;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int zzc3 = zzvjVar.zzc(i14);
            if (zzuuVar.zzf(i14) || zzuuVar.zzB.contains(Integer.valueOf(zzc3))) {
                zzvgVarArr[i14] = null;
            }
            i14++;
        }
        zzue zzueVar = this.zze;
        zzvv zzl = zzl();
        zzfrh zzf = zzuf.zzf(zzvgVarArr);
        int i16 = 2;
        zzvh[] zzvhVarArr = new zzvh[2];
        int i17 = 0;
        while (i17 < i16) {
            zzvg zzvgVar = zzvgVarArr[i17];
            if (zzvgVar != null && (length = (iArr3 = zzvgVar.zzb).length) != 0) {
                zzvhVarArr[i17] = length == 1 ? new zzvi(zzvgVar.zza, iArr3[0], 0, 0, null) : zzueVar.zza(zzvgVar.zza, iArr3, 0, zzl, (zzfrh) zzf.get(i17));
            }
            i17++;
            i16 = 2;
        }
        zzjw[] zzjwVarArr = new zzjw[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zzjwVarArr[i18] = (zzuuVar.zzf(i18) || zzuuVar.zzB.contains(Integer.valueOf(zzvjVar.zzc(i18))) || (zzvjVar.zzc(i18) != -2 && zzvhVarArr[i18] == null)) ? null : zzjw.zza;
        }
        boolean z2 = zzuuVar.zzQ;
        return Pair.create(zzjwVarArr, zzvhVarArr);
    }

    public final zzuu zzc() {
        return (zzuu) this.zzd.get();
    }

    public final void zzg(zzuw zzuwVar) {
        zzuu zzuuVar = new zzuu(zzuwVar);
        if (((zzuu) this.zzd.getAndSet(zzuuVar)).equals(zzuuVar)) {
            return;
        }
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final boolean zzh() {
        return true;
    }

    public zzvf(Context context) {
        zzue zzueVar = new zzue();
        zzuu zzc2 = zzuu.zzc(context);
        this.zze = zzueVar;
        this.zzd = new AtomicReference(zzc2);
    }
}
