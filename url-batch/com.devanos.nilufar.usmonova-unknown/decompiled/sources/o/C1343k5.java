package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.devanos.nilufar.usmonova.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343k5 implements InterfaceC0686a4, InterfaceC1146h4 {
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public static void C(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1409l5.b;
        }
        PorterDuff.Mode mode2 = C1409l5.b;
        synchronized (C1409l5.class) {
            e = VN.e(i, mode);
        }
        mutate.setColorFilter(e);
    }

    public static final AbstractC0551Vd a(C1343k5 c1343k5, C0827cE c0827cE, Object obj) {
        AbstractC0551Vd l = HO.l(obj, (C0826cD) c1343k5.j);
        if (l != null) {
            return l;
        }
        String str = "Unsupported annotation argument: " + c0827cE;
        AbstractC0048Bt.n(str, "message");
        return new C0299Lk(str);
    }

    public static boolean e(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList i(Context context, int i) {
        int c = CV.c(context, R.attr.colorControlHighlight);
        int b = CV.b(context, R.attr.colorButtonNormal);
        int[] iArr = CV.b;
        int[] iArr2 = CV.d;
        int b2 = AbstractC1837rc.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, CV.c, CV.f}, new int[]{b, b2, AbstractC1837rc.b(c, i), i});
    }

    public static /* synthetic */ List n(C1343k5 c1343k5, AbstractC0900dL abstractC0900dL, YB yb, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return c1343k5.m(abstractC0900dL, yb, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static YB p(E e, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, int i, boolean z) {
        AbstractC0048Bt.n(e, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC1888sN.p(i, "kind");
        if (e instanceof C1162hK) {
            C1649ol c1649ol = C0206Hv.a;
            C1461lv a = C0206Hv.a((C1162hK) e, interfaceC0893dE, c0695aD);
            if (a != null) {
                return AbstractC0048Bt.E(a);
            }
        } else if (e instanceof C2017uK) {
            C1649ol c1649ol2 = C0206Hv.a;
            C1461lv c = C0206Hv.c((C2017uK) e, interfaceC0893dE, c0695aD);
            if (c != null) {
                return AbstractC0048Bt.E(c);
            }
        } else if (e instanceof CK) {
            C2049uq c2049uq = AbstractC0180Gv.d;
            AbstractC0048Bt.m(c2049uq, "propertySignature");
            C0024Av c0024Av = (C0024Av) AbstractC1305jX.s((AbstractC1917sq) e, c2049uq);
            if (c0024Av != null) {
                int v = AbstractC1888sN.v(i);
                if (v == 1) {
                    return AbstractC1305jX.u((CK) e, interfaceC0893dE, c0695aD, true, true, z);
                }
                if (v == 2) {
                    if ((c0024Av.i & 4) != 4) {
                        return null;
                    }
                    C2318yv c2318yv = c0024Av.l;
                    AbstractC0048Bt.m(c2318yv, "signature.getter");
                    return new YB(interfaceC0893dE.getString(c2318yv.j).concat(interfaceC0893dE.getString(c2318yv.k)));
                }
                if (v != 3 || (c0024Av.i & 8) != 8) {
                    return null;
                }
                C2318yv c2318yv2 = c0024Av.m;
                AbstractC0048Bt.m(c2318yv2, "signature.setter");
                return new YB(interfaceC0893dE.getString(c2318yv2.j).concat(interfaceC0893dE.getString(c2318yv2.k)));
            }
        }
        return null;
    }

    public static LayerDrawable q(VN vn, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = vn.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = vn.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public List A(AbstractC0900dL abstractC0900dL, CK ck, int i) {
        YB u;
        YB u2;
        C0695aD c0695aD = abstractC0900dL.b;
        InterfaceC0893dE interfaceC0893dE = abstractC0900dL.a;
        Boolean c = AbstractC1650om.A.c(ck.k);
        boolean d = C0206Hv.d(ck);
        if (i == 1) {
            u2 = AbstractC1305jX.u(ck, interfaceC0893dE, c0695aD, (r12 & 8) == 0, (r12 & 16) == 0, true);
            if (u2 != null) {
                return n(this, abstractC0900dL, u2, c, d, 8);
            }
        } else {
            u = AbstractC1305jX.u(ck, interfaceC0893dE, c0695aD, (r12 & 8) == 0, (r12 & 16) == 0, true);
            if (u != null) {
                if (UT.E(u.a, "$delegate") == (i == 3)) {
                    return m(abstractC0900dL, u, true, true, c, d);
                }
            }
        }
        return C1318jk.h;
    }

    public boolean B(int i, int i2, Intent intent) {
        Iterator it = new HashSet((HashSet) this.j).iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                HashMap hashMap = ((C1950tJ) it.next()).d;
                if (hashMap.containsKey(Integer.valueOf(i))) {
                    ((NC) hashMap.remove(Integer.valueOf(i))).d(i2 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z) {
                }
                z = true;
            }
            return z;
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.m;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    @Override // o.InterfaceC1146h4
    public ArrayList c(C0769bL c0769bL) {
        AbstractC0048Bt.n(c0769bL, "container");
        IS is = c0769bL.c;
        C0675Zx c0675Zx = is instanceof C0675Zx ? (C0675Zx) is : null;
        OM om = c0675Zx != null ? c0675Zx.h : null;
        if (om == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + c0769bL.f.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = om.a;
        AbstractC0048Bt.n(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        AbstractC0048Bt.m(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC0048Bt.m(annotation, "annotation");
            Class D = AbstractC1473m3.D(AbstractC1473m3.B(annotation));
            C1370kW y = y(AbstractC1492mM.a(D), new C1426lM(annotation), arrayList);
            if (y != null) {
                AbstractC0048Bt.R(y, annotation, D);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public ArrayList d(MK mk, InterfaceC0893dE interfaceC0893dE) {
        AbstractC0048Bt.n(mk, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        Object k = mk.k(AbstractC0180Gv.f);
        AbstractC0048Bt.m(k, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C0833cK> iterable = (Iterable) k;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        for (C0833cK c0833cK : iterable) {
            AbstractC0048Bt.m(c0833cK, "it");
            arrayList.add(((C2002u5) this.l).B(c0833cK, interfaceC0893dE));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public List f(AbstractC0900dL abstractC0900dL, E e, int i) {
        AbstractC0048Bt.n(e, "proto");
        AbstractC1888sN.p(i, "kind");
        if (i == 2) {
            return A(abstractC0900dL, (CK) e, 1);
        }
        YB p = p(e, abstractC0900dL.a, abstractC0900dL.b, i, false);
        return p == null ? C1318jk.h : n(this, abstractC0900dL, p, null, false, 60);
    }

    @Override // o.InterfaceC1146h4
    public List g(AbstractC0900dL abstractC0900dL, C1688pK c1688pK) {
        AbstractC0048Bt.n(abstractC0900dL, "container");
        String string = abstractC0900dL.a.getString(c1688pK.k);
        String b = AbstractC1771qb.b(((C0769bL) abstractC0900dL).f.c());
        AbstractC0048Bt.n(b, "desc");
        return n(this, abstractC0900dL, new YB(string + '#' + b), null, false, 60);
    }

    public C2070v7 h() {
        String str = ((String) this.h) == null ? " transportName" : "";
        if (((C1780qk) this.j) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.k) == null) {
            str = AbstractC1888sN.j(str, " eventMillis");
        }
        if (((Long) this.l) == null) {
            str = AbstractC1888sN.j(str, " uptimeMillis");
        }
        if (((HashMap) this.m) == null) {
            str = AbstractC1888sN.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new C2070v7((String) this.h, (Integer) this.i, (C1780qk) this.j, ((Long) this.k).longValue(), ((Long) this.l).longValue(), (HashMap) this.m);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // o.InterfaceC0686a4
    public Object j(AbstractC0900dL abstractC0900dL, CK ck, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(ck, "proto");
        return z(abstractC0900dL, ck, 2, abstractC1004ey, C1268j.j);
    }

    @Override // o.InterfaceC1146h4
    public List k(AbstractC0900dL abstractC0900dL, CK ck) {
        AbstractC0048Bt.n(ck, "proto");
        return A(abstractC0900dL, ck, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r11 & 64) == 64) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r11.h != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r11 & 64) == 64) goto L11;
     */
    @Override // o.InterfaceC1146h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List l(AbstractC0900dL abstractC0900dL, E e, int i, int i2, UK uk) {
        AbstractC0048Bt.n(e, "callableProto");
        AbstractC1888sN.p(i, "kind");
        int i3 = 0;
        YB p = p(e, abstractC0900dL.a, abstractC0900dL.b, i, false);
        if (p == null) {
            return C1318jk.h;
        }
        if (e instanceof C2017uK) {
            int i4 = ((C2017uK) e).j;
            if ((i4 & 32) != 32) {
            }
            i3 = 1;
        } else if (e instanceof CK) {
            int i5 = ((CK) e).j;
            if ((i5 & 32) != 32) {
            }
            i3 = 1;
        } else {
            if (!(e instanceof C1162hK)) {
                throw new UnsupportedOperationException("Unsupported message: " + e.getClass());
            }
            C0769bL c0769bL = (C0769bL) abstractC0900dL;
            if (c0769bL.g == EnumC0964eK.ENUM_CLASS) {
                i3 = 2;
            }
        }
        return n(this, abstractC0900dL, new YB(p.a + '@' + (i2 + i3)), null, false, 60);
    }

    public List m(AbstractC0900dL abstractC0900dL, YB yb, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        OM s = s(abstractC0900dL, z, z2, bool, z3);
        if (s == null) {
            if (abstractC0900dL instanceof C0769bL) {
                IS is = ((C0769bL) abstractC0900dL).c;
                C0675Zx c0675Zx = is instanceof C0675Zx ? (C0675Zx) is : null;
                if (c0675Zx != null) {
                    s = c0675Zx.h;
                }
            }
            s = null;
        }
        return (s == null || (list = (List) ((C1204i) ((PA) this.i).invoke(s)).a.get(yb)) == null) ? C1318jk.h : list;
    }

    @Override // o.InterfaceC1146h4
    public List o(AbstractC0900dL abstractC0900dL, E e, int i) {
        AbstractC0048Bt.n(e, "proto");
        AbstractC1888sN.p(i, "kind");
        YB p = p(e, abstractC0900dL.a, abstractC0900dL.b, i, false);
        return p != null ? n(this, abstractC0900dL, new YB(AbstractC1888sN.l(new StringBuilder(), p.a, "@0")), null, false, 60) : C1318jk.h;
    }

    @Override // o.InterfaceC0686a4
    public Object r(AbstractC0900dL abstractC0900dL, CK ck, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(ck, "proto");
        return z(abstractC0900dL, ck, 3, abstractC1004ey, C1268j.i);
    }

    public OM s(AbstractC0900dL abstractC0900dL, boolean z, boolean z2, Boolean bool, boolean z3) {
        C0769bL c0769bL;
        EnumC0964eK enumC0964eK;
        C0853ce c0853ce = (C0853ce) this.h;
        AbstractC0048Bt.n(abstractC0900dL, "container");
        IS is = abstractC0900dL.c;
        EnumC0964eK enumC0964eK2 = EnumC0964eK.INTERFACE;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC0900dL + ')').toString());
            }
            if (abstractC0900dL instanceof C0769bL) {
                C0769bL c0769bL2 = (C0769bL) abstractC0900dL;
                if (c0769bL2.g == enumC0964eK2) {
                    return AbstractC0946e20.s(c0853ce, c0769bL2.f.d(C0827cE.e("DefaultImpls")), (C1527mv) this.m);
                }
            }
            if (bool.booleanValue() && (abstractC0900dL instanceof C0834cL)) {
                C1659ov c1659ov = is instanceof C1659ov ? (C1659ov) is : null;
                C0870cv c0870cv = c1659ov != null ? c1659ov.i : null;
                if (c0870cv != null) {
                    String e = c0870cv.e();
                    AbstractC0048Bt.m(e, "facadeClassName.internalName");
                    return AbstractC0946e20.s(c0853ce, C1639ob.j(new C2245xo(AbstractC0778bU.y(e, '/', '.'))), (C1527mv) this.m);
                }
            }
        }
        if (z2 && (abstractC0900dL instanceof C0769bL)) {
            C0769bL c0769bL3 = (C0769bL) abstractC0900dL;
            if (c0769bL3.g == EnumC0964eK.COMPANION_OBJECT && (c0769bL = c0769bL3.e) != null && ((enumC0964eK = c0769bL.g) == EnumC0964eK.CLASS || enumC0964eK == EnumC0964eK.ENUM_CLASS || (z3 && (enumC0964eK == enumC0964eK2 || enumC0964eK == EnumC0964eK.ANNOTATION_CLASS)))) {
                IS is2 = c0769bL.c;
                C0675Zx c0675Zx = is2 instanceof C0675Zx ? (C0675Zx) is2 : null;
                if (c0675Zx != null) {
                    return c0675Zx.h;
                }
                return null;
            }
        }
        if (!(abstractC0900dL instanceof C0834cL) || !(is instanceof C1659ov)) {
            return null;
        }
        AbstractC0048Bt.l(is, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C1659ov c1659ov2 = (C1659ov) is;
        OM om = c1659ov2.j;
        return om == null ? AbstractC0946e20.s(c0853ce, c1659ov2.a(), (C1527mv) this.m) : om;
    }

    public ColorStateList t(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return EB.s(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165250) {
            return EB.s(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return i(context, CV.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return i(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return i(context, CV.c(context, R.attr.colorAccent));
            }
            if (i == 2131165245 || i == R.drawable.abc_spinner_textfield_background_material) {
                return EB.s(context, R.color.abc_tint_spinner);
            }
            if (e((int[]) this.i, i)) {
                return CV.d(context, R.attr.colorControlNormal);
            }
            if (e((int[]) this.l, i)) {
                return EB.s(context, R.color.abc_tint_default);
            }
            if (e((int[]) this.m, i)) {
                return EB.s(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return EB.s(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = CV.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = CV.b;
            iArr2[0] = CV.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = CV.e;
            iArr2[1] = CV.c(context, R.attr.colorControlActivated);
            iArr[2] = CV.f;
            iArr2[2] = CV.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = CV.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = CV.e;
            iArr2[1] = CV.c(context, R.attr.colorControlActivated);
            iArr[2] = CV.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean u(C1639ob c1639ob) {
        OM s;
        if (c1639ob.f() != null && AbstractC0048Bt.h(c1639ob.i().b(), "Container") && (s = AbstractC0946e20.s((C0853ce) this.h, c1639ob, (C1527mv) this.m)) != null) {
            LinkedHashSet linkedHashSet = XS.a;
            Class cls = s.a;
            AbstractC0048Bt.n(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            AbstractC0048Bt.m(declaredAnnotations, "klass.declaredAnnotations");
            boolean z = false;
            for (Annotation annotation : declaredAnnotations) {
                AbstractC0048Bt.m(annotation, "annotation");
                if (AbstractC1492mM.a(AbstractC1473m3.D(AbstractC1473m3.B(annotation))).equals(AbstractC0412Pu.b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public C1370kW v(C1639ob c1639ob, IS is, List list) {
        AbstractC0048Bt.n(list, "result");
        InterfaceC1245ib q = AbstractC1052fg.q((C0826cD) this.j, c1639ob, (C1334k) this.k);
        C1370kW c1370kW = new C1370kW();
        c1370kW.j = this;
        c1370kW.k = q;
        c1370kW.l = c1639ob;
        c1370kW.m = list;
        c1370kW.n = is;
        c1370kW.h = this;
        c1370kW.i = new HashMap();
        return c1370kW;
    }

    @Override // o.InterfaceC1146h4
    public ArrayList w(RK rk, InterfaceC0893dE interfaceC0893dE) {
        AbstractC0048Bt.n(rk, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        Object k = rk.k(AbstractC0180Gv.h);
        AbstractC0048Bt.m(k, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C0833cK> iterable = (Iterable) k;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        for (C0833cK c0833cK : iterable) {
            AbstractC0048Bt.m(c0833cK, "it");
            arrayList.add(((C2002u5) this.l).B(c0833cK, interfaceC0893dE));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public List x(AbstractC0900dL abstractC0900dL, CK ck) {
        AbstractC0048Bt.n(ck, "proto");
        return A(abstractC0900dL, ck, 2);
    }

    public C1370kW y(C1639ob c1639ob, C1426lM c1426lM, List list) {
        AbstractC0048Bt.n(list, "result");
        if (XS.a.contains(c1639ob)) {
            return null;
        }
        return v(c1639ob, c1426lM, list);
    }

    public Object z(AbstractC0900dL abstractC0900dL, CK ck, int i, AbstractC1004ey abstractC1004ey, InterfaceC2312yp interfaceC2312yp) {
        Object invoke;
        OM s = s(abstractC0900dL, true, true, AbstractC1650om.A.c(ck.k), C0206Hv.d(ck));
        if (s == null) {
            if (abstractC0900dL instanceof C0769bL) {
                IS is = ((C0769bL) abstractC0900dL).c;
                C0675Zx c0675Zx = is instanceof C0675Zx ? (C0675Zx) is : null;
                if (c0675Zx != null) {
                    s = c0675Zx.h;
                }
            }
            s = null;
        }
        if (s != null) {
            C1527mv c1527mv = (C1527mv) s.b.d;
            C1527mv c1527mv2 = C0659Zh.e;
            AbstractC0048Bt.n(c1527mv2, "version");
            YB p = p(ck, abstractC0900dL.a, abstractC0900dL.b, i, c1527mv.a(c1527mv2.b, c1527mv2.c, c1527mv2.d));
            if (p != null && (invoke = interfaceC2312yp.invoke(((PA) this.i).invoke(s), p)) != null) {
                if (AbstractC1965tY.a(abstractC1004ey)) {
                    invoke = (AbstractC0551Vd) invoke;
                    if (invoke instanceof C1413l9) {
                        return new UX(((Number) ((C1413l9) invoke).a).byteValue());
                    }
                    if (invoke instanceof C1563nR) {
                        return new UX(((Number) ((C1563nR) invoke).a).shortValue());
                    }
                    if (invoke instanceof C1525mt) {
                        return new UX(((Number) ((C1525mt) invoke).a).intValue());
                    }
                    if (invoke instanceof C1283jB) {
                        return new UX(((Number) ((C1283jB) invoke).a).longValue());
                    }
                }
                return invoke;
            }
        }
        return null;
    }
}
