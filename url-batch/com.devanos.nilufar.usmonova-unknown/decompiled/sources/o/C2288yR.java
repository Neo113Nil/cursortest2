package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.AbstractC0048Bt;
import o.C0950e6;
import o.C1470m10;
import o.C2024uR;
import o.C2288yR;

/* renamed from: o.yR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2288yR implements InterfaceC1385kl {
    public final SidecarInterface a;
    public final C2024uR b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public C0950e6 e;

    public C2288yR(Context context) {
        AbstractC0048Bt.n(context, "context");
        SidecarInterface a = AbstractC2156wR.a(context);
        C2024uR c2024uR = new C2024uR();
        this.a = a;
        this.b = c2024uR;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final C1470m10 a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C1470m10(C1318jk.h);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.d(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.d;
        InterfaceC0655Zd interfaceC0655Zd = (InterfaceC0655Zd) linkedHashMap.get(activity);
        if (interfaceC0655Zd != null) {
            if (activity instanceof InterfaceC0829cG) {
                ((InterfaceC0829cG) activity).removeOnConfigurationChangedListener(interfaceC0655Zd);
            }
            linkedHashMap.remove(activity);
        }
        C0950e6 c0950e6 = this.e;
        if (c0950e6 != null) {
            ReentrantLock reentrantLock = (ReentrantLock) c0950e6.j;
            reentrantLock.lock();
            try {
                ((WeakHashMap) c0950e6.k).put(activity, null);
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C0950e6 c0950e6 = this.e;
        if (c0950e6 != null) {
            c0950e6.J(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof InterfaceC0829cG)) {
            InterfaceC0655Zd interfaceC0655Zd = new InterfaceC0655Zd() { // from class: o.vR
                @Override // o.InterfaceC0655Zd
                public final void accept(Object obj) {
                    C2288yR c2288yR = C2288yR.this;
                    AbstractC0048Bt.n(c2288yR, "this$0");
                    Activity activity2 = activity;
                    AbstractC0048Bt.n(activity2, "$activity");
                    C0950e6 c0950e62 = c2288yR.e;
                    if (c0950e62 != null) {
                        c0950e62.J(activity2, c2288yR.a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, interfaceC0655Zd);
            ((InterfaceC0829cG) activity).addOnConfigurationChangedListener(interfaceC0655Zd);
        }
    }

    public final void d(C1818rJ c1818rJ) {
        this.e = new C0950e6(c1818rJ);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    AbstractC0048Bt.n(newDeviceState, "newDeviceState");
                    Collection<Activity> values = C2288yR.this.c.values();
                    C2288yR c2288yR = C2288yR.this;
                    for (Activity activity : values) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = c2288yR.a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        C0950e6 c0950e6 = c2288yR.e;
                        if (c0950e6 != null) {
                            c0950e6.J(activity, c2288yR.b.d(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    AbstractC0048Bt.n(windowToken, "windowToken");
                    AbstractC0048Bt.n(newLayout, "newLayout");
                    Activity activity = (Activity) C2288yR.this.c.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    C2288yR c2288yR = C2288yR.this;
                    C2024uR c2024uR = c2288yR.b;
                    SidecarInterface sidecarInterface2 = c2288yR.a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    C1470m10 d = c2024uR.d(newLayout, sidecarDeviceState);
                    C0950e6 c0950e6 = C2288yR.this.e;
                    if (c0950e6 != null) {
                        c0950e6.J(activity, d);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!AbstractC0048Bt.h(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!AbstractC0048Bt.h(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!AbstractC0048Bt.h(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!AbstractC0048Bt.h(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            AbstractC0048Bt.m(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                AbstractC0048Bt.l(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (arrayList.equals((List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
