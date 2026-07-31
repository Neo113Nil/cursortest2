package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrd;
import com.mbridge.msdk.foundation.download.Command;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes6.dex */
public final class zzpv implements zzjs {
    private static volatile zzpv zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzmh zzG;
    private String zzH;
    private zzaz zzI;
    private long zzJ;
    long zza;
    private final zzif zzc;
    private final zzhk zzd;
    private zzaw zze;
    private zzhm zzf;
    private zzoy zzg;
    private zzae zzh;
    private final zzqa zzi;
    private zzmc zzj;
    private zzoa zzk;
    private final zzpi zzl;
    private zzhw zzm;
    private final zzio zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzqe zzK = new zzpq(this);

    zzpv(zzpw zzpwVar, zzio zzioVar) {
        Preconditions.checkNotNull(zzpwVar);
        this.zzn = zzio.zzp(zzpwVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzpi(this);
        zzqa zzqaVar = new zzqa(this);
        zzqaVar.zzaw();
        this.zzi = zzqaVar;
        zzhk zzhkVar = new zzhk(this);
        zzhkVar.zzaw();
        this.zzd = zzhkVar;
        zzif zzifVar = new zzif(this);
        zzifVar.zzaw();
        this.zzc = zzifVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaX().zzq(new zzpk(this, zzpwVar));
    }

    static /* bridge */ /* synthetic */ void zzH(zzpv zzpvVar, zzpw zzpwVar) {
        zzpvVar.zzaX().zzg();
        zzpvVar.zzm = new zzhw(zzpvVar);
        zzaw zzawVar = new zzaw(zzpvVar);
        zzawVar.zzaw();
        zzpvVar.zze = zzawVar;
        zzpvVar.zzi().zzu((zzal) Preconditions.checkNotNull(zzpvVar.zzc));
        zzoa zzoaVar = new zzoa(zzpvVar);
        zzoaVar.zzaw();
        zzpvVar.zzk = zzoaVar;
        zzae zzaeVar = new zzae(zzpvVar);
        zzaeVar.zzaw();
        zzpvVar.zzh = zzaeVar;
        zzmc zzmcVar = new zzmc(zzpvVar);
        zzmcVar.zzaw();
        zzpvVar.zzj = zzmcVar;
        zzoy zzoyVar = new zzoy(zzpvVar);
        zzoyVar.zzaw();
        zzpvVar.zzg = zzoyVar;
        zzpvVar.zzf = new zzhm(zzpvVar);
        if (zzpvVar.zzs != zzpvVar.zzt) {
            zzpvVar.zzaW().zze().zzc("Not all upload components initialized", Integer.valueOf(zzpvVar.zzs), Integer.valueOf(zzpvVar.zzt));
        }
        zzpvVar.zzo.set(true);
        zzpvVar.zzaW().zzj().zza("UploadController is now fully initialized");
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhl zzhlVar, int i, String str) {
        List zzp = zzhlVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
        zze.zzj("_err");
        zze.zzi(i);
        com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) zze.zzba();
        com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) zze2.zzba();
        zzhlVar.zzf(zzhqVar);
        zzhlVar.zzf(zzhqVar2);
    }

    static final void zzaB(com.google.android.gms.internal.measurement.zzhl zzhlVar, String str) {
        List zzp = zzhlVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i)).zzg())) {
                zzhlVar.zzh(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzao zzaoVar) {
        zzjw zzjwVar;
        zzju zzf;
        zzif zzifVar = this.zzc;
        if (zzifVar.zzi(str) == null) {
            zzaoVar.zzd(zzjw.AD_PERSONALIZATION, zzan.FAILSAFE);
            return 1;
        }
        zzh zzl = zzj().zzl(str);
        if (zzl != null && zze.zza(zzl.zzK()).zzb() == zzju.POLICY && (zzf = zzifVar.zzf(str, (zzjwVar = zzjw.AD_PERSONALIZATION))) != zzju.UNINITIALIZED) {
            zzaoVar.zzd(zzjwVar, zzan.REMOTE_ENFORCED_DEFAULT);
            return zzf == zzju.GRANTED ? 0 : 1;
        }
        zzjw zzjwVar2 = zzjw.AD_PERSONALIZATION;
        zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DEFAULT);
        return zzifVar.zzu(str, zzjwVar2) ? 0 : 1;
    }

    private final zzr zzaD(String str) {
        zzh zzl = zzj().zzl(str);
        if (zzl == null || TextUtils.isEmpty(zzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzaF = zzaF(zzl);
        if (zzaF == null || zzaF.booleanValue()) {
            return new zzr(str, zzl.zzH(), zzl.zzF(), zzl.zze(), zzl.zzE(), zzl.zzq(), zzl.zzn(), (String) null, zzl.zzaJ(), false, zzl.zzG(), 0L, 0, zzl.zzaI(), false, zzl.zzA(), zzl.zzx(), zzl.zzo(), zzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzl.zzaL(), zzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzl.zza(), zzl.zzf(), zzl.zzM(), zzl.zzK(), 0L, zzl.zzb());
        }
        zzaW().zze().zzb("App version does not match; dropping. appId", zzhe.zzn(str));
        return null;
    }

    private final zzaz zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzpn(this, this.zzn);
        }
        return this.zzI;
    }

    private final Boolean zzaF(zzh zzhVar) {
        try {
            if (zzhVar.zze() != -2147483648L) {
                if (zzhVar.zze() == Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionName;
                String zzF = zzhVar.zzF();
                if (zzF != null && zzF.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String zzaG(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaH() {
        zzaX().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaW().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaW().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaI(com.google.android.gms.internal.measurement.zzhw zzhwVar, long j, boolean z) {
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzqd zzy = zzj().zzy(zzhwVar.zzaF(), str);
        zzqd zzqdVar = (zzy == null || (obj = zzy.zze) == null) ? new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(j)) : new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
        zze.zzf(str);
        zze.zzg(zzaU().currentTimeMillis());
        Object obj2 = zzqdVar.zze;
        zze.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zzio zzioVar = (com.google.android.gms.internal.measurement.zzio) zze.zzba();
        int zza = zzqa.zza(zzhwVar, str);
        if (zza >= 0) {
            zzhwVar.zzaC(zza, zzioVar);
        } else {
            zzhwVar.zzp(zzioVar);
        }
        if (j > 0) {
            zzj().zzai(zzqdVar);
            zzaW().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ() {
        zzaX().zzg();
        if (this.zzr.isEmpty() || zzaE().zze()) {
            return;
        }
        long max = Math.max(0L, ((Integer) zzgi.zzaA.zza(null)).intValue() - (zzaU().elapsedRealtime() - this.zzJ));
        zzaW().zzj().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        zzaE().zzd(max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaK(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaL() {
        long max;
        long j;
        zzaX().zzg();
        zzM();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzaU().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaW().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzq().zzc();
                zzx().zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzaN()) {
            zzaW().zzj().zza("Nothing to upload or uploading impossible");
            zzq().zzc();
            zzx().zza();
            return;
        }
        long currentTimeMillis = zzaU().currentTimeMillis();
        zzi();
        long max2 = Math.max(0L, ((Long) zzgi.zzN.zza(null)).longValue());
        boolean z = true;
        if (!zzj().zzac() && !zzj().zzab()) {
            z = false;
        }
        if (z) {
            String zzo = zzi().zzo();
            if (TextUtils.isEmpty(zzo) || ".none.".equals(zzo)) {
                zzi();
                max = Math.max(0L, ((Long) zzgi.zzH.zza(null)).longValue());
            } else {
                zzi();
                max = Math.max(0L, ((Long) zzgi.zzI.zza(null)).longValue());
            }
        } else {
            zzi();
            max = Math.max(0L, ((Long) zzgi.zzG.zza(null)).longValue());
        }
        long zza = this.zzk.zzd.zza();
        long zza2 = this.zzk.zze.zza();
        boolean z2 = z;
        long max3 = Math.max(zzj().zzf(), zzj().zzh());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j = abs2 + max2;
            long max4 = Math.max(abs3, abs4);
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max;
            }
            if (!zzA().zzz(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzi();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzgi.zzP.zza(null)).intValue()))) {
                        break;
                    }
                    zzi();
                    j += Math.max(0L, ((Long) zzgi.zzO.zza(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (j != 0) {
                zzaW().zzj().zza("Next upload time is 0");
                zzq().zzc();
                zzx().zza();
                return;
            }
            if (!zzp().zzd()) {
                zzaW().zzj().zza("No network");
                zzq().zzb();
                zzx().zza();
                return;
            }
            long zza3 = this.zzk.zzc.zza();
            zzi();
            long max5 = Math.max(0L, ((Long) zzgi.zzE.zza(null)).longValue());
            if (!zzA().zzz(zza3, max5)) {
                j = Math.max(j, zza3 + max5);
            }
            zzq().zzc();
            long currentTimeMillis2 = j - zzaU().currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                zzi();
                currentTimeMillis2 = Math.max(0L, ((Long) zzgi.zzJ.zza(null)).longValue());
                this.zzk.zzd.zzb(zzaU().currentTimeMillis());
            }
            zzaW().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
            zzx().zzd(currentTimeMillis2);
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:326:0x0d65, code lost:
    
        if (r11 > (com.google.android.gms.measurement.internal.zzam.zzI() + r7)) goto L443;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0400 A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c3 A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0568 A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x050d A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0d57 A[Catch: all -> 0x0cec, TryCatch #3 {all -> 0x0cec, blocks: (B:317:0x0cc8, B:319:0x0cdd, B:322:0x0ce4, B:323:0x0d18, B:325:0x0d57, B:327:0x0d88, B:329:0x0d8c, B:330:0x0d96, B:332:0x0dd9, B:334:0x0de6, B:336:0x0df7, B:338:0x0e43, B:340:0x0e54, B:341:0x0e73, B:348:0x0e60, B:351:0x0e0f, B:354:0x0e28, B:355:0x0d67, B:356:0x0cef, B:358:0x0cfb, B:359:0x0d01, B:512:0x0e7c), top: B:4:0x002d, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0dd9 A[Catch: all -> 0x0cec, TRY_LEAVE, TryCatch #3 {all -> 0x0cec, blocks: (B:317:0x0cc8, B:319:0x0cdd, B:322:0x0ce4, B:323:0x0d18, B:325:0x0d57, B:327:0x0d88, B:329:0x0d8c, B:330:0x0d96, B:332:0x0dd9, B:334:0x0de6, B:336:0x0df7, B:338:0x0e43, B:340:0x0e54, B:341:0x0e73, B:348:0x0e60, B:351:0x0e0f, B:354:0x0e28, B:355:0x0d67, B:356:0x0cef, B:358:0x0cfb, B:359:0x0d01, B:512:0x0e7c), top: B:4:0x002d, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0df7 A[Catch: all -> 0x0cec, SQLiteException -> 0x0e0d, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0e0d, blocks: (B:334:0x0de6, B:336:0x0df7), top: B:333:0x0de6, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a10 A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a58 A[Catch: all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0011, B:6:0x002f, B:8:0x0039, B:9:0x004f, B:12:0x0063, B:15:0x0089, B:17:0x00be, B:20:0x00cf, B:22:0x00d9, B:25:0x069c, B:26:0x010a, B:28:0x011c, B:31:0x012c, B:33:0x0132, B:35:0x0171, B:37:0x017f, B:40:0x019f, B:42:0x01a5, B:44:0x01b5, B:46:0x01c3, B:48:0x01d3, B:50:0x01e0, B:55:0x01e3, B:58:0x01f9, B:64:0x022b, B:67:0x0235, B:69:0x0243, B:71:0x0293, B:72:0x0262, B:74:0x0271, B:82:0x02a3, B:84:0x02d2, B:85:0x02fc, B:87:0x0334, B:88:0x033a, B:91:0x0346, B:93:0x037d, B:94:0x0398, B:96:0x039e, B:98:0x03ac, B:100:0x03c2, B:101:0x03b6, B:109:0x03c8, B:112:0x03cf, B:113:0x03e7, B:115:0x0400, B:116:0x040c, B:119:0x0416, B:123:0x043b, B:124:0x0429, B:131:0x0442, B:133:0x044e, B:135:0x045a, B:139:0x049f, B:140:0x0477, B:143:0x0489, B:145:0x048f, B:147:0x0499, B:150:0x04b7, B:152:0x04c3, B:155:0x04d6, B:157:0x04e7, B:159:0x04f3, B:161:0x0562, B:163:0x0568, B:164:0x0574, B:166:0x057a, B:168:0x058a, B:170:0x0594, B:171:0x05a5, B:173:0x05ab, B:174:0x05c6, B:176:0x05cc, B:178:0x05ea, B:180:0x05f9, B:182:0x0624, B:183:0x0602, B:185:0x0610, B:187:0x062d, B:188:0x0647, B:190:0x064d, B:193:0x0660, B:198:0x066d, B:199:0x0671, B:201:0x0677, B:203:0x0687, B:210:0x050d, B:212:0x051b, B:215:0x052e, B:217:0x053f, B:219:0x054b, B:225:0x0138, B:227:0x0143, B:229:0x014f, B:231:0x0155, B:234:0x0160, B:240:0x06b5, B:242:0x06c3, B:244:0x06cc, B:246:0x06fe, B:247:0x06d4, B:249:0x06de, B:251:0x06e4, B:253:0x06f0, B:255:0x06f8, B:258:0x0700, B:259:0x070c, B:262:0x0714, B:265:0x0726, B:266:0x0731, B:268:0x0739, B:269:0x075e, B:271:0x0778, B:272:0x078d, B:274:0x07a7, B:275:0x07bc, B:276:0x07ca, B:278:0x07d0, B:280:0x07e0, B:281:0x07e7, B:283:0x07f3, B:285:0x07fa, B:288:0x07fd, B:290:0x083f, B:292:0x0845, B:293:0x086c, B:295:0x0874, B:296:0x087d, B:298:0x0883, B:299:0x0889, B:301:0x089e, B:303:0x08ae, B:305:0x08be, B:307:0x08c6, B:308:0x08c9, B:393:0x093b, B:395:0x0954, B:397:0x096a, B:399:0x096f, B:401:0x0973, B:403:0x0977, B:405:0x0981, B:406:0x0987, B:408:0x098b, B:410:0x0991, B:411:0x09a2, B:412:0x09ae, B:485:0x09d0, B:425:0x0a10, B:426:0x0a18, B:428:0x0a1e, B:432:0x0a30, B:436:0x0a58, B:489:0x09d7, B:499:0x0853, B:501:0x0859, B:503:0x085f, B:504:0x07b9, B:505:0x078a, B:506:0x073e, B:508:0x0744), top: B:2:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0a80 A[Catch: all -> 0x0adf, TRY_ENTER, TryCatch #6 {all -> 0x0adf, blocks: (B:387:0x090a, B:388:0x091d, B:390:0x0923, B:415:0x0bed, B:420:0x09ba, B:423:0x09ec, B:438:0x0a80, B:440:0x0a8c, B:442:0x0aa0, B:443:0x0ae6, B:448:0x0b00, B:450:0x0b0b, B:452:0x0b0f, B:454:0x0b13, B:456:0x0b17, B:457:0x0b23, B:458:0x0b28, B:460:0x0b2e, B:462:0x0b46, B:463:0x0b4b, B:464:0x0be8, B:465:0x0b61, B:467:0x0b67, B:470:0x0b92, B:472:0x0bb6, B:473:0x0bc3, B:478:0x0bdb, B:479:0x0b78, B:483:0x0a44, B:491:0x0bf9, B:493:0x0c05, B:494:0x0c0b, B:495:0x0c13, B:497:0x0c19, B:311:0x0c2f, B:313:0x0c3f, B:314:0x0cc0, B:367:0x0c57, B:369:0x0c5d, B:371:0x0c67, B:372:0x0c6e, B:377:0x0c7e, B:378:0x0c85, B:380:0x0cb1, B:381:0x0cb8, B:382:0x0cb5, B:383:0x0c82, B:385:0x0c6b), top: B:386:0x090a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzaM(String str, long j) {
        zzpr zzprVar;
        List list;
        boolean z;
        String str2;
        int i;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        boolean z2;
        long parseLong;
        int zzc;
        long j2;
        SecureRandom secureRandom;
        com.google.android.gms.internal.measurement.zzhw zzhwVar2;
        zzbd zzbdVar;
        boolean z3;
        long zzt;
        String str3;
        com.google.android.gms.internal.measurement.zzhw zzhwVar3;
        String str4;
        zzaw zzj;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        long currentTimeMillis;
        long zzo;
        ContentValues contentValues;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        com.google.android.gms.internal.measurement.zzhl zzhlVar;
        com.google.android.gms.internal.measurement.zzhw zzhwVar4;
        int i3;
        int i4;
        com.google.android.gms.internal.measurement.zzhl zzhlVar2;
        int i5;
        int i6;
        com.google.android.gms.internal.measurement.zzhl zzhlVar3;
        int i7;
        com.google.android.gms.internal.measurement.zzhw zzhwVar5;
        int i8;
        com.google.android.gms.internal.measurement.zzhl zzhlVar4;
        String str9;
        com.google.android.gms.internal.measurement.zzhw zzhwVar6;
        int i9;
        String str10;
        zzpv zzpvVar = this;
        String str11 = "_efs";
        String str12 = "_ai";
        String str13 = "purchase";
        String str14 = "items";
        zzj().zzH();
        try {
            zzprVar = new zzpr(zzpvVar, null);
            zzj().zzat(str, j, zzpvVar.zzB, zzprVar);
            list = zzprVar.zzc;
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            zzj().zzL();
            throw th2;
        }
        try {
            if (list == null || list.isEmpty()) {
                z = false;
                zzj().zzS();
            } else {
                com.google.android.gms.internal.measurement.zzhw zzhwVar7 = (com.google.android.gms.internal.measurement.zzhw) zzprVar.zza.zzch();
                zzhwVar7.zzu();
                com.google.android.gms.internal.measurement.zzhl zzhlVar5 = null;
                com.google.android.gms.internal.measurement.zzhl zzhlVar6 = null;
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                boolean z4 = false;
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    String str15 = "_et";
                    String str16 = "_fr";
                    str2 = str11;
                    i = i12;
                    com.google.android.gms.internal.measurement.zzhl zzhlVar7 = zzhlVar6;
                    if (i11 >= zzprVar.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzhl zzhlVar8 = (com.google.android.gms.internal.measurement.zzhl) ((com.google.android.gms.internal.measurement.zzhm) zzprVar.zzc.get(i11)).zzch();
                    int i15 = i11;
                    if (zzr().zzx(zzprVar.zza.zzF(), zzhlVar8.zzo())) {
                        zzaW().zzk().zzc("Dropping blocked raw event. appId", zzhe.zzn(zzprVar.zza.zzF()), zzpvVar.zzn.zzj().zzd(zzhlVar8.zzo()));
                        if (!zzr().zzt(zzprVar.zza.zzF()) && !zzr().zzy(zzprVar.zza.zzF()) && !"_err".equals(zzhlVar8.zzo())) {
                            zzB().zzR(zzpvVar.zzK, zzprVar.zza.zzF(), 11, "_ev", zzhlVar8.zzo(), 0);
                        }
                        zzhlVar6 = zzhlVar7;
                        str5 = str12;
                        str8 = str13;
                        i5 = i10;
                        i12 = i;
                        i6 = i15;
                        zzhwVar4 = zzhwVar7;
                    } else {
                        com.google.android.gms.internal.measurement.zzoy.zzb();
                        String str17 = str14;
                        if (zzi().zzx(null, zzgi.zzbf)) {
                            String zzo2 = zzhlVar8.zzo();
                            i2 = i10;
                            if (zzo2.equals(str13) || zzo2.equals("_iap") || zzo2.equals("ecommerce_purchase")) {
                                com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze.zzj("_cbs");
                                if (!z4) {
                                    String zzF = zzprVar.zza.zzF();
                                    if (zzpvVar.zzaO(zzF, str13) && zzpvVar.zzaO(zzF, "_iap") && zzpvVar.zzaO(zzF, "ecommerce_purchase")) {
                                        str10 = "new_buyer";
                                        zze.zzk(str10);
                                        zzhlVar8.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                                        z4 = true;
                                    }
                                }
                                str10 = "returning_buyer";
                                zze.zzk(str10);
                                zzhlVar8.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                                z4 = true;
                            }
                        } else {
                            i2 = i10;
                        }
                        if (zzhlVar8.zzo().equals(zzjy.zza(str12))) {
                            zzhlVar8.zzi(str12);
                            zzaW().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzaW().zzr(), 5)) {
                                for (int i16 = 0; i16 < zzhlVar8.zza(); i16++) {
                                    if ("ad_platform".equals(zzhlVar8.zzn(i16).zzg()) && !zzhlVar8.zzn(i16).zzh().isEmpty() && "admob".equalsIgnoreCase(zzhlVar8.zzn(i16).zzh())) {
                                        zzaW().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zzw = zzr().zzw(zzprVar.zza.zzF(), zzhlVar8.zzo());
                        if (zzw) {
                            str5 = str12;
                        } else {
                            zzA();
                            String zzo3 = zzhlVar8.zzo();
                            Preconditions.checkNotEmpty(zzo3);
                            str5 = str12;
                            if (zzo3.hashCode() != 95027 || !zzo3.equals("_ui")) {
                                str6 = "_fr";
                                zzhwVar4 = zzhwVar7;
                                str7 = "_et";
                                str8 = str13;
                                zzhlVar = zzhlVar5;
                                zzw = false;
                                if (zzw) {
                                    ArrayList arrayList = new ArrayList(zzhlVar8.zzp());
                                    int i17 = -1;
                                    int i18 = -1;
                                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                        if ("value".equals(((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i19)).zzg())) {
                                            i17 = i19;
                                        } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i19)).zzg())) {
                                            i18 = i19;
                                        }
                                    }
                                    if (i17 != -1) {
                                        if (((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i17)).zzw() || ((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i17)).zzu()) {
                                            if (i18 != -1) {
                                                String zzh = ((com.google.android.gms.internal.measurement.zzhq) arrayList.get(i18)).zzh();
                                                if (zzh.length() == 3) {
                                                    int i20 = 0;
                                                    while (i20 < zzh.length()) {
                                                        int codePointAt = zzh.codePointAt(i20);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i20 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            zzaW().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzhlVar8.zzh(i17);
                                            zzaB(zzhlVar8, "_c");
                                            zzaA(zzhlVar8, 19, "currency");
                                            break;
                                        }
                                        zzaW().zzl().zza("Value must be specified with a numeric type.");
                                        zzhlVar8.zzh(i17);
                                        zzaB(zzhlVar8, "_c");
                                        zzaA(zzhlVar8, 18, "value");
                                    }
                                }
                                if ("_e".equals(zzhlVar8.zzo())) {
                                    i3 = i14;
                                    if ("_vs".equals(zzhlVar8.zzo())) {
                                        zzA();
                                        if (zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba(), str7) == null) {
                                            if (zzhlVar7 != null && Math.abs(zzhlVar7.zzc() - zzhlVar8.zzc()) <= 1000) {
                                                com.google.android.gms.internal.measurement.zzhl zzhlVar9 = (com.google.android.gms.internal.measurement.zzhl) zzhlVar7.clone();
                                                if (zzpvVar.zzaP(zzhlVar9, zzhlVar8)) {
                                                    int i21 = i2;
                                                    zzhwVar4.zzad(i21, zzhlVar9);
                                                    i4 = i21;
                                                    i14 = i3;
                                                    zzhlVar = null;
                                                    zzhlVar6 = null;
                                                    if (zzhlVar8.zza() == 0) {
                                                    }
                                                    i6 = i15;
                                                    zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                                    zzhwVar4.zzn(zzhlVar8);
                                                    i12 = i + 1;
                                                    zzhlVar5 = zzhlVar2;
                                                }
                                            }
                                            zzhlVar6 = zzhlVar7;
                                            i4 = i2;
                                            zzhlVar = zzhlVar8;
                                            i14 = i;
                                            if (zzhlVar8.zza() == 0) {
                                            }
                                            i6 = i15;
                                            zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                            zzhwVar4.zzn(zzhlVar8);
                                            i12 = i + 1;
                                            zzhlVar5 = zzhlVar2;
                                        }
                                    }
                                    zzhlVar6 = zzhlVar7;
                                    i4 = i2;
                                    i14 = i3;
                                    if (zzhlVar8.zza() == 0) {
                                    }
                                    i6 = i15;
                                    zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                    zzhwVar4.zzn(zzhlVar8);
                                    i12 = i + 1;
                                    zzhlVar5 = zzhlVar2;
                                } else {
                                    zzA();
                                    if (zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba(), str6) == null) {
                                        if (zzhlVar != null && Math.abs(zzhlVar.zzc() - zzhlVar8.zzc()) <= 1000) {
                                            com.google.android.gms.internal.measurement.zzhl zzhlVar10 = (com.google.android.gms.internal.measurement.zzhl) zzhlVar.clone();
                                            if (zzpvVar.zzaP(zzhlVar8, zzhlVar10)) {
                                                int i22 = i14;
                                                zzhwVar4.zzad(i22, zzhlVar10);
                                                i14 = i22;
                                                i4 = i2;
                                                zzhlVar = null;
                                                zzhlVar6 = null;
                                                if (zzhlVar8.zza() == 0) {
                                                    zzA();
                                                    Bundle zzF2 = zzqa.zzF(zzhlVar8.zzp());
                                                    int i23 = 0;
                                                    while (i23 < zzhlVar8.zza()) {
                                                        com.google.android.gms.internal.measurement.zzhq zzn = zzhlVar8.zzn(i23);
                                                        String str18 = str17;
                                                        if (!zzn.zzg().equals(str18) || zzn.zzi().isEmpty()) {
                                                            zzhlVar3 = zzhlVar;
                                                            i7 = i4;
                                                            if (!zzn.zzg().equals(str18)) {
                                                                zzpvVar.zzaw(zzhlVar8.zzo(), (com.google.android.gms.internal.measurement.zzhp) zzn.zzch(), zzF2, zzprVar.zza.zzF());
                                                            }
                                                        } else {
                                                            String zzF3 = zzprVar.zza.zzF();
                                                            List zzi = zzn.zzi();
                                                            Bundle[] bundleArr = new Bundle[zzi.size()];
                                                            int i24 = 0;
                                                            while (i24 < zzi.size()) {
                                                                com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) zzi.get(i24);
                                                                zzA();
                                                                List list2 = zzi;
                                                                Bundle zzF4 = zzqa.zzF(zzhqVar.zzi());
                                                                Iterator it = zzhqVar.zzi().iterator();
                                                                while (it.hasNext()) {
                                                                    zzpvVar.zzaw(zzhlVar8.zzo(), (com.google.android.gms.internal.measurement.zzhp) ((com.google.android.gms.internal.measurement.zzhq) it.next()).zzch(), zzF4, zzF3);
                                                                    zzhlVar = zzhlVar;
                                                                    i4 = i4;
                                                                }
                                                                bundleArr[i24] = zzF4;
                                                                i24++;
                                                                zzi = list2;
                                                                zzhlVar = zzhlVar;
                                                                i4 = i4;
                                                            }
                                                            zzhlVar3 = zzhlVar;
                                                            i7 = i4;
                                                            zzF2.putParcelableArray(str18, bundleArr);
                                                        }
                                                        i23++;
                                                        zzhlVar = zzhlVar3;
                                                        i4 = i7;
                                                        str17 = str18;
                                                    }
                                                    zzhlVar2 = zzhlVar;
                                                    str14 = str17;
                                                    i5 = i4;
                                                    zzhlVar8.zzg();
                                                    zzqa zzA = zzA();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (String str19 : zzF2.keySet()) {
                                                        com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                                                        zze2.zzj(str19);
                                                        Object obj = zzF2.get(str19);
                                                        if (obj != null) {
                                                            zzA.zzw(zze2, obj);
                                                            arrayList2.add((com.google.android.gms.internal.measurement.zzhq) zze2.zzba());
                                                        }
                                                    }
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (it2.hasNext()) {
                                                        zzhlVar8.zzf((com.google.android.gms.internal.measurement.zzhq) it2.next());
                                                    }
                                                } else {
                                                    zzhlVar2 = zzhlVar;
                                                    str14 = str17;
                                                    i5 = i4;
                                                }
                                                i6 = i15;
                                                zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                                zzhwVar4.zzn(zzhlVar8);
                                                i12 = i + 1;
                                                zzhlVar5 = zzhlVar2;
                                            }
                                        }
                                        zzhlVar6 = zzhlVar8;
                                        i14 = i14;
                                        i4 = i;
                                        if (zzhlVar8.zza() == 0) {
                                        }
                                        i6 = i15;
                                        zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                        zzhwVar4.zzn(zzhlVar8);
                                        i12 = i + 1;
                                        zzhlVar5 = zzhlVar2;
                                    } else {
                                        i3 = i14;
                                        zzhlVar6 = zzhlVar7;
                                        i4 = i2;
                                        i14 = i3;
                                        if (zzhlVar8.zza() == 0) {
                                        }
                                        i6 = i15;
                                        zzprVar.zzc.set(i6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar8.zzba());
                                        zzhwVar4.zzn(zzhlVar8);
                                        i12 = i + 1;
                                        zzhlVar5 = zzhlVar2;
                                    }
                                }
                            }
                        }
                        str8 = str13;
                        int i25 = 0;
                        boolean z5 = false;
                        boolean z6 = false;
                        while (true) {
                            str7 = str15;
                            if (i25 >= zzhlVar8.zza()) {
                                break;
                            }
                            if ("_c".equals(zzhlVar8.zzn(i25).zzg())) {
                                com.google.android.gms.internal.measurement.zzhp zzhpVar = (com.google.android.gms.internal.measurement.zzhp) zzhlVar8.zzn(i25).zzch();
                                zzhlVar4 = zzhlVar5;
                                zzhpVar.zzi(1L);
                                zzhlVar8.zzk(i25, (com.google.android.gms.internal.measurement.zzhq) zzhpVar.zzba());
                                str9 = str16;
                                zzhwVar6 = zzhwVar7;
                                i9 = 1;
                                z5 = true;
                            } else {
                                zzhlVar4 = zzhlVar5;
                                if ("_r".equals(zzhlVar8.zzn(i25).zzg())) {
                                    com.google.android.gms.internal.measurement.zzhp zzhpVar2 = (com.google.android.gms.internal.measurement.zzhp) zzhlVar8.zzn(i25).zzch();
                                    str9 = str16;
                                    zzhwVar6 = zzhwVar7;
                                    zzhpVar2.zzi(1L);
                                    zzhlVar8.zzk(i25, (com.google.android.gms.internal.measurement.zzhq) zzhpVar2.zzba());
                                    i9 = 1;
                                    z6 = true;
                                } else {
                                    str9 = str16;
                                    zzhwVar6 = zzhwVar7;
                                    i9 = 1;
                                }
                            }
                            i25 += i9;
                            zzhwVar7 = zzhwVar6;
                            str15 = str7;
                            str16 = str9;
                            zzhlVar5 = zzhlVar4;
                        }
                        str6 = str16;
                        zzhlVar = zzhlVar5;
                        com.google.android.gms.internal.measurement.zzhw zzhwVar8 = zzhwVar7;
                        if (z5 || !zzw) {
                            zzhwVar5 = zzhwVar8;
                        } else {
                            zzaW().zzj().zzb("Marking event as conversion", zzpvVar.zzn.zzj().zzd(zzhlVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze3.zzj("_c");
                            zzhwVar5 = zzhwVar8;
                            zze3.zzi(1L);
                            zzhlVar8.zze(zze3);
                        }
                        if (!z6) {
                            zzaW().zzj().zzb("Marking event as real-time", zzpvVar.zzn.zzj().zzd(zzhlVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzhp zze4 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze4.zzj("_r");
                            zze4.zzi(1L);
                            zzhlVar8.zze(zze4);
                        }
                        zzhwVar4 = zzhwVar5;
                        if (zzj().zzo(zza(), zzprVar.zza.zzF(), false, false, false, false, true, false, false).zze > zzi().zzh(zzprVar.zza.zzF(), zzgi.zzo)) {
                            zzaB(zzhlVar8, "_r");
                        } else {
                            i13 = 1;
                        }
                        if (zzqf.zzaq(zzhlVar8.zzo()) && zzw && zzj().zzo(zza(), zzprVar.zza.zzF(), false, false, true, false, false, false, false).zzc > zzi().zzh(zzprVar.zza.zzF(), zzgi.zzn)) {
                            zzaW().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzhe.zzn(zzprVar.zza.zzF()));
                            int i26 = 0;
                            boolean z7 = false;
                            int i27 = -1;
                            com.google.android.gms.internal.measurement.zzhp zzhpVar3 = null;
                            while (i26 < zzhlVar8.zza()) {
                                com.google.android.gms.internal.measurement.zzhq zzn2 = zzhlVar8.zzn(i26);
                                if ("_c".equals(zzn2.zzg())) {
                                    zzhpVar3 = (com.google.android.gms.internal.measurement.zzhp) zzn2.zzch();
                                    i8 = 1;
                                    i27 = i26;
                                } else {
                                    if ("_err".equals(zzn2.zzg())) {
                                        z7 = true;
                                    }
                                    i8 = 1;
                                }
                                i26 += i8;
                            }
                            if (z7) {
                                if (zzhpVar3 != null) {
                                    zzhlVar8.zzh(i27);
                                } else {
                                    zzhpVar3 = null;
                                }
                            }
                            if (zzhpVar3 != null) {
                                com.google.android.gms.internal.measurement.zzhp zzhpVar4 = (com.google.android.gms.internal.measurement.zzhp) zzhpVar3.clone();
                                zzhpVar4.zzj("_err");
                                zzhpVar4.zzi(10L);
                                zzhlVar8.zzk(i27, (com.google.android.gms.internal.measurement.zzhq) zzhpVar4.zzba());
                            } else {
                                zzaW().zze().zzb("Did not find conversion parameter. appId", zzhe.zzn(zzprVar.zza.zzF()));
                            }
                        }
                        if (zzw) {
                        }
                        if ("_e".equals(zzhlVar8.zzo())) {
                        }
                    }
                    i11 = i6 + 1;
                    zzhwVar7 = zzhwVar4;
                    str11 = str2;
                    i10 = i5;
                    str12 = str5;
                    str13 = str8;
                }
                com.google.android.gms.internal.measurement.zzhw zzhwVar9 = zzhwVar7;
                long j3 = 0;
                int i28 = i;
                int i29 = 0;
                while (i29 < i28) {
                    com.google.android.gms.internal.measurement.zzhm zzh2 = zzhwVar9.zzh(i29);
                    if ("_e".equals(zzh2.zzh())) {
                        zzA();
                        if (zzqa.zzG(zzh2, "_fr") != null) {
                            zzhwVar9.zzD(i29);
                            i28--;
                            i29--;
                            i29++;
                        }
                    }
                    zzA();
                    com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG(zzh2, "_et");
                    if (zzG != null) {
                        Long valueOf = zzG.zzw() ? Long.valueOf(zzG.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i29++;
                }
                zzpvVar.zzaI(zzhwVar9, j3, false);
                Iterator it3 = zzhwVar9.zzaM().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it3.next()).zzh())) {
                        zzj().zzP(zzhwVar9.zzaF(), "_se");
                        break;
                    }
                }
                if (zzqa.zza(zzhwVar9, "_sid") >= 0) {
                    zzpvVar.zzaI(zzhwVar9, j3, true);
                } else {
                    int zza = zzqa.zza(zzhwVar9, "_se");
                    if (zza >= 0) {
                        zzhwVar9.zzE(zza);
                        zzaW().zze().zzb("Session engagement user property is in the bundle without session ID. appId", zzhe.zzn(zzprVar.zza.zzF()));
                    }
                }
                String zzF5 = zzprVar.zza.zzF();
                zzaX().zzg();
                zzM();
                zzh zzl = zzj().zzl(zzF5);
                if (zzl == null) {
                    zzaW().zze().zzb("Cannot fix consent fields without appInfo. appId", zzhe.zzn(zzF5));
                } else {
                    zzpvVar.zzQ(zzl, zzhwVar9);
                }
                String zzF6 = zzprVar.zza.zzF();
                zzaX().zzg();
                zzM();
                zzh zzl2 = zzj().zzl(zzF6);
                if (zzl2 == null) {
                    zzaW().zzk().zzb("Cannot populate ad_campaign_info without appInfo. appId", zzhe.zzn(zzF6));
                } else {
                    zzpvVar.zzaa(zzl2, zzhwVar9);
                }
                zzhwVar9.zzax(Long.MAX_VALUE);
                zzhwVar9.zzab(Long.MIN_VALUE);
                for (int i30 = 0; i30 < zzhwVar9.zzc(); i30++) {
                    com.google.android.gms.internal.measurement.zzhm zzh3 = zzhwVar9.zzh(i30);
                    if (zzh3.zzd() < zzhwVar9.zzf()) {
                        zzhwVar9.zzax(zzh3.zzd());
                    }
                    if (zzh3.zzd() > zzhwVar9.zze()) {
                        zzhwVar9.zzab(zzh3.zzd());
                    }
                }
                zzhwVar9.zzB();
                zzjx zzjxVar = zzjx.zza;
                zzjx zzl3 = zzpvVar.zzu(zzprVar.zza.zzF()).zzl(zzjx.zzk(zzprVar.zza.zzK(), 100));
                zzjx zzt2 = zzj().zzt(zzprVar.zza.zzF());
                zzj().zzW(zzprVar.zza.zzF(), zzl3);
                zzjw zzjwVar = zzjw.ANALYTICS_STORAGE;
                if (!zzl3.zzr(zzjwVar) && zzt2.zzr(zzjwVar)) {
                    zzj().zzI(zzprVar.zza.zzF());
                } else if (zzl3.zzr(zzjwVar) && !zzt2.zzr(zzjwVar)) {
                    zzj().zzQ(zzprVar.zza.zzF());
                }
                zzjw zzjwVar2 = zzjw.AD_STORAGE;
                if (!zzl3.zzr(zzjwVar2)) {
                    zzhwVar9.zzz();
                    zzhwVar9.zzw();
                    zzhwVar9.zzt();
                }
                if (!zzl3.zzr(zzjwVar)) {
                    zzhwVar9.zzq();
                    zzhwVar9.zzA();
                }
                zzqr.zzb();
                if (zzi().zzx(zzprVar.zza.zzF(), zzgi.zzaV) && zzB().zzab(zzprVar.zza.zzF()) && zzpvVar.zzu(zzprVar.zza.zzF()).zzr(zzjwVar2) && zzprVar.zza.zzbt()) {
                    zzpvVar.zzR(zzhwVar9, zzprVar);
                }
                zzhwVar9.zzr();
                zzhwVar9.zzi(zzh().zza(zzhwVar9.zzaF(), zzhwVar9.zzaM(), zzhwVar9.zzaN(), Long.valueOf(zzhwVar9.zzf()), Long.valueOf(zzhwVar9.zze()), !zzl3.zzr(zzjwVar)));
                if (zzi().zzB(zzprVar.zza.zzF())) {
                    try {
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        SecureRandom zzJ = zzB().zzJ();
                        int i31 = 0;
                        while (i31 < zzhwVar9.zzc()) {
                            com.google.android.gms.internal.measurement.zzhl zzhlVar11 = (com.google.android.gms.internal.measurement.zzhl) zzhwVar9.zzh(i31).zzch();
                            if (zzhlVar11.zzo().equals("_ep")) {
                                zzA();
                                String str20 = (String) zzqa.zzH((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba(), "_en");
                                zzbd zzbdVar2 = (zzbd) hashMap.get(str20);
                                if (zzbdVar2 == null && (zzbdVar2 = zzj().zzs(zzprVar.zza.zzF(), (String) Preconditions.checkNotNull(str20))) != null) {
                                    hashMap.put(str20, zzbdVar2);
                                }
                                if (zzbdVar2 == null || zzbdVar2.zzi != null) {
                                    str4 = str2;
                                } else {
                                    Long l = zzbdVar2.zzj;
                                    if (l != null && l.longValue() > 1) {
                                        zzA();
                                        zzqa.zzD(zzhlVar11, "_sr", l);
                                    }
                                    Boolean bool = zzbdVar2.zzk;
                                    if (bool == null || !bool.booleanValue()) {
                                        str4 = str2;
                                    } else {
                                        zzA();
                                        str4 = str2;
                                        zzqa.zzD(zzhlVar11, str4, 1L);
                                    }
                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba());
                                }
                                zzhwVar9.zzad(i31, zzhlVar11);
                                secureRandom = zzJ;
                                zzhwVar3 = zzhwVar9;
                                str3 = str4;
                                i31++;
                                zzpvVar = this;
                                zzJ = secureRandom;
                                zzhwVar9 = zzhwVar3;
                                str2 = str3;
                            } else {
                                String str21 = str2;
                                zzif zzr = zzr();
                                String zzF7 = zzprVar.zza.zzF();
                                String zza2 = zzr.zza(zzF7, "measurement.account.time_zone_offset_minutes");
                                if (!TextUtils.isEmpty(zza2)) {
                                    try {
                                        parseLong = Long.parseLong(zza2);
                                    } catch (NumberFormatException e) {
                                        zzr.zzu.zzaW().zzk().zzc("Unable to parse timezone offset. appId", zzhe.zzn(zzF7), e);
                                    }
                                    long zzt3 = zzB().zzt(zzhlVar11.zzc(), parseLong);
                                    com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba();
                                    Long l2 = 1L;
                                    if (!TextUtils.isEmpty("_dbg")) {
                                        Iterator it4 = zzhmVar.zzi().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it4.next();
                                            Iterator it5 = it4;
                                            if (!"_dbg".equals(zzhqVar2.zzg())) {
                                                it4 = it5;
                                            } else if (l2.equals(Long.valueOf(zzhqVar2.zzd()))) {
                                                zzc = 1;
                                            }
                                        }
                                    }
                                    zzc = zzr().zzc(zzprVar.zza.zzF(), zzhlVar11.zzo());
                                    if (zzc > 0) {
                                        zzaW().zzk().zzc("Sample rate must be positive. event, rate", zzhlVar11.zzo(), Integer.valueOf(zzc));
                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba());
                                        zzhwVar9.zzad(i31, zzhlVar11);
                                    } else {
                                        zzbd zzbdVar3 = (zzbd) hashMap.get(zzhlVar11.zzo());
                                        if (zzbdVar3 == null && (zzbdVar3 = zzj().zzs(zzprVar.zza.zzF(), zzhlVar11.zzo())) == null) {
                                            j2 = parseLong;
                                            zzaW().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzprVar.zza.zzF(), zzhlVar11.zzo());
                                            zzbdVar3 = new zzbd(zzprVar.zza.zzF(), zzhlVar11.zzo(), 1L, 1L, 1L, zzhlVar11.zzc(), 0L, null, null, null, null);
                                        } else {
                                            j2 = parseLong;
                                        }
                                        zzA();
                                        Long l3 = (Long) zzqa.zzH((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba(), "_eid");
                                        boolean z8 = l3 != null;
                                        if (zzc == 1) {
                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba());
                                            if (z8 && (zzbdVar3.zzi != null || zzbdVar3.zzj != null || zzbdVar3.zzk != null)) {
                                                hashMap.put(zzhlVar11.zzo(), zzbdVar3.zza(null, null, null));
                                            }
                                            zzhwVar9.zzad(i31, zzhlVar11);
                                        } else {
                                            if (zzJ.nextInt(zzc) == 0) {
                                                zzA();
                                                Long valueOf2 = Long.valueOf(zzc);
                                                zzqa.zzD(zzhlVar11, "_sr", valueOf2);
                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba());
                                                if (z8) {
                                                    zzbdVar3 = zzbdVar3.zza(null, valueOf2, null);
                                                }
                                                hashMap.put(zzhlVar11.zzo(), zzbdVar3.zzb(zzhlVar11.zzc(), zzt3));
                                                secureRandom = zzJ;
                                                zzhwVar3 = zzhwVar9;
                                                str3 = str21;
                                            } else {
                                                Long l4 = zzbdVar3.zzh;
                                                if (l4 != null) {
                                                    secureRandom = zzJ;
                                                    zzbdVar = zzbdVar3;
                                                    z3 = z8;
                                                    zzhwVar2 = zzhwVar9;
                                                    zzt = l4.longValue();
                                                } else {
                                                    secureRandom = zzJ;
                                                    zzhwVar2 = zzhwVar9;
                                                    zzbdVar = zzbdVar3;
                                                    z3 = z8;
                                                    zzt = zzB().zzt(zzhlVar11.zzb(), j2);
                                                }
                                                if (zzt != zzt3) {
                                                    zzA();
                                                    str3 = str21;
                                                    zzqa.zzD(zzhlVar11, str3, 1L);
                                                    zzA();
                                                    Long valueOf3 = Long.valueOf(zzc);
                                                    zzqa.zzD(zzhlVar11, "_sr", valueOf3);
                                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba());
                                                    hashMap.put(zzhlVar11.zzo(), (z3 ? zzbdVar.zza(null, valueOf3, Boolean.TRUE) : zzbdVar).zzb(zzhlVar11.zzc(), zzt3));
                                                } else {
                                                    str3 = str21;
                                                    zzbd zzbdVar4 = zzbdVar;
                                                    if (z3) {
                                                        hashMap.put(zzhlVar11.zzo(), zzbdVar4.zza(l3, null, null));
                                                    }
                                                }
                                                zzhwVar3 = zzhwVar2;
                                            }
                                            zzhwVar3.zzad(i31, zzhlVar11);
                                            i31++;
                                            zzpvVar = this;
                                            zzJ = secureRandom;
                                            zzhwVar9 = zzhwVar3;
                                            str2 = str3;
                                        }
                                    }
                                    secureRandom = zzJ;
                                    zzhwVar3 = zzhwVar9;
                                    str3 = str21;
                                    i31++;
                                    zzpvVar = this;
                                    zzJ = secureRandom;
                                    zzhwVar9 = zzhwVar3;
                                    str2 = str3;
                                }
                                parseLong = 0;
                                long zzt32 = zzB().zzt(zzhlVar11.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzhm zzhmVar2 = (com.google.android.gms.internal.measurement.zzhm) zzhlVar11.zzba();
                                Long l22 = 1L;
                                if (!TextUtils.isEmpty("_dbg")) {
                                }
                                zzc = zzr().zzc(zzprVar.zza.zzF(), zzhlVar11.zzo());
                                if (zzc > 0) {
                                }
                                secureRandom = zzJ;
                                zzhwVar3 = zzhwVar9;
                                str3 = str21;
                                i31++;
                                zzpvVar = this;
                                zzJ = secureRandom;
                                zzhwVar9 = zzhwVar3;
                                str2 = str3;
                            }
                        }
                        zzhwVar = zzhwVar9;
                        z2 = true;
                        if (arrayList3.size() < zzhwVar.zzc()) {
                            zzhwVar.zzu();
                            zzhwVar.zzj(arrayList3);
                        }
                        Iterator it6 = hashMap.entrySet().iterator();
                        while (it6.hasNext()) {
                            zzj().zzV((zzbd) ((Map.Entry) it6.next()).getValue());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th22 = th;
                        zzj().zzL();
                        throw th22;
                    }
                } else {
                    zzhwVar = zzhwVar9;
                    z2 = true;
                }
                String zzF8 = zzprVar.zza.zzF();
                zzh zzl4 = zzj().zzl(zzF8);
                if (zzl4 == null) {
                    zzaW().zze().zzb("Bundling raw events w/o app info. appId", zzhe.zzn(zzprVar.zza.zzF()));
                } else if (zzhwVar.zzc() > 0) {
                    long zzs = zzl4.zzs();
                    if (zzs != 0) {
                        zzhwVar.zzap(zzs);
                    } else {
                        zzhwVar.zzx();
                    }
                    long zzu = zzl4.zzu();
                    if (zzu != 0) {
                        zzs = zzu;
                    }
                    if (zzs != 0) {
                        zzhwVar.zzaq(zzs);
                    } else {
                        zzhwVar.zzy();
                    }
                    zzl4.zzQ(zzhwVar.zzc());
                    zzhwVar.zzV((int) zzl4.zzr());
                    zzhwVar.zzP((int) zzl4.zzt());
                    zzl4.zzau(zzhwVar.zzf());
                    zzl4.zzas(zzhwVar.zze());
                    String zzB = zzl4.zzB();
                    if (zzB != null) {
                        zzhwVar.zzaj(zzB);
                    } else {
                        zzhwVar.zzv();
                    }
                    zzj().zzT(zzl4, false, false);
                }
                if (zzhwVar.zzc() > 0) {
                    this.zzn.zzaV();
                    com.google.android.gms.internal.measurement.zzgo zzj2 = zzr().zzj(zzprVar.zza.zzF());
                    try {
                        try {
                            if (zzj2 != null && zzj2.zzw()) {
                                zzhwVar.zzR(zzj2.zzc());
                                zzj = zzj();
                                zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba();
                                zzj.zzg();
                                zzj.zzav();
                                Preconditions.checkNotNull(zzhxVar);
                                Preconditions.checkNotEmpty(zzhxVar.zzF());
                                Preconditions.checkState(zzhxVar.zzbK());
                                zzj.zzO();
                                zzio zzioVar = zzj.zzu;
                                currentTimeMillis = zzioVar.zzaU().currentTimeMillis();
                                zzo = zzhxVar.zzo();
                                zzioVar.zzf();
                                if (zzo >= currentTimeMillis - zzam.zzI()) {
                                    long zzo4 = zzhxVar.zzo();
                                    zzioVar.zzf();
                                }
                                zzioVar.zzaW().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzhe.zzn(zzhxVar.zzF()), Long.valueOf(currentTimeMillis), Long.valueOf(zzhxVar.zzo()));
                                byte[] zzB2 = zzj.zzg.zzA().zzB(zzhxVar.zzcd());
                                zzio zzioVar2 = zzj.zzu;
                                zzioVar2.zzaW().zzj().zzb("Saving bundle, size", Integer.valueOf(zzB2.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzhxVar.zzF());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzhxVar.zzo()));
                                contentValues.put("data", zzB2);
                                contentValues.put("has_realtime", Integer.valueOf(i13));
                                if (zzhxVar.zzbR()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzhxVar.zzg()));
                                }
                                if (zzj.zzj().insert("queue", null, contentValues) == -1) {
                                    zzioVar2.zzaW().zze().zzb("Failed to insert bundle (got -1). appId", zzhe.zzn(zzhxVar.zzF()));
                                }
                            }
                            if (zzj.zzj().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            zzj.zzu.zzaW().zze().zzc("Error storing bundle. appId", zzhe.zzn(zzhxVar.zzF()), e2);
                        }
                        byte[] zzB22 = zzj.zzg.zzA().zzB(zzhxVar.zzcd());
                        zzio zzioVar22 = zzj.zzu;
                        zzioVar22.zzaW().zzj().zzb("Saving bundle, size", Integer.valueOf(zzB22.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzhxVar.zzF());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzhxVar.zzo()));
                        contentValues.put("data", zzB22);
                        contentValues.put("has_realtime", Integer.valueOf(i13));
                        if (zzhxVar.zzbR()) {
                        }
                    } catch (IOException e3) {
                        zzj.zzu.zzaW().zze().zzc("Data loss. Failed to serialize bundle. appId", zzhe.zzn(zzhxVar.zzF()), e3);
                    }
                    if (zzprVar.zza.zzP().isEmpty()) {
                        zzhwVar.zzR(-1L);
                    } else {
                        zzaW().zzk().zzb("Did not find measurement config or missing version info. appId", zzhe.zzn(zzprVar.zza.zzF()));
                    }
                    zzj = zzj();
                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba();
                    zzj.zzg();
                    zzj.zzav();
                    Preconditions.checkNotNull(zzhxVar);
                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                    Preconditions.checkState(zzhxVar.zzbK());
                    zzj.zzO();
                    zzio zzioVar3 = zzj.zzu;
                    currentTimeMillis = zzioVar3.zzaU().currentTimeMillis();
                    zzo = zzhxVar.zzo();
                    zzioVar3.zzf();
                    if (zzo >= currentTimeMillis - zzam.zzI()) {
                    }
                    zzioVar3.zzaW().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzhe.zzn(zzhxVar.zzF()), Long.valueOf(currentTimeMillis), Long.valueOf(zzhxVar.zzo()));
                }
                zzj().zzJ(zzprVar.zzb);
                zzaw zzj3 = zzj();
                try {
                    zzj3.zzj().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzF8, zzF8});
                } catch (SQLiteException e4) {
                    zzj3.zzu.zzaW().zze().zzc("Failed to remove unused event metadata. appId", zzhe.zzn(zzF8), e4);
                }
                zzj().zzS();
                z = z2;
            }
            zzj().zzL();
            return z;
        } catch (Throwable th4) {
            th = th4;
            Throwable th222 = th;
            zzj().zzL();
            throw th222;
        }
    }

    private final boolean zzaN() {
        zzaX().zzg();
        zzM();
        return zzj().zzaa() || !TextUtils.isEmpty(zzj().zzA());
    }

    private final boolean zzaO(String str, String str2) {
        zzbd zzs = zzj().zzs(str, str2);
        return zzs == null || zzs.zzc < 1;
    }

    private final boolean zzaP(com.google.android.gms.internal.measurement.zzhl zzhlVar, com.google.android.gms.internal.measurement.zzhl zzhlVar2) {
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_sc");
        String zzh = zzG == null ? null : zzG.zzh();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG2 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_pc");
        String zzh2 = zzG2 != null ? zzG2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG3 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_et");
        if (zzG3 == null || !zzG3.zzw() || zzG3.zzd() <= 0) {
            return true;
        }
        long zzd = zzG3.zzd();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzG4 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_et");
        if (zzG4 != null && zzG4.zzd() > 0) {
            zzd += zzG4.zzd();
        }
        zzA();
        zzqa.zzD(zzhlVar2, "_et", Long.valueOf(zzd));
        zzA();
        zzqa.zzD(zzhlVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzaQ(zzr zzrVar) {
        return (TextUtils.isEmpty(zzrVar.zzb) && TextUtils.isEmpty(zzrVar.zzp)) ? false : true;
    }

    private static final zzpg zzaR(zzpg zzpgVar) {
        if (zzpgVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzpgVar.zzax()) {
            return zzpgVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzpgVar.getClass())));
    }

    private static final Boolean zzaS(zzr zzrVar) {
        Boolean bool = zzrVar.zzq;
        String str = zzrVar.zzE;
        if (!TextUtils.isEmpty(str)) {
            zzju zzb2 = zze.zza(str).zzb();
            zzju zzjuVar = zzju.UNINITIALIZED;
            int ordinal = zzb2.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static zzpv zzz(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpv.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpv((zzpw) Preconditions.checkNotNull(new zzpw(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    public final zzqa zzA() {
        zzqa zzqaVar = this.zzi;
        zzaR(zzqaVar);
        return zzqaVar;
    }

    public final zzqf zzB() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzw();
    }

    final String zzC(zzjx zzjxVar) {
        if (!zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzB().zzJ().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzD(zzr zzrVar) {
        try {
            return (String) zzaX().zzf(new zzpo(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaW().zze().zzc("Failed to get app instance id. appId", zzhe.zzn(zzrVar.zza), e);
            return null;
        }
    }

    final List zzF(zzr zzrVar, Bundle bundle) {
        zzaX().zzg();
        zzqr.zzb();
        zzam zzi = zzi();
        String str = zzrVar.zza;
        if (!zzi.zzx(str, zzgi.zzaV) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaW().zze().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzaw zzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzj.zzg();
                        zzj.zzav();
                        try {
                            int delete = zzj.zzj().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzj.zzu.zzaW().zzj().zzd("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzj.zzu.zzaW().zze().zzc("Error pruning trigger URIs. appId", zzhe.zzn(str), e);
                        }
                    }
                }
            }
        }
        zzaw zzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzj2.zzg();
        zzj2.zzav();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = zzj2.zzj().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzov(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzj2.zzu.zzaW().zze().zzc("Error querying trigger uris. appId", zzhe.zzn(str2), e2);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    final void zzK(Runnable runnable) {
        zzaX().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzL() {
        zzaX().zzg();
        zzM();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaz()) {
            FileChannel fileChannel = this.zzy;
            zzaX().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaW().zze().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzaW().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    zzaW().zze().zzb("Failed to read from channel", e);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaX().zzg();
            if (i > zzi) {
                zzaW().zze().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                return;
            }
            if (i < zzi) {
                FileChannel fileChannel2 = this.zzy;
                zzaX().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaW().zze().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaW().zze().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaW().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e2) {
                        zzaW().zze().zzb("Failed to write to channel", e2);
                    }
                }
                zzaW().zze().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
            }
        }
    }

    final void zzM() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzN(String str, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        int zza;
        int indexOf;
        Set zzo = zzr().zzo(str);
        if (zzo != null) {
            zzhwVar.zzl(zzo);
        }
        if (zzr().zzB(str)) {
            zzhwVar.zzs();
        }
        if (zzr().zzE(str)) {
            String zzaK = zzhwVar.zzaK();
            if (!TextUtils.isEmpty(zzaK) && (indexOf = zzaK.indexOf(".")) != -1) {
                zzhwVar.zzam(zzaK.substring(0, indexOf));
            }
        }
        if (zzr().zzF(str) && (zza = zzqa.zza(zzhwVar, "_id")) != -1) {
            zzhwVar.zzE(zza);
        }
        if (zzr().zzD(str)) {
            zzhwVar.zzt();
        }
        if (zzr().zzA(str)) {
            zzhwVar.zzq();
            if (zzu(str).zzr(zzjw.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzps zzpsVar = (zzps) map.get(str);
                if (zzpsVar == null || zzpsVar.zzb + zzi().zzk(str, zzgi.zzaj) < zzaU().elapsedRealtime()) {
                    zzpsVar = new zzps(this);
                    map.put(str, zzpsVar);
                }
                zzhwVar.zzac(zzpsVar.zza);
            }
        }
        if (zzr().zzC(str)) {
            zzhwVar.zzA();
        }
    }

    final void zzO(zzh zzhVar) {
        zzaX().zzg();
        if (TextUtils.isEmpty(zzhVar.zzH()) && TextUtils.isEmpty(zzhVar.zzA())) {
            zzW((String) Preconditions.checkNotNull(zzhVar.zzC()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzC());
        zzaW().zzj().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgo zzj = zzr().zzj(str);
        String zzl = zzr().zzl(str);
        ArrayMap arrayMap = null;
        if (zzj != null) {
            if (!TextUtils.isEmpty(zzl)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", zzl);
            }
            String zzk = zzr().zzk(str);
            if (!TextUtils.isEmpty(zzk)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put("If-None-Match", zzk);
            }
        }
        this.zzu = true;
        zzp().zza(zzhVar, arrayMap, new zzhg() { // from class: com.google.android.gms.measurement.internal.zzpj
            @Override // com.google.android.gms.measurement.internal.zzhg
            public final void zza(String str2, int i, Throwable th, byte[] bArr, Map map) {
                zzpv.this.zzW(str2, i, th, bArr, map);
            }
        });
    }

    final void zzP(zzr zzrVar, long j) {
        zzh zzl = zzj().zzl((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzl != null && zzB().zzaw(zzrVar.zzb, zzl.zzH(), zzrVar.zzp, zzl.zzA())) {
            zzaW().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzhe.zzn(zzl.zzC()));
            zzaw zzj = zzj();
            String zzC = zzl.zzC();
            zzj.zzav();
            zzj.zzg();
            Preconditions.checkNotEmpty(zzC);
            try {
                SQLiteDatabase zzj2 = zzj.zzj();
                String[] strArr = {zzC};
                int delete = zzj2.delete("events", "app_id=?", strArr) + zzj2.delete("user_attributes", "app_id=?", strArr) + zzj2.delete("conditional_properties", "app_id=?", strArr) + zzj2.delete("apps", "app_id=?", strArr) + zzj2.delete("raw_events", "app_id=?", strArr) + zzj2.delete("raw_events_metadata", "app_id=?", strArr) + zzj2.delete("event_filters", "app_id=?", strArr) + zzj2.delete("property_filters", "app_id=?", strArr) + zzj2.delete("audience_filter_values", "app_id=?", strArr) + zzj2.delete("consent_settings", "app_id=?", strArr) + zzj2.delete("default_event_params", "app_id=?", strArr) + zzj2.delete("trigger_uris", "app_id=?", strArr);
                if (delete > 0) {
                    zzj.zzu.zzaW().zzj().zzc("Deleted application data. app, records", zzC, Integer.valueOf(delete));
                }
            } catch (SQLiteException e) {
                zzj.zzu.zzaW().zze().zzc("Error deleting application data. appId, error", zzhe.zzn(zzC), e);
            }
            zzl = null;
        }
        if (zzl != null) {
            boolean z = (zzl.zze() == -2147483648L || zzl.zze() == zzrVar.zzj) ? false : true;
            String zzF = zzl.zzF();
            if (z || ((zzl.zze() != -2147483648L || zzF == null || zzF.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", zzF);
                zzbh zzbhVar = new zzbh("_au", new zzbf(bundle), "auto", j);
                if (zzi().zzx(null, zzgi.zzbm)) {
                    zzU(zzbhVar, zzrVar);
                } else {
                    zzS(zzbhVar, zzrVar);
                }
            }
        }
    }

    final void zzQ(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        com.google.android.gms.internal.measurement.zzio zzioVar;
        zzaX().zzg();
        zzM();
        zzao zzb2 = zzao.zzb(zzhwVar.zzaH());
        String zzC = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzjx zzu = zzu(zzC);
        zzju zzjuVar = zzju.UNINITIALIZED;
        int ordinal = zzu.zze().ordinal();
        if (ordinal == 1) {
            zzb2.zzd(zzjw.AD_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            zzb2.zzc(zzjw.AD_STORAGE, zzu.zzb());
        } else {
            zzb2.zzd(zzjw.AD_STORAGE, zzan.FAILSAFE);
        }
        int ordinal2 = zzu.zzf().ordinal();
        if (ordinal2 == 1) {
            zzb2.zzd(zzjw.ANALYTICS_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            zzb2.zzc(zzjw.ANALYTICS_STORAGE, zzu.zzb());
        } else {
            zzb2.zzd(zzjw.ANALYTICS_STORAGE, zzan.FAILSAFE);
        }
        String zzC2 = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzba zzl = zzl(zzC2, zzm(zzC2), zzu(zzC2), zzb2);
        zzhwVar.zzak(((Boolean) Preconditions.checkNotNull(zzl.zzh())).booleanValue());
        if (!TextUtils.isEmpty(zzl.zzi())) {
            zzhwVar.zzU(zzl.zzi());
        }
        zzaX().zzg();
        zzM();
        Iterator it = zzhwVar.zzaN().iterator();
        while (true) {
            if (it.hasNext()) {
                zzioVar = (com.google.android.gms.internal.measurement.zzio) it.next();
                if ("_npa".equals(zzioVar.zzg())) {
                    break;
                }
            } else {
                zzioVar = null;
                break;
            }
        }
        if (zzioVar != null) {
            zzjw zzjwVar = zzjw.AD_PERSONALIZATION;
            if (zzb2.zza(zzjwVar) == zzan.UNSET) {
                zzqd zzy = zzj().zzy(zzhVar.zzC(), "_npa");
                if (zzy != null) {
                    String str = zzy.zzb;
                    if ("tcf".equals(str)) {
                        zzb2.zzd(zzjwVar, zzan.TCF);
                    } else if ("app".equals(str)) {
                        zzb2.zzd(zzjwVar, zzan.API);
                    } else {
                        zzb2.zzd(zzjwVar, zzan.MANIFEST);
                    }
                } else {
                    Boolean zzx = zzhVar.zzx();
                    if (zzx == null || ((zzx.booleanValue() && zzioVar.zzc() != 1) || !(zzx.booleanValue() || zzioVar.zzc() == 0))) {
                        zzb2.zzd(zzjwVar, zzan.API);
                    } else {
                        zzb2.zzd(zzjwVar, zzan.MANIFEST);
                    }
                }
            }
        } else {
            int zzaC = zzaC(zzhVar.zzC(), zzb2);
            com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
            zze.zzf("_npa");
            zze.zzg(zzaU().currentTimeMillis());
            zze.zze(zzaC);
            zzhwVar.zzp((com.google.android.gms.internal.measurement.zzio) zze.zzba());
            zzaW().zzj().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(zzaC));
        }
        zzhwVar.zzS(zzb2.toString());
        boolean zzv = this.zzc.zzv(zzhVar.zzC());
        List zzaM = zzhwVar.zzaM();
        int i = 0;
        for (int i2 = 0; i2 < zzaM.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhm) zzaM.get(i2)).zzh())) {
                com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) ((com.google.android.gms.internal.measurement.zzhm) zzaM.get(i2)).zzch();
                List zzp = zzhlVar.zzp();
                int i3 = 0;
                while (true) {
                    if (i3 >= zzp.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhq) zzp.get(i3)).zzg())) {
                        String zzh = ((com.google.android.gms.internal.measurement.zzhq) zzp.get(i3)).zzh();
                        if (zzv && zzh.length() > 4) {
                            char[] charArray = zzh.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
                            zzh = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                        zze2.zzj("_tcfd");
                        zze2.zzk(zzh);
                        zzhlVar.zzj(i3, zze2);
                    } else {
                        i3++;
                    }
                }
                zzhwVar.zzad(i2, zzhlVar);
                return;
            }
        }
    }

    final void zzR(com.google.android.gms.internal.measurement.zzhw zzhwVar, zzpr zzprVar) {
        for (int i = 0; i < zzhwVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzhwVar.zzh(i).zzch();
            Iterator it = zzhlVar.zzp().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhq) it.next()).zzg())) {
                    if (zzprVar.zza.zza() >= zzi().zzh(zzprVar.zza.zzF(), zzgi.zzak)) {
                        int zzh = zzi().zzh(zzprVar.zza.zzF(), zzgi.zzax);
                        String str = null;
                        if (zzh <= 0) {
                            if (zzi().zzx(zzprVar.zza.zzF(), zzgi.zzaX)) {
                                str = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze.zzj("_tu");
                                zze.zzk(str);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze2.zzj("_tr");
                            zze2.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze2.zzba());
                            zzov zzl = zzA().zzl(zzprVar.zza.zzF(), zzhwVar, zzhlVar, str);
                            if (zzl != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.zza.zzF(), zzl.zza);
                                zzj().zzad(zzprVar.zza.zzF(), zzl);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzprVar.zza.zzF())) {
                                    deque.add(zzprVar.zza.zzF());
                                }
                            }
                        } else if (zzj().zzo(zza(), zzprVar.zza.zzF(), false, false, false, false, false, false, true).zzg > zzh) {
                            com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze3.zzj("_tnr");
                            zze3.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze3.zzba());
                        } else {
                            if (zzi().zzx(zzprVar.zza.zzF(), zzgi.zzaX)) {
                                str = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zze4 = com.google.android.gms.internal.measurement.zzhq.zze();
                                zze4.zzj("_tu");
                                zze4.zzk(str);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze4.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zze5 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze5.zzj("_tr");
                            zze5.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zze5.zzba());
                            zzov zzl2 = zzA().zzl(zzprVar.zza.zzF(), zzhwVar, zzhlVar, str);
                            if (zzl2 != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.zza.zzF(), zzl2.zza);
                                zzj().zzad(zzprVar.zza.zzF(), zzl2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzprVar.zza.zzF())) {
                                    deque2.add(zzprVar.zza.zzF());
                                }
                            }
                        }
                    }
                    zzhwVar.zzae(i, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba());
                }
            }
        }
    }

    final void zzS(zzbh zzbhVar, zzr zzrVar) {
        zzbh zzbhVar2;
        List<zzai> zzC;
        List<zzai> zzC2;
        List<zzai> zzC3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzaX().zzg();
        zzM();
        long j = zzbhVar.zzd;
        zzhf zzb2 = zzhf.zzb(zzbhVar);
        zzaX().zzg();
        zzqf.zzN((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzb2.zzd, false);
        zzbh zza = zzb2.zza();
        zzA();
        if (zzqa.zzE(zza, zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            List list = zzrVar.zzs;
            if (list != null) {
                String str3 = zza.zza;
                if (!list.contains(str3)) {
                    zzaW().zzd().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                    return;
                } else {
                    Bundle zzc = zza.zzb.zzc();
                    zzc.putLong("ga_safelisted", 1L);
                    zzbhVar2 = new zzbh(str3, new zzbf(zzc), zza.zzc, zza.zzd);
                }
            } else {
                zzbhVar2 = zza;
            }
            zzj().zzH();
            try {
                zzra.zzb();
                if (zzi().zzx(null, zzgi.zzbi) && "_s".equals(zzbhVar2.zza) && !zzj().zzZ(str2, "_s") && zzbhVar2.zzb.zze("_sid").longValue() != 0) {
                    if (!zzj().zzZ(str2, "_f") && !zzj().zzZ(str2, "_v")) {
                        zzj().zzG(str2, Long.valueOf(zzaU().currentTimeMillis() - 15000), "_sid", zzf(str2, zzbhVar2));
                    }
                    zzj().zzG(str2, null, "_sid", zzf(str2, zzbhVar2));
                }
                zzaw zzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzj.zzg();
                zzj.zzav();
                if (j < 0) {
                    zzj.zzu.zzaW().zzk().zzc("Invalid time querying timed out conditional properties", zzhe.zzn(str2), Long.valueOf(j));
                    zzC = Collections.emptyList();
                } else {
                    zzC = zzj.zzC("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzai zzaiVar : zzC) {
                    if (zzaiVar != null) {
                        zzaW().zzj().zzd("User property timed out", zzaiVar.zza, this.zzn.zzj().zzf(zzaiVar.zzc.zzb), zzaiVar.zzc.zza());
                        zzbh zzbhVar3 = zzaiVar.zzg;
                        if (zzbhVar3 != null) {
                            zzax(new zzbh(zzbhVar3, j), zzrVar);
                        }
                        zzj().zza(str2, zzaiVar.zzc.zzb);
                    }
                }
                zzaw zzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzj2.zzg();
                zzj2.zzav();
                if (j < 0) {
                    zzj2.zzu.zzaW().zzk().zzc("Invalid time querying expired conditional properties", zzhe.zzn(str2), Long.valueOf(j));
                    zzC2 = Collections.emptyList();
                } else {
                    zzC2 = zzj2.zzC("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzC2.size());
                for (zzai zzaiVar2 : zzC2) {
                    if (zzaiVar2 != null) {
                        zzaW().zzj().zzd("User property expired", zzaiVar2.zza, this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                        zzj().zzP(str2, zzaiVar2.zzc.zzb);
                        zzbh zzbhVar4 = zzaiVar2.zzk;
                        if (zzbhVar4 != null) {
                            arrayList.add(zzbhVar4);
                        }
                        zzj().zza(str2, zzaiVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzax(new zzbh((zzbh) it.next(), j), zzrVar);
                }
                zzaw zzj3 = zzj();
                String str4 = zzbhVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzj3.zzg();
                zzj3.zzav();
                if (j < 0) {
                    zzio zzioVar = zzj3.zzu;
                    zzioVar.zzaW().zzk().zzd("Invalid time querying triggered conditional properties", zzhe.zzn(str2), zzioVar.zzj().zzd(str4), Long.valueOf(j));
                    zzC3 = Collections.emptyList();
                } else {
                    zzC3 = zzj3.zzC("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(zzC3.size());
                for (zzai zzaiVar3 : zzC3) {
                    if (zzaiVar3 != null) {
                        zzqb zzqbVar = zzaiVar3.zzc;
                        zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar3.zza), zzaiVar3.zzb, zzqbVar.zzb, j, Preconditions.checkNotNull(zzqbVar.zza()));
                        if (zzj().zzai(zzqdVar)) {
                            zzaW().zzj().zzd("User property triggered", zzaiVar3.zza, this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                        } else {
                            zzaW().zze().zzd("Too many active user properties, ignoring", zzhe.zzn(zzaiVar3.zza), this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                        }
                        zzbh zzbhVar5 = zzaiVar3.zzi;
                        if (zzbhVar5 != null) {
                            arrayList2.add(zzbhVar5);
                        }
                        zzaiVar3.zzc = new zzqb(zzqdVar);
                        zzaiVar3.zze = true;
                        zzj().zzah(zzaiVar3);
                    }
                }
                zzax(zzbhVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzax(new zzbh((zzbh) it2.next(), j), zzrVar);
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzT(zzbh zzbhVar, String str) {
        zzh zzl = zzj().zzl(str);
        if (zzl == null || TextUtils.isEmpty(zzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzaF = zzaF(zzl);
        if (zzaF == null) {
            if (!"_ui".equals(zzbhVar.zza)) {
                zzaW().zzk().zzb("Could not find package. appId", zzhe.zzn(str));
            }
        } else if (!zzaF.booleanValue()) {
            zzaW().zze().zzb("App version does not match; dropping event. appId", zzhe.zzn(str));
            return;
        }
        zzU(zzbhVar, new zzr(str, zzl.zzH(), zzl.zzF(), zzl.zze(), zzl.zzE(), zzl.zzq(), zzl.zzn(), (String) null, zzl.zzaJ(), false, zzl.zzG(), 0L, 0, zzl.zzaI(), false, zzl.zzA(), zzl.zzx(), zzl.zzo(), zzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzl.zzaL(), zzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzl.zza(), zzl.zzf(), zzl.zzM(), zzl.zzK(), 0L, zzl.zzb()));
    }

    final void zzU(zzbh zzbhVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzhf zzb2 = zzhf.zzb(zzbhVar);
        zzB().zzO(zzb2.zzd, zzj().zzk(str));
        zzB().zzQ(zzb2, zzi().zzf(str));
        zzbh zza = zzb2.zza();
        if ("_cmp".equals(zza.zza)) {
            zzbf zzbfVar = zza.zzb;
            if ("referrer API v2".equals(zzbfVar.zzg("_cis"))) {
                String zzg = zzbfVar.zzg("gclid");
                if (!TextUtils.isEmpty(zzg)) {
                    zzas(new zzqb("_lgclid", zza.zzd, zzg, "auto"), zzrVar);
                }
            }
        }
        zzS(zza, zzrVar);
    }

    final void zzV() {
        this.zzt++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x015f, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00d0, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013c, B:47:0x0146, B:49:0x0154, B:50:0x015c, B:51:0x010b, B:52:0x00d8, B:54:0x00e2), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzW(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzaH();
                throw th2;
            }
        }
        zzhc zzj = zzaW().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzj().zzH();
        try {
            zzh zzl = zzj().zzl(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzl == null) {
                    zzaW().zzk().zzb("App does not exist in onConfigFetched. appId", zzhe.zzn(str));
                } else {
                    if (!z && i != 404) {
                        zzl.zzam(zzaU().currentTimeMillis());
                        zzj().zzT(zzl, false, false);
                        zzaW().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                        zzr().zzq(str);
                        this.zzk.zze.zzb(zzaU().currentTimeMillis());
                        if (i == 503 || i == 429) {
                            this.zzk.zzc.zzb(zzaU().currentTimeMillis());
                        }
                        zzaL();
                    }
                    String zzaG = zzaG(map, "Last-Modified");
                    String zzaG2 = zzaG(map, Command.HTTP_HEADER_ETAG);
                    if (i != 404 && i != 304) {
                        zzr().zzz(str, bArr, zzaG, zzaG2);
                        zzl.zzab(zzaU().currentTimeMillis());
                        zzj().zzT(zzl, false, false);
                        if (i != 404) {
                            zzaW().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaW().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                        }
                        if (!zzp().zzd() && zzaN()) {
                            zzat();
                        } else if (!zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(zzl.zzC())) {
                            zzav(zzl.zzC());
                        } else {
                            zzaL();
                        }
                    }
                    if (zzr().zzj(str) == null) {
                        zzr().zzz(str, null, null, null);
                    }
                    zzl.zzab(zzaU().currentTimeMillis());
                    zzj().zzT(zzl, false, false);
                    if (i != 404) {
                    }
                    if (!zzp().zzd()) {
                    }
                    if (!zzi().zzx(null, zzgi.zzaM)) {
                    }
                    zzaL();
                }
                zzj().zzS();
                zzj().zzL();
                this.zzu = false;
                zzaH();
            }
            if (th == null) {
                z = true;
                if (zzl == null) {
                }
                zzj().zzS();
                zzj().zzL();
                this.zzu = false;
                zzaH();
            }
            z = false;
            if (zzl == null) {
            }
            zzj().zzS();
            zzj().zzL();
            this.zzu = false;
            zzaH();
        } catch (Throwable th3) {
            zzj().zzL();
            throw th3;
        }
    }

    final void zzX(boolean z) {
        zzaL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r23 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        long j;
        zzaw zzj;
        long longValue;
        int i2 = i;
        zzaX().zzg();
        zzM();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                this.zzv = false;
                zzaH();
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) Preconditions.checkNotNull(this.zzz);
        this.zzz = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    zzaW().zzl().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    this.zzk.zze.zzb(zzaU().currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        this.zzk.zzc.zzb(zzaU().currentTimeMillis());
                    }
                    zzj().zzM(list2);
                    zzaL();
                    this.zzv = false;
                    zzaH();
                    return;
                }
            }
            long j2 = -1;
            if (!zzi().zzx(null, zzgi.zzaM)) {
                j = -1;
            } else if (zzi().zzx(null, zzgi.zzaP)) {
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) pair.first;
                    zzph zzphVar = (zzph) pair.second;
                    if (zzphVar.zza() != zzmf.SGTM_CLIENT) {
                        long j3 = j2;
                        long zzd = zzj().zzd(str, zzhvVar, zzphVar.zzc(), zzphVar.zzd(), zzphVar.zza(), null);
                        if (zzphVar.zza() == zzmf.GOOGLE_SIGNAL_PENDING && zzd != j3 && !zzhvVar.zzf().isEmpty()) {
                            hashMap.put(zzhvVar.zzf(), Long.valueOf(zzd));
                        }
                        j2 = j3;
                    }
                }
                j = j2;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) pair2.first;
                    zzph zzphVar2 = (zzph) pair2.second;
                    if (zzphVar2.zza() == zzmf.SGTM_CLIENT) {
                        zzj().zzd(str, zzhvVar2, zzphVar2.zzc(), zzphVar2.zzd(), zzphVar2.zza(), (Long) hashMap.get(zzhvVar2.zzf()));
                    }
                }
            } else {
                j = -1;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Pair pair3 = (Pair) it3.next();
                    com.google.android.gms.internal.measurement.zzhv zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) pair3.first;
                    zzph zzphVar3 = (zzph) pair3.second;
                    zzj().zzd(str, zzhvVar3, zzphVar3.zzc(), zzphVar3.zzd(), zzphVar3.zza(), null);
                }
            }
            for (Long l : list2) {
                try {
                    zzj = zzj();
                    longValue = l.longValue();
                    zzj.zzg();
                    zzj.zzav();
                } catch (SQLiteException e) {
                    List list3 = this.zzA;
                    if (list3 == null || !list3.contains(l)) {
                        throw e;
                    }
                }
                try {
                    if (zzj.zzj().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                } catch (SQLiteException e2) {
                    zzj.zzu.zzaW().zze().zzb("Failed to delete a bundle in a queue table", e2);
                    throw e2;
                }
            }
            zzj().zzS();
            zzj().zzL();
            this.zzA = null;
            if (zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(str)) {
                zzav(str);
            } else if (zzp().zzd() && zzaN()) {
                zzat();
            } else {
                this.zzB = j;
                zzaL();
            }
            this.zza = 0L;
            this.zzv = false;
            zzaH();
            return;
        } catch (Throwable th2) {
            zzj().zzL();
            throw th2;
        }
        zzhc zzj2 = zzaW().zzj();
        Integer valueOf = Integer.valueOf(i2);
        zzj2.zzc("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z));
        if (z) {
            try {
                this.zzk.zzd.zzb(zzaU().currentTimeMillis());
            } catch (SQLiteException e3) {
                zzaW().zze().zzb("Database error while trying to delete uploaded bundles", e3);
                this.zza = zzaU().elapsedRealtime();
                zzaW().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
        }
        this.zzk.zze.zzb(0L);
        zzaL();
        if (z) {
            zzaW().zzj().zzc("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            zzaW().zzj().zza("Purged empty bundles");
        }
        zzj().zzH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008c  */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzZ(String str, int i, Throwable th, byte[] bArr, zzpz zzpzVar) {
        zzaX().zzg();
        zzM();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaH();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, Math.min(32, str2.length()));
            zzhc zzl = zzaW().zzl();
            Integer valueOf = Integer.valueOf(i);
            if (th == null) {
                th = substring;
            }
            zzl.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf, th);
            zzj().zzN(Long.valueOf(zzpzVar.zzc()));
            zzaL();
            this.zzv = false;
            zzaH();
        }
        if (th == null) {
            zzj().zzK(Long.valueOf(zzpzVar.zzc()));
            zzaW().zzj().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i));
            if (zzi().zzx(null, zzgi.zzaM) && zzp().zzd() && zzj().zzY(str)) {
                zzav(str);
            } else {
                zzaL();
            }
            this.zzv = false;
            zzaH();
        }
        String str22 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, Math.min(32, str22.length()));
        zzhc zzl2 = zzaW().zzl();
        Integer valueOf2 = Integer.valueOf(i);
        if (th == null) {
        }
        zzl2.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th);
        zzj().zzN(Long.valueOf(zzpzVar.zzc()));
        zzaL();
        this.zzv = false;
        zzaH();
    }

    final long zza() {
        long currentTimeMillis = zzaU().currentTimeMillis();
        zzoa zzoaVar = this.zzk;
        zzoaVar.zzav();
        zzoaVar.zzg();
        zzhp zzhpVar = zzoaVar.zzf;
        long zza = zzhpVar.zza();
        if (zza == 0) {
            zza = zzoaVar.zzu.zzw().zzJ().nextInt(BrandSafetyUtils.g) + 1;
            zzhpVar.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Context zzaT() {
        return this.zzn.zzaT();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Clock zzaU() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzaf zzaV() {
        return this.zzn.zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzhe zzaW() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzil zzaX() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaX();
    }

    final void zzaa(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzaX().zzg();
        zzM();
        com.google.android.gms.internal.measurement.zzhb zzc = com.google.android.gms.internal.measurement.zzhc.zzc();
        byte[] zzaN = zzhVar.zzaN();
        if (zzaN != null) {
            try {
                zzc = (com.google.android.gms.internal.measurement.zzhb) zzqa.zzp(zzc, zzaN);
            } catch (com.google.android.gms.internal.measurement.zzmm unused) {
                zzaW().zzk().zzb("Failed to parse locally stored ad campaign info. appId", zzhe.zzn(zzhVar.zzC()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhm zzhmVar : zzhwVar.zzaM()) {
            if (zzhmVar.zzh().equals("_cmp")) {
                String str = (String) zzqa.zzI(zzhmVar, "gclid", "");
                String str2 = (String) zzqa.zzI(zzhmVar, "gbraid", "");
                String str3 = (String) zzqa.zzI(zzhmVar, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long longValue = ((Long) zzqa.zzI(zzhmVar, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhmVar.zzd();
                    }
                    if ("referrer API v2".equals(zzqa.zzH(zzhmVar, "_cis"))) {
                        if (longValue > zzc.zzb()) {
                            if (str.isEmpty()) {
                                zzc.zzh();
                            } else {
                                zzc.zzp(str);
                            }
                            if (str2.isEmpty()) {
                                zzc.zzg();
                            } else {
                                zzc.zzo(str2);
                            }
                            if (str3.isEmpty()) {
                                zzc.zzf();
                            } else {
                                zzc.zzn(str3);
                            }
                            zzc.zzm(longValue);
                        }
                    } else if (longValue > zzc.zza()) {
                        if (str.isEmpty()) {
                            zzc.zze();
                        } else {
                            zzc.zzk(str);
                        }
                        if (str2.isEmpty()) {
                            zzc.zzd();
                        } else {
                            zzc.zzj(str2);
                        }
                        if (str3.isEmpty()) {
                            zzc.zzc();
                        } else {
                            zzc.zzi(str3);
                        }
                        zzc.zzl(longValue);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzhc) zzc.zzba()).equals(com.google.android.gms.internal.measurement.zzhc.zze())) {
            zzhwVar.zzF((com.google.android.gms.internal.measurement.zzhc) zzc.zzba());
        }
        zzhVar.zzR(((com.google.android.gms.internal.measurement.zzhc) zzc.zzba()).zzcd());
        if (zzhVar.zzaK()) {
            zzj().zzT(zzhVar, false, false);
        }
    }

    final void zzab(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzi().zzx(null, zzgi.zzay)) {
            long currentTimeMillis = zzaU().currentTimeMillis();
            int zzh = zzi().zzh(null, zzgi.zzah);
            zzi();
            long zzF = currentTimeMillis - zzam.zzF();
            while (i < zzh && zzaM(null, zzF)) {
                i++;
            }
        } else {
            zzi();
            long zzH = zzam.zzH();
            while (i < zzH && zzaM(str, 0L)) {
                i++;
            }
        }
        if (zzi().zzx(null, zzgi.zzaz)) {
            zzaX().zzg();
            zzaJ();
        }
        if (zzi().zzx(null, zzgi.zzaQ) && this.zzl.zzd(str, zzih.zzb(zzrVar.zzG))) {
            zzaW().zzj().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzau(str, zzaU().currentTimeMillis());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:63|64)|(2:66|(8:68|(3:70|(2:72|(1:74))(1:94)|75)(1:95)|76|(1:78)(1:93)|79|80|81|(4:83|(1:85)(1:89)|86|(1:88))))|96|80|81|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c7, code lost:
    
        if (true == r11.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c9, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ce, code lost:
    
        r4 = true;
        r3 = new com.google.android.gms.measurement.internal.zzqb("_npa", r13, java.lang.Long.valueOf(r17), "auto");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00db, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00e5, code lost:
    
        if (r10.zze.equals(r3.zzd) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e7, code lost:
    
        zzas(r3, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00cc, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0347, code lost:
    
        zzaW().zze().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r6), r0);
        r0 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e2 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0118 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0104 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035b A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:25:0x009c, B:27:0x00ad, B:31:0x00f1, B:33:0x00fe, B:34:0x0107, B:36:0x010c, B:38:0x0125, B:41:0x013a, B:43:0x0163, B:45:0x016d, B:47:0x017c, B:48:0x0256, B:50:0x0284, B:51:0x0287, B:53:0x02af, B:57:0x0378, B:58:0x037b, B:59:0x0403, B:64:0x02c4, B:66:0x02e7, B:68:0x02ef, B:70:0x02f5, B:74:0x0308, B:76:0x0319, B:79:0x0325, B:81:0x0336, B:83:0x035b, B:85:0x0361, B:86:0x0369, B:88:0x036f, B:92:0x0347, B:94:0x0311, B:99:0x02d3, B:100:0x018d, B:102:0x01b6, B:103:0x01c5, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01e2, B:113:0x01e8, B:115:0x01ee, B:117:0x01f3, B:120:0x0213, B:125:0x0217, B:126:0x022b, B:127:0x0239, B:129:0x0247, B:130:0x0393, B:132:0x03c8, B:133:0x03cb, B:134:0x03e2, B:136:0x03e8, B:137:0x0118, B:138:0x0104, B:140:0x00bf, B:143:0x00ce, B:145:0x00dd, B:147:0x00e7, B:151:0x00ee), top: B:24:0x009c, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzac(zzr zzrVar) {
        boolean z;
        zzbd zzs;
        boolean z2;
        long j;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j2;
        boolean z3;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        if (zzaQ(zzrVar)) {
            zzh zzl = zzj().zzl(str);
            if (zzl != null && TextUtils.isEmpty(zzl.zzH()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzl.zzab(0L);
                zzj().zzT(zzl, false, false);
                zzr().zzr(str);
            }
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            long j3 = zzrVar.zzl;
            if (j3 == 0) {
                j3 = zzaU().currentTimeMillis();
            }
            this.zzn.zzg().zzg();
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaW().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzhe.zzn(str), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzH();
            try {
                zzqd zzy = zzj().zzy(str, "_npa");
                Boolean zzaS = zzaS(zzrVar);
                if (zzy != null && !"auto".equals(zzy.zzb)) {
                    z = true;
                    if (zzi().zzx(null, zzgi.zzbl)) {
                        zzP(zzrVar, j3);
                    } else {
                        zzP(zzrVar, zzrVar.zzF);
                    }
                    zzg(zzrVar);
                    if (i != 0) {
                        zzs = zzj().zzs(str, "_f");
                        z2 = false;
                    } else {
                        zzs = zzj().zzs(str, "_v");
                        z2 = z;
                    }
                    if (zzs != null) {
                        long j4 = ((j3 / 3600000) + 1) * 3600000;
                        if (z2) {
                            long j5 = j3;
                            zzas(new zzqb("_fvt", j5, Long.valueOf(j4), "auto"), zzrVar);
                            zzaX().zzg();
                            zzM();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                                bundle.putLong("_dac", 1L);
                            }
                            zzU(new zzbh("_v", new zzbf(bundle), "auto", j5), zzrVar);
                        } else {
                            zzas(new zzqb("_fot", j3, Long.valueOf(j4), "auto"), zzrVar);
                            zzaX().zzg();
                            zzhw zzhwVar = (zzhw) Preconditions.checkNotNull(this.zzm);
                            if (str == null || str.isEmpty()) {
                                j = j3;
                                zzhwVar.zza.zzaW().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                zzio zzioVar = zzhwVar.zza;
                                zzioVar.zzaX().zzg();
                                if (zzhwVar.zza()) {
                                    zzhv zzhvVar = new zzhv(zzhwVar, str);
                                    zzioVar.zzaX().zzg();
                                    j = j3;
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzioVar.zzaT().getPackageManager();
                                    if (packageManager == null) {
                                        zzioVar.zzaW().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzioVar.zzaW().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str2 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str2) && zzhwVar.zza()) {
                                                    try {
                                                        zzioVar.zzaW().zzj().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzioVar.zzaT(), new Intent(intent), zzhvVar, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e) {
                                                        zzhwVar.zza.zzaW().zze().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } else {
                                                    zzioVar.zzaW().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzioVar.zzaW().zzi().zza("Install Referrer Reporter is not available");
                                    j = j3;
                                }
                            }
                            zzaX().zzg();
                            zzM();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                                bundle2.putLong("_dac", 1L);
                            }
                            String str3 = (String) Preconditions.checkNotNull(zzrVar.zza);
                            zzaw zzj = zzj();
                            Preconditions.checkNotEmpty(str3);
                            zzj.zzg();
                            zzj.zzav();
                            long zze = zzj.zze(str3, "first_open_count");
                            zzio zzioVar2 = this.zzn;
                            if (zzioVar2.zzaT().getPackageManager() == null) {
                                zzaW().zze().zzb("PackageManager is null, first open report might be inaccurate. appId", zzhe.zzn(str3));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(zzioVar2.zzaT()).getPackageInfo(str3, 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    zzaW().zze().zzc("Package info is null, first open report might be inaccurate. appId", zzhe.zzn(str3), e2);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j6 = packageInfo.firstInstallTime;
                                    if (j6 != 0) {
                                        if (j6 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzi().zzx(null, zzgi.zzaH)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (zze == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                zze = 0;
                                            }
                                            z3 = false;
                                        } else {
                                            applicationInfo = null;
                                            z3 = true;
                                        }
                                        zzas(new zzqb("_fi", j, Long.valueOf(true != z3 ? 0L : 1L), "auto"), zzrVar);
                                        applicationInfo2 = Wrappers.packageManager(this.zzn.zzaT()).getApplicationInfo(str3, 0);
                                        if (applicationInfo2 != null) {
                                            if ((applicationInfo2.flags & 1) != 0) {
                                                j2 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j2 = 1;
                                            }
                                            if ((applicationInfo2.flags & 128) != 0) {
                                                bundle2.putLong("_sysu", j2);
                                            }
                                        }
                                    }
                                }
                                applicationInfo = null;
                                applicationInfo2 = Wrappers.packageManager(this.zzn.zzaT()).getApplicationInfo(str3, 0);
                                if (applicationInfo2 != null) {
                                }
                            }
                            if (zze >= 0) {
                                bundle2.putLong("_pfo", zze);
                            }
                            zzU(new zzbh("_f", new zzbf(bundle2), "auto", j), zzrVar);
                        }
                    } else {
                        long j7 = j3;
                        if (zzrVar.zzi) {
                            zzU(new zzbh("_cd", new zzbf(new Bundle()), "auto", j7), zzrVar);
                        }
                    }
                    zzj().zzS();
                    zzj().zzL();
                }
                z = true;
                if (zzy != null) {
                    zzag("_npa", zzrVar);
                }
                if (zzi().zzx(null, zzgi.zzbl)) {
                }
                zzg(zzrVar);
                if (i != 0) {
                }
                if (zzs != null) {
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzad() {
        this.zzs++;
    }

    final void zzae(zzai zzaiVar) {
        zzr zzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.zza));
        if (zzaD != null) {
            zzaf(zzaiVar, zzaD);
        }
    }

    final void zzaf(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.zza);
        Preconditions.checkNotNull(zzaiVar.zzc);
        Preconditions.checkNotEmpty(zzaiVar.zzc.zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzj().zzH();
            try {
                zzg(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzaiVar.zza);
                zzai zzm = zzj().zzm(str, zzaiVar.zzc.zzb);
                if (zzm != null) {
                    zzaW().zzd().zzc("Removing conditional user property", zzaiVar.zza, this.zzn.zzj().zzf(zzaiVar.zzc.zzb));
                    zzj().zza(str, zzaiVar.zzc.zzb);
                    if (zzm.zze) {
                        zzj().zzP(str, zzaiVar.zzc.zzb);
                    }
                    zzbh zzbhVar = zzaiVar.zzk;
                    if (zzbhVar != null) {
                        zzbf zzbfVar = zzbhVar.zzb;
                        zzax((zzbh) Preconditions.checkNotNull(zzB().zzC(str, ((zzbh) Preconditions.checkNotNull(zzbhVar)).zza, zzbfVar != null ? zzbfVar.zzc() : null, zzm.zzb, zzbhVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaW().zzk().zzc("Conditional user property doesn't exist", zzhe.zzn(zzaiVar.zza), this.zzn.zzj().zzf(zzaiVar.zzc.zzb));
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzag(String str, zzr zzrVar) {
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            Boolean zzaS = zzaS(zzrVar);
            if ("_npa".equals(str) && zzaS != null) {
                zzaW().zzd().zza("Falling back to manifest metadata value for ad personalization");
                zzas(new zzqb("_npa", zzaU().currentTimeMillis(), Long.valueOf(true != zzaS.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzhc zzd = zzaW().zzd();
            zzio zzioVar = this.zzn;
            zzd.zzb("Removing user property", zzioVar.zzj().zzf(str));
            zzj().zzH();
            try {
                zzg(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzP((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzP((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzS();
                zzaW().zzd().zzb("User property removed", zzioVar.zzj().zzf(str));
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzah(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzaw zzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
        zzj.zzg();
        zzj.zzav();
        try {
            SQLiteDatabase zzj2 = zzj.zzj();
            String[] strArr = {str};
            int delete = zzj2.delete("apps", "app_id=?", strArr) + zzj2.delete("events", "app_id=?", strArr) + zzj2.delete("events_snapshot", "app_id=?", strArr) + zzj2.delete("user_attributes", "app_id=?", strArr) + zzj2.delete("conditional_properties", "app_id=?", strArr) + zzj2.delete("raw_events", "app_id=?", strArr) + zzj2.delete("raw_events_metadata", "app_id=?", strArr) + zzj2.delete("queue", "app_id=?", strArr) + zzj2.delete("audience_filter_values", "app_id=?", strArr) + zzj2.delete("main_event_params", "app_id=?", strArr) + zzj2.delete("default_event_params", "app_id=?", strArr) + zzj2.delete("trigger_uris", "app_id=?", strArr) + zzj2.delete("upload_queue", "app_id=?", strArr);
            if (delete > 0) {
                zzj.zzu.zzaW().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzj.zzu.zzaW().zze().zzc("Error resetting analytics data. appId, error", zzhe.zzn(str), e);
        }
        if (zzrVar.zzh) {
            zzac(zzrVar);
        }
    }

    final void zzai(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzba zze = zzba.zze(zzrVar.zzA);
        zzaW().zzj().zzc("Setting DMA consent for package", str, zze);
        zzaX().zzg();
        zzM();
        zzju zzf = zzba.zzc(zzd(str), 100).zzf();
        this.zzD.put(str, zze);
        zzj().zzU(str, zze);
        zzju zzf2 = zzba.zzc(zzd(str), 100).zzf();
        zzaX().zzg();
        zzM();
        zzju zzjuVar = zzju.DENIED;
        boolean z = zzf == zzjuVar && zzf2 == zzju.GRANTED;
        boolean z2 = zzf == zzju.GRANTED && zzf2 == zzjuVar;
        if (z || z2) {
            zzaW().zzj().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzo(zza(), str, false, false, false, false, false, false, false).zzf < zzi().zzh(str, zzgi.zzal)) {
                bundle.putLong("_r", 1L);
                zzaW().zzj().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzo(zza(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final void zzaj(String str, zzmh zzmhVar) {
        zzaX().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzmhVar != null) {
            this.zzH = str;
            this.zzG = zzmhVar;
        }
    }

    final void zzak(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjx zzk = zzjx.zzk(zzrVar.zzu, zzrVar.zzz);
        zzu(str);
        zzaW().zzj().zzc("Setting storage consent for package", str, zzk);
        zzaq(str, zzk);
    }

    final void zzal(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaW().zze().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    protected final void zzam() {
        zzaX().zzg();
        zzj().zzO();
        zzaw zzj = zzj();
        zzj.zzg();
        zzj.zzav();
        if (zzj.zzae()) {
            zzgg zzggVar = zzgi.zzau;
            if (((Long) zzggVar.zza(null)).longValue() != 0) {
                SQLiteDatabase zzj2 = zzj.zzj();
                zzio zzioVar = zzj.zzu;
                int delete = zzj2.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzioVar.zzaU().currentTimeMillis()), String.valueOf(zzggVar.zza(null))});
                if (delete > 0) {
                    zzioVar.zzaW().zzj().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaU().currentTimeMillis());
        }
        zzaL();
    }

    final void zzan(zzai zzaiVar) {
        zzr zzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.zza));
        if (zzaD != null) {
            zzao(zzaiVar, zzaD);
        }
    }

    final void zzao(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.zza);
        Preconditions.checkNotNull(zzaiVar.zzb);
        Preconditions.checkNotNull(zzaiVar.zzc);
        Preconditions.checkNotEmpty(zzaiVar.zzc.zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzai zzaiVar2 = new zzai(zzaiVar);
            boolean z = false;
            zzaiVar2.zze = false;
            zzj().zzH();
            try {
                zzai zzm = zzj().zzm((String) Preconditions.checkNotNull(zzaiVar2.zza), zzaiVar2.zzc.zzb);
                if (zzm != null && !zzm.zzb.equals(zzaiVar2.zzb)) {
                    zzaW().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzb, zzm.zzb);
                }
                if (zzm != null && zzm.zze) {
                    zzaiVar2.zzb = zzm.zzb;
                    zzaiVar2.zzd = zzm.zzd;
                    zzaiVar2.zzh = zzm.zzh;
                    zzaiVar2.zzf = zzm.zzf;
                    zzaiVar2.zzi = zzm.zzi;
                    zzaiVar2.zze = true;
                    zzqb zzqbVar = zzaiVar2.zzc;
                    zzaiVar2.zzc = new zzqb(zzqbVar.zzb, zzm.zzc.zzc, zzqbVar.zza(), zzm.zzc.zzf);
                } else if (TextUtils.isEmpty(zzaiVar2.zzf)) {
                    zzqb zzqbVar2 = zzaiVar2.zzc;
                    zzaiVar2.zzc = new zzqb(zzqbVar2.zzb, zzaiVar2.zzd, zzqbVar2.zza(), zzaiVar2.zzc.zzf);
                    zzaiVar2.zze = true;
                    z = true;
                }
                if (zzaiVar2.zze) {
                    zzqb zzqbVar3 = zzaiVar2.zzc;
                    zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar2.zza), zzaiVar2.zzb, zzqbVar3.zzb, zzqbVar3.zzc, Preconditions.checkNotNull(zzqbVar3.zza()));
                    if (zzj().zzai(zzqdVar)) {
                        zzaW().zzd().zzd("User property updated immediately", zzaiVar2.zza, this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                    } else {
                        zzaW().zze().zzd("(2)Too many active user properties, ignoring", zzhe.zzn(zzaiVar2.zza), this.zzn.zzj().zzf(zzqdVar.zzc), zzqdVar.zze);
                    }
                    if (z && zzaiVar2.zzi != null) {
                        zzax(new zzbh(zzaiVar2.zzi, zzaiVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzah(zzaiVar2)) {
                    zzaW().zzd().zzd("Conditional property added", zzaiVar2.zza, this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                } else {
                    zzaW().zze().zzd("Too many conditional properties, ignoring", zzhe.zzn(zzaiVar2.zza), this.zzn.zzj().zzf(zzaiVar2.zzc.zzb), zzaiVar2.zzc.zza());
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final void zzap(String str, zzag zzagVar) {
        long j;
        zzam zzi = zzi();
        zzgg zzggVar = zzgi.zzaP;
        if (zzi.zzx(null, zzggVar)) {
            zzaX().zzg();
            zzM();
            zzaw zzj = zzj();
            long j2 = zzagVar.zza;
            zzpz zzx = zzj.zzx(j2);
            if (zzx == null) {
                zzaW().zzk().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j2));
                return;
            }
            String zzh = zzx.zzh();
            if (zzagVar.zzb != zzme.SUCCESS.zza()) {
                if (zzagVar.zzb == zzme.BACKOFF.zza()) {
                    Map map = this.zzF;
                    zzpt zzptVar = (zzpt) map.get(zzh);
                    if (zzptVar == null) {
                        zzptVar = new zzpt(this);
                        map.put(zzh, zzptVar);
                    } else {
                        zzptVar.zzb();
                    }
                    j = zzptVar.zzc;
                    zzaW().zzj().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, zzh, Long.valueOf((j - zzaU().currentTimeMillis()) / 1000));
                }
                zzaw zzj2 = zzj();
                Long valueOf = Long.valueOf(zzagVar.zza);
                zzj2.zzN(valueOf);
                zzaW().zzj().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
                return;
            }
            Map map2 = this.zzF;
            if (map2.containsKey(zzh)) {
                map2.remove(zzh);
            }
            zzaw zzj3 = zzj();
            Long valueOf2 = Long.valueOf(j2);
            zzj3.zzK(valueOf2);
            zzaW().zzj().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
            long j3 = zzagVar.zzc;
            if (j3 > 0) {
                zzaw zzj4 = zzj();
                zzio zzioVar = zzj4.zzu;
                if (zzioVar.zzf().zzx(null, zzggVar)) {
                    zzj4.zzg();
                    zzj4.zzav();
                    Long valueOf3 = Long.valueOf(j3);
                    Preconditions.checkNotNull(valueOf3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(zzmf.GOOGLE_SIGNAL.zza()));
                    contentValues.put("creation_timestamp", Long.valueOf(zzioVar.zzaU().currentTimeMillis()));
                    try {
                        if (zzj4.zzj().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str, String.valueOf(zzmf.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                            zzioVar.zzaW().zzk().zzc("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                        }
                    } catch (SQLiteException e) {
                        zzj4.zzu.zzaW().zze().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j3), e);
                        throw e;
                    }
                }
                zzaW().zzj().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzagVar.zzc));
                zzav(str);
            }
        }
    }

    final void zzaq(String str, zzjx zzjxVar) {
        zzaX().zzg();
        zzM();
        this.zzC.put(str, zzjxVar);
        zzj().zzX(str, zzjxVar);
    }

    final void zzar(String str, boolean z, Long l, Long l2) {
        zzh zzl = zzj().zzl(str);
        if (zzl != null) {
            zzl.zzaF(z);
            zzl.zzaG(l);
            zzl.zzaH(l2);
            if (zzl.zzaK()) {
                zzj().zzT(zzl, false, false);
            }
        }
    }

    final void zzas(zzqb zzqbVar, zzr zzrVar) {
        String str;
        zzqd zzy;
        long j;
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzqf zzB = zzB();
            String str2 = zzqbVar.zzb;
            int zzj = zzB.zzj(str2);
            if (zzj != 0) {
                zzqf zzB2 = zzB();
                zzi();
                zzB().zzR(this.zzK, zzrVar.zza, zzj, "_ev", zzB2.zzG(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzB().zzd(str2, zzqbVar.zza());
            if (zzd != 0) {
                zzqf zzB3 = zzB();
                zzi();
                String zzG = zzB3.zzG(str2, 24, true);
                Object zza = zzqbVar.zza();
                zzB().zzR(this.zzK, zzrVar.zza, zzd, "_ev", zzG, (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : zza.toString().length());
                return;
            }
            Object zzE = zzB().zzE(str2, zzqbVar.zza());
            if (zzE != null) {
                if ("_sid".equals(str2)) {
                    long j2 = zzqbVar.zzc;
                    String str3 = zzqbVar.zzf;
                    String str4 = (String) Preconditions.checkNotNull(zzrVar.zza);
                    zzqd zzy2 = zzj().zzy(str4, "_sno");
                    if (zzy2 != null) {
                        Object obj = zzy2.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            zzas(new zzqb("_sno", j2, Long.valueOf(j + 1), str3), zzrVar);
                        }
                    }
                    if (zzy2 != null) {
                        zzaW().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzy2.zze);
                    }
                    zzbd zzs = zzj().zzs(str4, "_s");
                    if (zzs != null) {
                        zzhc zzj2 = zzaW().zzj();
                        str = "_sid";
                        long j3 = zzs.zzc;
                        zzj2.zzb("Backfill the session number. Last used session number", Long.valueOf(j3));
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    zzas(new zzqb("_sno", j2, Long.valueOf(j + 1), str3), zzrVar);
                } else {
                    str = "_sid";
                }
                String str5 = zzrVar.zza;
                zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(str5), (String) Preconditions.checkNotNull(zzqbVar.zzf), str2, zzqbVar.zzc, zzE);
                zzhc zzj3 = zzaW().zzj();
                zzio zzioVar = this.zzn;
                String str6 = zzqdVar.zzc;
                zzj3.zzc("Setting user property", zzioVar.zzj().zzf(str6), zzE);
                zzj().zzH();
                try {
                    if ("_id".equals(str6) && (zzy = zzj().zzy(str5, "_id")) != null && !zzqdVar.zze.equals(zzy.zze)) {
                        zzj().zzP(str5, "_lair");
                    }
                    zzg(zzrVar);
                    boolean zzai = zzj().zzai(zzqdVar);
                    if (str.equals(str2)) {
                        long zzd2 = zzA().zzd(zzrVar.zzw);
                        zzh zzl = zzj().zzl(str5);
                        if (zzl != null) {
                            zzl.zzaB(zzd2);
                            if (zzl.zzaK()) {
                                zzj().zzT(zzl, false, false);
                            }
                        }
                    }
                    zzj().zzS();
                    if (!zzai) {
                        zzaW().zze().zzc("Too many unique user properties are set. Ignoring user property", zzioVar.zzj().zzf(str6), zzqdVar.zze);
                        zzB().zzR(this.zzK, str5, 9, null, null, 0);
                    }
                    zzj().zzL();
                } catch (Throwable th) {
                    zzj().zzL();
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzat() {
        zzaw zzj;
        long zzF;
        SQLiteException e;
        zzh zzl;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean zzl2 = zzioVar.zzu().zzl();
            if (zzl2 == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (zzl2.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else {
                zzaX().zzg();
                if (this.zzz != null) {
                    zzaW().zzj().zza("Uploading requested multiple times");
                } else if (zzp().zzd()) {
                    ?? currentTimeMillis = zzaU().currentTimeMillis();
                    Cursor cursor = null;
                    r7 = null;
                    Cursor cursor2 = null;
                    r7 = null;
                    r7 = null;
                    String str = null;
                    int zzh = zzi().zzh(null, zzgi.zzah);
                    zzi();
                    long zzF2 = currentTimeMillis - zzam.zzF();
                    for (int i = 0; i < zzh && zzaM(null, zzF2); i++) {
                    }
                    zzqr.zzb();
                    zzaX().zzg();
                    zzaJ();
                    long zza = this.zzk.zzd.zza();
                    if (zza != 0) {
                        zzaW().zzd().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                    }
                    String zzA = zzj().zzA();
                    long j = -1;
                    if (TextUtils.isEmpty(zzA)) {
                        try {
                            this.zzB = -1L;
                            zzj = zzj();
                            zzi();
                            zzF = currentTimeMillis - zzam.zzF();
                            zzj.zzg();
                            zzj.zzav();
                        } catch (Throwable th) {
                            th = th;
                            cursor = currentTimeMillis;
                        }
                        try {
                            currentTimeMillis = zzj.zzj().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzF)});
                            try {
                                if (currentTimeMillis.moveToFirst()) {
                                    str = currentTimeMillis.getString(0);
                                } else {
                                    zzj.zzu.zzaW().zzj().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzj.zzu.zzaW().zze().zzb("Error selecting expired configs", e);
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            currentTimeMillis = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        currentTimeMillis.close();
                        if (!TextUtils.isEmpty(str) && (zzl = zzj().zzl(str)) != null) {
                            zzO(zzl);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzaw zzj2 = zzj();
                            try {
                                try {
                                    cursor2 = zzj2.zzj().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor2.moveToFirst()) {
                                        j = cursor2.getLong(0);
                                    }
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (SQLiteException e4) {
                                zzj2.zzu.zzaW().zze().zzb("Error querying raw events", e4);
                            }
                            cursor2.close();
                            this.zzB = j;
                        }
                        zzau(zzA, currentTimeMillis);
                    }
                } else {
                    zzaW().zzj().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th3) {
            this.zzw = false;
            zzaH();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x01f6, code lost:
    
        if (r11 == null) goto L92;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01d4: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:288:0x01d4 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x040a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzau(String str, long j) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        List emptyList;
        String str2;
        long j2;
        zzph zzphVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.google.android.gms.internal.measurement.zzim zzb2;
        String str3;
        byte[] byteArray;
        long j3;
        long j4;
        int zzh = zzi().zzh(str, zzgi.zzg);
        int i2 = 0;
        int max = Math.max(0, zzi().zzh(str, zzgi.zzh));
        zzaw zzj = zzj();
        zzj.zzg();
        zzj.zzav();
        int i3 = 1;
        Preconditions.checkArgument(zzh > 0);
        Preconditions.checkArgument(max > 0);
        Preconditions.checkNotEmpty(str);
        try {
            try {
                cursor2 = zzj.zzj().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(zzh));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzj.zzu.zzaW().zze().zzc("Error querying bundles. appId", zzhe.zzn(str), e);
                    emptyList = Collections.emptyList();
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (!cursor2.moveToFirst()) {
            emptyList = Collections.emptyList();
            cursor2.close();
            if (emptyList.isEmpty()) {
                if (zzu(str).zzr(zzjw.AD_STORAGE)) {
                    Iterator it = emptyList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str3 = null;
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzhx zzhxVar = (com.google.android.gms.internal.measurement.zzhx) ((Pair) it.next()).first;
                        if (!zzhxVar.zzT().isEmpty()) {
                            str3 = zzhxVar.zzT();
                            break;
                        }
                    }
                    if (str3 != null) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= emptyList.size()) {
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzhx zzhxVar2 = (com.google.android.gms.internal.measurement.zzhx) ((Pair) emptyList.get(i4)).first;
                            if (!zzhxVar2.zzT().isEmpty() && !zzhxVar2.zzT().equals(str3)) {
                                emptyList = emptyList.subList(0, i4);
                                break;
                            }
                            i4++;
                        }
                    }
                }
                com.google.android.gms.internal.measurement.zzht zzb3 = com.google.android.gms.internal.measurement.zzhv.zzb();
                int size = emptyList.size();
                List arrayList = new ArrayList(emptyList.size());
                boolean z5 = zzi().zzy(str) && zzu(str).zzr(zzjw.AD_STORAGE);
                boolean zzr = zzu(str).zzr(zzjw.AD_STORAGE);
                boolean zzr2 = zzu(str).zzr(zzjw.ANALYTICS_STORAGE);
                zzrd.zzb();
                boolean zzx = zzi().zzx(str, zzgi.zzaL);
                zzpi zzpiVar = this.zzl;
                zzph zza = zzpiVar.zza(str);
                int i5 = 0;
                while (i5 < size) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) ((com.google.android.gms.internal.measurement.zzhx) ((Pair) emptyList.get(i5)).first).zzch();
                    arrayList.add((Long) ((Pair) emptyList.get(i5)).second);
                    zzi().zzj();
                    zzhwVar.zzaB(119002L);
                    zzhwVar.zzaA(j);
                    List list = emptyList;
                    this.zzn.zzaV();
                    int i6 = size;
                    zzhwVar.zzau(false);
                    if (!z5) {
                        zzhwVar.zzt();
                    }
                    if (!zzr) {
                        zzhwVar.zzz();
                        zzhwVar.zzw();
                    }
                    if (!zzr2) {
                        zzhwVar.zzq();
                    }
                    zzN(str, zzhwVar);
                    if (!zzx) {
                        zzhwVar.zzA();
                    }
                    if (!zzr2) {
                        zzhwVar.zzr();
                    }
                    String zzaL = zzhwVar.zzaL();
                    if (TextUtils.isEmpty(zzaL)) {
                        i = i6;
                    } else {
                        i = i6;
                        if (!zzaL.equals(MobileFuseDefaults.ADVERTISING_ID_ZEROS)) {
                            z = z5;
                            z2 = zzr;
                            z3 = zzr2;
                            z4 = zzx;
                            if (zzhwVar.zzc() != 0) {
                                if (zzi().zzx(str, zzgi.zzaB)) {
                                    zzhwVar.zzQ(zzA().zzf(((com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba()).zzcd()));
                                }
                                if (zzi().zzx(null, zzgi.zzaP) && (zzb2 = zza.zzb()) != null) {
                                    zzhwVar.zzaw(zzb2);
                                }
                                zzb3.zzc(zzhwVar);
                            }
                            i5++;
                            emptyList = list;
                            size = i;
                            z5 = z;
                            zzr = z2;
                            zzx = z4;
                            zzr2 = z3;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(zzhwVar.zzaM());
                    Iterator it2 = arrayList2.iterator();
                    z = z5;
                    z2 = zzr;
                    Long l = null;
                    Long l2 = null;
                    boolean z6 = false;
                    boolean z7 = false;
                    while (it2.hasNext()) {
                        boolean z8 = zzr2;
                        com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it2.next();
                        boolean z9 = zzx;
                        if ("_fx".equals(zzhmVar.zzh())) {
                            it2.remove();
                            zzx = z9;
                            zzr2 = z8;
                            z6 = true;
                        } else if ("_f".equals(zzhmVar.zzh())) {
                            zzA();
                            com.google.android.gms.internal.measurement.zzhq zzG = zzqa.zzG(zzhmVar, "_pfo");
                            if (zzG != null) {
                                l = Long.valueOf(zzG.zzd());
                            }
                            zzA();
                            com.google.android.gms.internal.measurement.zzhq zzG2 = zzqa.zzG(zzhmVar, "_uwa");
                            if (zzG2 != null) {
                                l2 = Long.valueOf(zzG2.zzd());
                            }
                            zzx = z9;
                            zzr2 = z8;
                        } else {
                            zzx = z9;
                            zzr2 = z8;
                        }
                        z7 = true;
                    }
                    z3 = zzr2;
                    z4 = zzx;
                    if (z6) {
                        zzhwVar.zzu();
                        zzhwVar.zzj(arrayList2);
                    }
                    if (z7) {
                        zzar(zzhwVar.zzaF(), true, l, l2);
                    }
                    if (zzhwVar.zzc() != 0) {
                    }
                    i5++;
                    emptyList = list;
                    size = i;
                    z5 = z;
                    zzr = z2;
                    zzx = z4;
                    zzr2 = z3;
                }
                if (zzb3.zza() == 0) {
                    zzal(arrayList);
                    zzY(false, 204, null, null, str, Collections.emptyList());
                    return;
                }
                com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
                List arrayList3 = new ArrayList();
                boolean z10 = zzi().zzx(null, zzgi.zzaP) && zza.zza() == zzmf.SGTM_CLIENT;
                if (zza.zza() != zzmf.SGTM) {
                    if (!z10) {
                        j2 = j;
                        if (zzi().zzx(null, zzgi.zzaO) || zzp().zzd()) {
                            Object zzq = !Log.isLoggable(zzaW().zzr(), 2) ? zzA().zzq(zzhvVar) : null;
                            zzA();
                            byte[] zzcd = zzhvVar.zzcd();
                            zzal(arrayList);
                            this.zzk.zze.zzb(j2);
                            zzaW().zzj().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcd.length), zzq);
                            this.zzv = true;
                            zzp().zzc(str, zza, zzhvVar, new zzpl(this, str, arrayList3));
                            return;
                        }
                        return;
                    }
                    z10 = true;
                }
                Iterator it3 = ((com.google.android.gms.internal.measurement.zzhv) zzb3.zzba()).zzh().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.zzhx) it3.next()).zzbI()) {
                            str2 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
                zzaX().zzg();
                zzM();
                com.google.android.gms.internal.measurement.zzht zzc = com.google.android.gms.internal.measurement.zzhv.zzc(zzhvVar2);
                if (!TextUtils.isEmpty(str2)) {
                    zzc.zzf(str2);
                }
                String zzm = zzr().zzm(str);
                if (!TextUtils.isEmpty(zzm)) {
                    zzc.zzg(zzm);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = zzhvVar2.zzh().iterator();
                while (it4.hasNext()) {
                    com.google.android.gms.internal.measurement.zzhw zzA = com.google.android.gms.internal.measurement.zzhx.zzA((com.google.android.gms.internal.measurement.zzhx) it4.next());
                    zzA.zzt();
                    arrayList4.add((com.google.android.gms.internal.measurement.zzhx) zzA.zzba());
                }
                zzc.zzd();
                zzc.zzb(arrayList4);
                zzam zzi = zzi();
                zzgg zzggVar = zzgi.zzaN;
                if (zzi.zzx(null, zzggVar)) {
                    zzaW().zzj().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str2) ? POBCommonConstants.NULL_VALUE : zzc.zzi());
                } else {
                    zzaW().zzj().zza("[sgtm] Processed MeasurementBatch for sGTM.");
                }
                com.google.android.gms.internal.measurement.zzhv zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzc.zzba();
                if (!TextUtils.isEmpty(str2) && zzi().zzx(null, zzggVar)) {
                    com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzb3.zzba();
                    zzaX().zzg();
                    zzM();
                    com.google.android.gms.internal.measurement.zzht zzb4 = com.google.android.gms.internal.measurement.zzhv.zzb();
                    zzaW().zzj().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", str2);
                    zzb4.zzf(str2);
                    for (com.google.android.gms.internal.measurement.zzhx zzhxVar3 : zzhvVar4.zzh()) {
                        com.google.android.gms.internal.measurement.zzhw zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                        zzz.zzY(zzhxVar3.zzN());
                        zzz.zzV(zzhxVar3.zzd());
                        zzb4.zzc(zzz);
                    }
                    com.google.android.gms.internal.measurement.zzhv zzhvVar5 = (com.google.android.gms.internal.measurement.zzhv) zzb4.zzba();
                    String zzm2 = zzpiVar.zzg.zzr().zzm(str);
                    if (TextUtils.isEmpty(zzm2)) {
                        zzphVar = new zzph((String) zzgi.zzr.zza(null), Collections.emptyMap(), z10 ? zzmf.GOOGLE_SIGNAL_PENDING : zzmf.GOOGLE_SIGNAL, null);
                    } else {
                        Uri parse = Uri.parse((String) zzgi.zzr.zza(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        buildUpon.authority(zzm2 + "." + parse.getAuthority());
                        zzphVar = new zzph(buildUpon.build().toString(), Collections.emptyMap(), z10 ? zzmf.GOOGLE_SIGNAL_PENDING : zzmf.GOOGLE_SIGNAL, null);
                    }
                    arrayList3.add(Pair.create(zzhvVar5, zzphVar));
                }
                if (!z10) {
                    j2 = j;
                    zzhvVar = zzhvVar3;
                    if (zzi().zzx(null, zzgi.zzaO)) {
                    }
                    if (!Log.isLoggable(zzaW().zzr(), 2)) {
                    }
                    zzA();
                    byte[] zzcd2 = zzhvVar.zzcd();
                    zzal(arrayList);
                    this.zzk.zze.zzb(j2);
                    zzaW().zzj().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcd2.length), zzq);
                    this.zzv = true;
                    zzp().zzc(str, zza, zzhvVar, new zzpl(this, str, arrayList3));
                    return;
                }
                com.google.android.gms.internal.measurement.zzht zzhtVar = (com.google.android.gms.internal.measurement.zzht) zzhvVar3.zzch();
                for (int i7 = 0; i7 < zzhvVar3.zza(); i7++) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzhvVar3.zze(i7).zzch();
                    zzhwVar2.zzC();
                    zzhwVar2.zzO(j);
                    zzhtVar.zze(i7, zzhwVar2);
                }
                arrayList3.add(Pair.create((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba(), zza));
                zzal(arrayList);
                zzY(false, 204, null, null, str, arrayList3);
                if (zzay(str, zza.zzc())) {
                    zzaW().zzj().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    zzaK(this.zzn.zzaT(), intent);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        int i8 = 0;
        while (true) {
            long j5 = cursor2.getLong(i2);
            try {
                byte[] blob = cursor2.getBlob(i3);
                zzqa zzA2 = zzj.zzg.zzA();
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (IOException e3) {
                    zzA2.zzu.zzaW().zze().zzb("Failed to ungzip content", e3);
                    throw e3;
                }
            } catch (IOException e4) {
                zzj.zzu.zzaW().zze().zzc("Failed to unzip queued bundle. appId", zzhe.zzn(str), e4);
            }
            if (!arrayList5.isEmpty() && byteArray.length + i8 > max) {
                break;
            }
            try {
                com.google.android.gms.internal.measurement.zzhw zzhwVar3 = (com.google.android.gms.internal.measurement.zzhw) zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), byteArray);
                if (!arrayList5.isEmpty()) {
                    com.google.android.gms.internal.measurement.zzhx zzhxVar4 = (com.google.android.gms.internal.measurement.zzhx) ((Pair) arrayList5.get(0)).first;
                    com.google.android.gms.internal.measurement.zzhx zzhxVar5 = (com.google.android.gms.internal.measurement.zzhx) zzhwVar3.zzba();
                    if (!zzhxVar4.zzK().equals(zzhxVar5.zzK()) || !zzhxVar4.zzJ().equals(zzhxVar5.zzJ()) || zzhxVar4.zzbu() != zzhxVar5.zzbu() || !zzhxVar4.zzL().equals(zzhxVar5.zzL())) {
                        break;
                    }
                    Iterator it5 = zzhxVar4.zzY().iterator();
                    while (true) {
                        j3 = -1;
                        if (!it5.hasNext()) {
                            j4 = -1;
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzio zzioVar = (com.google.android.gms.internal.measurement.zzio) it5.next();
                        if ("_npa".equals(zzioVar.zzg())) {
                            j4 = zzioVar.zzc();
                            break;
                        }
                    }
                    Iterator it6 = zzhxVar5.zzY().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzio zzioVar2 = (com.google.android.gms.internal.measurement.zzio) it6.next();
                        if ("_npa".equals(zzioVar2.zzg())) {
                            j3 = zzioVar2.zzc();
                            break;
                        }
                    }
                    if (j4 != j3) {
                        break;
                    }
                }
                if (!cursor2.isNull(2)) {
                    zzhwVar3.zzat(cursor2.getInt(2));
                }
                i8 += byteArray.length;
                arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzhx) zzhwVar3.zzba(), Long.valueOf(j5)));
            } catch (IOException e5) {
                zzj.zzu.zzaW().zze().zzc("Failed to merge queued bundle. appId", zzhe.zzn(str), e5);
            }
            if (!cursor2.moveToNext() || i8 > max) {
                break;
            }
            i2 = 0;
            i3 = 1;
        }
        cursor2.close();
        emptyList = arrayList5;
        if (emptyList.isEmpty()) {
        }
    }

    final void zzav(String str) {
        com.google.android.gms.internal.measurement.zzhv zzg;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean zzl = zzioVar.zzu().zzl();
            if (zzl == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (zzl.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzp().zzd()) {
                zzaW().zzj().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzY(str)) {
                zzpz zzw = zzj().zzw(str);
                if (zzw != null && (zzg = zzw.zzg()) != null) {
                    zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzw.zzd(), zzw.zzh());
                    byte[] zzcd = zzg.zzcd();
                    if (Log.isLoggable(zzaW().zzr(), 2)) {
                        zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcd.length), zzA().zzq(zzg));
                    }
                    this.zzv = true;
                    zzp().zzc(str, zzw.zzf(), zzg, new zzpm(this, str, zzw));
                }
            } else {
                zzaW().zzj().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th) {
            this.zzw = false;
            zzaH();
            throw th;
        }
    }

    final void zzaw(String str, com.google.android.gms.internal.measurement.zzhp zzhpVar, Bundle bundle, String str2) {
        List listOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long zzd = (zzqf.zzap(zzhpVar.zzl()) || zzqf.zzap(str)) ? zzi().zzd(str2, true) : zzi().zzc(str2, true);
        long codePointCount = zzhpVar.zzm().codePointCount(0, zzhpVar.zzm().length());
        zzqf zzB = zzB();
        String zzl = zzhpVar.zzl();
        zzi();
        String zzG = zzB.zzG(zzl, 40, true);
        if (codePointCount <= zzd || listOf.contains(zzhpVar.zzl())) {
            return;
        }
        if ("_ev".equals(zzhpVar.zzl())) {
            bundle.putString("_ev", zzB().zzG(zzhpVar.zzm(), zzi().zzd(str2, true), true));
            return;
        }
        zzaW().zzl().zzc("Param value is too long; discarded. Name, value length", zzG, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", zzG);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhpVar.zzl());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:376|(2:378|(10:380|381|382|(1:384)|57|(0)(0)|60|(0)(0)|66|67))|385|386|387|388|389|381|382|(0)|57|(0)(0)|60|(0)(0)|66|67) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:342|343|344|116|(0)|119|(0)(0)|126|(0)|129|(0)|132|(0)|135|(0)|138|(0)|141|(0)|144|(0)|149|(1:151)|339|164|(0)|167|(0)(0)|(35:171|173|(1:174)|306|188|(0)|(0)|193|(0)|196|(0)|297|220|(0)|225|(0)(0)|231|(0)|236|(0)|239|(1:240)|254|255|256|257|258|(3:259|(0)(0)|279)|265|266|267|(0)(0)|270|271|272)|307|(0)|193|(0)|196|(0)|297|220|(0)|225|(0)(0)|231|(0)|236|(0)|239|(1:240)|254|255|256|257|258|(3:259|(0)(0)|279)|265|266|267|(0)(0)|270|271|272) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:68|(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)(1:348)|88|(2:92|(1:94))|95|(2:105|106)|109|110|111|112|(3:113|114|115)|116|(1:118)|119|(2:121|(1:125)(1:124))(1:340)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(2:146|(1:148))|149|(1:339)(6:153|(1:157)|158|(1:160)(1:338)|161|(1:163)(15:309|(1:311)(1:337)|312|(1:314)(1:336)|315|(1:317)(1:335)|318|(1:320)(1:334)|321|(1:323)(1:333)|324|(1:326)(1:332)|327|(1:329)(1:331)|330))|164|(1:166)|167|(1:169)(1:308)|(12:(34:173|(4:176|(3:178|179|(3:181|182|(3:184|185|187)(1:298))(1:300))(1:305)|299|174)|306|188|(1:190)|(1:192)|193|(1:195)|196|(2:200|(4:202|(1:204)|205|(28:213|(1:215)(1:296)|216|(1:218)|219|220|(2:222|(1:224))|225|(3:227|(1:229)|230)(1:295)|231|(1:235)|236|(1:238)|239|(4:242|(2:248|249)|250|240)|254|255|256|257|258|(2:259|(2:261|(1:263)(1:279))(3:280|281|(1:286)(1:285)))|265|266|267|(1:269)(2:274|275)|270|271|272)))|297|220|(0)|225|(0)(0)|231|(2:233|235)|236|(0)|239|(1:240)|254|255|256|257|258|(3:259|(0)(0)|279)|265|266|267|(0)(0)|270|271|272)|256|257|258|(3:259|(0)(0)|279)|265|266|267|(0)(0)|270|271|272)|307|(0)|193|(0)|196|(3:198|200|(0))|297|220|(0)|225|(0)(0)|231|(0)|236|(0)|239|(1:240)|254|255) */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0a89, code lost:
    
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0b3a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0b42, code lost:
    
        r2.zzu.zzaW().zze().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r4.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0b58, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0b75, code lost:
    
        zzaW().zze().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r3.zzaF()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0295, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0297, code lost:
    
        r8.zzu.zzaW().zze().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0523 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0564 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0617 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0622 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x062d A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0638 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0644 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0655 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x067f A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0746 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x076f A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07a3 A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0804 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0814 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0837 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x084b A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0905 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x091c A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0984 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x09a5 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09c1 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a7f A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0b26 A[Catch: all -> 0x0178, SQLiteException -> 0x0b3a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0b3a, blocks: (B:267:0x0b15, B:269:0x0b26), top: B:266:0x0b15, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a8c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0774 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05d3 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0314 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x02cd A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0376 A[Catch: all -> 0x0178, TryCatch #6 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0300, B:60:0x0333, B:62:0x0376, B:64:0x037d, B:65:0x0394, B:70:0x03a1, B:72:0x03b9, B:74:0x03c0, B:75:0x03d7, B:78:0x03fb, B:82:0x041e, B:83:0x0435, B:84:0x043e, B:87:0x045d, B:88:0x0476, B:90:0x047e, B:92:0x048a, B:94:0x0490, B:95:0x0497, B:97:0x04a4, B:99:0x04ac, B:101:0x04b4, B:103:0x04bc, B:106:0x04c0, B:109:0x04cc, B:111:0x04d9, B:114:0x04fe, B:118:0x0523, B:119:0x0538, B:121:0x0564, B:124:0x057b, B:125:0x05b7, B:126:0x05df, B:128:0x0617, B:129:0x061a, B:131:0x0622, B:132:0x0625, B:134:0x062d, B:135:0x0630, B:137:0x0638, B:138:0x063b, B:140:0x0644, B:141:0x0648, B:143:0x0655, B:144:0x0658, B:146:0x067f, B:148:0x0687, B:149:0x068a, B:151:0x0699, B:153:0x06a3, B:157:0x06ba, B:161:0x06c7, B:164:0x073e, B:166:0x0746, B:167:0x0749, B:169:0x076f, B:171:0x077a, B:173:0x0783, B:174:0x079d, B:176:0x07a3, B:179:0x07b7, B:182:0x07c3, B:185:0x07d0, B:303:0x07ea, B:188:0x07fa, B:192:0x0804, B:193:0x0807, B:195:0x0814, B:196:0x0819, B:198:0x0837, B:200:0x083b, B:202:0x084b, B:204:0x0856, B:205:0x085f, B:207:0x0869, B:209:0x0875, B:211:0x087f, B:213:0x0885, B:215:0x0895, B:216:0x08a9, B:218:0x08af, B:219:0x08b8, B:220:0x08c9, B:222:0x0905, B:224:0x090f, B:225:0x0912, B:227:0x091c, B:229:0x0939, B:230:0x0944, B:231:0x097c, B:233:0x0984, B:235:0x098e, B:236:0x099b, B:238:0x09a5, B:239:0x09b2, B:240:0x09bb, B:242:0x09c1, B:244:0x09fd, B:246:0x0a07, B:248:0x0a19, B:255:0x0a1f, B:257:0x0a63, B:258:0x0a6e, B:259:0x0a79, B:261:0x0a7f, B:265:0x0aca, B:267:0x0b15, B:269:0x0b26, B:270:0x0b8a, B:275:0x0b3f, B:278:0x0b42, B:281:0x0a8c, B:283:0x0ab6, B:290:0x0b5d, B:291:0x0b74, B:294:0x0b75, B:308:0x0774, B:309:0x06d2, B:312:0x06de, B:315:0x06ec, B:318:0x06fa, B:321:0x0708, B:324:0x0716, B:327:0x0722, B:330:0x072f, B:340:0x05d3, B:344:0x050b, B:349:0x0314, B:350:0x031b, B:352:0x0321, B:355:0x032d, B:360:0x0199, B:362:0x01a3, B:364:0x01b8, B:369:0x01d8, B:372:0x020e, B:374:0x0214, B:376:0x0222, B:378:0x0232, B:380:0x0240, B:382:0x02c3, B:384:0x02cd, B:386:0x026a, B:388:0x0283, B:389:0x02aa, B:393:0x0297, B:395:0x01e4, B:397:0x0202), top: B:41:0x0157, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzax(zzbh zzbhVar, zzr zzrVar) {
        String str;
        String str2;
        long longValue;
        String str3;
        String str4;
        zzbh zzbhVar2;
        String str5;
        zzqd zzqdVar;
        zzqd zzqdVar2;
        zzbf zzbfVar;
        long j;
        long zzH;
        String str6;
        long j2;
        zzbc zzbcVar;
        String str7;
        zzbd zzs;
        zzbd zzc;
        String str8;
        com.google.android.gms.internal.measurement.zzhw zzz;
        String str9;
        String str10;
        String str11;
        long j3;
        String str12;
        long j4;
        Map emptyMap;
        ArrayList arrayList;
        String str13;
        zzjx zzl;
        zzjw zzjwVar;
        zzjx zzjxVar;
        zzjw zzjwVar2;
        String str14;
        zzio zzioVar;
        zzh zzl2;
        int i;
        List zzE;
        int i2;
        zzaw zzj;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        zzaw zzj2;
        zzbe zzbeVar;
        int i3;
        ContentValues contentValues;
        Pair zzd;
        zzh zzl3;
        String str15;
        Object obj;
        zzqd zzy;
        Preconditions.checkNotNull(zzrVar);
        String str16 = zzrVar.zza;
        Preconditions.checkNotEmpty(str16);
        long nanoTime = System.nanoTime();
        zzaX().zzg();
        zzM();
        zzA();
        if (zzqa.zzE(zzbhVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzg(zzrVar);
                return;
            }
            zzif zzr = zzr();
            String str17 = zzbhVar.zza;
            if (zzr.zzx(str16, str17)) {
                zzaW().zzk().zzc("Dropping blocked event. appId", zzhe.zzn(str16), this.zzn.zzj().zzd(str17));
                if (!zzr().zzt(str16) && !zzr().zzy(str16)) {
                    if ("_err".equals(str17)) {
                        return;
                    }
                    zzB().zzR(this.zzK, str16, 11, "_ev", str17, 0);
                    return;
                }
                zzh zzl4 = zzj().zzl(str16);
                if (zzl4 != null) {
                    long abs = Math.abs(zzaU().currentTimeMillis() - Math.max(zzl4.zzp(), zzl4.zzg()));
                    zzi();
                    if (abs > ((Long) zzgi.zzM.zza(null)).longValue()) {
                        zzaW().zzd().zza("Fetching config for blocked app");
                        zzO(zzl4);
                        return;
                    }
                    return;
                }
                return;
            }
            zzhf zzb2 = zzhf.zzb(zzbhVar);
            zzB().zzQ(zzb2, zzi().zzf(str16));
            int zzi = zzi().zzi(str16, zzgi.zzaf, 10, 35);
            Bundle bundle = zzb2.zzd;
            for (String str18 : new TreeSet(bundle.keySet())) {
                if ("items".equals(str18)) {
                    zzB().zzP(bundle.getParcelableArray(str18), zzi);
                }
            }
            zzbh zza = zzb2.zza();
            if (Log.isLoggable(zzaW().zzr(), 2)) {
                zzaW().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
            }
            zzj().zzH();
            try {
                zzg(zzrVar);
                String str19 = zza.zza;
                boolean z = "ecommerce_purchase".equals(str19) || "purchase".equals(str19) || "refund".equals(str19);
                if (!"_iap".equals(str19)) {
                    if (!z) {
                        str3 = "value";
                        str = "app_id";
                        str2 = "_fx";
                        str4 = "raw_events";
                        zzbhVar2 = zza;
                        str5 = "_err";
                        String str20 = zzbhVar2.zza;
                        boolean zzaq = zzqf.zzaq(str20);
                        boolean equals = str5.equals(str20);
                        zzB();
                        zzbfVar = zzbhVar2.zzb;
                        if (zzbfVar != null) {
                            j = 0;
                        } else {
                            zzbe zzbeVar2 = new zzbe(zzbfVar);
                            j = 0;
                            while (zzbeVar2.hasNext()) {
                                if (zzbfVar.zzf(zzbeVar2.next()) instanceof Parcelable[]) {
                                    j += ((Parcelable[]) r11).length;
                                }
                            }
                        }
                        zzbh zzbhVar3 = zzbhVar2;
                        zzas zzp = zzj().zzp(zza(), str16, j + 1, true, zzaq, false, equals, false, false, false);
                        long j5 = zzp.zzb;
                        zzi();
                        zzH = j5 - zzam.zzH();
                        if (zzH <= 0) {
                            if (zzH % 1000 == 1) {
                                zzaW().zze().zzc("Data loss. Too many events logged. appId, count", zzhe.zzn(str16), Long.valueOf(zzp.zzb));
                            }
                            zzj().zzS();
                        } else {
                            if (zzaq) {
                                long j6 = zzp.zza;
                                zzi();
                                long intValue = j6 - ((Integer) zzgi.zzm.zza(null)).intValue();
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        zzaW().zze().zzc("Data loss. Too many public events logged. appId, count", zzhe.zzn(str16), Long.valueOf(zzp.zza));
                                    }
                                    zzB().zzR(this.zzK, str16, 16, "_ev", zzbhVar3.zza, 0);
                                    zzj().zzS();
                                }
                            }
                            if (equals) {
                                long max = zzp.zzd - Math.max(0, Math.min(1000000, zzi().zzh(zzrVar.zza, zzgi.zzl)));
                                if (max > 0) {
                                    if (max == 1) {
                                        zzaW().zze().zzc("Too many error events logged. appId, count", zzhe.zzn(str16), Long.valueOf(zzp.zzd));
                                    }
                                    zzj().zzS();
                                }
                            }
                            Bundle zzc2 = zzbfVar.zzc();
                            zzqf zzB = zzB();
                            String str21 = zzbhVar3.zzc;
                            zzB.zzS(zzc2, "_o", str21);
                            if (zzB().zzak(str16, zzrVar.zzD)) {
                                zzB().zzS(zzc2, "_dbg", 1L);
                                zzB().zzS(zzc2, "_r", 1L);
                            }
                            if ("_s".equals(str20) && (zzy = zzj().zzy(zzrVar.zza, "_sno")) != null) {
                                Object obj2 = zzy.zze;
                                if (obj2 instanceof Long) {
                                    zzB().zzS(zzc2, "_sno", obj2);
                                }
                            }
                            if (zzi().zzx(null, zzgi.zzbg) && Objects.equals(str21, "am") && Objects.equals(str20, "_ai") && (obj = zzc2.get((str15 = str3))) != null && (obj instanceof String)) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj);
                                    zzc2.remove(str15);
                                    zzc2.putDouble(str15, parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            zzaw zzj3 = zzj();
                            Preconditions.checkNotEmpty(str16);
                            zzj3.zzg();
                            zzj3.zzav();
                            try {
                                str6 = str4;
                            } catch (SQLiteException e) {
                                e = e;
                                str6 = str4;
                            }
                            try {
                                j2 = zzj3.zzj().delete(str6, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str16, String.valueOf(Math.max(0, Math.min(1000000, zzj3.zzu.zzf().zzh(str16, zzgi.zzp))))});
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzj3.zzu.zzaW().zze().zzc("Error deleting over the limit events. appId", zzhe.zzn(str16), e);
                                j2 = 0;
                                if (j2 > 0) {
                                }
                                zzio zzioVar2 = this.zzn;
                                str7 = str6;
                                zzbcVar = new zzbc(zzioVar2, zzbhVar3.zzc, str16, zzbhVar3.zza, zzbhVar3.zzd, 0L, zzc2);
                                zzaw zzj4 = zzj();
                                String str22 = zzbcVar.zzb;
                                zzs = zzj4.zzs(str16, str22);
                                if (zzs == null) {
                                }
                                zzj().zzV(zzc);
                                zzaX().zzg();
                                zzM();
                                Preconditions.checkNotNull(zzbcVar);
                                Preconditions.checkNotNull(zzrVar);
                                String str23 = zzbcVar.zza;
                                Preconditions.checkNotEmpty(str23);
                                str8 = zzrVar.zza;
                                Preconditions.checkArgument(str23.equals(str8));
                                zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                                boolean z2 = true;
                                zzz.zzar(1);
                                zzz.zzan("android");
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                str9 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                str10 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str10)) {
                                }
                                str11 = zzrVar.zzw;
                                if (!TextUtils.isEmpty(str11)) {
                                }
                                j3 = zzrVar.zzj;
                                if (j3 != -2147483648L) {
                                }
                                zzz.zzai(zzrVar.zze);
                                str12 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str12)) {
                                }
                                zzjx zzl5 = zzu((String) Preconditions.checkNotNull(str8)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                zzz.zzT(zzl5.zzp());
                                if (zzz.zzaJ().isEmpty()) {
                                }
                                zzqr.zzb();
                                if (!zzi().zzx(str8, zzgi.zzaV)) {
                                }
                                j4 = zzrVar.zzf;
                                if (j4 != 0) {
                                }
                                zzz.zzZ(zzrVar.zzr);
                                zzqa zzA = zzA();
                                com.google.android.gms.internal.measurement.zzjm zza2 = com.google.android.gms.internal.measurement.zzjm.zza(zzA.zzg.zzn.zzaT().getContentResolver(), com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.google.android.gms.internal.measurement.zzki.zzc();
                                    }
                                });
                                if (zza2 != null) {
                                }
                                if (emptyMap != null) {
                                    arrayList = new ArrayList();
                                    int intValue2 = ((Integer) zzgi.zzae.zza(null)).intValue();
                                    while (r6.hasNext()) {
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                    }
                                    if (zzi().zzx(null, zzgi.zzbk)) {
                                    }
                                    str13 = zzrVar.zza;
                                    zzl = zzu((String) Preconditions.checkNotNull(str13)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                    zzjwVar = zzjw.AD_STORAGE;
                                    if (zzl.zzr(zzjwVar)) {
                                    }
                                    zzjxVar = zzl;
                                    zzjwVar2 = zzjwVar;
                                    str14 = "_r";
                                    zzioVar = this.zzn;
                                    zzioVar.zzg().zzv();
                                    zzz.zzX(Build.MODEL);
                                    zzioVar.zzg().zzv();
                                    zzz.zzam(Build.VERSION.RELEASE);
                                    zzz.zzaz((int) zzioVar.zzg().zza());
                                    zzz.zzaD(zzioVar.zzg().zzb());
                                    zzz.zzay(zzrVar.zzy);
                                    if (zzioVar.zzJ()) {
                                    }
                                    zzl2 = zzj().zzl(str13);
                                    if (zzl2 == null) {
                                    }
                                    if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(zzl2.zzG())) {
                                    }
                                    zzE = zzj().zzE(str13);
                                    while (i2 < zzE.size()) {
                                    }
                                    zzj = zzj();
                                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                    zzj.zzg();
                                    zzj.zzav();
                                    Preconditions.checkNotNull(zzhxVar);
                                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                                    byte[] zzcd = zzhxVar.zzcd();
                                    long zzf = zzj.zzg.zzA().zzf(zzcd);
                                    ContentValues contentValues2 = new ContentValues();
                                    String str24 = str;
                                    contentValues2.put(str24, zzhxVar.zzF());
                                    contentValues2.put("metadata_fingerprint", Long.valueOf(zzf));
                                    contentValues2.put("metadata", zzcd);
                                    zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    zzj2 = zzj();
                                    zzbeVar = new zzbe(zzbcVar.zzf);
                                    while (true) {
                                        if (zzbeVar.hasNext()) {
                                        }
                                    }
                                    zzj2.zzg();
                                    zzj2.zzav();
                                    Preconditions.checkNotNull(zzbcVar);
                                    String str25 = zzbcVar.zza;
                                    Preconditions.checkNotEmpty(str25);
                                    byte[] zzcd2 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                    contentValues = new ContentValues();
                                    contentValues.put(str24, str25);
                                    contentValues.put("name", zzbcVar.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzf));
                                    contentValues.put("data", zzcd2);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (zzj2.zzj().insert(str7, null, contentValues) == -1) {
                                    }
                                    zzj().zzS();
                                    zzj().zzL();
                                    zzaL();
                                    zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                }
                                if (zzi().zzx(null, zzgi.zzbk)) {
                                }
                                str13 = zzrVar.zza;
                                zzl = zzu((String) Preconditions.checkNotNull(str13)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                zzjwVar = zzjw.AD_STORAGE;
                                if (zzl.zzr(zzjwVar)) {
                                }
                                zzjxVar = zzl;
                                zzjwVar2 = zzjwVar;
                                str14 = "_r";
                                zzioVar = this.zzn;
                                zzioVar.zzg().zzv();
                                zzz.zzX(Build.MODEL);
                                zzioVar.zzg().zzv();
                                zzz.zzam(Build.VERSION.RELEASE);
                                zzz.zzaz((int) zzioVar.zzg().zza());
                                zzz.zzaD(zzioVar.zzg().zzb());
                                zzz.zzay(zzrVar.zzy);
                                if (zzioVar.zzJ()) {
                                }
                                zzl2 = zzj().zzl(str13);
                                if (zzl2 == null) {
                                }
                                if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                }
                                if (!TextUtils.isEmpty(zzl2.zzG())) {
                                }
                                zzE = zzj().zzE(str13);
                                while (i2 < zzE.size()) {
                                }
                                zzj = zzj();
                                zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                zzj.zzg();
                                zzj.zzav();
                                Preconditions.checkNotNull(zzhxVar);
                                Preconditions.checkNotEmpty(zzhxVar.zzF());
                                byte[] zzcd3 = zzhxVar.zzcd();
                                long zzf2 = zzj.zzg.zzA().zzf(zzcd3);
                                ContentValues contentValues22 = new ContentValues();
                                String str242 = str;
                                contentValues22.put(str242, zzhxVar.zzF());
                                contentValues22.put("metadata_fingerprint", Long.valueOf(zzf2));
                                contentValues22.put("metadata", zzcd3);
                                zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                zzj2 = zzj();
                                zzbeVar = new zzbe(zzbcVar.zzf);
                                while (true) {
                                    if (zzbeVar.hasNext()) {
                                    }
                                }
                                zzj2.zzg();
                                zzj2.zzav();
                                Preconditions.checkNotNull(zzbcVar);
                                String str252 = zzbcVar.zza;
                                Preconditions.checkNotEmpty(str252);
                                byte[] zzcd22 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                contentValues = new ContentValues();
                                contentValues.put(str242, str252);
                                contentValues.put("name", zzbcVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(zzf2));
                                contentValues.put("data", zzcd22);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (zzj2.zzj().insert(str7, null, contentValues) == -1) {
                                }
                                zzj().zzS();
                                zzj().zzL();
                                zzaL();
                                zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            }
                            if (j2 > 0) {
                                zzaW().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzhe.zzn(str16), Long.valueOf(j2));
                            }
                            zzio zzioVar22 = this.zzn;
                            str7 = str6;
                            zzbcVar = new zzbc(zzioVar22, zzbhVar3.zzc, str16, zzbhVar3.zza, zzbhVar3.zzd, 0L, zzc2);
                            zzaw zzj42 = zzj();
                            String str222 = zzbcVar.zzb;
                            zzs = zzj42.zzs(str16, str222);
                            if (zzs == null) {
                                zzbcVar = zzbcVar.zza(zzioVar22, zzs.zzf);
                                zzc = zzs.zzc(zzbcVar.zzd);
                            } else if (zzj().zzi(str16) < zzi().zzb(str16) || !zzaq) {
                                zzc = new zzbd(str16, str222, 0L, 0L, 0L, zzbcVar.zzd, 0L, null, null, null, null);
                            } else {
                                zzaW().zze().zzd("Too many event names used, ignoring event. appId, name, supported count", zzhe.zzn(str16), zzioVar22.zzj().zzd(str222), Integer.valueOf(zzi().zzb(str16)));
                                zzB().zzR(this.zzK, str16, 8, null, null, 0);
                            }
                            zzj().zzV(zzc);
                            zzaX().zzg();
                            zzM();
                            Preconditions.checkNotNull(zzbcVar);
                            Preconditions.checkNotNull(zzrVar);
                            String str232 = zzbcVar.zza;
                            Preconditions.checkNotEmpty(str232);
                            str8 = zzrVar.zza;
                            Preconditions.checkArgument(str232.equals(str8));
                            zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                            boolean z22 = true;
                            zzz.zzar(1);
                            zzz.zzan("android");
                            if (!TextUtils.isEmpty(str8)) {
                                zzz.zzI(str8);
                            }
                            str9 = zzrVar.zzd;
                            if (!TextUtils.isEmpty(str9)) {
                                zzz.zzK(str9);
                            }
                            str10 = zzrVar.zzc;
                            if (!TextUtils.isEmpty(str10)) {
                                zzz.zzL(str10);
                            }
                            str11 = zzrVar.zzw;
                            if (!TextUtils.isEmpty(str11)) {
                                zzz.zzav(str11);
                            }
                            j3 = zzrVar.zzj;
                            if (j3 != -2147483648L) {
                                zzz.zzM((int) j3);
                            }
                            zzz.zzai(zzrVar.zze);
                            str12 = zzrVar.zzb;
                            if (!TextUtils.isEmpty(str12)) {
                                zzz.zzah(str12);
                            }
                            zzjx zzl52 = zzu((String) Preconditions.checkNotNull(str8)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                            zzz.zzT(zzl52.zzp());
                            if (zzz.zzaJ().isEmpty()) {
                                String str26 = zzrVar.zzp;
                                if (!TextUtils.isEmpty(str26)) {
                                    zzz.zzH(str26);
                                }
                            }
                            zzqr.zzb();
                            if (!zzi().zzx(str8, zzgi.zzaV) && zzB().zzab(str8)) {
                                zzz.zzG(zzrVar.zzB);
                                long j7 = zzrVar.zzC;
                                if (!zzl52.zzr(zzjw.AD_STORAGE) && j7 != 0) {
                                    j7 = (j7 & (-2)) | 32;
                                }
                                zzz.zzaa(j7 == 1);
                                if (j7 != 0) {
                                    com.google.android.gms.internal.measurement.zzhf zza3 = com.google.android.gms.internal.measurement.zzhg.zza();
                                    if ((j7 & 1) == 0) {
                                        z22 = false;
                                    }
                                    zza3.zzc(z22);
                                    zza3.zze((j7 & 2) != 0);
                                    zza3.zzf((j7 & 4) != 0);
                                    zza3.zzg((j7 & 8) != 0);
                                    zza3.zzb((j7 & 16) != 0);
                                    zza3.zza((j7 & 32) != 0);
                                    zza3.zzd((64 & j7) != 0);
                                    zzz.zzN((com.google.android.gms.internal.measurement.zzhg) zza3.zzba());
                                }
                            }
                            j4 = zzrVar.zzf;
                            if (j4 != 0) {
                                zzz.zzW(j4);
                            }
                            zzz.zzZ(zzrVar.zzr);
                            zzqa zzA2 = zzA();
                            com.google.android.gms.internal.measurement.zzjm zza22 = com.google.android.gms.internal.measurement.zzjm.zza(zzA2.zzg.zzn.zzaT().getContentResolver(), com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.android.gms.internal.measurement.zzki.zzc();
                                }
                            });
                            emptyMap = zza22 != null ? Collections.emptyMap() : zza22.zzd();
                            try {
                                if (emptyMap != null && !emptyMap.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue22 = ((Integer) zzgi.zzae.zza(null)).intValue();
                                    for (Map.Entry entry : emptyMap.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue22) {
                                                        zzA2.zzu.zzaW().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e3) {
                                                zzA2.zzu.zzaW().zzk().zzb("Experiment ID NumberFormatException", e3);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                        zzz.zzk(arrayList);
                                    }
                                    if (zzi().zzx(null, zzgi.zzbk)) {
                                        zzz.zzaf("");
                                    }
                                    str13 = zzrVar.zza;
                                    zzl = zzu((String) Preconditions.checkNotNull(str13)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                                    zzjwVar = zzjw.AD_STORAGE;
                                    if (zzl.zzr(zzjwVar) && zzrVar.zzn) {
                                        zzd = this.zzk.zzd(str13, zzl);
                                        if (!TextUtils.isEmpty((CharSequence) zzd.first)) {
                                            zzz.zzas((String) zzd.first);
                                            Object obj3 = zzd.second;
                                            if (obj3 != null) {
                                                zzz.zzal(((Boolean) obj3).booleanValue());
                                            }
                                            String str27 = str2;
                                            if (!zzbcVar.zzb.equals(str27) && !((String) zzd.first).equals(MobileFuseDefaults.ADVERTISING_ID_ZEROS) && (zzl3 = zzj().zzl(str13)) != null && zzl3.zzaM()) {
                                                zzar(str13, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                Long zzy2 = zzl3.zzy();
                                                if (zzy2 != null) {
                                                    long longValue2 = zzy2.longValue();
                                                    zzjxVar = zzl;
                                                    zzjwVar2 = zzjwVar;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    zzjxVar = zzl;
                                                    zzjwVar2 = zzjwVar;
                                                }
                                                Long zzz2 = zzl3.zzz();
                                                if (zzz2 != null) {
                                                    bundle2.putLong("_uwa", zzz2.longValue());
                                                }
                                                str14 = "_r";
                                                bundle2.putLong(str14, 1L);
                                                this.zzK.zza(str13, str27, bundle2);
                                                zzioVar = this.zzn;
                                                zzioVar.zzg().zzv();
                                                zzz.zzX(Build.MODEL);
                                                zzioVar.zzg().zzv();
                                                zzz.zzam(Build.VERSION.RELEASE);
                                                zzz.zzaz((int) zzioVar.zzg().zza());
                                                zzz.zzaD(zzioVar.zzg().zzb());
                                                zzz.zzay(zzrVar.zzy);
                                                if (zzioVar.zzJ()) {
                                                    zzz.zzaF();
                                                    if (!TextUtils.isEmpty(null)) {
                                                        zzz.zzY(null);
                                                    }
                                                }
                                                zzl2 = zzj().zzl(str13);
                                                if (zzl2 == null) {
                                                    zzl2 = new zzh(zzioVar, str13);
                                                    zzl2.zzV(zzC(zzjxVar));
                                                    zzl2.zzan(zzrVar.zzk);
                                                    zzl2.zzao(zzrVar.zzb);
                                                    if (zzjxVar.zzr(zzjwVar2)) {
                                                        zzl2.zzax(this.zzk.zzf(str13, zzrVar.zzn));
                                                    }
                                                    zzl2.zzat(0L);
                                                    zzl2.zzau(0L);
                                                    zzl2.zzas(0L);
                                                    zzl2.zzX(zzrVar.zzc);
                                                    zzl2.zzY(zzrVar.zzj);
                                                    zzl2.zzW(zzrVar.zzd);
                                                    zzl2.zzap(zzrVar.zze);
                                                    zzl2.zzaj(zzrVar.zzf);
                                                    zzl2.zzav(zzrVar.zzh);
                                                    zzl2.zzal(zzrVar.zzr);
                                                    i = 0;
                                                    zzj().zzT(zzl2, false, false);
                                                } else {
                                                    i = 0;
                                                }
                                                if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzl2.zzD())) {
                                                    zzz.zzJ((String) Preconditions.checkNotNull(zzl2.zzD()));
                                                }
                                                if (!TextUtils.isEmpty(zzl2.zzG())) {
                                                    zzz.zzag((String) Preconditions.checkNotNull(zzl2.zzG()));
                                                }
                                                zzE = zzj().zzE(str13);
                                                for (i2 = i; i2 < zzE.size(); i2++) {
                                                    com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
                                                    zze.zzf(((zzqd) zzE.get(i2)).zzc);
                                                    zze.zzg(((zzqd) zzE.get(i2)).zzd);
                                                    zzA().zzx(zze, ((zzqd) zzE.get(i2)).zze);
                                                    zzz.zzo(zze);
                                                    if ("_sid".equals(((zzqd) zzE.get(i2)).zzc) && zzl2.zzv() != 0 && zzA().zzd(zzrVar.zzw) != zzl2.zzv()) {
                                                        zzz.zzA();
                                                    }
                                                }
                                                zzj = zzj();
                                                zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                                zzj.zzg();
                                                zzj.zzav();
                                                Preconditions.checkNotNull(zzhxVar);
                                                Preconditions.checkNotEmpty(zzhxVar.zzF());
                                                byte[] zzcd32 = zzhxVar.zzcd();
                                                long zzf22 = zzj.zzg.zzA().zzf(zzcd32);
                                                ContentValues contentValues222 = new ContentValues();
                                                String str2422 = str;
                                                contentValues222.put(str2422, zzhxVar.zzF());
                                                contentValues222.put("metadata_fingerprint", Long.valueOf(zzf22));
                                                contentValues222.put("metadata", zzcd32);
                                                zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                                zzj2 = zzj();
                                                zzbeVar = new zzbe(zzbcVar.zzf);
                                                while (true) {
                                                    if (zzbeVar.hasNext()) {
                                                        if (str14.equals(zzbeVar.next())) {
                                                            break;
                                                        }
                                                    } else {
                                                        zzif zzr2 = zzr();
                                                        String str28 = zzbcVar.zza;
                                                        boolean zzw = zzr2.zzw(str28, zzbcVar.zzb);
                                                        zzas zzo = zzj().zzo(zza(), str28, false, false, false, false, false, false, false);
                                                        if (!zzw || zzo.zze >= zzi().zzh(str28, zzgi.zzo)) {
                                                            i3 = 0;
                                                        }
                                                    }
                                                }
                                                zzj2.zzg();
                                                zzj2.zzav();
                                                Preconditions.checkNotNull(zzbcVar);
                                                String str2522 = zzbcVar.zza;
                                                Preconditions.checkNotEmpty(str2522);
                                                byte[] zzcd222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                                contentValues = new ContentValues();
                                                contentValues.put(str2422, str2522);
                                                contentValues.put("name", zzbcVar.zzb);
                                                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(zzf22));
                                                contentValues.put("data", zzcd222);
                                                contentValues.put("realtime", Integer.valueOf(i3));
                                                if (zzj2.zzj().insert(str7, null, contentValues) == -1) {
                                                    zzj2.zzu.zzaW().zze().zzb("Failed to insert raw event (got -1). appId", zzhe.zzn(str2522));
                                                } else {
                                                    this.zza = 0L;
                                                }
                                                zzj().zzS();
                                                zzj().zzL();
                                                zzaL();
                                                zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    zzjxVar = zzl;
                                    zzjwVar2 = zzjwVar;
                                    str14 = "_r";
                                    zzioVar = this.zzn;
                                    zzioVar.zzg().zzv();
                                    zzz.zzX(Build.MODEL);
                                    zzioVar.zzg().zzv();
                                    zzz.zzam(Build.VERSION.RELEASE);
                                    zzz.zzaz((int) zzioVar.zzg().zza());
                                    zzz.zzaD(zzioVar.zzg().zzb());
                                    zzz.zzay(zzrVar.zzy);
                                    if (zzioVar.zzJ()) {
                                    }
                                    zzl2 = zzj().zzl(str13);
                                    if (zzl2 == null) {
                                    }
                                    if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                                        zzz.zzJ((String) Preconditions.checkNotNull(zzl2.zzD()));
                                    }
                                    if (!TextUtils.isEmpty(zzl2.zzG())) {
                                    }
                                    zzE = zzj().zzE(str13);
                                    while (i2 < zzE.size()) {
                                    }
                                    zzj = zzj();
                                    zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                                    zzj.zzg();
                                    zzj.zzav();
                                    Preconditions.checkNotNull(zzhxVar);
                                    Preconditions.checkNotEmpty(zzhxVar.zzF());
                                    byte[] zzcd322 = zzhxVar.zzcd();
                                    long zzf222 = zzj.zzg.zzA().zzf(zzcd322);
                                    ContentValues contentValues2222 = new ContentValues();
                                    String str24222 = str;
                                    contentValues2222.put(str24222, zzhxVar.zzF());
                                    contentValues2222.put("metadata_fingerprint", Long.valueOf(zzf222));
                                    contentValues2222.put("metadata", zzcd322);
                                    zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                    zzj2 = zzj();
                                    zzbeVar = new zzbe(zzbcVar.zzf);
                                    while (true) {
                                        if (zzbeVar.hasNext()) {
                                        }
                                    }
                                    zzj2.zzg();
                                    zzj2.zzav();
                                    Preconditions.checkNotNull(zzbcVar);
                                    String str25222 = zzbcVar.zza;
                                    Preconditions.checkNotEmpty(str25222);
                                    byte[] zzcd2222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                    contentValues = new ContentValues();
                                    contentValues.put(str24222, str25222);
                                    contentValues.put("name", zzbcVar.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzf222));
                                    contentValues.put("data", zzcd2222);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (zzj2.zzj().insert(str7, null, contentValues) == -1) {
                                    }
                                    zzj().zzS();
                                    zzj().zzL();
                                    zzaL();
                                    zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                                zzj.zzj().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                zzj2 = zzj();
                                zzbeVar = new zzbe(zzbcVar.zzf);
                                while (true) {
                                    if (zzbeVar.hasNext()) {
                                    }
                                }
                                zzj2.zzg();
                                zzj2.zzav();
                                Preconditions.checkNotNull(zzbcVar);
                                String str252222 = zzbcVar.zza;
                                Preconditions.checkNotEmpty(str252222);
                                byte[] zzcd22222 = zzj2.zzg.zzA().zzm(zzbcVar).zzcd();
                                contentValues = new ContentValues();
                                contentValues.put(str24222, str252222);
                                contentValues.put("name", zzbcVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(zzf222));
                                contentValues.put("data", zzcd22222);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (zzj2.zzj().insert(str7, null, contentValues) == -1) {
                                }
                                zzj().zzS();
                                zzj().zzL();
                                zzaL();
                                zzaW().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            } catch (SQLiteException e4) {
                                zzj.zzu.zzaW().zze().zzc("Error storing raw event metadata. appId", zzhe.zzn(zzhxVar.zzF()), e4);
                                throw e4;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            if (zzi().zzx(null, zzgi.zzbk)) {
                            }
                            str13 = zzrVar.zza;
                            zzl = zzu((String) Preconditions.checkNotNull(str13)).zzl(zzjx.zzk(zzrVar.zzu, 100));
                            zzjwVar = zzjw.AD_STORAGE;
                            if (zzl.zzr(zzjwVar)) {
                                zzd = this.zzk.zzd(str13, zzl);
                                if (!TextUtils.isEmpty((CharSequence) zzd.first)) {
                                }
                            }
                            zzjxVar = zzl;
                            zzjwVar2 = zzjwVar;
                            str14 = "_r";
                            zzioVar = this.zzn;
                            zzioVar.zzg().zzv();
                            zzz.zzX(Build.MODEL);
                            zzioVar.zzg().zzv();
                            zzz.zzam(Build.VERSION.RELEASE);
                            zzz.zzaz((int) zzioVar.zzg().zza());
                            zzz.zzaD(zzioVar.zzg().zzb());
                            zzz.zzay(zzrVar.zzy);
                            if (zzioVar.zzJ()) {
                            }
                            zzl2 = zzj().zzl(str13);
                            if (zzl2 == null) {
                            }
                            if (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(zzl2.zzG())) {
                            }
                            zzE = zzj().zzE(str13);
                            while (i2 < zzE.size()) {
                            }
                            zzj = zzj();
                            zzhxVar = (com.google.android.gms.internal.measurement.zzhx) zzz.zzba();
                            zzj.zzg();
                            zzj.zzav();
                            Preconditions.checkNotNull(zzhxVar);
                            Preconditions.checkNotEmpty(zzhxVar.zzF());
                            byte[] zzcd3222 = zzhxVar.zzcd();
                            long zzf2222 = zzj.zzg.zzA().zzf(zzcd3222);
                            ContentValues contentValues22222 = new ContentValues();
                            String str242222 = str;
                            contentValues22222.put(str242222, zzhxVar.zzF());
                            contentValues22222.put("metadata_fingerprint", Long.valueOf(zzf2222));
                            contentValues22222.put("metadata", zzcd3222);
                        }
                        zzj().zzL();
                    }
                    z = true;
                }
                zzbf zzbfVar2 = zza.zzb;
                String zzg = zzbfVar2.zzg("currency");
                if (z) {
                    double doubleValue = zzbfVar2.zzd("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        str = "app_id";
                        str2 = "_fx";
                        doubleValue = zzbfVar2.zze("value").longValue() * 1000000.0d;
                    } else {
                        str = "app_id";
                        str2 = "_fx";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        zzaW().zzk().zzc("Data lost. Currency value is too big. appId", zzhe.zzn(str16), Double.valueOf(doubleValue));
                        zzj().zzS();
                        zzj().zzL();
                    } else {
                        longValue = Math.round(doubleValue);
                        if ("refund".equals(str19)) {
                            longValue = -longValue;
                        }
                    }
                } else {
                    str = "app_id";
                    str2 = "_fx";
                    longValue = zzbfVar2.zze("value").longValue();
                }
                if (!TextUtils.isEmpty(zzg)) {
                    String upperCase = zzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        zzqd zzy3 = zzj().zzy(str16, concat);
                        if (zzy3 != null) {
                            Object obj4 = zzy3.zze;
                            if (obj4 instanceof Long) {
                                str4 = "raw_events";
                                zzbhVar2 = zza;
                                str3 = "value";
                                str5 = "_err";
                                zzqdVar = new zzqd(str16, zza.zzc, concat, zzaU().currentTimeMillis(), Long.valueOf(((Long) obj4).longValue() + longValue));
                                zzqdVar2 = zzqdVar;
                                if (!zzj().zzai(zzqdVar2)) {
                                    zzaW().zze().zzd("Too many unique user properties are set. Ignoring user property. appId", zzhe.zzn(str16), this.zzn.zzj().zzf(zzqdVar2.zzc), zzqdVar2.zze);
                                    zzB().zzR(this.zzK, str16, 9, null, null, 0);
                                }
                                String str202 = zzbhVar2.zza;
                                boolean zzaq2 = zzqf.zzaq(str202);
                                boolean equals2 = str5.equals(str202);
                                zzB();
                                zzbfVar = zzbhVar2.zzb;
                                if (zzbfVar != null) {
                                }
                                zzbh zzbhVar32 = zzbhVar2;
                                zzas zzp2 = zzj().zzp(zza(), str16, j + 1, true, zzaq2, false, equals2, false, false, false);
                                long j52 = zzp2.zzb;
                                zzi();
                                zzH = j52 - zzam.zzH();
                                if (zzH <= 0) {
                                }
                                zzj().zzL();
                            }
                        }
                        str3 = "value";
                        str4 = "raw_events";
                        zzbhVar2 = zza;
                        str5 = "_err";
                        zzaw zzj5 = zzj();
                        int zzh = zzi().zzh(str16, zzgi.zzS) - 1;
                        Preconditions.checkNotEmpty(str16);
                        zzj5.zzg();
                        zzj5.zzav();
                        zzj5.zzj().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str16, str16, String.valueOf(zzh)});
                        zzqdVar = new zzqd(str16, zzbhVar2.zzc, concat, zzaU().currentTimeMillis(), Long.valueOf(longValue));
                        zzqdVar2 = zzqdVar;
                        if (!zzj().zzai(zzqdVar2)) {
                        }
                        String str2022 = zzbhVar2.zza;
                        boolean zzaq22 = zzqf.zzaq(str2022);
                        boolean equals22 = str5.equals(str2022);
                        zzB();
                        zzbfVar = zzbhVar2.zzb;
                        if (zzbfVar != null) {
                        }
                        zzbh zzbhVar322 = zzbhVar2;
                        zzas zzp22 = zzj().zzp(zza(), str16, j + 1, true, zzaq22, false, equals22, false, false, false);
                        long j522 = zzp22.zzb;
                        zzi();
                        zzH = j522 - zzam.zzH();
                        if (zzH <= 0) {
                        }
                        zzj().zzL();
                    }
                }
                str3 = "value";
                str4 = "raw_events";
                zzbhVar2 = zza;
                str5 = "_err";
                String str20222 = zzbhVar2.zza;
                boolean zzaq222 = zzqf.zzaq(str20222);
                boolean equals222 = str5.equals(str20222);
                zzB();
                zzbfVar = zzbhVar2.zzb;
                if (zzbfVar != null) {
                }
                zzbh zzbhVar3222 = zzbhVar2;
                zzas zzp222 = zzj().zzp(zza(), str16, j + 1, true, zzaq222, false, equals222, false, false, false);
                long j5222 = zzp222.zzb;
                zzi();
                zzH = j5222 - zzam.zzH();
                if (zzH <= 0) {
                }
                zzj().zzL();
            } catch (Throwable th) {
                zzj().zzL();
                throw th;
            }
        }
    }

    final boolean zzay(String str, String str2) {
        zzh zzl = zzj().zzl(str);
        if (zzl != null && zzB().zzak(str, zzl.zzM())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpt zzptVar = (zzpt) this.zzF.get(str2);
        if (zzptVar == null) {
            return true;
        }
        return zzptVar.zzc();
    }

    final boolean zzaz() {
        zzaX().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaW().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzf();
        File filesDir = this.zzn.zzaT().getFilesDir();
        com.google.android.gms.internal.measurement.zzbx.zza();
        int i = com.google.android.gms.internal.measurement.zzcc.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock tryLock = channel.tryLock();
            this.zzx = tryLock;
            if (tryLock != null) {
                zzaW().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaW().zze().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaW().zze().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaW().zze().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaW().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle zzd(String str) {
        zzaX().zzg();
        zzM();
        if (zzr().zzi(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjx zzu = zzu(str);
        bundle.putAll(zzu.zzc());
        bundle.putAll(zzl(str, zzm(str), zzu, new zzao()).zzb());
        zzqd zzy = zzj().zzy(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzy != null ? zzy.zze.equals(1L) : zzaC(str, new zzao())) ? "granted" : "denied");
        return bundle;
    }

    final Bundle zzf(String str, zzbh zzbhVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.zzb.zze("_sid").longValue());
        zzqd zzy = zzj().zzy(str, "_sno");
        if (zzy != null) {
            Object obj = zzy.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f0, code lost:
    
        if (r11 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzh zzg(zzr zzrVar) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str5 = zzrVar.zza;
        Preconditions.checkNotEmpty(str5);
        String str6 = zzrVar.zzv;
        zzpu zzpuVar = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new zzps(this, str6));
        }
        zzh zzl = zzj().zzl(str5);
        zzjx zzl2 = zzu(str5).zzl(zzjx.zzk(zzrVar.zzu, 100));
        zzjw zzjwVar = zzjw.AD_STORAGE;
        String zzf = zzl2.zzr(zzjwVar) ? this.zzk.zzf(str5, zzrVar.zzn) : "";
        boolean z2 = true;
        if (zzl == null) {
            zzh zzhVar = new zzh(this.zzn, str5);
            if (zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                zzhVar.zzV(zzC(zzl2));
            }
            if (zzl2.zzr(zzjwVar)) {
                zzhVar.zzax(zzf);
            }
            zzl = zzhVar;
        } else if (zzl2.zzr(zzjwVar) && zzf != null && !zzf.equals(zzl.zzJ())) {
            boolean isEmpty = TextUtils.isEmpty(zzl.zzJ());
            zzl.zzax(zzf);
            if (zzrVar.zzn && !MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(this.zzk.zzd(str5, zzl2).first) && !isEmpty) {
                if (zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                    zzl.zzV(zzC(zzl2));
                    z = false;
                } else {
                    z = true;
                }
                if (zzj().zzy(str5, "_id") != null && zzj().zzy(str5, "_lair") == null) {
                    zzj().zzai(new zzqd(str5, "auto", "_lair", zzaU().currentTimeMillis(), 1L));
                }
                zzl.zzao(zzrVar.zzb);
                zzl.zzS(zzrVar.zzp);
                str = zzrVar.zzk;
                if (!TextUtils.isEmpty(str)) {
                    zzl.zzan(str);
                }
                j = zzrVar.zze;
                if (j != 0) {
                    zzl.zzap(j);
                }
                str2 = zzrVar.zzc;
                if (!TextUtils.isEmpty(str2)) {
                    zzl.zzX(str2);
                }
                zzl.zzY(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzl.zzW(str3);
                }
                zzl.zzaj(zzrVar.zzf);
                zzl.zzav(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!TextUtils.isEmpty(str4)) {
                    zzl.zzaq(str4);
                }
                zzl.zzU(zzrVar.zzn);
                zzl.zzaw(zzrVar.zzq);
                zzl.zzal(zzrVar.zzr);
                zzl.zzaA(zzrVar.zzw);
                com.google.android.gms.internal.measurement.zzpn.zzb();
                if (zzi().zzx(null, zzgi.zzaK)) {
                    com.google.android.gms.internal.measurement.zzpn.zzb();
                    if (zzi().zzx(null, zzgi.zzaJ)) {
                        zzl.zzay(null);
                    }
                } else {
                    zzl.zzay(zzrVar.zzs);
                }
                zzl.zzaD(zzrVar.zzx);
                zzl.zzaC(zzrVar.zzD);
                zzqr.zzb();
                if (zzi().zzx(null, zzgi.zzaV)) {
                    zzl.zzT(zzrVar.zzB);
                }
                zzl.zzaE(zzrVar.zzy);
                zzl.zzaz(zzrVar.zzE);
                if (zzi().zzx(null, zzgi.zzaP)) {
                    zzl.zzaa(zzrVar.zzG);
                }
                if (!zzl.zzaK()) {
                    z2 = z;
                }
                zzj().zzT(zzl, z2, false);
                return zzl;
            }
            if (TextUtils.isEmpty(zzl.zzD()) && zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
                zzl.zzV(zzC(zzl2));
            }
        } else if (TextUtils.isEmpty(zzl.zzD()) && zzl2.zzr(zzjw.ANALYTICS_STORAGE)) {
            zzl.zzV(zzC(zzl2));
        }
        z = false;
        zzl.zzao(zzrVar.zzb);
        zzl.zzS(zzrVar.zzp);
        str = zzrVar.zzk;
        if (!TextUtils.isEmpty(str)) {
        }
        j = zzrVar.zze;
        if (j != 0) {
        }
        str2 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str2)) {
        }
        zzl.zzY(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
        }
        zzl.zzaj(zzrVar.zzf);
        zzl.zzav(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str4)) {
        }
        zzl.zzU(zzrVar.zzn);
        zzl.zzaw(zzrVar.zzq);
        zzl.zzal(zzrVar.zzr);
        zzl.zzaA(zzrVar.zzw);
        com.google.android.gms.internal.measurement.zzpn.zzb();
        if (zzi().zzx(null, zzgi.zzaK)) {
        }
        zzl.zzaD(zzrVar.zzx);
        zzl.zzaC(zzrVar.zzD);
        zzqr.zzb();
        if (zzi().zzx(null, zzgi.zzaV)) {
        }
        zzl.zzaE(zzrVar.zzy);
        zzl.zzaz(zzrVar.zzE);
        if (zzi().zzx(null, zzgi.zzaP)) {
        }
        if (!zzl.zzaK()) {
        }
        zzj().zzT(zzl, z2, false);
        return zzl;
    }

    public final zzae zzh() {
        zzae zzaeVar = this.zzh;
        zzaR(zzaeVar);
        return zzaeVar;
    }

    public final zzam zzi() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzaw zzj() {
        zzaw zzawVar = this.zze;
        zzaR(zzawVar);
        return zzawVar;
    }

    final zzba zzl(String str, zzba zzbaVar, zzjx zzjxVar, zzao zzaoVar) {
        zzju zzjuVar;
        int i = 90;
        if (zzr().zzi(str) == null) {
            if (zzbaVar.zzf() == zzju.DENIED) {
                i = zzbaVar.zza();
                zzaoVar.zzc(zzjw.AD_USER_DATA, i);
            } else {
                zzaoVar.zzd(zzjw.AD_USER_DATA, zzan.FAILSAFE);
            }
            return new zzba(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        zzju zzf = zzbaVar.zzf();
        zzju zzjuVar2 = zzju.GRANTED;
        if (zzf == zzjuVar2 || zzf == (zzjuVar = zzju.DENIED)) {
            i = zzbaVar.zza();
            zzaoVar.zzc(zzjw.AD_USER_DATA, i);
        } else {
            if (zzf == zzju.POLICY) {
                zzif zzifVar = this.zzc;
                zzjw zzjwVar = zzjw.AD_USER_DATA;
                zzju zzf2 = zzifVar.zzf(str, zzjwVar);
                if (zzf2 != zzju.UNINITIALIZED) {
                    zzaoVar.zzd(zzjwVar, zzan.REMOTE_ENFORCED_DEFAULT);
                    zzf = zzf2;
                }
            }
            zzif zzifVar2 = this.zzc;
            zzjw zzjwVar2 = zzjw.AD_USER_DATA;
            zzjw zzh = zzifVar2.zzh(str, zzjwVar2);
            zzju zze = zzjxVar.zze();
            boolean z = zze == zzjuVar2 || zze == zzjuVar;
            if (zzh == zzjw.AD_STORAGE && z) {
                zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DELEGATION);
                zzf = zze;
            } else {
                zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DEFAULT);
                zzf = true != zzifVar2.zzu(str, zzjwVar2) ? zzjuVar : zzjuVar2;
            }
        }
        boolean zzv = this.zzc.zzv(str);
        SortedSet zzp = zzr().zzp(str);
        if (zzf == zzju.DENIED || zzp.isEmpty()) {
            return new zzba(Boolean.FALSE, i, Boolean.valueOf(zzv), "-");
        }
        return new zzba(Boolean.TRUE, i, Boolean.valueOf(zzv), zzv ? TextUtils.join("", zzp) : "");
    }

    final zzba zzm(String str) {
        zzaX().zzg();
        zzM();
        Map map = this.zzD;
        zzba zzbaVar = (zzba) map.get(str);
        if (zzbaVar != null) {
            return zzbaVar;
        }
        zzba zzq = zzj().zzq(str);
        map.put(str, zzq);
        return zzq;
    }

    public final zzgx zzo() {
        return this.zzn.zzj();
    }

    public final zzhk zzp() {
        zzhk zzhkVar = this.zzd;
        zzaR(zzhkVar);
        return zzhkVar;
    }

    public final zzhm zzq() {
        zzhm zzhmVar = this.zzf;
        if (zzhmVar != null) {
            return zzhmVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzif zzr() {
        zzif zzifVar = this.zzc;
        zzaR(zzifVar);
        return zzifVar;
    }

    final zzio zzt() {
        return this.zzn;
    }

    final zzjx zzu(String str) {
        zzjx zzjxVar = zzjx.zza;
        zzaX().zzg();
        zzM();
        zzjx zzjxVar2 = (zzjx) this.zzC.get(str);
        if (zzjxVar2 == null) {
            zzjxVar2 = zzj().zzu(str);
            if (zzjxVar2 == null) {
                zzjxVar2 = zzjx.zza;
            }
            zzaq(str, zzjxVar2);
        }
        return zzjxVar2;
    }

    public final zzmc zzv() {
        zzmc zzmcVar = this.zzj;
        zzaR(zzmcVar);
        return zzmcVar;
    }

    public final zzoa zzw() {
        return this.zzk;
    }

    public final zzoy zzx() {
        zzoy zzoyVar = this.zzg;
        zzaR(zzoyVar);
        return zzoyVar;
    }

    public final zzpi zzy() {
        return this.zzl;
    }
}
