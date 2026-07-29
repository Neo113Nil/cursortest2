package o;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.util.LinkedHashMap;

/* renamed from: o.z10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2327z10 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final CT a(Context context) {
        CT ct;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    J8 b = AbstractC1807r8.b(-1, 6, null);
                    C1818rJ c1818rJ = new C1818rJ(new C2261y10(contentResolver, uriFor, new C2060v0(b, AbstractC0868ct.m(Looper.getMainLooper()), 2), b, context, null));
                    C1434lU a2 = PO.a();
                    C0191Hg c0191Hg = AbstractC0115Ei.a;
                    InterfaceC0189He E0 = PX.E0(a2, AbstractC1810rB.a);
                    C1894sT c1894sT = new C1894sT(0L, Long.MAX_VALUE);
                    Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    n30 m = AbstractC1305jX.m(c1818rJ, 1);
                    ET d = AbstractC1305jX.d(valueOf);
                    InterfaceC0189He interfaceC0189He = (InterfaceC0189He) m.d;
                    InterfaceC2243xm interfaceC2243xm = (InterfaceC2243xm) m.b;
                    EnumC0500Te enumC0500Te = c1894sT.equals(C1497mR.a) ? EnumC0500Te.h : EnumC0500Te.k;
                    C0508Tm c0508Tm = new C0508Tm(c1894sT, interfaceC2243xm, d, valueOf, null);
                    InterfaceC0189He t = AbstractC0946e20.t(E0, interfaceC0189He, true);
                    C0191Hg c0191Hg2 = AbstractC0115Ei.a;
                    if (t != c0191Hg2 && t.k(C0460Rq.w) == null) {
                        t = t.D(c0191Hg2);
                    }
                    AbstractC1993u c1597nz = enumC0500Te == EnumC0500Te.i ? new C1597nz(t, c0508Tm) : new C0908dT(t, true);
                    c1597nz.c0(enumC0500Te, c1597nz, c0508Tm);
                    obj = new GL(d);
                    linkedHashMap.put(context, obj);
                }
                ct = (CT) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ct;
    }

    public static final AbstractC1838rd b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1838rd) {
            return (AbstractC1838rd) tag;
        }
        return null;
    }
}
