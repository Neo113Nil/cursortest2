package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaqs extends zzarq {
    private static final zzarr zzi = new zzarr();
    private final Context zzj;

    public zzaqs(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2, Context context, zzamd zzamdVar) {
        super(zzaqeVar, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", zzamkVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzana zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzanq zzanqVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzanq zzanqVar2 = (zzanq) zza.get();
            if (zzanqVar2 == null || zzaqh.zzg(zzanqVar2.zza) || zzanqVar2.zza.equals("E") || zzanqVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzaqh.zzg(null)) {
                    i = ((!zzaqh.zzg(null) ? false : false).booleanValue() && this.zzb.zzp()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbY);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbX)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzaqh.zzg(zzb)) {
                    zzb = zzc();
                }
                zzanq zzanqVar3 = new zzanq((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzaqh.zzg(zzanqVar3.zza) || zzanqVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzaqh.zzg(zzc)) {
                            zzanqVar3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzanqVar3);
            }
            zzanqVar = (zzanq) zza.get();
        }
        synchronized (this.zze) {
            if (zzanqVar != null) {
                this.zze.zzx(zzanqVar.zza);
                this.zze.zzX(zzanqVar.zzb);
                this.zze.zzZ(zzanqVar.zzc);
                this.zze.zzi(zzanqVar.zzd);
                this.zze.zzw(zzanqVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzaqh.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbZ));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzaqh.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzca)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzfzy zzf = zzfzy.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzars
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzfzy zzfzyVar = zzfzy.this;
                    if (list == null) {
                        zzfzyVar.zzd(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzfzyVar.zzd(zzaqh.zzc(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzfzyVar.zzd(null);
                    } catch (Throwable unused) {
                        zzfzyVar.zzd(null);
                    }
                }
            });
            return (String) zzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
