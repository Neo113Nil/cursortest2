package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* renamed from: o.wR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2156wR {
    public static SidecarInterface a(Context context) {
        AbstractC0048Bt.n(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static C1177hZ b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            C1177hZ c1177hZ = C1177hZ.m;
            return AbstractC1035fP.i(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
