package yads;

import android.app.Activity;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class rd1 {
    public final Activity a;
    public final ViewGroup b;
    public final qd1 c;
    public final od1 d;
    public final nd1 e;

    public rd1(Activity activity, ViewGroup viewGroup, List list) {
        qd1 qd1Var = new qd1(list);
        od1 od1Var = new od1();
        nd1 nd1Var = new nd1();
        this.a = activity;
        this.b = viewGroup;
        this.c = qd1Var;
        this.d = od1Var;
        this.e = nd1Var;
    }

    public final boolean a() {
        Object obj;
        qd1 qd1Var = this.c;
        Activity activity = this.a;
        Iterator it = qd1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((md1) obj).c.a(activity)) {
                break;
            }
        }
        md1 md1Var = (md1) obj;
        if (md1Var != null) {
            od1 od1Var = this.d;
            ViewGroup viewGroup = this.b;
            od1Var.getClass();
            ViewGroup viewGroup2 = (ViewGroup) qs2.a(viewGroup.getContext(), ExtendedNativeAdView.class, md1Var.a, viewGroup);
            if (viewGroup2 != null) {
                nd1 nd1Var = this.e;
                ViewGroup viewGroup3 = this.b;
                nd1Var.getClass();
                try {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    viewGroup3.removeAllViews();
                    viewGroup3.addView(viewGroup2, layoutParams);
                } catch (Throwable unused) {
                }
                hg0 hg0Var = md1Var.b;
                nd1Var.a = hg0Var;
                hg0Var.a(viewGroup2);
                return true;
            }
        }
        return false;
    }

    public final void b() {
        nd1 nd1Var = this.e;
        ViewGroup viewGroup = this.b;
        nd1Var.getClass();
        try {
            viewGroup.removeAllViews();
            hg0 hg0Var = nd1Var.a;
            if (hg0Var != null) {
                hg0Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
