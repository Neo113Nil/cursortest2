package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.a;
import com.ionia.reidopitaco.libya.R;
import defpackage.b3;
import defpackage.fp;
import defpackage.lb;
import defpackage.lp;
import defpackage.pb;
import defpackage.s80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class pb extends ob implements t80, lm, x00 {
    public static final /* synthetic */ int y = 0;
    public final cd g = new cd();
    public final y5 h;
    public final w00 i;
    public s80 j;
    public final mb k;
    public final e40 l;
    public final nb m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;
    public final e40 w;
    public final e40 x;

    public pb() {
        final b3 b3Var = (b3) this;
        int i = 1;
        this.h = new y5(new fb(b3Var, i));
        w00 w00Var = new w00(this);
        this.i = w00Var;
        this.k = new mb(b3Var);
        this.l = new e40(new gb(b3Var, i));
        new AtomicInteger();
        this.m = new nb();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.w = new e40(new gb(b3Var, 2));
        a aVar = this.f;
        if (aVar == null) {
            l8.u("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i2 = 0;
        aVar.a(new ib(i2, b3Var));
        this.f.a(new ib(i, b3Var));
        this.f.a(new jp() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.jp
            public final void b(lp lpVar, fp fpVar) {
                int i3 = pb.y;
                b3 b3Var2 = b3.this;
                if (b3Var2.j == null) {
                    lb lbVar = (lb) b3Var2.getLastNonConfigurationInstance();
                    if (lbVar != null) {
                        b3Var2.j = lbVar.a;
                    }
                    if (b3Var2.j == null) {
                        b3Var2.j = new s80();
                    }
                }
                b3Var2.f.f(this);
            }
        });
        w00Var.a();
        oo.l(this);
        w00Var.b.e("android:support:activity-result", new jb(i2, b3Var));
        g(new kb(b3Var, i2));
        this.x = new e40(new gb(b3Var, 3));
    }

    public static void f(b3 b3Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!oo.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!oo.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.x00
    public final h3 a() {
        return this.i.b;
    }

    @Override // defpackage.lm
    public final wt c() {
        wt wtVar = new wt(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) wtVar.a;
        if (getApplication() != null) {
            linkedHashMap.put(tg.n, getApplication());
        }
        linkedHashMap.put(oo.l, this);
        linkedHashMap.put(oo.m, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(oo.n, extras);
        }
        return wtVar;
    }

    @Override // defpackage.t80
    public final s80 d() {
        if (getApplication() == null) {
            l8.u("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            lb lbVar = (lb) getLastNonConfigurationInstance();
            if (lbVar != null) {
                this.j = lbVar.a;
            }
            if (this.j == null) {
                this.j = new s80();
            }
        }
        s80 s80Var = this.j;
        s80Var.getClass();
        return s80Var;
    }

    @Override // defpackage.lp
    public final a e() {
        return this.f;
    }

    public final void g(qv qvVar) {
        cd cdVar = this.g;
        cdVar.getClass();
        pb pbVar = cdVar.b;
        if (pbVar != null) {
            qvVar.a(pbVar);
        }
        cdVar.a.add(qvVar);
    }

    public final pv h() {
        return (pv) this.x.a();
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.m.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((nf) this.w.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.ob, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        cd cdVar = this.g;
        cdVar.getClass();
        cdVar.b = this;
        Iterator it = cdVar.a.iterator();
        while (it.hasNext()) {
            ((qv) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = mz.g;
        kz.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((mk) it.next()).a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
            while (it.hasNext()) {
                if (((mk) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.u = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wc) it.next()).accept(new vt(z));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((mk) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.v = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.v = false;
            Iterator it = this.r.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wc) it.next()).accept(new gw(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        iw iwVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            iwVar = new iw(0);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            iwVar = new iw(0);
        } else {
            iwVar = new iw(0);
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(iwVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((mk) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        lb lbVar;
        s80 s80Var = this.j;
        if (s80Var == null && (lbVar = (lb) getLastNonConfigurationInstance()) != null) {
            s80Var = lbVar.a;
        }
        if (s80Var == null) {
            return null;
        }
        lb lbVar2 = new lb();
        lbVar2.a = s80Var;
        return lbVar2;
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        a aVar = this.f;
        if (aVar != null) {
            aVar.c("setCurrentState");
            aVar.e(gp.h);
        }
        super.onSaveInstanceState(bundle);
        this.i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (g8.R()) {
                g8.f("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            cl clVar = (cl) this.l.a();
            synchronized (clVar.a) {
                try {
                    clVar.b = true;
                    ArrayList arrayList = clVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((dl) obj).a();
                    }
                    clVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        mb mbVar = this.k;
        mbVar.getClass();
        if (!mbVar.h) {
            mbVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(mbVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(new vt(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.v) {
            return;
        }
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wc) it.next()).accept(new gw(z));
        }
    }
}
