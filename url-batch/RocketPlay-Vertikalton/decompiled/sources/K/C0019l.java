package K;

import a1.AbstractC0067d;
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
import b0.AbstractC0090b;
import b0.C0091c;
import c1.AbstractC0104b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0279u;
import t.C0365b;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019l {
    public static C0019l d;

    /* renamed from: a, reason: collision with root package name */
    public Object f683a;

    /* renamed from: b, reason: collision with root package name */
    public Object f684b;

    /* renamed from: c, reason: collision with root package name */
    public Object f685c;

    public C0019l(androidx.lifecycle.Q q2, androidx.lifecycle.P p2, AbstractC0090b abstractC0090b) {
        i1.f.e(q2, "store");
        i1.f.e(abstractC0090b, "extras");
        this.f683a = q2;
        this.f684b = p2;
        this.f685c = abstractC0090b;
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

    public static C0019l i(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0019l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList D2;
        TypedArray typedArray = (TypedArray) this.f684b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = F1.d.D((Context) this.f683a, resourceId)) == null) ? typedArray.getColorStateList(i) : D2;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f684b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0067d.k((Context) this.f683a, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f684b).hasValue(i) || (resourceId = ((TypedArray) this.f684b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0279u a2 = C0279u.a();
        Context context = (Context) this.f683a;
        synchronized (a2) {
            d2 = a2.f3510a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface e(int i, int i2, l.T t2) {
        int resourceId = ((TypedArray) this.f684b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f685c) == null) {
            this.f685c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f685c;
        ThreadLocal threadLocal = B.r.f85a;
        Context context = (Context) this.f683a;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public androidx.lifecycle.O f(i1.c cVar, String str) {
        boolean isInstance;
        androidx.lifecycle.O b2;
        i1.f.e(str, "key");
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) this.f683a;
        q2.getClass();
        LinkedHashMap linkedHashMap = q2.f1883a;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) linkedHashMap.get(str);
        Class cls = cVar.f3046a;
        i1.f.e(cls, "jClass");
        Map map = i1.c.f3044b;
        i1.f.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = i1.l.b(num.intValue(), o2);
        } else {
            if (cls.isPrimitive()) {
                cls = AbstractC0104b.o(i1.j.a(cls));
            }
            isInstance = cls.isInstance(o2);
        }
        androidx.lifecycle.P p2 = (androidx.lifecycle.P) this.f684b;
        if (isInstance) {
            if (p2 instanceof androidx.lifecycle.N) {
                i1.f.b(o2);
            }
            i1.f.c(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return o2;
        }
        C0091c c0091c = new C0091c((AbstractC0090b) this.f685c);
        c0091c.f2102a.put(c0.b.f2115a, str);
        try {
            try {
                p2.getClass();
                b2 = p2.a(AbstractC0104b.n(cVar), c0091c);
            } catch (AbstractMethodError unused) {
                b2 = p2.b(AbstractC0104b.n(cVar));
            }
        } catch (AbstractMethodError unused2) {
            b2 = p2.a(AbstractC0104b.n(cVar), c0091c);
        }
        i1.f.e(b2, "viewModel");
        androidx.lifecycle.O o3 = (androidx.lifecycle.O) linkedHashMap.put(str, b2);
        if (o3 != null) {
            o3.a();
        }
        return b2;
    }

    public boolean g(CharSequence charSequence, int i, int i2, U.y yVar) {
        if ((yVar.f1216c & 3) == 0) {
            U.d dVar = (U.d) this.f685c;
            V.a c2 = yVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f623a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = U.d.f1168b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1169a;
            String sb2 = sb.toString();
            int i3 = C.f.f235a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = yVar.f1216c & 4;
            yVar.f1216c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f1216c & 3) == 2;
    }

    public boolean h(int i, s.d dVar, v.f fVar) {
        int[] iArr = dVar.f4006p0;
        int i2 = iArr[0];
        C0365b c0365b = (C0365b) this.f684b;
        c0365b.f4119a = i2;
        c0365b.f4120b = iArr[1];
        c0365b.f4121c = dVar.q();
        c0365b.d = dVar.k();
        c0365b.i = false;
        c0365b.f4125j = i;
        boolean z2 = c0365b.f4119a == 3;
        boolean z3 = c0365b.f4120b == 3;
        boolean z4 = z2 && dVar.f3975W > RecyclerView.f1949A0;
        boolean z5 = z3 && dVar.f3975W > RecyclerView.f1949A0;
        int[] iArr2 = dVar.f4010t;
        if (z4 && iArr2[0] == 4) {
            c0365b.f4119a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0365b.f4120b = 1;
        }
        fVar.b(dVar, c0365b);
        dVar.O(c0365b.f4122e);
        dVar.L(c0365b.f4123f);
        dVar.f3958E = c0365b.h;
        dVar.I(c0365b.f4124g);
        c0365b.f4125j = 0;
        return c0365b.i;
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z2, U.p pVar) {
        int i4;
        char c2;
        U.r rVar = new U.r((U.u) ((U.v) this.f684b).f1209c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = rVar.f1196c.f1205a;
                U.u uVar = sparseArray == null ? null : (U.u) sparseArray.get(codePointAt);
                if (rVar.f1194a == 2) {
                    if (uVar != null) {
                        rVar.f1196c = uVar;
                        rVar.f1198f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            U.u uVar2 = rVar.f1196c;
                            if (uVar2.f1206b != null) {
                                if (rVar.f1198f != 1) {
                                    rVar.d = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.d = rVar.f1196c;
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
                    rVar.f1194a = 2;
                    rVar.f1196c = uVar;
                    rVar.f1198f = 1;
                    c2 = 2;
                }
                rVar.f1197e = codePointAt;
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
                    if (z2 || !g(charSequence, i4, i6, rVar.d.f1206b)) {
                        z3 = pVar.d(charSequence, i4, i6, rVar.d.f1206b);
                        i5++;
                    }
                }
            }
        }
        if (rVar.f1194a == 2 && rVar.f1196c.f1206b != null && ((rVar.f1198f > 1 || rVar.b()) && i5 < i3 && z3 && (z2 || !g(charSequence, i4, i6, rVar.f1196c.f1206b)))) {
            pVar.d(charSequence, i4, i6, rVar.f1196c.f1206b);
        }
        return pVar.b();
    }

    public void k() {
        ((TypedArray) this.f684b).recycle();
    }

    public void l(s.e eVar, int i, int i2, int i3) {
        int i4 = eVar.f3982b0;
        int i5 = eVar.f3984c0;
        eVar.f3982b0 = 0;
        eVar.f3984c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f3982b0 = 0;
        } else {
            eVar.f3982b0 = i4;
        }
        if (i5 < 0) {
            eVar.f3984c0 = 0;
        } else {
            eVar.f3984c0 = i5;
        }
        s.e eVar2 = (s.e) this.f685c;
        eVar2.f4029t0 = i;
        eVar2.U();
    }

    public void m(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f683a;
        arrayList.clear();
        int size = eVar.f4027q0.size();
        for (int i = 0; i < size; i++) {
            s.d dVar = (s.d) eVar.f4027q0.get(i);
            int[] iArr = dVar.f4006p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f4028s0.f4129b = true;
    }

    public C0019l(Runnable runnable) {
        this.f684b = new CopyOnWriteArrayList();
        this.f685c = new HashMap();
        this.f683a = runnable;
    }

    public C0019l(Context context, TypedArray typedArray) {
        this.f683a = context;
        this.f684b = typedArray;
    }
}
