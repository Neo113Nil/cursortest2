package com.five_corp.ad.internal.fullscreen;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.f;
import com.five_corp.ad.internal.context.h;
import com.five_corp.ad.internal.hub.ad_instance.e;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.layouter.i;
import com.five_corp.ad.internal.view.H;
import com.five_corp.ad.internal.view.m;
import com.five_corp.ad.internal.view.u;
import com.five_corp.ad.internal.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class c {
    public final AdActivity a;
    public final u b;
    public final h c;
    public final com.five_corp.ad.internal.ad.fullscreen.h d;
    public final y e;
    public final e f;
    public final FrameLayout g;
    public final Handler h;
    public final f i;
    public final com.five_corp.ad.internal.viewability.a j;
    public m k;
    public m l;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final i n;

    public c(AdActivity adActivity, u uVar, h hVar, com.five_corp.ad.internal.ad.fullscreen.h hVar2, f fVar, y yVar, e eVar, com.five_corp.ad.internal.viewability.a aVar, i iVar) {
        this.a = adActivity;
        this.b = uVar;
        this.c = hVar;
        this.d = hVar2;
        this.i = fVar;
        this.e = yVar;
        this.f = eVar;
        this.j = aVar;
        int a = H.a(hVar2.d);
        FrameLayout frameLayout = new FrameLayout(adActivity);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(a);
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: com.five_corp.ad.internal.fullscreen.c$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return c.a(view, windowInsetsCompat);
            }
        });
        this.h = new Handler(Looper.getMainLooper());
        this.n = iVar;
    }

    public static int a(int i, int i2) {
        int a = com.five_corp.ad.e.a(i2);
        if (a != 0) {
            if (a == 1) {
                return i != 3 ? 0 : 8;
            }
            if (a != 2) {
                return -1;
            }
            return i != 2 ? 1 : 9;
        }
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 1 : 8;
        }
        return 9;
    }

    public final void b() {
        try {
            this.l.a();
            this.g.addView(this.l);
        } catch (Exception e) {
            l lVar = new l(com.five_corp.ad.internal.m.W6, null, e);
            f fVar = this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), lVar);
        }
    }

    public final void c() {
        this.g.removeAllViews();
        this.l = null;
        this.n.a.clear();
        this.k = new m(this.a, this.e, this.f, this.b, this.c, new com.five_corp.ad.internal.layouter.e(this.d.b.a), this, this.j, this.n);
        com.five_corp.ad.internal.util.b a = a(this.a);
        if (!a.a) {
            l lVar = a.b;
            f fVar = this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), lVar);
            return;
        }
        int intValue = ((Integer) a.c).intValue();
        com.five_corp.ad.internal.ad.fullscreen.h hVar = this.d;
        int i = hVar.a;
        if (i == 0) {
            i = hVar.b.a.a;
        }
        this.a.setRequestedOrientation(a(intValue, i));
        this.h.post(new Runnable() { // from class: com.five_corp.ad.internal.fullscreen.c$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a();
            }
        });
    }

    public final void d() {
        this.g.removeAllViews();
        this.k = null;
        this.n.a.clear();
        this.l = new m(this.a, this.e, this.f, this.b, this.c, new com.five_corp.ad.internal.layouter.e(this.d.c.a), this, this.j, this.n);
        com.five_corp.ad.internal.util.b a = a(this.a);
        if (!a.a) {
            l lVar = a.b;
            f fVar = this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), lVar);
            return;
        }
        int intValue = ((Integer) a.c).intValue();
        com.five_corp.ad.internal.ad.fullscreen.h hVar = this.d;
        int i = hVar.a;
        if (i == 0) {
            i = hVar.b.a.a;
        }
        this.a.setRequestedOrientation(a(intValue, i));
        this.h.post(new Runnable() { // from class: com.five_corp.ad.internal.fullscreen.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c.this.b();
            }
        });
    }

    public static com.five_corp.ad.internal.util.b a(Activity activity) {
        Display display;
        if (Build.VERSION.SDK_INT < 30) {
            return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf(((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation()));
        }
        try {
            display = activity.getDisplay();
            return display == null ? new com.five_corp.ad.internal.util.b(false, new l(com.five_corp.ad.internal.m.Y6, null, null), null) : new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf(display.getRotation()));
        } catch (Exception e) {
            return new com.five_corp.ad.internal.util.b(false, new l(com.five_corp.ad.internal.m.X6, null, e), null);
        }
    }

    public static /* synthetic */ WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public final void a() {
        try {
            this.k.a();
            this.g.addView(this.k);
        } catch (Exception e) {
            l lVar = new l(com.five_corp.ad.internal.m.V6, null, e);
            f fVar = this.i;
            fVar.a(fVar.h.getCurrentPositionMs(), lVar);
        }
    }
}
