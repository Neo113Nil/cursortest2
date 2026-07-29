package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013f3 extends C0 {
    public static final C2274yD L;
    public final C2208xD A;
    public final C2208xD B;
    public final String C;
    public final String D;
    public final C0950e6 E;
    public final C2340zD F;
    public C2353zQ G;
    public boolean H;
    public final D1 I;
    public final ArrayList J;
    public final C0882d3 K;
    public final S2 d;
    public int e = Integer.MIN_VALUE;
    public final C0882d3 f = new C0882d3(this, 0);
    public final AccessibilityManager g;
    public long h;
    public final U2 i;
    public final V2 j;
    public List k;
    public final Handler l;
    public final Z2 m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final C2340zD f163o;
    public final C2340zD p;
    public final PS q;
    public final PS r;
    public int s;
    public Integer t;
    public final N6 u;
    public final J8 v;
    public boolean w;
    public C0751b3 x;
    public C2340zD y;
    public final AD z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = AbstractC0933dt.a;
        C2274yD c2274yD = new C2274yD(32);
        int i2 = c2274yD.b;
        if (i2 < 0) {
            StringBuilder i3 = AbstractC2188wx.i(i2, "Index ", " must be in 0..");
            i3.append(c2274yD.b);
            throw new IndexOutOfBoundsException(i3.toString());
        }
        int i4 = i2 + 32;
        c2274yD.b(i4);
        int[] iArr2 = c2274yD.a;
        int i5 = c2274yD.b;
        if (i2 != i5) {
            P6.a0(i4, i2, i5, iArr2, iArr2);
        }
        P6.c0(i2, 0, 12, iArr, iArr2);
        c2274yD.b += 32;
        L = c2274yD;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o.U2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.V2] */
    public C1013f3(S2 s2) {
        this.d = s2;
        Object systemService = s2.getContext().getSystemService("accessibility");
        AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: o.U2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                C1013f3 c1013f3 = C1013f3.this;
                c1013f3.k = z ? c1013f3.g.getEnabledAccessibilityServiceList(-1) : C1318jk.h;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.V2
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C1013f3 c1013f3 = C1013f3.this;
                c1013f3.k = c1013f3.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new Z2(this);
        this.n = Integer.MIN_VALUE;
        this.f163o = new C2340zD();
        this.p = new C2340zD();
        this.q = new PS(0);
        this.r = new PS(0);
        this.s = -1;
        this.u = new N6(0);
        this.v = AbstractC1807r8.b(1, 6, null);
        this.w = true;
        C2340zD c2340zD = AbstractC0999et.a;
        AbstractC0048Bt.l(c2340zD, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.y = c2340zD;
        this.z = new AD();
        this.A = new C2208xD();
        this.B = new C2208xD();
        this.C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.E = new C0950e6(27);
        this.F = new C2340zD();
        C2287yQ a = s2.getSemanticsOwner().a();
        AbstractC0048Bt.l(c2340zD, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.G = new C2353zQ(a, c2340zD);
        s2.addOnAttachStateChangeListener(new W2(0, this));
        this.I = new D1(3, this);
        this.J = new ArrayList();
        this.K = new C0882d3(this, 1);
    }

    public static CharSequence F(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                AbstractC0048Bt.l(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static boolean o(C2287yQ c2287yQ) {
        Object obj = c2287yQ.d.h.get(CQ.x);
        if (obj == null) {
            obj = null;
        }
        UV uv = (UV) obj;
        LinkedHashMap linkedHashMap = c2287yQ.d.h;
        Object obj2 = linkedHashMap.get(CQ.q);
        if (obj2 == null) {
            obj2 = null;
        }
        boolean z = uv != null;
        Object obj3 = linkedHashMap.get(CQ.w);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return true;
        }
        return z;
    }

    public static String q(C2287yQ c2287yQ) {
        Y3 y3;
        if (c2287yQ != null) {
            C2023uQ c2023uQ = c2287yQ.d;
            LinkedHashMap linkedHashMap = c2023uQ.h;
            FQ fq = CQ.a;
            if (linkedHashMap.containsKey(fq)) {
                return AbstractC1052fg.l(",", (List) c2023uQ.j(fq));
            }
            FQ fq2 = CQ.u;
            if (linkedHashMap.containsKey(fq2)) {
                Object obj = linkedHashMap.get(fq2);
                if (obj == null) {
                    obj = null;
                }
                Y3 y32 = (Y3) obj;
                if (y32 != null) {
                    return y32.h;
                }
            } else {
                Object obj2 = linkedHashMap.get(CQ.s);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null && (y3 = (Y3) AbstractC0720ac.p0(list)) != null) {
                    return y3.h;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void y(C1013f3 c1013f3, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        c1013f3.x(i, i2, num, null);
    }

    public final void A(int i) {
        C0751b3 c0751b3 = this.x;
        if (c0751b3 != null) {
            C2287yQ c2287yQ = c0751b3.a;
            if (i != c2287yQ.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0751b3.f <= 1000) {
                AccessibilityEvent i2 = i(u(c2287yQ.g), 131072);
                i2.setFromIndex(c0751b3.d);
                i2.setToIndex(c0751b3.e);
                i2.setAction(c0751b3.b);
                i2.setMovementGranularity(c0751b3.c);
                i2.getText().add(q(c2287yQ));
                w(i2);
            }
        }
        this.x = null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void B(o.C2340zD r41) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1013f3.B(o.zD):void");
    }

    public final void C(C0027Ay c0027Ay, AD ad) {
        C2023uQ i;
        if (c0027Ay.v() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c0027Ay)) {
            C0027Ay c0027Ay2 = null;
            if (!c0027Ay.u.f(8)) {
                c0027Ay = c0027Ay.l();
                while (true) {
                    if (c0027Ay == null) {
                        c0027Ay = null;
                        break;
                    } else if (c0027Ay.u.f(8)) {
                        break;
                    } else {
                        c0027Ay = c0027Ay.l();
                    }
                }
            }
            if (c0027Ay == null || (i = c0027Ay.i()) == null) {
                return;
            }
            if (!i.i) {
                C0027Ay l = c0027Ay.l();
                while (true) {
                    if (l != null) {
                        C2023uQ i2 = l.i();
                        if (i2 != null && i2.i) {
                            c0027Ay2 = l;
                            break;
                        }
                        l = l.l();
                    } else {
                        break;
                    }
                }
                if (c0027Ay2 != null) {
                    c0027Ay = c0027Ay2;
                }
            }
            int i3 = c0027Ay.c;
            if (ad.a(i3)) {
                y(this, u(i3), 2048, 1, 8);
            }
        }
    }

    public final boolean D(C2287yQ c2287yQ, int i, int i2, boolean z) {
        String q;
        C2023uQ c2023uQ = c2287yQ.d;
        int i3 = c2287yQ.g;
        FQ fq = C1957tQ.g;
        if (c2023uQ.h.containsKey(fq) && AbstractC0048Bt.c(c2287yQ)) {
            InterfaceC2378zp interfaceC2378zp = (InterfaceC2378zp) ((C1599o0) c2287yQ.d.j(fq)).b;
            if (interfaceC2378zp != null) {
                return ((Boolean) interfaceC2378zp.e(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.s) && (q = q(c2287yQ)) != null) {
            if (i < 0 || i != i2 || i2 > q.length()) {
                i = -1;
            }
            this.s = i;
            boolean z2 = q.length() > 0;
            w(j(u(i3), z2 ? Integer.valueOf(this.s) : null, z2 ? Integer.valueOf(this.s) : null, z2 ? Integer.valueOf(q.length()) : null, q));
            A(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[LOOP:1: B:8:0x0030->B:26:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[EDGE_INSN: B:27:0x00d4->B:34:0x00d4 BREAK  A[LOOP:1: B:8:0x0030->B:26:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList E(ArrayList arrayList, boolean z) {
        C2340zD c2340zD = AbstractC0999et.a;
        C2340zD c2340zD2 = new C2340zD();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((C2287yQ) arrayList.get(i), arrayList2, c2340zD2);
        }
        ArrayList arrayList3 = new ArrayList();
        int w = AbstractC0868ct.w(arrayList2);
        int i2 = 1;
        if (w >= 0) {
            int i3 = 0;
            while (true) {
                C2287yQ c2287yQ = (C2287yQ) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = c2287yQ.f().b;
                    float f2 = c2287yQ.f().d;
                    boolean z2 = f >= f2;
                    int w2 = AbstractC0868ct.w(arrayList3);
                    if (w2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            C1032fM c1032fM = (C1032fM) ((C1619oH) arrayList3.get(i4)).h;
                            float f3 = c1032fM.b;
                            float f4 = c1032fM.d;
                            boolean z3 = f3 >= f4;
                            if (!z2 && !z3 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList3.set(i4, new C1619oH(new C1032fM(Math.max(c1032fM.a, 0.0f), Math.max(c1032fM.b, f), Math.min(c1032fM.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((C1619oH) arrayList3.get(i4)).i));
                                ((List) ((C1619oH) arrayList3.get(i4)).i).add(c2287yQ);
                                break;
                            }
                            if (i4 == w2) {
                                break;
                            }
                            i4++;
                        }
                        if (i3 != w) {
                            break;
                        }
                        i3++;
                    }
                }
                arrayList3.add(new C1619oH(c2287yQ.f(), AbstractC0868ct.N(c2287yQ)));
                if (i3 != w) {
                }
            }
        }
        AbstractC0982ec.e0(arrayList3, C0685a3.d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C1619oH c1619oH = (C1619oH) arrayList3.get(i5);
            AbstractC0982ec.e0((List) c1619oH.i, new C0947e3(i2, new C0947e3(z ? C0685a3.c : C0685a3.b)));
            arrayList4.addAll((Collection) c1619oH.i);
        }
        int i6 = 0;
        AbstractC0982ec.e0(arrayList4, new T2(i6));
        while (i6 <= AbstractC0868ct.w(arrayList4)) {
            List list = (List) c2340zD2.e(((C2287yQ) arrayList4.get(i6)).g);
            if (list != null) {
                if (s((C2287yQ) arrayList4.get(i6))) {
                    i6++;
                } else {
                    arrayList4.remove(i6);
                }
                arrayList4.addAll(i6, list);
                i6 += list.size();
            } else {
                i6++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        AD ad = new AD();
        AD ad2 = this.z;
        int[] iArr = ad2.b;
        long[] jArr3 = ad2.a;
        int length = jArr3.length - 2;
        C2340zD c2340zD = this.F;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            AQ aq = (AQ) n().e(i8);
                            C2287yQ c2287yQ = aq != null ? aq.a : null;
                            if (c2287yQ != null) {
                                if (c2287yQ.d.h.containsKey(CQ.d)) {
                                }
                            }
                            ad.a(i8);
                            C2353zQ c2353zQ = (C2353zQ) c2340zD.e(i8);
                            if (c2353zQ != null) {
                                Object obj = c2353zQ.a.h.get(CQ.d);
                                r23 = obj != 0 ? obj : null;
                            }
                            z(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = ad.b;
        long[] jArr4 = ad.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = ad2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = ad2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (ad2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                ad2.f(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        c2340zD.a();
        C2340zD n = n();
        int[] iArr3 = n.b;
        Object[] objArr = n.c;
        long[] jArr6 = n.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            C2287yQ c2287yQ2 = ((AQ) objArr[i26]).a;
                            C2023uQ c2023uQ = c2287yQ2.d;
                            FQ fq = CQ.d;
                            if (c2023uQ.h.containsKey(fq) && ad2.a(i27)) {
                                z((String) c2287yQ2.d.j(fq), i27, 16);
                            }
                            c2340zD.h(i27, new C2353zQ(c2287yQ2, n()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.G = new C2353zQ(this.d.getSemanticsOwner().a(), n());
    }

    @Override // o.C0
    public final Y1 a(View view) {
        return this.m;
    }

    public final void e(int i, Q0 q0, String str, Bundle bundle) {
        C2287yQ c2287yQ;
        AccessibilityNodeInfo accessibilityNodeInfo = q0.a;
        AQ aq = (AQ) n().e(i);
        if (aq == null || (c2287yQ = aq.a) == null) {
            return;
        }
        C2023uQ c2023uQ = c2287yQ.d;
        LinkedHashMap linkedHashMap = c2023uQ.h;
        String q = q(c2287yQ);
        if (AbstractC0048Bt.h(str, this.C)) {
            C2208xD c2208xD = this.A;
            int c = c2208xD.c(i);
            int i2 = c >= 0 ? c2208xD.c[c] : -1;
            if (i2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i2);
                return;
            }
            return;
        }
        if (AbstractC0048Bt.h(str, this.D)) {
            C2208xD c2208xD2 = this.B;
            int c2 = c2208xD2.c(i);
            int i3 = c2 >= 0 ? c2208xD2.c[c2] : -1;
            if (i3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i3);
                return;
            }
            return;
        }
        if (linkedHashMap.containsKey(C1957tQ.a) && bundle != null && AbstractC0048Bt.h(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            if (bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1) > 0 && i4 >= 0) {
                if (i4 < (q != null ? q.length() : Integer.MAX_VALUE)) {
                    AbstractC1052fg.D(c2023uQ);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        FQ fq = CQ.r;
        if (!linkedHashMap.containsKey(fq) || bundle == null || !AbstractC0048Bt.h(str, "androidx.compose.ui.semantics.testTag")) {
            if (AbstractC0048Bt.h(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, c2287yQ.g);
                return;
            }
            return;
        }
        Object obj = linkedHashMap.get(fq);
        if (obj == null) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        if (o.PX.D(r7, r0) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:14:0x0059, B:20:0x006d, B:22:0x0075, B:25:0x0084, B:27:0x0089, B:31:0x00b8, B:32:0x0099, B:36:0x00aa, B:38:0x00b2, B:41:0x00bb, B:42:0x00c0, B:45:0x00c1, B:46:0x00c6, B:48:0x00c7, B:50:0x00ce, B:51:0x00d7, B:58:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0082 -> B:13:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ee -> B:13:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC2367ze abstractC2367ze) {
        C0816c3 c0816c3;
        int i;
        AD ad;
        I8 i8;
        C1013f3 c1013f3;
        AD ad2;
        I8 i82;
        Object b;
        try {
            if (abstractC2367ze instanceof C0816c3) {
                c0816c3 = (C0816c3) abstractC2367ze;
                int i2 = c0816c3.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0816c3.m = i2 - Integer.MIN_VALUE;
                    Object obj = c0816c3.k;
                    i = c0816c3.m;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        try {
                            ad = new AD();
                            J8 j8 = this.v;
                            j8.getClass();
                            i8 = new I8(j8);
                            c1013f3 = this;
                            c0816c3.h = c1013f3;
                            c0816c3.i = ad;
                            c0816c3.j = i8;
                            c0816c3.m = 1;
                            b = i8.b(c0816c3);
                            if (b == enumC0448Re) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.u.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        i82 = c0816c3.j;
                        ad2 = c0816c3.i;
                        c1013f3 = c0816c3.h;
                        AbstractC1494mO.l(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i82 = c0816c3.j;
                        ad2 = c0816c3.i;
                        c1013f3 = c0816c3.h;
                        AbstractC1494mO.l(obj);
                        ad = ad2;
                        i8 = i82;
                        c0816c3.h = c1013f3;
                        c0816c3.i = ad;
                        c0816c3.j = i8;
                        c0816c3.m = 1;
                        b = i8.b(c0816c3);
                        if (b == enumC0448Re) {
                            return enumC0448Re;
                        }
                        I8 i83 = i8;
                        ad2 = ad;
                        obj = b;
                        i82 = i83;
                        if (((Boolean) obj).booleanValue()) {
                            c1013f3.u.clear();
                            return C0782bY.a;
                        }
                        i82.c();
                        boolean r = c1013f3.r();
                        C2340zD c2340zD = c1013f3.p;
                        C2340zD c2340zD2 = c1013f3.f163o;
                        N6 n6 = c1013f3.u;
                        if (r) {
                            int i3 = n6.j;
                            for (int i4 = 0; i4 < i3; i4++) {
                                C0027Ay c0027Ay = (C0027Ay) n6.i[i4];
                                c1013f3.C(c0027Ay, ad2);
                                if (c0027Ay.v() && !c1013f3.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c0027Ay)) {
                                    int i5 = c0027Ay.c;
                                    if (c2340zD2.e(i5) != null) {
                                        throw new ClassCastException();
                                    }
                                    if (c2340zD.e(i5) != null) {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                            ad2.b();
                            if (!c1013f3.H) {
                                c1013f3.H = true;
                                c1013f3.l.post(c1013f3.I);
                            }
                            n6.clear();
                            c2340zD2.a();
                            c2340zD.a();
                            long j = c1013f3.h;
                            c0816c3.h = c1013f3;
                            c0816c3.i = ad2;
                            c0816c3.j = i82;
                            c0816c3.m = 2;
                        }
                        ad = ad2;
                        i8 = i82;
                        c0816c3.h = c1013f3;
                        c0816c3.i = ad;
                        c0816c3.j = i8;
                        c0816c3.m = 1;
                        b = i8.b(c0816c3);
                        if (b == enumC0448Re) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        c0816c3 = new C0816c3(this, abstractC2367ze);
        Object obj2 = c0816c3.k;
        i = c0816c3.m;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
    }

    public final void g(long j, boolean z) {
        FQ fq;
        int i;
        if (!AbstractC0048Bt.h(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return;
        }
        C2340zD n = n();
        if (BF.a(j, 9205357640488583168L) || !BF.d(j)) {
            return;
        }
        if (z) {
            fq = CQ.p;
        } else {
            if (z) {
                throw new C0057Cc();
            }
            fq = CQ.f22o;
        }
        Object[] objArr = n.c;
        long[] jArr = n.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j2) < 128) {
                        AQ aq = (AQ) objArr[(i2 << 3) + i5];
                        Rect rect = aq.b;
                        float f = rect.left;
                        float f2 = rect.top;
                        i = i3;
                        float f3 = rect.right;
                        float f4 = rect.bottom;
                        if (BF.b(j) >= f && BF.b(j) < f3 && BF.c(j) >= f2 && BF.c(j) < f4) {
                            Object obj = aq.a.d.h.get(fq);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                        }
                    } else {
                        i = i3;
                    }
                    j2 >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void h() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (r()) {
                v(this.d.getSemanticsOwner().a(), this.G);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                B(n());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    G();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent i(int i, int i2) {
        AQ aq;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        S2 s2 = this.d;
        obtain.setPackageName(s2.getContext().getPackageName());
        obtain.setSource(s2, i);
        if (r() && (aq = (AQ) n().e(i)) != null) {
            obtain.setPassword(aq.a.d.h.containsKey(CQ.y));
        }
        return obtain;
    }

    public final AccessibilityEvent j(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent i2 = i(i, 8192);
        if (num != null) {
            i2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            i2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            i2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            i2.getText().add(charSequence);
        }
        return i2;
    }

    public final void k(C2287yQ c2287yQ, ArrayList arrayList, C2340zD c2340zD) {
        List g;
        List g2;
        boolean z = c2287yQ.c.r == EnumC2057uy.i;
        int i = c2287yQ.g;
        Object obj = c2287yQ.d.h.get(CQ.l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if ((booleanValue || s(c2287yQ)) && n().c(i)) {
            arrayList.add(c2287yQ);
        }
        if (booleanValue) {
            g2 = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
            c2340zD.h(i, E(AbstractC0720ac.K0(g2), z));
            return;
        }
        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        int size = g.size();
        for (int i2 = 0; i2 < size; i2++) {
            k((C2287yQ) g.get(i2), arrayList, c2340zD);
        }
    }

    public final int l(C2287yQ c2287yQ) {
        C2023uQ c2023uQ = c2287yQ.d;
        if (!c2023uQ.h.containsKey(CQ.a)) {
            FQ fq = CQ.v;
            if (c2023uQ.h.containsKey(fq)) {
                return (int) (((C1501mV) c2023uQ.j(fq)).a & 4294967295L);
            }
        }
        return this.s;
    }

    public final int m(C2287yQ c2287yQ) {
        C2023uQ c2023uQ = c2287yQ.d;
        if (!c2023uQ.h.containsKey(CQ.a)) {
            FQ fq = CQ.v;
            if (c2023uQ.h.containsKey(fq)) {
                return (int) (((C1501mV) c2023uQ.j(fq)).a >> 32);
            }
        }
        return this.s;
    }

    public final C2340zD n() {
        if (this.w) {
            this.w = false;
            this.y = AbstractC1052fg.u(this.d.getSemanticsOwner());
            if (r()) {
                C2208xD c2208xD = this.A;
                c2208xD.a();
                C2208xD c2208xD2 = this.B;
                c2208xD2.a();
                AQ aq = (AQ) n().e(-1);
                C2287yQ c2287yQ = aq != null ? aq.a : null;
                AbstractC0048Bt.k(c2287yQ);
                int i = 1;
                ArrayList E = E(AbstractC0868ct.N(c2287yQ), c2287yQ.c.r == EnumC2057uy.i);
                int w = AbstractC0868ct.w(E);
                if (1 <= w) {
                    while (true) {
                        int i2 = ((C2287yQ) E.get(i - 1)).g;
                        int i3 = ((C2287yQ) E.get(i)).g;
                        c2208xD.f(i2, i3);
                        c2208xD2.f(i3, i2);
                        if (i == w) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.y;
    }

    public final String p(C2287yQ c2287yQ) {
        int ordinal;
        C2023uQ c2023uQ = c2287yQ.d;
        C2023uQ c2023uQ2 = c2287yQ.d;
        Object obj = c2023uQ.h.get(CQ.b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        LinkedHashMap linkedHashMap = c2023uQ2.h;
        Object obj2 = linkedHashMap.get(CQ.x);
        if (obj2 == null) {
            obj2 = null;
        }
        UV uv = (UV) obj2;
        Object obj3 = linkedHashMap.get(CQ.q);
        if (obj3 == null) {
            obj3 = null;
        }
        S2 s2 = this.d;
        if (uv != null && (ordinal = uv.ordinal()) != 0 && ordinal != 1 && ordinal == 2 && obj == null) {
            obj = s2.getContext().getResources().getString(R.string.indeterminate);
        }
        Object obj4 = linkedHashMap.get(CQ.w);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (obj == null) {
                obj = booleanValue ? s2.getContext().getResources().getString(R.string.selected) : s2.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(CQ.c);
        if (obj5 == null) {
            obj5 = null;
        }
        GJ gj = (GJ) obj5;
        if (gj != null) {
            if (gj != GJ.b) {
                if (obj == null) {
                    obj = s2.getContext().getResources().getString(R.string.template_percent, 0);
                }
            } else if (obj == null) {
                obj = s2.getContext().getResources().getString(R.string.in_progress);
            }
        }
        FQ fq = CQ.u;
        if (linkedHashMap.containsKey(fq)) {
            LinkedHashMap linkedHashMap2 = new C2287yQ(c2287yQ.a, true, c2287yQ.c, c2023uQ2).i().h;
            Object obj6 = linkedHashMap2.get(CQ.a);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(CQ.s);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = linkedHashMap2.get(fq);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = s2.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean r() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(C2287yQ c2287yQ) {
        boolean z;
        List g;
        C2023uQ c2023uQ = c2287yQ.d;
        C2023uQ c2023uQ2 = c2287yQ.d;
        Object obj = c2023uQ.h.get(CQ.a);
        C0027Ay c0027Ay = null;
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        if ((list != null ? (String) AbstractC0720ac.p0(list) : null) == null) {
            Object obj2 = c2023uQ2.h.get(CQ.u);
            if (obj2 == null) {
                obj2 = null;
            }
            Y3 y3 = (Y3) obj2;
            Object obj3 = c2023uQ2.h.get(CQ.s);
            if (obj3 == null) {
                obj3 = null;
            }
            List list2 = (List) obj3;
            Y3 y32 = list2 != null ? (Y3) AbstractC0720ac.p0(list2) : null;
            if (y3 == null) {
                y3 = y32;
            }
            if (y3 == null && p(c2287yQ) == null && !o(c2287yQ)) {
                z = false;
                if (!c2023uQ2.i) {
                    if (!c2287yQ.e) {
                        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
                        if (g.isEmpty()) {
                            C0027Ay l = c2287yQ.c.l();
                            while (true) {
                                if (l != null) {
                                    C2023uQ i = l.i();
                                    if (i != null && i.i) {
                                        c0027Ay = l;
                                        break;
                                    }
                                    l = l.l();
                                } else {
                                    break;
                                }
                            }
                            if (c0027Ay != null || !z) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        z = true;
        if (!c2023uQ2.i) {
        }
        return true;
    }

    public final void t(C0027Ay c0027Ay) {
        if (this.u.add(c0027Ay)) {
            this.v.f(C0782bY.a);
        }
    }

    public final int u(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    public final void v(C2287yQ c2287yQ, C2353zQ c2353zQ) {
        List g;
        List g2;
        int[] iArr = AbstractC1393kt.a;
        AD ad = new AD();
        g = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        C0027Ay c0027Ay = c2287yQ.c;
        int size = g.size();
        for (int i = 0; i < size; i++) {
            C2287yQ c2287yQ2 = (C2287yQ) g.get(i);
            C2340zD n = n();
            int i2 = c2287yQ2.g;
            if (n.b(i2)) {
                if (!c2353zQ.b.c(i2)) {
                    t(c0027Ay);
                    return;
                }
                ad.a(i2);
            }
        }
        AD ad2 = c2353zQ.b;
        int[] iArr2 = ad2.b;
        long[] jArr = ad2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ad.c(iArr2[(i3 << 3) + i5])) {
                            t(c0027Ay);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        g2 = c2287yQ.g((r4 & 1) != 0 ? !c2287yQ.b : false, (r4 & 2) == 0);
        int size2 = g2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C2287yQ c2287yQ3 = (C2287yQ) g2.get(i6);
            if (n().b(c2287yQ3.g)) {
                Object e = this.F.e(c2287yQ3.g);
                AbstractC0048Bt.k(e);
                v(c2287yQ3, (C2353zQ) e);
            }
        }
    }

    public final boolean w(AccessibilityEvent accessibilityEvent) {
        if (!r()) {
            return false;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
    }

    public final boolean x(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !r()) {
            return false;
        }
        AccessibilityEvent i3 = i(i, i2);
        if (num != null) {
            i3.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            i3.setContentDescription(AbstractC1052fg.l(",", list));
        }
        Trace.beginSection("sendEvent");
        try {
            return w(i3);
        } finally {
            Trace.endSection();
        }
    }

    public final void z(String str, int i, int i2) {
        AccessibilityEvent i3 = i(u(i), 32);
        i3.setContentChangeTypes(i2);
        if (str != null) {
            i3.getText().add(str);
        }
        w(i3);
    }
}
