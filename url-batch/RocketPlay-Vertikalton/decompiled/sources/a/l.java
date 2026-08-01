package a;

import K.C0019l;
import K.InterfaceC0018k;
import Y.B;
import Y.C0057t;
import a1.AbstractC0067d;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0075h;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import b.C0087a;
import b.InterfaceC0088b;
import b0.C0091c;
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;
import g.AbstractActivityC0129i;
import h1.InterfaceC0173a;
import i0.C0174a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements S, InterfaceC0075h, i0.f, y, androidx.lifecycle.t, InterfaceC0018k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1582r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1583a = new androidx.lifecycle.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0087a f1584b = new C0087a();

    /* renamed from: c, reason: collision with root package name */
    public final C0019l f1585c;
    public final i0.e d;

    /* renamed from: e, reason: collision with root package name */
    public Q f1586e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1587f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.g f1588g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1589j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1590k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1591l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1592m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1593n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1594o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1595p;

    /* renamed from: q, reason: collision with root package name */
    public final V0.g f1596q;

    public l() {
        AbstractActivityC0129i abstractActivityC0129i = (AbstractActivityC0129i) this;
        this.f1585c = new C0019l(new d(abstractActivityC0129i, 0));
        i0.e eVar = new i0.e(this);
        this.d = eVar;
        this.f1587f = new i(abstractActivityC0129i);
        this.f1588g = new V0.g(new k(abstractActivityC0129i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1589j = new CopyOnWriteArrayList();
        this.f1590k = new CopyOnWriteArrayList();
        this.f1591l = new CopyOnWriteArrayList();
        this.f1592m = new CopyOnWriteArrayList();
        this.f1593n = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f1583a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new e(0, abstractActivityC0129i));
        this.f1583a.a(new e(1, abstractActivityC0129i));
        this.f1583a.a(new C0174a(2, abstractActivityC0129i));
        eVar.a();
        J.d(this);
        eVar.f3037b.e("android:support:activity-result", new Y.r(1, abstractActivityC0129i));
        h(new C0057t(abstractActivityC0129i, 1));
        this.f1596q = new V0.g(new k(abstractActivityC0129i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0075h
    public final C0091c a() {
        C0091c c0091c = new C0091c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0091c.f2102a;
        if (application != null) {
            M0.e eVar = J.d;
            Application application2 = getApplication();
            i1.f.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1873a, this);
        linkedHashMap.put(J.f1874b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1875c, extras);
        }
        return c0091c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.d.f3037b;
    }

    @Override // androidx.lifecycle.S
    public final Q c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1586e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1586e = hVar.f1570a;
            }
            if (this.f1586e == null) {
                this.f1586e = new Q();
            }
        }
        Q q2 = this.f1586e;
        i1.f.b(q2);
        return q2;
    }

    @Override // K.InterfaceC0018k
    public final boolean d(KeyEvent keyEvent) {
        i1.f.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i1.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i1.f.d(decorView, "window.decorView");
        if (F1.l.w(decorView, keyEvent)) {
            return true;
        }
        return F1.l.x(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i1.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i1.f.d(decorView, "window.decorView");
        if (F1.l.w(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1583a;
    }

    public final void g(J.a aVar) {
        i1.f.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0088b interfaceC0088b) {
        C0087a c0087a = this.f1584b;
        c0087a.getClass();
        l lVar = c0087a.f2100b;
        if (lVar != null) {
            interfaceC0088b.a(lVar);
        }
        c0087a.f2099a.add(interfaceC0088b);
    }

    public final x i() {
        return (x) this.f1596q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1871b;
        D.b(this);
    }

    public final void k(Bundle bundle) {
        i1.f.e(bundle, "outState");
        this.f1583a.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        i1.f.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0087a c0087a = this.f1584b;
        c0087a.getClass();
        c0087a.f2100b = this;
        Iterator it = c0087a.f2099a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0088b) it.next()).a(this);
        }
        j(bundle);
        int i = F.f1871b;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        i1.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1585c.f684b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1322a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        i1.f.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1585c.f684b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((B) it.next()).f1322a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1594o) {
            return;
        }
        Iterator it = this.f1591l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i1.f.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1590k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        i1.f.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1585c.f684b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1322a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1595p) {
            return;
        }
        Iterator it = this.f1592m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i1.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1585c.f684b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1322a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i1.f.e(strArr, "permissions");
        i1.f.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Q q2 = this.f1586e;
        if (q2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            q2 = hVar.f1570a;
        }
        if (q2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1570a = q2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        i1.f.e(bundle, "outState");
        androidx.lifecycle.v vVar = this.f1583a;
        if (vVar != null) {
            vVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1589j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1593n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0067d.n()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1588g.a();
            synchronized (nVar.f1600a) {
                try {
                    nVar.f1601b = true;
                    Iterator it = nVar.f1602c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0173a) it.next()).c();
                    }
                    nVar.f1602c.clear();
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
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        i1.f.d(decorView, "window.decorView");
        J.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        i1.f.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        i1.f.d(decorView3, "window.decorView");
        AbstractC0104b.w(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        i1.f.d(decorView4, "window.decorView");
        F1.l.g0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        i1.f.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        i1.f.d(decorView6, "window.decorView");
        i iVar = this.f1587f;
        iVar.getClass();
        if (!iVar.f1573c) {
            iVar.f1573c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        i1.f.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        i1.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        i1.f.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        i1.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        i1.f.e(configuration, "newConfig");
        this.f1594o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1594o = false;
            Iterator it = this.f1591l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1594o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        i1.f.e(configuration, "newConfig");
        this.f1595p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1595p = false;
            Iterator it = this.f1592m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1595p = false;
            throw th;
        }
    }
}
