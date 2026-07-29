package o;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: o.pR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1695pR {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        AbstractC0048Bt.n(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        AbstractC0048Bt.n(sidecarDeviceState, "sidecarDeviceState");
        int a = a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            return 0;
        }
        return a;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List list;
        C1318jk c1318jk = C1318jk.h;
        AbstractC0048Bt.n(sidecarWindowLayoutInfo, "info");
        try {
            try {
                list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return list == null ? c1318jk : list;
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}
