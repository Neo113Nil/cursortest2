package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzvt implements zzun, zzacx, zzyz, zzze, zzwd {
    private static final Map zzb;
    private static final zzu zzc;
    private zzadv zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyv zzP;
    private final Uri zzd;
    private final zzga zze;
    private final zzru zzf;
    private final zzuz zzg;
    private final zzrp zzh;
    private final zzvl zzi;
    private final long zzj;
    private final long zzk;
    private final zzvi zzm;
    private zzum zzr;
    private zzafw zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvs zzz;
    private final zzzh zzl = new zzzh("ProgressiveMediaPeriod");
    private final zzde zzn = new zzde(zzdb.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvp
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzvt.this.zzD();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzvt.this.zzE();
        }
    };
    private final Handler zzq = zzeo.zzc(null);
    private zzvr[] zzu = new zzvr[0];
    private zzwe[] zzt = new zzwe[0];
    private long zzK = C.TIME_UNSET;
    private int zzD = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzs zzsVar = new zzs();
        zzsVar.zza("icy");
        zzsVar.zzm(MimeTypes.APPLICATION_ICY);
        zzc = zzsVar.zzM();
    }

    public zzvt(Uri uri, zzga zzgaVar, zzvi zzviVar, zzru zzruVar, zzrp zzrpVar, zzyy zzyyVar, zzuz zzuzVar, zzvl zzvlVar, zzyv zzyvVar, String str, int i, int i2, zzu zzuVar, long j, zzzn zzznVar) {
        this.zzd = uri;
        this.zze = zzgaVar;
        this.zzf = zzruVar;
        this.zzh = zzrpVar;
        this.zzg = zzuzVar;
        this.zzi = zzvlVar;
        this.zzP = zzyvVar;
        this.zzj = i;
        this.zzm = zzviVar;
        this.zzk = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzvs zzvsVar = this.zzz;
        boolean[] zArr = zzvsVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzu zza = zzvsVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzul(1, zzar.zzg(zza.zzo), zza, 0, null, zzeo.zzp(this.zzJ), C.TIME_UNSET));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i]) && !this.zzt[i].zzl(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzwe zzweVar : this.zzt) {
                    zzweVar.zzb(false);
                }
                zzum zzumVar = this.zzr;
                zzumVar.getClass();
                zzumVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzF || zzZ();
    }

    private final zzaeb zzU(zzvr zzvrVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvrVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            int i2 = zzvrVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzds.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzacr();
        }
        zzwe zzweVar = new zzwe(this.zzP, this.zzf, this.zzh);
        zzweVar.zzt(this);
        int i3 = length + 1;
        zzvr[] zzvrVarArr = (zzvr[]) Arrays.copyOf(this.zzu, i3);
        zzvrVarArr[length] = zzvrVar;
        String str = zzeo.zza;
        this.zzu = zzvrVarArr;
        zzwe[] zzweVarArr = (zzwe[]) Arrays.copyOf(this.zzt, i3);
        zzweVarArr[length] = zzweVar;
        this.zzt = zzweVarArr;
        return zzweVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            if (zzweVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzb();
        int length = this.zzt.length;
        zzbf[] zzbfVarArr = new zzbf[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzu zzi = this.zzt[i2].zzi();
            zzi.getClass();
            String str = zzi.zzo;
            boolean zza = zzar.zza(str);
            boolean z = zza || zzar.zzb(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            this.zzy = this.zzk != C.TIME_UNSET && length == 1 && zzar.zzc(str);
            zzafw zzafwVar = this.zzs;
            if (zzafwVar != null) {
                if (zza || this.zzu[i2].zzb) {
                    zzao zzaoVar = zzi.zzl;
                    zzao zzaoVar2 = zzaoVar == null ? new zzao(C.TIME_UNSET, zzafwVar) : zzaoVar.zzd(zzafwVar);
                    zzs zza2 = zzi.zza();
                    zza2.zzk(zzaoVar2);
                    zzi = zza2.zzM();
                }
                if (zza && zzi.zzh == -1 && zzi.zzi == -1 && (i = zzafwVar.zza) != -1) {
                    zzs zza3 = zzi.zza();
                    zza3.zzh(i);
                    zzi = zza3.zzM();
                }
            }
            zzu zzb2 = zzi.zzb(this.zzf.zzb(zzi));
            zzbfVarArr[i2] = new zzbf(Integer.toString(i2), zzb2);
            this.zzG = zzb2.zzu | this.zzG;
        }
        this.zzz = new zzvs(new zzwq(zzbfVarArr), zArr);
        if (this.zzy && this.zzB == C.TIME_UNSET) {
            this.zzB = this.zzk;
            this.zzA = new zzvj(this, this.zzA);
        }
        this.zzi.zzb(this.zzB, this.zzA, this.zzC);
        this.zzw = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }

    private final void zzW() {
        zzvk zzvkVar = new zzvk(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzghc.zzh(zzZ());
            long j = this.zzB;
            if (j != C.TIME_UNSET && this.zzK > j) {
                this.zzN = true;
                this.zzK = C.TIME_UNSET;
                return;
            }
            zzadv zzadvVar = this.zzA;
            zzadvVar.getClass();
            zzvkVar.zzd(zzadvVar.zzc(this.zzK).zza.zzc, this.zzK);
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zzc(this.zzK);
            }
            this.zzK = C.TIME_UNSET;
        }
        this.zzM = zzX();
        this.zzl.zzd(zzvkVar, this, zzyy.zza(this.zzD));
    }

    private final int zzX() {
        int i = 0;
        for (zzwe zzweVar : this.zzt) {
            i += zzweVar.zzd();
        }
        return i;
    }

    private final long zzY(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzwe[] zzweVarArr = this.zzt;
            if (i >= zzweVarArr.length) {
                return j;
            }
            if (!z) {
                zzvs zzvsVar = this.zzz;
                zzvsVar.getClass();
                i = zzvsVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzweVarArr[i].zzj());
        }
    }

    private final boolean zzZ() {
        return this.zzK != C.TIME_UNSET;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzghc.zzh(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzA(zzzd zzzdVar, long j, long j2, boolean z) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzvkVar.zze();
        this.zzg.zzf(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        if (z) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zzb(false);
        }
        if (this.zzH > 0) {
            zzum zzumVar = this.zzr;
            zzumVar.getClass();
            zzumVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzB(zzzd zzzdVar, long j, long j2) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        if (this.zzB == C.TIME_UNSET && this.zzA != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzB = j3;
            this.zzi.zzb(j3, this.zzA, this.zzC);
        }
        zzgx zzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzvkVar.zze();
        this.zzg.zze(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        this.zzN = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzC(zzzd zzzdVar, long j, long j2, int i) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzf = zzvkVar.zzf();
        this.zzg.zzd(i == 0 ? new zzug(zzvkVar.zze(), zzvkVar.zzh(), j) : new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf()), new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzI = true;
    }

    final /* synthetic */ void zzH() {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzvt.this.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzj;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzp;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzq;
    }

    final /* synthetic */ zzafw zzO() {
        return this.zzs;
    }

    final /* synthetic */ void zzP(zzafw zzafwVar) {
        this.zzs = zzafwVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzB;
    }

    public final void zza() {
        if (this.zzw) {
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zze();
            }
        }
        this.zzl.zzg(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzr = zzumVar;
        this.zzn.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        zzr();
        if (this.zzN && !this.zzw) {
            throw zzas.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzaa();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        zzyf zzyfVar;
        zzaa();
        zzvs zzvsVar = this.zzz;
        zzwq zzwqVar = zzvsVar.zza;
        boolean[] zArr3 = zzvsVar.zzc;
        int i = this.zzH;
        int i2 = 0;
        for (int i3 = 0; i3 < zzyfVarArr.length; i3++) {
            zzwf zzwfVar = zzwfVarArr[i3];
            if (zzwfVar != null && (zzyfVarArr[i3] == null || !zArr[i3])) {
                int zza = ((zzvq) zzwfVar).zza();
                zzghc.zzh(zArr3[zza]);
                this.zzH--;
                zArr3[zza] = false;
                zzwfVarArr[i3] = null;
            }
        }
        boolean z = !this.zzE ? j == 0 || this.zzy : i != 0;
        for (int i4 = 0; i4 < zzyfVarArr.length; i4++) {
            if (zzwfVarArr[i4] == null && (zzyfVar = zzyfVarArr[i4]) != null) {
                zzghc.zzh(zzyfVar.zze() == 1);
                zzghc.zzh(zzyfVar.zzf(0) == 0);
                int zzb2 = zzwqVar.zzb(zzyfVar.zza());
                zzghc.zzh(!zArr3[zzb2]);
                this.zzH++;
                zArr3[zzb2] = true;
                this.zzG = zzyfVar.zzc().zzu | this.zzG;
                zzwfVarArr[i4] = new zzvq(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    zzwe zzweVar = this.zzt[zzb2];
                    z = (zzweVar.zzh() == 0 || zzweVar.zzo(j, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            zzzh zzzhVar = this.zzl;
            if (zzzhVar.zze()) {
                zzwe[] zzweVarArr = this.zzt;
                int length = zzweVarArr.length;
                while (i2 < length) {
                    zzweVarArr[i2].zzs();
                    i2++;
                }
                zzzhVar.zzf();
            } else {
                this.zzN = false;
                for (zzwe zzweVar2 : this.zzt) {
                    zzweVar2.zzb(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzwfVarArr.length) {
                if (zzwfVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzE = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        if (this.zzy) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzr(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return C.TIME_UNSET;
            }
            if (!this.zzN && zzX() <= this.zzM) {
                return C.TIME_UNSET;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long j;
        zzaa();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvs zzvsVar = this.zzz;
                if (zzvsVar.zzb[i] && zzvsVar.zzc[i] && !this.zzt[i].zzk()) {
                    j = Math.min(j, this.zzt[i].zzj());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzJ : j;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        zzaa();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzb()) {
            j = 0;
        }
        this.zzF = false;
        long j2 = this.zzJ;
        this.zzJ = j;
        if (zzZ()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD != 7 && (this.zzN || this.zzl.zze())) {
            int length = this.zzt.length;
            for (int i = 0; i < length; i++) {
                zzwe zzweVar = this.zzt[i];
                if (zzweVar.zzh() != 0 || j2 != j) {
                    if (this.zzy ? zzweVar.zzn(zzweVar.zzg()) : zzweVar.zzo(j, this.zzN)) {
                        continue;
                    } else if (!zArr[i] && this.zzx) {
                    }
                }
            }
            return j;
        }
        this.zzL = false;
        this.zzK = j;
        this.zzN = false;
        this.zzG = false;
        zzzh zzzhVar = this.zzl;
        if (zzzhVar.zze()) {
            for (zzwe zzweVar2 : this.zzt) {
                zzweVar2.zzs();
            }
            zzzhVar.zzf();
            return j;
        }
        zzzhVar.zzc();
        for (zzwe zzweVar3 : this.zzt) {
            zzweVar3.zzb(false);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j, zzlt zzltVar) {
        zzaa();
        if (!this.zzA.zzb()) {
            return 0L;
        }
        zzadt zzc2 = this.zzA.zzc(j);
        zzadw zzadwVar = zzc2.zza;
        zzadw zzadwVar2 = zzc2.zzb;
        long j2 = zzltVar.zzc;
        if (j2 == 0) {
            if (zzltVar.zzd == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzadwVar.zzb;
        String str = zzeo.zza;
        long j4 = j - j2;
        long j5 = zzltVar.zzd;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzadwVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (!z || !z2) {
            if (!z) {
                return z2 ? j9 : j4;
            }
            return j3;
        }
        if (Math.abs(j3 - j) <= Math.abs(j9 - j)) {
            return j3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        if (this.zzN) {
            return false;
        }
        zzzh zzzhVar = this.zzl;
        if (zzzhVar.zzb() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zza = this.zzn.zza();
        if (zzzhVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzl.zze() && this.zzn.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzo() {
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zza();
        }
        this.zzm.zzb();
    }

    final boolean zzp(int i) {
        return !zzT() && this.zzt[i].zzl(this.zzN);
    }

    final void zzq(int i) throws IOException {
        this.zzt[i].zzf();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzl.zzh(zzyy.zza(this.zzD));
    }

    final int zzs(int i, zzkh zzkhVar, zzhg zzhgVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzm = this.zzt[i].zzm(zzkhVar, zzhgVar, i2, this.zzN);
        if (zzm == -3) {
            zzS(i);
        }
        return zzm;
    }

    final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzwe zzweVar = this.zzt[i];
        int zzp = zzweVar.zzp(j, this.zzN);
        zzweVar.zzq(zzp);
        if (zzp != 0) {
            return zzp;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i, int i2) {
        return zzU(new zzvr(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(final zzadv zzadvVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzvt.this.zzF(zzadvVar);
            }
        });
    }

    final zzaeb zzx() {
        return zzU(new zzvr(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzy(zzu zzuVar) {
        this.zzq.post(this.zzo);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzyz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzzb zzz(zzzd zzzdVar, long j, long j2, IOException iOException, int i) {
        long j3;
        zzzb zza;
        zzadv zzadvVar;
        boolean zza2;
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzvkVar.zzg();
        String str = zzeo.zza;
        if (!(iOException instanceof zzas) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzgo) && !(iOException instanceof zzzg)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzgb) || ((zzgb) th).zza != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != C.TIME_UNSET) {
                zza = zzzh.zzb;
            } else {
                int zzX = zzX();
                boolean z = zzX > this.zzM;
                if (this.zzI || !((zzadvVar = this.zzA) == null || zzadvVar.zza() == C.TIME_UNSET)) {
                    this.zzM = zzX;
                } else {
                    boolean z2 = this.zzw;
                    if (!z2 || zzT()) {
                        this.zzF = z2;
                        this.zzJ = 0L;
                        this.zzM = 0;
                        for (zzwe zzweVar : this.zzt) {
                            zzweVar.zzb(false);
                        }
                        zzvkVar.zzd(0L, 0L);
                    } else {
                        this.zzL = true;
                        zza = zzzh.zza;
                    }
                }
                zza = zzzh.zza(z, j3);
            }
            zza2 = zza.zza();
            this.zzg.zzg(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), iOException, !zza2);
            if (!zza2) {
                zzvkVar.zze();
            }
            return zza;
        }
        j3 = -9223372036854775807L;
        if (j3 != C.TIME_UNSET) {
        }
        zza2 = zza.zza();
        this.zzg.zzg(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), iOException, !zza2);
        if (!zza2) {
        }
        return zza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzO) {
            return;
        }
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzadv zzadvVar) {
        this.zzA = this.zzs == null ? zzadvVar : new zzadu(C.TIME_UNSET, 0L);
        this.zzB = zzadvVar.zza();
        boolean z = false;
        if (!this.zzI && zzadvVar.zza() == C.TIME_UNSET) {
            z = true;
        }
        this.zzC = z;
        this.zzD = true == z ? 7 : 1;
        if (this.zzw) {
            this.zzi.zzb(this.zzB, zzadvVar, z);
        } else {
            zzD();
        }
    }
}
