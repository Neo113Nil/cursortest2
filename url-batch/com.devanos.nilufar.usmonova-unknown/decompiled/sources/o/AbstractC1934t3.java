package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: o.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1934t3 {
    public static final C2240xj a = new C2240xj(T1.k);
    public static final IT b = new IT(T1.l);
    public static final IT c = new IT(T1.m);
    public static final IT d = new IT(T1.n);
    public static final IT e = new IT(T1.f109o);
    public static final IT f = new IT(T1.p);

    public static final void a(S2 s2, InterfaceC2312yp interfaceC2312yp, InterfaceC1377kd interfaceC1377kd, int i) {
        TD td;
        boolean z;
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(1396852028);
        if ((((c1575nd.e(s2) ? 4 : 2) | i | (c1575nd.e(interfaceC2312yp) ? 32 : 16)) & 19) == 18 && c1575nd.t()) {
            c1575nd.F();
        } else {
            Context context = s2.getContext();
            Object C = c1575nd.C();
            C1623oL c1623oL = C1311jd.a;
            if (C == c1623oL) {
                C = AbstractC2219xO.r(new Configuration(context.getResources().getConfiguration()));
                c1575nd.P(C);
            }
            TD td2 = (TD) C;
            Object C2 = c1575nd.C();
            if (C2 == c1623oL) {
                C2 = new C1400l(6, td2);
                c1575nd.P(C2);
            }
            s2.setConfigurationChangeObserver((InterfaceC2114vp) C2);
            Object C3 = c1575nd.C();
            if (C3 == c1623oL) {
                C3 = new Q3();
                c1575nd.P(C3);
            }
            Q3 q3 = (Q3) C3;
            H2 viewTreeOwners = s2.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            MP mp = viewTreeOwners.b;
            Object C4 = c1575nd.C();
            if (C4 == c1623oL) {
                Object parent = s2.getParent();
                AbstractC0048Bt.l(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = BP.class.getSimpleName() + ':' + str;
                KP savedStateRegistry = mp.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a2.keySet()) {
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        AbstractC0048Bt.l(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        td2 = td2;
                    }
                }
                td = td2;
                IT it = CP.a;
                C0208Hx c0208Hx = new C0208Hx(linkedHashMap);
                try {
                    savedStateRegistry.c(str2, new C0095Do(2, c0208Hx));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                C0322Mi c0322Mi = new C0322Mi(c0208Hx, new C0348Ni(z, savedStateRegistry, str2));
                c1575nd.P(c0322Mi);
                C4 = c0322Mi;
            } else {
                td = td2;
            }
            C0322Mi c0322Mi2 = (C0322Mi) C4;
            boolean e2 = c1575nd.e(c0322Mi2);
            Object C5 = c1575nd.C();
            if (e2 || C5 == c1623oL) {
                C5 = new C1400l(7, c0322Mi2);
                c1575nd.P(C5);
            }
            PX.d(C0782bY.a, (InterfaceC2114vp) C5, c1575nd);
            Configuration configuration = (Configuration) td.getValue();
            Object C6 = c1575nd.C();
            if (C6 == c1623oL) {
                C6 = new C1722ps();
                c1575nd.P(C6);
            }
            C1722ps c1722ps = (C1722ps) C6;
            Object C7 = c1575nd.C();
            Object obj = C7;
            if (C7 == c1623oL) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c1575nd.P(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object C8 = c1575nd.C();
            if (C8 == c1623oL) {
                C8 = new ComponentCallbacks2C1802r3(configuration3, c1722ps);
                c1575nd.P(C8);
            }
            ComponentCallbacks2C1802r3 componentCallbacks2C1802r3 = (ComponentCallbacks2C1802r3) C8;
            boolean e3 = c1575nd.e(context);
            Object C9 = c1575nd.C();
            if (e3 || C9 == c1623oL) {
                C9 = new C0810c0(context, 2, componentCallbacks2C1802r3);
                c1575nd.P(C9);
            }
            PX.d(c1722ps, (InterfaceC2114vp) C9, c1575nd);
            Object C10 = c1575nd.C();
            if (C10 == c1623oL) {
                C10 = new TN();
                c1575nd.P(C10);
            }
            TN tn = (TN) C10;
            Object C11 = c1575nd.C();
            if (C11 == c1623oL) {
                C11 = new ComponentCallbacks2C1868s3(tn);
                c1575nd.P(C11);
            }
            ComponentCallbacks2C1868s3 componentCallbacks2C1868s3 = (ComponentCallbacks2C1868s3) C11;
            boolean e4 = c1575nd.e(context);
            Object C12 = c1575nd.C();
            if (e4 || C12 == c1623oL) {
                C12 = new C0810c0(context, 3, componentCallbacks2C1868s3);
                c1575nd.P(C12);
            }
            PX.d(tn, (InterfaceC2114vp) C12, c1575nd);
            C2240xj c2240xj = AbstractC2300yd.t;
            AbstractC1473m3.b(new C1491mL[]{a.a((Configuration) td.getValue()), b.a(context), DA.a.a(viewTreeOwners.a), e.a(mp), CP.a.a(c0322Mi2), f.a(s2.getView()), c.a(c1722ps), d.a(tn), c2240xj.a(Boolean.valueOf(((Boolean) c1575nd.h(c2240xj)).booleanValue() | s2.getScrollCaptureInProgress$ui_release()))}, AbstractC0946e20.F(1471621628, new C1605o3(s2, q3, interfaceC2312yp), c1575nd), c1575nd, 56);
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new C1671p3(s2, interfaceC2312yp, i, 0);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
