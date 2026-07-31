package org.chromium.base;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public abstract class PackageUtils {
    private static final char[] HEX_CHAR_LOOKUP = "0123456789ABCDEF".toCharArray();

    public static PackageInfo getPackageInfo(String str, int i) {
        try {
            return ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }
        return packageInfo.versionCode;
    }

    public static String computeCertSignatureSha256ForPackage(String str) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        Signature[] signingCertificateHistory;
        PackageInfo packageInfo = getPackageInfo(str, 134217728);
        if (packageInfo != null) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                signingInfo2 = packageInfo.signingInfo;
                signingCertificateHistory = signingInfo2.getSigningCertificateHistory();
                if (signingCertificateHistory != null && signingCertificateHistory.length != 0) {
                    try {
                        return byteArrayToHexString(MessageDigest.getInstance("SHA-256").digest(signingCertificateHistory[signingCertificateHistory.length - 1].toByteArray()));
                    } catch (NoSuchAlgorithmException e) {
                        Log.w("PackageUtils", "Unable to hash host app signature", (Throwable) e);
                    }
                }
            }
        }
        return null;
    }

    static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder((bArr.length * 3) - 1);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_CHAR_LOOKUP;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }
}
