package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0986 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f2356 = new HashMap();

    public C0986(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            this.f2356.put(AbstractC0471.m4008(str), (AbstractC0544) hashMap.get(str));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0986.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f2356;
        HashMap hashMap2 = ((C0986) obj).f2356;
        return hashMap != null ? hashMap.equals(hashMap2) : hashMap2 == null;
    }

    public final int hashCode() {
        HashMap hashMap = this.f2356;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (this.f2356.isEmpty()) {
            return StringFog.decrypt("5jE=\n", "nUyrl0Kqv7k=\n");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("/48=\n", "hK+q8mveY6s=\n"));
        boolean z = true;
        for (String str : this.f2356.keySet()) {
            if (!z) {
                sb.append(StringFog.decrypt("5sg=\n", "yuhDqKYSCYw=\n"));
            }
            sb.append(StringFog.decrypt("qQ==\n", "iyVmzzsl9SU=\n"));
            sb.append(str);
            sb.append(StringFog.decrypt("9Z/S\n", "16XybEr2FXE=\n"));
            sb.append(this.f2356.get(str));
            z = false;
        }
        sb.append(StringFog.decrypt("P5s=\n", "H+ZZFGpLPuU=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (String str : this.f2356.keySet()) {
            C0954 m4041 = ((AbstractC0544) this.f2356.get(str)).m4041(c0785, c0880);
            try {
                jsonObjectInit.put(str, m4041.f2276);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("LNvmpj8Tqjsd3f2nKhOzLQbHtL8sX6w7SQ==\n", "aamUyU0z2V4=\n"));
                sb.append(m4041.f2276);
                new C1262(c0880, c0785, AbstractC0584.m4083("oo42m5KZS3Ci\n", "guhZ6bLyLgk=\n", sb, str), null).m4002(c0880.m4231());
            }
        }
        return new C0954(jsonObjectInit);
    }
}
