package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p93 extends Lambda implements Function0 {
    public static final p93 b = new p93();

    public p93() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        try {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            return null;
        }
    }
}
