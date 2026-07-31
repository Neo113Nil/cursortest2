package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5419im implements NetworkResponseHandler {
    public final C5601pm a;
    public final C5401i3 b;

    public C5419im() {
        this(new C5601pm(), new C5401i3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5731um handle(@NonNull ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!Do.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C5601pm c5601pm = this.a;
                c5601pm.getClass();
                C5731um c5731um = new C5731um();
                try {
                    c5601pm.h.getClass();
                    Bb bb = new Bb(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = bb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c5731um.h = str2;
                    c5731um.i = str;
                    c5601pm.a(c5731um, bb);
                    c5731um.a = TextUtils.isEmpty(c5731um.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c5731um = new C5731um();
                    c5731um.a = 1;
                }
                if (2 == c5731um.a) {
                    return c5731um;
                }
            }
        }
        return null;
    }

    public C5419im(C5601pm c5601pm, C5401i3 c5401i3) {
        this.a = c5601pm;
        this.b = c5401i3;
    }
}
