package o;

import android.R;
import android.content.ClipDescription;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.firebase.database.core.ValidationPath;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z2 extends Y1 {
    public final /* synthetic */ C1013f3 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(C1013f3 c1013f3) {
        super(4);
        this.n = c1013f3;
    }

    @Override // o.Y1
    public final void V(int i, Q0 q0, String str, Bundle bundle) {
        this.n.e(i, q0, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0503, code lost:
    
        if (r6.isEmpty() != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x07ad, code lost:
    
        if (o.AbstractC0048Bt.h(r3, java.lang.Boolean.TRUE) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x07f1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x07ef, code lost:
    
        if (r3 == false) goto L382;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b63  */
    /* JADX WARN: Type inference failed for: r1v26, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList] */
    @Override // o.Y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q0 W(int i) {
        List g;
        PS ps;
        C1013f3 c1013f3;
        S2 s2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        Q0 q0;
        C2023uQ c2023uQ;
        C2287yQ c2287yQ;
        C2023uQ c2023uQ2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        C2023uQ c2023uQ3;
        boolean z;
        Object obj;
        Q0 q02;
        Object obj2;
        C1599o0 c1599o0;
        Object obj3;
        C1599o0 c1599o02;
        String q;
        int i2;
        Object obj4;
        GJ gj;
        Object obj5;
        int i3;
        int i4;
        S2 s22;
        int i5;
        List g2;
        boolean z2;
        boolean z3;
        List g3;
        ArrayList arrayList;
        ArrayList arrayList2;
        C0910dV c0910dV;
        int i6;
        AbstractC0106Dz lifecycle;
        Float valueOf = Float.valueOf(0.0f);
        C1013f3 c1013f32 = this.n;
        S2 s23 = c1013f32.d;
        H2 viewTreeOwners = s23.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : ((C0417Pz) lifecycle).d) != EnumC0080Cz.h) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            Q0 q03 = new Q0(obtain);
            AQ aq = (AQ) c1013f32.n().e(i);
            if (aq != null) {
                C2287yQ c2287yQ2 = aq.a;
                if (i == -1) {
                    Object parentForAccessibility = s23.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    q03.b = -1;
                    obtain.setParent(view);
                } else {
                    C2287yQ j = c2287yQ2.j();
                    Integer valueOf2 = j != null ? Integer.valueOf(j.g) : null;
                    if (valueOf2 == null) {
                        AbstractC0868ct.X("semanticsNode " + i + " has null parent");
                        throw null;
                    }
                    int intValue = valueOf2.intValue();
                    if (intValue == s23.getSemanticsOwner().a().g) {
                        intValue = -1;
                    }
                    q03.b = intValue;
                    obtain.setParent(s23, intValue);
                }
                q03.c = i;
                obtain.setSource(s23, i);
                Rect rect = aq.b;
                long r = s23.r(PX.h(rect.left, rect.top));
                long r2 = s23.r(PX.h(rect.right, rect.bottom));
                obtain.setBoundsInScreen(new Rect((int) Math.floor(BF.b(r)), (int) Math.floor(BF.c(r)), (int) Math.ceil(BF.b(r2)), (int) Math.ceil(BF.c(r2))));
                PS ps2 = c1013f32.r;
                q03.f("android.view.View");
                C2023uQ c2023uQ4 = c2287yQ2.d;
                C2023uQ c2023uQ5 = c2287yQ2.d;
                LinkedHashMap linkedHashMap = c2023uQ4.h;
                if (linkedHashMap.containsKey(CQ.u)) {
                    q03.f("android.widget.EditText");
                }
                if (linkedHashMap.containsKey(CQ.s)) {
                    q03.f("android.widget.TextView");
                }
                Object obj6 = linkedHashMap.get(CQ.q);
                if (obj6 == null) {
                    obj6 = null;
                }
                obtain.setPackageName(s23.getContext().getPackageName());
                obtain.setImportantForAccessibility(AbstractC1052fg.H(c2287yQ2));
                g = c2287yQ2.g((r4 & 1) != 0 ? !c2287yQ2.b : false, (r4 & 2) == 0);
                int size = g.size();
                int i7 = 0;
                while (i7 < size) {
                    C2287yQ c2287yQ3 = (C2287yQ) g.get(i7);
                    Float f = valueOf;
                    if (c1013f32.n().b(c2287yQ3.g)) {
                        if (s23.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c2287yQ3.c) != null) {
                            throw new ClassCastException();
                        }
                        int i8 = c2287yQ3.g;
                        if (i8 != -1) {
                            obtain.addChild(s23, i8);
                        }
                    }
                    i7++;
                    valueOf = f;
                }
                Float f2 = valueOf;
                int i9 = c1013f32.n;
                AccessibilityNodeInfo accessibilityNodeInfo4 = q03.a;
                if (i == i9) {
                    accessibilityNodeInfo4.setAccessibilityFocused(true);
                    q03.a(L0.d);
                } else {
                    accessibilityNodeInfo4.setAccessibilityFocused(false);
                    q03.a(L0.c);
                }
                Object obj7 = c2023uQ5.h.get(CQ.u);
                if (obj7 == null) {
                    obj7 = null;
                }
                Y3 y3 = (Y3) obj7;
                Object obj8 = c2023uQ5.h.get(CQ.s);
                if (obj8 == null) {
                    obj8 = null;
                }
                List list = (List) obj8;
                Y3 y32 = list != null ? (Y3) AbstractC0720ac.p0(list) : null;
                if (y3 == null) {
                    y3 = y32;
                }
                if (y3 != null) {
                    s23.getFontFamilyResolver();
                    InterfaceC1119gh density = s23.getDensity();
                    C0950e6 c0950e6 = c1013f32.E;
                    String str = y3.h;
                    s2 = s23;
                    List list2 = y3.k;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list3 = y3.i;
                    if (list3 != null) {
                        int size2 = list3.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            int i11 = i10;
                            X3 x3 = (X3) list3.get(i10);
                            List list4 = list3;
                            LS ls = (LS) x3.a;
                            int i12 = size2;
                            InterfaceC0844cV interfaceC0844cV = ls.a;
                            int i13 = x3.b;
                            int i14 = x3.c;
                            Q0 q04 = q03;
                            C2023uQ c2023uQ6 = c2023uQ4;
                            long f3 = interfaceC0844cV.f();
                            C2287yQ c2287yQ4 = c2287yQ2;
                            C2023uQ c2023uQ7 = c2023uQ5;
                            long j2 = ls.b;
                            PS ps3 = ps2;
                            C1586no c1586no = ls.c;
                            AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo4;
                            C0910dV c0910dV2 = ls.h;
                            C1013f3 c1013f33 = c1013f32;
                            FA fa = ls.i;
                            List list5 = list2;
                            AccessibilityNodeInfo accessibilityNodeInfo6 = obtain;
                            long j3 = ls.j;
                            YU yu = ls.k;
                            long f4 = (C1114gc.b(f3, interfaceC0844cV.f()) ? interfaceC0844cV : f3 != 16 ? new C1772qc(f3) : C1623oL.f206o).f();
                            if (f4 != 16) {
                                spannableString2.setSpan(new ForegroundColorSpan(AbstractC0022At.L(f4)), i13, i14, 33);
                            }
                            long b = C1830rV.b(j2);
                            if (C1896sV.a(b, 4294967296L)) {
                                spannableString2.setSpan(new AbsoluteSizeSpan(AbstractC0946e20.N(density.x(j2)), false), i13, i14, 33);
                                c0910dV = c0910dV2;
                                i6 = 33;
                            } else {
                                c0910dV = c0910dV2;
                                if (C1896sV.a(b, 8589934592L)) {
                                    i6 = 33;
                                    spannableString2.setSpan(new RelativeSizeSpan(C1830rV.c(j2)), i13, i14, 33);
                                } else {
                                    i6 = 33;
                                }
                            }
                            if (c1586no != null) {
                                spannableString2.setSpan(new StyleSpan(AbstractC1305jX.r(c1586no, 0)), i13, i14, i6);
                            }
                            if (yu != null) {
                                int i15 = yu.a;
                                if ((i15 | 1) == i15) {
                                    spannableString2.setSpan(new UnderlineSpan(), i13, i14, i6);
                                }
                                if ((i15 | 2) == i15) {
                                    spannableString2.setSpan(new StrikethroughSpan(), i13, i14, i6);
                                }
                            }
                            if (c0910dV != null) {
                                spannableString2.setSpan(new ScaleXSpan(c0910dV.a), i13, i14, i6);
                            }
                            if (fa != null) {
                                spannableString2.setSpan(JA.a.a(fa), i13, i14, i6);
                            }
                            if (j3 != 16) {
                                spannableString2.setSpan(new BackgroundColorSpan(AbstractC0022At.L(j3)), i13, i14, i6);
                            }
                            i10 = i11 + 1;
                            list3 = list4;
                            size2 = i12;
                            q03 = q04;
                            c2023uQ4 = c2023uQ6;
                            c2287yQ2 = c2287yQ4;
                            c2023uQ5 = c2023uQ7;
                            ps2 = ps3;
                            accessibilityNodeInfo4 = accessibilityNodeInfo5;
                            c1013f32 = c1013f33;
                            obtain = accessibilityNodeInfo6;
                            list2 = list5;
                        }
                    }
                    ps = ps2;
                    c1013f3 = c1013f32;
                    List list6 = list2;
                    AccessibilityNodeInfo accessibilityNodeInfo7 = obtain;
                    accessibilityNodeInfo = accessibilityNodeInfo4;
                    q0 = q03;
                    c2023uQ = c2023uQ4;
                    c2287yQ = c2287yQ2;
                    c2023uQ2 = c2023uQ5;
                    int length = str.length();
                    ?? r1 = C1318jk.h;
                    if (list6 != null) {
                        arrayList = new ArrayList(list6.size());
                        int size3 = list6.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            List list7 = list6;
                            Object obj9 = list7.get(i16);
                            X3 x32 = (X3) obj9;
                            if ((x32.a instanceof C1111gZ) && Z3.b(0, length, x32.b, x32.c)) {
                                arrayList.add(obj9);
                            }
                            i16++;
                            list6 = list7;
                        }
                    } else {
                        arrayList = r1;
                    }
                    List list8 = list6;
                    int size4 = arrayList.size();
                    for (int i17 = 0; i17 < size4; i17++) {
                        X3 x33 = (X3) arrayList.get(i17);
                        C1111gZ c1111gZ = (C1111gZ) x33.a;
                        int i18 = x33.b;
                        int i19 = x33.c;
                        if (!(c1111gZ instanceof C1111gZ)) {
                            throw new C0057Cc();
                        }
                        spannableString2.setSpan(new TtsSpan.VerbatimBuilder(c1111gZ.a).build(), i18, i19, 33);
                    }
                    int length2 = str.length();
                    if (list8 != null) {
                        arrayList2 = new ArrayList(list8.size());
                        int size5 = list8.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            Object obj10 = list8.get(i20);
                            X3 x34 = (X3) obj10;
                            if ((x34.a instanceof BY) && Z3.b(0, length2, x34.b, x34.c)) {
                                arrayList2.add(obj10);
                            }
                        }
                    } else {
                        arrayList2 = r1;
                    }
                    int size6 = arrayList2.size();
                    for (int i21 = 0; i21 < size6; i21++) {
                        X3 x35 = (X3) arrayList2.get(i21);
                        BY by = (BY) x35.a;
                        int i22 = x35.b;
                        int i23 = x35.c;
                        WeakHashMap weakHashMap = (WeakHashMap) c0950e6.i;
                        Object obj11 = weakHashMap.get(by);
                        if (obj11 == null) {
                            obj11 = new URLSpan(by.a);
                            weakHashMap.put(by, obj11);
                        }
                        spannableString2.setSpan((URLSpan) obj11, i22, i23, 33);
                    }
                    int length3 = str.length();
                    if (list8 != null) {
                        r1 = new ArrayList(list8.size());
                        int size7 = list8.size();
                        for (int i24 = 0; i24 < size7; i24++) {
                            Object obj12 = list8.get(i24);
                            X3 x36 = (X3) obj12;
                            if ((x36.a instanceof AbstractC0692aA) && Z3.b(0, length3, x36.b, x36.c)) {
                                r1.add(obj12);
                            }
                        }
                    }
                    int size8 = r1.size();
                    for (int i25 = 0; i25 < size8; i25++) {
                        X3 x37 = (X3) r1.get(i25);
                        int i26 = x37.b;
                        Object obj13 = x37.a;
                        int i27 = x37.c;
                        if (i26 != i27) {
                            AbstractC0692aA abstractC0692aA = (AbstractC0692aA) obj13;
                            if (abstractC0692aA instanceof C0677Zz) {
                                C0677Zz c0677Zz = (C0677Zz) obj13;
                                X3 x38 = new X3(c0677Zz, i26, i27, "");
                                WeakHashMap weakHashMap2 = (WeakHashMap) c0950e6.j;
                                Object obj14 = weakHashMap2.get(x38);
                                if (obj14 == null) {
                                    obj14 = new URLSpan(c0677Zz.a);
                                    weakHashMap2.put(x38, obj14);
                                }
                                spannableString2.setSpan((URLSpan) obj14, i26, i27, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) c0950e6.k;
                                Object obj15 = weakHashMap3.get(x37);
                                if (obj15 == null) {
                                    obj15 = new C0918dd(abstractC0692aA);
                                    weakHashMap3.put(x37, obj15);
                                }
                                spannableString2.setSpan((ClickableSpan) obj15, i26, i27, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) C1013f3.F(spannableString2);
                    accessibilityNodeInfo2 = accessibilityNodeInfo7;
                } else {
                    ps = ps2;
                    c1013f3 = c1013f32;
                    s2 = s23;
                    accessibilityNodeInfo = accessibilityNodeInfo4;
                    q0 = q03;
                    c2023uQ = c2023uQ4;
                    c2287yQ = c2287yQ2;
                    c2023uQ2 = c2023uQ5;
                    accessibilityNodeInfo2 = obtain;
                    spannableString = null;
                }
                accessibilityNodeInfo2.setText(spannableString);
                FQ fq = CQ.z;
                if (linkedHashMap.containsKey(fq)) {
                    accessibilityNodeInfo2.setContentInvalid(true);
                    Object obj16 = linkedHashMap.get(fq);
                    if (obj16 == null) {
                        obj16 = null;
                    }
                    accessibilityNodeInfo2.setError((CharSequence) obj16);
                }
                C2287yQ c2287yQ5 = c2287yQ;
                C1013f3 c1013f34 = c1013f3;
                String p = c1013f34.p(c2287yQ5);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo3 = accessibilityNodeInfo;
                    M0.c(accessibilityNodeInfo3, p);
                } else {
                    accessibilityNodeInfo3 = accessibilityNodeInfo;
                    accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", p);
                }
                accessibilityNodeInfo2.setCheckable(C1013f3.o(c2287yQ5));
                Object obj17 = linkedHashMap.get(CQ.x);
                if (obj17 == null) {
                    obj17 = null;
                }
                UV uv = (UV) obj17;
                if (uv != null) {
                    if (uv == UV.h) {
                        accessibilityNodeInfo3.setChecked(true);
                    } else if (uv == UV.i) {
                        accessibilityNodeInfo3.setChecked(false);
                    }
                }
                Object obj18 = linkedHashMap.get(CQ.w);
                if (obj18 == null) {
                    obj18 = null;
                }
                Boolean bool = (Boolean) obj18;
                if (bool != null) {
                    accessibilityNodeInfo3.setChecked(bool.booleanValue());
                }
                C2023uQ c2023uQ8 = c2023uQ;
                if (c2023uQ8.i) {
                    g3 = c2287yQ5.g((r4 & 1) != 0 ? !c2287yQ5.b : false, (r4 & 2) == 0);
                }
                Object obj19 = linkedHashMap.get(CQ.a);
                if (obj19 == null) {
                    obj19 = null;
                }
                List list9 = (List) obj19;
                accessibilityNodeInfo2.setContentDescription(list9 != null ? (String) AbstractC0720ac.p0(list9) : null);
                Object obj20 = linkedHashMap.get(CQ.r);
                if (obj20 == null) {
                    obj20 = null;
                }
                String str2 = (String) obj20;
                if (str2 != null) {
                    C2287yQ c2287yQ6 = c2287yQ5;
                    while (true) {
                        if (c2287yQ6 == null) {
                            z3 = false;
                            break;
                        }
                        C2023uQ c2023uQ9 = c2287yQ6.d;
                        FQ fq2 = DQ.a;
                        if (c2023uQ9.h.containsKey(fq2)) {
                            z3 = ((Boolean) c2023uQ9.j(fq2)).booleanValue();
                            break;
                        }
                        c2287yQ6 = c2287yQ6.j();
                    }
                    if (z3) {
                        accessibilityNodeInfo2.setViewIdResourceName(str2);
                    }
                }
                FQ fq3 = CQ.a;
                Object obj21 = linkedHashMap.get(CQ.h);
                if (obj21 == null) {
                    obj21 = null;
                }
                if (((C0782bY) obj21) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                    } else {
                        Bundle extras = accessibilityNodeInfo3.getExtras();
                        if (extras != null) {
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        }
                    }
                }
                accessibilityNodeInfo2.setPassword(linkedHashMap.containsKey(CQ.y));
                accessibilityNodeInfo2.setEditable(linkedHashMap.containsKey(CQ.A));
                Object obj22 = linkedHashMap.get(CQ.B);
                if (obj22 == null) {
                    obj22 = null;
                }
                Integer num = (Integer) obj22;
                accessibilityNodeInfo2.setMaxTextLength(num != null ? num.intValue() : -1);
                accessibilityNodeInfo2.setEnabled(AbstractC0048Bt.c(c2287yQ5));
                FQ fq4 = CQ.k;
                accessibilityNodeInfo2.setFocusable(linkedHashMap.containsKey(fq4));
                if (accessibilityNodeInfo2.isFocusable()) {
                    accessibilityNodeInfo2.setFocused(((Boolean) c2023uQ8.j(fq4)).booleanValue());
                    if (accessibilityNodeInfo2.isFocused()) {
                        accessibilityNodeInfo3.addAction(2);
                    } else {
                        accessibilityNodeInfo3.addAction(1);
                    }
                }
                ME c = c2287yQ5.c();
                if (c != null ? c.o0() : false) {
                    c2023uQ3 = c2023uQ2;
                } else {
                    c2023uQ3 = c2023uQ2;
                    if (!c2023uQ3.h.containsKey(CQ.m)) {
                        z = true;
                        accessibilityNodeInfo2.setVisibleToUser(z);
                        obj = linkedHashMap.get(CQ.j);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new ClassCastException();
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        FQ fq5 = C1957tQ.a;
                        Object obj23 = c2023uQ3.h.get(C1957tQ.b);
                        if (obj23 == null) {
                            obj23 = null;
                        }
                        C1599o0 c1599o03 = (C1599o0) obj23;
                        if (c1599o03 != null) {
                            Object obj24 = c2023uQ3.h.get(CQ.w);
                            if (obj24 == null) {
                                obj24 = null;
                            }
                            AbstractC0048Bt.h(obj24, Boolean.TRUE);
                            accessibilityNodeInfo3.setClickable(true);
                            if (AbstractC0048Bt.c(c2287yQ5) && accessibilityNodeInfo3.isClickable()) {
                                L0 l0 = new L0(null, 16, c1599o03.a, null);
                                q02 = q0;
                                q02.a(l0);
                                accessibilityNodeInfo3.setLongClickable(false);
                                obj2 = c2023uQ3.h.get(C1957tQ.c);
                                if (obj2 == null) {
                                    obj2 = null;
                                }
                                c1599o0 = (C1599o0) obj2;
                                if (c1599o0 != null) {
                                    accessibilityNodeInfo3.setLongClickable(true);
                                    if (AbstractC0048Bt.c(c2287yQ5)) {
                                        q02.a(new L0(null, 32, c1599o0.a, null));
                                    }
                                }
                                obj3 = c2023uQ3.h.get(C1957tQ.m);
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                c1599o02 = (C1599o0) obj3;
                                if (c1599o02 != null) {
                                    q02.a(new L0(null, 16384, c1599o02.a, null));
                                }
                                if (AbstractC0048Bt.c(c2287yQ5)) {
                                    Object obj25 = c2023uQ3.h.get(C1957tQ.h);
                                    if (obj25 == null) {
                                        obj25 = null;
                                    }
                                    C1599o0 c1599o04 = (C1599o0) obj25;
                                    if (c1599o04 != null) {
                                        q02.a(new L0(null, 2097152, c1599o04.a, null));
                                    }
                                    Object obj26 = c2023uQ3.h.get(C1957tQ.l);
                                    if (obj26 == null) {
                                        obj26 = null;
                                    }
                                    C1599o0 c1599o05 = (C1599o0) obj26;
                                    if (c1599o05 != null) {
                                        q02.a(new L0(null, R.id.accessibilityActionImeEnter, c1599o05.a, null));
                                    }
                                    Object obj27 = c2023uQ3.h.get(C1957tQ.n);
                                    if (obj27 == null) {
                                        obj27 = null;
                                    }
                                    C1599o0 c1599o06 = (C1599o0) obj27;
                                    if (c1599o06 != null) {
                                        q02.a(new L0(null, 65536, c1599o06.a, null));
                                    }
                                    Object obj28 = c2023uQ3.h.get(C1957tQ.f225o);
                                    if (obj28 == null) {
                                        obj28 = null;
                                    }
                                    C1599o0 c1599o07 = (C1599o0) obj28;
                                    if (c1599o07 != null && accessibilityNodeInfo3.isFocused()) {
                                        ClipDescription primaryClipDescription = s2.m7getClipboardManager().a.getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            q02.a(new L0(null, 32768, c1599o07.a, null));
                                        }
                                    }
                                }
                                q = C1013f3.q(c2287yQ5);
                                if (!(q != null || q.length() == 0)) {
                                    accessibilityNodeInfo3.setTextSelection(c1013f34.m(c2287yQ5), c1013f34.l(c2287yQ5));
                                    Object obj29 = c2023uQ3.h.get(C1957tQ.g);
                                    if (obj29 == null) {
                                        obj29 = null;
                                    }
                                    C1599o0 c1599o08 = (C1599o0) obj29;
                                    q02.a(new L0(null, 131072, c1599o08 != null ? c1599o08.a : null, null));
                                    accessibilityNodeInfo3.addAction(256);
                                    accessibilityNodeInfo3.addAction(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    Object obj30 = c2023uQ3.h.get(CQ.a);
                                    if (obj30 == null) {
                                        obj30 = null;
                                    }
                                    List list10 = (List) obj30;
                                    if (list10 == null || list10.isEmpty()) {
                                        if (c2023uQ3.h.containsKey(C1957tQ.a)) {
                                            if (c2023uQ3.h.containsKey(CQ.u)) {
                                                Object obj31 = c2023uQ3.h.get(fq4);
                                                if (obj31 == null) {
                                                    obj31 = null;
                                                }
                                            }
                                            C0027Ay l = c2287yQ5.c.l();
                                            while (true) {
                                                if (l == null) {
                                                    l = null;
                                                    break;
                                                }
                                                C2023uQ i28 = l.i();
                                                if (i28 != null && i28.i) {
                                                    if (i28.h.containsKey(CQ.u)) {
                                                        break;
                                                    }
                                                }
                                                l = l.l();
                                            }
                                            if (l != null) {
                                                C2023uQ i29 = l.i();
                                                if (i29 != null) {
                                                    Object obj32 = i29.h.get(CQ.k);
                                                    if (obj32 == null) {
                                                        obj32 = null;
                                                    }
                                                    z2 = AbstractC0048Bt.h(obj32, Boolean.TRUE);
                                                } else {
                                                    z2 = false;
                                                }
                                            }
                                            boolean z4 = false;
                                            if (!z4) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                }
                                i2 = Build.VERSION.SDK_INT;
                                if (i2 >= 26) {
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add("androidx.compose.ui.semantics.id");
                                    CharSequence e = q02.e();
                                    if (!(e == null || e.length() == 0)) {
                                        if (c2023uQ3.h.containsKey(C1957tQ.a)) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                    }
                                    if (c2023uQ3.h.containsKey(CQ.r)) {
                                        arrayList3.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (i2 >= 26) {
                                        accessibilityNodeInfo3.setAvailableExtraData(arrayList3);
                                    }
                                }
                                obj4 = c2023uQ3.h.get(CQ.c);
                                if (obj4 == null) {
                                    obj4 = null;
                                }
                                gj = (GJ) obj4;
                                if (gj == null) {
                                    FQ fq6 = C1957tQ.f;
                                    if (c2023uQ3.h.containsKey(fq6)) {
                                        q02.f("android.widget.SeekBar");
                                    } else {
                                        q02.f("android.widget.ProgressBar");
                                    }
                                    GJ gj2 = GJ.b;
                                    if (gj != GJ.b) {
                                        accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2.floatValue(), f2.floatValue(), 0.0f));
                                    }
                                    if (c2023uQ3.h.containsKey(fq6) && AbstractC0048Bt.c(c2287yQ5)) {
                                        float floatValue = f2.floatValue();
                                        float floatValue2 = f2.floatValue();
                                        if (floatValue < floatValue2) {
                                            floatValue = floatValue2;
                                        }
                                        if (0.0f < floatValue) {
                                            q02.a(L0.e);
                                        }
                                        float floatValue3 = f2.floatValue();
                                        float floatValue4 = f2.floatValue();
                                        if (floatValue3 > floatValue4) {
                                            floatValue3 = floatValue4;
                                        }
                                        if (0.0f > floatValue3) {
                                            q02.a(L0.f);
                                        }
                                    }
                                }
                                X2.a(q02, c2287yQ5);
                                AbstractC1807r8.X(q02, c2287yQ5);
                                obj5 = c2287yQ5.i().h.get(CQ.g);
                                if (obj5 == null) {
                                    obj5 = null;
                                }
                                if (obj5 == null) {
                                    throw new ClassCastException();
                                }
                                C2287yQ j4 = c2287yQ5.j();
                                if (j4 != null) {
                                    Object obj33 = j4.i().h.get(CQ.e);
                                    if (obj33 == null) {
                                        obj33 = null;
                                    }
                                    if (obj33 != null) {
                                        Object obj34 = j4.i().h.get(CQ.f);
                                        if (obj34 == null) {
                                            obj34 = null;
                                        }
                                        if (obj34 != null) {
                                            throw new ClassCastException();
                                        }
                                        if (c2287yQ5.i().h.containsKey(CQ.w)) {
                                            ArrayList arrayList4 = new ArrayList();
                                            g2 = j4.g((r4 & 1) != 0 ? !j4.b : false, (r4 & 2) == 0);
                                            int size9 = g2.size();
                                            int i30 = 0;
                                            for (int i31 = 0; i31 < size9; i31++) {
                                                C2287yQ c2287yQ7 = (C2287yQ) g2.get(i31);
                                                if (c2287yQ7.i().h.containsKey(CQ.w)) {
                                                    arrayList4.add(c2287yQ7);
                                                    if (c2287yQ7.c.m() < c2287yQ5.c.m()) {
                                                        i30++;
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                boolean l2 = AbstractC1807r8.l(arrayList4);
                                                int i32 = l2 ? 0 : i30;
                                                int i33 = l2 ? i30 : 0;
                                                Object obj35 = c2287yQ5.i().h.get(CQ.w);
                                                Object obj36 = obj35;
                                                if (obj35 == null) {
                                                    obj36 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i32, 1, i33, 1, false, ((Boolean) obj36).booleanValue()));
                                            }
                                        }
                                    }
                                }
                                Object obj37 = c2023uQ3.h.get(CQ.f22o);
                                if (obj37 == null) {
                                    obj37 = null;
                                }
                                AbstractC1888sN.q(obj37);
                                AbstractC1888sN.q(AbstractC1494mO.f(c2287yQ5.k(), CQ.p));
                                if (i2 >= 29) {
                                    Y2.a(q02, c2287yQ5);
                                }
                                CharSequence charSequence = (CharSequence) AbstractC1494mO.f(c2287yQ5.k(), CQ.d);
                                if (i2 >= 28) {
                                    accessibilityNodeInfo3.setPaneTitle(charSequence);
                                } else {
                                    accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (AbstractC0048Bt.c(c2287yQ5)) {
                                    C1599o0 c1599o09 = (C1599o0) AbstractC1494mO.f(c2287yQ5.k(), C1957tQ.p);
                                    if (c1599o09 != null) {
                                        q02.a(new L0(262144, c1599o09.a()));
                                    }
                                    C1599o0 c1599o010 = (C1599o0) AbstractC1494mO.f(c2287yQ5.k(), C1957tQ.q);
                                    if (c1599o010 != null) {
                                        q02.a(new L0(524288, c1599o010.a()));
                                    }
                                    C1599o0 c1599o011 = (C1599o0) AbstractC1494mO.f(c2287yQ5.k(), C1957tQ.r);
                                    if (c1599o011 != null) {
                                        q02.a(new L0(1048576, c1599o011.a()));
                                    }
                                    C2023uQ k = c2287yQ5.k();
                                    FQ fq7 = C1957tQ.t;
                                    if (k.h.containsKey(fq7)) {
                                        List list11 = (List) c2287yQ5.k().j(fq7);
                                        int size10 = list11.size();
                                        C2274yD c2274yD = C1013f3.L;
                                        if (size10 >= c2274yD.b) {
                                            throw new IllegalStateException("Can't have more than " + c2274yD.b + " custom actions for one widget");
                                        }
                                        PS ps4 = new PS(0);
                                        GD gd = AbstractC2210xF.a;
                                        GD gd2 = new GD();
                                        PS ps5 = ps;
                                        i3 = i;
                                        if (AbstractC1473m3.h(ps5.j, i3, ps5.h) >= 0) {
                                            GD gd3 = (GD) ps5.c(i3);
                                            C2274yD c2274yD2 = new C2274yD();
                                            int[] iArr = c2274yD.a;
                                            int i34 = c2274yD.b;
                                            for (int i35 = 0; i35 < i34; i35++) {
                                                c2274yD2.a(iArr[i35]);
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            if (list11.size() > 0) {
                                                AbstractC1888sN.q(list11.get(0));
                                                AbstractC0048Bt.k(gd3);
                                                throw null;
                                            }
                                            if (arrayList5.size() > 0) {
                                                AbstractC1888sN.q(arrayList5.get(0));
                                                c2274yD2.c(0);
                                                throw null;
                                            }
                                        } else if (list11.size() > 0) {
                                            AbstractC1888sN.q(list11.get(0));
                                            c2274yD.c(0);
                                            throw null;
                                        }
                                        c1013f34.q.d(i3, ps4);
                                        ps5.d(i3, gd2);
                                        boolean s = c1013f34.s(c2287yQ5);
                                        if (Build.VERSION.SDK_INT < 28) {
                                            accessibilityNodeInfo3.setScreenReaderFocusable(s);
                                        } else {
                                            Bundle extras2 = accessibilityNodeInfo3.getExtras();
                                            if (extras2 != null) {
                                                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (s ? 1 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                                            }
                                        }
                                        C2208xD c2208xD = c1013f34.A;
                                        int c2 = c2208xD.c(i3);
                                        i4 = c2 < 0 ? c2208xD.c[c2] : -1;
                                        if (i4 == -1) {
                                            AbstractC1052fg.P(s2.getAndroidViewsHandler$ui_release(), i4);
                                            s22 = s2;
                                            accessibilityNodeInfo3.setTraversalBefore(s22, i4);
                                            c1013f34.e(i3, q02, c1013f34.C, null);
                                        } else {
                                            s22 = s2;
                                        }
                                        C2208xD c2208xD2 = c1013f34.B;
                                        int c3 = c2208xD2.c(i3);
                                        i5 = c3 < 0 ? c2208xD2.c[c3] : -1;
                                        if (i5 != -1) {
                                            AbstractC1052fg.P(s22.getAndroidViewsHandler$ui_release(), i5);
                                        }
                                        return q02;
                                    }
                                }
                                i3 = i;
                                boolean s3 = c1013f34.s(c2287yQ5);
                                if (Build.VERSION.SDK_INT < 28) {
                                }
                                C2208xD c2208xD3 = c1013f34.A;
                                int c22 = c2208xD3.c(i3);
                                if (c22 < 0) {
                                }
                                if (i4 == -1) {
                                }
                                C2208xD c2208xD22 = c1013f34.B;
                                int c32 = c2208xD22.c(i3);
                                if (c32 < 0) {
                                }
                                if (i5 != -1) {
                                }
                                return q02;
                            }
                        }
                        q02 = q0;
                        accessibilityNodeInfo3.setLongClickable(false);
                        obj2 = c2023uQ3.h.get(C1957tQ.c);
                        if (obj2 == null) {
                        }
                        c1599o0 = (C1599o0) obj2;
                        if (c1599o0 != null) {
                        }
                        obj3 = c2023uQ3.h.get(C1957tQ.m);
                        if (obj3 == null) {
                        }
                        c1599o02 = (C1599o0) obj3;
                        if (c1599o02 != null) {
                        }
                        if (AbstractC0048Bt.c(c2287yQ5)) {
                        }
                        q = C1013f3.q(c2287yQ5);
                        if (!(q != null || q.length() == 0)) {
                        }
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 26) {
                        }
                        obj4 = c2023uQ3.h.get(CQ.c);
                        if (obj4 == null) {
                        }
                        gj = (GJ) obj4;
                        if (gj == null) {
                        }
                        X2.a(q02, c2287yQ5);
                        AbstractC1807r8.X(q02, c2287yQ5);
                        obj5 = c2287yQ5.i().h.get(CQ.g);
                        if (obj5 == null) {
                        }
                        if (obj5 == null) {
                        }
                    }
                }
                z = false;
                accessibilityNodeInfo2.setVisibleToUser(z);
                obj = linkedHashMap.get(CQ.j);
                if (obj == null) {
                }
                if (obj == null) {
                }
            }
        }
        return null;
    }

    @Override // o.Y1
    public final Q0 X() {
        return W(this.n.n);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x017d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x055f, code lost:
    
        if (r0 != 16) goto L403;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05df  */
    @Override // o.Y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(int i, int i2, Bundle bundle) {
        C2287yQ c2287yQ;
        int i3;
        int i4;
        Integer num;
        E0 e0;
        int i5;
        int i6;
        InterfaceC1455lp interfaceC1455lp;
        InterfaceC1455lp interfaceC1455lp2;
        InterfaceC1455lp interfaceC1455lp3;
        InterfaceC1455lp interfaceC1455lp4;
        InterfaceC2114vp interfaceC2114vp;
        InterfaceC1455lp interfaceC1455lp5;
        InterfaceC1455lp interfaceC1455lp6;
        InterfaceC1455lp interfaceC1455lp7;
        InterfaceC1455lp interfaceC1455lp8;
        InterfaceC1455lp interfaceC1455lp9;
        InterfaceC2114vp interfaceC2114vp2;
        C1599o0 c1599o0;
        long j;
        Object obj;
        InterfaceC2312yp interfaceC2312yp;
        InterfaceC2114vp interfaceC2114vp3;
        InterfaceC1455lp interfaceC1455lp10;
        InterfaceC1455lp interfaceC1455lp11;
        InterfaceC1455lp interfaceC1455lp12;
        InterfaceC1455lp interfaceC1455lp13;
        InterfaceC1455lp interfaceC1455lp14;
        C1013f3 c1013f3 = this.n;
        S2 s2 = c1013f3.d;
        AQ aq = (AQ) c1013f3.n().e(i);
        if (aq != null && (c2287yQ = aq.a) != null) {
            C0027Ay c0027Ay = c2287yQ.c;
            int i7 = c2287yQ.g;
            C2023uQ c2023uQ = c2287yQ.d;
            LinkedHashMap linkedHashMap = c2023uQ.h;
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = c1013f3.g;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c1013f3.n) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    i4 = 12;
                    num = null;
                    C1013f3.y(c1013f3, i3, 65536, null, 12);
                } else {
                    i4 = 12;
                    num = null;
                }
                c1013f3.n = i;
                s2.invalidate();
                C1013f3.y(c1013f3, i, 32768, num, i4);
                return true;
            }
            if (i2 == 128) {
                if (c1013f3.n != i) {
                    return false;
                }
                c1013f3.n = Integer.MIN_VALUE;
                s2.invalidate();
                C1013f3.y(c1013f3, i, 65536, null, 12);
                return true;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z2 = i2 == 256;
                    Integer num2 = c1013f3.t;
                    if (num2 == null || i7 != num2.intValue()) {
                        c1013f3.s = -1;
                        c1013f3.t = Integer.valueOf(i7);
                    }
                    String q = C1013f3.q(c2287yQ);
                    if (q != null && q.length() != 0) {
                        String q2 = C1013f3.q(c2287yQ);
                        if (q2 != null && q2.length() != 0) {
                            if (i8 == 1) {
                                Locale locale = s2.getContext().getResources().getConfiguration().locale;
                                if (F0.e == null) {
                                    F0 f0 = new F0(0);
                                    f0.d = BreakIterator.getCharacterInstance(locale);
                                    F0.e = f0;
                                }
                                F0 f02 = F0.e;
                                AbstractC0048Bt.l(f02, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                f02.m(q2);
                                e0 = f02;
                            } else if (i8 != 2) {
                                if (i8 != 4) {
                                    if (i8 == 8) {
                                        if (G0.c == null) {
                                            G0.c = new G0();
                                        }
                                        G0 g0 = G0.c;
                                        AbstractC0048Bt.l(g0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                        g0.a = q2;
                                        e0 = g0;
                                    }
                                }
                                if (linkedHashMap.containsKey(C1957tQ.a)) {
                                    AbstractC1052fg.D(c2023uQ);
                                }
                            } else {
                                Locale locale2 = s2.getContext().getResources().getConfiguration().locale;
                                if (F0.f == null) {
                                    F0 f03 = new F0(1);
                                    f03.d = BreakIterator.getWordInstance(locale2);
                                    F0.f = f03;
                                }
                                F0 f04 = F0.f;
                                AbstractC0048Bt.l(f04, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                f04.m(q2);
                                e0 = f04;
                            }
                            if (e0 != null) {
                                int l = c1013f3.l(c2287yQ);
                                if (l == -1) {
                                    l = z2 ? 0 : q.length();
                                }
                                int[] e = z2 ? e0.e(l) : e0.k(l);
                                if (e != null) {
                                    int i9 = e[0];
                                    int i10 = e[1];
                                    if (z && !linkedHashMap.containsKey(CQ.a) && linkedHashMap.containsKey(CQ.u)) {
                                        i5 = c1013f3.m(c2287yQ);
                                        if (i5 == -1) {
                                            i5 = z2 ? i9 : i10;
                                        }
                                        i6 = z2 ? i10 : i9;
                                    } else {
                                        i5 = z2 ? i10 : i9;
                                        i6 = i5;
                                    }
                                    c1013f3.x = new C0751b3(c2287yQ, z2 ? 256 : 512, i8, i9, i10, SystemClock.uptimeMillis());
                                    c1013f3.D(c2287yQ, i5, i6, true);
                                    return true;
                                }
                            }
                        }
                        e0 = null;
                        if (e0 != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object obj2 = linkedHashMap.get(C1957tQ.m);
                C1599o0 c1599o02 = (C1599o0) (obj2 == null ? null : obj2);
                if (c1599o02 != null && (interfaceC1455lp = (InterfaceC1455lp) c1599o02.b) != null) {
                    return ((Boolean) interfaceC1455lp.invoke()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean D = c1013f3.D(c2287yQ, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (D) {
                        C1013f3.y(c1013f3, c1013f3.u(i7), 0, null, 12);
                    }
                    return D;
                }
                if (AbstractC0048Bt.c(c2287yQ)) {
                    if (i2 == 1) {
                        Object obj3 = linkedHashMap.get(C1957tQ.s);
                        C1599o0 c1599o03 = (C1599o0) (obj3 == null ? null : obj3);
                        if (c1599o03 != null && (interfaceC1455lp2 = (InterfaceC1455lp) c1599o03.b) != null) {
                            return ((Boolean) interfaceC1455lp2.invoke()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        switch (i2) {
                            case 16:
                                Object obj4 = linkedHashMap.get(C1957tQ.b);
                                if (obj4 == null) {
                                    obj4 = null;
                                }
                                C1599o0 c1599o04 = (C1599o0) obj4;
                                Boolean bool = (c1599o04 == null || (interfaceC1455lp3 = (InterfaceC1455lp) c1599o04.b) == null) ? null : (Boolean) interfaceC1455lp3.invoke();
                                C1013f3.y(c1013f3, i, 1, null, 12);
                                if (bool != null) {
                                    return bool.booleanValue();
                                }
                                break;
                            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                Object obj5 = linkedHashMap.get(C1957tQ.c);
                                C1599o0 c1599o05 = (C1599o0) (obj5 == null ? null : obj5);
                                if (c1599o05 != null && (interfaceC1455lp4 = (InterfaceC1455lp) c1599o05.b) != null) {
                                    return ((Boolean) interfaceC1455lp4.invoke()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z3 = i2 == 4096;
                                boolean z4 = i2 == 8192;
                                if (i2 == 16908345) {
                                }
                                if (i2 == 16908347) {
                                }
                                if (i2 == 16908344) {
                                }
                                if (i2 != 16908346) {
                                }
                                if (z3 || z4) {
                                    Object obj6 = linkedHashMap.get(CQ.c);
                                    if (obj6 == null) {
                                        obj6 = null;
                                    }
                                    GJ gj = (GJ) obj6;
                                    Object obj7 = linkedHashMap.get(C1957tQ.f);
                                    if (obj7 == null) {
                                        obj7 = null;
                                    }
                                    C1599o0 c1599o06 = (C1599o0) obj7;
                                    if (gj != null && c1599o06 != null) {
                                        float f = 0.0f / 20;
                                        if (z4) {
                                            f = -f;
                                        }
                                        InterfaceC2114vp interfaceC2114vp4 = (InterfaceC2114vp) c1599o06.b;
                                        if (interfaceC2114vp4 != null) {
                                            return ((Boolean) interfaceC2114vp4.invoke(Float.valueOf(0.0f + f))).booleanValue();
                                        }
                                    }
                                }
                                C1032fM j2 = AbstractC1807r8.j((C0384Os) c0027Ay.u.c);
                                AbstractC1035fP.a(j2.c(), j2.b());
                                ArrayList arrayList = new ArrayList();
                                Object obj8 = linkedHashMap.get(C1957tQ.y);
                                if (obj8 == null) {
                                    obj8 = null;
                                }
                                C1599o0 c1599o07 = (C1599o0) obj8;
                                if (c1599o07 != null && (interfaceC2114vp = (InterfaceC2114vp) c1599o07.b) != null && ((Boolean) interfaceC2114vp.invoke(arrayList)).booleanValue()) {
                                }
                                Object obj9 = linkedHashMap.get(C1957tQ.d);
                                if (obj9 == null) {
                                    obj9 = null;
                                }
                                if (((C1599o0) obj9) != null) {
                                    Object obj10 = linkedHashMap.get(CQ.f22o);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    if (obj10 != null) {
                                        throw new ClassCastException();
                                    }
                                    Object obj11 = linkedHashMap.get(CQ.p);
                                    if ((obj11 == null ? null : obj11) != null) {
                                        throw new ClassCastException();
                                    }
                                }
                                break;
                            case 32768:
                                Object obj12 = linkedHashMap.get(C1957tQ.f225o);
                                C1599o0 c1599o08 = (C1599o0) (obj12 == null ? null : obj12);
                                if (c1599o08 != null && (interfaceC1455lp5 = (InterfaceC1455lp) c1599o08.b) != null) {
                                    return ((Boolean) interfaceC1455lp5.invoke()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object obj13 = linkedHashMap.get(C1957tQ.n);
                                C1599o0 c1599o09 = (C1599o0) (obj13 == null ? null : obj13);
                                if (c1599o09 != null && (interfaceC1455lp6 = (InterfaceC1455lp) c1599o09.b) != null) {
                                    return ((Boolean) interfaceC1455lp6.invoke()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object obj14 = linkedHashMap.get(C1957tQ.p);
                                C1599o0 c1599o010 = (C1599o0) (obj14 == null ? null : obj14);
                                if (c1599o010 != null && (interfaceC1455lp7 = (InterfaceC1455lp) c1599o010.b) != null) {
                                    return ((Boolean) interfaceC1455lp7.invoke()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object obj15 = linkedHashMap.get(C1957tQ.q);
                                C1599o0 c1599o011 = (C1599o0) (obj15 == null ? null : obj15);
                                if (c1599o011 != null && (interfaceC1455lp8 = (InterfaceC1455lp) c1599o011.b) != null) {
                                    return ((Boolean) interfaceC1455lp8.invoke()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object obj16 = linkedHashMap.get(C1957tQ.r);
                                C1599o0 c1599o012 = (C1599o0) (obj16 == null ? null : obj16);
                                if (c1599o012 != null && (interfaceC1455lp9 = (InterfaceC1455lp) c1599o012.b) != null) {
                                    return ((Boolean) interfaceC1455lp9.invoke()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object obj17 = linkedHashMap.get(C1957tQ.h);
                                if (obj17 == null) {
                                    obj17 = null;
                                }
                                C1599o0 c1599o013 = (C1599o0) obj17;
                                if (c1599o013 != null && (interfaceC2114vp2 = (InterfaceC2114vp) c1599o013.b) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) interfaceC2114vp2.invoke(new Y3(string, null, null, null))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                C2287yQ j3 = c2287yQ.j();
                                if (j3 != null) {
                                    Object obj18 = j3.d.h.get(C1957tQ.d);
                                    if (obj18 == null) {
                                        obj18 = null;
                                    }
                                    c1599o0 = (C1599o0) obj18;
                                    while (j3 != null && c1599o0 == null) {
                                        j3 = j3.j();
                                        if (j3 != null) {
                                            Object obj19 = j3.d.h.get(C1957tQ.d);
                                            if (obj19 == null) {
                                                obj19 = null;
                                            }
                                            c1599o0 = (C1599o0) obj19;
                                        }
                                    }
                                    if (j3 != null) {
                                        LinkedHashMap linkedHashMap2 = j3.d.h;
                                        C0027Ay c0027Ay2 = j3.c;
                                        C1032fM j4 = AbstractC1807r8.j((C0384Os) c0027Ay2.u.c);
                                        InterfaceC1991ty h = ((C0384Os) c0027Ay2.u.c).h();
                                        long q0 = h != null ? ((ME) h).q0(0L) : 0L;
                                        float b = BF.b(q0) + j4.a;
                                        float c = BF.c(q0) + j4.b;
                                        float b2 = BF.b(q0) + j4.c;
                                        float c2 = BF.c(q0) + j4.d;
                                        ME c3 = c2287yQ.c();
                                        if (c3 != null) {
                                            if (!c3.h0().m) {
                                                c3 = null;
                                            }
                                            if (c3 != null) {
                                                j = c3.q0(0L);
                                                ME c4 = c2287yQ.c();
                                                C1032fM e2 = AbstractC0022At.e(j, AbstractC0946e20.T(c4 != null ? c4.d : 0L));
                                                obj = linkedHashMap2.get(CQ.f22o);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                if (obj == null) {
                                                    throw new ClassCastException();
                                                }
                                                Object obj20 = linkedHashMap2.get(CQ.p);
                                                if ((obj20 == null ? null : obj20) != null) {
                                                    throw new ClassCastException();
                                                }
                                                float f2 = e2.a - b;
                                                float f3 = e2.c - b2;
                                                if (Math.signum(f2) != Math.signum(f3)) {
                                                    f2 = 0.0f;
                                                } else if (Math.abs(f2) >= Math.abs(f3)) {
                                                    f2 = f3;
                                                }
                                                if (c0027Ay.r == EnumC2057uy.i) {
                                                    f2 = -f2;
                                                }
                                                float f4 = e2.b - c;
                                                float f5 = e2.d - c2;
                                                float f6 = Math.signum(f4) == Math.signum(f5) ? Math.abs(f4) < Math.abs(f5) ? f4 : f5 : 0.0f;
                                                if (c1599o0 != null && (interfaceC2312yp = (InterfaceC2312yp) c1599o0.b) != null) {
                                                    return ((Boolean) interfaceC2312yp.invoke(Float.valueOf(f2), Float.valueOf(f6))).booleanValue();
                                                }
                                            }
                                        }
                                        j = 0;
                                        ME c42 = c2287yQ.c();
                                        C1032fM e22 = AbstractC0022At.e(j, AbstractC0946e20.T(c42 != null ? c42.d : 0L));
                                        obj = linkedHashMap2.get(CQ.f22o);
                                        if (obj == null) {
                                        }
                                        if (obj == null) {
                                        }
                                    }
                                }
                                c1599o0 = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object obj21 = linkedHashMap.get(C1957tQ.f);
                                    C1599o0 c1599o014 = (C1599o0) (obj21 == null ? null : obj21);
                                    if (c1599o014 != null && (interfaceC2114vp3 = (InterfaceC2114vp) c1599o014.b) != null) {
                                        return ((Boolean) interfaceC2114vp3.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object obj22 = linkedHashMap.get(C1957tQ.l);
                                C1599o0 c1599o015 = (C1599o0) (obj22 == null ? null : obj22);
                                if (c1599o015 != null && (interfaceC1455lp10 = (InterfaceC1455lp) c1599o015.b) != null) {
                                    return ((Boolean) interfaceC1455lp10.invoke()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object obj23 = linkedHashMap.get(C1957tQ.u);
                                                C1599o0 c1599o016 = (C1599o0) (obj23 == null ? null : obj23);
                                                if (c1599o016 != null && (interfaceC1455lp11 = (InterfaceC1455lp) c1599o016.b) != null) {
                                                    return ((Boolean) interfaceC1455lp11.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object obj24 = linkedHashMap.get(C1957tQ.w);
                                                C1599o0 c1599o017 = (C1599o0) (obj24 == null ? null : obj24);
                                                if (c1599o017 != null && (interfaceC1455lp12 = (InterfaceC1455lp) c1599o017.b) != null) {
                                                    return ((Boolean) interfaceC1455lp12.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object obj25 = linkedHashMap.get(C1957tQ.v);
                                                C1599o0 c1599o018 = (C1599o0) (obj25 == null ? null : obj25);
                                                if (c1599o018 != null && (interfaceC1455lp13 = (InterfaceC1455lp) c1599o018.b) != null) {
                                                    return ((Boolean) interfaceC1455lp13.invoke()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object obj26 = linkedHashMap.get(C1957tQ.x);
                                                C1599o0 c1599o019 = (C1599o0) (obj26 == null ? null : obj26);
                                                if (c1599o019 != null && (interfaceC1455lp14 = (InterfaceC1455lp) c1599o019.b) != null) {
                                                    return ((Boolean) interfaceC1455lp14.invoke()).booleanValue();
                                                }
                                                break;
                                            default:
                                                PS ps = (PS) c1013f3.q.c(i);
                                                if (ps != null && ((CharSequence) ps.c(i2)) != null) {
                                                    Object obj27 = linkedHashMap.get(C1957tQ.t);
                                                    List list = (List) (obj27 == null ? null : obj27);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        throw new ClassCastException();
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object obj28 = linkedHashMap.get(CQ.k);
                        if (AbstractC0048Bt.h(obj28 == null ? null : obj28, Boolean.TRUE)) {
                            ((androidx.compose.ui.focus.a) s2.getFocusOwner()).a(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
