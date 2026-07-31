package io.bidmachine.iab.vast;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class VastRequestManager {
    private static final Map a = new WeakHashMap();

    static synchronized void a(VastRequest vastRequest) {
        synchronized (VastRequestManager.class) {
            if (vastRequest == null) {
                return;
            }
            a.remove(vastRequest);
        }
    }

    @Nullable
    public static synchronized VastRequest get(@Nullable String str) {
        synchronized (VastRequestManager.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = a.entrySet().iterator();
            while (it.hasNext()) {
                VastRequest vastRequest = (VastRequest) ((Map.Entry) it.next()).getKey();
                if (vastRequest.getId().equals(str)) {
                    return vastRequest;
                }
            }
            return null;
        }
    }

    public static synchronized void store(@Nullable VastRequest vastRequest) {
        synchronized (VastRequestManager.class) {
            if (vastRequest == null) {
                return;
            }
            a.put(vastRequest, Boolean.TRUE);
        }
    }
}
