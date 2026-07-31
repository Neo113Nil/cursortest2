package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes14.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzd;
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean zza(PackageInfo packageInfo, boolean z) {
        SigningInfo signingInfo;
        zzah zzj;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            zzah zzahVar = z ? zzn.zzc : zzn.zzb;
            int i = AndroidUtilsLight.zza;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] bArr = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    bArr = signatureArr[0].toByteArray();
                }
                zzj = bArr != null ? zzah.zzk(bArr) : zzah.zzj();
            } else {
                com.google.android.gms.internal.common.zzr.zza(i2 >= 28);
                signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    if (!hasMultipleSigners) {
                        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        if (signingCertificateHistory != null) {
                            int i3 = zzah.zzd;
                            com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                            signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                            for (Signature signature : signingCertificateHistory2) {
                                zzadVar.zzb(signature.toByteArray());
                            }
                            zzj = zzadVar.zzd();
                        }
                    }
                }
                zzj = zzah.zzj();
            }
            if (zzj.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah zzh = zzj.zzh();
            int size = zzh.size();
            int i4 = 0;
            while (i4 < size) {
                byte[] bArr2 = (byte[]) zzh.get(i4);
                zzal listIterator = zzahVar.listIterator(0);
                do {
                    int i5 = i4 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z ? zzc(packageInfo, zzn.zza) : zzc(packageInfo, zzn.zza[0])) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzy zzb(String str, boolean z, boolean z2) {
        zzy zzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i = zzo.zzh;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        }
        try {
            if (zzo.zzg.zzg()) {
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                zzvVar.zzc(true);
                zzc = zzo.zzc(zzvVar.zzd());
                if (zzc.zza) {
                    this.zzc = str;
                }
                return zzc;
            }
            PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, allowThreadDiskReads >= 28 ? 134217792 : 64);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (packageInfo == null) {
                zzc = zzy.zzc("null pkg");
            } else {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    zzc = zzy.zzc("single cert required");
                } else {
                    zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    zzy zzd2 = zzo.zzd(str2, zzkVar, honorsDebugCertificates, false);
                    zzc = (!zzd2.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).zza) ? zzd2 : zzy.zzc("debuggable release cert app rejected");
                }
            }
            if (zzc.zza) {
            }
            return zzc;
        } catch (PackageManager.NameNotFoundException e2) {
            return zzy.zzd("no pkg ".concat(str), e2);
        }
        allowThreadDiskReads = Build.VERSION.SDK_INT;
    }

    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzy zzb = zzb(str, false, false);
        zzb.zze();
        return zzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzy zzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
                zzc = zzb(packagesForUid[i2], false, false);
                if (zzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzc = zzy.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
