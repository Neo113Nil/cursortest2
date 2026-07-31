package sg.bigo.ads.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes15.dex */
public final class f {
    public static Signature a(Context context, String str) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                return signatureArr[0];
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            String name = ((X509Certificate) CertificateFactory.getInstance(sg.bigo.ads.a.a.as).generateCertificate(new ByteArrayInputStream(bArr))).getSubjectX500Principal().getName();
            int indexOf = name.indexOf(sg.bigo.ads.a.a.at);
            return indexOf == -1 ? name : name.substring(indexOf);
        } catch (Exception unused) {
            return "";
        }
    }
}
