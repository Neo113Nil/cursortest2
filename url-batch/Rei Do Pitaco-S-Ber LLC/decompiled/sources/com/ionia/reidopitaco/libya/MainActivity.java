package com.ionia.reidopitaco.libya;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ionia.reidopitaco.libya.MainActivity;
import com.ionia.reidopitaco.libya.MainActivity2;
import com.ionia.reidopitaco.libya.R;
import defpackage.b3;
import defpackage.dl;
import defpackage.e40;
import defpackage.ev;
import defpackage.f80;
import defpackage.fv;
import defpackage.i40;
import defpackage.jw;
import defpackage.l8;
import defpackage.lg;
import defpackage.m30;
import defpackage.mg;
import defpackage.ng;
import defpackage.o4;
import defpackage.oe;
import defpackage.og;
import defpackage.oo;
import defpackage.pg;
import defpackage.po;
import defpackage.q1;
import defpackage.qg;
import defpackage.qx;
import defpackage.r9;
import defpackage.rg;
import defpackage.sg;
import defpackage.tx;
import defpackage.u30;
import defpackage.wn;
import defpackage.x70;
import defpackage.xn;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class MainActivity extends b3 {
    public static final /* synthetic */ int L = 0;
    public final e40 F;
    public String G;
    public final String H = q(new byte[]{96, 51, 100});
    public final String I = q(new byte[]{113, 32, 113, 57});
    public SharedPreferences J;
    public final e40 K;

    public MainActivity() {
        final int i = 0;
        this.F = new e40(new dl(this) { // from class: tq
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.dl
            public final Object a() {
                int i2 = i;
                MainActivity mainActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) vv.o(inflate, R.id.progressBar)) != null) {
                            return new q1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.K = new e40(new dl(this) { // from class: tq
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.dl
            public final Object a() {
                int i22 = i2;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) vv.o(inflate, R.id.progressBar)) != null) {
                            return new q1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String q(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            arrayList.add(Byte.valueOf((byte) ((i3 % 2 == 0 ? 3 : 85) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            bArr2[i] = ((Number) obj).byteValue();
            i++;
        }
        return new String(bArr2, r9.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0212, code lost:
    
        r9 = r3;
     */
    @Override // defpackage.b3, defpackage.pb, defpackage.ob, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        qx qxVar;
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences(this.H, 0);
        sharedPreferences.getClass();
        this.J = sharedPreferences;
        i40 i40Var = new i40(0, 0, new l8(25));
        i40 i40Var2 = new i40(ng.a, ng.b, new l8(25));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        og ogVar = ng.c;
        if (ogVar == null) {
            int i = Build.VERSION.SDK_INT;
            ogVar = i >= 35 ? new sg() : i >= 30 ? new rg() : i >= 29 ? new qg() : i >= 28 ? new pg() : new og();
            ng.c = ogVar;
        }
        og ogVar2 = ogVar;
        lg lgVar = new lg(ogVar2, i40Var, i40Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                mg mgVar = new mg(lgVar, viewGroup.getContext());
                mgVar.setTag(ogVar2);
                mgVar.setVisibility(8);
                mgVar.setWillNotDraw(true);
                viewGroup.addView(mgVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof og) {
                break;
            } else {
                i2 = i3;
            }
        }
        lgVar.run();
        Window window = getWindow();
        window.getClass();
        ogVar2.a(window);
        setContentView(((q1) this.F.a()).a);
        View findViewById = findViewById(R.id.main);
        l8 l8Var = new l8(18);
        WeakHashMap weakHashMap = f80.a;
        x70.c(findViewById, l8Var);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences2 = this.J;
        qx qxVar2 = null;
        if (sharedPreferences2 == null) {
            oo.P("prefs");
            throw null;
        }
        String string = sharedPreferences2.getString(this.I, null);
        if (string != null && !m30.s0(string)) {
            this.G = string;
            s(string);
            return;
        }
        String packageName = getPackageName();
        String q = q(new byte[]{113, 32, 113, 57});
        String q2 = q(new byte[]{60, 52, 115, 37, 62});
        String str = q(new byte[]{107, 33, 119, 37, 112, 111, 44, 122, 112, 61, 122, 120, 107, 60, 111, 57, 46, 49, 103, 51, 59, 123, 106, 44, 122, 52, 113, 54, 107, 60, 104, 101, 51, 37, 111, 45, 109, 98, 49, 123, 116, 58, 113, 62, 102, 39, 112, 123, 103, 48, 117}) + q2 + packageName;
        fv fvVar = new fv(new ev());
        oe oeVar = new oe(6);
        if (u30.l0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (u30.l0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        wn wnVar = new wn(0);
        wnVar.f(null, str);
        oeVar.f = wnVar.b();
        String q3 = q(new byte[]{91, 120, 71, 48, 117, 60, 96, 48, 46, 24, 108, 49, 102, 57});
        String str2 = Build.MODEL;
        str2.getClass();
        oeVar.p(q3, str2);
        oeVar.p(q(new byte[]{66, 54, 96, 48, 115, 33, 46, 25, 98, 59, 100, 32, 98, 50, 102}), q(new byte[]{102, 59, 46, 0, 80, 121, 102, 59, 56, 36, 62, 101, 45, 108}));
        String q4 = q(new byte[]{86, 38, 102, 39, 46, 20, 100, 48, 109, 33});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        defaultUserAgent.getClass();
        oeVar.p(q4, defaultUserAgent);
        po d = oeVar.d();
        tx txVar = new tx(fvVar, d);
        o4 o4Var = new o4((LayoutInflater.Factory2) this, (Object) q, 19);
        if (!txVar.j.compareAndSet(false, true)) {
            l8.u("Already Executed");
            return;
        }
        jw jwVar = jw.a;
        txVar.k = jw.a.g();
        oe oeVar2 = fvVar.f;
        qx qxVar3 = new qx(txVar, o4Var);
        oeVar2.getClass();
        synchronized (oeVar2) {
            ((ArrayDeque) oeVar2.g).add(qxVar3);
            String str3 = ((xn) d.b).d;
            Iterator it = ((ArrayDeque) oeVar2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    qxVar = (qx) it.next();
                    if (oo.b(((xn) qxVar.h.g.b).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) oeVar2.g).iterator();
                    while (it2.hasNext()) {
                        qxVar = (qx) it2.next();
                        if (oo.b(((xn) qxVar.h.g.b).d, str3)) {
                        }
                    }
                }
            }
            if (qxVar2 != null) {
                qxVar3.g = qxVar2.g;
            }
        }
        oeVar2.x();
    }

    @Override // defpackage.b3, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.G;
        if (str != null) {
            s(str);
        }
    }

    public final void r() {
        startActivity((Intent) this.K.a());
    }

    public final void s(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            r();
        }
    }
}
