package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.models.Participant;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzawl extends zzaxl {
    private static final zzaxm zzh = new zzaxm();
    private final zzarp zzi;
    private final Context zzj;
    private final zzatr zzk;

    public zzawl(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2, Context context, zzari zzariVar, zzarp zzarpVar, zzatr zzatrVar) {
        super(zzavxVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", zzarwVar, i, 27);
        this.zzj = context;
        this.zzi = zzarpVar;
        this.zzk = zzatrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzato zzc() throws IllegalAccessException, InvocationTargetException {
        int zzb;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcY)).booleanValue()) {
            zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzde)).intValue();
        } else {
            zzb = this.zzi.zzb();
        }
        zzato zzatoVar = new zzato((String) this.zze.invoke(null, this.zzj, false, ""));
        zzatr zzatrVar = this.zzk;
        if (zzatrVar != null && zzatrVar.zza() != null) {
            try {
                str = (String) zzatrVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzatoVar.zza = str;
            return zzatoVar;
        }
        str = ExifInterface.LONGITUDE_EAST;
        zzatoVar.zza = str;
        return zzatoVar;
    }

    private final String zzd() {
        try {
            zzavx zzavxVar = this.zza;
            if (zzavxVar.zzm() != null) {
                zzavxVar.zzm().get();
            }
            zzast zzl = zzavxVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzato zzatoVar;
        zzato zzatoVar2;
        zzaxm zzaxmVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzaxmVar.zza(context.getPackageName());
        synchronized (zza) {
            zzato zzatoVar3 = (zzato) zza.get();
            if (zzatoVar3 == null || zzawa.zzc(zzatoVar3.zza) || zzatoVar3.zza.equals(ExifInterface.LONGITUDE_EAST) || zzatoVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (zzawa.zzc(null)) {
                    (!zzawa.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzatoVar = zzc();
                } else {
                    if (i == 3 && !this.zzi.zza()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcM);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcL)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzawa.zzc(zzb)) {
                        zzb = zzd();
                    }
                    zzato zzatoVar4 = new zzato((String) this.zze.invoke(null, context, valueOf, zzb));
                    if (zzawa.zzc(zzatoVar4.zza) || zzatoVar4.zza.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzawa.zzc(zzd)) {
                                zzatoVar4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzatoVar = zzatoVar4;
                }
                zza.set(zzatoVar);
            }
            zzatoVar2 = (zzato) zza.get();
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            if (zzatoVar2 != null) {
                zzarwVar.zzo(zzatoVar2.zza);
                zzarwVar.zzu(zzatoVar2.zzb);
                zzarwVar.zzt(zzatoVar2.zzc);
                zzarwVar.zzD(zzatoVar2.zzd);
                zzarwVar.zzE(zzatoVar2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzb = zzawa.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcN));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals(Participant.USER_TYPE)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawa.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcO)))));
            }
            Context context = this.zzj;
            return zzaxo.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
