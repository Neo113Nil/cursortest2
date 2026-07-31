package yads;

import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class ax2 extends Lambda implements Function0 {
    public static final ax2 b = new ax2();

    public ax2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        X509TrustManager a = q93.a(null);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
