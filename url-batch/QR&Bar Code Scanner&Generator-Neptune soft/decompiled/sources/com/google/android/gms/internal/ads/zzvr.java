package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzvr extends zzvw {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfwv zzc = zzfwv.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzux
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzvr.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfwv zzd = zzfwv.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzuy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzvr.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzvf zzg;
    private zzvk zzh;
    private zzk zzi;
    private final zzum zzj;

    @Deprecated
    public zzvr() {
        zzvf zzvfVar = zzvf.zzD;
        throw null;
    }

    protected static int zza(zzaf zzafVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String zzf = zzf(str);
        String zzf2 = zzf(zzafVar.zzd);
        if (zzf2 == null || zzf == null) {
            return (z && zzf2 == null) ? 1 : 0;
        }
        if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
            return 3;
        }
        return zzen.zzah(zzf2, "-")[0].equals(zzen.zzah(zzf, "-")[0]) ? 2 : 0;
    }

    protected static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r8.zzh.zzd(r8.zzi, r9) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean zzk(zzvr zzvrVar, zzaf zzafVar) {
        boolean z;
        char c;
        synchronized (zzvrVar.zze) {
            z = false;
            if (zzvrVar.zzg.zzP && !zzvrVar.zzf && zzafVar.zzz > 2) {
                String str = zzafVar.zzm;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                            }
                        }
                    }
                    if (zzen.zza >= 32) {
                        zzvk zzvkVar = zzvrVar.zzh;
                        if (zzvkVar != null) {
                            if (!zzvkVar.zzg()) {
                            }
                        }
                    }
                }
                if (zzen.zza >= 32) {
                    zzvk zzvkVar2 = zzvrVar.zzh;
                    if (zzvkVar2 != null) {
                        if (zzvkVar2.zzg()) {
                            if (zzvkVar2.zze()) {
                                if (zzvrVar.zzh.zzf()) {
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        return z;
    }

    protected static boolean zzm(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzs(zzuh zzuhVar, zzcu zzcuVar, Map map) {
        for (int i = 0; i < zzuhVar.zzc; i++) {
            if (((zzcr) zzcuVar.zzB.get(zzuhVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        boolean z;
        zzvk zzvkVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzP && !this.zzf && zzen.zza >= 32 && (zzvkVar = this.zzh) != null && zzvkVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzr();
        }
    }

    private static final Pair zzu(int i, zzvv zzvvVar, int[][][] iArr, zzvm zzvmVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        zzvv zzvvVar2 = zzvvVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i == zzvvVar2.zzc(i3)) {
                zzuh zzd2 = zzvvVar2.zzd(i3);
                for (int i4 = 0; i4 < zzd2.zzc; i4++) {
                    zzcp zzb2 = zzd2.zzb(i4);
                    List zza = zzvmVar.zza(i3, zzb2, iArr[i3][i4]);
                    int i5 = zzb2.zzb;
                    int i6 = 1;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (true) {
                        int i8 = zzb2.zzb;
                        if (i7 <= 0) {
                            zzvn zzvnVar = (zzvn) zza.get(i7);
                            int zzb3 = zzvnVar.zzb();
                            if (zArr[i7] || zzb3 == 0) {
                                i2 = i6;
                            } else {
                                if (zzb3 == i6) {
                                    randomAccess = zzfvn.zzp(zzvnVar);
                                    i2 = i6;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(zzvnVar);
                                    int i9 = i7 + 1;
                                    while (true) {
                                        int i10 = zzb2.zzb;
                                        if (i9 > 0) {
                                            break;
                                        }
                                        zzvn zzvnVar2 = (zzvn) zza.get(i9);
                                        if (zzvnVar2.zzb() == 2 && zzvnVar.zzc(zzvnVar2)) {
                                            arrayList2.add(zzvnVar2);
                                            zArr[i9] = true;
                                        }
                                        i9++;
                                    }
                                    i2 = 1;
                                    randomAccess = arrayList2;
                                }
                                arrayList.add(randomAccess);
                            }
                            i7++;
                            i6 = i2;
                        }
                    }
                }
            }
            i3++;
            zzvvVar2 = zzvvVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((zzvn) list.get(i11)).zzc;
        }
        zzvn zzvnVar3 = (zzvn) list.get(0);
        return Pair.create(new zzvs(zzvnVar3.zzb, iArr2, 0), Integer.valueOf(zzvnVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    protected final Pair zzb(zzvv zzvvVar, int[][][] iArr, final int[] iArr2, zzsi zzsiVar, zzcn zzcnVar) throws zzha {
        final zzvf zzvfVar;
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        zzvk zzvkVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzvfVar = this.zzg;
            if (zzvfVar.zzP && zzen.zza >= 32 && (zzvkVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdd.zzb(myLooper);
                zzvkVar.zzb(this, myLooper);
            }
        }
        int i2 = 2;
        zzvs[] zzvsVarArr = new zzvs[2];
        Pair zzu = zzu(2, zzvvVar, iArr4, new zzvm() { // from class: com.google.android.gms.internal.ads.zzut
            /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
            @Override // com.google.android.gms.internal.ads.zzvm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i3, zzcp zzcpVar, int[] iArr5) {
                int i4;
                int i5;
                int i6;
                Point point;
                int i7;
                int i8;
                zzvf zzvfVar2 = zzvf.this;
                int[] iArr6 = iArr2;
                int i9 = zzvr.zzb;
                int i10 = iArr6[i3];
                int i11 = zzvfVar2.zzl;
                int i12 = zzvfVar2.zzm;
                boolean z2 = zzvfVar2.zzn;
                int i13 = Integer.MAX_VALUE;
                if (i11 == Integer.MAX_VALUE) {
                    i13 = Integer.MAX_VALUE;
                } else if (i12 != Integer.MAX_VALUE) {
                    int i14 = Integer.MAX_VALUE;
                    int i15 = 0;
                    while (true) {
                        int i16 = zzcpVar.zzb;
                        if (i15 > 0) {
                            break;
                        }
                        zzaf zzb2 = zzcpVar.zzb(i15);
                        int i17 = zzb2.zzr;
                        if (i17 > 0 && (i4 = zzb2.zzs) > 0) {
                            if (z2) {
                                if ((i17 > i4) != (i11 > i12)) {
                                    i6 = i11;
                                    i5 = i12;
                                    int i18 = i17 * i6;
                                    int i19 = i4 * i5;
                                    point = i18 < i19 ? new Point(i5, zzen.zze(i19, i17)) : new Point(zzen.zze(i18, i4), i6);
                                    i7 = zzb2.zzr;
                                    i8 = zzb2.zzs * i7;
                                    if (i7 >= ((int) (point.x * 0.98f)) && zzb2.zzs >= ((int) (point.y * 0.98f)) && i8 < i14) {
                                        i14 = i8;
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
                                i14 = i8;
                            }
                        }
                        i15++;
                    }
                    i13 = i14;
                }
                zzfvk zzi = zzfvn.zzi();
                int i20 = 0;
                while (true) {
                    int i21 = zzcpVar.zzb;
                    if (i20 > 0) {
                        return zzi.zzg();
                    }
                    int zza = zzcpVar.zzb(i20).zza();
                    zzi.zze(new zzvq(i3, zzcpVar, i20, zzvfVar2, iArr5[i20], i10, i13 == Integer.MAX_VALUE || (zza != -1 && zza <= i13)));
                    i20++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfvc.zzj().zzc((zzvq) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvo
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zzd((zzvq) obj3, (zzvq) obj4);
                    }
                }), (zzvq) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvo
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zzd((zzvq) obj3, (zzvq) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvo
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zzd((zzvq) obj3, (zzvq) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzvq) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvp
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zza((zzvq) obj3, (zzvq) obj4);
                    }
                }), (zzvq) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvp
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zza((zzvq) obj3, (zzvq) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvp
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzvq.zza((zzvq) obj3, (zzvq) obj4);
                    }
                }).zza();
            }
        });
        if (zzu != null) {
            zzvsVarArr[((Integer) zzu.second).intValue()] = (zzvs) zzu.first;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzvvVar.zzc(i4) == 2 && zzvvVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair zzu2 = zzu(1, zzvvVar, iArr4, new zzvm() { // from class: com.google.android.gms.internal.ads.zzur
            @Override // com.google.android.gms.internal.ads.zzvm
            public final List zza(int i5, zzcp zzcpVar, int[] iArr5) {
                final zzvr zzvrVar = zzvr.this;
                zzvf zzvfVar2 = zzvfVar;
                boolean z2 = z;
                zzfsy zzfsyVar = new zzfsy() { // from class: com.google.android.gms.internal.ads.zzuq
                    @Override // com.google.android.gms.internal.ads.zzfsy
                    public final boolean zza(Object obj) {
                        return zzvr.zzk(zzvr.this, (zzaf) obj);
                    }
                };
                zzfvk zzi = zzfvn.zzi();
                int i6 = 0;
                while (true) {
                    int i7 = zzcpVar.zzb;
                    if (i6 > 0) {
                        return zzi.zzg();
                    }
                    zzi.zze(new zzuz(i5, zzcpVar, i6, zzvfVar2, iArr5[i6], z2, zzfsyVar));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzuz) Collections.max((List) obj)).zza((zzuz) Collections.max((List) obj2));
            }
        });
        if (zzu2 != null) {
            zzvsVarArr[((Integer) zzu2.second).intValue()] = (zzvs) zzu2.first;
        }
        final String str = zzu2 == null ? null : ((zzvs) zzu2.first).zza.zzb(((zzvs) zzu2.first).zzb[0]).zzd;
        int i5 = 3;
        Pair zzu3 = zzu(3, zzvvVar, iArr4, new zzvm() { // from class: com.google.android.gms.internal.ads.zzuv
            @Override // com.google.android.gms.internal.ads.zzvm
            public final List zza(int i6, zzcp zzcpVar, int[] iArr5) {
                zzvf zzvfVar2 = zzvf.this;
                String str2 = str;
                int i7 = zzvr.zzb;
                zzfvk zzi = zzfvn.zzi();
                int i8 = 0;
                while (true) {
                    int i9 = zzcpVar.zzb;
                    if (i8 > 0) {
                        return zzi.zzg();
                    }
                    zzi.zze(new zzvl(i6, zzcpVar, i8, zzvfVar2, iArr5[i8], str2));
                    i8++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvl) ((List) obj).get(0)).zza((zzvl) ((List) obj2).get(0));
            }
        });
        if (zzu3 != null) {
            zzvsVarArr[((Integer) zzu3.second).intValue()] = (zzvs) zzu3.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int zzc2 = zzvvVar.zzc(i6);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i5) {
                zzuh zzd2 = zzvvVar.zzd(i6);
                int[][] iArr5 = iArr4[i6];
                int i7 = i3;
                int i8 = i7;
                zzcp zzcpVar = null;
                zzva zzvaVar = null;
                while (i7 < zzd2.zzc) {
                    zzcp zzb2 = zzd2.zzb(i7);
                    int[] iArr6 = iArr5[i7];
                    int i9 = i3;
                    zzva zzvaVar2 = zzvaVar;
                    while (true) {
                        int i10 = zzb2.zzb;
                        if (i9 <= 0) {
                            if (zzm(iArr6[i9], zzvfVar.zzQ)) {
                                zzva zzvaVar3 = new zzva(zzb2.zzb(i9), iArr6[i9]);
                                if (zzvaVar2 == null || zzvaVar3.compareTo(zzvaVar2) > 0) {
                                    i8 = i9;
                                    zzvaVar2 = zzvaVar3;
                                    zzcpVar = zzb2;
                                }
                            }
                            i9++;
                        }
                    }
                    i7++;
                    zzvaVar = zzvaVar2;
                    i3 = 0;
                }
                zzvsVarArr[i6] = zzcpVar == null ? null : new zzvs(zzcpVar, new int[]{i8}, 0);
            }
            i6++;
            iArr4 = iArr;
            i2 = 2;
            i3 = 0;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        int i11 = 2;
        for (int i12 = 0; i12 < 2; i12++) {
            zzs(zzvvVar.zzd(i12), zzvfVar, hashMap);
        }
        zzs(zzvvVar.zze(), zzvfVar, hashMap);
        for (int i13 = 0; i13 < 2; i13++) {
            if (((zzcr) hashMap.get(Integer.valueOf(zzvvVar.zzc(i13)))) != null) {
                throw null;
            }
        }
        int[] iArr7 = null;
        int i14 = 0;
        while (i14 < i11) {
            zzuh zzd3 = zzvvVar.zzd(i14);
            if (zzvfVar.zzg(i14, zzd3)) {
                zzvsVarArr[i14] = (zzvfVar.zze(i14, zzd3) == null || iArr7.length == 0) ? null : new zzvs(zzd3.zzb(0), iArr7, 0);
            }
            i14++;
            iArr7 = null;
            i11 = 2;
        }
        int i15 = 0;
        for (int i16 = i11; i15 < i16; i16 = 2) {
            int zzc3 = zzvvVar.zzc(i15);
            if (zzvfVar.zzf(i15) || zzvfVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzvsVarArr[i15] = null;
            }
            i15++;
        }
        zzum zzumVar = this.zzj;
        zzwh zzp = zzp();
        zzfvn zzf = zzun.zzf(zzvsVarArr);
        int i17 = 2;
        zzvt[] zzvtVarArr = new zzvt[2];
        int i18 = 0;
        while (i18 < i17) {
            zzvs zzvsVar = zzvsVarArr[i18];
            if (zzvsVar != null && (length = (iArr3 = zzvsVar.zzb).length) != 0) {
                zzvtVarArr[i18] = length == 1 ? new zzvu(zzvsVar.zza, iArr3[0], 0, 0, null) : zzumVar.zza(zzvsVar.zza, iArr3, 0, zzp, (zzfvn) zzf.get(i18));
            }
            i18++;
            i17 = 2;
        }
        zzkc[] zzkcVarArr = new zzkc[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            zzkcVarArr[i19] = (zzvfVar.zzf(i19) || zzvfVar.zzC.contains(Integer.valueOf(zzvvVar.zzc(i19))) || (zzvvVar.zzc(i19) != -2 && zzvtVarArr[i19] == null)) ? null : zzkc.zza;
        }
        boolean z2 = zzvfVar.zzR;
        return Pair.create(zzkcVarArr, zzvtVarArr);
    }

    public final zzvf zzc() {
        zzvf zzvfVar;
        synchronized (this.zze) {
            zzvfVar = this.zzg;
        }
        return zzvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzh() {
        zzvk zzvkVar;
        synchronized (this.zze) {
            if (zzen.zza >= 32 && (zzvkVar = this.zzh) != null) {
                zzvkVar.zzc();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzi(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzt();
        }
    }

    public final void zzj(zzvd zzvdVar) {
        boolean z;
        zzvf zzvfVar = new zzvf(zzvdVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzvfVar);
            this.zzg = zzvfVar;
        }
        if (z) {
            if (zzvfVar.zzP && this.zza == null) {
                zzdw.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzl() {
        return true;
    }

    public zzvr(Context context) {
        zzum zzumVar = new zzum();
        zzvf zzd2 = zzvf.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzumVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzen.zzX(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzen.zza >= 32) {
            this.zzh = zzvk.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzdw.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
