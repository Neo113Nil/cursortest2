package K;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0076b;
import f0.C0098b;
import f0.C0121z;
import g.C0129H;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0254v;
import s.C0296d;
import s.C0297e;
import t.C0300b;
import v.C0322f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: e, reason: collision with root package name */
    public static C0011l f411e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f412a;

    /* renamed from: b, reason: collision with root package name */
    public Object f413b;

    /* renamed from: c, reason: collision with root package name */
    public Object f414c;
    public Object d;

    public /* synthetic */ C0011l() {
        this.f412a = 6;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        T.y[] yVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (T.y[]) editable.getSpans(selectionStart, selectionEnd, T.y.class)) != null && yVarArr.length > 0) {
            for (T.y yVar : yVarArr) {
                int spanStart = editable.getSpanStart(yVar);
                int spanEnd = editable.getSpanEnd(yVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0011l r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0011l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0121z) this.f413b).f2191a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0098b) this.f414c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0121z) this.f413b).f2191a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0098b) this.f414c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2020j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0098b) this.f414c).g(k2);
        RecyclerView recyclerView = ((C0121z) this.f413b).f2191a;
        View childAt = recyclerView.getChildAt(k2);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.k() && !I2.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.a(256);
        }
        recyclerView.detachViewFromParent(k2);
    }

    public View e(int i) {
        return ((C0121z) this.f413b).f2191a.getChildAt(k(i));
    }

    public int f() {
        return ((C0121z) this.f413b).f2191a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList p2;
        TypedArray typedArray = (TypedArray) this.f414c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (p2 = q1.d.p((Context) this.f413b, resourceId)) == null) ? typedArray.getColorStateList(i) : p2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f414c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : q1.d.u((Context) this.f413b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f414c).hasValue(i) || (resourceId = ((TypedArray) this.f414c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0254v a2 = C0254v.a();
        Context context = (Context) this.f413b;
        synchronized (a2) {
            d = a2.f3080a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, l.U u2) {
        int resourceId = ((TypedArray) this.f414c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f41a;
        Context context = (Context) this.f413b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, u2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0121z) this.f413b).f2191a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0098b c0098b = (C0098b) this.f414c;
            int b2 = i - (i2 - c0098b.b(i2));
            if (b2 == 0) {
                while (c0098b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0121z) this.f413b).f2191a.getChildAt(i);
    }

    public int m() {
        return ((C0121z) this.f413b).f2191a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(X0.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        X0.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f413b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1349a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f1015a;
        Map map = X0.b.f1013b;
        X0.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof P0.a) {
                if ((m2 instanceof X0.c ? ((X0.c) m2).b() : m2 instanceof W0.a ? 0 : m2 instanceof W0.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = q1.l.H(X0.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f414c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                X0.d.b(m2);
            }
            X0.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        a0.c cVar = new a0.c((a0.b) this.d);
        cVar.f1106a.put(C0076b.f1505a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(q1.l.G(bVar), cVar);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(q1.l.G(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(q1.l.G(bVar), cVar);
        }
        X0.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.x xVar) {
        if ((xVar.f759c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f350a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f713b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f714a;
            String sb2 = sb.toString();
            int i3 = C.e.f57a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f759c & 4;
            xVar.f759c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f759c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0121z c0121z = (C0121z) this.f413b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2027q;
            View view2 = I2.f2014a;
            if (i != -1) {
                I2.f2026p = i;
            } else {
                WeakHashMap weakHashMap = S.f360a;
                I2.f2026p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0121z.f2191a;
            if (recyclerView.L()) {
                I2.f2027q = 4;
                recyclerView.f1462p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f360a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0296d c0296d, C0322f c0322f) {
        int[] iArr = c0296d.f3673p0;
        int i2 = iArr[0];
        C0300b c0300b = (C0300b) this.f414c;
        c0300b.f3765a = i2;
        c0300b.f3766b = iArr[1];
        c0300b.f3767c = c0296d.q();
        c0300b.d = c0296d.k();
        c0300b.i = false;
        c0300b.f3771j = i;
        boolean z2 = c0300b.f3765a == 3;
        boolean z3 = c0300b.f3766b == 3;
        boolean z4 = z2 && c0296d.f3642W > 0.0f;
        boolean z5 = z3 && c0296d.f3642W > 0.0f;
        int[] iArr2 = c0296d.f3677t;
        if (z4 && iArr2[0] == 4) {
            c0300b.f3765a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0300b.f3766b = 1;
        }
        c0322f.b(c0296d, c0300b);
        c0296d.O(c0300b.f3768e);
        c0296d.L(c0300b.f3769f);
        c0296d.f3625E = c0300b.h;
        c0296d.I(c0300b.f3770g);
        c0300b.f3771j = 0;
        return c0300b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.p pVar) {
        int i4;
        char c2;
        T.q qVar = new T.q((T.t) ((T.u) this.f414c).f752c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f739c.f748a;
                T.t tVar = sparseArray == null ? null : (T.t) sparseArray.get(codePointAt);
                if (qVar.f737a == 2) {
                    if (tVar != null) {
                        qVar.f739c = tVar;
                        qVar.f741f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            T.t tVar2 = qVar.f739c;
                            if (tVar2.f749b != null) {
                                if (qVar.f741f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f739c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (tVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f737a = 2;
                    qVar.f739c = tVar;
                    qVar.f741f = 1;
                    c2 = 2;
                }
                qVar.f740e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f749b)) {
                        z3 = pVar.n(charSequence, i4, i6, qVar.d.f749b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f737a == 2 && qVar.f739c.f749b != null && ((qVar.f741f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f739c.f749b)))) {
            pVar.n(charSequence, i4, i6, qVar.f739c.f749b);
        }
        return pVar.g();
    }

    public void t() {
        ((TypedArray) this.f414c).recycle();
    }

    public String toString() {
        switch (this.f412a) {
            case 3:
                return ((C0098b) this.f414c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0297e c0297e, int i, int i2, int i3) {
        int i4 = c0297e.f3649b0;
        int i5 = c0297e.f3651c0;
        c0297e.f3649b0 = 0;
        c0297e.f3651c0 = 0;
        c0297e.O(i2);
        c0297e.L(i3);
        if (i4 < 0) {
            c0297e.f3649b0 = 0;
        } else {
            c0297e.f3649b0 = i4;
        }
        if (i5 < 0) {
            c0297e.f3651c0 = 0;
        } else {
            c0297e.f3651c0 = i5;
        }
        C0297e c0297e2 = (C0297e) this.d;
        c0297e2.f3698t0 = i;
        c0297e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0121z c0121z = (C0121z) this.f413b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2026p;
                RecyclerView recyclerView = c0121z.f2191a;
                if (recyclerView.L()) {
                    I2.f2027q = i;
                    recyclerView.f1462p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f360a;
                    I2.f2014a.setImportantForAccessibility(i);
                }
                I2.f2026p = 0;
            }
        }
    }

    public void w(C0297e c0297e) {
        ArrayList arrayList = (ArrayList) this.f413b;
        arrayList.clear();
        int size = c0297e.f3695q0.size();
        for (int i = 0; i < size; i++) {
            C0296d c0296d = (C0296d) c0297e.f3695q0.get(i);
            int[] iArr = c0296d.f3673p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0296d);
            }
        }
        c0297e.f3697s0.f3775b = true;
    }

    public C0011l(Method method, Method method2, Method method3) {
        this.f412a = 7;
        this.f413b = method;
        this.f414c = method2;
        this.d = method3;
    }

    public C0011l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, a0.b bVar) {
        this.f412a = 2;
        X0.d.e(o2, "store");
        X0.d.e(bVar, "extras");
        this.f413b = o2;
        this.f414c = n2;
        this.d = bVar;
    }

    public C0011l(C0121z c0121z) {
        this.f412a = 3;
        this.f413b = c0121z;
        this.f414c = new C0098b();
        this.d = new ArrayList();
    }

    public C0011l(Runnable runnable) {
        this.f412a = 0;
        this.f414c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f413b = runnable;
    }

    public C0011l(Context context, TypedArray typedArray) {
        this.f412a = 5;
        this.f413b = context;
        this.f414c = typedArray;
    }

    public C0011l(Context context, LocationManager locationManager) {
        this.f412a = 4;
        this.d = new C0129H();
        this.f413b = context;
        this.f414c = locationManager;
    }

    public C0011l(C0297e c0297e) {
        this.f412a = 8;
        this.f413b = new ArrayList();
        this.f414c = new C0300b();
        this.d = c0297e;
    }

    public C0011l(T.u uVar, J0.e eVar, T.d dVar, Set set) {
        this.f412a = 1;
        this.f413b = eVar;
        this.f414c = uVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new C.g(13, str));
        }
    }
}
