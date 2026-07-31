package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.ironsource.X3;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Xg extends AbstractC5208ah {
    public Xg(C5532n5 c5532n5) {
        super(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        String value = c5326f6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            Po po = this.a.t;
            synchronized (po) {
                po.c(po.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c5326f6.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        Po po = this.a.t;
        synchronized (po) {
            po.a(po.a() + 1);
        }
        this.a.z();
        C5355g9 c5355g9 = this.a.l;
        if (c5355g9.c == null) {
            c5355g9.a();
        }
        C5407i9 c5407i9 = c5355g9.c;
        c5407i9.getClass();
        c5407i9.b = new HashSet();
        c5407i9.d = 0;
        C5407i9 c5407i92 = c5355g9.c;
        c5407i92.a = true;
        C5484l9 c5484l9 = c5355g9.b;
        IBinaryDataHelper iBinaryDataHelper = c5484l9.c;
        C5458k9 c5458k9 = c5484l9.b;
        c5484l9.a.getClass();
        iBinaryDataHelper.insert("event_hashes", c5458k9.toByteArray((C5458k9) C5432j9.a(c5407i92)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(Constants.REFERRER);
                if (!TextUtils.isEmpty(queryParameter)) {
                    C5841z2 c5841z2 = this.a.t().y;
                    for (String str2 : Uri.decode(queryParameter).split(X3.j.c)) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c5841z2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C5841z2 c5841z2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c5841z2 == null) {
            return false;
        }
        for (Pair pair : c5841z2.a) {
            if (Do.a(pair.first, str) && ((obj = pair.second) == null || ((C5815y2) obj).a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
