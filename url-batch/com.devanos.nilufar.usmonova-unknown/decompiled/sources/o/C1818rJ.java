package o;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.rJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1818rJ implements OC, InterfaceC2346zJ, InterfaceC2243xm, PP, InterfaceC0764bG, InterfaceC1519mn, T00 {
    public final /* synthetic */ int h;
    public Object i;

    public /* synthetic */ C1818rJ(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.PP
    public Object a(Object obj) {
        return ((InterfaceC2312yp) this.i).invoke(null, obj);
    }

    public void b(Object obj, Object obj2) {
        MD md = (MD) this.i;
        int d = md.d(obj);
        boolean z = d < 0;
        Object obj3 = z ? null : md.c[d];
        if (obj3 != null) {
            if (obj3 instanceof QD) {
                ((QD) obj3).a(obj2);
            } else if (obj3 != obj2) {
                QD qd = new QD();
                qd.a(obj3);
                qd.a(obj2);
                obj2 = qd;
            }
            obj2 = obj3;
        }
        if (!z) {
            md.c[d] = obj2;
            return;
        }
        int i = ~d;
        md.b[i] = obj;
        md.c[i] = obj2;
    }

    public void c(AbstractC1281j9 abstractC1281j9) {
        if (!abstractC1281j9.o()) {
            if (!(abstractC1281j9 instanceof LO)) {
                String valueOf = String.valueOf(abstractC1281j9.getClass());
                throw new IllegalArgumentException(AbstractC1888sN.l(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
            LO lo = (LO) abstractC1281j9;
            c(lo.j);
            c(lo.k);
            return;
        }
        int size = abstractC1281j9.size();
        int[] iArr = LO.f63o;
        int binarySearch = Arrays.binarySearch(iArr, size);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i = iArr[binarySearch + 1];
        Stack stack = (Stack) this.i;
        if (stack.isEmpty() || ((AbstractC1281j9) stack.peek()).size() >= i) {
            stack.push(abstractC1281j9);
            return;
        }
        int i2 = iArr[binarySearch];
        AbstractC1281j9 abstractC1281j92 = (AbstractC1281j9) stack.pop();
        while (!stack.isEmpty() && ((AbstractC1281j9) stack.peek()).size() < i2) {
            abstractC1281j92 = new LO((AbstractC1281j9) stack.pop(), abstractC1281j92);
        }
        LO lo2 = new LO(abstractC1281j92, abstractC1281j9);
        while (!stack.isEmpty()) {
            int[] iArr2 = LO.f63o;
            int binarySearch2 = Arrays.binarySearch(iArr2, lo2.i);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC1281j9) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                lo2 = new LO((AbstractC1281j9) stack.pop(), lo2);
            }
        }
        stack.push(lo2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.xU, o.yp] */
    @Override // o.InterfaceC2243xm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        C2125w c2125w;
        int i;
        Throwable th;
        C1561nP c1561nP;
        if (interfaceC2235xe instanceof C2125w) {
            c2125w = (C2125w) interfaceC2235xe;
            int i2 = c2125w.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2125w.k = i2 - Integer.MIN_VALUE;
                Object obj = c2125w.i;
                i = c2125w.k;
                C0782bY c0782bY = C0782bY.a;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    C1561nP c1561nP2 = new C1561nP(interfaceC2309ym, c2125w.getContext());
                    try {
                        c2125w.h = c1561nP2;
                        c2125w.k = 1;
                        Object invoke = ((AbstractC2225xU) this.i).invoke(c1561nP2, c2125w);
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        if (invoke != enumC0448Re) {
                            invoke = c0782bY;
                        }
                        if (invoke == enumC0448Re) {
                            return enumC0448Re;
                        }
                        c1561nP = c1561nP2;
                    } catch (Throwable th2) {
                        th = th2;
                        c1561nP = c1561nP2;
                        c1561nP.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1561nP = c2125w.h;
                    try {
                        AbstractC1494mO.l(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        c1561nP.releaseIntercepted();
                        throw th;
                    }
                }
                c1561nP.releaseIntercepted();
                return c0782bY;
            }
        }
        c2125w = new C2125w(this, interfaceC2235xe);
        Object obj2 = c2125w.i;
        i = c2125w.k;
        C0782bY c0782bY2 = C0782bY.a;
        if (i != 0) {
        }
        c1561nP.releaseIntercepted();
        return c0782bY2;
    }

    public C2177wm d(int i) {
        return (C2177wm) this.i;
    }

    public boolean e(Object obj, Object obj2) {
        MD md = (MD) this.i;
        Object e = md.e(obj);
        if (e == null) {
            return false;
        }
        if (!(e instanceof QD)) {
            if (!e.equals(obj2)) {
                return false;
            }
            md.g(obj);
            return true;
        }
        QD qd = (QD) e;
        boolean j = qd.j(obj2);
        if (j && qd.g()) {
            md.g(obj);
        }
        return j;
    }

    public void f(Object obj) {
        boolean z;
        MD md = (MD) this.i;
        long[] jArr = md.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = md.b[i4];
                        Object obj3 = md.c[i4];
                        if (obj3 instanceof QD) {
                            AbstractC0048Bt.l(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            QD qd = (QD) obj3;
                            qd.j(obj);
                            z = qd.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            md.h(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // o.InterfaceC2346zJ
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.InterfaceC2346zJ
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.i).setResultCode(i);
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        Exception f = mu.f();
        if (f != null) {
            ((C0849ca) this.i).resumeWith(AbstractC1494mO.d(f));
        } else if (((p30) mu).d) {
            ((C0849ca) this.i).m(null);
        } else {
            ((C0849ca) this.i).resumeWith(mu.g());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        Bundle bundle;
        int i = 3;
        int i2 = 2;
        boolean z = false;
        z = false;
        switch (this.h) {
            case 1:
                C0208Hx c0208Hx2 = (C0208Hx) this.i;
                if (((C1950tJ) c0208Hx2.j) == null) {
                    return;
                }
                String str = (String) c0208Hx.i;
                Object obj = c0208Hx.j;
                str.getClass();
                if (str.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        ((C1950tJ) c0208Hx2.j).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), nc);
                        return;
                    } catch (IllegalStateException e) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getMessage(), null);
                        return;
                    }
                }
                if (!str.equals("ProcessText.queryTextActions")) {
                    nc.b();
                    return;
                }
                try {
                    nc.d(((C1950tJ) c0208Hx2.j).b());
                    return;
                } catch (IllegalStateException e2) {
                    nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e2.getMessage(), null);
                    return;
                }
            case 4:
                Q4 q4 = (Q4) this.i;
                String str2 = (String) c0208Hx.i;
                Object obj2 = c0208Hx.j;
                str2.getClass();
                if (!str2.equals("get")) {
                    if (!str2.equals("put")) {
                        nc.b();
                        return;
                    } else {
                        q4.f = (byte[]) obj2;
                        nc.d(null);
                        return;
                    }
                }
                q4.e = true;
                if (q4.d || !q4.c) {
                    nc.d(Q4.d((byte[]) q4.f));
                    return;
                } else {
                    q4.b = nc;
                    return;
                }
            case 10:
                C1818rJ c1818rJ = (C1818rJ) this.i;
                if (((C0208Hx) c1818rJ.i) == null) {
                    return;
                }
                String str3 = (String) c0208Hx.i;
                str3.getClass();
                switch (str3) {
                    case "Scribe.isFeatureAvailable":
                        try {
                            C0208Hx c0208Hx3 = (C0208Hx) c1818rJ.i;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) c0208Hx3.i).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z = true;
                                }
                            } else {
                                c0208Hx3.getClass();
                            }
                            nc.d(Boolean.valueOf(z));
                            return;
                        } catch (IllegalStateException e3) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e3.getMessage(), null);
                            return;
                        }
                    case "Scribe.startStylusHandwriting":
                        if (Build.VERSION.SDK_INT < 33) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            C0208Hx c0208Hx4 = (C0208Hx) c1818rJ.i;
                            ((InputMethodManager) c0208Hx4.i).startStylusHandwriting((View) c0208Hx4.j);
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e4) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e4.getMessage(), null);
                            return;
                        }
                    case "Scribe.isStylusHandwritingAvailable":
                        if (Build.VERSION.SDK_INT < 34) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((C0208Hx) c1818rJ.i).i).isStylusHandwritingAvailable();
                            nc.d(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e5) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e5.getMessage(), null);
                            return;
                        }
                    default:
                        nc.b();
                        return;
                }
            case 12:
                C1818rJ c1818rJ2 = (C1818rJ) this.i;
                if (((C1739q5) c1818rJ2.i) == null) {
                    return;
                }
                String str4 = (String) c0208Hx.i;
                str4.getClass();
                switch (str4.hashCode()) {
                    case -1937987631:
                        if (str4.equals("SensitiveContent.getContentSensitivity")) {
                            break;
                        }
                        break;
                    case 598223325:
                        if (str4.equals("SensitiveContent.setContentSensitivity")) {
                            break;
                        }
                        break;
                    case 1615625817:
                        if (str4.equals("SensitiveContent.isSupported")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 1404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C1818rJ.v(o.Hx, o.NC):void");
            }

            public /* synthetic */ C1818rJ(int i, boolean z) {
                this.h = i;
            }

            public C1818rJ(J00 j00) {
                this.h = 27;
                int i = C1734q10.b;
                this.i = j00;
            }

            public C1818rJ(InterfaceC2312yp interfaceC2312yp, InterfaceC2114vp interfaceC2114vp) {
                this.h = 8;
                this.i = interfaceC2312yp;
            }

            public C1818rJ(C1183hf c1183hf, int i) {
                this.h = i;
                switch (i) {
                    case 13:
                        new C0950e6(c1183hf, "flutter/sensitivecontent", C1367kT.h, 16).Q(new C1818rJ(12, this));
                        break;
                    case 17:
                        new C0950e6(c1183hf, "flutter/spellcheck", C1367kT.h, 16).Q(new C1818rJ(16, this));
                        break;
                    default:
                        new C0950e6(c1183hf, "flutter/scribe", C0460Rq.G, 16).Q(new C1818rJ(10, this));
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1818rJ(InterfaceC2312yp interfaceC2312yp) {
                this.h = 7;
                this.i = (AbstractC2225xU) interfaceC2312yp;
            }

            public C1818rJ(GY gy) {
                this.h = 19;
                this.i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), gy);
            }

            public C1818rJ(int i) {
                this.h = i;
                switch (i) {
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.i = new LinkedHashSet();
                        break;
                    case 9:
                        long[] jArr = UP.a;
                        this.i = new MD();
                        break;
                    default:
                        this.i = new Stack();
                        break;
                }
            }
        }
