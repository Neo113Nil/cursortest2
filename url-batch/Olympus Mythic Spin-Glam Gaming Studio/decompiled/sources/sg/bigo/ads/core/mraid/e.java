package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Objects;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.mraid.a;
import sg.bigo.ads.core.mraid.c;
import sg.bigo.ads.cu.a;

/* loaded from: classes13.dex */
public final class e implements sg.bigo.ads.ar.d {
    private final c.b A;
    private final c.b B;
    private int C;

    @NonNull
    final Context a;

    @NonNull
    final n b;

    @NonNull
    final FrameLayout c;

    @NonNull
    final sg.bigo.ads.cu.a d;

    @NonNull
    final j e;

    @NonNull
    o f;

    @Nullable
    public b g;

    @Nullable
    c.C1876c h;

    @NonNull
    public final sg.bigo.ads.core.mraid.c i;

    @NonNull
    final sg.bigo.ads.core.mraid.c j;

    @NonNull
    final c k;

    @NonNull
    private WeakReference<Activity> l;

    @Nullable
    private ViewGroup m;

    @NonNull
    private final C1877e n;

    @Nullable
    private l o;

    @Nullable
    private c.C1876c p;

    @Nullable
    private Integer q;
    private final int r;
    private int s;
    private boolean t;
    private i u;
    private final h v;
    private boolean w;
    private boolean x;
    private sg.bigo.ads.core.mraid.a y;
    private final Handler z;

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(WebView webView, int i);

        void a(@NonNull String str, @Nullable sg.bigo.ads.an.i iVar);

        boolean a(Activity activity, int i);

        void b();

        boolean b(Activity activity, int i);

        void c();

        void d();

