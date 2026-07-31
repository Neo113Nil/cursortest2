package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes15.dex */
public final class sn1 {
    public final v3 a;
    public final bl3 b;
    public final al3 c;
    public final ExecutorService d;

    public sn1(Context context, v3 v3Var, yu2 yu2Var) {
        bl3 bl3Var = new bl3(context);
        al3 al3Var = new al3(context, yu2Var);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.a = v3Var;
        this.b = bl3Var;
        this.c = al3Var;
        this.d = newSingleThreadExecutor;
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        v3 v3Var = this.a;
        String str2 = v3Var.c.a;
        if (str2 != null) {
            int i = v3Var.n;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer valueOf = layoutParams != null ? Integer.valueOf(sa3.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer valueOf2 = layoutParams2 != null ? Integer.valueOf(sa3.a(layoutParams2.height)) : null;
            int a = sa3.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int a2 = sa3.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            fj1 fj1Var = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? fj1.d : fj1.b : fj1.d : fj1.c;
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            final yk3 yk3Var = new yk3(new xk3(sa3.a(customizableMediaView.getWidth()), sa3.a(customizableMediaView.getHeight())), new vd1(valueOf, valueOf2), new dj1(new ej1(a, fj1Var), new ej1(a2, mode2 != Integer.MIN_VALUE ? mode2 != 0 ? mode2 != 1073741824 ? fj1.d : fj1.b : fj1.d : fj1.c)), MapsKt.mapOf(TuplesKt.to("asset", "media"), TuplesKt.to("media_type", str)));
            final cl3 cl3Var = new cl3(i, str2);
            this.d.execute(new Runnable() { // from class: yads.sn1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    sn1.a(sn1.this, cl3Var, yk3Var);
                }
            });
        }
    }

    public static final void a(sn1 sn1Var, cl3 cl3Var, yk3 yk3Var) {
        sn1Var.b.a(cl3Var, yk3Var);
        sn1Var.c.a(yk3Var, sn1Var.a);
    }
}
