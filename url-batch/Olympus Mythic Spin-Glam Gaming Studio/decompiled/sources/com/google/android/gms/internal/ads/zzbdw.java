package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdw {
    public static String zza(Context context, String str, List list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhdr zze = zzhdr.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdv
            public final /* synthetic */ void onChecksumsReady(List list2) {
                int type;
                byte[] value;
                zzhdr zzhdrVar = zzhdr.this;
                if (list2 == null) {
                    zzhdrVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum m = zzazy$$ExternalSyntheticApiModelOutline0.m(list2.get(i));
                        type = m.getType();
                        if (type == 8) {
                            value = m.getValue();
                            zzhdrVar.zza(zzbcj.zza(value));
                            return;
                        }
                    }
                    zzhdrVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhdrVar.zza((Object) null);
                }
            }
        });
        return (String) zze.get();
    }
}
