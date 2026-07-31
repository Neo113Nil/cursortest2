package io.grpc.okhttp.internal;

import com.revenuecat.purchases.common.Constants;
import java.io.UnsupportedEncodingException;
import okio.ByteString;
import org.apache.commons.codec.CharEncoding;

/* loaded from: classes8.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            return "Basic " + ByteString.of((str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2).getBytes(CharEncoding.ISO_8859_1)).base64();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
