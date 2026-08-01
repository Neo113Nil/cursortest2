package K;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import b0.AbstractC0082b;
import b0.C0083c;
import c0.C0088b;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0196S;
import l.C0236t;
import t.C0331b;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014m {
    public static C0014m d;

    /* renamed from: a, reason: collision with root package name */
    public Object f424a;

    /* renamed from: b, reason: collision with root package name */
    public Object f425b;

    /* renamed from: c, reason: collision with root package name */
    public Object f426c;

    public C0014m(androidx.lifecycle.Q q2, androidx.lifecycle.P p2, AbstractC0082b abstractC0082b) {
        g1.f.e(q2, "store");
        g1.f.e(abstractC0082b, "extras");
        this.f424a = q2;
        this.f425b = p2;
        this.f426c = abstractC0082b;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        U.z[] zVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (U.z[]) editable.getSpans(selectionStart, selectionEnd, U.z.class)) != null && zVarArr.length > 0) {
            for (U.z zVar : zVarArr) {
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0014m i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0014m(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList E2;
        TypedArray typedArray = (TypedArray) this.f425b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (E2 = A.c.E((Context) this.f424a, resourceId)) == null) ? typedArray.getColorStateList(i) : E2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f425b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : T.e.w((Context) this.f424a, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f425b).hasValue(i) || (resourceId = ((TypedArray) this.f425b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0236t a2 = C0236t.a();
        Context context = (Context) this.f424a;
        synchronized (a2) {
            d2 = a2.f3079a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, C0196S c0196s) {
        int resourceId = ((TypedArray) this.f425b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f426c) == null) {
            this.f426c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f426c;
        ThreadLocal threadLocal = B.r.f69a;
        Context context = (Context) this.f424a;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, c0196s, true, false);
    }

    public androidx.lifecycle.O f(g1.c cVar, String str) {
        boolean isInstance;
        androidx.lifecycle.O b2;
        g1.f.e(str, "key");
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) this.f424a;
        q2.getClass();
        LinkedHashMap linkedHashMap = q2.f1504a;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) linkedHashMap.get(str);
        Class cls = cVar.f2579a;
        g1.f.e(cls, "jClass");
        Map map = g1.c.f2577b;
        g1.f.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = g1.l.b(num.intValue(), o2);
        } else {
            if (cls.isPrimitive()) {
                cls = T.e.A(g1.j.a(cls));
            }
            isInstance = cls.isInstance(o2);
        }
        androidx.lifecycle.P p2 = (androidx.lifecycle.P) this.f425b;
        if (isInstance) {
            if (p2 instanceof androidx.lifecycle.N) {
                g1.f.b(o2);
            }
            g1.f.c(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return o2;
        }
        C0083c c0083c = new C0083c((AbstractC0082b) this.f426c);
        c0083c.f1725a.put(C0088b.f1735a, str);
        try {
            try {
                p2.getClass();
                b2 = p2.a(T.e.z(cVar), c0083c);
            } catch (AbstractMethodError unused) {
                b2 = p2.b(T.e.z(cVar));
            }
        } catch (AbstractMethodError unused2) {
            b2 = p2.a(T.e.z(cVar), c0083c);
        }
        g1.f.e(b2, "viewModel");
        androidx.lifecycle.O o3 = (androidx.lifecycle.O) linkedHashMap.put(str, b2);
        if (o3 != null) {
            o3.a();
        }
        return b2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, U.y yVar) {
        if ((yVar.f858c & 3) == 0) {
            U.d dVar = (U.d) this.f426c;
            V.a c2 = yVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f362a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f810b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f811a;
            String sb2 = sb.toString();
            int i3 = C.f.f97a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = yVar.f858c & 4;
            yVar.f858c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f858c & 3) == 2;
    }

    public boolean h(int i, s.d dVar, v.f fVar) {
        int[] iArr = dVar.f3555p0;
        int i2 = iArr[0];
        C0331b c0331b = (C0331b) this.f425b;
        c0331b.f3724a = i2;
        c0331b.f3725b = iArr[1];
        c0331b.f3726c = dVar.q();
        c0331b.d = dVar.k();
        c0331b.i = false;
        c0331b.f3730j = i;
        boolean z2 = c0331b.f3724a == 3;
        boolean z3 = c0331b.f3725b == 3;
        boolean z4 = z2 && dVar.f3524W > RecyclerView.f1570A0;
        boolean z5 = z3 && dVar.f3524W > RecyclerView.f1570A0;
        int[] iArr2 = dVar.f3559t;
        if (z4 && iArr2[0] == 4) {
            c0331b.f3724a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0331b.f3725b = 1;
        }
        fVar.b(dVar, c0331b);
        dVar.O(c0331b.f3727e);
        dVar.L(c0331b.f3728f);
        dVar.f3507E = c0331b.h;
        dVar.I(c0331b.f3729g);
        c0331b.f3730j = 0;
        return c0331b.i;
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.r rVar = new U.r((U.u) ((U.v) this.f425b).f851c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = rVar.f838c.f847a;
                U.u uVar = sparseArray == null ? null : (U.u) sparseArray.get(codePointAt);
                if (rVar.f836a == 2) {
                    if (uVar != null) {
                        rVar.f838c = uVar;
                        rVar.f840f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            U.u uVar2 = rVar.f838c;
                            if (uVar2.f848b != null) {
                                if (rVar.f840f != 1) {
                                    rVar.d = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.d = rVar.f838c;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c2 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (uVar == null) {
                    rVar.a();
                    c2 = 1;
                } else {
                    rVar.f836a = 2;
                    rVar.f838c = uVar;
                    rVar.f840f = 1;
                    c2 = 2;
                }
                rVar.f839e = codePointAt;
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
                    if (z2 || !g(charSequence, i4, i6, rVar.d.f848b)) {
                        z3 = pVar.d(charSequence, i4, i6, rVar.d.f848b);
                        i5++;
                    }
                }
            }
        }
        if (rVar.f836a == 2 && rVar.f838c.f848b != null && ((rVar.f840f > 1 || rVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, rVar.f838c.f848b)))) {
            pVar.d(charSequence, i4, i6, rVar.f838c.f848b);
        }
        return pVar.b();
    }

    public void k() {
        ((TypedArray) this.f425b).recycle();
    }

    public void l(s.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3531b0;
        int i5 = eVar.f3533c0;
        eVar.f3531b0 = 0;
        eVar.f3533c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3531b0 = 0;
        } else {
            eVar.f3531b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3533c0 = 0;
        } else {
            eVar.f3533c0 = i5;
        }
        s.e eVar2 = (s.e) this.f426c;
        eVar2.f3578t0 = i;
        eVar2.U();
    }

    public void m(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f424a;
        arrayList.clear();
        int size = eVar.f3576q0.size();
        for (int i = 0; i < size; i++) {
            s.d dVar = (s.d) eVar.f3576q0.get(i);
            int[] iArr = dVar.f3555p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3577s0.f3734b = true;
    }

    public C0014m(Method method, Method method2, Method method3) {
        this.f424a = method;
        this.f425b = method2;
        this.f426c = method3;
    }

    public C0014m(Runnable runnable) {
        this.f425b = new CopyOnWriteArrayList();
        this.f426c = new HashMap();
        this.f424a = runnable;
    }

    public C0014m(Context context, TypedArray typedArray) {
        this.f424a = context;
        this.f425b = typedArray;
    }
}
