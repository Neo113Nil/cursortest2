package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class D3 {
    public final Context a;
    public final C5621qf b;
    public final String c;
    public final SafePackageManager d;

    public D3(Context context, C5621qf c5621qf, String str, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = c5621qf;
        this.c = str;
        this.d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> g = this.b.g();
        boolean isEmpty = g.isEmpty();
        List<String> list = g;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.d.getPackageInfo(this.a, this.c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.d.getPackageInfo(this.a, this.c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.b.a(arrayList).a.flushAsync();
                list = arrayList;
            }
        }
        return list;
    }
}
