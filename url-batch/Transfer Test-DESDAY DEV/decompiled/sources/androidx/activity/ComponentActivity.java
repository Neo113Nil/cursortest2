package androidx.activity;

import J.a;
import K.C0014m;
import U0.g;
import Y.B;
import Y.C0051t;
import Y.r;
import a.d;
import a.e;
import a.h;
import a.i;
import a.j;
import a.k;
import a.m;
import a.w;
import a.x;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0067h;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.v;
import b.C0079a;
import b.InterfaceC0080b;
import b0.C0083c;
import com.football.transfertrivia.R;
import g1.f;
import i0.C0138a;
import i0.C0141d;
import i0.C0142e;
import i0.InterfaceC0143f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements S, InterfaceC0067h, InterfaceC0143f, x {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1237r = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0079a f1238b = new C0079a();

    /* renamed from: c, reason: collision with root package name */
    public final C0014m f1239c = new C0014m(new d(this, 0));
    public final C0142e d;

    /* renamed from: e, reason: collision with root package name */
    public Q f1240e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1241f;

    /* renamed from: g, reason: collision with root package name */
    public final g f1242g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1243j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1244k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1245l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1246m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1247n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1248o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1249p;

    /* renamed from: q, reason: collision with root package name */
    public final g f1250q;

    public ComponentActivity() {
        C0142e c0142e = new C0142e(this);
        this.d = c0142e;
        this.f1241f = new i(this);
        this.f1242g = new g(new k(this, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1243j = new CopyOnWriteArrayList();
        this.f1244k = new CopyOnWriteArrayList();
        this.f1245l = new CopyOnWriteArrayList();
        this.f1246m = new CopyOnWriteArrayList();
        this.f1247n = new CopyOnWriteArrayList();
        v vVar = this.f1436a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new e(0, this));
        this.f1436a.a(new e(1, this));
        this.f1436a.a(new C0138a(2, this));
        c0142e.a();
        J.d(this);
        c0142e.f2617b.e("android:support:activity-result", new r(2, this));
        h(new C0051t(this, 1));
        this.f1250q = new g(new k(this, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0083c a() {
        C0083c c0083c = new C0083c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0083c.f1725a;
        if (application != null) {
            O0.e eVar = J.d;
            Application application2 = getApplication();
            f.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1494a, this);
        linkedHashMap.put(J.f1495b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1496c, extras);
        }
        return c0083c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        this.f1241f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // i0.InterfaceC0143f
    public final C0141d b() {
        return this.d.f2617b;
    }

    @Override // androidx.lifecycle.S
    public final Q c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1240e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1240e = hVar.f1191a;
            }
            if (this.f1240e == null) {
                this.f1240e = new Q();
            }
        }
        Q q2 = this.f1240e;
        f.b(q2);
        return q2;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.t
    public final v d() {
        return this.f1436a;
    }

    public final void g(a aVar) {
        f.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0080b interfaceC0080b) {
        C0079a c0079a = this.f1238b;
        c0079a.getClass();
        ComponentActivity componentActivity = c0079a.f1723b;
        if (componentActivity != null) {
            interfaceC0080b.a(componentActivity);
        }
        c0079a.f1722a.add(interfaceC0080b);
    }

    public final w i() {
        return (w) this.f1250q.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        J.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        f.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        f.d(decorView3, "window.decorView");
        h0.f.m(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        f.d(decorView4, "window.decorView");
        T.e.T(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        f.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        f.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0079a c0079a = this.f1238b;
        c0079a.getClass();
        c0079a.f1723b = this;
        Iterator it = c0079a.f1722a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0080b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = F.f1492b;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1239c.f425b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f940a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        f.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1239c.f425b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((B) it.next()).f940a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1248o) {
            return;
        }
        Iterator it = this.f1245l.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        f.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1244k.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        f.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1239c.f425b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f940a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1249p) {
            return;
        }
        Iterator it = this.f1246m.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1239c.f425b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f940a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f.e(strArr, "permissions");
        f.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Q q2 = this.f1240e;
        if (q2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            q2 = hVar.f1191a;
        }
        if (q2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1191a = q2;
        return hVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        f.e(bundle, "outState");
        v vVar = this.f1436a;
        if (vVar != null) {
            vVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1243j.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1247n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h0.f.g()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m mVar = (m) this.f1242g.a();
            synchronized (mVar.f1206a) {
                try {
                    mVar.f1207b = true;
                    Iterator it = mVar.f1208c.iterator();
                    while (it.hasNext()) {
                        ((f1.a) it.next()).c();
                    }
                    mVar.f1208c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j();
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        this.f1241f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        f.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        f.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        f.e(configuration, "newConfig");
        this.f1248o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1248o = false;
            Iterator it = this.f1245l.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1248o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        f.e(configuration, "newConfig");
        this.f1249p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1249p = false;
            Iterator it = this.f1246m.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1249p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        this.f1241f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        this.f1241f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
