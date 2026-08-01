package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vectorharbor.planetvectorsurvey.MainActivity;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class zf extends yf implements r01, fw, ln0, fb0, g90 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final sf Companion = new sf();
    private q01 _viewModelStore;
    private final w1 activityResultRegistry;
    private int contentLayoutId;
    private final ij contextAwareHelper = new ij();
    private final u10 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final u10 fullyDrawnReporter$delegate;
    private final j50 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final u10 onBackPressedDispatcher$delegate;
    private final u10 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<wi> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<wi> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<wi> onNewIntentListeners;
    private final CopyOnWriteArrayList<wi> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<wi> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final vf reportFullyDrawnExecutor;
    private final jn0 savedStateRegistryController;

    public zf() {
        final MainActivity mainActivity = (MainActivity) this;
        this.menuHostHelper = new j50(new mf(mainActivity, 1));
        kn0 kn0Var = new kn0(this, new ab0(5, this));
        this.savedStateRegistryController = new jn0(kn0Var);
        this.reportFullyDrawnExecutor = new wf(mainActivity);
        this.fullyDrawnReporter$delegate = new lu0(new nf(mainActivity, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new xf();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new lu0(new nf(mainActivity, 2));
        if (getLifecycle() == null) {
            g8.s("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        getLifecycle().a(new m20() { // from class: pf
            @Override // defpackage.m20
            public final void g(o20 o20Var, e20 e20Var) {
                Window window;
                View peekDecorView;
                int i2 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i2) {
                    case 0:
                        if (e20Var == e20.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        zf.c(mainActivity2, o20Var, e20Var);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new m20() { // from class: pf
            @Override // defpackage.m20
            public final void g(o20 o20Var, e20 e20Var) {
                Window window;
                View peekDecorView;
                int i22 = i2;
                MainActivity mainActivity2 = mainActivity;
                switch (i22) {
                    case 0:
                        if (e20Var == e20.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        zf.c(mainActivity2, o20Var, e20Var);
                        break;
                }
            }
        });
        getLifecycle().a(new yi0(i2, mainActivity));
        kn0Var.a();
        x40.z(this);
        if (Build.VERSION.SDK_INT == 23) {
            getLifecycle().a(new jx(mainActivity));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new qf(0, mainActivity));
        addOnContextAvailableListener(new rf(mainActivity));
        this.defaultViewModelProviderFactory$delegate = new lu0(new nf(mainActivity, 3));
        this.onBackPressedDispatcher$delegate = new lu0(new nf(mainActivity, 4));
    }

    public static Bundle a(MainActivity mainActivity) {
        Bundle bundle = new Bundle();
        w1 w1Var = ((zf) mainActivity).activityResultRegistry;
        w1Var.getClass();
        LinkedHashMap linkedHashMap = w1Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(w1Var.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(w1Var.f));
        return bundle;
    }

    public static final void access$ensureViewModelStore(zf zfVar) {
        if (zfVar._viewModelStore == null) {
            uf ufVar = (uf) zfVar.getLastNonConfigurationInstance();
            if (ufVar != null) {
                zfVar._viewModelStore = ufVar.b;
            }
            if (zfVar._viewModelStore == null) {
                zfVar._viewModelStore = new q01();
            }
        }
    }

    public static au b(MainActivity mainActivity) {
        return new au(((zf) mainActivity).reportFullyDrawnExecutor, new nf(mainActivity, 0));
    }

    public static void c(MainActivity mainActivity, o20 o20Var, e20 e20Var) {
        if (e20Var == e20.ON_DESTROY) {
            ((zf) mainActivity).contextAwareHelper.b = null;
            if (!mainActivity.isChangingConfigurations()) {
                mainActivity.getViewModelStore().a();
            }
            wf wfVar = (wf) ((zf) mainActivity).reportFullyDrawnExecutor;
            MainActivity mainActivity2 = wfVar.g;
            mainActivity2.getWindow().getDecorView().removeCallbacks(wfVar);
            mainActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(wfVar);
        }
    }

    public static void d(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!nz.l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!nz.l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void e(MainActivity mainActivity, zf zfVar) {
        zfVar.getClass();
        Bundle a = mainActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            w1 w1Var = ((zf) mainActivity).activityResultRegistry;
            LinkedHashMap linkedHashMap = w1Var.b;
            LinkedHashMap linkedHashMap2 = w1Var.a;
            Bundle bundle = w1Var.f;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                w1Var.c.addAll(stringArrayList2);
            }
            Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        px0.i(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                w1Var.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        vf vfVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((wf) vfVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(k50 k50Var, o20 o20Var) {
        k50Var.getClass();
        o20Var.getClass();
        j50 j50Var = this.menuHostHelper;
        j50Var.b.add(null);
        j50Var.a.run();
        g20 lifecycle = o20Var.getLifecycle();
        HashMap hashMap = j50Var.c;
        i50 i50Var = (i50) hashMap.remove(k50Var);
        if (i50Var != null) {
            i50Var.a.b(i50Var.b);
            i50Var.b = null;
        }
        hashMap.put(k50Var, new i50(lifecycle, new h50(0, j50Var)));
    }

    public final void addOnConfigurationChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onConfigurationChangedListeners.add(wiVar);
    }

    public final void addOnContextAvailableListener(gb0 gb0Var) {
        gb0Var.getClass();
        ij ijVar = this.contextAwareHelper;
        ijVar.getClass();
        zf zfVar = ijVar.b;
        if (zfVar != null) {
            e(((rf) gb0Var).a, zfVar);
        }
        ijVar.a.add(gb0Var);
    }

    public final void addOnMultiWindowModeChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onMultiWindowModeChangedListeners.add(wiVar);
    }

    public final void addOnNewIntentListener(wi wiVar) {
        wiVar.getClass();
        this.onNewIntentListeners.add(wiVar);
    }

    public final void addOnPictureInPictureModeChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(wiVar);
    }

    public final void addOnTrimMemoryListener(wi wiVar) {
        wiVar.getClass();
        this.onTrimMemoryListeners.add(wiVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final w1 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.fw
    public hk getDefaultViewModelCreationExtras() {
        m60 m60Var = new m60();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = m60Var.a;
        if (application != null) {
            linkedHashMap.put(m01.f, getApplication());
        }
        linkedHashMap.put(x40.j, this);
        linkedHashMap.put(x40.k, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(x40.l, extras);
        }
        return m60Var;
    }

    @Override // defpackage.fw
    public n01 getDefaultViewModelProviderFactory() {
        return (n01) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public au getFullyDrawnReporter() {
        return (au) this.fullyDrawnReporter$delegate.getValue();
    }

    @vl
    public Object getLastCustomNonConfigurationInstance() {
        uf ufVar = (uf) getLastNonConfigurationInstance();
        if (ufVar != null) {
            return ufVar.a;
        }
        return null;
    }

    @Override // defpackage.yf, defpackage.o20
    public g20 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.g90
    public f90 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().a();
    }

    @Override // defpackage.fb0
    public final eb0 getOnBackPressedDispatcher() {
        return (eb0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.ln0
    public final in0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.r01
    public q01 getViewModelStore() {
        if (getApplication() == null) {
            g8.s("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            uf ufVar = (uf) getLastNonConfigurationInstance();
            if (ufVar != null) {
                this._viewModelStore = ufVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new q01();
            }
        }
        q01 q01Var = this._viewModelStore;
        q01Var.getClass();
        return q01Var;
    }

    public void initializeViewTreeOwners() {
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

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @vl
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @vl
    public void onBackPressed() {
        ((pm) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<wi> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.yf, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        ij ijVar = this.contextAwareHelper;
        ijVar.getClass();
        ijVar.b = this;
        Iterator it = ijVar.a.iterator();
        while (it.hasNext()) {
            e(((rf) ((gb0) it.next())).a, this);
        }
        super.onCreate(bundle);
        int i = nk0.e;
        lk0.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        j50 j50Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = j50Var.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        g8.q();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                g8.q();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<wi> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new y7(23));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<wi> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            g8.q();
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<wi> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new y7(28));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        g8.q();
        return false;
    }

    @Override // android.app.Activity
    @vl
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @vl
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        uf ufVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        q01 q01Var = this._viewModelStore;
        if (q01Var == null && (ufVar = (uf) getLastNonConfigurationInstance()) != null) {
            q01Var = ufVar.b;
        }
        if (q01Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        uf ufVar2 = new uf();
        ufVar2.a = onRetainCustomNonConfigurationInstance;
        ufVar2.b = q01Var;
        return ufVar2;
    }

    @Override // defpackage.yf, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof q20) {
            g20 lifecycle = getLifecycle();
            lifecycle.getClass();
            q20 q20Var = (q20) lifecycle;
            q20Var.d("setCurrentState");
            q20Var.f(f20.f);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<wi> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> u1 registerForActivityResult(t1 t1Var, s1 s1Var) {
        throw null;
    }

    public void removeMenuProvider(k50 k50Var) {
        k50Var.getClass();
        this.menuHostHelper.a();
    }

    public final void removeOnConfigurationChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onConfigurationChangedListeners.remove(wiVar);
    }

    public final void removeOnContextAvailableListener(gb0 gb0Var) {
        gb0Var.getClass();
        ij ijVar = this.contextAwareHelper;
        ijVar.getClass();
        ijVar.a.remove(gb0Var);
    }

    public final void removeOnMultiWindowModeChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(wiVar);
    }

    public final void removeOnNewIntentListener(wi wiVar) {
        wiVar.getClass();
        this.onNewIntentListeners.remove(wiVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(wi wiVar) {
        wiVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(wiVar);
    }

    public final void removeOnTrimMemoryListener(wi wiVar) {
        wiVar.getClass();
        this.onTrimMemoryListeners.remove(wiVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ch0.i()) {
                ch0.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            au fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((bu) obj).a();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        vf vfVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((wf) vfVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @vl
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @vl
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> u1 registerForActivityResult(t1 t1Var, w1 w1Var, s1 s1Var) {
        throw null;
    }

    @Override // android.app.Activity
    @vl
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @vl
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        vf vfVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((wf) vfVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        vf vfVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((wf) vfVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @vl
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<wi> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new y7(23));
        }
    }

    @Override // android.app.Activity
    @vl
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<wi> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new y7(28));
        }
    }

    public void addMenuProvider(k50 k50Var) {
        k50Var.getClass();
        j50 j50Var = this.menuHostHelper;
        j50Var.b.add(null);
        j50Var.a.run();
    }

    public void addMenuProvider(k50 k50Var, o20 o20Var, f20 f20Var) {
        k50Var.getClass();
        o20Var.getClass();
        f20Var.getClass();
        j50 j50Var = this.menuHostHelper;
        j50Var.getClass();
        g20 lifecycle = o20Var.getLifecycle();
        HashMap hashMap = j50Var.c;
        i50 i50Var = (i50) hashMap.remove(k50Var);
        if (i50Var != null) {
            i50Var.a.b(i50Var.b);
            i50Var.b = null;
        }
        hashMap.put(k50Var, new i50(lifecycle, new of(1, j50Var, f20Var)));
    }
}
