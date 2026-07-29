package o;

import android.app.Notification;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import com.devanos.nilufar.usmonova.p7.gate.GateActivity;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334k implements InterfaceC0649Yx, InterfaceC0597Wx, InterfaceC0623Xx, InterfaceC1113gb, A1, InterfaceC0235Iy, InterfaceC2374zl {
    public final /* synthetic */ int h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public /* synthetic */ C1334k(int i, boolean z) {
        this.h = i;
    }

    public boolean A(C1316ji c1316ji) {
        AbstractC0048Bt.n(c1316ji, "descriptor");
        if (AbstractC0048Bt.h((C1316ji) this.j, c1316ji)) {
            return true;
        }
        C1334k c1334k = (C1334k) this.i;
        return c1334k != null ? c1334k.A(c1316ji) : false;
    }

    public void B(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C1574nc) this.l) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void C(C0995ep c0995ep) {
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
        String str = abstractComponentCallbacksC0069Co.l;
        HashMap hashMap = (HashMap) this.i;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0069Co.l, c0995ep);
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0069Co);
        }
    }

    public void D(C0995ep c0995ep) {
        HashMap hashMap = (HashMap) this.i;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
        if (abstractComponentCallbacksC0069Co.I) {
            ((C0733ap) this.l).h(abstractComponentCallbacksC0069Co);
        }
        if (hashMap.get(abstractComponentCallbacksC0069Co.l) == c0995ep && ((C0995ep) hashMap.put(abstractComponentCallbacksC0069Co.l, null)) != null && AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0069Co);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = HY.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.j).iterator();
                AbstractC0048Bt.m(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    KL kl = (KL) it.next();
                    if (((ArrayDeque) this.k).size() >= 64) {
                        break;
                    }
                    if (kl.i.get() < 5) {
                        it.remove();
                        kl.i.incrementAndGet();
                        arrayList.add(kl);
                        ((ArrayDeque) this.k).add(kl);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.k).size();
                    ((ArrayDeque) this.l).size();
                }
                size = arrayList.size();
                boolean z = false;
                for (i = 0; i < size; i++) {
                    KL kl2 = (KL) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.i) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = HY.g + " Dispatcher";
                                AbstractC0048Bt.n(str, "name");
                                this.i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new GY(str, z));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.i;
                            AbstractC0048Bt.k(threadPoolExecutor);
                        } finally {
                        }
                    }
                    kl2.getClass();
                    NL nl = kl2.j;
                    C1334k c1334k = nl.h.h;
                    byte[] bArr2 = HY.a;
                    try {
                        try {
                            threadPoolExecutor.execute(kl2);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            nl.g(interruptedIOException);
                            kl2.h.onFailure(nl, interruptedIOException);
                            nl.h.h.r(kl2);
                        }
                    } catch (Throwable th) {
                        nl.h.h.r(kl2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        boolean z2 = false;
        while (i < size) {
        }
    }

    @Override // o.InterfaceC0623Xx
    public void F(C1705pb c1705pb) {
        ((ArrayList) this.j).add(new C1002ew(new C0871cw(c1705pb)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0090, B:21:0x006b, B:23:0x0082), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.ZD] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(AbstractC2367ze abstractC2367ze) {
        YO yo;
        ?? r1;
        C1334k c1334k;
        C0762bE c0762bE;
        C2299yc c2299yc;
        C1334k c1334k2;
        C0762bE c0762bE2;
        try {
            if (abstractC2367ze instanceof YO) {
                yo = (YO) abstractC2367ze;
                int i = yo.l;
                if ((i & Integer.MIN_VALUE) != 0) {
                    yo.l = i - Integer.MIN_VALUE;
                    Object obj = yo.j;
                    r1 = yo.l;
                    C0782bY c0782bY = C0782bY.a;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (r1 != 0) {
                        AbstractC1494mO.l(obj);
                        C2299yc c2299yc2 = (C2299yc) this.j;
                        c2299yc2.getClass();
                        if (!(C0283Ku.h.get(c2299yc2) instanceof InterfaceC2249xs)) {
                            return c0782bY;
                        }
                        C0762bE c0762bE3 = (C0762bE) this.i;
                        yo.h = this;
                        yo.i = c0762bE3;
                        yo.l = 1;
                        if (c0762bE3.c(yo) != enumC0448Re) {
                            c1334k = this;
                            c0762bE = c0762bE3;
                        }
                        return enumC0448Re;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ZD zd = yo.i;
                        c1334k2 = yo.h;
                        AbstractC1494mO.l(obj);
                        r1 = zd;
                        ((C2299yc) c1334k2.j).N(c0782bY);
                        c0762bE2 = r1;
                        return c0782bY;
                    }
                    ?? r12 = yo.i;
                    c1334k = yo.h;
                    AbstractC1494mO.l(obj);
                    c0762bE = r12;
                    c2299yc = (C2299yc) c1334k.j;
                    c2299yc.getClass();
                    c0762bE2 = c0762bE;
                    if (C0283Ku.h.get(c2299yc) instanceof InterfaceC2249xs) {
                        yo.h = c1334k;
                        yo.i = c0762bE;
                        yo.l = 2;
                        if (c1334k.f(yo) != enumC0448Re) {
                            c1334k2 = c1334k;
                            r1 = c0762bE;
                            ((C2299yc) c1334k2.j).N(c0782bY);
                            c0762bE2 = r1;
                        }
                        return enumC0448Re;
                    }
                    return c0782bY;
                }
            }
            if (r1 != 0) {
            }
            c2299yc = (C2299yc) c1334k.j;
            c2299yc.getClass();
            c0762bE2 = c0762bE;
            if (C0283Ku.h.get(c2299yc) instanceof InterfaceC2249xs) {
            }
            return c0782bY;
        } finally {
            ((C0762bE) r1).e(null);
        }
        yo = new YO(this, abstractC2367ze);
        Object obj2 = yo.j;
        r1 = yo.l;
        C0782bY c0782bY2 = C0782bY.a;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
    }

    public Bundle H(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.k;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public C1370kW I(int i, C1639ob c1639ob, C1426lM c1426lM) {
        YB yb = new YB(((YB) this.i).a + '@' + i);
        C2002u5 c2002u5 = (C2002u5) this.l;
        HashMap hashMap = (HashMap) c2002u5.j;
        List list = (List) hashMap.get(yb);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(yb, list);
        }
        return ((C1343k5) c2002u5.i).y(c1639ob, c1426lM, list);
    }

    @Override // o.A1
    public boolean a(B1 b1, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.i;
        C1500mU s = s(b1);
        GR gr = (GR) this.l;
        Menu menu2 = (Menu) gr.get(menu);
        if (menu2 == null) {
            menu2 = new AC((Context) this.k, (MenuC0825cC) menu);
            gr.put(menu, menu2);
        }
        return callback.onCreateActionMode(s, menu2);
    }

    @Override // o.InterfaceC0649Yx
    public InterfaceC0597Wx b(C1639ob c1639ob, C1426lM c1426lM) {
        return ((C1343k5) ((C2002u5) this.k).i).y(c1639ob, c1426lM, (ArrayList) this.j);
    }

    public void c(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (((ArrayList) this.j).contains(abstractComponentCallbacksC0069Co)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0069Co);
        }
        synchronized (((ArrayList) this.j)) {
            ((ArrayList) this.j).add(abstractComponentCallbacksC0069Co);
        }
        abstractComponentCallbacksC0069Co.r = true;
    }

    public SpannableString d() {
        if (((String) this.i) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.i);
        List<V0> list = (List) this.j;
        if (list != null) {
            for (V0 v0 : list) {
                int v = AbstractC1888sN.v(v0.c);
                if (v == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), v0.a, v0.b, 0);
                } else if (v == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((T0) v0).d)), v0.a, v0.b, 0);
                }
            }
        }
        String str = (String) this.l;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.l), 0, ((String) this.i).length(), 0);
        }
        String str2 = (String) this.k;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.k)), 0, ((String) this.i).length(), 0);
        }
        return spannableString;
    }

    @Override // o.A1
    public void e(B1 b1) {
        ((ActionMode.Callback) this.i).onDestroyActionMode(s(b1));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(AbstractC2367ze abstractC2367ze) {
        C2038uf c2038uf;
        int i;
        C1334k c1334k;
        C1643of c1643of;
        C0657Zf c0657Zf = (C0657Zf) this.l;
        if (abstractC2367ze instanceof C2038uf) {
            c2038uf = (C2038uf) abstractC2367ze;
            int i2 = c2038uf.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2038uf.k = i2 - Integer.MIN_VALUE;
                Object obj = c2038uf.i;
                i = c2038uf.k;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    List list = (List) this.k;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (list == null || list.isEmpty()) {
                        c2038uf.h = this;
                        c2038uf.k = 1;
                        obj = C0657Zf.e(c0657Zf, false, c2038uf);
                        if (obj != enumC0448Re) {
                            c1334k = this;
                            c1643of = (C1643of) obj;
                        }
                    } else {
                        SR f = c0657Zf.f();
                        C2236xf c2236xf = new C2236xf(c0657Zf, this, null);
                        c2038uf.h = this;
                        c2038uf.k = 2;
                        obj = f.b(c2236xf, c2038uf);
                        if (obj != enumC0448Re) {
                            c1334k = this;
                            c1643of = (C1643of) obj;
                        }
                    }
                    return enumC0448Re;
                }
                if (i == 1) {
                    c1334k = c2038uf.h;
                    AbstractC1494mO.l(obj);
                    c1643of = (C1643of) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1334k = c2038uf.h;
                    AbstractC1494mO.l(obj);
                    c1643of = (C1643of) obj;
                }
                ((C0657Zf) c1334k.l).n.d0(c1643of);
                return C0782bY.a;
            }
        }
        c2038uf = new C2038uf(this, abstractC2367ze);
        Object obj2 = c2038uf.i;
        i = c2038uf.k;
        if (i != 0) {
        }
        ((C0657Zf) c1334k.l).n.d0(c1643of);
        return C0782bY.a;
    }

    public AbstractComponentCallbacksC0069Co g(String str) {
        C0995ep c0995ep = (C0995ep) ((HashMap) this.i).get(str);
        if (c0995ep != null) {
            return c0995ep.c;
        }
        return null;
    }

    @Override // o.InterfaceC1557nL
    public Object get() {
        return new M10((Executor) ((InterfaceC1557nL) this.i).get(), (InterfaceC0480Sk) ((InterfaceC1557nL) this.j).get(), (C0153Fu) ((C0950e6) this.k).get(), (AU) ((InterfaceC1557nL) this.l).get());
    }

    @Override // o.InterfaceC0235Iy
    public Object getValue() {
        XZ viewModel_delegate$lambda$0;
        UZ uz = (UZ) this.l;
        if (uz != null) {
            return uz;
        }
        C0680a00 viewModelStore = ((C0865cq) this.j).i.getViewModelStore();
        viewModel_delegate$lambda$0 = GateActivity.viewModel_delegate$lambda$0();
        AbstractC0656Ze defaultViewModelCreationExtras = ((C0865cq) this.k).i.getDefaultViewModelCreationExtras();
        AbstractC0048Bt.n(viewModelStore, "store");
        AbstractC0048Bt.n(viewModel_delegate$lambda$0, "factory");
        AbstractC0048Bt.n(defaultViewModelCreationExtras, "extras");
        ZZ zz = new ZZ(viewModelStore, viewModel_delegate$lambda$0, defaultViewModelCreationExtras);
        InterfaceC0517Tv interfaceC0517Tv = (InterfaceC0517Tv) this.i;
        AbstractC0048Bt.n(interfaceC0517Tv, "modelClass");
        String a = interfaceC0517Tv.a();
        if (a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        UZ a2 = zz.a(interfaceC0517Tv, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a));
        this.l = a2;
        return a2;
    }

    @Override // o.InterfaceC0597Wx
    public void h() {
        switch (this.h) {
            case 0:
                ArrayList arrayList = (ArrayList) this.j;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C2002u5) this.k).j).put((YB) this.i, arrayList);
                    break;
                }
                break;
            case 1:
            default:
                C1370kW c1370kW = (C1370kW) this.l;
                C0827cE c0827cE = (C0827cE) this.k;
                ArrayList arrayList2 = (ArrayList) this.j;
                c1370kW.getClass();
                AbstractC0048Bt.n(arrayList2, "elements");
                if (c0827cE != null) {
                    RY w = AbstractC1052fg.w(c0827cE, (InterfaceC1245ib) c1370kW.k);
                    if (w == null) {
                        if (((C1343k5) c1370kW.j).u((C1639ob) c1370kW.l) && AbstractC0048Bt.h(c0827cE.b(), "value")) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof C1606o4) {
                                    arrayList3.add(next);
                                }
                            }
                            List list = (List) c1370kW.m;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                list.add((InterfaceC0948e4) ((C1606o4) it2.next()).a);
                            }
                            break;
                        }
                    } else {
                        HashMap hashMap = (HashMap) c1370kW.i;
                        List i = AbstractC1052fg.i(arrayList2);
                        AbstractC1004ey c = w.c();
                        AbstractC0048Bt.m(c, "parameter.type");
                        hashMap.put(c0827cE, new AX(i, c));
                        break;
                    }
                }
                break;
            case 2:
                ((C1370kW) this.k).h();
                ((ArrayList) ((C1334k) this.l).j).add(new C1606o4((InterfaceC0948e4) AbstractC0720ac.D0((ArrayList) this.j)));
                break;
        }
    }

    @Override // o.A1
    public boolean i(B1 b1, MenuItem menuItem) {
        return ((ActionMode.Callback) this.i).onActionItemClicked(s(b1), new MenuItemC1548nC((Context) this.k, (InterfaceMenuItemC1829rU) menuItem));
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0623Xx j(C0827cE c0827cE) {
        return ((C1370kW) this.i).j(c0827cE);
    }

    @Override // o.InterfaceC0597Wx
    public void k(C0827cE c0827cE, C1705pb c1705pb) {
        ((C1370kW) this.i).k(c0827cE, c1705pb);
    }

    @Override // o.InterfaceC0597Wx
    public void l(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
        ((C1370kW) this.i).l(c0827cE, c1639ob, c0827cE2);
    }

    @Override // o.InterfaceC0597Wx
    public void m(C0827cE c0827cE, Object obj) {
        ((C1370kW) this.i).m(c0827cE, obj);
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0597Wx n(C1639ob c1639ob, C0827cE c0827cE) {
        return ((C1370kW) this.i).n(c1639ob, c0827cE);
    }

    public AbstractComponentCallbacksC0069Co o(String str) {
        for (C0995ep c0995ep : ((HashMap) this.i).values()) {
            if (c0995ep != null) {
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c0995ep.c;
                if (!str.equals(abstractComponentCallbacksC0069Co.l)) {
                    abstractComponentCallbacksC0069Co = abstractComponentCallbacksC0069Co.B.c.o(str);
                }
                if (abstractComponentCallbacksC0069Co != null) {
                    return abstractComponentCallbacksC0069Co;
                }
            }
        }
        return null;
    }

    public void p(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        E();
    }

    @Override // o.InterfaceC1113gb
    public C1047fb q(C1639ob c1639ob) {
        AbstractC0048Bt.n(c1639ob, "classId");
        C1030fK c1030fK = (C1030fK) ((LinkedHashMap) this.l).get(c1639ob);
        if (c1030fK == null) {
            return null;
        }
        C0208Hx c0208Hx = (C0208Hx) this.i;
        R8 r8 = (R8) this.j;
        ((UY) this.k).invoke(c1639ob);
        return new C1047fb(c0208Hx, c1030fK, r8, IS.e);
    }

    @Override // o.InterfaceC0623Xx
    public void q0(Object obj) {
        ((ArrayList) this.j).add(C1343k5.a((C1343k5) this.i, (C0827cE) this.k, obj));
    }

    public void r(KL kl) {
        kl.i.decrementAndGet();
        p((ArrayDeque) this.k, kl);
    }

    public C1500mU s(B1 b1) {
        ArrayList arrayList = (ArrayList) this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1500mU c1500mU = (C1500mU) arrayList.get(i);
            if (c1500mU != null && c1500mU.b == b1) {
                return c1500mU;
            }
        }
        C1500mU c1500mU2 = new C1500mU((Context) this.k, b1);
        arrayList.add(c1500mU2);
        return c1500mU2;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (C0995ep c0995ep : ((HashMap) this.i).values()) {
            if (c0995ep != null) {
                arrayList.add(c0995ep);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC0623Xx
    public void u(C1639ob c1639ob, C0827cE c0827cE) {
        ((ArrayList) this.j).add(new C2175wk(c1639ob, c0827cE));
    }

    @Override // o.A1
    public boolean v(B1 b1, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.i;
        C1500mU s = s(b1);
        GR gr = (GR) this.l;
        Menu menu2 = (Menu) gr.get(menu);
        if (menu2 == null) {
            menu2 = new AC((Context) this.k, (MenuC0825cC) menu);
            gr.put(menu, menu2);
        }
        return callback.onPrepareActionMode(s, menu2);
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (C0995ep c0995ep : ((HashMap) this.i).values()) {
            if (c0995ep != null) {
                arrayList.add(c0995ep.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC0623Xx
    public InterfaceC0597Wx w0(C1639ob c1639ob) {
        ArrayList arrayList = new ArrayList();
        return new C1334k(((C1343k5) this.i).v(c1639ob, IS.e, arrayList), this, arrayList);
    }

    public InterfaceC1245ib x(C1639ob c1639ob, List list) {
        AbstractC0048Bt.n(c1639ob, "classId");
        return (InterfaceC1245ib) ((PA) this.l).invoke(new TE(c1639ob, list));
    }

    public List y() {
        ArrayList arrayList;
        if (((ArrayList) this.j).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.j)) {
            arrayList = new ArrayList((ArrayList) this.j);
        }
        return arrayList;
    }

    public File z(Context context) {
        ((GU) this.j).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public /* synthetic */ C1334k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    public C1334k(VA va, InterfaceC0761bD interfaceC0761bD) {
        this.h = 11;
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        this.i = va;
        this.j = interfaceC0761bD;
        this.k = va.b(new VE(this, 1));
        this.l = va.b(new VE(this, 0));
    }

    public C1334k(AK ak, C0208Hx c0208Hx, R8 r8, UY uy) {
        this.h = 13;
        this.i = c0208Hx;
        this.j = r8;
        this.k = uy;
        List list = ak.n;
        AbstractC0048Bt.m(list, "proto.class_List");
        int E = EB.E(AbstractC0786bc.d0(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(E < 16 ? 16 : E);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC1052fg.x((C0208Hx) this.i, ((C1030fK) obj).l), obj);
        }
        this.l = linkedHashMap;
    }

    public C1334k(InterfaceC0422Qe interfaceC0422Qe, C1400l c1400l, C0579Wf c0579Wf) {
        this.h = 15;
        this.i = interfaceC0422Qe;
        this.j = c0579Wf;
        this.k = AbstractC1807r8.b(Integer.MAX_VALUE, 6, null);
        this.l = new Y1(9);
        InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) interfaceC0422Qe.m().k(C0460Rq.K);
        if (interfaceC0075Cu != null) {
            interfaceC0075Cu.B(new C0810c0(c1400l, 16, this));
        }
    }

    public C1334k(InterfaceC0517Tv interfaceC0517Tv, C0865cq c0865cq, C0641Yp c0641Yp, C0865cq c0865cq2) {
        this.h = 19;
        AbstractC0048Bt.n(interfaceC0517Tv, "viewModelClass");
        this.i = interfaceC0517Tv;
        this.j = c0865cq;
        this.k = c0865cq2;
    }

    public C1334k(int i) {
        this.h = i;
        switch (i) {
            case 8:
                this.j = new ArrayList();
                this.i = new HashMap();
                this.k = new HashMap();
                break;
            case 14:
                GU gu = new GU(0);
                C1623oL c1623oL = new C1623oL(17);
                this.i = new HashSet();
                this.j = gu;
                this.k = c1623oL;
                break;
            default:
                this.j = new ArrayDeque();
                this.k = new ArrayDeque();
                this.l = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1334k(C1091gF c1091gF) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i2;
        this.h = 12;
        new ArrayList();
        this.l = new Bundle();
        this.k = c1091gF;
        Context context = c1091gF.a;
        ArrayList arrayList2 = c1091gF.t;
        ArrayList arrayList3 = c1091gF.c;
        ArrayList arrayList4 = c1091gF.d;
        this.i = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.j = AbstractC1419lF.a(context, c1091gF.q);
        } else {
            this.j = new Notification.Builder(c1091gF.a);
        }
        Notification notification = c1091gF.s;
        Context context2 = null;
        int i3 = 0;
        ((Notification.Builder) this.j).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c1091gF.e).setContentText(c1091gF.f).setContentInfo(null).setContentIntent(c1091gF.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(c1091gF.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.j;
        IconCompat iconCompat = c1091gF.h;
        AbstractC1287jF.b(builder, iconCompat == null ? null : AbstractC1261is.c(iconCompat, context));
        ((Notification.Builder) this.j).setSubText(null).setUsesChronometer(false).setPriority(c1091gF.j);
        Iterator it = c1091gF.b.iterator();
        while (it.hasNext()) {
            C0697aF c0697aF = (C0697aF) it.next();
            if (c0697aF.b == null && (i2 = c0697aF.e) != 0) {
                c0697aF.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = c0697aF.b;
            boolean z = c0697aF.c;
            Bundle bundle3 = c0697aF.a;
            Notification.Action.Builder a = AbstractC1287jF.a(iconCompat2 != null ? AbstractC1261is.c(iconCompat2, context2) : context2, c0697aF.f, c0697aF.g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i4 = Build.VERSION.SDK_INT;
            AbstractC1353kF.a(a, z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i4 >= 28) {
                AbstractC1485mF.b(a, 0);
            }
            if (i4 >= 29) {
                AbstractC1551nF.c(a, false);
            }
            if (i4 >= 31) {
                AbstractC1617oF.a(a, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0697aF.d);
            AbstractC1157hF.b(a, bundle2);
            AbstractC1157hF.a((Notification.Builder) this.j, AbstractC1157hF.d(a));
            context2 = null;
        }
        Bundle bundle4 = c1091gF.n;
        if (bundle4 != null) {
            ((Bundle) this.l).putAll(bundle4);
        }
        int i5 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.j).setShowWhen(c1091gF.k);
        AbstractC1157hF.i((Notification.Builder) this.j, c1091gF.m);
        AbstractC1157hF.g((Notification.Builder) this.j, null);
        AbstractC1157hF.j((Notification.Builder) this.j, null);
        AbstractC1157hF.h((Notification.Builder) this.j, false);
        AbstractC1223iF.b((Notification.Builder) this.j, null);
        AbstractC1223iF.c((Notification.Builder) this.j, c1091gF.f167o);
        AbstractC1223iF.f((Notification.Builder) this.j, c1091gF.p);
        AbstractC1223iF.d((Notification.Builder) this.j, null);
        AbstractC1223iF.e((Notification.Builder) this.j, notification.sound, notification.audioAttributes);
        if (i5 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    N6 n6 = new N6(arrayList2.size() + arrayList.size());
                    n6.addAll(arrayList);
                    n6.addAll(arrayList2);
                    arrayList2 = new ArrayList(n6);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                AbstractC1223iF.a((Notification.Builder) this.j, (String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (c1091gF.n == null) {
                c1091gF.n = new Bundle();
            }
            Bundle bundle5 = c1091gF.n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList4.size()) {
                String num = Integer.toString(i6);
                C0697aF c0697aF2 = (C0697aF) arrayList4.get(i6);
                Bundle bundle8 = new Bundle();
                if (c0697aF2.b == null && (i = c0697aF2.e) != 0) {
                    c0697aF2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c0697aF2.b;
                Bundle bundle9 = c0697aF2.a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i3);
                bundle8.putCharSequence("title", c0697aF2.f);
                bundle8.putParcelable("actionIntent", c0697aF2.g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0697aF2.c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0697aF2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i6++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (c1091gF.n == null) {
                c1091gF.n = new Bundle();
            }
            c1091gF.n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.l).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i7 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.j).setExtras(c1091gF.n);
        AbstractC1353kF.e((Notification.Builder) this.j, null);
        if (i7 >= 26) {
            AbstractC1419lF.b((Notification.Builder) this.j, 0);
            AbstractC1419lF.e((Notification.Builder) this.j, null);
            AbstractC1419lF.f((Notification.Builder) this.j, null);
            AbstractC1419lF.g((Notification.Builder) this.j, 0L);
            AbstractC1419lF.d((Notification.Builder) this.j, 0);
            if (!TextUtils.isEmpty(c1091gF.q)) {
                ((Notification.Builder) this.j).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i7 >= 29) {
            AbstractC1551nF.a((Notification.Builder) this.j, c1091gF.r);
            AbstractC1551nF.b((Notification.Builder) this.j, null);
        }
    }

    public C1334k(Typeface typeface, LC lc) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = 10;
        this.l = typeface;
        this.i = lc;
        this.k = new MC(1024);
        int a = lc.a(6);
        if (a != 0) {
            int i5 = a + lc.h;
            i = ((ByteBuffer) lc.k).getInt(((ByteBuffer) lc.k).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.j = new char[i * 2];
        int a2 = lc.a(6);
        if (a2 != 0) {
            int i6 = a2 + lc.h;
            i2 = ((ByteBuffer) lc.k).getInt(((ByteBuffer) lc.k).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            HX hx = new HX(this, i7);
            KC b = hx.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.k).getInt(a3 + b.h) : 0, (char[]) this.j, i7 * 2);
            KC b2 = hx.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.h;
                i3 = ((ByteBuffer) b2.k).getInt(((ByteBuffer) b2.k).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                MC mc = (MC) this.k;
                KC b3 = hx.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i9 = a5 + b3.h;
                    i4 = ((ByteBuffer) b3.k).getInt(((ByteBuffer) b3.k).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                mc.a(hx, 0, i4 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public C1334k(C2002u5 c2002u5, YB yb) {
        this.h = 0;
        this.l = c2002u5;
        this.h = 0;
        this.k = c2002u5;
        this.i = yb;
        this.j = new ArrayList();
    }

    public C1334k(Context context, ActionMode.Callback callback) {
        this.h = 16;
        this.k = context;
        this.i = callback;
        this.j = new ArrayList();
        this.l = new GR(0);
    }

    public C1334k(C1343k5 c1343k5, C0827cE c0827cE, C1370kW c1370kW) {
        this.h = 3;
        this.i = c1343k5;
        this.k = c0827cE;
        this.l = c1370kW;
        this.j = new ArrayList();
    }

    public C1334k(C1370kW c1370kW, C1334k c1334k, ArrayList arrayList) {
        this.h = 2;
        this.k = c1370kW;
        this.l = c1334k;
        this.j = arrayList;
        this.i = c1370kW;
    }

    public C1334k(C0581Wh c0581Wh) {
        this.h = 6;
        this.l = c0581Wh;
        List list = c0581Wh.l.A;
        AbstractC0048Bt.m(list, "classProto.enumEntryList");
        int E = EB.E(AbstractC0786bc.d0(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(E < 16 ? 16 : E);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC1052fg.C(c0581Wh.s.b, ((C1688pK) obj).k), obj);
        }
        this.i = linkedHashMap;
        C0581Wh c0581Wh2 = (C0581Wh) this.l;
        this.j = c0581Wh2.s.a.a.c(new C0810c0(this, 7, c0581Wh2));
        VA va = ((C0581Wh) this.l).s.a.a;
        C1139h0 c1139h0 = new C1139h0(6, this);
        va.getClass();
        this.k = new SA(va, c1139h0);
    }

    public C1334k(C0657Zf c0657Zf, List list) {
        this.h = 5;
        this.l = c0657Zf;
        this.i = new C0762bE();
        C2299yc c2299yc = new C2299yc(true);
        c2299yc.J(null);
        this.j = c2299yc;
        this.k = AbstractC0720ac.J0(list);
    }

    public C1334k(String str, String[] strArr, String str2, C1173hV c1173hV) {
        this.h = 17;
        this.i = str;
        this.j = strArr;
        this.l = str2;
        this.k = c1173hV;
    }
}
