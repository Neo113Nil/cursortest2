package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzabc extends zzabi implements zznf {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgzg zzc = zzgzg.zzc(zzaal.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy
    private zzaaq zze;

    @Nullable
    @GuardedBy
    private Thread zzf;

    @Nullable
    private zzacr zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzx zzj;

    public zzabc(Context context) {
        zzzx zzzxVar = new zzzx();
        zzaaq zzaaqVar = zzaaq.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzzxVar;
        if (zzaaqVar != null) {
            this.zze = zzaaqVar;
        } else {
            zzaap zzaapVar = new zzaap(zzaaqVar, bArr);
            zzaapVar.zzx((zzbl) zzaaqVar);
            this.zze = new zzaaq(zzaapVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    private static Pair zzA(zzabd[] zzabdVarArr, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzabd zzabdVar = zzabdVarArr[i2];
            if (zzabdVar != null && zzabdVar.zza.zzc == i) {
                return Pair.create(zzabdVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    @Nullable
    private static final Pair zzB(int i, zzabh zzabhVar, int[][][] iArr, zzaat zzaatVar, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z;
        zzabh zzabhVar2 = zzabhVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzabhVar2.zza(i2)) {
                zzzr zzb2 = zzabhVar2.zzb(i2);
                for (int i3 = 0; i3 < zzb2.zzb; i3++) {
                    zzbg zza = zzb2.zza(i3);
                    List zza2 = zzaatVar.zza(i2, zza, iArr[i2][i3]);
                    int i4 = zza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzaau zzaauVar = (zzaau) zza2.get(i5);
                        int zza3 = zzaauVar.zza();
                        if (!zArr[i5] && zza3 != 0) {
                            if (zza3 == 1) {
                                randomAccess = zzgxm.zzj(zzaauVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaauVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzaau zzaauVar2 = (zzaau) zza2.get(i7);
                                    if (zzaauVar2.zza() == 2 && zzaauVar.zzc(zzaauVar2)) {
                                        arrayList2.add(zzaauVar2);
                                        z = true;
                                        zArr[i7] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzabhVar2 = zzabhVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzaau) list.get(i8)).zzc;
        }
        zzaau zzaauVar3 = (zzaau) list.get(0);
        return Pair.create(new zzabd(zzaauVar3.zzb, iArr2, 0), Integer.valueOf(zzaauVar3.zza));
    }

    @Nullable
    protected static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String zzi = zzi(str);
        String zzi2 = zzi(zzvVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        String str2 = zzfm.zza;
        return zzi2.split("-", 2)[0].equals(zzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ int zzn(zzv zzvVar, zzgxm zzgxmVar) {
        int i = 0;
        while (i < zzgxmVar.size()) {
            int i2 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i2 < list.size()) {
                    if (((zzx) list.get(i2)).zzb.equals(zzgxmVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    @Nullable
    protected static final zzabd zzp(int i, zzzr zzzrVar, int[][] iArr, zzaaq zzaaqVar) throws zzjn {
        int i2 = zzaaqVar.zzw.zzb;
        int i3 = 0;
        zzbg zzbgVar = null;
        zzaao zzaaoVar = null;
        for (int i4 = 0; i4 < zzzrVar.zzb; i4++) {
            zzbg zza = zzzrVar.zza(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < zza.zza; i5++) {
                if (zzng.zzad(iArr2[i5], zzaaqVar.zzV)) {
                    zzaao zzaaoVar2 = new zzaao(zza.zza(i5), iArr2[i5]);
                    if (zzaaoVar == null || zzaaoVar2.compareTo(zzaaoVar) > 0) {
                        zzbgVar = zza;
                        i3 = i5;
                        zzaaoVar = zzaaoVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzabd(zzbgVar, new int[]{i3}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z;
        zzacr zzacrVar;
        synchronized (this.zzd) {
            try {
                z = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null && zzacrVar.zzb()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static void zzw(zzabh zzabhVar, zzbl zzblVar, zzabd[] zzabdVarArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            zzx(zzabhVar.zzb(i), zzblVar, hashMap);
        }
        zzx(zzabhVar.zze(), zzblVar, hashMap);
        for (int i2 = 0; i2 < 2; i2++) {
            if (((zzbh) hashMap.get(Integer.valueOf(zzabhVar.zza(i2)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzr zzzrVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzzrVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzzrVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i = 0; i < 2; i++) {
            zzzr zzb2 = zzabhVar.zzb(i);
            if (zzaaqVar.zzb(i, zzb2)) {
                if (zzaaqVar.zzc(i, zzb2) != null) {
                    throw null;
                }
                zzabdVarArr[i] = null;
            }
        }
    }

    private static void zzz(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i = 0; i < 2; i++) {
            int zza = zzabhVar.zza(i);
            if (zzaaqVar.zza(i) || zzaaqVar.zzI.contains(Integer.valueOf(zza))) {
                zzabdVarArr[i] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final void zza(zzne zzneVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzb() {
        zzacr zzacrVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzguk.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null) {
            zzacrVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaaq zzc() {
        zzaaq zzaaqVar;
        synchronized (this.zzd) {
            zzaaqVar = this.zze;
        }
        return zzaaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaap zzaapVar) {
        boolean equals;
        zzaaq zzaaqVar = new zzaaq(zzaapVar, null);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzaaqVar);
            this.zze = zzaaqVar;
        }
        if (equals) {
            return;
        }
        if (zzaaqVar.zzU && this.zza == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    @Nullable
    public final zznf zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    protected final Pair zzh(zzabh zzabhVar, int[][][] iArr, final int[] iArr2, zzxo zzxoVar, zzbf zzbfVar) throws zzjn {
        final zzaaq zzaaqVar;
        final String str;
        int i;
        final String str2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z;
        Context context3;
        int i2 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaaqVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfm.zzR(context3));
        }
        if (zzaaqVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzacr(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaam
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzabc.this.zzk();
                }
            }, this.zzi);
        }
        zzabd[] zzabdVarArr = new zzabd[2];
        zzw(zzabhVar, zzaaqVar, zzabdVarArr);
        zzy(zzabhVar, zzaaqVar, zzabdVarArr);
        zzz(zzabhVar, zzaaqVar, zzabdVarArr);
        Pair zzA = zzA(zzabdVarArr, 1);
        int i3 = 0;
        if (zzA == null) {
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
                    z = false;
                    break;
                }
                if (zzabhVar.zza(i4) == 2 && zzabhVar.zzb(i4).zzb > 0) {
                    z = true;
                    break;
                }
                i4++;
            }
            zzA = zzB(1, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaah
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i5, zzbg zzbgVar, int[] iArr3) {
                    zzaah zzaahVar = this;
                    final zzabc zzabcVar = zzabc.this;
                    final zzaaq zzaaqVar2 = zzaaqVar;
                    zzgul zzgulVar = new zzgul() { // from class: com.google.android.gms.internal.ads.zzaak
                        @Override // com.google.android.gms.internal.ads.zzgul
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzabc.this.zzl(zzaaqVar2, (zzv) obj);
                        }
                    };
                    int i6 = iArr2[i5];
                    int i7 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    int i8 = 0;
                    while (i8 < zzbgVar.zza) {
                        zzgxjVar.zzf(new zzaab(i5, zzbgVar, i8, zzaaqVar2, iArr3[i8], z, zzgulVar, i6));
                        i8++;
                        zzaahVar = this;
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaac.zza);
            if (zzA != null) {
                zzabdVarArr[((Integer) zzA.second).intValue()] = (zzabd) zzA.first;
            }
        }
        if (zzA == null) {
            str = null;
        } else {
            Object obj = zzA.first;
            str = ((zzabd) obj).zza.zza(((zzabd) obj).zzb[0]).zzd;
        }
        Pair zzA2 = zzA(zzabdVarArr, 2);
        Pair zzA3 = zzA(zzabdVarArr, 4);
        if (zzA2 == null && zzA3 == null) {
            int i5 = zzaaqVar.zzw.zzb;
            final Point zzT = (!zzaaqVar.zzk || (context2 = this.zza) == null) ? null : zzfm.zzT(context2);
            Pair zzB = zzB(2, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaag
                /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x005f  */
                @Override // com.google.android.gms.internal.ads.zzaat
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr3) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    Point point;
                    int i11;
                    int i12 = zzabc.zzb;
                    Point point2 = zzT;
                    int i13 = iArr2[i6];
                    zzaaq zzaaqVar2 = zzaaq.this;
                    int i14 = point2 != null ? point2.x : zzaaqVar2.zzi;
                    int i15 = point2 != null ? point2.y : zzaaqVar2.zzj;
                    boolean z2 = zzaaqVar2.zzl;
                    int i16 = -1;
                    if (i14 == Integer.MAX_VALUE) {
                        i7 = Integer.MAX_VALUE;
                    } else if (i15 == Integer.MAX_VALUE) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        int i17 = Integer.MAX_VALUE;
                        for (int i18 = 0; i18 < zzbgVar.zza; i18++) {
                            zzv zza = zzbgVar.zza(i18);
                            int i19 = zza.zzw;
                            if (i19 > 0 && (i8 = zza.zzx) > 0) {
                                if (z2) {
                                    if ((i19 > i8) != (i14 > i15)) {
                                        i10 = i15;
                                        i9 = i14;
                                        if (i19 * i9 < i8 * i10) {
                                            String str3 = zzfm.zza;
                                            point = new Point(i10, ((r11 + i19) - 1) / i19);
                                        } else {
                                            String str4 = zzfm.zza;
                                            point = new Point(((r9 + i8) - 1) / i8, i9);
                                        }
                                        i11 = i19 * i8;
                                        if (i19 >= ((int) (point.x * 0.98f)) && i8 >= ((int) (point.y * 0.98f)) && i11 < i17) {
                                            i17 = i11;
                                        }
                                    }
                                }
                                i9 = i15;
                                i10 = i14;
                                if (i19 * i9 < i8 * i10) {
                                }
                                i11 = i19 * i8;
                                if (i19 >= ((int) (point.x * 0.98f))) {
                                    i17 = i11;
                                }
                            }
                        }
                        i7 = i17;
                    }
                    int i20 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    int i21 = 0;
                    while (i21 < zzbgVar.zza) {
                        int zzc2 = zzbgVar.zza(i21).zzc();
                        zzgxjVar.zzf(new zzabb(i6, zzbgVar, i21, zzaaqVar2, iArr3[i21], str, i13, i7 == Integer.MAX_VALUE || (zzc2 != i16 && zzc2 <= i7)));
                        i21++;
                        i16 = -1;
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaaf.zza);
            Pair zzB2 = zzB == null ? zzB(4, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr3) {
                    int i7 = zzabc.zzb;
                    int i8 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    for (int i9 = 0; i9 < zzbgVar.zza; i9++) {
                        zzgxjVar.zzf(new zzaan(i6, zzbgVar, i9, zzaaq.this, iArr3[i9]));
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaad.zza) : null;
            if (zzB2 != null) {
                zzabdVarArr[((Integer) zzB2.second).intValue()] = (zzabd) zzB2.first;
            } else if (zzB != null) {
                zzabdVarArr[((Integer) zzB.second).intValue()] = (zzabd) zzB.first;
            }
        }
        if (zzA(zzabdVarArr, 3) == null) {
            int i6 = zzaaqVar.zzw.zzb;
            if (!zzaaqVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str2 = null;
            } else {
                String str3 = zzfm.zza;
                str2 = locale.toLanguageTag();
            }
            Pair zzB3 = zzB(3, zzabhVar, iArr, new zzaat() { // from class: com.google.android.gms.internal.ads.zzaai
                @Override // com.google.android.gms.internal.ads.zzaat
                public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr3) {
                    int i8 = zzabc.zzb;
                    int i9 = zzgxm.zzd;
                    zzgxj zzgxjVar = new zzgxj();
                    for (int i10 = 0; i10 < zzbgVar.zza; i10++) {
                        String str4 = str2;
                        int i11 = i10;
                        zzgxjVar.zzf(new zzaas(i7, zzbgVar, i11, zzaaq.this, iArr3[i10], str, str4));
                    }
                    return zzgxjVar.zzi();
                }
            }, zzaae.zza);
            if (zzB3 != null) {
                zzabdVarArr[((Integer) zzB3.second).intValue()] = (zzabd) zzB3.first;
            }
        }
        int i7 = zzaaqVar.zzw.zzb;
        zzgxv zzgxvVar = new zzgxv();
        int i8 = 0;
        while (i8 < 2) {
            zzabd zzabdVar = zzabdVarArr[i8];
            if (zzabdVar != null && !zzaaqVar.zza(i8)) {
                zzgxw zzgxwVar = zzaaqVar.zzI;
                zzbg zzbgVar = zzabdVar.zza;
                if (!zzgxwVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgxvVar.zzf(zzbgVar.zzb);
                    int i9 = i3;
                    while (true) {
                        int[] iArr3 = zzabdVar.zzb;
                        if (i9 < iArr3.length) {
                            String str4 = zzbgVar.zza(iArr3[i9]).zzn;
                            if (str4 != null) {
                                zzgxvVar.zzf(str4);
                            }
                            i9++;
                        }
                    }
                }
            }
            i8++;
            i3 = 0;
        }
        zzgxw zzh = zzgxvVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            if (zzabhVar.zza(i10) == 5) {
                zzzr zzb2 = zzabhVar.zzb(i10);
                for (int i12 = 0; i12 < zzb2.zzb; i12++) {
                    zzbg zza = zzb2.zza(i12);
                    arrayList.add(zza);
                    int[] iArr4 = (int[]) iArr[i10][i12].clone();
                    for (int i13 = 0; i13 < iArr4.length; i13++) {
                        String str5 = zza.zza(i13).zzn;
                        if (str5 != null && !zzh.contains(str5)) {
                            iArr4[i13] = 128;
                        }
                    }
                    i2 = 1;
                    arrayList2.add(iArr4);
                }
            }
            i10 += i2;
        }
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfm.zzc(arrayList, zzbgVarArr);
        zzzr zzzrVar = new zzzr(zzbgVarArr);
        int[][] iArr5 = new int[arrayList2.size()][];
        zzfm.zzc(arrayList2, iArr5);
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            if (zzabhVar.zza(i14) == 5) {
                zzabd zzp = zzp(5, zzzrVar, iArr5, zzaaqVar);
                zzabdVarArr[i14] = zzp;
                if (zzp == null) {
                    break;
                }
                Arrays.fill(iArr5[zzzrVar.zzb(zzp.zza)], 128);
            }
            i14++;
        }
        int i16 = 1;
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            int zza2 = zzabhVar.zza(i17);
            if (zza2 != i18 && zza2 != i16) {
                if (zza2 != 3 && zza2 != 4 && zza2 != 5 && zzabdVarArr[i17] == null) {
                    zzabdVarArr[i17] = zzp(zza2, zzabhVar.zzb(i17), iArr[i17], zzaaqVar);
                }
            }
            i17++;
            i16 = 1;
        }
        zzw(zzabhVar, zzaaqVar, zzabdVarArr);
        zzy(zzabhVar, zzaaqVar, zzabdVarArr);
        zzz(zzabhVar, zzaaqVar, zzabdVarArr);
        zzzx zzzxVar = this.zzj;
        zzabu zzu = zzu();
        zzgxm zzd = zzzy.zzd(zzabdVarArr);
        int i19 = 2;
        zzabe[] zzabeVarArr = new zzabe[2];
        int i20 = 0;
        while (i20 < i19) {
            zzabd zzabdVar2 = zzabdVarArr[i20];
            if (zzabdVar2 != null) {
                int[] iArr6 = zzabdVar2.zzb;
                int length = iArr6.length;
                if (length == 0) {
                    i = 1;
                    i20 += i;
                    i19 = 2;
                } else {
                    zzabeVarArr[i20] = length == 1 ? new zzabf(zzabdVar2.zza, iArr6[0], 0, 0, null) : zzzxVar.zza(zzabdVar2.zza, iArr6, 0, zzu, (zzgxm) zzd.get(i20));
                }
            }
            i = 1;
            i20 += i;
            i19 = 2;
        }
        zznh[] zznhVarArr = new zznh[i19];
        for (int i21 = 0; i21 < i19; i21++) {
            zznhVarArr[i21] = (zzaaqVar.zza(i21) || zzaaqVar.zzI.contains(Integer.valueOf(zzabhVar.zza(i21))) || (zzabhVar.zza(i21) != -2 && zzabeVarArr[i21] == null)) ? null : zznh.zza;
        }
        return Pair.create(zznhVarArr, zzabeVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(zzaaq zzaaqVar, zzv zzvVar) {
        zzacr zzacrVar;
        zzacr zzacrVar2;
        if (!zzaaqVar.zzU) {
            return true;
        }
        Boolean bool = this.zzi;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i = zzvVar.zzI;
        char c = 65535;
        if (i == -1 || i <= 2) {
            return true;
        }
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzacrVar2 = this.zzg) == null || !zzacrVar2.zzb())) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.zzg) != null && zzacrVar.zzb() && zzacrVar.zzc() && this.zzg.zzd()) {
            return this.zzg.zze(this.zzh, zzvVar);
        }
        return false;
    }
}
