package com.inmobi.media;

import android.util.SparseArray;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.pubmatic.sdk.video.POBVastError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4069i6 {
    public static final C4017g6 b;
    public static final SparseArray c;
    public static final EnumC4069i6 d;
    public static final EnumC4069i6 e;
    public static final EnumC4069i6 f;
    public static final EnumC4069i6 g;
    public static final EnumC4069i6 h;
    public static final EnumC4069i6 i;
    public static final EnumC4069i6 j;
    public static final EnumC4069i6 k;
    public static final EnumC4069i6 l;
    public static final EnumC4069i6 m;
    public static final EnumC4069i6 n;
    public static final EnumC4069i6 o;
    public static final EnumC4069i6 p;
    public static final EnumC4069i6 q;
    public static final EnumC4069i6 r;
    public static final EnumC4069i6 s;
    public static final EnumC4069i6 t;
    public static final /* synthetic */ EnumC4069i6[] u;
    public final int a;

    static {
        EnumC4069i6 enumC4069i6 = new EnumC4069i6(0, 0, "NETWORK_UNAVAILABLE_ERROR");
        EnumC4069i6 enumC4069i62 = new EnumC4069i6(1, 199, "UNKNOWN_ERROR");
        d = enumC4069i62;
        EnumC4069i6 enumC4069i63 = new EnumC4069i6(2, 198, "NETWORK_IO_ERROR");
        e = enumC4069i63;
        EnumC4069i6 enumC4069i64 = new EnumC4069i6(3, 197, "OUT_OF_MEMORY_ERROR");
        EnumC4069i6 enumC4069i65 = new EnumC4069i6(4, 196, "INVALID_ENCRYPTED_RESPONSE_RECEIVED");
        EnumC4069i6 enumC4069i66 = new EnumC4069i6(5, 195, "RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT");
        EnumC4069i6 enumC4069i67 = new EnumC4069i6(6, 194, "GZIP_DECOMPRESSION_FAILED");
        EnumC4069i6 enumC4069i68 = new EnumC4069i6(7, 193, "BAD_REQUEST");
        f = enumC4069i68;
        EnumC4069i6 enumC4069i69 = new EnumC4069i6(8, 192, "GDPR_COMPLIANCE_ENFORCED");
        EnumC4069i6 enumC4069i610 = new EnumC4069i6(9, 191, "GENERIC_HTTP_2XX");
        g = enumC4069i610;
        EnumC4069i6 enumC4069i611 = new EnumC4069i6(10, FacebookRequestErrorClassification.EC_INVALID_TOKEN, "RESPONSE_PARSING_ERROR");
        EnumC4069i6 enumC4069i612 = new EnumC4069i6(11, 189, "RETRY_ATTEMPTED");
        EnumC4069i6 enumC4069i613 = new EnumC4069i6(12, 188, "NETWORK_UNAVAILABLE_CONTEXT_LOSS");
        h = enumC4069i613;
        EnumC4069i6 enumC4069i614 = new EnumC4069i6(13, 187, "NETWORK_UNAVAILABLE_IDLE_MODE");
        i = enumC4069i614;
        EnumC4069i6 enumC4069i615 = new EnumC4069i6(14, 186, "NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE");
        j = enumC4069i615;
        EnumC4069i6 enumC4069i616 = new EnumC4069i6(15, 185, "NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M");
        k = enumC4069i616;
        EnumC4069i6 enumC4069i617 = new EnumC4069i6(16, 184, "NETWORK_UNAVAILABLE_EXCEPTION");
        l = enumC4069i617;
        EnumC4069i6 enumC4069i618 = new EnumC4069i6(17, 183, "NETWORK_PREPARE_FAIL");
        m = enumC4069i618;
        EnumC4069i6 enumC4069i619 = new EnumC4069i6(18, 181, "NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR");
        EnumC4069i6 enumC4069i620 = new EnumC4069i6(19, 180, "NETWORK_REQUEST_CANCELLED");
        n = enumC4069i620;
        EnumC4069i6 enumC4069i621 = new EnumC4069i6(20, 179, "NETWORK_REQUEST_EXCEPTION");
        EnumC4069i6 enumC4069i622 = new EnumC4069i6(21, 182, "NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR");
        o = enumC4069i622;
        EnumC4069i6 enumC4069i623 = new EnumC4069i6(22, 178, "NETWORK_REDIRECT_MALFORMED");
        p = enumC4069i623;
        EnumC4069i6 enumC4069i624 = new EnumC4069i6(23, 177, "NO_SUCH_ELEMENT_EXCEPTION");
        q = enumC4069i624;
        EnumC4069i6 enumC4069i625 = new EnumC4069i6(24, 176, "COROUTINE_TIMEOUT");
        r = enumC4069i625;
        EnumC4069i6 enumC4069i626 = new EnumC4069i6(25, 175, "INVALID_URL");
        s = enumC4069i626;
        EnumC4069i6 enumC4069i627 = new EnumC4069i6(26, 204, "HTTP_NO_CONTENT");
        EnumC4069i6 enumC4069i628 = new EnumC4069i6(27, 304, "HTTP_NOT_MODIFIED");
        EnumC4069i6 enumC4069i629 = new EnumC4069i6(28, POBVastError.NO_VAST_RESPONSE, "HTTP_SEE_OTHER");
        EnumC4069i6 enumC4069i630 = new EnumC4069i6(29, 404, "HTTP_SERVER_NOT_FOUND");
        EnumC4069i6 enumC4069i631 = new EnumC4069i6(30, 302, "HTTP_MOVED_TEMP");
        EnumC4069i6 enumC4069i632 = new EnumC4069i6(31, 500, "HTTP_INTERNAL_SERVER_ERROR");
        EnumC4069i6 enumC4069i633 = new EnumC4069i6(32, 501, "HTTP_NOT_IMPLEMENTED");
        EnumC4069i6 enumC4069i634 = new EnumC4069i6(33, 502, "HTTP_BAD_GATEWAY");
        EnumC4069i6 enumC4069i635 = new EnumC4069i6(34, 503, "HTTP_SERVER_NOT_AVAILABLE");
        EnumC4069i6 enumC4069i636 = new EnumC4069i6(35, 504, "HTTP_GATEWAY_TIMEOUT");
        t = enumC4069i636;
        EnumC4069i6[] enumC4069i6Arr = {enumC4069i6, enumC4069i62, enumC4069i63, enumC4069i64, enumC4069i65, enumC4069i66, enumC4069i67, enumC4069i68, enumC4069i69, enumC4069i610, enumC4069i611, enumC4069i612, enumC4069i613, enumC4069i614, enumC4069i615, enumC4069i616, enumC4069i617, enumC4069i618, enumC4069i619, enumC4069i620, enumC4069i621, enumC4069i622, enumC4069i623, enumC4069i624, enumC4069i625, enumC4069i626, enumC4069i627, enumC4069i628, enumC4069i629, enumC4069i630, enumC4069i631, enumC4069i632, enumC4069i633, enumC4069i634, enumC4069i635, enumC4069i636, new EnumC4069i6(36, 505, "HTTP_VERSION_NOT_SUPPORTED"), new EnumC4069i6(37, 401, "HTTP_UNAUTHORISED"), new EnumC4069i6(38, CommonGatewayClient.CODE_599, "SERVER_ERROR_END_CODE")};
        u = enumC4069i6Arr;
        EnumEntries<EnumC4069i6> enumEntries = EnumEntriesKt.enumEntries(enumC4069i6Arr);
        b = new C4017g6();
        c = new SparseArray();
        for (EnumC4069i6 enumC4069i637 : enumEntries) {
            c.put(enumC4069i637.a, enumC4069i637);
        }
    }

    public EnumC4069i6(int i2, int i3, String str) {
        this.a = i3;
    }

    public static EnumC4069i6 valueOf(String str) {
        return (EnumC4069i6) Enum.valueOf(EnumC4069i6.class, str);
    }

    public static EnumC4069i6[] values() {
        return (EnumC4069i6[]) u.clone();
    }
}
