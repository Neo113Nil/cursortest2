package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public abstract class zzvz extends zzja {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;

    @Nullable
    private ArrayDeque zzB;

    @Nullable
    private zzvv zzC;

    @Nullable
    private zzvs zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;

    @Nullable
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzje zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzvy zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private zzjc zzam;
    private zzjc zzan;
    private zzgxw zzao;
    private final Context zzc;
    private final zzvn zzd;
    private final zzwb zze;
    private final zziy zzf;
    private final zziy zzg;
    private final zziy zzh;
    private final zzvg zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzud zzl;
    private final AtomicInteger zzm;

    @Nullable
    private zzv zzn;
    private zzv zzo;

    @Nullable
    private zzul zzp;

    @Nullable
    private zzul zzq;
    private zznd zzr;

    @Nullable
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;

    @Nullable
    private zzvp zzw;

    @Nullable
    private zzv zzx;

    @Nullable
    private MediaFormat zzy;
    private boolean zzz;

    public zzvz(Context context, int i, zzvn zzvnVar, zzwb zzwbVar, boolean z, float f) {
        super(i);
        zzvy zzvyVar;
        this.zzc = context.getApplicationContext();
        this.zzd = zzvnVar;
        zzwbVar.getClass();
        this.zze = zzwbVar;
        this.zzm = new AtomicInteger();
        this.zzf = new zziy(0, 0);
        this.zzg = new zziy(0, 0);
        this.zzh = new zziy(2, 0);
        zzvg zzvgVar = new zzvg();
        this.zzi = zzvgVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        zzvyVar = zzvy.zza;
        this.zzag = zzvyVar;
        zzvgVar.zzj(0);
        zzvgVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzud();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzV = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzje();
        this.zzak = false;
        this.zzal = 0L;
        this.zzao = zzgxw.zzh();
        zzjc zzjcVar = zzjc.zza;
        this.zzam = zzjcVar;
        this.zzan = zzjcVar;
    }

    private final void zzaA() {
        try {
            zzvp zzvpVar = this.zzw;
            if (zzvpVar == null) {
                throw null;
            }
            zzvpVar.zzk();
        } finally {
            zzaT();
        }
    }

    private final void zzaB() {
        this.zzab = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        zzbv().zzi(-9223372036854775807L);
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzaC(int i) throws zzjn {
        zzma zzI = zzI();
        zziy zziyVar = this.zzf;
        zziyVar.zza();
        int zzR = zzR(zzI, zziyVar, i | 4);
        if (zzR == -5) {
            zzap(zzI);
            return true;
        }
        if (zzR != -4 || !zziyVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbt();
        return false;
    }

    private final boolean zzaD(long j) {
        return this.zzt == -9223372036854775807L || zzM().zzb() - j < this.zzt;
    }

    private final boolean zzaE() {
        return this.zzO >= 0;
    }

    private final void zzar() {
        this.zzR = false;
        zzay();
    }

    private final void zzay() {
        zzaB();
        this.zzT = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzS = false;
        this.zzl.zzb();
    }

    private final boolean zzaz() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaQ()) {
            zzaO();
            return true;
        }
        if (zzaR()) {
            zzaA();
            return false;
        }
        this.zzak = true;
        return false;
    }

    protected static boolean zzbl(zzv zzvVar) {
        return zzvVar.zzQ == 0;
    }

    private final void zzbo() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbp() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final void zzbq(@Nullable zzv zzvVar) {
        if (this.zzw == null || this.zzX == 3 || zze() == 0) {
            return;
        }
        float f = this.zzv;
        zzvVar.getClass();
        float zzal = zzal(f, zzvVar, zzJ());
        float f2 = this.zzA;
        if (f2 == zzal || zzal == -1.0f) {
            return;
        }
        if (f2 != -1.0f || zzal > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", zzal);
            zzvp zzvpVar = this.zzw;
            zzvpVar.getClass();
            zzvpVar.zzp(bundle);
            this.zzA = zzal;
        }
    }

    private final boolean zzbr() throws zzjn {
        if (this.zzY) {
            this.zzW = 1;
            if (zzaQ()) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzbw();
        }
        return true;
    }

    private final void zzbs() throws zzjn {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaO();
            zzaG();
        }
    }

    private final void zzbu(zzvy zzvyVar) {
        this.zzag = zzvyVar;
        if (zzvyVar.zzd() != -9223372036854775807L) {
            this.zzai = true;
            zzaw(zzvyVar.zzd());
        }
    }

    private final zzvy zzbv() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzvy) arrayDeque.getLast() : this.zzag;
    }

    private final boolean zzbx(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzo;
        if (zzvVar == null || !Objects.equals(zzvVar.zzp, "audio/opus")) {
            return true;
        }
        return !zzgy.zzf(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected void zzA(long j, boolean z, boolean z2) throws zzjn {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzvy) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzR) {
                zzay();
            } else {
                zzaP();
            }
            if (this.zzag.zze().zzc() > 0) {
                this.zzaf = true;
            }
            this.zzag.zze().zzb();
            this.zzag.zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected void zzD() {
        zzvy zzvyVar;
        this.zzn = null;
        zzvyVar = zzvy.zza;
        zzbu(zzvyVar);
        this.zzk.clear();
        if (this.zzR) {
            zzar();
        } else {
            zzaz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected void zzE() {
        try {
            zzar();
            zzaO();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzG(zzbf zzbfVar) {
        zzbv();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zzW(long j, long j2) {
        return zzak(j, j2, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public void zzY(float f, float f2) throws zzjn {
        this.zzu = f;
        this.zzv = f2;
        zzbq(this.zzx);
    }

    public final void zzaF() {
        this.zzaj = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af A[Catch: zzvv -> 0x02b2, TryCatch #2 {zzvv -> 0x02b2, blocks: (B:108:0x0296, B:110:0x02af, B:111:0x02ba, B:116:0x02c1, B:117:0x02c3, B:118:0x02b4, B:184:0x02c7, B:186:0x02c8, B:189:0x02d1, B:190:0x02d2, B:191:0x02de, B:203:0x02e2), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b4 A[Catch: zzvv -> 0x02b2, TryCatch #2 {zzvv -> 0x02b2, blocks: (B:108:0x0296, B:110:0x02af, B:111:0x02ba, B:116:0x02c1, B:117:0x02c3, B:118:0x02b4, B:184:0x02c7, B:186:0x02c8, B:189:0x02d1, B:190:0x02d2, B:191:0x02de, B:203:0x02e2), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc A[Catch: Exception -> 0x0106, TryCatch #6 {Exception -> 0x0106, blocks: (B:160:0x00fc, B:55:0x0147, B:57:0x015a, B:58:0x016f, B:60:0x0178, B:62:0x0180, B:64:0x018a, B:66:0x0192, B:68:0x019a, B:71:0x01a5, B:73:0x01ab, B:76:0x01b6, B:78:0x01bf, B:82:0x0216, B:84:0x021c, B:86:0x0222, B:87:0x0230, B:123:0x01cc, B:125:0x01d4, B:127:0x01dc, B:129:0x01e4, B:131:0x01ec, B:133:0x01f4, B:135:0x01fc, B:137:0x0206, B:139:0x0210), top: B:159:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a A[Catch: Exception -> 0x0106, TryCatch #6 {Exception -> 0x0106, blocks: (B:160:0x00fc, B:55:0x0147, B:57:0x015a, B:58:0x016f, B:60:0x0178, B:62:0x0180, B:64:0x018a, B:66:0x0192, B:68:0x019a, B:71:0x01a5, B:73:0x01ab, B:76:0x01b6, B:78:0x01bf, B:82:0x0216, B:84:0x021c, B:86:0x0222, B:87:0x0230, B:123:0x01cc, B:125:0x01d4, B:127:0x01dc, B:129:0x01e4, B:131:0x01ec, B:133:0x01f4, B:135:0x01fc, B:137:0x0206, B:139:0x0210), top: B:159:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: Exception -> 0x0106, TryCatch #6 {Exception -> 0x0106, blocks: (B:160:0x00fc, B:55:0x0147, B:57:0x015a, B:58:0x016f, B:60:0x0178, B:62:0x0180, B:64:0x018a, B:66:0x0192, B:68:0x019a, B:71:0x01a5, B:73:0x01ab, B:76:0x01b6, B:78:0x01bf, B:82:0x0216, B:84:0x021c, B:86:0x0222, B:87:0x0230, B:123:0x01cc, B:125:0x01d4, B:127:0x01dc, B:129:0x01e4, B:131:0x01ec, B:133:0x01f4, B:135:0x01fc, B:137:0x0206, B:139:0x0210), top: B:159:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf A[Catch: Exception -> 0x0106, TryCatch #6 {Exception -> 0x0106, blocks: (B:160:0x00fc, B:55:0x0147, B:57:0x015a, B:58:0x016f, B:60:0x0178, B:62:0x0180, B:64:0x018a, B:66:0x0192, B:68:0x019a, B:71:0x01a5, B:73:0x01ab, B:76:0x01b6, B:78:0x01bf, B:82:0x0216, B:84:0x021c, B:86:0x0222, B:87:0x0230, B:123:0x01cc, B:125:0x01d4, B:127:0x01dc, B:129:0x01e4, B:131:0x01ec, B:133:0x01f4, B:135:0x01fc, B:137:0x0206, B:139:0x0210), top: B:159:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021c A[Catch: Exception -> 0x0106, TryCatch #6 {Exception -> 0x0106, blocks: (B:160:0x00fc, B:55:0x0147, B:57:0x015a, B:58:0x016f, B:60:0x0178, B:62:0x0180, B:64:0x018a, B:66:0x0192, B:68:0x019a, B:71:0x01a5, B:73:0x01ab, B:76:0x01b6, B:78:0x01bf, B:82:0x0216, B:84:0x021c, B:86:0x0222, B:87:0x0230, B:123:0x01cc, B:125:0x01d4, B:127:0x01dc, B:129:0x01e4, B:131:0x01ec, B:133:0x01f4, B:135:0x01fc, B:137:0x0206, B:139:0x0210), top: B:159:0x00fc }] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.zzvn] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.google.android.gms.internal.ads.zzvm] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzvz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaG() throws zzjn {
        zzv zzvVar;
        zzvs zzvsVar;
        zzv zzvVar2;
        boolean z;
        ?? r11;
        zzvv zzvvVar;
        zzv zzvVar3;
        ArrayDeque arrayDeque;
        zzvs zzvsVar2;
        zzv zzvVar4;
        ?? r12;
        ArrayDeque arrayDeque2;
        zzv zzvVar5;
        LogSessionId zza;
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        ?? r10;
        long zzb2;
        int i;
        boolean z2;
        String str;
        if (this.zzw != null || this.zzR || (zzvVar = this.zzn) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaH(zzvVar)) {
            zzar();
            String str2 = zzvVar.zzp;
            if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzR = true;
            return;
        }
        zzul zzulVar = this.zzq;
        this.zzp = zzulVar;
        if (zzulVar != null) {
            zzguk.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar6 = this.zzn;
            MediaCrypto mediaCrypto = null;
            try {
                if (zzvVar6 == null) {
                    throw null;
                }
                if (this.zzB == null) {
                    try {
                        List zzag = zzag(this.zze, zzvVar6, false);
                        zzag.isEmpty();
                        this.zzB = new ArrayDeque();
                        if (!zzag.isEmpty()) {
                            this.zzB.add((zzvs) zzag.get(0));
                        }
                        this.zzC = null;
                    } catch (zzwd e) {
                        throw new zzvv(zzvVar6, (Throwable) e, false, -49998);
                    }
                }
                if (this.zzB.isEmpty()) {
                    throw new zzvv(zzvVar6, (Throwable) null, false, -49999);
                }
                ArrayDeque arrayDeque3 = this.zzB;
                zzv zzvVar7 = zzvVar;
                if (arrayDeque3 == null) {
                    throw null;
                }
                while (this.zzw == null) {
                    zzvs zzvsVar3 = (zzvs) arrayDeque3.peekFirst();
                    if (zzvsVar3 == null) {
                        throw mediaCrypto;
                    }
                    zzaW(zzvVar6);
                    if (!zzaI(zzvsVar3)) {
                        return;
                    }
                    try {
                        this.zzD = zzvsVar3;
                        zzvVar3 = this.zzn;
                    } catch (Exception e2) {
                        e = e2;
                        zzvsVar = zzvsVar3;
                        zzvVar2 = zzvVar7;
                        z = z3;
                        r11 = arrayDeque3;
                    }
                    if (zzvVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str3 = zzvsVar3.zza;
                    float zzal = zzal(this.zzv, zzvVar3, zzJ());
                    if (zzal <= 0.0f) {
                        zzal = -1.0f;
                    }
                    long zzb3 = zzM().zzb();
                    try {
                        r11 = zzai(zzvsVar3, zzvVar3, mediaCrypto, zzal);
                        r12 = Build.VERSION.SDK_INT;
                    } catch (Exception e3) {
                        e = e3;
                        arrayDeque = arrayDeque3;
                        zzvsVar2 = zzvsVar3;
                        zzvVar4 = zzvVar7;
                    }
                    try {
                        if (r12 >= 31) {
                            try {
                                zza = zzL().zza();
                                arrayDeque2 = arrayDeque3;
                                try {
                                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                                    equals = zza.equals(logSessionId);
                                } catch (Exception e4) {
                                    e = e4;
                                    zzvVar5 = zzvVar7;
                                    zzvsVar2 = zzvsVar3;
                                    arrayDeque = arrayDeque2;
                                    zzvVar4 = zzvVar5;
                                    z = true;
                                    r11 = arrayDeque;
                                    zzvsVar = zzvsVar2;
                                    zzvVar2 = zzvVar4;
                                    zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzvsVar.zza), e);
                                    r11.removeFirst();
                                    zzvv zzvvVar2 = new zzvv(zzvVar6, (Throwable) e, false, zzvsVar);
                                    zzao(zzvvVar2);
                                    zzvvVar = this.zzC;
                                    if (zzvvVar != null) {
                                    }
                                    if (!r11.isEmpty()) {
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                arrayDeque2 = arrayDeque3;
                            }
                            if (!equals) {
                                MediaFormat mediaFormat = r11.zzb;
                                zzvVar5 = zzvVar7;
                                try {
                                    stringId = zza.getStringId();
                                    mediaFormat.setString("log-session-id", stringId);
                                    r10 = "log-session-id";
                                    zzvVar2 = zzvVar5;
                                    StringBuilder sb = new StringBuilder(str3.length() + 12);
                                    sb.append("createCodec:");
                                    sb.append(str3);
                                    Trace.beginSection(sb.toString());
                                    zzvp zzc = this.zzd.zzc(r11);
                                    this.zzw = zzc;
                                    r10 = 0;
                                    this.zzL = zzc.zzm(new zzvx(this, null));
                                    Trace.endSection();
                                    zzb2 = zzM().zzb();
                                    if (!zzvsVar3.zzc(this.zzc, zzvVar3)) {
                                        Object[] objArr = {zzv.zze(zzvVar3), str3};
                                        String str4 = zzfm.zza;
                                        zzeh.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                    }
                                    this.zzA = zzal;
                                    this.zzx = zzvVar3;
                                } catch (Exception e6) {
                                    e = e6;
                                    zzvsVar2 = zzvsVar3;
                                    arrayDeque = arrayDeque2;
                                    zzvVar4 = zzvVar5;
                                    z = true;
                                    r11 = arrayDeque;
                                    zzvsVar = zzvsVar2;
                                    zzvVar2 = zzvVar4;
                                    zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzvsVar.zza), e);
                                    r11.removeFirst();
                                    zzvv zzvvVar22 = new zzvv(zzvVar6, (Throwable) e, false, zzvsVar);
                                    zzao(zzvvVar22);
                                    zzvvVar = this.zzC;
                                    if (zzvvVar != null) {
                                    }
                                    if (!r11.isEmpty()) {
                                    }
                                }
                                if (r12 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                                    str = Build.MODEL;
                                    if (!str.startsWith("SM-T585") || str.startsWith("SM-A510") || str.startsWith("SM-A520") || str.startsWith("SM-J700")) {
                                        i = 2;
                                        this.zzE = i;
                                        this.zzF = r12 != 29 && "c2.android.aac.decoder".equals(str3);
                                        this.zzG = false;
                                        String str5 = zzvsVar3.zza;
                                        if (r12 <= 25) {
                                            if ("OMX.rk.video_decoder.avc".equals(str5)) {
                                            }
                                            z2 = true;
                                            this.zzJ = z2;
                                            if (this.zzw != null) {
                                                throw null;
                                            }
                                            if (zze() == 2) {
                                                this.zzM = zzM().zzb() + 1000;
                                            }
                                            z = true;
                                            z = true;
                                            r10 = 1;
                                            try {
                                                this.zza.zza++;
                                                long j = zzb2 - zzb3;
                                                if (r12 >= 31 && !this.zzao.isEmpty()) {
                                                    zzvp zzvpVar = this.zzw;
                                                    if (zzvpVar == null) {
                                                        throw null;
                                                    }
                                                    zzvpVar.zzr(new ArrayList(this.zzao));
                                                }
                                                r12 = zzvsVar3;
                                                r11 = arrayDeque2;
                                                try {
                                                    zzam(str3, r11, zzb2, j);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    z = r10;
                                                    r11 = r11;
                                                    zzvsVar = r12;
                                                    zzvVar2 = zzvVar2;
                                                    zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzvsVar.zza), e);
                                                    r11.removeFirst();
                                                    zzvv zzvvVar222 = new zzvv(zzvVar6, (Throwable) e, false, zzvsVar);
                                                    zzao(zzvvVar222);
                                                    zzvvVar = this.zzC;
                                                    if (zzvvVar != null) {
                                                        this.zzC = zzvvVar222;
                                                    } else {
                                                        this.zzC = zzvvVar.zza(zzvvVar222);
                                                    }
                                                    if (!r11.isEmpty()) {
                                                        throw this.zzC;
                                                    }
                                                    arrayDeque3 = r11;
                                                    mediaCrypto = null;
                                                    z3 = z;
                                                    zzvVar7 = zzvVar2;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                zzvsVar = zzvsVar3;
                                                r11 = arrayDeque2;
                                                zzvVar2 = zzvVar2;
                                                zzeh.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzvsVar.zza), e);
                                                r11.removeFirst();
                                                zzvv zzvvVar2222 = new zzvv(zzvVar6, (Throwable) e, false, zzvsVar);
                                                zzao(zzvvVar2222);
                                                zzvvVar = this.zzC;
                                                if (zzvvVar != null) {
                                                }
                                                if (!r11.isEmpty()) {
                                                }
                                            }
                                            arrayDeque3 = r11;
                                            mediaCrypto = null;
                                            z3 = z;
                                            zzvVar7 = zzvVar2;
                                        }
                                        if ((r12 <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str5) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.avc.tunnel".equals(str5) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzvsVar3.zzf)) {
                                            z2 = false;
                                            this.zzJ = z2;
                                            if (this.zzw != null) {
                                            }
                                        }
                                        z2 = true;
                                        this.zzJ = z2;
                                        if (this.zzw != null) {
                                        }
                                    }
                                }
                                i = 0;
                                this.zzE = i;
                                this.zzF = r12 != 29 && "c2.android.aac.decoder".equals(str3);
                                this.zzG = false;
                                String str52 = zzvsVar3.zza;
                                if (r12 <= 25) {
                                }
                                if (r12 <= 29) {
                                }
                                z2 = false;
                                this.zzJ = z2;
                                if (this.zzw != null) {
                                }
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 12);
                        sb2.append("createCodec:");
                        sb2.append(str3);
                        Trace.beginSection(sb2.toString());
                        zzvp zzc2 = this.zzd.zzc(r11);
                        this.zzw = zzc2;
                        r10 = 0;
                        this.zzL = zzc2.zzm(new zzvx(this, null));
                        Trace.endSection();
                        zzb2 = zzM().zzb();
                        if (!zzvsVar3.zzc(this.zzc, zzvVar3)) {
                        }
                        this.zzA = zzal;
                        this.zzx = zzvVar3;
                        if (r12 <= 25) {
                            str = Build.MODEL;
                            if (!str.startsWith("SM-T585")) {
                            }
                            i = 2;
                            this.zzE = i;
                            this.zzF = r12 != 29 && "c2.android.aac.decoder".equals(str3);
                            this.zzG = false;
                            String str522 = zzvsVar3.zza;
                            if (r12 <= 25) {
                            }
                            if (r12 <= 29) {
                            }
                            z2 = false;
                            this.zzJ = z2;
                            if (this.zzw != null) {
                            }
                        }
                        i = 0;
                        this.zzE = i;
                        this.zzF = r12 != 29 && "c2.android.aac.decoder".equals(str3);
                        this.zzG = false;
                        String str5222 = zzvsVar3.zza;
                        if (r12 <= 25) {
                        }
                        if (r12 <= 29) {
                        }
                        z2 = false;
                        this.zzJ = z2;
                        if (this.zzw != null) {
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                    zzvVar2 = zzvVar7;
                    r10 = zzvVar7;
                }
                this.zzB = mediaCrypto;
            } catch (zzvv e9) {
                e = e9;
                throw zzQ(e, zzvVar, false, 4001);
            }
        } catch (zzvv e10) {
            e = e10;
        }
    }

    protected final boolean zzaH(zzv zzvVar) {
        return this.zzq == null && zzah(zzvVar);
    }

    protected boolean zzaI(zzvs zzvsVar) {
        return true;
    }

    protected final boolean zzaJ() {
        return this.zzR;
    }

    @Nullable
    protected final zzvp zzaK() {
        return this.zzw;
    }

    @Nullable
    protected final zzv zzaL() {
        return this.zzx;
    }

    @Nullable
    protected final MediaFormat zzaM() {
        return this.zzy;
    }

    @Nullable
    protected final zzvs zzaN() {
        return this.zzD;
    }

    protected final void zzaO() {
        try {
            zzvp zzvpVar = this.zzw;
            if (zzvpVar != null) {
                zzvpVar.zzl();
                this.zza.zzb++;
                zzvs zzvsVar = this.zzD;
                if (zzvsVar == null) {
                    throw null;
                }
                zzan(zzvsVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaU();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaU();
            throw th;
        }
    }

    protected final boolean zzaP() throws zzjn {
        boolean zzaz = zzaz();
        if (zzaz) {
            zzaG();
        }
        return zzaz;
    }

    protected boolean zzaQ() {
        int i = this.zzX;
        if (i == 3 || ((this.zzF && !this.zzaa) || (this.zzG && (this.zzZ || this.zzW == 1)))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbw();
            return false;
        } catch (zzjn e) {
            zzeh.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaR() {
        return true;
    }

    protected final long zzaS() {
        return this.zzal;
    }

    @CallSuper
    protected void zzaT() {
        zzbo();
        zzbp();
        zzaB();
        this.zzM = -9223372036854775807L;
        this.zzZ = false;
        this.zzK = -9223372036854775807L;
        this.zzY = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    protected final void zzaU() {
        zzaT();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzaa = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzU = false;
        this.zzV = 0;
    }

    protected zzvr zzaV(Throwable th, @Nullable zzvs zzvsVar) {
        return new zzvr(th, zzvsVar);
    }

    protected boolean zzaW(zzv zzvVar) throws zzjn {
        return true;
    }

    protected void zzaX(zziy zziyVar) throws zzjn {
    }

    protected int zzaY(zziy zziyVar) {
        return 0;
    }

    protected boolean zzaZ(zziy zziyVar) {
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzne
    public void zzaa(long r30, long r32) throws com.google.android.gms.internal.ads.zzjn {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvz.zzaa(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public boolean zzac() {
        return this.zzae;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final int zzae(zzv zzvVar) throws zzjn {
        try {
            return zzaf(this.zze, zzvVar);
        } catch (zzwd e) {
            throw zzQ(e, zzvVar, false, 4002);
        }
    }

    protected abstract int zzaf(zzwb zzwbVar, zzv zzvVar) throws zzwd;

    protected abstract List zzag(zzwb zzwbVar, zzv zzvVar, boolean z) throws zzwd;

    protected boolean zzah(zzv zzvVar) {
        return false;
    }

    protected abstract zzvm zzai(zzvs zzvsVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f);

    protected zzjf zzaj(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        throw null;
    }

    protected long zzak(long j, long j2, boolean z) {
        return super.zzW(j, j2);
    }

    protected float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzam(String str, zzvm zzvmVar, long j, long j2) {
        throw null;
    }

    protected void zzan(String str) {
        throw null;
    }

    protected void zzao(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (java.util.Objects.equals(r2, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        if (zzbr() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e8, code lost:
    
        if (zzbr() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
    
        if (zzbr() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Nullable
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzjf zzap(zzma zzmaVar) throws zzjn {
        int i;
        Pair zze;
        String str;
        boolean z = true;
        this.zzaf = true;
        zzv zzvVar = zzmaVar.zzb;
        zzvVar.getClass();
        String str2 = zzvVar.zzp;
        if (str2 == null) {
            throw zzQ(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                int i2 = zzdr.zza;
                if (str2.equals("video/dolby-vision") && (zze = zzdr.zze(zzvVar)) != null) {
                    int intValue = ((Integer) zze.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            zzv zzvVar2 = zzvVar;
            this.zzq = zzmaVar.zza;
            this.zzn = zzvVar2;
            if (!this.zzR) {
                this.zzT = true;
                return null;
            }
            zzvp zzvpVar = this.zzw;
            if (zzvpVar == null) {
                this.zzB = null;
                zzaG();
                return null;
            }
            zzvs zzvsVar = this.zzD;
            zzvsVar.getClass();
            zzv zzvVar3 = this.zzx;
            zzvVar3.getClass();
            zzul zzulVar = this.zzp;
            zzul zzulVar2 = this.zzq;
            if (zzulVar != zzulVar2) {
                zzbs();
                return new zzjf(zzvsVar.zza, zzvVar3, zzvVar2, 0, 128);
            }
            zzjf zzaj = zzaj(zzvsVar, zzvVar3, zzvVar2, zzbv().zzf());
            int i3 = zzaj.zzd;
            if (i3 != 0) {
                if (i3 == 1) {
                    zzbq(zzvVar2);
                    this.zzx = zzvVar2;
                    if (zzulVar2 == zzulVar) {
                        if (this.zzY) {
                            this.zzW = 1;
                            if (zzaQ()) {
                                this.zzX = 3;
                                i = 2;
                            } else {
                                this.zzX = 1;
                            }
                        }
                    }
                } else if (i3 != 2) {
                    zzbq(zzvVar2);
                    this.zzx = zzvVar2;
                    if (zzulVar2 != zzulVar) {
                    }
                } else {
                    zzbq(zzvVar2);
                    this.zzU = true;
                    this.zzV = 1;
                    int i4 = this.zzE;
                    if (i4 != 2 && (i4 != 1 || zzvVar2.zzw != zzvVar3.zzw || zzvVar2.zzx != zzvVar3.zzx)) {
                        z = false;
                    }
                    this.zzH = z;
                    this.zzx = zzvVar2;
                    if (zzulVar2 != zzulVar) {
                    }
                }
                return (i3 != 0 || (this.zzw == zzvpVar && this.zzX != 3)) ? zzaj : new zzjf(zzvsVar.zza, zzvVar3, zzvVar2, 0, i);
            }
            zzbs();
            i = 0;
            if (i3 != 0) {
            }
        }
        if (!zzvVar.zzs.isEmpty()) {
            zzt zza = zzvVar.zza();
            zza.zzr(null);
            zzvVar = zza.zzQ();
        }
        zzv zzvVar22 = zzvVar;
        this.zzq = zzmaVar.zza;
        this.zzn = zzvVar22;
        if (!this.zzR) {
        }
    }

    protected void zzaq(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zzjn {
        throw null;
    }

    protected void zzas() {
    }

    protected abstract boolean zzat(long j, long j2, @Nullable zzvp zzvpVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjn;

    protected abstract void zzau(zzjc zzjcVar);

    protected void zzav() throws zzjn {
        throw null;
    }

    protected void zzaw(long j) {
    }

    protected void zzax(zziy zziyVar) throws zzjn {
        throw null;
    }

    protected final long zzba() {
        return this.zzah;
    }

    @CallSuper
    protected void zzbb(long j) {
        this.zzah = Math.max(j, this.zzah);
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzvy) arrayDeque.peek()).zzb()) {
                return;
            }
            zzvy zzvyVar = (zzvy) arrayDeque.poll();
            zzvyVar.getClass();
            zzbu(zzvyVar);
            zzas();
        }
    }

    protected final boolean zzbc() {
        if (this.zzn == null) {
            return false;
        }
        if (zzT() || zzaE()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzM().zzb() < this.zzM;
    }

    protected final float zzbd() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final zznd zzbe() {
        return this.zzr;
    }

    protected final void zzbf() {
        zzbq(this.zzx);
    }

    protected final long zzbg() {
        return this.zzag.zzh();
    }

    protected final long zzbh() {
        return this.zzab;
    }

    protected final long zzbi() {
        return this.zzag.zzd();
    }

    protected final long zzbj() {
        return this.zzag.zzc();
    }

    protected final void zzbk(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzam.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbm(zzma zzmaVar) {
        this.zzm.set(zzR(zzmaVar, this.zzg, 0));
    }

    final /* synthetic */ zznd zzbn() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzng
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public void zzx(int i, @Nullable Object obj) throws zzjn {
        if (i != 11) {
            return;
        }
        zznd zzndVar = (zznd) obj;
        zzndVar.getClass();
        this.zzr = zzndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected void zzy(boolean z, boolean z2) throws zzjn {
        this.zza = new zzje();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r3 >= r1) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) throws zzjn {
        long zzP = zzP();
        zzcV().getClass();
        if (this.zzag.zzd() == -9223372036854775807L) {
            zzbu(new zzvy(-9223372036854775807L, j, j2, zzP, 0, null));
            if (this.zzaj) {
                zzas();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j3 = this.zzab;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzah;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzbu(new zzvy(-9223372036854775807L, j, j2, zzP, 0, null));
            if (this.zzag.zzd() != -9223372036854775807L) {
                zzas();
                return;
            }
            return;
        }
        arrayDeque.add(new zzvy(this.zzab, j, j2, zzP, 0, null));
    }

    private final void zzbw() throws zzjn {
        zzul zzulVar = this.zzq;
        zzulVar.getClass();
        this.zzp = zzulVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final void zzbt() throws zzjn {
        int i = this.zzX;
        if (i == 1) {
            zzaA();
            return;
        }
        if (i == 2) {
            zzaA();
            zzbw();
        } else if (i != 3) {
            this.zzae = true;
            zzav();
        } else {
            zzaO();
            zzaG();
        }
    }
}
