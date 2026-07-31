package yads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.cert.CertificateFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class io3 extends Lambda implements Function0 {
    public static final io3 b = new io3();

    public io3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
    }
}
