package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import o.AbstractC0048Bt;
import o.AbstractC1695pR;
import o.C2024uR;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final C2024uR d;
    public final SidecarInterface.SidecarCallback e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(C2024uR c2024uR, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = c2024uR;
        this.e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (o.AbstractC1695pR.b(r2) == o.AbstractC1695pR.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.a) {
            try {
                C2024uR c2024uR = this.d;
                SidecarDeviceState sidecarDeviceState2 = this.b;
                c2024uR.getClass();
                if (!AbstractC0048Bt.h(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.b = sidecarDeviceState;
                    this.e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                this.d.getClass();
                if (AbstractC0048Bt.h(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = C2024uR.b(AbstractC1695pR.c(sidecarWindowLayoutInfo2), AbstractC1695pR.c(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
