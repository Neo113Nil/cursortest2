package com.google.android.gms.measurement.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes5.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzgi(zzic zzicVar, long j, long j2) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzf() {
        String str;
        String str2;
        PackageInfo packageInfo;
        int zzC;
        List zzs;
        String zza;
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar.zzaY().getPackageName();
        PackageManager packageManager = zzicVar.zzaY().getPackageManager();
        String str3 = "";
        int i = Integer.MIN_VALUE;
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String str5 = "unknown";
        if (packageManager == null) {
            zzicVar.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    zzic zzicVar2 = this.zzu;
                    zzC = zzicVar2.zzC();
                    if (zzC == 0) {
                    }
                    this.zzl = "";
                    zzic zzicVar3 = this.zzu;
                    zzicVar3.zzaU();
                    zza = zzlt.zza(zzicVar3.zzaY(), "google_app_id", zzicVar2.zzq());
                    if (!TextUtils.isEmpty(zza)) {
                    }
                    this.zzl = str3;
                    if (zzC == 0) {
                    }
                    this.zzi = null;
                    zzic zzicVar4 = this.zzu;
                    zzicVar4.zzaU();
                    zzs = zzicVar4.zzc().zzs("analytics.safelisted_events");
                    if (zzs != null) {
                    }
                    this.zzi = zzs;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                zzic zzicVar22 = this.zzu;
                zzC = zzicVar22.zzC();
                if (zzC == 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (zzC == 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (zzC == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (zzC == 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (zzC == 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (zzC == 7) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (zzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaV().zzi().zza("App measurement disabled");
                    zzicVar5.zzaV().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                zzic zzicVar32 = this.zzu;
                zzicVar32.zzaU();
                zza = zzlt.zza(zzicVar32.zzaY(), "google_app_id", zzicVar22.zzq());
                if (!TextUtils.isEmpty(zza)) {
                    str3 = zza;
                }
                this.zzl = str3;
                if (zzC == 0) {
                    zzicVar32.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzic zzicVar42 = this.zzu;
                zzicVar42.zzaU();
                zzs = zzicVar42.zzc().zzs("analytics.safelisted_events");
                if (zzs != null) {
                    if (zzs.isEmpty()) {
                        zzicVar42.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzs.iterator();
                        while (it.hasNext()) {
                            if (!zzicVar42.zzk().zzk("safelisted event", (String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzk = InstantApps.isInstantApp(zzicVar42.zzaY()) ? 1 : 0;
                        return;
                    } else {
                        this.zzk = 0;
                        return;
                    }
                }
                this.zzi = zzs;
                if (packageManager == null) {
                }
            }
        }
        str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        zzic zzicVar222 = this.zzu;
        zzC = zzicVar222.zzC();
        if (zzC == 0) {
        }
        this.zzl = "";
        zzic zzicVar322 = this.zzu;
        zzicVar322.zzaU();
        zza = zzlt.zza(zzicVar322.zzaY(), "google_app_id", zzicVar222.zzq());
        if (!TextUtils.isEmpty(zza)) {
        }
        this.zzl = str3;
        if (zzC == 0) {
        }
        this.zzi = null;
        zzic zzicVar422 = this.zzu;
        zzicVar422.zzaU();
        zzs = zzicVar422.zzc().zzs("analytics.safelisted_events");
        if (zzs != null) {
        }
        this.zzi = zzs;
        if (packageManager == null) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0150: MOVE (r21v1 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x017b: MOVE (r21v2 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0155: MOVE (r21v3 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x00fd: MOVE (r21v6 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final com.google.android.gms.measurement.internal.zzr zzh(java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgi.zzh(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    final void zzi() {
        String format;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzicVar.zzaV().zzj().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzk;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
