package o;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import com.devanos.nilufar.usmonova.R;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950e6 implements InterfaceC0486Sq, InterfaceC0514Ts, InterfaceC2374zl, YY {
    public static volatile C0950e6 l = null;
    public static final Object m = new Object();
    public static boolean n = true;

    /* renamed from: o, reason: collision with root package name */
    public static C0950e6 f160o;
    public static C0950e6 p;
    public final /* synthetic */ int h;
    public Object i;
    public Object j;
    public Object k;

    public /* synthetic */ C0950e6(int i, boolean z) {
        this.h = i;
    }

    public static C0950e6 A(Context context) {
        if (l == null) {
            synchronized (m) {
                try {
                    if (l == null) {
                        l = new C0950e6(context);
                    }
                } finally {
                }
            }
        }
        return l;
    }

    public static C0950e6 D() {
        if (f160o == null) {
            C0140Fh c0140Fh = new C0140Fh(5);
            ThreadFactoryC1321jn threadFactoryC1321jn = new ThreadFactoryC1321jn();
            threadFactoryC1321jn.a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC1321jn);
            FlutterJNI flutterJNI = new FlutterJNI();
            C1717pn c1717pn = new C1717pn();
            c1717pn.a = false;
            c1717pn.e = flutterJNI;
            c1717pn.f = newCachedThreadPool;
            C0950e6 c0950e6 = new C0950e6(9, false);
            c0950e6.i = c1717pn;
            c0950e6.j = c0140Fh;
            c0950e6.k = newCachedThreadPool;
            f160o = c0950e6;
        }
        return f160o;
    }

    public static C0950e6 F(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0950e6(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z) {
        IX[] ixArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ixArr = (IX[]) editable.getSpans(selectionStart, selectionEnd, IX.class)) != null && ixArr.length > 0) {
                for (IX ix : ixArr) {
                    int spanStart = editable.getSpanStart(ix);
                    int spanEnd = editable.getSpanEnd(ix);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean B(KeyEvent keyEvent) {
        InterfaceC0311Lx[] interfaceC0311LxArr = (InterfaceC0311Lx[]) this.i;
        if (((HashSet) this.j).remove(keyEvent)) {
            return false;
        }
        if (interfaceC0311LxArr.length <= 0) {
            I(keyEvent);
            return true;
        }
        C0286Kx c0286Kx = new C0286Kx(this, keyEvent);
        for (InterfaceC0311Lx interfaceC0311Lx : interfaceC0311LxArr) {
            interfaceC0311Lx.t(keyEvent, new C0260Jx(c0286Kx));
        }
        return true;
    }

    public boolean C(CharSequence charSequence, int i, int i2, HX hx) {
        if ((hx.c & 3) == 0) {
            InterfaceC0194Hj interfaceC0194Hj = (InterfaceC0194Hj) this.k;
            KC b = hx.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.k).getShort(a + b.h);
            }
            C2303yg c2303yg = (C2303yg) interfaceC0194Hj;
            c2303yg.getClass();
            ThreadLocal threadLocal = C2303yg.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c2303yg.a;
            String sb2 = sb.toString();
            int i3 = AbstractC1553nH.a;
            boolean a2 = AbstractC1487mH.a(textPaint, sb2);
            int i4 = hx.c & 4;
            hx.c = a2 ? i4 | 2 : i4 | 1;
        }
        return (hx.c & 3) == 2;
    }

    public void E(String str, Object obj, NC nc) {
        ((InterfaceC1412l8) this.i).g((String) this.j, ((PC) this.k).g(new C0208Hx(str, 5, obj)), nc == null ? null : new C0756b8(this, 1, nc));
    }

    public AbstractC0989ej G(S2 s2) {
        QZ qz = (QZ) this.k;
        if (qz != null) {
            return qz;
        }
        QZ qz2 = new QZ(s2.getContext());
        qz2.setClipChildren(false);
        qz2.setClipToPadding(false);
        qz2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        s2.addView(qz2, -1);
        this.k = qz2;
        return qz2;
    }

    public void H() {
        ZG zg = ((C0027Ay) this.i).j;
        if (zg != null) {
            ((S2) zg).u();
        }
    }

    public void I(KeyEvent keyEvent) {
        C0410Ps c0410Ps;
        HashSet hashSet = (HashSet) this.j;
        InterfaceC0337Mx interfaceC0337Mx = (InterfaceC0337Mx) this.k;
        if (interfaceC0337Mx != null) {
            C0068Cn c0068Cn = (C0068Cn) interfaceC0337Mx;
            io.flutter.plugin.editing.b bVar = c0068Cn.t;
            boolean z = false;
            if (bVar.b.isAcceptingText() && (c0410Ps = bVar.j) != null) {
                C2073vA c2073vA = c0410Ps.d;
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 21) {
                        z = c0410Ps.d(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 22) {
                        z = c0410Ps.d(false, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 19) {
                        z = c0410Ps.e(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 20) {
                        z = c0410Ps.e(false, keyEvent.isShiftPressed());
                    } else {
                        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = c0410Ps.e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                c0410Ps.performEditorAction(editorInfo.imeOptions & 255);
                                z = true;
                            }
                        }
                        int selectionStart = Selection.getSelectionStart(c2073vA);
                        int selectionEnd = Selection.getSelectionEnd(c2073vA);
                        int unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            int min = Math.min(selectionStart, selectionEnd);
                            int max = Math.max(selectionStart, selectionEnd);
                            c0410Ps.beginBatchEdit();
                            if (min != max) {
                                c2073vA.delete(min, max);
                            }
                            c2073vA.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                            int i = min + 1;
                            c0410Ps.setSelection(i, i);
                            c0410Ps.endBatchEdit();
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            hashSet.add(keyEvent);
            c0068Cn.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void J(Activity activity, C1470m10 c1470m10) {
        WeakHashMap weakHashMap = (WeakHashMap) this.k;
        AbstractC0048Bt.n(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.j;
        reentrantLock.lock();
        try {
            if (c1470m10.equals((C1470m10) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((AR) ((C1818rJ) this.i).i).b.iterator();
            while (it.hasNext()) {
                C2354zR c2354zR = (C2354zR) it.next();
                if (c2354zR.a.equals(activity)) {
                    c2354zR.c = c1470m10;
                    c2354zR.b.accept(c1470m10);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC0531Uj interfaceC0531Uj) {
        int i4;
        char c;
        C0557Vj c0557Vj = new C0557Vj((MC) ((C1334k) this.j).k);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = ((MC) c0557Vj.f).a;
                MC mc = sparseArray == null ? null : (MC) sparseArray.get(codePointAt);
                if (c0557Vj.b == 2) {
                    if (mc != null) {
                        c0557Vj.f = mc;
                        c0557Vj.d++;
                    } else {
                        if (codePointAt == 65038) {
                            c0557Vj.d();
                        } else if (codePointAt != 65039) {
                            MC mc2 = (MC) c0557Vj.f;
                            if (mc2.b != null) {
                                if (c0557Vj.d != 1) {
                                    c0557Vj.g = mc2;
                                    c0557Vj.d();
                                } else if (c0557Vj.e()) {
                                    c0557Vj.g = (MC) c0557Vj.f;
                                    c0557Vj.d();
                                } else {
                                    c0557Vj.d();
                                }
                                c = 3;
                            } else {
                                c0557Vj.d();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (mc == null) {
                    c0557Vj.d();
                    c = 1;
                } else {
                    c0557Vj.b = 2;
                    c0557Vj.f = mc;
                    c0557Vj.d = 1;
                    c = 2;
                }
                c0557Vj.c = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !C(charSequence, i4, i6, ((MC) c0557Vj.g).b)) {
                        z2 = interfaceC0531Uj.u(charSequence, i4, i6, ((MC) c0557Vj.g).b);
                        i5++;
                    }
                }
            }
        }
        if (c0557Vj.b == 2 && ((MC) c0557Vj.f).b != null && ((c0557Vj.d > 1 || c0557Vj.e()) && i5 < i3 && z2 && (z || !C(charSequence, i4, i6, ((MC) c0557Vj.f).b)))) {
            interfaceC0531Uj.u(charSequence, i4, i6, ((MC) c0557Vj.f).b);
        }
        return interfaceC0531Uj.b();
    }

    public void L() {
        ((TypedArray) this.i).recycle();
    }

    public void M(Serializable serializable, InterfaceC0821c8 interfaceC0821c8) {
        ((InterfaceC1412l8) this.i).g((String) this.j, ((CC) this.k).d(serializable), interfaceC0821c8 == null ? null : new C0756b8(this, 0, interfaceC0821c8));
    }

    public void N(C2004u7 c2004u7) {
        C1574nc c1574nc = new C1574nc(18);
        C2293yW c2293yW = (C2293yW) this.k;
        F7 f7 = (F7) this.i;
        C1845rk c1845rk = (C1845rk) this.j;
        ZP zp = c2293yW.c;
        C0950e6 a = F7.a();
        a.P(f7.a);
        a.k = EnumC1489mJ.h;
        a.j = f7.b;
        F7 l2 = a.l();
        C1343k5 c1343k5 = new C1343k5();
        c1343k5.m = new HashMap();
        c1343k5.k = Long.valueOf(c2293yW.a.a());
        c1343k5.l = Long.valueOf(c2293yW.b.a());
        c1343k5.h = Constants.FirelogAnalytics.FCM_LOG_SOURCE;
        c1343k5.j = new C1780qk(c1845rk, ((MessagingClientEventExtension) c2004u7.a).toByteArray());
        c1343k5.i = null;
        C0217Ig c0217Ig = (C0217Ig) zp;
        c0217Ig.b.execute(new RunnableC0139Fg(c0217Ig, l2, c1574nc, c1343k5.h()));
    }

    public void O(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == X1.a) {
            this.k = obj;
            return;
        }
        synchronized (this.j) {
            FV fv = (FV) ((AtomicReference) this.i).get();
            int a = fv.a(id);
            if (a < 0) {
                ((AtomicReference) this.i).set(fv.b(id, obj));
            } else {
                fv.c[a] = obj;
            }
        }
    }

    public void P(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.i = str;
    }

    public void Q(OC oc) {
        ((InterfaceC1412l8) this.i).R((String) this.j, new C0208Hx(6, this, oc, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2097vY R(C1821rM c1821rM, C1658ou c1658ou, boolean z) {
        EnumC1423lJ enumC1423lJ;
        C1216i8 c1216i8 = (C1216i8) this.i;
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        AbstractC0048Bt.n(c1821rM, "arrayType");
        boolean z2 = c1658ou.d;
        KM km = c1821rM.b;
        IM im = km instanceof IM ? (IM) km : null;
        if (im != null) {
            Class cls = im.a;
            if (!AbstractC0048Bt.h(cls, Void.TYPE)) {
                enumC1423lJ = EnumC1791qv.b(cls.getName()).d();
                C0338My c0338My = new C0338My(c1216i8, c1821rM, true);
                if (enumC1423lJ != null) {
                    AbstractC1004ey S = S(km, AbstractC1305jX.J(2, z2, null, 6));
                    if (z2) {
                        return c1198hu.f177o.l().g(z ? 3 : 1, S, c0338My);
                    }
                    return HO.m(c1198hu.f177o.l().g(1, S, c0338My), c1198hu.f177o.l().g(3, S, c0338My).F0(true));
                }
                JR q = c1198hu.f177o.l().q(enumC1423lJ);
                AbstractC1004ey v = AbstractC0772bO.v(q, new C1803r4(new InterfaceC1738q4[]{q.getAnnotations(), c0338My}));
                AbstractC0048Bt.l(v, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                JR jr = (JR) v;
                return z2 ? jr : HO.m(jr, jr.F0(true));
            }
        }
        enumC1423lJ = null;
        C0338My c0338My2 = new C0338My(c1216i8, c1821rM, true);
        if (enumC1423lJ != null) {
        }
    }

    public AbstractC1004ey S(InterfaceC1526mu interfaceC1526mu, C1658ou c1658ou) {
        C1198hu c1198hu = (C1198hu) ((C1216i8) this.i).i;
        if (interfaceC1526mu instanceof IM) {
            Class cls = ((IM) interfaceC1526mu).a;
            EnumC1423lJ d = AbstractC0048Bt.h(cls, Void.TYPE) ? null : EnumC1791qv.b(cls.getName()).d();
            return d != null ? c1198hu.f177o.l().s(d) : c1198hu.f177o.l().w();
        }
        boolean z = false;
        if (!(interfaceC1526mu instanceof C2349zM)) {
            if (interfaceC1526mu instanceof C1821rM) {
                return R((C1821rM) interfaceC1526mu, c1658ou, false);
            }
            if (interfaceC1526mu instanceof NM) {
                KM c = ((NM) interfaceC1526mu).c();
                return c != null ? S(c, c1658ou) : c1198hu.f177o.l().m();
            }
            if (interfaceC1526mu == null) {
                return c1198hu.f177o.l().m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + interfaceC1526mu);
        }
        C2349zM c2349zM = (C2349zM) interfaceC1526mu;
        if (!c1658ou.d && c1658ou.a != 1) {
            z = true;
        }
        boolean d2 = c2349zM.d();
        Type type = c2349zM.a;
        EnumC0247Jk enumC0247Jk = EnumC0247Jk.j;
        if (!d2 && !z) {
            JR n2 = n(c2349zM, c1658ou, null);
            return n2 != null ? n2 : C0273Kk.c(enumC0247Jk, type.toString());
        }
        JR n3 = n(c2349zM, c1658ou.b(3), null);
        if (n3 == null) {
            return C0273Kk.c(enumC0247Jk, type.toString());
        }
        JR n4 = n(c2349zM, c1658ou.b(2), n3);
        return n4 == null ? C0273Kk.c(enumC0247Jk, type.toString()) : d2 ? new C2216xL(n3, n4) : HO.m(n3, n4);
    }

    public void T() {
        ArrayList arrayList = (ArrayList) this.j;
        if (arrayList.isEmpty()) {
            AbstractC1052fg.T("empty stack");
            throw null;
        }
        this.k = arrayList.remove(arrayList.size() - 1);
    }

    @Override // o.YY
    public long a(V3 v3, V3 v32, V3 v33) {
        Iterator it = AbstractC1807r8.c0(0, v3.b()).iterator();
        long j = 0;
        while (((C1131gt) it).j) {
            int nextInt = ((C1131gt) it).nextInt();
            C2177wm d = ((C1818rJ) this.i).d(nextInt);
            v3.a(nextInt);
            v32.a(nextInt);
            v33.a(nextInt);
            j = Math.max(j, d.h * 1000000);
        }
        return j;
    }

    @Override // o.InterfaceC0514Ts
    public ClipDescription b() {
        return (ClipDescription) this.j;
    }

    @Override // o.InterfaceC0514Ts
    public Object c() {
        return null;
    }

    @Override // o.InterfaceC0514Ts
    public Uri e() {
        return (Uri) this.i;
    }

    @Override // o.YY
    public V3 f(long j, V3 v3, V3 v32, V3 v33) {
        if (((V3) this.j) == null) {
            this.j = v3.c();
        }
        V3 v34 = (V3) this.j;
        if (v34 == null) {
            AbstractC0048Bt.i0("valueVector");
            throw null;
        }
        int b = v34.b();
        for (int i = 0; i < b; i++) {
            V3 v35 = (V3) this.j;
            if (v35 == null) {
                AbstractC0048Bt.i0("valueVector");
                throw null;
            }
            v35.d(((C1818rJ) this.i).d(i).b(j, v3.a(i), v32.a(i), v33.a(i)), i);
        }
        V3 v36 = (V3) this.j;
        if (v36 != null) {
            return v36;
        }
        AbstractC0048Bt.i0("valueVector");
        throw null;
    }

    @Override // o.InterfaceC1557nL
    public Object get() {
        switch (this.h) {
            case 19:
                return new C0153Fu((Context) ((InterfaceC1557nL) this.i).get(), (InterfaceC0480Sk) ((InterfaceC1557nL) this.j).get(), (D7) ((C0218Ih) this.k).get());
            case 22:
                long id = Thread.currentThread().getId();
                if (id == X1.a) {
                    return this.k;
                }
                FV fv = (FV) ((AtomicReference) this.i).get();
                int a = fv.a(id);
                if (a >= 0) {
                    return fv.c[a];
                }
                return null;
            default:
                return new C2293yW(new CU(), new GU(4), (ZP) ((C1216i8) this.i).get(), (AY) ((C1370kW) this.j).get(), (M10) ((C1334k) this.k).get());
        }
    }

    @Override // o.InterfaceC0514Ts
    public Uri h() {
        return (Uri) this.k;
    }

    @Override // o.YY
    public V3 j(long j, V3 v3, V3 v32, V3 v33) {
        if (((V3) this.k) == null) {
            this.k = v33.c();
        }
        V3 v34 = (V3) this.k;
        if (v34 == null) {
            AbstractC0048Bt.i0("velocityVector");
            throw null;
        }
        int b = v34.b();
        for (int i = 0; i < b; i++) {
            V3 v35 = (V3) this.k;
            if (v35 == null) {
                AbstractC0048Bt.i0("velocityVector");
                throw null;
            }
            C2177wm d = ((C1818rJ) this.i).d(i);
            float a = v3.a(i);
            float a2 = v32.a(i);
            float a3 = v33.a(i);
            long r = AbstractC1807r8.r(j - d.k, 0L, d.j);
            if (r < 0) {
                a3 = 0.0f;
            } else if (r != 0) {
                a3 = (d.b(r, a, a2, a3) - d.b(r - 1000000, a, a2, a3)) * 1000.0f;
            }
            v35.d(a3, i);
        }
        V3 v36 = (V3) this.k;
        if (v36 != null) {
            return v36;
        }
        AbstractC0048Bt.i0("velocityVector");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    public void k(long j, List list, boolean z) {
        long j2;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        char c;
        EE ee;
        EE ee2;
        C1590ns c1590ns = (C1590ns) this.j;
        CD cd = (CD) this.k;
        int i3 = 0;
        cd.e = 0;
        long[] jArr = cd.a;
        char c2 = 7;
        if (jArr != UP.a) {
            P6.h0(jArr);
            long[] jArr2 = cd.a;
            int i4 = cd.d;
            int i5 = i4 >> 3;
            long j3 = 255 << ((i4 & 7) << 3);
            j2 = 255;
            jArr2[i5] = (jArr2[i5] & (~j3)) | j3;
        } else {
            j2 = 255;
        }
        P6.g0(cd.c, 0, cd.d);
        cd.f = UP.c(cd.d) - cd.e;
        int size = list.size();
        boolean z4 = true;
        C1590ns c1590ns2 = c1590ns;
        int i6 = 0;
        boolean z5 = true;
        while (i6 < size) {
            TC tc = (TC) list.get(i6);
            if (z5) {
                YD yd = (YD) c1590ns2.i;
                int i7 = yd.j;
                if (i7 > 0) {
                    ?? r14 = yd.h;
                    int i8 = 0;
                    while (true) {
                        ee2 = r14[i8];
                        c = c2;
                        if (AbstractC0048Bt.h(((EE) ee2).j, tc)) {
                            break;
                        }
                        int i9 = i8 + 1;
                        if (i9 >= i7) {
                            break;
                        }
                        i8 = i9;
                        c2 = c;
                    }
                } else {
                    c = c2;
                }
                ee2 = 0;
                ee = ee2;
                if (ee != null) {
                    ee.p = true;
                    ee.k.b(j);
                    Object b = cd.b(j);
                    Object obj = b;
                    if (b == null) {
                        HD hd = new HD(0);
                        cd.d(j, hd);
                        obj = hd;
                    }
                    ((HD) obj).a(ee);
                    c1590ns2 = ee;
                    i6++;
                    c2 = c;
                } else {
                    z5 = false;
                }
            } else {
                c = c2;
            }
            ee = new EE(tc);
            ee.k.b(j);
            Object b2 = cd.b(j);
            Object obj2 = b2;
            if (b2 == null) {
                HD hd2 = new HD(0);
                cd.d(j, hd2);
                obj2 = hd2;
            }
            ((HD) obj2).a(ee);
            ((YD) c1590ns2.i).b(ee);
            c1590ns2 = ee;
            i6++;
            c2 = c;
        }
        char c3 = c2;
        if (!z) {
            return;
        }
        long[] jArr3 = cd.b;
        Object[] objArr = cd.c;
        long[] jArr4 = cd.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j4 = jArr4[i10];
            if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = i3;
                while (i13 < i12) {
                    if ((j4 & j2) < 128) {
                        int i14 = (i10 << 3) + i13;
                        i = length;
                        long j5 = jArr3[i14];
                        HD hd3 = (HD) objArr[i14];
                        z3 = z4;
                        YD yd2 = (YD) c1590ns.i;
                        int i15 = yd2.j;
                        if (i15 > 0) {
                            Object[] objArr2 = yd2.h;
                            int i16 = 0;
                            while (true) {
                                i2 = i11;
                                ((EE) objArr2[i16]).B(j5, hd3);
                                int i17 = i16 + 1;
                                if (i17 >= i15) {
                                    break;
                                }
                                i16 = i17;
                                i11 = i2;
                            }
                            j4 >>= i2;
                            i13++;
                            length = i;
                            i11 = i2;
                            z4 = z3;
                        }
                    } else {
                        i = length;
                        z3 = z4;
                    }
                    i2 = i11;
                    j4 >>= i2;
                    i13++;
                    length = i;
                    i11 = i2;
                    z4 = z3;
                }
                int i18 = length;
                z2 = z4;
                if (i12 != i11) {
                    return;
                } else {
                    length = i18;
                }
            } else {
                z2 = z4;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            z4 = z2;
            i3 = 0;
        }
    }

    public F7 l() {
        String str = ((String) this.i) == null ? " backendName" : "";
        if (((EnumC1489mJ) this.k) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new F7((String) this.i, (byte[]) this.j, (EnumC1489mJ) this.k);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void m() {
        ((ArrayList) this.j).clear();
        this.k = this.i;
        C0027Ay c0027Ay = (C0027Ay) this.i;
        C0208Hx c0208Hx = c0027Ay.f;
        YD yd = (YD) c0208Hx.i;
        YD yd2 = (YD) c0208Hx.i;
        int i = yd.j;
        while (true) {
            i--;
            if (-1 >= i) {
                yd2.h();
                ((C1139h0) c0208Hx.j).invoke();
                return;
            }
            c0027Ay.y((C0027Ay) yd2.h[i]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0129, code lost:
    
        if (r9 != 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e9, code lost:
    
        if (r2.isEmpty() == false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0260  */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, o.Iy] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [o.JR] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.pX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JR n(C2349zM c2349zM, C1658ou c1658ou, JR jr) {
        OW m2;
        boolean z;
        OW ow;
        ?? r18;
        SW z2;
        boolean z3;
        SW sw;
        Iterator it;
        boolean z4;
        C1767qX c1767qX;
        Object obj;
        List list;
        C0950e6 c0950e6;
        SW sw2;
        C2349zM c2349zM2;
        AbstractC1701pX f;
        InterfaceC1245ib o2;
        C0950e6 c0950e62 = this;
        C2349zM c2349zM3 = c2349zM;
        C1658ou c1658ou2 = c1658ou;
        int i = c1658ou2.a;
        int i2 = c1658ou2.b;
        boolean z5 = c1658ou2.d;
        C1216i8 c1216i8 = (C1216i8) c0950e62.i;
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        if (jr == null || (m2 = jr.A0()) == null) {
            m2 = AbstractC1494mO.m(new C0338My(c1216i8, c2349zM3, false));
        }
        BM bm = c2349zM3.b;
        if (bm == null) {
            c2349zM3.getClass();
            throw new UnsupportedOperationException("Type not found: " + c2349zM3.a);
        }
        boolean z6 = false;
        if (bm instanceof C2217xM) {
            C2217xM c2217xM = (C2217xM) bm;
            C2245xo c = c2217xM.c();
            r18 = 0;
            if (z5 && c.equals(AbstractC2119vu.a)) {
                YM ym = c1198hu.p;
                C0140Fh c0140Fh = ym.c;
                z = z5;
                InterfaceC0937dx interfaceC0937dx = YM.e[0];
                c0140Fh.getClass();
                AbstractC0048Bt.n(interfaceC0937dx, "property");
                C0827cE e = C0827cE.e(AbstractC0022At.k(interfaceC0937dx.getName()));
                ow = m2;
                InterfaceC2364zb g = ((WB) ym.b.getValue()).g(e, DE.i);
                InterfaceC1245ib interfaceC1245ib = g instanceof InterfaceC1245ib ? (InterfaceC1245ib) g : null;
                o2 = interfaceC1245ib == null ? ym.a.x(new C1639ob(AbstractC1499mT.h, e), AbstractC0868ct.J(1)) : interfaceC1245ib;
            } else {
                z = z5;
                ow = m2;
                o2 = HO.o(c, c1198hu.f177o.l());
                if (o2 == null) {
                    o2 = null;
                } else {
                    String str = C1460lu.a;
                    C2377zo g2 = AbstractC0114Eh.g(o2);
                    HashMap hashMap = C1460lu.k;
                    if (hashMap.containsKey(g2)) {
                        if (i2 != 3 && i != 1) {
                            InterfaceC1526mu interfaceC1526mu = (InterfaceC1526mu) AbstractC0720ac.w0(c2349zM3.c());
                            NM nm = interfaceC1526mu instanceof NM ? (NM) interfaceC1526mu : null;
                            if (nm != null && nm.c() != null) {
                                Type[] upperBounds = nm.a.getUpperBounds();
                                AbstractC0048Bt.m(upperBounds, "reflectType.upperBounds");
                                if (AbstractC0048Bt.h(P6.k0(upperBounds), Object.class)) {
                                    C2377zo g3 = AbstractC0114Eh.g(o2);
                                    String str2 = C1460lu.a;
                                    C2245xo c2245xo = (C2245xo) hashMap.get(g3);
                                    if (c2245xo == null) {
                                        throw new IllegalArgumentException("Given class " + o2 + " is not a read-only collection");
                                    }
                                    List parameters = AbstractC0192Hh.e(o2).i(c2245xo).z().getParameters();
                                    AbstractC0048Bt.m(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                    InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) AbstractC0720ac.w0(parameters);
                                    if (interfaceC1437lX != null) {
                                        int Y = interfaceC1437lX.Y();
                                        if (Y != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        o2 = HO.j(o2);
                    }
                }
            }
            if (o2 == null) {
                C1818rJ c1818rJ = c1198hu.k;
                c1818rJ.getClass();
                C1590ns c1590ns = (C1590ns) c1818rJ.i;
                if (c1590ns == null) {
                    AbstractC0048Bt.i0("resolver");
                    throw null;
                }
                o2 = c1590ns.q(c2217xM);
            }
            if (o2 == null || (z2 = o2.z()) == null) {
                c2349zM3.getClass();
                throw new UnsupportedOperationException("Type not found: " + c2349zM3.a);
            }
        } else {
            z = z5;
            ow = m2;
            r18 = 0;
            r18 = 0;
            if (!(bm instanceof LM)) {
                throw new IllegalStateException("Unknown classifier kind: " + bm);
            }
            InterfaceC1437lX h = ((InterfaceC1569nX) c0950e62.j).h((LM) bm);
            z2 = h != null ? h.z() : null;
        }
        if (z2 == null) {
            return r18;
        }
        boolean z7 = (i2 == 3 || z || i == 1) ? false : true;
        if (AbstractC0048Bt.h(jr != null ? jr.B0() : r18, z2) && !c2349zM3.d() && z7) {
            return jr.F0(true);
        }
        if (!c2349zM3.d()) {
            if (c2349zM3.c().isEmpty()) {
                List parameters2 = z2.getParameters();
                AbstractC0048Bt.m(parameters2, "constructor.parameters");
            }
            z3 = false;
            List<InterfaceC1437lX> parameters3 = z2.getParameters();
            AbstractC0048Bt.m(parameters3, "constructor.parameters");
            if (z3) {
                sw = z2;
                if (parameters3.size() == c2349zM3.c().size()) {
                    S6 N0 = AbstractC0720ac.N0(c2349zM3.c());
                    ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(N0));
                    Iterator it2 = N0.iterator();
                    while (true) {
                        C1779qj c1779qj = (C1779qj) it2;
                        if (!c1779qj.i.hasNext()) {
                            list = AbstractC0720ac.J0(arrayList);
                            break;
                        }
                        C0021As c0021As = (C0021As) c1779qj.next();
                        int i3 = c0021As.a;
                        InterfaceC1526mu interfaceC1526mu2 = (InterfaceC1526mu) c0021As.b;
                        parameters3.size();
                        InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) parameters3.get(i3);
                        C1658ou J = AbstractC1305jX.J(2, z6, null, 7);
                        AbstractC0048Bt.m(interfaceC1437lX2, "parameter");
                        if (interfaceC1526mu2 instanceof NM) {
                            NM nm2 = (NM) interfaceC1526mu2;
                            KM c2 = nm2.c();
                            Type[] upperBounds2 = nm2.a.getUpperBounds();
                            AbstractC0048Bt.m(upperBounds2, "reflectType.upperBounds");
                            int i4 = !AbstractC0048Bt.h(P6.k0(upperBounds2), Object.class) ? 3 : 2;
                            if (c2 == null || !(interfaceC1437lX2.Y() == 1 || i4 == interfaceC1437lX2.Y())) {
                                it = it2;
                                z4 = false;
                                c1767qX = AbstractC2228xX.k(interfaceC1437lX2, J);
                            } else {
                                AbstractC0048Bt.n(nm2, "wildcardType");
                                if (nm2.c() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                Iterator it3 = new C0338My(c1216i8, nm2, false).iterator();
                                while (true) {
                                    C0663Zl c0663Zl = (C0663Zl) it3;
                                    if (!c0663Zl.hasNext()) {
                                        it = it2;
                                        obj = null;
                                        break;
                                    }
                                    obj = c0663Zl.next();
                                    InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) obj;
                                    C2245xo[] c2245xoArr = AbstractC1000eu.b;
                                    it = it2;
                                    int length = c2245xoArr.length;
                                    Iterator it4 = it3;
                                    int i5 = 0;
                                    while (i5 < length) {
                                        int i6 = length;
                                        int i7 = i5;
                                        if (AbstractC0048Bt.h(interfaceC0948e4.e(), c2245xoArr[i5])) {
                                            break;
                                        }
                                        i5 = i7 + 1;
                                        length = i6;
                                    }
                                    it2 = it;
                                    it3 = it4;
                                }
                                InterfaceC0948e4 interfaceC0948e42 = (InterfaceC0948e4) obj;
                                z4 = false;
                                AbstractC1004ey S = c0950e62.S(c2, AbstractC1305jX.J(2, false, null, 7));
                                if (interfaceC0948e42 != null) {
                                    ArrayList z0 = AbstractC0720ac.z0(S.getAnnotations(), interfaceC0948e42);
                                    S = AbstractC0772bO.v(S, z0.isEmpty() ? C0460Rq.t : new C1803r4(false ? 1 : 0, z0));
                                }
                                c1767qX = AbstractC0772bO.f(S, i4, interfaceC1437lX2);
                            }
                        } else {
                            it = it2;
                            z4 = false;
                            c1767qX = new C1767qX(1, c0950e62.S(interfaceC1526mu2, J));
                        }
                        arrayList.add(c1767qX);
                        it2 = it;
                        z6 = z4;
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters3));
                    Iterator it5 = parameters3.iterator();
                    while (it5.hasNext()) {
                        String b = ((InterfaceC1437lX) it5.next()).getName().b();
                        AbstractC0048Bt.m(b, "p.name.asString()");
                        arrayList2.add(new C1767qX(1, C0273Kk.c(EnumC0247Jk.z, b)));
                    }
                    list = AbstractC0720ac.J0(arrayList2);
                }
            } else {
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(parameters3));
                SW sw3 = r18;
                for (InterfaceC1437lX interfaceC1437lX3 : parameters3) {
                    if (AbstractC0772bO.p(interfaceC1437lX3, sw3, c1658ou2.e)) {
                        f = AbstractC2228xX.k(interfaceC1437lX3, c1658ou2);
                        c2349zM2 = c2349zM3;
                        sw2 = z2;
                        c0950e6 = c0950e62;
                    } else {
                        SW sw4 = z2;
                        c0950e6 = c0950e62;
                        sw2 = sw4;
                        c2349zM2 = c2349zM3;
                        f = C0218Ih.f(interfaceC1437lX3, C1658ou.a(c1658ou, 0, c2349zM2.d(), null, null, 59), (C0208Hx) c0950e6.k, new C2124vz(c1198hu.a, new C2053uu(c0950e62, interfaceC1437lX3, c1658ou, sw4, c2349zM3)));
                    }
                    arrayList3.add(f);
                    c1658ou2 = c1658ou;
                    c0950e62 = c0950e6;
                    c2349zM3 = c2349zM2;
                    z2 = sw2;
                    sw3 = null;
                }
                sw = z2;
                list = arrayList3;
            }
            return HO.r(list, ow, sw, z7);
        }
        z3 = true;
        List<InterfaceC1437lX> parameters32 = z2.getParameters();
        AbstractC0048Bt.m(parameters32, "constructor.parameters");
        if (z3) {
        }
        return HO.r(list, ow, sw, z7);
    }

    public C0512Tq o() {
        InterfaceC0538Uq c0801br;
        C0512Tq c0512Tq;
        synchronized (this.j) {
            try {
                S2 s2 = (S2) this.i;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    A3.a(s2);
                }
                if (i >= 29) {
                    c0801br = new C0668Zq();
                } else if (n) {
                    try {
                        c0801br = new C0616Xq((S2) this.i, new C1178ha(), new C1112ga());
                    } catch (Throwable unused) {
                        n = false;
                        c0801br = new C0801br(G((S2) this.i));
                    }
                } else {
                    c0801br = new C0801br(G((S2) this.i));
                }
                c0512Tq = new C0512Tq(c0801br);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0512Tq;
    }

    public void q(Bundle bundle) {
        HashSet hashSet = (HashSet) this.j;
        String string = ((Context) this.k).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0229Is.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    u((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0057Cc(e);
            }
        }
    }

    public boolean r(C2002u5 c2002u5, boolean z) {
        boolean z2;
        boolean z3;
        C1590ns c1590ns = (C1590ns) this.j;
        boolean h = c1590ns.h((C1219iB) c2002u5.i, (InterfaceC1991ty) this.i, c2002u5, z);
        YD yd = (YD) c1590ns.i;
        if (h) {
            int i = yd.j;
            if (i > 0) {
                Object[] objArr = yd.h;
                int i2 = 0;
                z2 = false;
                do {
                    z2 = ((EE) objArr[i2]).A(c2002u5, z) || z2;
                    i2++;
                } while (i2 < i);
            } else {
                z2 = false;
            }
            int i3 = yd.j;
            if (i3 > 0) {
                Object[] objArr2 = yd.h;
                int i4 = 0;
                z3 = false;
                do {
                    z3 = ((EE) objArr2[i4]).z(c2002u5) || z3;
                    i4++;
                } while (i4 < i3);
            } else {
                z3 = false;
            }
            c1590ns.i(c2002u5);
            if (z3 || z2) {
                return true;
            }
        }
        return false;
    }

    public void s(int i, EnumC2192x0 enumC2192x0) {
        ((FlutterJNI) this.j).dispatchSemanticsAction(i, enumC2192x0);
    }

    public void t(int i, EnumC2192x0 enumC2192x0, Serializable serializable) {
        ((FlutterJNI) this.j).dispatchSemanticsAction(i, enumC2192x0, serializable);
    }

    public Object u(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.i;
        if (ZM.h()) {
            try {
                Trace.beginSection(ZM.l(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0229Is interfaceC0229Is = (InterfaceC0229Is) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = interfaceC0229Is.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            u(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0229Is.b((Context) this.k);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0057Cc(th2);
            }
        }
        Trace.endSection();
        return obj;
    }

    public void v(Object obj) {
        ((ArrayList) this.j).add(this.k);
        this.k = obj;
    }

    public ColorStateList w(int i) {
        int resourceId;
        ColorStateList s;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (s = EB.s((Context) this.k, resourceId)) == null) ? typedArray.getColorStateList(i) : s;
    }

    public Drawable x(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : EB.t((Context) this.k, resourceId);
    }

    public Drawable y(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.i).hasValue(i) || (resourceId = ((TypedArray) this.i).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1409l5 a = C1409l5.a();
        Context context = (Context) this.k;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface z(int i, int i2, M5 m5) {
        int resourceId = ((TypedArray) this.i).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.j) == null) {
                this.j = new TypedValue();
            }
            Context context = (Context) this.k;
            TypedValue typedValue = (TypedValue) this.j;
            ThreadLocal threadLocal = AbstractC0706aO.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    m5.a(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                C1679pB c1679pB = BX.b;
                Typeface typeface = (Typeface) c1679pB.a(BX.b(resources, resourceId, charSequence2, i3, i2));
                int i4 = 8;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1866s2(m5, i4, typeface));
                    return typeface;
                }
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        InterfaceC1126go C = AbstractC0022At.C(resources.getXml(resourceId), resources);
                        if (C != null) {
                            return BX.a(context, C, resources, resourceId, charSequence2, typedValue.assetCookie, i2, m5, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        m5.a(-3);
                        return null;
                    }
                    int i5 = typedValue.assetCookie;
                    Typeface i6 = BX.a.i(context, resources, resourceId, charSequence2, i2);
                    if (i6 != null) {
                        c1679pB.b(BX.b(resources, resourceId, charSequence2, i5, i2), i6);
                    }
                    if (i6 != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC1866s2(m5, i4, i6));
                    } else {
                        m5.a(-3);
                    }
                    return i6;
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    m5.a(-3);
                    return null;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    m5.a(-3);
                    return null;
                }
            }
        }
        return null;
    }

    public /* synthetic */ C0950e6(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    public C0950e6(Set set, String str, String str2) {
        this.h = 7;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.j = str2;
        this.k = BR.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.i = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public C0950e6(C0659Zh c0659Zh, C0853ce c0853ce) {
        this.h = 17;
        this.i = c0659Zh;
        this.j = c0853ce;
        this.k = new ConcurrentHashMap();
    }

    public C0950e6(F7 f7, C1845rk c1845rk, C1574nc c1574nc, C2293yW c2293yW) {
        this.h = 24;
        this.i = f7;
        this.j = c1845rk;
        this.k = c2293yW;
    }

    public C0950e6(C1197ht c1197ht, Method[] methodArr, Method method) {
        this.h = 11;
        AbstractC0048Bt.n(c1197ht, "argumentRange");
        this.i = c1197ht;
        this.j = methodArr;
        this.k = method;
    }

    public C0950e6(InterfaceC1991ty interfaceC1991ty) {
        this.h = 10;
        this.i = interfaceC1991ty;
        this.j = new C1590ns(17, (byte) 0);
        CD cd = new CD();
        cd.a = UP.a;
        cd.b = AbstractC1153hB.a;
        cd.c = AbstractC1473m3.d;
        cd.c(UP.f(10));
        this.k = cd;
    }

    public C0950e6(C1216i8 c1216i8, InterfaceC1569nX interfaceC1569nX) {
        this.h = 13;
        AbstractC0048Bt.n(interfaceC1569nX, "typeParameterResolver");
        this.i = c1216i8;
        this.j = interfaceC1569nX;
        this.k = new C0208Hx(new C0218Ih(19));
    }

    public C0950e6(S2 s2) {
        this.h = 2;
        this.i = s2;
        this.j = new Object();
    }

    public C0950e6(InterfaceC0004Ab interfaceC0004Ab, List list, C0950e6 c0950e6) {
        this.h = 18;
        AbstractC0048Bt.n(interfaceC0004Ab, "classifierDescriptor");
        AbstractC0048Bt.n(list, "arguments");
        this.i = interfaceC0004Ab;
        this.j = list;
        this.k = c0950e6;
    }

    @Override // o.InterfaceC0514Ts
    public void g() {
    }

    public C0950e6(Context context, TypedArray typedArray) {
        this.h = 23;
        this.k = context;
        this.i = typedArray;
    }

    public C0950e6(Context context, LocationManager locationManager) {
        this.h = 26;
        this.j = new JW();
        this.k = context;
        this.i = locationManager;
    }

    public C0950e6(Context context) {
        this.h = 0;
        this.k = context.getApplicationContext();
        this.j = new HashSet();
        this.i = new HashMap();
    }

    public C0950e6(C1183hf c1183hf, FlutterJNI flutterJNI) {
        this.h = 1;
        Y1 y1 = new Y1(3, this);
        C0950e6 c0950e6 = new C0950e6(c1183hf, "flutter/accessibility", C1301jT.h, 4);
        this.i = c0950e6;
        c1183hf.R("flutter/accessibility", new C2002u5(c0950e6, 10, y1));
        this.j = flutterJNI;
    }

    public C0950e6(InterfaceC0337Mx interfaceC0337Mx) {
        this.h = 14;
        this.j = new HashSet();
        this.k = interfaceC0337Mx;
        C0068Cn c0068Cn = (C0068Cn) interfaceC0337Mx;
        this.i = new InterfaceC0311Lx[]{new C0052Bx(c0068Cn.getBinaryMessenger()), new C2002u5(new C0104Dx(c0068Cn.getBinaryMessenger()))};
        new C1590ns(c0068Cn.getBinaryMessenger()).i = this;
    }

    public C0950e6(C1334k c1334k, C0218Ih c0218Ih, C2303yg c2303yg, Set set) {
        this.h = 8;
        this.i = c0218Ih;
        this.j = c1334k;
        this.k = c2303yg;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new C0457Rn(str, 3));
        }
    }

    public C0950e6(int i) {
        this.h = i;
        switch (i) {
            case 22:
                this.i = new AtomicReference(AbstractC0946e20.g);
                this.j = new Object();
                break;
            case 27:
                this.i = new WeakHashMap();
                this.j = new WeakHashMap();
                this.k = new WeakHashMap();
                break;
            default:
                this.i = new ConcurrentLinkedQueue();
                break;
        }
    }

    public C0950e6(C0027Ay c0027Ay) {
        this.h = 28;
        this.i = c0027Ay;
        this.j = new ArrayList();
        this.k = c0027Ay;
    }

    public C0950e6(C1818rJ c1818rJ) {
        this.h = 21;
        this.i = c1818rJ;
        this.j = new ReentrantLock();
        this.k = new WeakHashMap();
    }

    public C0950e6(C2177wm c2177wm) {
        this.h = 29;
        this.i = new C1818rJ(23, c2177wm);
    }
}
