package y;

import D.AbstractC0009j;
import V.m;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C0093a;
import s.C0094b;
import v.C0099b;
import v.C0100c;
import v.C0108k;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1313a;

    public C0119f() {
        AbstractC0009j.g("verificationMode", 3);
        this.f1313a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (e0.h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AbstractC0114a.b(sidecarDeviceState) != AbstractC0114a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (e0.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return e0.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (e0.h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0114a.c(sidecarWindowLayoutInfo), AbstractC0114a.c(sidecarWindowLayoutInfo2));
    }

    public final ArrayList e(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0100c g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    public final C0108k f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        e0.h.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C0108k(m.f386b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0114a.d(sidecarDeviceState2, AbstractC0114a.b(sidecarDeviceState));
        return new C0108k(e(AbstractC0114a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0100c g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0099b c0099b;
        C0099b c0099b2;
        e0.h.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C0093a.a(this.f1313a, sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", C0115b.f1309c).d("Feature bounds must not be 0", C0116c.f1310c).d("TYPE_FOLD must have 0 area", C0117d.f1311c).d("Feature be pinned to either left or top", C0118e.f1312c).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c0099b = C0099b.f1267h;
        } else {
            if (type != 2) {
                return null;
            }
            c0099b = C0099b.f1268i;
        }
        int b2 = AbstractC0114a.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                c0099b2 = C0099b.f1265f;
                if (b2 != 3) {
                }
            } else {
                c0099b2 = C0099b.f1266g;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            e0.h.d(rect, "feature.rect");
            return new C0100c(new C0094b(rect), c0099b, c0099b2);
        }
        return null;
    }
}
