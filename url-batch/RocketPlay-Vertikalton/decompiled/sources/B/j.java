package B;

import K.C0010c0;
import K.C0024q;
import K.F;
import K.T;
import K.x0;
import K.z0;
import U.B;
import U.v;
import U.y;
import Y.AbstractComponentCallbacksC0055q;
import Y.I;
import Y.U;
import a1.AbstractC0067d;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
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
import androidx.recyclerview.widget.RecyclerView;
import c.C0100a;
import c1.AbstractC0104b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.luckycounter.drinkwater.MainActivity;
import g.AbstractActivityC0129i;
import g.z;
import g0.C0137G;
import g0.Z;
import g0.f0;
import g0.i0;
import g0.j0;
import j.AbstractC0175a;
import j0.InterfaceC0180c;
import j0.InterfaceC0181d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import k.MenuC0186B;
import k.MenuC0202m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0331d;
import q.C0333f;
import v.C0375b;

/* loaded from: classes.dex */
public final class j implements K.r, U.p, G.b, InterfaceC0181d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public Object f72b;

    /* renamed from: c, reason: collision with root package name */
    public Object f73c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f71a = i;
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
        C0137G c0137g = (C0137G) this.f72b;
        int d = c0137g.d();
        int c2 = c0137g.c();
        int b2 = c0137g.b(view);
        int a2 = c0137g.a(view);
        i0 i0Var = (i0) this.f73c;
        i0Var.f2916b = d;
        i0Var.f2917c = c2;
        i0Var.d = b2;
        i0Var.f2918e = a2;
        i0Var.f2915a = 24579;
        return i0Var.a();
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.f72b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.f72b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f72b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f73c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) ((ArrayList) this.f73c).get(size);
            int i4 = f0Var.f2880a;
            if (i4 >= i) {
                f0Var.f2880a = i4 + i2;
            }
        }
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.f72b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        w(i3);
        int[] iArr2 = (int[]) this.f72b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f72b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f73c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) ((ArrayList) this.f73c).get(size);
            int i4 = f0Var.f2880a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f73c).remove(size);
                } else {
                    f0Var.f2880a = i4 - i2;
                }
            }
        }
    }

    public void D(AbstractC0175a abstractC0175a) {
        v vVar = (v) this.f72b;
        ((ActionMode.Callback) vVar.f1207a).onDestroyActionMode(vVar.g(abstractC0175a));
        z zVar = (z) this.f73c;
        if (zVar.f2760w != null) {
            zVar.f2749l.getDecorView().removeCallbacks(zVar.f2761x);
        }
        if (zVar.f2759v != null) {
            C0010c0 c0010c0 = zVar.f2762y;
            if (c0010c0 != null) {
                c0010c0.b();
            }
            C0010c0 a2 = T.a(zVar.f2759v);
            a2.a(RecyclerView.f1949A0);
            zVar.f2762y = a2;
            a2.d(new g.q(2, this));
        }
        zVar.f2758u = null;
        ViewGroup viewGroup = zVar.f2715A;
        WeakHashMap weakHashMap = T.f633a;
        F.c(viewGroup);
        zVar.H();
    }

    public void E(B1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f72b;
        mainActivity.runOnUiThread(new G0.o(5, mainActivity));
    }

    public boolean F(AbstractC0175a abstractC0175a, MenuC0202m menuC0202m) {
        ViewGroup viewGroup = ((z) this.f73c).f2715A;
        WeakHashMap weakHashMap = T.f633a;
        F.c(viewGroup);
        v vVar = (v) this.f72b;
        j.e g2 = vVar.g(abstractC0175a);
        o.k kVar = (o.k) vVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0202m, null);
        if (menu == null) {
            menu = new MenuC0186B((Context) vVar.f1208b, menuC0202m);
            kVar.put(menuC0202m, menu);
        }
        return ((ActionMode.Callback) vVar.f1207a).onPrepareActionMode(g2, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(B1.j jVar, x1.s sVar) {
        String str;
        x1.n nVar;
        Charset charset;
        String str2;
        int i = MainActivity.F;
        ((MainActivity) this.f72b).getClass();
        final String t2 = MainActivity.t(new byte[]{30, -122, 55, -94, 12, -101, 54, -25, 13, -116, 51});
        final String t3 = MainActivity.t(new byte[]{75, -102, 49, -88, 29, -100, 54, -21, 83, -53, 42, -94, 75});
        final String str3 = ((x1.l) sVar.f4600a.f547c).h;
        C1.h hVar = sVar.f4605g;
        if (hVar != null) {
            K1.h f2 = hVar.f();
            try {
                switch (hVar.f259a) {
                    case 0:
                        String str4 = (String) hVar.f261c;
                        if (str4 != null) {
                            Pattern pattern = x1.n.f4540c;
                            try {
                                nVar = AbstractC0067d.j(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                    default:
                        nVar = (x1.n) hVar.f261c;
                        break;
                }
                if (nVar != null) {
                    charset = p1.a.f3802a;
                    String[] strArr = nVar.f4542b;
                    int i2 = 0;
                    int p2 = AbstractC0104b.p(0, strArr.length - 1, 2);
                    if (p2 >= 0) {
                        while (!p1.l.F(strArr[i2], "charset")) {
                            if (i2 != p2) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = p1.a.f3802a;
                str = f2.y(y1.b.q(f2, charset));
                AbstractC0104b.g(f2, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final String str6 = (String) this.f73c;
        final MainActivity mainActivity = (MainActivity) this.f72b;
        mainActivity.runOnUiThread(new Runnable() { // from class: S0.j
            @Override // java.lang.Runnable
            public final void run() {
                String str7 = str3;
                boolean L2 = p1.d.L(str7, t2);
                MainActivity mainActivity2 = mainActivity;
                if (L2) {
                    if (p1.d.L(str5, t3)) {
                        int i3 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    } else {
                        int i4 = MainActivity.F;
                        mainActivity2.v();
                        return;
                    }
                }
                int i5 = MainActivity.F;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.f2474C.a();
                i1.f.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str6, str7);
                edit.apply();
                mainActivity2.f2478z = str7;
                mainActivity2.w(str7);
            }
        });
    }

    public void H(H.h hVar) {
        int i = hVar.f557b;
        Handler handler = (Handler) this.f73c;
        A1.d dVar = (A1.d) this.f72b;
        if (i != 0) {
            handler.post(new H.b(dVar, i, 0));
        } else {
            handler.post(new H.a(dVar, 0, hVar.f556a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(Context context, XmlResourceParser xmlResourceParser) {
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
                                    iVar.d.f4337a = true;
                                    break;
                                case 3:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f4350h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4307b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4309e.a(context, Xml.asAttributeSet(xmlResourceParser));
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
                                    iVar.f4308c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0375b.a(context, xmlResourceParser, iVar.f4310f);
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
                                ((SparseArray) this.f73c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4399c.put(Integer.valueOf(iVar.f4306a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f73c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0024q J(Z z2, int i) {
        j0 j0Var;
        C0024q c0024q;
        o.k kVar = (o.k) this.f72b;
        int e2 = kVar.e(z2);
        if (e2 >= 0 && (j0Var = (j0) kVar.j(e2)) != null) {
            int i2 = j0Var.f2920a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                j0Var.f2920a = i3;
                if (i == 4) {
                    c0024q = j0Var.f2921b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0024q = j0Var.f2922c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    j0Var.f2920a = 0;
                    j0Var.f2921b = null;
                    j0Var.f2922c = null;
                    j0.d.c(j0Var);
                }
                return c0024q;
            }
        }
        return null;
    }

    public void K(Z z2) {
        j0 j0Var = (j0) ((o.k) this.f72b).getOrDefault(z2, null);
        if (j0Var == null) {
            return;
        }
        j0Var.f2920a &= -2;
    }

    public void L(Z z2) {
        o.e eVar = (o.e) this.f73c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (z2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3592c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3589e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3590a = true;
                }
            } else {
                e2--;
            }
        }
        j0 j0Var = (j0) ((o.k) this.f72b).remove(z2);
        if (j0Var != null) {
            j0Var.f2920a = 0;
            j0Var.f2921b = null;
            j0Var.f2922c = null;
            j0.d.c(j0Var);
        }
    }

    public void M() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f72b;
        jVar.getClass();
        String str = (String) this.f73c;
        i1.f.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1575b.remove(str)) != null) {
            jVar.f1574a.remove(num);
        }
        jVar.f1577e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1578f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1579g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0100a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0100a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0100a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1576c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // j0.InterfaceC0181d
    public void a(InterfaceC0180c interfaceC0180c) {
        Object[] objArr = (Object[]) this.f73c;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                interfaceC0180c.k(i);
            } else if (obj instanceof byte[]) {
                interfaceC0180c.j(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC0180c.m(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                interfaceC0180c.m(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                interfaceC0180c.s(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC0180c.s(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC0180c.s(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC0180c.s(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC0180c.l((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                interfaceC0180c.s(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    @Override // U.p
    public Object b() {
        return (B) this.f72b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 c(View view, z0 z0Var) {
        boolean z2;
        boolean z3;
        G0.q qVar = (G0.q) this.f73c;
        int i = qVar.f518a;
        I.h hVar = (I.h) this.f72b;
        x0 x0Var = z0Var.f729a;
        C.d f2 = x0Var.f(7);
        C.d f3 = x0Var.f(32);
        int i2 = f2.f233b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f583b;
        bottomSheetBehavior.f2191w = i2;
        boolean e2 = G0.m.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f2183o;
        if (z4) {
            int a2 = z0Var.a();
            bottomSheetBehavior.f2190v = a2;
            paddingBottom = a2 + qVar.f520c;
        }
        int i3 = qVar.f519b;
        boolean z5 = bottomSheetBehavior.f2184p;
        int i4 = f2.f232a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f2185q;
        int i5 = f2.f234c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f2187s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f2188t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f2189u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f233b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = hVar.f582a;
                if (z3) {
                    bottomSheetBehavior.f2181m = f3.d;
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
        z3 = hVar.f582a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return z0Var;
    }

    @Override // U.p
    public boolean d(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f1216c & 4) > 0) {
            return true;
        }
        if (((B) this.f72b) == null) {
            this.f72b = new B(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((M0.e) this.f73c).getClass();
        ((B) this.f72b).setSpan(new U.z(yVar), i, i2, 33);
        return true;
    }

    public void e(Z z2, C0024q c0024q) {
        o.k kVar = (o.k) this.f72b;
        j0 j0Var = (j0) kVar.getOrDefault(z2, null);
        if (j0Var == null) {
            j0Var = j0.a();
            kVar.put(z2, j0Var);
        }
        j0Var.f2922c = c0024q;
        j0Var.f2920a |= 8;
    }

    @Override // j0.InterfaceC0181d
    public String f() {
        return (String) this.f72b;
    }

    public void g() {
        int[] iArr = (int[]) this.f72b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f73c = null;
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        I i = (I) this.f73c;
        AbstractActivityC0129i abstractActivityC0129i = i.f1358t.f1529b;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = i.f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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

    public void j(boolean z2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
    public void k() {
        ((Animator) this.f72b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f73c) + " has been canceled.");
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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

    public void m(boolean z2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        I i = (I) this.f73c;
        AbstractActivityC0129i abstractActivityC0129i = i.f1358t.f1529b;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = i.f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        switch (this.f71a) {
            case 3:
                return "Bounds{lower=" + ((C.d) this.f72b) + " upper=" + ((C.d) this.f73c) + "}";
            case 17:
                String str = "[ ";
                if (((C0333f) this.f72b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0333f) this.f72b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0333f) this.f72b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((I) this.f73c).f1360v;
        if (abstractComponentCallbacksC0055q != null) {
            abstractComponentCallbacksC0055q.j().f1350l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f72b).iterator();
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
        int[] iArr = (int[]) this.f72b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f72b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f72b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f72b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View x(int i, int i2, int i3, int i4) {
        View u2;
        C0137G c0137g = (C0137G) this.f72b;
        int d = c0137g.d();
        int c2 = c0137g.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0137g.f2772a) {
                case 0:
                    u2 = c0137g.f2773b.u(i);
                    break;
                default:
                    u2 = c0137g.f2773b.u(i);
                    break;
            }
            int b2 = c0137g.b(u2);
            int a2 = c0137g.a(u2);
            i0 i0Var = (i0) this.f73c;
            i0Var.f2916b = d;
            i0Var.f2917c = c2;
            i0Var.d = b2;
            i0Var.f2918e = a2;
            if (i3 != 0) {
                i0Var.f2915a = i3;
                if (i0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                i0Var.f2915a = i4;
                if (i0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void z() {
        ((SparseIntArray) this.f72b).clear();
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f71a = i;
        this.f72b = obj;
        this.f73c = obj2;
    }

    public j(String str, Object[] objArr) {
        this.f71a = 16;
        i1.f.e(str, "query");
        this.f72b = str;
        this.f73c = objArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        this(str, (Object[]) null);
        this.f71a = 16;
        i1.f.e(str, "query");
    }

    public j(C0331d c0331d) {
        this.f71a = 17;
        this.f73c = c0331d;
    }

    public j(I i) {
        this.f71a = 9;
        this.f72b = new CopyOnWriteArrayList();
        this.f73c = i;
    }

    public j(C0137G c0137g) {
        this.f71a = 14;
        this.f72b = c0137g;
        i0 i0Var = new i0();
        i0Var.f2915a = 0;
        this.f73c = i0Var;
    }

    public j(Animation animation) {
        this.f71a = 8;
        this.f72b = animation;
        this.f73c = null;
    }

    public j(Animator animator) {
        this.f71a = 8;
        this.f72b = null;
        this.f73c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f71a = 0;
        int size = arrayList.size();
        this.f72b = new int[size];
        this.f73c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f72b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f73c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f71a = 0;
        this.f72b = new int[]{i, i2};
        this.f73c = new float[]{RecyclerView.f1949A0, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f71a = 0;
        this.f72b = new int[]{i, i2, i3};
        this.f73c = new float[]{RecyclerView.f1949A0, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f71a = 6;
        this.f72b = editText;
        W.i iVar = new W.i(editText);
        this.f73c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f1252b == null) {
            synchronized (W.a.f1251a) {
                try {
                    if (W.a.f1252b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f1253c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f1252b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f1252b);
    }

    public j(int i) {
        this.f71a = i;
        switch (i) {
            case 15:
                this.f72b = new o.k();
                this.f73c = new o.e();
                break;
            default:
                this.f72b = new SparseIntArray();
                this.f73c = new SparseIntArray();
                break;
        }
    }

    public j(z zVar, v vVar) {
        this.f71a = 11;
        this.f73c = zVar;
        this.f72b = vVar;
    }
}
