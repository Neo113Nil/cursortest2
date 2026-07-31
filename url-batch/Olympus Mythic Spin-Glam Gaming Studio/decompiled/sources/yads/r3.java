package yads;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class r3 {
    public final yu2 a;
    public final t8 b;
    public final v3 c;
    public final i02 d;
    public final d63 e;
    public final mn2 f;
    public final mz1 g;
    public final z83 h;
    public final f5 i;
    public final ou j;
    public zb k;

    public r3(Context context, yu2 yu2Var, t8 t8Var, v3 v3Var, i02 i02Var, d63 d63Var, mn2 mn2Var) {
        u9 u9Var = new u9(context, v3Var, yu2Var);
        mz1 mz1Var = new mz1(context, v3Var, yu2Var, t8Var);
        z83 z83Var = new z83(u9Var, v3Var, t8Var);
        f5 f5Var = new f5(i02Var);
        ou ouVar = new ou();
        this.a = yu2Var;
        this.b = t8Var;
        this.c = v3Var;
        this.d = i02Var;
        this.e = d63Var;
        this.f = mn2Var;
        this.g = mz1Var;
        this.h = z83Var;
        this.i = f5Var;
        this.j = ouVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r10.length() > 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, kf1 kf1Var, s0 s0Var, k52 k52Var, g32 g32Var, ContinuationImpl continuationImpl) {
        q3 q3Var;
        int i;
        String str;
        pz0 pz0Var;
        List list;
        b63 b63Var;
        eo2 eo2Var;
        String str2;
        vu vuVar;
        mg2 mg2Var;
        b63 b63Var2;
        if (continuationImpl instanceof q3) {
            q3Var = (q3) continuationImpl;
            int i2 = q3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3Var.h = i2 - Integer.MIN_VALUE;
                Object obj = q3Var.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q3Var.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = kf1Var.a;
                    q3Var.b = view;
                    q3Var.c = kf1Var;
                    q3Var.d = k52Var;
                    q3Var.e = g32Var;
                    q3Var.h = 1;
                    obj = s0Var.a(view, arrayList, q3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g32Var = q3Var.e;
                    k52Var = q3Var.d;
                    kf1Var = q3Var.c;
                    view = q3Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                oz0 oz0Var = (oz0) obj;
                Long l = this.f.a;
                LinkedHashMap a = this.j.a(view, Boxing.boxLong(l == null ? SystemClock.elapsedRealtime() - l.longValue() : 0L));
                str = kf1Var.d;
                pz0Var = oz0Var.b;
                mg2 mg2Var2 = pz0Var == null ? pz0Var.a : null;
                list = kf1Var.c;
                if (str != null) {
                    k52Var.getClass();
                }
                str = null;
                if (str == null) {
                    i52 i52Var = k52Var.a;
                    String a2 = i52Var.b.a(str, MapsKt.emptyMap());
                    if (a2.length() > 0) {
                        b63Var = i52Var.a.a(a2);
                    } else {
                        boolean z = ob1.a;
                        b63Var = new z53(eo2.e);
                    }
                } else {
                    b63Var = null;
                }
                vu a3 = lz1.a(mg2Var2, b63Var);
                z83 z83Var = k52Var.b;
                io2 a4 = z83Var.e.a(z83Var.b, z83Var.c);
                z83Var.d.getClass();
                Map plus = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(a3))), a);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        z83Var.a.a((String) it.next(), a93.c, plus, a4);
                    }
                }
                lz1 lz1Var = g32Var.b;
                boolean z2 = !lz1.a(b63Var, pz0Var).isEmpty();
                eo2Var = b63Var == null ? b63Var.a : null;
                eo2 eo2Var2 = (pz0Var != null || (b63Var2 = pz0Var.b) == null) ? null : b63Var2.a;
                eo2 eo2Var3 = eo2.d;
                if ((pz0Var == null ? pz0Var.a : null) == null) {
                    eo2Var3 = null;
                }
                if (eo2Var == null) {
                    eo2Var = eo2Var2 == null ? eo2Var3 == null ? eo2.e : eo2Var3 : eo2Var2;
                }
                a63 a63Var = !(b63Var instanceof a63) ? (a63) b63Var : null;
                str2 = a63Var == null ? a63Var.c : null;
                b63 b63Var3 = pz0Var == null ? pz0Var.b : null;
                a63 a63Var2 = !(b63Var3 instanceof a63) ? (a63) b63Var3 : null;
                String str3 = a63Var2 == null ? a63Var2.c : null;
                String str4 = (pz0Var != null || (mg2Var = pz0Var.a) == null) ? null : mg2Var.b;
                if (str2 == null) {
                    str2 = str3 == null ? str4 : str3;
                }
                String a5 = ib3.a(str2);
                if (lz1.a(b63Var, pz0Var).size() != 1) {
                    if (b63Var == null) {
                        b63Var = pz0Var != null ? pz0Var.b : null;
                    }
                    vuVar = lz1.a(pz0Var != null ? pz0Var.a : null, b63Var);
                } else {
                    vuVar = su.a;
                }
                Map mapOf = MapsKt.mapOf(TuplesKt.to("click_handled", Boolean.valueOf(z2)), TuplesKt.to("click_type", eo2Var.b), TuplesKt.to("click_url", a5), TuplesKt.to("click_destination", wu.a(vuVar)));
                hv hvVar = g32Var.a;
                fo2 fo2Var = fo2.r;
                ho2 a6 = hvVar.a(fo2Var, mapOf);
                hvVar.d.a(a6);
                hvVar.f.a(fo2Var, a6.b, do2.a, null);
                return oz0Var;
            }
        }
        q3Var = new q3(this, continuationImpl);
        Object obj2 = q3Var.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q3Var.h;
        if (i != 0) {
        }
        oz0 oz0Var2 = (oz0) obj2;
        Long l2 = this.f.a;
        LinkedHashMap a7 = this.j.a(view, Boxing.boxLong(l2 == null ? SystemClock.elapsedRealtime() - l2.longValue() : 0L));
        str = kf1Var.d;
        pz0Var = oz0Var2.b;
        if (pz0Var == null) {
        }
        list = kf1Var.c;
        if (str != null) {
        }
        str = null;
        if (str == null) {
        }
        vu a32 = lz1.a(mg2Var2, b63Var);
        z83 z83Var2 = k52Var.b;
        io2 a42 = z83Var2.e.a(z83Var2.b, z83Var2.c);
        z83Var2.d.getClass();
        Map plus2 = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(a32))), a7);
        if (list != null) {
        }
        lz1 lz1Var2 = g32Var.b;
        boolean z22 = !lz1.a(b63Var, pz0Var).isEmpty();
        if (b63Var == null) {
        }
        if (pz0Var != null) {
        }
        eo2 eo2Var32 = eo2.d;
        if ((pz0Var == null ? pz0Var.a : null) == null) {
        }
        if (eo2Var == null) {
        }
        if (!(b63Var instanceof a63)) {
        }
        if (a63Var == null) {
        }
        if (pz0Var == null) {
        }
        if (!(b63Var3 instanceof a63)) {
        }
        if (a63Var2 == null) {
        }
        if (pz0Var != null) {
        }
        if (str2 == null) {
        }
        String a52 = ib3.a(str2);
        if (lz1.a(b63Var, pz0Var).size() != 1) {
        }
        Map mapOf2 = MapsKt.mapOf(TuplesKt.to("click_handled", Boolean.valueOf(z22)), TuplesKt.to("click_type", eo2Var.b), TuplesKt.to("click_url", a52), TuplesKt.to("click_destination", wu.a(vuVar)));
        hv hvVar2 = g32Var.a;
        fo2 fo2Var2 = fo2.r;
        ho2 a62 = hvVar2.a(fo2Var2, mapOf2);
        hvVar2.d.a(a62);
        hvVar2.f.a(fo2Var2, a62.b, do2.a, null);
        return oz0Var2;
    }
}
