package sg.bigo.ads.dc;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes4.dex */
public final class d {
    public final Map<String, String> a = new ConcurrentHashMap();
    public final String b;

    public d(@NonNull String str) {
        this.b = str;
    }

    public final void a(String str, int i) {
        this.a.put(str, String.valueOf(i));
    }

    public final void a(String str, long j) {
        this.a.put(str, String.valueOf(j));
    }

    public final void a(String str, String str2) {
        if (r.a((CharSequence) str) || r.a((CharSequence) str2)) {
            return;
        }
        this.a.put(str, str2);
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.a.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("eventId = ");
        sb.append(this.b);
        sb.append(":");
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append(StringUtils.COMMA);
        }
        return sb.toString();
    }
}