        void e();
    }

    class c {
        int a;
        int b;

        private c() {
            this.a = -1;
            this.b = -1;
        }

        /* synthetic */ c(e eVar, byte b) {
            this();
        }

        final void a() {
            int measuredWidth = e.this.h.getMeasuredWidth();
            int measuredHeight = e.this.h.getMeasuredHeight();
            this.a = measuredWidth;
            this.b = measuredHeight;
        }
    }

    public interface d {
        void a();
    }

    @VisibleForTesting
    /* renamed from: sg.bigo.ads.core.mraid.e$e, reason: collision with other inner class name */
    static class C1877e {

        @NonNull
        final Handler a = new Handler(Looper.getMainLooper());

        @Nullable
        a b;

        /* renamed from: sg.bigo.ads.core.mraid.e$e$a */
        static class a {

            @NonNull
            final View[] a;

            @NonNull
            final Handler b;

            @Nullable
            Runnable c;
            int d;
            final Runnable e;

            private a(@NonNull Handler handler, @NonNull View[] viewArr) {
                this.e = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.e.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (final View view : a.this.a) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                a.a(a.this);
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.e.e.a.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        a.a(a.this);
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.b = handler;
                this.a = viewArr;
            }

            /* synthetic */ a(Handler handler, View[] viewArr, byte b) {
                this(handler, viewArr);
            }

            static /* synthetic */ void a(a aVar) {
                Runnable runnable;
                int i = aVar.d - 1;
                aVar.d = i;
                if (i != 0 || (runnable = aVar.c) == null) {
                    return;
                }
                runnable.run();
                aVar.c = null;
            }

            final void a() {
                this.b.removeCallbacks(this.e);
                this.c = null;
            }
        }

        C1877e() {
        }

        final void a() {
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
                this.b = null;
            }
        }
    }

    public e(@NonNull Context context, @NonNull n nVar) {
        this(context, nVar, new sg.bigo.ads.core.mraid.c(nVar), new sg.bigo.ads.core.mraid.c(n.INTERSTITIAL), new C1877e());
    }

    @VisibleForTesting
    private e(@NonNull Context context, @NonNull n nVar, @NonNull sg.bigo.ads.core.mraid.c cVar, @NonNull sg.bigo.ads.core.mraid.c cVar2, @NonNull C1877e c1877e) {
        o oVar = o.LOADING;
        this.f = oVar;
        this.t = true;
        this.u = i.NONE;
        this.w = true;
        byte b2 = 0;
        this.x = false;
        c.a aVar = new c.a() { // from class: sg.bigo.ads.core.mraid.e.3
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                e eVar = e.this;
                eVar.i.a(h.b(eVar.a), h.a(eVar.a), h.d(eVar.a), h.c(eVar.a), eVar.c());
                eVar.i.a(eVar.b);
                sg.bigo.ads.core.mraid.c cVar3 = eVar.i;
                cVar3.a(cVar3.b());
                eVar.i.a(eVar.e);
                eVar.k();
                eVar.a(o.DEFAULT);
                eVar.i.c("mraidbridge.notifyReadyEvent();");
                b bVar = e.this.g;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i, int i2, int i3, int i4, @NonNull a.EnumC1883a enumC1883a, boolean z) {
                e eVar = e.this;
                if (eVar.h == null) {
                    throw new sg.bigo.ads.core.mraid.d("Unable to resize after the WebView is destroyed");
                }
                o oVar2 = eVar.f;
                if (oVar2 == o.LOADING || oVar2 == o.HIDDEN) {
                    return;
                }
                if (oVar2 == o.EXPANDED) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an already expanded ad");
                }
                if (eVar.b == n.INTERSTITIAL) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an interstitial ad");
                }
                eVar.k.a();
                Context context2 = eVar.a;
                int a2 = sg.bigo.ads.common.utils.f.a(context2, i);
                int a3 = sg.bigo.ads.common.utils.f.a(context2, i2);
                int a4 = sg.bigo.ads.common.utils.f.a(context2, i3);
                int a5 = sg.bigo.ads.common.utils.f.a(context2, i4);
                Rect rect = eVar.e.g;
                int i5 = rect.left + a4;
                int i6 = rect.top + a5;
                Rect rect2 = new Rect(i5, i6, a2 + i5, i6 + a3);
                if (!z) {
                    Rect rect3 = eVar.e.c;
                    if (rect2.width() > rect3.width() || rect2.height() > rect3.height()) {
                        throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the ad to appear within the max allowed size (" + eVar.e.d.width() + ", " + eVar.e.d.height() + ")");
                    }
                    rect2.offsetTo(e.a(rect3.left, rect2.left, rect3.right - rect2.width()), e.a(rect3.top, rect2.top, rect3.bottom - rect2.height()));
                }
                Rect rect4 = new Rect();
                eVar.d.a(enumC1883a, rect2, rect4);
                if (!eVar.e.c.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i + ", " + i2 + ") and offset (" + i3 + ", " + i4 + ") that doesn't allow the close region to appear within the max allowed size (" + eVar.e.d.width() + ", " + eVar.e.d.height() + ")");
                }
                if (!rect2.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i + ", " + a3 + ") and offset (" + i3 + ", " + i4 + ") that don't allow the close region to appear within the resized ad.");
                }
                eVar.d.setCloseVisible(false);
                eVar.d.setClosePosition(enumC1883a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
                int i7 = rect2.left;
                Rect rect5 = eVar.e.c;
                layoutParams.leftMargin = i7 - rect5.left;
                layoutParams.topMargin = rect2.top - rect5.top;
                o oVar3 = eVar.f;
                if (oVar3 == o.DEFAULT) {
                    eVar.c.removeView(eVar.h);
                    eVar.c.setVisibility(4);
                    eVar.d.addView(eVar.h, new FrameLayout.LayoutParams(-1, -1));
                    eVar.j().addView(eVar.d, layoutParams);
                } else if (oVar3 == o.RESIZED) {
                    eVar.d.setLayoutParams(layoutParams);
                }
                eVar.d.setClosePosition(enumC1883a);
                eVar.a(o.RESIZED);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(WebView webView, int i) {
                b bVar = e.this.g;
                if (bVar != null) {
                    bVar.a(webView, i);
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.a
            public final void a(String str, String str2) {
                b bVar = e.this.g;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.an.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z) {
                e.this.a(str, z);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                if (e.this.j.c()) {
                    return;
                }
                e.this.i.a(bVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z) {
                if (e.this.j.c()) {
                    return;
                }
                e.this.i.a(z);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z, i iVar) {
                e.this.a(z, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
                b bVar = e.this.g;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z) {
                e.this.b(z);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.A = aVar;
        c.b bVar = new c.b() { // from class: sg.bigo.ads.core.mraid.e.4
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                final e eVar = e.this;
                eVar.a(new Runnable() { // from class: sg.bigo.ads.core.mraid.e.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        eVar2.j.a(h.b(eVar2.a), h.a(e.this.a), h.d(e.this.a), h.c(e.this.a), e.this.c());
                        e eVar3 = e.this;
                        eVar3.j.a(eVar3.f);
                        e eVar4 = e.this;
                        eVar4.j.a(eVar4.b);
                        sg.bigo.ads.core.mraid.c cVar3 = e.this.j;
                        cVar3.a(cVar3.b());
                        e.this.j.c("mraidbridge.notifyReadyEvent();");
                    }
                });
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i, int i2, int i3, int i4, @NonNull a.EnumC1883a enumC1883a, boolean z) {
                throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an expanded state");
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(WebView webView, int i) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, @Nullable sg.bigo.ads.an.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar2) {
                e.this.i.a(bVar2);
                e.this.j.a(bVar2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z) {
                e.this.i.a(z);
                e.this.j.a(z);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z, i iVar) {
                e.this.a(z, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z) {
                e.this.b(z);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }
        };
        this.B = bVar;
        this.C = -1;
        this.z = new Handler(Looper.getMainLooper());
        this.a = context;
        this.l = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.b = nVar;
        this.i = cVar;
        this.j = cVar2;
        this.n = c1877e;
        this.k = new c(this, b2);
        this.f = oVar;
        this.e = new j(context, context.getResources().getDisplayMetrics().density);
        this.c = new FrameLayout(context);
        sg.bigo.ads.cu.a aVar2 = new sg.bigo.ads.cu.a(context);
        this.d = aVar2;
        aVar2.setOnCloseListener(new a.b() { // from class: sg.bigo.ads.core.mraid.e.1
            @Override // sg.bigo.ads.cu.a.b
            public final void a() {
                e.this.g();
            }
        });
        View view = new View(context);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.e.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        aVar2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        sg.bigo.ads.ar.a.a().a(context, this);
        cVar.a = aVar;
        cVar2.a = bVar;
        this.v = new h();
        this.r = 4871;
    }

    static int a(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    @VisibleForTesting
    private void a(int i) {
        Activity activity = this.l.get();
        if (activity == null || !a(this.u)) {
            throw new sg.bigo.ads.core.mraid.d("Attempted to lock orientation to unsupported value: " + this.u.name());
        }
        if (this.q == null) {
            this.q = Integer.valueOf(activity.getRequestedOrientation());
        }
        b bVar = this.g;
        if (bVar == null || !bVar.a(activity, i)) {
            activity.setRequestedOrientation(i);
        }
    }

    private static void a(@NonNull WebView webView, boolean z) {
        if (z) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    @VisibleForTesting
    private boolean a(i iVar) {
        ActivityInfo activityInfo;
        if (iVar == i.NONE) {
            return true;
        }
        Activity activity = this.l.get();
        if (activity == null) {
            return false;
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
    }

    private void m() {
        this.i.a();
        this.h = null;
    }

    private void n() {
        this.j.a();
        this.p = null;
    }

    @VisibleForTesting
    private void o() {
        int i;
        i iVar = this.u;
        if (iVar != i.NONE) {
            i = iVar.d;
        } else {
            if (this.t) {
                p();
                return;
            }
            Activity activity = this.l.get();
            if (activity == null) {
                throw new sg.bigo.ads.core.mraid.d("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            i = sg.bigo.ads.bz.b.a(activity);
        }
        a(i);
    }

    @VisibleForTesting
    private void p() {
        Integer num;
        j().setSystemUiVisibility(this.s);
        Activity activity = this.l.get();
        if (activity != null && (num = this.q) != null) {
            b bVar = this.g;
            if (bVar != null && bVar.b(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.q.intValue());
            }
        }
        this.q = null;
    }

    private boolean q() {
        return !this.d.a.isVisible();
    }

    private void r() {
        if (this.y != null) {
            this.a.getContentResolver().unregisterContentObserver(this.y);
            this.y = null;
        }
    }

    @Override // sg.bigo.ads.ar.b
    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay().getRotation()) == this.C) {
            return;
        }
        this.C = rotation;
        a((Runnable) null);
    }

    final void a(@Nullable final Runnable runnable) {
        byte b2 = 0;
        this.n.a();
        final c.C1876c b3 = b();
        if (b3 == null) {
            return;
        }
        C1877e c1877e = this.n;
        C1877e.a aVar = new C1877e.a(c1877e.a, new View[]{this.c, b3}, b2);
        c1877e.b = aVar;
        aVar.c = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.6
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics = e.this.a.getResources().getDisplayMetrics();
                j jVar = e.this.e;
                jVar.a.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                jVar.a(jVar.a, jVar.b);
                int[] iArr = new int[2];
                ViewGroup i = e.this.i();
                i.getLocationOnScreen(iArr);
                j jVar2 = e.this.e;
                int i2 = iArr[0];
                int i3 = iArr[1];
                jVar2.c.set(i2, i3, i.getWidth() + i2, i.getHeight() + i3);
                jVar2.a(jVar2.c, jVar2.d);
                e.this.c.getLocationOnScreen(iArr);
                e eVar = e.this;
                j jVar3 = eVar.e;
                int i4 = iArr[0];
                int i5 = iArr[1];
                jVar3.g.set(i4, i5, eVar.c.getWidth() + i4, e.this.c.getHeight() + i5);
                jVar3.a(jVar3.g, jVar3.h);
                b3.getLocationOnScreen(iArr);
                j jVar4 = e.this.e;
                int i6 = iArr[0];
                int i7 = iArr[1];
                jVar4.e.set(i6, i7, b3.getWidth() + i6, b3.getHeight() + i7);
                jVar4.a(jVar4.e, jVar4.f);
                e eVar2 = e.this;
                eVar2.i.a(eVar2.e);
                if (e.this.j.c()) {
                    e eVar3 = e.this;
                    eVar3.j.a(eVar3.e);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        aVar.d = aVar.a.length;
        aVar.b.post(aVar.e);
    }

    @VisibleForTesting
    final void a(@NonNull String str) {
        MraidVideoActivity.a(this.a, str);
    }

    @VisibleForTesting
    final void a(@NonNull String str, @Nullable sg.bigo.ads.an.i iVar) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("tel".equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || "sms".equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || POBConstants.KEY_GEO.equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme)) {
            sg.bigo.ads.bn.a.a(2, "MraidController", String.format("Uri scheme %s is not allowed.", parse.getScheme()));
            return;
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(str, iVar);
        }
    }

    public final void a(@NonNull String str, @Nullable d dVar) {
        a(dVar);
        this.i.a(str);
    }

    final void a(@Nullable String str, boolean z) {
        sg.bigo.ads.cu.a aVar;
        c.C1876c c1876c;
        if (this.h == null) {
            throw new sg.bigo.ads.core.mraid.d("Unable to expand after the WebView is destroyed");
        }
        if (this.b == n.INTERSTITIAL) {
            return;
        }
        o oVar = this.f;
        o oVar2 = o.DEFAULT;
        if (oVar == oVar2 || oVar == o.RESIZED) {
            o();
            boolean z2 = str != null;
            if (z2) {
                c.C1876c a2 = sg.bigo.ads.core.mraid.c.a(this.a);
                this.p = a2;
                if (a2 == null) {
                    return;
                }
                this.j.a(a2);
                this.j.b(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o oVar3 = this.f;
            if (oVar3 == oVar2) {
                this.s = j().getSystemUiVisibility();
                j().setSystemUiVisibility(this.r);
                if (z2) {
                    aVar = this.d;
                    c1876c = this.p;
                } else {
                    this.k.a();
                    this.c.removeView(this.h);
                    this.c.setVisibility(4);
                    aVar = this.d;
                    c1876c = this.h;
                }
                aVar.addView(c1876c, layoutParams);
                j().addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            } else if (oVar3 == o.RESIZED && z2) {
                this.d.removeView(this.h);
                this.c.addView(this.h, layoutParams);
                this.c.setVisibility(4);
                this.d.addView(this.p, layoutParams);
            }
            this.d.setLayoutParams(layoutParams);
            b(z);
            a(o.EXPANDED);
        }
    }

    public final void a(@Nullable d dVar) {
        c.C1876c a2 = sg.bigo.ads.core.mraid.c.a(this.a);
        this.h = a2;
        if (a2 == null) {
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        this.i.a(this.h);
        this.c.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
    }

    final void a(@NonNull o oVar) {
        o oVar2;
        Objects.toString(oVar);
        o oVar3 = this.f;
        this.f = oVar;
        this.i.a(oVar);
        sg.bigo.ads.core.mraid.c cVar = this.j;
        if (cVar.d) {
            cVar.a(oVar);
        }
        b bVar = this.g;
        if (bVar != null && oVar != (oVar2 = o.EXPANDED)) {
            if ((oVar3 == oVar2 && oVar == o.DEFAULT) || oVar == o.HIDDEN) {
                bVar.d();
            } else if (oVar3 == o.RESIZED) {
                o oVar4 = o.DEFAULT;
            }
        }
        a((Runnable) null);
    }

    public final void a(boolean z) {
        this.w = true;
        r();
        c.C1876c c1876c = this.h;
        if (c1876c != null) {
            a(c1876c, z);
        }
        c.C1876c c1876c2 = this.p;
        if (c1876c2 != null) {
            a(c1876c2, z);
        }
    }

    @VisibleForTesting
    final void a(boolean z, i iVar) {
        if (!a(iVar)) {
            throw new sg.bigo.ads.core.mraid.d("Unable to force orientation to ".concat(String.valueOf(iVar)));
        }
        this.t = z;
        this.u = iVar;
        if (this.f == o.EXPANDED || (this.b == n.INTERSTITIAL && !this.w)) {
            o();
        }
    }

    @VisibleForTesting
    final boolean a() {
        l lVar = this.o;
        if (lVar != null) {
            return lVar.b();
        }
        return true;
    }

    @VisibleForTesting
    final boolean a(@NonNull JsResult jsResult) {
        l lVar = this.o;
        if (lVar != null) {
            return lVar.a();
        }
        jsResult.confirm();
        return true;
    }

    public final boolean a(@NonNull File file, @Nullable d dVar) {
        try {
            if (this.h == null) {
                a(dVar);
            }
            c.C1876c c1876c = this.h;
            if (c1876c == null) {
                sg.bigo.ads.bn.a.a("MraidController", "fillLocalFolder: mMraidWebView is null after onBeforeFill");
                return false;
            }
            WebSettings settings = c1876c.getSettings();
            settings.setAllowFileAccess(true);
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            this.i.b(Uri.fromFile(file).toString());
            return true;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a("MraidController", "fillLocalFolder failed: " + th.getMessage());
            return false;
        }
    }

    @Nullable
    public final c.C1876c b() {
        return this.j.c() ? this.p : this.h;
    }

    @VisibleForTesting
    protected final void b(boolean z) {
        if (z == q()) {
            return;
        }
        this.d.setCloseVisible(!z);
    }

    @VisibleForTesting
    final boolean c() {
        Activity activity = this.l.get();
        if (activity == null || b() == null) {
            return false;
        }
        if (this.b != n.INLINE) {
            return true;
        }
        return h.a(activity);
    }

    public final void d() {
        this.w = false;
        k();
        c.C1876c c1876c = this.h;
        if (c1876c != null) {
            c1876c.onResume();
        }
        c.C1876c c1876c2 = this.p;
        if (c1876c2 != null) {
            c1876c2.onResume();
        }
    }

    public final void e() {
        this.n.a();
        try {
            sg.bigo.ads.ar.a.a().a(this);
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        if (!this.w) {
            a(true);
        }
        v.b(this.d);
        m();
        n();
        p();
        r();
        this.m = null;
        v.b(this.c);
        v.b(this.d);
        this.x = true;
    }

    final void f() {
        b bVar;
        if (this.b != n.INTERSTITIAL || (bVar = this.g) == null) {
            return;
        }
        bVar.e();
    }

    @VisibleForTesting
    protected final void g() {
        o oVar;
        o oVar2;
        ViewGroup.LayoutParams layoutParams;
        c.C1876c c1876c;
        if (this.h == null || (oVar = this.f) == o.LOADING || oVar == (oVar2 = o.HIDDEN)) {
            return;
        }
        o oVar3 = o.EXPANDED;
        if (oVar == oVar3 || this.b == n.INTERSTITIAL) {
            p();
        }
        o oVar4 = this.f;
        if (oVar4 != o.RESIZED && oVar4 != oVar3) {
            if (oVar4 == o.DEFAULT) {
                this.c.setVisibility(4);
                a(oVar2);
                return;
            }
            return;
        }
        if (!this.j.c() || (c1876c = this.p) == null) {
            this.d.removeView(this.h);
            this.c.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
            this.c.setVisibility(0);
        } else {
            n();
            this.d.removeView(c1876c);
        }
        c cVar = this.k;
        c.C1876c c1876c2 = e.this.h;
        if (c1876c2 != null && cVar.a > 0 && cVar.b > 0 && (layoutParams = c1876c2.getLayoutParams()) != null) {
            layoutParams.width = cVar.a;
            layoutParams.height = cVar.b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            e.this.h.setLayoutParams(layoutParams);
        }
        v.b(this.d);
        a(o.DEFAULT);
    }

    @VisibleForTesting
    final void h() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.c();
        }
    }

    @NonNull
    final ViewGroup i() {
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View a2 = v.a(this.l.get(), this.c);
        return a2 instanceof ViewGroup ? (ViewGroup) a2 : this.c;
    }

    @NonNull
    final ViewGroup j() {
        if (this.m == null) {
            this.m = i();
        }
        return this.m;
    }

    final void k() {
        o oVar;
        if (this.x || (oVar = this.f) == o.LOADING || oVar == o.HIDDEN || this.h == null) {
            return;
        }
        Context context = this.a;
        if (this.y != null) {
            r();
        }
        this.y = new sg.bigo.ads.core.mraid.a(this.z, context.getApplicationContext(), new a.InterfaceC1875a() { // from class: sg.bigo.ads.core.mraid.e.7
            @Override // sg.bigo.ads.core.mraid.a.InterfaceC1875a
            public final void a(float f) {
                e.this.i.c("mraidbridge.notifyAudioVolumeChangeEvent(" + f + ");");
            }
        });
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.y);
    }

    public final void l() {
        this.i.f = true;
    }
}
