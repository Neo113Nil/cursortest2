package o;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.uR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024uR {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public C2024uR() {
        AbstractC1888sN.p(3, "verificationMode");
        this.a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC0048Bt.h(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC0048Bt.h(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1589nr e = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public final C1470m10 d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C1470m10(C1318jk.h);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC1695pR.d(sidecarDeviceState2, AbstractC1695pR.b(sidecarDeviceState));
        return new C1470m10(c(AbstractC1695pR.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final C1589nr e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0457Rn c0457Rn;
        C0457Rn c0457Rn2 = C0457Rn.l;
        AbstractC0048Bt.n(sidecarDisplayFeature, "feature");
        HO ho = HO.k;
        int i = this.a;
        AbstractC1888sN.p(i, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new KY(sidecarDisplayFeature, i, ho).k("Type must be either TYPE_FOLD or TYPE_HINGE", C1761qR.h).k("Feature bounds must not be 0", C1826rR.h).k("TYPE_FOLD must have 0 area", C1892sR.h).k("Feature be pinned to either left or top", C1958tR.h).c();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c0457Rn = C0457Rn.n;
        } else {
            if (type != 2) {
                return null;
            }
            c0457Rn = C0457Rn.f99o;
        }
        int b2 = AbstractC1695pR.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            c0457Rn2 = C0457Rn.m;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        AbstractC0048Bt.m(rect, "feature.rect");
        return new C1589nr(new C2137w8(rect), c0457Rn, c0457Rn2);
    }
}
