package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider;
import com.google.android.gms.dynamite.DynamiteModule;
import com.ironsource.C4538a2;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes13.dex */
public class PackageSignatureVerifier {

    @Nullable
    @VisibleForTesting
    static volatile zzac zza;

    @Nullable
    private static zzad zzb;

    private static synchronized zzad zza(Context context) {
        zzad zzadVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new zzad(context);
                }
                zzadVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadVar;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        int i = zzo.zzh;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
                if (zzo.zzg.zzi()) {
                    SignatureVerificationConfigurationProvider.zza().zza();
                    String concat = String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : C4538a2.f);
                    if (zza != null && zza.zza().equals(concat)) {
                        return zza.zzb();
                    }
                    str.isEmpty();
                    zza(context);
                    zzv zzvVar = new zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(honorsDebugCertificates);
                    zzvVar.zzc(false);
                    zzy zzc = zzo.zzc(zzvVar.zzd());
                    if (zzc.zza) {
                        PackageVerificationResult zzd = PackageVerificationResult.zzd(str, zzc.zzd, null);
                        zza = new zzac(concat, zzd);
                        return zzd;
                    }
                    String str2 = zzc.zzb;
                    Preconditions.checkNotNull(str2);
                    return PackageVerificationResult.zza(str, str2, zzc.zzc, null);
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        }
        throw new zzae();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzc();
            return queryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!queryPackageSignatureVerified2.zzb()) {
                return queryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return queryPackageSignatureVerified2;
        }
    }
}
