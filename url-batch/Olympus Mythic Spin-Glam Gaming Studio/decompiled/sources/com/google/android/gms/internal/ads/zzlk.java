package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzlk extends zzf implements zzjy {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdn zzB;
    private final zzfd zzC;

    @Nullable
    private final zzlj zzD;
    private final zzka zzE;
    private final zzka zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznl zzJ;
    private zznm zzK;
    private zzjx zzL;
    private zzax zzM;
    private zzan zzN;

    @Nullable
    private Object zzO;

    @Nullable
    private Surface zzP;
    private int zzQ;
    private zzev zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzmw zzaa;
    private int zzab;
    private long zzac;
    private zzzj zzad;
    final zzabm zzb;
    final zzax zzc;
    private final zzdt zze;
    private final Context zzf;
    private final zzbb zzg;
    private final zzne[] zzh;
    private final zzne[] zzi;
    private final zzabl zzj;
    private final zzea zzk;
    private final zzlw zzl;
    private final zzly zzm;
    private final zzeg zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zznq zzs;
    private final Looper zzt;
    private final zzabu zzu;
    private final zzdp zzv;
    private final zzkg zzw;
    private final zzlf zzx;
    private final zzfs zzy;
    private final zzfu zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzlk(zzjw zzjwVar, @Nullable zzbb zzbbVar) {
        zzabl zzablVar;
        zzabu zzabuVar;
        Looper looper;
        zzdp zzdpVar;
        CopyOnWriteArraySet copyOnWriteArraySet;
        zzabm zzabmVar;
        zzlw zzlwVar;
        final zzqj zzqjVar;
        zzdp zzdpVar2;
        final zzlk zzlkVar = this;
        zzlkVar.zze = new zzdt(zzdp.zza);
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfm.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(str);
            sb.append(X3.j.e);
            zzeh.zzb("ExoPlayerImpl", sb.toString());
            zzlkVar.zzf = zzjwVar.zza.getApplicationContext();
            zzlkVar.zzs = (zznq) zzjwVar.zzh.apply(zzjwVar.zzb);
            zzlkVar.zzX = zzjwVar.zzj;
            zzlkVar.zzS = zzjwVar.zzk;
            zzlkVar.zzQ = zzjwVar.zzl;
            zzlkVar.zzU = false;
            zzlkVar.zzA = zzjwVar.zzq;
            zzkg zzkgVar = new zzkg(zzlkVar, null);
            zzlkVar.zzw = zzkgVar;
            zzlkVar.zzx = new zzlf(null);
            zzne[] zza = ((zznj) zzjwVar.zzc.zza()).zza(new Handler(zzjwVar.zzi), zzkgVar, zzkgVar, zzkgVar, zzkgVar);
            zzlkVar.zzh = zza;
            int length = zza.length;
            zzlkVar.zzi = new zzne[2];
            int i = 0;
            while (true) {
                zzne[] zzneVarArr = zzlkVar.zzi;
                int length2 = zzneVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzne zzneVar = zzlkVar.zzh[i];
                zzneVarArr[i] = null;
                i++;
            }
            zzablVar = (zzabl) zzjwVar.zze.zza();
            zzlkVar.zzj = zzablVar;
            zzabuVar = (zzabu) zzjwVar.zzg.zza();
            zzlkVar.zzu = zzabuVar;
            zzlkVar.zzr = zzjwVar.zzm;
            zzlkVar.zzK = zzjwVar.zzn;
            zzlkVar.zzJ = zzjwVar.zzo;
            looper = zzjwVar.zzi;
            zzlkVar.zzt = looper;
            zzdpVar = zzjwVar.zzb;
            zzlkVar.zzv = zzdpVar;
            zzlkVar.zzg = zzbbVar;
            zzlkVar.zzn = new zzeg(looper, zzdpVar, new zzec() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // com.google.android.gms.internal.ads.zzec
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    zzlk.this.zzJ((zzaz) obj, zzsVar);
                }
            });
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            zzlkVar.zzo = copyOnWriteArraySet;
            zzlkVar.zzq = new ArrayList();
            zzlkVar.zzad = new zzzj(0);
            zzlkVar.zzL = zzjx.zza;
            int length3 = zzlkVar.zzh.length;
            zzabmVar = new zzabm(new zznh[2], new zzabe[2], zzbn.zza, null);
            zzlkVar.zzb = zzabmVar;
            zzlkVar.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzablVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zze = zzawVar.zze();
            zzlkVar.zzc = zze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            zzlkVar.zzM = zzawVar2.zze();
            zzlkVar.zzk = zzdpVar.zzd(looper, null);
            zzlwVar = new zzlw() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzlw
                public final /* synthetic */ void zza(zzlv zzlvVar) {
                    zzlk.this.zzK(zzlvVar);
                }
            };
            zzlkVar.zzl = zzlwVar;
            zzlkVar.zzaa = zzmw.zza(zzabmVar);
            zzlkVar.zzs.zzx(zzbbVar, looper);
            zzqjVar = new zzqj(zzjwVar.zzx);
        } catch (Throwable th) {
            th = th;
        }
        try {
            zzly zzlyVar = new zzly(zzlkVar.zzf, zzlkVar.zzh, zzlkVar.zzi, zzablVar, zzabmVar, (zzmc) zzjwVar.zzf.zza(), zzabuVar, 0, false, zzlkVar.zzs, zzlkVar.zzK, zzjwVar.zzA, zzjwVar.zzp, false, zzjwVar.zzy, looper, zzdpVar, zzlwVar, zzqjVar, null, zzlkVar.zzL, zzlkVar.zzx, zzjwVar.zzz);
            zzlkVar = this;
            zzlkVar.zzm = zzlyVar;
            Looper zzn = zzlyVar.zzn();
            zzlkVar.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            zzlkVar.zzN = zzanVar;
            zzlkVar.zzZ = zzanVar;
            zzlkVar.zzab = -1;
            int i2 = zzda.zza;
            zzlkVar.zzV = true;
            zzlkVar.zze(zzlkVar.zzs);
            zzabuVar.zzf(new Handler(looper), zzlkVar.zzs);
            copyOnWriteArraySet.add(zzlkVar.zzw);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                final Context context = zzlkVar.zzf;
                final boolean z = zzjwVar.zzv;
                zzdpVar2 = zzdpVar;
                zzdpVar2.zzd(zzlyVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqf zza2 = zzqf.zza(context);
                        if (zza2 == null) {
                            zzeh.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            zzlkVar.zzD(zza2);
                        }
                        zzqjVar.zzb(zza2.zzb());
                    }
                });
            } else {
                zzdpVar2 = zzdpVar;
            }
            zzdn zzdnVar = new zzdn(0, zzn, looper, zzdpVar2, new zzdm() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    zzlk.this.zzL(((Integer) obj).intValue(), intValue);
                }
            });
            zzlkVar.zzB = zzdnVar;
            zzdnVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlk.this.zzM();
                }
            });
            new zzbz(zzjwVar.zza, zzn, zzjwVar.zzi, zzlkVar.zzw, zzdpVar2);
            boolean z2 = (zzjwVar.zzs == Integer.MAX_VALUE || zzjwVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfs zzfsVar = new zzfs(zzjwVar.zza, zzn, zzdpVar2);
            zzlkVar.zzy = zzfsVar;
            zzfsVar.zza(z2);
            zzlkVar.zzz = new zzfu(zzjwVar.zza, zzn, zzdpVar2);
            int i4 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            zzlkVar.zzR = zzev.zza;
            zzlkVar.zzD = i3 >= 34 ? new zzlj(zzlkVar, zzjwVar.zza, null) : null;
            zzlkVar.zzE = new zzka(zzlkVar, 1, null);
            zzlkVar.zzF = new zzka(zzlkVar, 2, null);
            zzlkVar.zzC = new zzfd(this, zzlkVar.zzw, zzdpVar2, zzjwVar.zzr, zzjwVar.zzs, zzjwVar.zzt, zzjwVar.zzu);
            zzlyVar.zzg(zzlkVar.zzJ);
            zzlyVar.zzi(zzlkVar.zzS, false);
            zzlkVar.zzau(1, 3, zzlkVar.zzS);
            zzlkVar.zzau(2, 4, Integer.valueOf(zzlkVar.zzQ));
            zzlkVar.zzau(2, 5, 0);
            zzlkVar.zzau(1, 9, Boolean.valueOf(zzlkVar.zzU));
            zzlkVar.zzau(6, 8, zzlkVar.zzx);
            zzlkVar.zzau(-1, 16, Integer.valueOf(zzlkVar.zzX));
            zzlkVar.zze.zza();
        } catch (Throwable th2) {
            th = th2;
            zzlkVar = this;
            zzlkVar.zze.zza();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(@Nullable zzjn zzjnVar) {
        zzmw zzmwVar = this.zzaa;
        zzmw zzh = zzmwVar.zzh(zzmwVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        zzmw zzam = zzam(zzh, 1);
        if (zzjnVar != null) {
            zzam = zzam.zzf(zzjnVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(zzmw zzmwVar) {
        zzbf zzbfVar = zzmwVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmwVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzmw zzmwVar) {
        zzxo zzxoVar = zzmwVar.zzb;
        if (!zzxoVar.zzb()) {
            return zzfm.zzs(zzai(zzmwVar));
        }
        zzbf zzbfVar = zzmwVar.zza;
        zzbfVar.zzo(zzxoVar.zza, this.zzp);
        long j = zzmwVar.zzc;
        if (j != -9223372036854775807L) {
            return zzfm.zzs(0L) + zzfm.zzs(j);
        }
        long j2 = zzbfVar.zzb(zzag(zzmwVar), this.zza, 0L).zzl;
        return zzfm.zzs(0L);
    }

    private final long zzai(zzmw zzmwVar) {
        zzbf zzbfVar = zzmwVar.zza;
        if (zzbfVar.zzg()) {
            return zzfm.zzt(this.zzac);
        }
        long j = zzmwVar.zzs;
        zzxo zzxoVar = zzmwVar.zzb;
        if (zzxoVar.zzb()) {
            return j;
        }
        zzao(zzbfVar, zzxoVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0435  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaj(final zzmw zzmwVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i5;
        boolean booleanValue;
        final zzak zzakVar;
        List list;
        int i6;
        zzbf zzq;
        zzan zzx;
        boolean equals;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        zzjn zzjnVar;
        zzjn zzjnVar2;
        zzabm zzabmVar;
        zzabm zzabmVar2;
        zzax zzaxVar;
        zzf zzfVar;
        zzbf zzq2;
        ?? r13;
        int i7;
        boolean z10;
        zzbf zzq3;
        boolean z11;
        zzbf zzq4;
        long j2;
        boolean z12;
        zzax zze;
        int i8;
        int i9;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long j3;
        long zzak;
        int i10;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        final int i11 = i2;
        zzmw zzmwVar2 = this.zzaa;
        this.zzaa = zzmwVar;
        zzbf zzbfVar = zzmwVar.zza;
        if (!zzbfVar.zzg()) {
            Object obj5 = zzmwVar.zzb.zza;
            zzguk.zzj(zzbfVar.zze(obj5) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, zzbfVar.getClass().getName(), Integer.valueOf(zzbfVar.zza())));
        }
        zzbf zzbfVar2 = zzmwVar2.zza;
        boolean equals2 = zzbfVar2.equals(zzbfVar);
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (zzbfVar.zzg() == zzbfVar2.zzg()) {
                zzxo zzxoVar = zzmwVar2.zzb;
                Object obj6 = zzxoVar.zza;
                zzbd zzbdVar = this.zzp;
                int i12 = zzbfVar2.zzo(obj6, zzbdVar).zzc;
                zzbe zzbeVar = this.zza;
                Object obj7 = zzbfVar2.zzb(i12, zzbeVar, 0L).zzb;
                zzxo zzxoVar2 = zzmwVar.zzb;
                if (obj7.equals(zzbfVar.zzb(zzbfVar.zzo(zzxoVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (!z) {
                        i4 = i11;
                        z3 = false;
                    } else if (i11 != 0) {
                        i4 = i11;
                        z3 = true;
                    } else if (zzxoVar.zzd < zzxoVar2.zzd) {
                        pair = new Pair(Boolean.TRUE, 0);
                        i11 = 0;
                        z4 = true;
                    } else {
                        z3 = true;
                        i4 = 0;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                    z4 = z3;
                    i11 = i4;
                } else {
                    if (!z) {
                        z5 = false;
                        z4 = false;
                    } else if (i11 == 0) {
                        i11 = 0;
                        i5 = 1;
                        z4 = true;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                    } else {
                        z5 = true;
                        z4 = true;
                    }
                    if (z5 && i11 == 1) {
                        i5 = 2;
                    } else {
                        if (equals2) {
                            throw new IllegalStateException();
                        }
                        i5 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar.zzg() ? zzbfVar.zzb(zzbfVar.zzo(zzmwVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = zzan.zza;
                }
                if (!booleanValue || !zzmwVar2.zzj.equals(zzmwVar.zzj)) {
                    zzam zza = this.zzZ.zza();
                    list = zzmwVar.zzj;
                    for (i6 = 0; i6 < list.size(); i6++) {
                        zzap zzapVar = (zzap) list.get(i6);
                        for (int i13 = 0; i13 < zzapVar.zza(); i13++) {
                            zzapVar.zzb(i13).zza(zza);
                        }
                    }
                    this.zzZ = zza.zzx();
                }
                zzq = zzq();
                if (zzq.zzg()) {
                    zzak zzakVar4 = zzq.zzb(zzs(), this.zza, 0L).zzd;
                    zzam zza2 = this.zzZ.zza();
                    zza2.zzw(zzakVar4.zzd);
                    zzx = zza2.zzx();
                } else {
                    zzx = this.zzZ;
                }
                equals = zzx.equals(this.zzN);
                this.zzN = zzx;
                boolean z13 = zzmwVar2.zzl == zzmwVar.zzl;
                z6 = zzmwVar2.zze == zzmwVar.zze;
                if (!z6 || z13) {
                    zzas();
                }
                boolean z14 = zzmwVar2.zzg == zzmwVar.zzg;
                if (!equals2) {
                    this.zzn.zze(0, new zzeb() { // from class: com.google.android.gms.internal.ads.zzla
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj8) {
                            int i14 = zzlk.zzd;
                            ((zzaz) obj8).zzb(zzmw.this.zza, i);
                        }
                    });
                }
                if (z4) {
                    z7 = z13;
                    z8 = z6;
                    z9 = z14;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (zzbfVar2.zzg()) {
                        z8 = z6;
                        z9 = z14;
                        i8 = i3;
                        i9 = i8;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj8 = zzmwVar2.zzb.zza;
                        zzbfVar2.zzo(obj8, zzbdVar2);
                        int i14 = zzbdVar2.zzc;
                        int zze2 = zzbfVar2.zze(obj8);
                        zzbe zzbeVar2 = this.zza;
                        z8 = z6;
                        z9 = z14;
                        obj = zzbfVar2.zzb(i14, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        obj2 = obj8;
                        i8 = i14;
                        i9 = zze2;
                    }
                    if (i11 == 0) {
                        zzxo zzxoVar3 = zzmwVar2.zzb;
                        if (zzxoVar3.zzb()) {
                            j3 = zzbdVar2.zzh(zzxoVar3.zzb, zzxoVar3.zzc);
                            zzak = zzak(zzmwVar2);
                            String str = zzfm.zza;
                            zzxo zzxoVar4 = zzmwVar2.zzb;
                            final zzba zzbaVar = new zzba(obj, i8, zzakVar2, obj2, i9, zzfm.zzs(j3), zzfm.zzs(zzak), zzxoVar4.zzb, zzxoVar4.zzc);
                            int zzs = zzs();
                            int zzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                zzmw zzmwVar3 = this.zzaa;
                                Object obj9 = zzmwVar3.zzb.zza;
                                zzmwVar3.zza.zzo(obj9, this.zzp);
                                int zze3 = this.zzaa.zza.zze(obj9);
                                zzbf zzbfVar3 = this.zzaa.zza;
                                zzbe zzbeVar3 = this.zza;
                                z7 = z13;
                                i10 = zze3;
                                obj3 = zzbfVar3.zzb(zzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                                obj4 = obj9;
                            } else {
                                z7 = z13;
                                i10 = zzr;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            long zzs2 = zzfm.zzs(j);
                            long zzs3 = !this.zzaa.zzb.zzb() ? zzfm.zzs(zzak(this.zzaa)) : zzs2;
                            zzxo zzxoVar5 = this.zzaa.zzb;
                            final zzba zzbaVar2 = new zzba(obj3, zzs, zzakVar3, obj4, i10, zzs2, zzs3, zzxoVar5.zzb, zzxoVar5.zzc);
                            this.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                                @Override // com.google.android.gms.internal.ads.zzeb
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i15 = zzlk.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i11);
                                }
                            });
                        } else {
                            j3 = zzxoVar3.zze != -1 ? zzak(this.zzaa) : zzbdVar2.zzd;
                            zzak = j3;
                            String str2 = zzfm.zza;
                            zzxo zzxoVar42 = zzmwVar2.zzb;
                            final zzba zzbaVar3 = new zzba(obj, i8, zzakVar2, obj2, i9, zzfm.zzs(j3), zzfm.zzs(zzak), zzxoVar42.zzb, zzxoVar42.zzc);
                            int zzs4 = zzs();
                            int zzr2 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            long zzs22 = zzfm.zzs(j);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            zzxo zzxoVar52 = this.zzaa.zzb;
                            final zzba zzbaVar22 = new zzba(obj3, zzs4, zzakVar3, obj4, i10, zzs22, zzs3, zzxoVar52.zzb, zzxoVar52.zzc);
                            this.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                                @Override // com.google.android.gms.internal.ads.zzeb
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i15 = zzlk.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar3, zzbaVar22, i11);
                                }
                            });
                        }
                    } else if (zzmwVar2.zzb.zzb()) {
                        j3 = zzmwVar2.zzs;
                        zzak = zzak(zzmwVar2);
                        String str22 = zzfm.zza;
                        zzxo zzxoVar422 = zzmwVar2.zzb;
                        final zzba zzbaVar32 = new zzba(obj, i8, zzakVar2, obj2, i9, zzfm.zzs(j3), zzfm.zzs(zzak), zzxoVar422.zzb, zzxoVar422.zzc);
                        int zzs42 = zzs();
                        int zzr22 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzs222 = zzfm.zzs(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzxo zzxoVar522 = this.zzaa.zzb;
                        final zzba zzbaVar222 = new zzba(obj3, zzs42, zzakVar3, obj4, i10, zzs222, zzs3, zzxoVar522.zzb, zzxoVar522.zzc);
                        this.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                            @Override // com.google.android.gms.internal.ads.zzeb
                            public final /* synthetic */ void zza(Object obj10) {
                                int i15 = zzlk.zzd;
                                ((zzaz) obj10).zzo(zzbaVar32, zzbaVar222, i11);
                            }
                        });
                    } else {
                        j3 = zzmwVar2.zzs;
                        zzak = j3;
                        String str222 = zzfm.zza;
                        zzxo zzxoVar4222 = zzmwVar2.zzb;
                        final zzba zzbaVar322 = new zzba(obj, i8, zzakVar2, obj2, i9, zzfm.zzs(j3), zzfm.zzs(zzak), zzxoVar4222.zzb, zzxoVar4222.zzc);
                        int zzs422 = zzs();
                        int zzr222 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzs2222 = zzfm.zzs(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzxo zzxoVar5222 = this.zzaa.zzb;
                        final zzba zzbaVar2222 = new zzba(obj3, zzs422, zzakVar3, obj4, i10, zzs2222, zzs3, zzxoVar5222.zzb, zzxoVar5222.zzc);
                        this.zzn.zze(11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                            @Override // com.google.android.gms.internal.ads.zzeb
                            public final /* synthetic */ void zza(Object obj10) {
                                int i15 = zzlk.zzd;
                                ((zzaz) obj10).zzo(zzbaVar322, zzbaVar2222, i11);
                            }
                        });
                    }
                }
                if (booleanValue) {
                    this.zzn.zze(1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlc
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzc(zzak.this, intValue);
                        }
                    });
                }
                zzjnVar = zzmwVar2.zzf;
                zzjnVar2 = zzmwVar.zzf;
                if (zzjnVar != zzjnVar2) {
                    zzeg zzegVar = this.zzn;
                    zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzld
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzn(zzmw.this.zzf);
                        }
                    });
                    if (zzjnVar2 != null) {
                        zzegVar.zze(10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzki
                            @Override // com.google.android.gms.internal.ads.zzeb
                            public final /* synthetic */ void zza(Object obj10) {
                                int i15 = zzlk.zzd;
                                ((zzaz) obj10).zzm(zzmw.this.zzf);
                            }
                        });
                    }
                }
                zzabmVar = zzmwVar2.zzi;
                zzabmVar2 = zzmwVar.zzi;
                if (zzabmVar != zzabmVar2) {
                    this.zzj.zzq(zzabmVar2.zze);
                    this.zzn.zze(2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkj
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzd(zzmw.this.zzi.zzd);
                        }
                    });
                }
                if (!equals) {
                    final zzan zzanVar = this.zzN;
                    this.zzn.zze(14, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zze(zzan.this);
                        }
                    });
                }
                if (z9) {
                    this.zzn.zze(3, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzf(zzmw.this.zzg);
                        }
                    });
                }
                if (!z8 || z7) {
                    this.zzn.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            zzmw zzmwVar4 = zzmw.this;
                            ((zzaz) obj10).zzh(zzmwVar4.zzl, zzmwVar4.zze);
                        }
                    });
                }
                if (z8) {
                    this.zzn.zze(4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkn
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzi(zzmw.this.zze);
                        }
                    });
                }
                if (!z7 || zzmwVar2.zzm != zzmwVar.zzm) {
                    this.zzn.zze(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            zzmw zzmwVar4 = zzmw.this;
                            ((zzaz) obj10).zzj(zzmwVar4.zzl, zzmwVar4.zzm);
                        }
                    });
                }
                if (zzmwVar2.zzn != zzmwVar.zzn) {
                    this.zzn.zze(6, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkp
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzk(zzmw.this.zzn);
                        }
                    });
                }
                if (zzmwVar2.zzj() != zzmwVar.zzj()) {
                    this.zzn.zze(7, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzl(zzmw.this.zzj());
                        }
                    });
                }
                if (!zzmwVar2.zzo.equals(zzmwVar.zzo)) {
                    this.zzn.zze(12, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkr
                        @Override // com.google.android.gms.internal.ads.zzeb
                        public final /* synthetic */ void zza(Object obj10) {
                            int i15 = zzlk.zzd;
                            ((zzaz) obj10).zzp(zzmw.this.zzo);
                        }
                    });
                }
                zzaxVar = this.zzM;
                zzbb zzbbVar = this.zzg;
                zzax zzaxVar2 = this.zzc;
                String str3 = zzfm.zza;
                boolean zzx2 = zzbbVar.zzx();
                zzfVar = (zzf) zzbbVar;
                zzbf zzq5 = zzfVar.zzq();
                boolean z15 = zzq5.zzg() && zzq5.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh;
                zzq2 = zzfVar.zzq();
                if (zzq2.zzg()) {
                    int zzs5 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    r13 = 0;
                    r13 = 0;
                    int zzi = zzq2.zzi(zzs5, 0, false);
                    i7 = -1;
                    z10 = zzi != -1;
                } else {
                    i7 = -1;
                    r13 = 0;
                    z10 = false;
                }
                zzq3 = zzfVar.zzq();
                if (!zzq3.zzg()) {
                    int zzs6 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    if (zzq3.zzh(zzs6, r13, r13) != i7) {
                        z11 = true;
                        zzq4 = zzfVar.zzq();
                        if (zzq4.zzg()) {
                            j2 = 0;
                        } else {
                            j2 = 0;
                            if (zzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                                z12 = true;
                                zzbf zzq6 = zzfVar.zzq();
                                boolean z16 = (zzq6.zzg() && zzq6.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi) ? true : r13;
                                boolean zzg = zzbbVar.zzq().zzg();
                                zzaw zzawVar = new zzaw();
                                zzawVar.zzd(zzaxVar2);
                                boolean z17 = !zzx2;
                                zzawVar.zzb(4, z17);
                                zzawVar.zzb(5, (z15 || zzx2) ? r13 : true);
                                zzawVar.zzb(6, (z10 || zzx2) ? r13 : true);
                                zzawVar.zzb(7, (!zzg || !(z10 || !z12 || z15) || zzx2) ? r13 : true);
                                zzawVar.zzb(8, (z11 || zzx2) ? r13 : true);
                                zzawVar.zzb(9, (!zzg || !(z11 || (z12 && z16)) || zzx2) ? r13 : true);
                                zzawVar.zzb(10, z17);
                                zzawVar.zzb(11, (z15 || zzx2) ? r13 : true);
                                zzawVar.zzb(12, (z15 || zzx2) ? r13 : true);
                                zze = zzawVar.zze();
                                this.zzM = zze;
                                if (!zze.equals(zzaxVar)) {
                                    this.zzn.zze(13, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkt
                                        @Override // com.google.android.gms.internal.ads.zzeb
                                        public final /* synthetic */ void zza(Object obj10) {
                                            zzlk.this.zzN((zzaz) obj10);
                                        }
                                    });
                                }
                                this.zzn.zzf();
                            }
                        }
                        z12 = r13;
                        zzbf zzq62 = zzfVar.zzq();
                        if (zzq62.zzg()) {
                        }
                        boolean zzg2 = zzbbVar.zzq().zzg();
                        zzaw zzawVar2 = new zzaw();
                        zzawVar2.zzd(zzaxVar2);
                        boolean z172 = !zzx2;
                        zzawVar2.zzb(4, z172);
                        zzawVar2.zzb(5, (z15 || zzx2) ? r13 : true);
                        zzawVar2.zzb(6, (z10 || zzx2) ? r13 : true);
                        zzawVar2.zzb(7, (!zzg2 || !(z10 || !z12 || z15) || zzx2) ? r13 : true);
                        zzawVar2.zzb(8, (z11 || zzx2) ? r13 : true);
                        zzawVar2.zzb(9, (!zzg2 || !(z11 || (z12 && z16)) || zzx2) ? r13 : true);
                        zzawVar2.zzb(10, z172);
                        zzawVar2.zzb(11, (z15 || zzx2) ? r13 : true);
                        zzawVar2.zzb(12, (z15 || zzx2) ? r13 : true);
                        zze = zzawVar2.zze();
                        this.zzM = zze;
                        if (!zze.equals(zzaxVar)) {
                        }
                        this.zzn.zzf();
                    }
                }
                z11 = r13;
                zzq4 = zzfVar.zzq();
                if (zzq4.zzg()) {
                }
                z12 = r13;
                zzbf zzq622 = zzfVar.zzq();
                if (zzq622.zzg()) {
                }
                boolean zzg22 = zzbbVar.zzq().zzg();
                zzaw zzawVar22 = new zzaw();
                zzawVar22.zzd(zzaxVar2);
                boolean z1722 = !zzx2;
                zzawVar22.zzb(4, z1722);
                zzawVar22.zzb(5, (z15 || zzx2) ? r13 : true);
                zzawVar22.zzb(6, (z10 || zzx2) ? r13 : true);
                zzawVar22.zzb(7, (!zzg22 || !(z10 || !z12 || z15) || zzx2) ? r13 : true);
                zzawVar22.zzb(8, (z11 || zzx2) ? r13 : true);
                zzawVar22.zzb(9, (!zzg22 || !(z11 || (z12 && z16)) || zzx2) ? r13 : true);
                zzawVar22.zzb(10, z1722);
                zzawVar22.zzb(11, (z15 || zzx2) ? r13 : true);
                zzawVar22.zzb(12, (z15 || zzx2) ? r13 : true);
                zze = zzawVar22.zze();
                this.zzM = zze;
                if (!zze.equals(zzaxVar)) {
                }
                this.zzn.zzf();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        z4 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzam zza3 = this.zzZ.zza();
        list = zzmwVar.zzj;
        while (i6 < list.size()) {
        }
        this.zzZ = zza3.zzx();
        zzq = zzq();
        if (zzq.zzg()) {
        }
        equals = zzx.equals(this.zzN);
        this.zzN = zzx;
        if (zzmwVar2.zzl == zzmwVar.zzl) {
        }
        if (zzmwVar2.zze == zzmwVar.zze) {
        }
        if (!z6) {
        }
        zzas();
        if (zzmwVar2.zzg == zzmwVar.zzg) {
        }
        if (!equals2) {
        }
        if (z4) {
        }
        if (booleanValue) {
        }
        zzjnVar = zzmwVar2.zzf;
        zzjnVar2 = zzmwVar.zzf;
        if (zzjnVar != zzjnVar2) {
        }
        zzabmVar = zzmwVar2.zzi;
        zzabmVar2 = zzmwVar.zzi;
        if (zzabmVar != zzabmVar2) {
        }
        if (!equals) {
        }
        if (z9) {
        }
        if (!z8) {
        }
        this.zzn.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkm
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj10) {
                int i15 = zzlk.zzd;
                zzmw zzmwVar4 = zzmw.this;
                ((zzaz) obj10).zzh(zzmwVar4.zzl, zzmwVar4.zze);
            }
        });
        if (z8) {
        }
        if (!z7) {
        }
        this.zzn.zze(5, new zzeb() { // from class: com.google.android.gms.internal.ads.zzko
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj10) {
                int i15 = zzlk.zzd;
                zzmw zzmwVar4 = zzmw.this;
                ((zzaz) obj10).zzj(zzmwVar4.zzl, zzmwVar4.zzm);
            }
        });
        if (zzmwVar2.zzn != zzmwVar.zzn) {
        }
        if (zzmwVar2.zzj() != zzmwVar.zzj()) {
        }
        if (!zzmwVar2.zzo.equals(zzmwVar.zzo)) {
        }
        zzaxVar = this.zzM;
        zzbb zzbbVar2 = this.zzg;
        zzax zzaxVar22 = this.zzc;
        String str32 = zzfm.zza;
        boolean zzx22 = zzbbVar2.zzx();
        zzfVar = (zzf) zzbbVar2;
        zzbf zzq52 = zzfVar.zzq();
        if (zzq52.zzg()) {
        }
        zzq2 = zzfVar.zzq();
        if (zzq2.zzg()) {
        }
        zzq3 = zzfVar.zzq();
        if (!zzq3.zzg()) {
        }
        z11 = r13;
        zzq4 = zzfVar.zzq();
        if (zzq4.zzg()) {
        }
        z12 = r13;
        zzbf zzq6222 = zzfVar.zzq();
        if (zzq6222.zzg()) {
        }
        boolean zzg222 = zzbbVar2.zzq().zzg();
        zzaw zzawVar222 = new zzaw();
        zzawVar222.zzd(zzaxVar22);
        boolean z17222 = !zzx22;
        zzawVar222.zzb(4, z17222);
        zzawVar222.zzb(5, (z15 || zzx22) ? r13 : true);
        zzawVar222.zzb(6, (z10 || zzx22) ? r13 : true);
        zzawVar222.zzb(7, (!zzg222 || !(z10 || !z12 || z15) || zzx22) ? r13 : true);
        zzawVar222.zzb(8, (z11 || zzx22) ? r13 : true);
        zzawVar222.zzb(9, (!zzg222 || !(z11 || (z12 && z16)) || zzx22) ? r13 : true);
        zzawVar222.zzb(10, z17222);
        zzawVar222.zzb(11, (z15 || zzx22) ? r13 : true);
        zzawVar222.zzb(12, (z15 || zzx22) ? r13 : true);
        zze = zzawVar222.zze();
        this.zzM = zze;
        if (!zze.equals(zzaxVar)) {
        }
        this.zzn.zzf();
    }

    private static long zzak(zzmw zzmwVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmwVar.zza;
        zzbfVar.zzo(zzmwVar.zzb.zza, zzbdVar);
        long j = zzmwVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmw zzal(zzmw zzmwVar, zzbf zzbfVar, @Nullable Pair pair) {
        zzxo zzxoVar;
        zzguk.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmwVar.zza;
        long zzah = zzah(zzmwVar);
        zzmw zzd2 = zzmwVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxo zzb = zzmw.zzb();
            long zzt = zzfm.zzt(this.zzac);
            zzmw zzh = zzd2.zzc(zzb, zzt, zzt, zzt, 0L, zzzr.zza, this.zzb, zzgxm.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        zzxo zzxoVar2 = zzd2.zzb;
        Object obj = zzxoVar2.zza;
        String str = zzfm.zza;
        boolean equals = obj.equals(pair.first);
        zzxo zzxoVar3 = !equals ? new zzxo(pair.first, -1L) : zzxoVar2;
        long longValue = ((Long) pair.second).longValue();
        long zzt2 = zzfm.zzt(zzah);
        if (!zzbfVar2.zzg()) {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (equals && zzt2 - longValue == 1) {
                zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
                zzxoVar = zzxoVar3;
                if (zzt2 == zzo.zzd) {
                    zzt2--;
                }
                if (equals || longValue < zzt2) {
                    zzguk.zzi(!zzxoVar.zzb());
                    zzmw zzh2 = zzd2.zzc(zzxoVar, longValue, longValue, longValue, 0L, equals ? zzzr.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzgxm.zzi() : zzd2.zzj).zzh(zzxoVar);
                    zzh2.zzq = longValue;
                    return zzh2;
                }
                if (longValue != zzt2) {
                    zzguk.zzi(!zzxoVar.zzb());
                    long max = Math.max(0L, zzd2.zzr - (longValue - zzt2));
                    long j = zzd2.zzq;
                    if (zzd2.zzk.equals(zzxoVar2)) {
                        j = longValue + max;
                    }
                    zzmw zzc = zzd2.zzc(zzxoVar, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
                    zzc.zzq = j;
                    return zzc;
                }
                int zze = zzbfVar.zze(zzd2.zzk.zza);
                if (zze != -1) {
                    zzbd zzbdVar2 = this.zzp;
                    if (zzbfVar.zzd(zze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxoVar.zza, zzbdVar2).zzc) {
                        return zzd2;
                    }
                }
                Object obj2 = zzxoVar.zza;
                zzbd zzbdVar3 = this.zzp;
                zzbfVar.zzo(obj2, zzbdVar3);
                long zzh3 = zzxoVar.zzb() ? zzbdVar3.zzh(zzxoVar.zzb, zzxoVar.zzc) : zzbdVar3.zzd;
                zzmw zzh4 = zzd2.zzc(zzxoVar, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzxoVar);
                zzh4.zzq = zzh3;
                return zzh4;
            }
        }
        zzxoVar = zzxoVar3;
        if (equals) {
        }
        zzguk.zzi(!zzxoVar.zzb());
        zzmw zzh22 = zzd2.zzc(zzxoVar, longValue, longValue, longValue, 0L, equals ? zzzr.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzgxm.zzi() : zzd2.zzj).zzh(zzxoVar);
        zzh22.zzq = longValue;
        return zzh22;
    }

    private static zzmw zzam(zzmw zzmwVar, int i) {
        zzmw zze = zzmwVar.zze(i);
        return (i == 1 || i == 4) ? zze.zzg(false) : zze;
    }

    @Nullable
    private final Pair zzan(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfm.zzs(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfm.zzt(j));
    }

    private final long zzao(zzbf zzbfVar, zzxo zzxoVar, long j) {
        zzbfVar.zzo(zzxoVar.zza, this.zzp);
        return j;
    }

    private final zzna zzap(zzmz zzmzVar) {
        int zzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzag == -1) {
            zzag = 0;
        }
        zzdp zzdpVar = this.zzv;
        zzly zzlyVar = this.zzm;
        return new zzna(zzlyVar, zzmzVar, zzbfVar, zzag, zzdpVar, zzlyVar.zzn());
    }

    private final void zzaq(@Nullable Object obj) {
        Object obj2 = this.zzO;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zzl) {
            return;
        }
        zzP(zzjn.zzc(new zzlz(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzR.zza() && i2 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzev(i, i2);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(24, new zzeb() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlk.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzegVar.zzf();
        zzau(2, 14, new zzev(i, i2));
    }

    private final void zzas() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfm.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(format);
            }
            zzeh.zzd("ExoPlayerImpl", format, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i, int i2, @Nullable Object obj) {
        zzne[] zzneVarArr = this.zzh;
        int length = zzneVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzne zzneVar = zzneVarArr[i3];
            if (i == -1 || zzneVar.zza() == i) {
                zzna zzap = zzap(zzneVar);
                zzap.zzb(i2);
                zzap.zzd(obj);
                zzap.zzg();
            }
        }
        zzne[] zzneVarArr2 = this.zzi;
        int length2 = zzneVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzne zzneVar2 = zzneVarArr2[i4];
            if (zzneVar2 != null && (i == -1 || zzneVar2.zza() == i)) {
                zzna zzap2 = zzap(zzneVar2);
                zzap2.zzb(i2);
                zzap2.zzd(obj);
                zzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzat();
        String str = zzfm.zza;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzT == max) {
            return;
        }
        this.zzT = max;
        this.zzm.zzj(max);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(22, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i = zzlk.zzd;
                ((zzaz) obj).zzr(max);
            }
        });
        zzegVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(@Nullable Surface surface) {
        zzat();
        zzaq(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzD(zznt zzntVar) {
        this.zzs.zzv(zzntVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzE(zznt zzntVar) {
        zzat();
        this.zzs.zzw(zzntVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzG(zzxq zzxqVar) {
        zzat();
        List singletonList = Collections.singletonList(zzxqVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < singletonList.size(); i++) {
            zzms zzmsVar = new zzms((zzxq) singletonList.get(i), this.zzr);
            arrayList.add(zzmsVar);
            list.add(i, new zzlg(zzmsVar.zzb, zzmsVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zznc zzncVar = new zznc(list, this.zzad);
        if (!zzncVar.zzg() && zzncVar.zza() < 0) {
            throw new zzw(zzncVar, -1, -9223372036854775807L);
        }
        int zzk = zzncVar.zzk(false);
        zzmw zzal = zzal(this.zzaa, zzncVar, zzan(zzncVar, zzk, -9223372036854775807L));
        int i2 = zzal.zze;
        if (i2 == 1) {
            i2 = 1;
        } else {
            if (!zzncVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzncVar.zza()) {
                        i2 = 2;
                    }
                }
            }
            i2 = 4;
        }
        zzmw zzam = zzam(zzal, i2);
        this.zzm.zzy(arrayList, zzk, zzfm.zzt(-9223372036854775807L), this.zzad);
        zzaj(zzam, 0, (this.zzaa.zzb.zza.equals(zzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfm.zza;
        String zza = zzal.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str).length() + 3 + String.valueOf(zza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append(X3.j.e);
        zzeh.zzb("ExoPlayerImpl", sb.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzlj zzljVar = this.zzD;
        if (zzljVar != null && Build.VERSION.SDK_INT >= 34) {
            zzljVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzeg zzegVar = this.zzn;
            zzegVar.zze(10, zzky.zza);
            zzegVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabu zzabuVar = this.zzu;
        zznq zznqVar = this.zzs;
        zzabuVar.zzg(zznqVar);
        zzmw zzmwVar = this.zzaa;
        boolean z = zzmwVar.zzp;
        zzmw zzam = zzam(zzmwVar, 1);
        this.zzaa = zzam;
        zzmw zzh = zzam.zzh(zzam.zzb);
        this.zzaa = zzh;
        zzh.zzq = zzh.zzs;
        this.zzaa.zzr = 0L;
        zznqVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i = zzda.zza;
        this.zzY = true;
        if (this.zzaa.zza.zzg()) {
            return;
        }
        zzmw zzmwVar2 = this.zzaa;
        boolean z2 = zzmwVar2.zza.zze(zzmwVar2.zzb.zza) != -1;
        Locale locale = Locale.US;
        zzmw zzmwVar3 = this.zzaa;
        zzguk.zzj(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d", zzmwVar3.zzb.zza, zzmwVar3.zza.getClass().getName(), Integer.valueOf(this.zzaa.zza.zza())));
    }

    @Nullable
    public final zzjn zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlv zzlvVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzlk.this.zzO(zzlvVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzat();
        Integer valueOf = Integer.valueOf(i2);
        zzau(1, 10, valueOf);
        zzau(2, 10, valueOf);
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlk.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzeg zzegVar = this.zzn;
        zzegVar.zze(21, zzebVar);
        zzegVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfm.zza;
        int generateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        zzdn zzdnVar = this.zzB;
        if (((Integer) zzdnVar.zza()).intValue() != generateAudioSessionId) {
            Integer valueOf = Integer.valueOf(generateAudioSessionId);
            zzdnVar.zzc(valueOf);
            zzau(1, 10, valueOf);
            zzau(2, 10, valueOf);
        }
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzlv zzlvVar) {
        int i;
        long j;
        int i2 = this.zzG - zzlvVar.zzb;
        this.zzG = i2;
        boolean z = true;
        if (zzlvVar.zzc) {
            this.zzH = zzlvVar.zzd;
            this.zzI = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzlvVar.zza.zza;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List zzw = ((zznc) zzbfVar).zzw();
                int size = zzw.size();
                List list = this.zzq;
                zzguk.zzi(size == list.size());
                for (int i3 = 0; i3 < zzw.size(); i3++) {
                    ((zzlg) list.get(i3)).zzc((zzbf) zzw.get(i3));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzI) {
                boolean z2 = zzlvVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zzc = zzlvVar.zza.zzb.zzc(this.zzaa.zzb);
                long j3 = zzlvVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z2 || (zzc && j3 == j4)) {
                    z = false;
                }
                if (z) {
                    int zzs = zzs();
                    if (zzbfVar.zzg() || zzlvVar.zza.zzb.zzb()) {
                        j = zzlvVar.zza.zzd;
                    } else {
                        zzmw zzmwVar = zzlvVar.zza;
                        zzxo zzxoVar = zzmwVar.zzb;
                        j = zzmwVar.zzd;
                        zzao(zzbfVar, zzxoVar, j);
                    }
                    j2 = j;
                    i = zzs;
                } else {
                    i = -1;
                }
            } else {
                i = -1;
                z = false;
            }
            this.zzI = false;
            zzaj(zzlvVar.zza, 1, z, this.zzH, j2, i, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzeg zzU() {
        return this.zzn;
    }

    final /* synthetic */ zznq zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdp zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdn zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzka zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzka zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzU = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzat();
        if (i == -1) {
            return;
        }
        zzguk.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzeh.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlv zzlvVar = new zzlv(this.zzaa);
                zzlvVar.zza(1);
                this.zzl.zza(zzlvVar);
                return;
            }
            zzmw zzmwVar = this.zzaa;
            int i3 = zzmwVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmwVar = zzam(this.zzaa, 2);
            }
            int zzs = zzs();
            zzmw zzal = zzal(zzmwVar, zzbfVar, zzan(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfm.zzt(j));
            zzaj(zzal, 0, true, 1, zzai(zzal), zzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzmw zzmwVar = this.zzaa;
        if (zzmwVar.zze != 1) {
            return;
        }
        zzmw zzf = zzmwVar.zzf(null);
        zzmw zzam = zzam(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzat();
        zzmw zzmwVar = this.zzaa;
        int i = zzmwVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmwVar.zzl == z && i == i2 && zzmwVar.zzm == 1) {
            return;
        }
        this.zzG++;
        zzmw zzi = zzmwVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzaj(zzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzda(zzgxm.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzmw zzmwVar = this.zzaa;
            return zzmwVar.zza.zze(zzmwVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int zzag = zzag(this.zzaa);
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzq = zzq();
            if (zzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfm.zzs(zzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmw zzmwVar = this.zzaa;
        zzxo zzxoVar = zzmwVar.zzb;
        zzbf zzbfVar = zzmwVar.zza;
        Object obj = zzxoVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfm.zzs(zzbdVar.zzh(zzxoVar.zzb, zzxoVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfm.zzs(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzmw zzmwVar = this.zzaa;
            return zzmwVar.zzk.equals(zzmwVar.zzb) ? zzfm.zzs(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmw zzmwVar2 = this.zzaa;
        long j = 0;
        if (zzmwVar2.zzk.zzd != zzmwVar2.zzb.zzd) {
            return zzfm.zzs(zzmwVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmwVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmw zzmwVar3 = this.zzaa;
            zzmwVar3.zza.zzo(zzmwVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        zzmw zzmwVar4 = this.zzaa;
        zzao(zzmwVar4.zza, zzmwVar4.zzk, j);
        return zzfm.zzs(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfm.zzs(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }
}
