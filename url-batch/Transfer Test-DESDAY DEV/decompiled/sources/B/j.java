package B;

import K.F;
import K.InterfaceC0019s;
import K.T;
import K.c0;
import K.x0;
import K.z0;
import U.B;
import U.v;
import U.z;
import Y.AbstractComponentCallbacksC0049q;
import Y.I;
import Y.U;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import c.C0084a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.y;
import g0.G;
import g0.Z;
import g0.f0;
import g0.i0;
import g0.j0;
import j.AbstractC0144a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0148B;
import k.MenuC0164m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0320d;
import q.C0322f;
import v.C0340b;

/* loaded from: classes.dex */
public final class j implements InterfaceC0019s, U.p, G.b, j0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55a;

    /* renamed from: b, reason: collision with root package name */
    public Object f56b;

    /* renamed from: c, reason: collision with root package name */
    public Object f57c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f55a = i;
    }

    public static int y(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public boolean A(View view) {
        G g2 = (G) this.f56b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        i0 i0Var = (i0) this.f57c;
        i0Var.f2469b = d;
        i0Var.f2470c = c2;
        i0Var.d = b2;
        i0Var.f2471e = a2;
        i0Var.f2468a = 24579;
        return i0Var.a();
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.f56b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.f56b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f56b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f57c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) ((ArrayList) this.f57c).get(size);
            int i4 = f0Var.f2440a;
            if (i4 >= i) {
                f0Var.f2440a = i4 + i2;
            }
        }
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.f56b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.f56b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f56b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f57c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) ((ArrayList) this.f57c).get(size);
            int i4 = f0Var.f2440a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f57c).remove(size);
                } else {
                    f0Var.f2440a = i4 - i2;
                }
            }
        }
    }

    public void D(AbstractC0144a abstractC0144a) {
        v vVar = (v) this.f56b;
        ((ActionMode.Callback) vVar.f849a).onDestroyActionMode(vVar.e(abstractC0144a));
        y yVar = (y) this.f57c;
        if (yVar.f2321w != null) {
            yVar.f2310l.getDecorView().removeCallbacks(yVar.f2322x);
        }
        if (yVar.f2320v != null) {
            c0 c0Var = yVar.f2323y;
            if (c0Var != null) {
                c0Var.b();
            }
            c0 a2 = T.a(yVar.f2320v);
            a2.a(RecyclerView.f1570A0);
            yVar.f2323y = a2;
            a2.d(new g.p(2, this));
        }
        yVar.f2319u = null;
        ViewGroup viewGroup = yVar.f2276B;
        WeakHashMap weakHashMap = T.f372a;
        F.c(viewGroup);
        yVar.H();
    }

    public boolean E(AbstractC0144a abstractC0144a, MenuC0164m menuC0164m) {
        ViewGroup viewGroup = ((y) this.f57c).f2276B;
        WeakHashMap weakHashMap = T.f372a;
        F.c(viewGroup);
        v vVar = (v) this.f56b;
        j.e e2 = vVar.e(abstractC0144a);
        o.k kVar = (o.k) vVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0164m, null);
        if (menu == null) {
            menu = new MenuC0148B((Context) vVar.f850b, menuC0164m);
            kVar.put(menuC0164m, menu);
        }
        return ((ActionMode.Callback) vVar.f849a).onPrepareActionMode(e2, menu);
    }

    public void F(H.h hVar) {
        int i = hVar.f231b;
        Handler handler = (Handler) this.f57c;
        A0.h hVar2 = (A0.h) this.f56b;
        if (i != 0) {
            handler.post(new H.b(hVar2, i, 0));
        } else {
            handler.post(new H.a(hVar2, 0, hVar.f230a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        v.i iVar;
        char c2;
        v.n nVar = new v.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f3966a = true;
                                    break;
                                case 3:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f3979h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3936b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3938e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f3937c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0340b.a(context, xmlResourceParser, iVar.f3939f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f57c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4028c.put(Integer.valueOf(iVar.f3935a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f57c).put(identifier, nVar);
                return;
            }
        }
    }

    public K.r H(Z z2, int i) {
        j0 j0Var;
        K.r rVar;
        o.k kVar = (o.k) this.f56b;
        int e2 = kVar.e(z2);
        if (e2 >= 0 && (j0Var = (j0) kVar.j(e2)) != null) {
            int i2 = j0Var.f2483a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                j0Var.f2483a = i3;
                if (i == 4) {
                    rVar = j0Var.f2484b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    rVar = j0Var.f2485c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    j0Var.f2483a = 0;
                    j0Var.f2484b = null;
                    j0Var.f2485c = null;
                    j0.d.c(j0Var);
                }
                return rVar;
            }
        }
        return null;
    }

    public void I(Z z2) {
        j0 j0Var = (j0) ((o.k) this.f56b).getOrDefault(z2, null);
        if (j0Var == null) {
            return;
        }
        j0Var.f2483a &= -2;
    }

    public void J(Z z2) {
        o.e eVar = (o.e) this.f57c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (z2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3166c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3163e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3164a = true;
                }
            } else {
                e2--;
            }
        }
        j0 j0Var = (j0) ((o.k) this.f56b).remove(z2);
        if (j0Var != null) {
            j0Var.f2483a = 0;
            j0Var.f2484b = null;
            j0Var.f2485c = null;
            j0.d.c(j0Var);
        }
    }

    public void K() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f56b;
        jVar.getClass();
        String str = (String) this.f57c;
        g1.f.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1196b.remove(str)) != null) {
            jVar.f1195a.remove(num);
        }
        jVar.f1198e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1199f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1200g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0084a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0084a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0084a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1197c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // j0.d
    public void a(j0.c cVar) {
        Object[] objArr = (Object[]) this.f57c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                cVar.f(i);
            } else if (obj instanceof byte[]) {
                cVar.e(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                cVar.h(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                cVar.h(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                cVar.p(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                cVar.p(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                cVar.p(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                cVar.p(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                cVar.g((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                cVar.p(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    @Override // U.p
    public Object b() {
        return (B) this.f56b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.InterfaceC0019s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 c(View view, z0 z0Var) {
        boolean z2;
        boolean z3;
        I0.n nVar = (I0.n) this.f57c;
        int i = nVar.f347a;
        I.h hVar = (I.h) this.f56b;
        x0 x0Var = z0Var.f465a;
        C.d f2 = x0Var.f(7);
        C.d f3 = x0Var.f(32);
        int i2 = f2.f95b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f263b;
        bottomSheetBehavior.f1823w = i2;
        boolean e2 = I0.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1815o;
        if (z4) {
            int a2 = z0Var.a();
            bottomSheetBehavior.f1822v = a2;
            paddingBottom = a2 + nVar.f349c;
        }
        int i3 = nVar.f348b;
        boolean z5 = bottomSheetBehavior.f1816p;
        int i4 = f2.f94a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1817q;
        int i5 = f2.f96c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1819s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1820t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1821u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f95b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = hVar.f262a;
                if (z3) {
                    bottomSheetBehavior.f1813m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return z0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = hVar.f262a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return z0Var;
    }

    @Override // U.p
    public boolean d(CharSequence charSequence, int i, int i2, U.y yVar) {
        if ((yVar.f858c & 4) > 0) {
            return true;
        }
        if (((B) this.f56b) == null) {
            this.f56b = new B(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((O0.e) this.f57c).getClass();
        ((B) this.f56b).setSpan(new z(yVar), i, i2, 33);
        return true;
    }

    public void e(Z z2, K.r rVar) {
        o.k kVar = (o.k) this.f56b;
        j0 j0Var = (j0) kVar.getOrDefault(z2, null);
        if (j0Var == null) {
            j0Var = j0.a();
            kVar.put(z2, j0Var);
        }
        j0Var.f2485c = rVar;
        j0Var.f2483a |= 8;
    }

    public void f() {
        int[] iArr = (int[]) this.f56b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f57c = null;
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z2) {
        I i = (I) this.f57c;
        FragmentActivity fragmentActivity = i.f977t.f1148b;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = i.f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // j0.d
    public String j() {
        return (String) this.f56b;
    }

    public void k(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // G.b
    public void l() {
        ((Animator) this.f56b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f57c) + " has been canceled.");
        }
    }

    public void m(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        I i = (I) this.f57c;
        FragmentActivity fragmentActivity = i.f977t.f1148b;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = i.f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f55a) {
            case 3:
                return "Bounds{lower=" + ((C.d) this.f56b) + " upper=" + ((C.d) this.f57c) + "}";
            case 16:
                String str = "[ ";
                if (((C0322f) this.f56b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0322f) this.f56b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0322f) this.f56b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void v(boolean z2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((I) this.f57c).f979v;
        if (abstractComponentCallbacksC0049q != null) {
            abstractComponentCallbacksC0049q.j().f969l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f56b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void w(int i) {
        int[] iArr = (int[]) this.f56b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f56b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f56b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f56b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View x(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f56b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f2334a) {
                case 0:
                    u2 = g2.f2335b.u(i);
                    break;
                default:
                    u2 = g2.f2335b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            i0 i0Var = (i0) this.f57c;
            i0Var.f2469b = d;
            i0Var.f2470c = c2;
            i0Var.d = b2;
            i0Var.f2471e = a2;
            if (i3 != 0) {
                i0Var.f2468a = i3;
                if (i0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                i0Var.f2468a = i4;
                if (i0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void z() {
        ((SparseIntArray) this.f56b).clear();
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f55a = i;
        this.f56b = obj;
        this.f57c = obj2;
    }

    public j(String str, Object[] objArr) {
        this.f55a = 15;
        g1.f.e(str, "query");
        this.f56b = str;
        this.f57c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        this(str, (Object[]) null);
        this.f55a = 15;
        g1.f.e(str, "query");
    }

    public j(C0320d c0320d) {
        this.f55a = 16;
        this.f57c = c0320d;
    }

    public j(I i) {
        this.f55a = 8;
        this.f56b = new CopyOnWriteArrayList();
        this.f57c = i;
    }

    public j(G g2) {
        this.f55a = 13;
        this.f56b = g2;
        i0 i0Var = new i0();
        i0Var.f2468a = 0;
        this.f57c = i0Var;
    }

    public j(Animation animation) {
        this.f55a = 7;
        this.f56b = animation;
        this.f57c = null;
    }

    public j(Animator animator) {
        this.f55a = 7;
        this.f56b = null;
        this.f57c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f55a = 0;
        int size = arrayList.size();
        this.f56b = new int[size];
        this.f57c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f56b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f57c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f55a = 0;
        this.f56b = new int[]{i, i2};
        this.f57c = new float[]{RecyclerView.f1570A0, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f55a = 0;
        this.f56b = new int[]{i, i2, i3};
        this.f57c = new float[]{RecyclerView.f1570A0, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f55a = 5;
        this.f56b = editText;
        W.i iVar = new W.i(editText);
        this.f57c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f879b == null) {
            synchronized (W.a.f878a) {
                try {
                    if (W.a.f879b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f880c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f879b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f879b);
    }

    public j(int i) {
        this.f55a = i;
        switch (i) {
            case 14:
                this.f56b = new o.k();
                this.f57c = new o.e();
                break;
            default:
                this.f56b = new SparseIntArray();
                this.f57c = new SparseIntArray();
                break;
        }
    }

    public j(y yVar, v vVar) {
        this.f55a = 10;
        this.f57c = yVar;
        this.f56b = vVar;
    }
}
