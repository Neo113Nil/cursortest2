package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class a22 {
    public final ev a;
    public final gg0 b;
    public final n22 c;
    public final HashMap d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e8, code lost:
    
        if (r9.equals("string") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f6, code lost:
    
        if ((r8 instanceof android.widget.TextView) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f8, code lost:
    
        r9 = (android.widget.TextView) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fd, code lost:
    
        if (r9 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ff, code lost:
    
        r9 = new yads.bc0(new yads.n63((android.widget.TextView) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fc, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f1, code lost:
    
        if (r9.equals("number") == false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a22(o22 o22Var, v3 v3Var, yu2 yu2Var, ri2 ri2Var, t41 t41Var, l02 l02Var, bi biVar, p42 p42Var, x32 x32Var, t8 t8Var, x72 x72Var, sz1 sz1Var, rn1 rn1Var, bz2 bz2Var, x20 x20Var, gg0 gg0Var) {
        qh qhVar;
        ev evVar = ev.a;
        f22 f22Var = o22Var.a;
        m22 m22Var = new m22(f22Var.c, f22Var.d);
        f22 f22Var2 = o22Var.a;
        m22Var.b = f22Var2.a;
        m22Var.c = f22Var2.b;
        m22Var.d = f22Var2.e;
        n22 n22Var = new n22(m22Var);
        in1 in1Var = new in1(biVar, v3Var, t41Var, l02Var.d, sz1Var, rn1Var, new sn3(n22Var), bz2Var);
        Context context = ((nt3) yu2Var).a;
        mt1 a = pr.a(context, context);
        rh rhVar = new rh(t8Var, ri2Var, in1Var, p42Var, x32Var, a, x20Var);
        HashMap hashMap = new HashMap();
        View a2 = n22Var.a("close_button");
        TextView textView = a2 instanceof TextView ? (TextView) a2 : null;
        dw dwVar = textView != null ? new dw(textView) : null;
        hashMap.put("close_button", dwVar != null ? new bc0(dwVar) : null);
        View a3 = n22Var.a("feedback");
        ImageView imageView = a3 instanceof ImageView ? (ImageView) a3 : null;
        rt0 rt0Var = imageView != null ? new rt0(imageView, new s21(imageView.getContext(), new h42(t8Var), ri2Var)) : null;
        hashMap.put("feedback", rt0Var != null ? new i21(rt0Var) : null);
        qm2 qm2Var = n22Var.b;
        KProperty[] kPropertyArr = n22.g;
        KProperty kProperty = kPropertyArr[1];
        ImageView imageView2 = (ImageView) qm2Var.a.get();
        View a4 = n22Var.a("media");
        hashMap.put("media", rhVar.a(imageView2, a4 instanceof CustomizableMediaView ? (CustomizableMediaView) a4 : null));
        View a5 = n22Var.a("rating");
        vl2 vl2Var = a5 instanceof wl2 ? new vl2(a5, a) : null;
        hashMap.put("rating", vl2Var != null ? new bc0(vl2Var) : null);
        View a6 = n22Var.a();
        ks2 ks2Var = a6 != null ? new ks2(a6) : null;
        hashMap.put("root_container", ks2Var != null ? new bc0(ks2Var) : null);
        qm2 qm2Var2 = n22Var.e;
        KProperty kProperty2 = kPropertyArr[4];
        List list = (List) qm2Var2.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        for (ph phVar : x72Var.a) {
            View a7 = n22Var.a(phVar.a);
            if (a7 != null && !hashMap.containsKey(phVar.a)) {
                String str = phVar.b;
                switch (str.hashCode()) {
                    case -1034364087:
                        break;
                    case -891985903:
                        break;
                    case -410956671:
                        if (str.equals("container")) {
                            qhVar = new bc0(new ks2(a7));
                            break;
                        }
                        qhVar = null;
                        break;
                    case 100313435:
                        if (str.equals("image")) {
                            if ((a7 instanceof ImageView ? (ImageView) a7 : null) != null) {
                                qhVar = new i21(new y31((ImageView) a7, rhVar.b, rhVar.a));
                                break;
                            }
                        }
                        qhVar = null;
                        break;
                    case 103772132:
                        if (str.equals("media")) {
                            if ((a7 instanceof CustomizableMediaView ? (CustomizableMediaView) a7 : null) != null) {
                                qhVar = rhVar.a(null, (CustomizableMediaView) a7);
                                break;
                            }
                        }
                        qhVar = null;
                        break;
                    case 1124446108:
                        if (str.equals("warning")) {
                            if ((a7 instanceof TextView ? (TextView) a7 : null) != null) {
                                qhVar = new bc0(new in3((TextView) a7));
                                break;
                            }
                        }
                        qhVar = null;
                        break;
                    default:
                        qhVar = null;
                        break;
                }
                hashMap.put(phVar.a, qhVar == null ? new bc0(new wf0(a7)) : qhVar);
            }
        }
        for (Map.Entry entry : n22Var.f.entrySet()) {
            String str2 = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !hashMap.containsKey(str2)) {
                hashMap.put(str2, new bc0(new wf0(view)));
            }
        }
        this.a = evVar;
        this.b = gg0Var;
        this.c = n22Var;
        this.d = hashMap;
    }

    public final qh a(ph phVar) {
        if (phVar != null) {
            return (qh) this.d.get(phVar.a);
        }
        return null;
    }

    public final View b() {
        return this.c.a();
    }

    public final void a() {
        for (qh qhVar : this.d.values()) {
            if (qhVar != null) {
                qhVar.a();
            }
        }
    }
}
