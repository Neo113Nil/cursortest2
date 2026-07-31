package com.mbridge.msdk.config.component.common.express.operator;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: OperatorUrl.java */
/* loaded from: classes13.dex */
public class t {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public t(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:17:0x002e, B:19:0x003a, B:21:0x0046, B:23:0x0052, B:25:0x005b, B:27:0x0067, B:29:0x0070, B:33:0x0084, B:35:0x0080, B:36:0x0089, B:40:0x009d, B:42:0x0099, B:43:0x00a2, B:47:0x00b6, B:49:0x00b2, B:50:0x00bb, B:52:0x00c7, B:54:0x00d0, B:56:0x00dc, B:58:0x00e5, B:62:0x0118, B:64:0x00f5, B:65:0x011d), top: B:16:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:17:0x002e, B:19:0x003a, B:21:0x0046, B:23:0x0052, B:25:0x005b, B:27:0x0067, B:29:0x0070, B:33:0x0084, B:35:0x0080, B:36:0x0089, B:40:0x009d, B:42:0x0099, B:43:0x00a2, B:47:0x00b6, B:49:0x00b2, B:50:0x00bb, B:52:0x00c7, B:54:0x00d0, B:56:0x00dc, B:58:0x00e5, B:62:0x0118, B:64:0x00f5, B:65:0x011d), top: B:16:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Uri uri;
        String str2;
        if (obj != null && !(obj instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (obj == null) {
            obj = "";
        }
        try {
        } catch (Exception e) {
            q0.b("UrlOperator", e.getMessage());
        }
        try {
            if (!TextUtils.isEmpty(obj.toString())) {
                uri = Uri.parse(obj.toString());
                if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("822"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("823"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("824"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri, list));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("884"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getHost());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("885"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getScheme());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("825"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getQuery());
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("826"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("827"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri));
                }
                if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
                }
                if (uri == null) {
                    str2 = null;
                } else {
                    str2 = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str2);
            }
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("822"))) {
            }
        } catch (Exception e2) {
            q0.b("UrlOperator", e2.getMessage(), e2);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        uri = null;
    }

    private Object c(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && list.size() == 2) {
            String valueOf = String.valueOf(list.get(0));
            String valueOf2 = String.valueOf(list.get(1));
            if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2)) {
                Map<String, String> a = a(uri);
                a.put(valueOf, valueOf2);
                buildUpon.clearQuery();
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return buildUpon.build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String valueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(valueOf)) {
                return buildUpon.authority(valueOf).build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    private Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String str : query.split(X3.j.c)) {
                String[] split = str.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("822")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("823")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("824")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("884")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("885")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("825")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("826")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("827")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"));
    }

    private Object b(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String valueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(valueOf)) {
                Map<String, String> a = a(uri);
                a.remove(valueOf.trim());
                buildUpon.clearQuery();
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return buildUpon.build().toString();
            }
        }
        return buildUpon.build().toString();
    }

    private Object b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            String[] split = query.split(X3.j.c);
            if (split.length > 0) {
                return Arrays.asList(split);
            }
        }
        return null;
    }
}
