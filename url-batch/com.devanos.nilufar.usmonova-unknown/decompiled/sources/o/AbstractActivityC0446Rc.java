package o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0446Rc extends AbstractActivityC0420Qc implements InterfaceC0746b00, InterfaceC1655or, MP, ZF, InterfaceC0829cG {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0213Ic Companion = new C0213Ic();
    private C0680a00 _viewModelStore;
    private final W1 activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC0235Iy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC0235Iy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC0235Iy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC0655Zd> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0655Zd> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0655Zd> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0655Zd> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0655Zd> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0291Lc reportFullyDrawnExecutor;
    private final LP savedStateRegistryController;
    private final C1642oe contextAwareHelper = new C1642oe();
    private final C1088gC menuHostHelper = new C1088gC(new RunnableC0109Ec(this, 0));

    public AbstractActivityC0446Rc() {
        LP lp = new LP(this);
        this.savedStateRegistryController = lp;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0316Mc(this);
        this.fullyDrawnReporter$delegate = EB.D(new C0394Pc(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0368Oc(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new C0135Fc(0, this));
        int i = 1;
        getLifecycle().a(new C0135Fc(i, this));
        getLifecycle().a(new C0966eM(i, this));
        lp.a();
        AbstractC1807r8.E(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C0095Do(1, this));
        addOnContextAvailableListener(new C0147Fo(this, 1));
        this.defaultViewModelProviderFactory$delegate = EB.D(new C0394Pc(this, 0));
        this.onBackPressedDispatcher$delegate = EB.D(new C0394Pc(this, 3));
    }

    public static void a(AbstractActivityC0446Rc abstractActivityC0446Rc, Context context) {
        AbstractC0048Bt.n(context, "it");
        Bundle a = abstractActivityC0446Rc.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            W1 w1 = abstractActivityC0446Rc.activityResultRegistry;
            LinkedHashMap linkedHashMap = w1.b;
            LinkedHashMap linkedHashMap2 = w1.a;
            Bundle bundle = w1.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                w1.d.addAll(stringArrayList2);
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
                        AbstractC1305jX.f(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                AbstractC0048Bt.m(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                AbstractC0048Bt.m(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                w1.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        if (abstractActivityC0446Rc._viewModelStore == null) {
            C0265Kc c0265Kc = (C0265Kc) abstractActivityC0446Rc.getLastNonConfigurationInstance();
            if (c0265Kc != null) {
                abstractActivityC0446Rc._viewModelStore = c0265Kc.b;
            }
            if (abstractActivityC0446Rc._viewModelStore == null) {
                abstractActivityC0446Rc._viewModelStore = new C0680a00();
            }
        }
    }

    public static void b(AbstractActivityC0446Rc abstractActivityC0446Rc, InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
            abstractActivityC0446Rc.contextAwareHelper.b = null;
            if (!abstractActivityC0446Rc.isChangingConfigurations()) {
                abstractActivityC0446Rc.getViewModelStore().a();
            }
            ViewTreeObserverOnDrawListenerC0316Mc viewTreeObserverOnDrawListenerC0316Mc = (ViewTreeObserverOnDrawListenerC0316Mc) abstractActivityC0446Rc.reportFullyDrawnExecutor;
            AbstractActivityC0446Rc abstractActivityC0446Rc2 = viewTreeObserverOnDrawListenerC0316Mc.k;
            abstractActivityC0446Rc2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0316Mc);
            abstractActivityC0446Rc2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0316Mc);
        }
    }

    public static Bundle c(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        Bundle bundle = new Bundle();
        W1 w1 = abstractActivityC0446Rc.activityResultRegistry;
        w1.getClass();
        LinkedHashMap linkedHashMap = w1.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(w1.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(w1.g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0291Lc interfaceExecutorC0291Lc = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0316Mc) interfaceExecutorC0291Lc).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC2207xC interfaceC2207xC) {
        AbstractC0048Bt.n(interfaceC2207xC, "provider");
        C1088gC c1088gC = this.menuHostHelper;
        c1088gC.b.add(interfaceC2207xC);
        c1088gC.a.run();
    }

    @Override // o.InterfaceC0829cG
    public final void addOnConfigurationChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onConfigurationChangedListeners.add(interfaceC0655Zd);
    }

    public final void addOnContextAvailableListener(InterfaceC0895dG interfaceC0895dG) {
        AbstractC0048Bt.n(interfaceC0895dG, "listener");
        C1642oe c1642oe = this.contextAwareHelper;
        c1642oe.getClass();
        AbstractActivityC0446Rc abstractActivityC0446Rc = c1642oe.b;
        if (abstractActivityC0446Rc != null) {
            interfaceC0895dG.a(abstractActivityC0446Rc);
        }
        c1642oe.a.add(interfaceC0895dG);
    }

    public final void addOnMultiWindowModeChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onMultiWindowModeChangedListeners.add(interfaceC0655Zd);
    }

    public final void addOnNewIntentListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onNewIntentListeners.add(interfaceC0655Zd);
    }

    public final void addOnPictureInPictureModeChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onPictureInPictureModeChangedListeners.add(interfaceC0655Zd);
    }

    public final void addOnTrimMemoryListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onTrimMemoryListeners.add(interfaceC0655Zd);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        AbstractC0048Bt.n(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final W1 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // o.InterfaceC1655or
    public AbstractC0656Ze getDefaultViewModelCreationExtras() {
        C2142wD c2142wD = new C2142wD(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c2142wD.a;
        if (application != null) {
            Application application2 = getApplication();
            AbstractC0048Bt.m(application2, "application");
            linkedHashMap.put(WZ.d, application2);
        }
        linkedHashMap.put(AbstractC1807r8.e, this);
        linkedHashMap.put(AbstractC1807r8.f, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC1807r8.g, extras);
        }
        return c2142wD;
    }

    public XZ getDefaultViewModelProviderFactory() {
        return (XZ) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C1389kp getFullyDrawnReporter() {
        return (C1389kp) this.fullyDrawnReporter$delegate.getValue();
    }

    @InterfaceC1315jh
    public Object getLastCustomNonConfigurationInstance() {
        C0265Kc c0265Kc = (C0265Kc) getLastNonConfigurationInstance();
        if (c0265Kc != null) {
            return c0265Kc.a;
        }
        return null;
    }

    @Override // o.AbstractActivityC0420Qc, o.InterfaceC0365Nz
    public AbstractC0106Dz getLifecycle() {
        return super.getLifecycle();
    }

    @Override // o.ZF
    public final YF getOnBackPressedDispatcher() {
        return (YF) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // o.MP
    public final KP getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // o.InterfaceC0746b00
    public C0680a00 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0265Kc c0265Kc = (C0265Kc) getLastNonConfigurationInstance();
            if (c0265Kc != null) {
                this._viewModelStore = c0265Kc.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C0680a00();
            }
        }
        C0680a00 c0680a00 = this._viewModelStore;
        AbstractC0048Bt.k(c0680a00);
        return c0680a00;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        ON.q(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView3, "window.decorView");
        AbstractC1494mO.k(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView4, "window.decorView");
        AbstractC0772bO.y(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC0048Bt.n(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0655Zd> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // o.AbstractActivityC0420Qc, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C1642oe c1642oe = this.contextAwareHelper;
        c1642oe.getClass();
        c1642oe.b = this;
        Iterator it = c1642oe.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0895dG) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = CN.i;
        AN.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        AbstractC0048Bt.n(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C1088gC c1088gC = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c1088gC.b.iterator();
        while (it.hasNext()) {
            ((C0406Po) ((InterfaceC2207xC) it.next())).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        AbstractC0048Bt.n(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0655Zd> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1681pD(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC0048Bt.n(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC0655Zd> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        AbstractC0048Bt.n(menu, "menu");
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C0406Po) ((InterfaceC2207xC) it.next())).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0655Zd> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new YH(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        AbstractC0048Bt.n(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((C0406Po) ((InterfaceC2207xC) it.next())).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC0048Bt.n(strArr, "permissions");
        AbstractC0048Bt.n(iArr, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @InterfaceC1315jh
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0265Kc c0265Kc;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0680a00 c0680a00 = this._viewModelStore;
        if (c0680a00 == null && (c0265Kc = (C0265Kc) getLastNonConfigurationInstance()) != null) {
            c0680a00 = c0265Kc.b;
        }
        if (c0680a00 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0265Kc c0265Kc2 = new C0265Kc();
        c0265Kc2.a = onRetainCustomNonConfigurationInstance;
        c0265Kc2.b = c0680a00;
        return c0265Kc2;
    }

    @Override // o.AbstractActivityC0420Qc, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0048Bt.n(bundle, "outState");
        if (getLifecycle() instanceof C0417Pz) {
            AbstractC0106Dz lifecycle = getLifecycle();
            AbstractC0048Bt.l(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0417Pz) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0655Zd> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> P1 registerForActivityResult(final N1 n1, final W1 w1, final L1 l1) {
        AbstractC0048Bt.n(n1, "contract");
        AbstractC0048Bt.n(w1, "registry");
        AbstractC0048Bt.n(l1, "callback");
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = w1.c;
        AbstractC0048Bt.n(str, "key");
        AbstractC0106Dz lifecycle = getLifecycle();
        C0417Pz c0417Pz = (C0417Pz) lifecycle;
        if (c0417Pz.d.compareTo(EnumC0080Cz.k) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0417Pz.d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        w1.d(str);
        S1 s1 = (S1) linkedHashMap.get(str);
        if (s1 == null) {
            s1 = new S1(lifecycle);
        }
        InterfaceC0288Kz interfaceC0288Kz = new InterfaceC0288Kz() { // from class: o.Q1
            @Override // o.InterfaceC0288Kz
            public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
                W1 w12 = W1.this;
                Bundle bundle = w12.g;
                LinkedHashMap linkedHashMap2 = w12.e;
                LinkedHashMap linkedHashMap3 = w12.f;
                EnumC0054Bz enumC0054Bz2 = EnumC0054Bz.ON_START;
                String str2 = str;
                if (enumC0054Bz2 != enumC0054Bz) {
                    if (EnumC0054Bz.ON_STOP == enumC0054Bz) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0054Bz.ON_DESTROY == enumC0054Bz) {
                            w12.e(str2);
                            return;
                        }
                        return;
                    }
                }
                N1 n12 = n1;
                L1 l12 = l1;
                linkedHashMap2.put(str2, new R1(n12, l12));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    l12.a(obj);
                }
                K1 k1 = (K1) EB.w(str2, bundle);
                if (k1 != null) {
                    bundle.remove(str2);
                    l12.a(n12.c(k1.i, k1.h));
                }
            }
        };
        s1.a.a(interfaceC0288Kz);
        s1.b.add(interfaceC0288Kz);
        linkedHashMap.put(str, s1);
        return new U1();
    }

    public void removeMenuProvider(InterfaceC2207xC interfaceC2207xC) {
        AbstractC0048Bt.n(interfaceC2207xC, "provider");
        this.menuHostHelper.b(interfaceC2207xC);
    }

    @Override // o.InterfaceC0829cG
    public final void removeOnConfigurationChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onConfigurationChangedListeners.remove(interfaceC0655Zd);
    }

    public final void removeOnContextAvailableListener(InterfaceC0895dG interfaceC0895dG) {
        AbstractC0048Bt.n(interfaceC0895dG, "listener");
        C1642oe c1642oe = this.contextAwareHelper;
        c1642oe.getClass();
        c1642oe.a.remove(interfaceC0895dG);
    }

    public final void removeOnMultiWindowModeChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onMultiWindowModeChangedListeners.remove(interfaceC0655Zd);
    }

    public final void removeOnNewIntentListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onNewIntentListeners.remove(interfaceC0655Zd);
    }

    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onPictureInPictureModeChangedListeners.remove(interfaceC0655Zd);
    }

    public final void removeOnTrimMemoryListener(InterfaceC0655Zd interfaceC0655Zd) {
        AbstractC0048Bt.n(interfaceC0655Zd, "listener");
        this.onTrimMemoryListeners.remove(interfaceC0655Zd);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        AbstractC0048Bt.n(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ZM.h()) {
                Trace.beginSection(ZM.l("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C1389kp fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.c = true;
                    Iterator it = fullyDrawnReporter.d.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1455lp) it.next()).invoke();
                    }
                    fullyDrawnReporter.d.clear();
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
        initializeViewTreeOwners();
        InterfaceExecutorC0291Lc interfaceExecutorC0291Lc = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0316Mc) interfaceExecutorC0291Lc).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void startActivityForResult(Intent intent, int i) {
        AbstractC0048Bt.n(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        AbstractC0048Bt.n(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC0048Bt.n(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC1315jh
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AbstractC0048Bt.n(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        AbstractC0048Bt.n(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0655Zd> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C1681pD(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        AbstractC0048Bt.n(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0655Zd> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new YH(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0291Lc interfaceExecutorC0291Lc = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0316Mc) interfaceExecutorC0291Lc).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC2207xC interfaceC2207xC, InterfaceC0365Nz interfaceC0365Nz) {
        AbstractC0048Bt.n(interfaceC2207xC, "provider");
        AbstractC0048Bt.n(interfaceC0365Nz, "owner");
        C1088gC c1088gC = this.menuHostHelper;
        c1088gC.b.add(interfaceC2207xC);
        c1088gC.a.run();
        AbstractC0106Dz lifecycle = interfaceC0365Nz.getLifecycle();
        HashMap hashMap = c1088gC.c;
        C1022fC c1022fC = (C1022fC) hashMap.remove(interfaceC2207xC);
        if (c1022fC != null) {
            c1022fC.a.b(c1022fC.b);
            c1022fC.b = null;
        }
        hashMap.put(interfaceC2207xC, new C1022fC(lifecycle, new C0161Gc(c1088gC, 1, interfaceC2207xC)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0291Lc interfaceExecutorC0291Lc = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0316Mc) interfaceExecutorC0291Lc).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC2207xC interfaceC2207xC, InterfaceC0365Nz interfaceC0365Nz, final EnumC0080Cz enumC0080Cz) {
        AbstractC0048Bt.n(interfaceC2207xC, "provider");
        AbstractC0048Bt.n(interfaceC0365Nz, "owner");
        AbstractC0048Bt.n(enumC0080Cz, "state");
        final C1088gC c1088gC = this.menuHostHelper;
        c1088gC.getClass();
        AbstractC0106Dz lifecycle = interfaceC0365Nz.getLifecycle();
        HashMap hashMap = c1088gC.c;
        C1022fC c1022fC = (C1022fC) hashMap.remove(interfaceC2207xC);
        if (c1022fC != null) {
            c1022fC.a.b(c1022fC.b);
            c1022fC.b = null;
        }
        hashMap.put(interfaceC2207xC, new C1022fC(lifecycle, new InterfaceC0288Kz() { // from class: o.eC
            @Override // o.InterfaceC0288Kz
            public final void j(InterfaceC0365Nz interfaceC0365Nz2, EnumC0054Bz enumC0054Bz) {
                C1088gC c1088gC2 = C1088gC.this;
                c1088gC2.getClass();
                Runnable runnable = c1088gC2.a;
                CopyOnWriteArrayList copyOnWriteArrayList = c1088gC2.b;
                EnumC0054Bz.Companion.getClass();
                EnumC0080Cz enumC0080Cz2 = enumC0080Cz;
                int ordinal = enumC0080Cz2.ordinal();
                EnumC0054Bz enumC0054Bz2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0054Bz.ON_RESUME : EnumC0054Bz.ON_START : EnumC0054Bz.ON_CREATE;
                InterfaceC2207xC interfaceC2207xC2 = interfaceC2207xC;
                if (enumC0054Bz == enumC0054Bz2) {
                    copyOnWriteArrayList.add(interfaceC2207xC2);
                    runnable.run();
                } else if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
                    c1088gC2.b(interfaceC2207xC2);
                } else if (enumC0054Bz == C2388zz.a(enumC0080Cz2)) {
                    copyOnWriteArrayList.remove(interfaceC2207xC2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> P1 registerForActivityResult(N1 n1, L1 l1) {
        AbstractC0048Bt.n(n1, "contract");
        AbstractC0048Bt.n(l1, "callback");
        return registerForActivityResult(n1, this.activityResultRegistry, l1);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
