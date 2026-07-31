package yads;

import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes14.dex */
public abstract class kg2 {
    public static final String[] a(SSLSocketFactory sSLSocketFactory) {
        int i = lg2.$r8$clinit;
        String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final String[] b(SSLSocketFactory sSLSocketFactory) {
        int i = lg2.$r8$clinit;
        String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
