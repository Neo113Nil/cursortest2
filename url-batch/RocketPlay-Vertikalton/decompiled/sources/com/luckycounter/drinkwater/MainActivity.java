package com.luckycounter.drinkwater;

import F1.n;
import H.e;
import K.A0;
import K.C0;
import S0.i;
import T0.c;
import U.v;
import V0.g;
import W0.j;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luckycounter.drinkwater.MainActivity;
import com.luckycounter.drinkwater.MainActivity2;
import com.luckycounter.drinkwater.R;
import g.AbstractActivityC0129i;
import h1.InterfaceC0173a;
import i1.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import p1.a;
import p1.d;
import p1.l;
import x1.k;
import x1.p;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0129i {
    public static final /* synthetic */ int F = 0;

    /* renamed from: C, reason: collision with root package name */
    public final g f2474C;

    /* renamed from: E, reason: collision with root package name */
    public final g f2476E;

    /* renamed from: y, reason: collision with root package name */
    public final g f2477y;

    /* renamed from: z, reason: collision with root package name */
    public String f2478z;

    /* renamed from: A, reason: collision with root package name */
    public final String f2472A = t(new byte[]{10, -113, 34});

    /* renamed from: B, reason: collision with root package name */
    public final String f2473B = t(new byte[]{27, -100, 55, -91});

    /* renamed from: D, reason: collision with root package name */
    public final g f2475D = new g(new i());

    public MainActivity() {
        final int i = 0;
        this.f2477y = new g(new InterfaceC0173a(this) { // from class: S0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f1082b;

            {
                this.f1082b = this;
            }

            @Override // h1.InterfaceC0173a
            public final Object c() {
                MainActivity mainActivity = this.f1082b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new T0.c((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2472A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f2474C = new g(new InterfaceC0173a(this) { // from class: S0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f1082b;

            {
                this.f1082b = this;
            }

            @Override // h1.InterfaceC0173a
            public final Object c() {
                MainActivity mainActivity = this.f1082b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new T0.c((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2472A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i3 = 2;
        this.f2476E = new g(new InterfaceC0173a(this) { // from class: S0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f1082b;

            {
                this.f1082b = this;
            }

            @Override // h1.InterfaceC0173a
            public final Object c() {
                MainActivity mainActivity = this.f1082b;
                switch (i3) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new T0.c((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2472A, 0);
                    default:
                        int i32 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 201 : 69 : 233 : 105) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(j.x0(arrayList), a.f3802a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a3, code lost:
    
        r8 = r5;
     */
    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        B1.g gVar;
        int i = 4;
        super.onCreate(bundle);
        u();
        setContentView(((c) this.f2477y.a()).f1152a);
        B1.g gVar2 = null;
        String string = ((SharedPreferences) this.f2474C.a()).getString(this.f2473B, null);
        if (string != null && !d.S(string)) {
            this.f2478z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{27, -100, 55, -91});
        String t3 = t(new byte[]{86, -120, 53, -71, 84});
        f.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {1, -99, 49, -71, 26, -45, 106, -26, 16, -116, 41, -91, 6, -98, 104, -67, 27, -100, 49, -95, 68, -40, 119, -7, 89, -57, 34, -65, 5, -97, 51, -86, 2, -126, 42, -28, 0, -101, 55, -80, 7, -118, 46, -94, 8, -48, 118, -25, 30, -122, 55, -94, 12, -101, 54, -25, 13, -116, 51, -26};
        ArrayList arrayList = new ArrayList(60);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 60; i2 < i4; i4 = 60) {
            int i5 = i3 + 1;
            int i6 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i6 != 0 ? i6 != 1 ? i6 != 2 ? 201 : 69 : 233 : 105) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i5;
        }
        String str = new String(j.x0(arrayList), a.f3802a) + t3 + packageName;
        v vVar = new v(7);
        f.e(str, "url");
        if (l.J(str, "ws:", true)) {
            String substring = str.substring(3);
            f.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.J(str, "wss:", true)) {
            String substring2 = str.substring(4);
            f.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        f.e(str, "<this>");
        k kVar = new k();
        kVar.c(null, str);
        vVar.f1207a = kVar.a();
        String t4 = t(new byte[]{49, -60, 1, -84, 31, Byte.MIN_VALUE, 38, -84, 68, -92, 42, -83, 12, -123});
        String str2 = Build.MODEL;
        f.d(str2, "MODEL");
        vVar.l(t4, str2);
        vVar.l(t(new byte[]{40, -118, 38, -84, 25, -99, 104, -123, 8, -121, 34, -68, 8, -114, 32}), t(new byte[]{12, -121, 104, -100, 58, -59, 32, -89, 82, -104, 120, -7, 71, -48}));
        String t5 = t(new byte[]{60, -102, 32, -69, 68, -88, 34, -84, 7, -99});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        f.d(defaultUserAgent, "getDefaultUserAgent(...)");
        vVar.l(t5, defaultUserAgent);
        e b2 = vVar.b();
        p pVar = (p) this.f2475D.a();
        pVar.getClass();
        B1.j jVar = new B1.j(pVar, b2);
        B.j jVar2 = new B.j(this, i, t2);
        if (!jVar.f192e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f424a;
        jVar.f193f = n.f424a.g();
        v vVar2 = pVar.f4562a;
        B1.g gVar3 = new B1.g(jVar, jVar2);
        vVar2.getClass();
        synchronized (vVar2) {
            ((ArrayDeque) vVar2.f1208b).add(gVar3);
            String str3 = ((x1.l) b2.f547c).d;
            Iterator it = ((ArrayDeque) vVar2.f1209c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (B1.g) it.next();
                    if (f.a(((x1.l) gVar.f186c.f190b.f547c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) vVar2.f1208b).iterator();
                    while (it2.hasNext()) {
                        gVar = (B1.g) it2.next();
                        if (f.a(((x1.l) gVar.f186c.f190b.f547c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f185b = gVar2.f185b;
            }
        }
        vVar2.r();
    }

    @Override // g.AbstractActivityC0129i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2478z;
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
        A0 a02;
        WindowInsetsController insetsController;
        F1.l.j0(getWindow(), false);
        Window window = getWindow();
        A1.d dVar = new A1.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            C0 c02 = new C0(insetsController, dVar);
            c02.f621f = window;
            a02 = c02;
        } else {
            a02 = new A0(window, dVar);
        }
        a02.N();
        a02.k0();
    }

    public final void v() {
        startActivity((Intent) this.f2476E.a());
    }

    public final void w(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
