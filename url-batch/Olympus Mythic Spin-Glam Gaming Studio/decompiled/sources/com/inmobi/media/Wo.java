package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Wo implements Ro {
    public static final WeakHashMap g = new WeakHashMap();
    public final To a;
    public final InterfaceC4466x9 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public Tf f;

    public Wo(Activity activity, To windowInsetListener, InterfaceC4466x9 interfaceC4466x9) {
        Window window;
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        this.a = windowInsetListener;
        this.b = interfaceC4466x9;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        F5.a.getClass();
        if (!F5.w()) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object obj = weakHashMap.get(decorView);
            if (obj == null) {
                obj = new So(decorView);
                weakHashMap.put(decorView, obj);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            ((So) obj).a.add(this);
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.e.get();
            if (!this.a.a()) {
                InterfaceC4466x9 interfaceC4466x9 = this.b;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC4466x9 interfaceC4466x92 = this.b;
                if (interfaceC4466x92 != null) {
                    ((C4493y9) interfaceC4466x92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            Uo b = N3.a(activity) ? Oi.b(windowInsets) : Oi.a(windowInsets);
            Integer f = R5.f();
            int intValue = f != null ? f.intValue() : R5.a(windowInsets);
            R5.a(Integer.valueOf(intValue));
            a(b, intValue);
        } catch (Error e) {
            InterfaceC4466x9 interfaceC4466x93 = this.b;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).b("WindowInsetsHandler", "Error in getting safeArea " + e.getMessage());
            }
        } catch (Exception e2) {
            InterfaceC4466x9 interfaceC4466x94 = this.b;
            if (interfaceC4466x94 != null) {
                ((C4493y9) interfaceC4466x94).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a(Uo insets, int i) {
        Tf orientation = Uf.a(R5.g());
        Vo vo = (Vo) this.d.get(Integer.valueOf(i));
        if (vo == null) {
            vo = new Vo();
            this.d.put(Integer.valueOf(i), vo);
        }
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Uo uo = (Uo) vo.a.get(orientation);
        if (uo != null && Intrinsics.areEqual(insets, uo)) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        } else {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(insets, "insets");
            vo.a.put(orientation, insets);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Vo) entry.getValue()).a());
            }
            R5.a(linkedHashMap);
        }
        if (this.f != orientation) {
            this.f = orientation;
            To to = this.a;
            Object obj = this.d.get(Integer.valueOf(i));
            Intrinsics.checkNotNull(obj);
            to.a(orientation, (Vo) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wo(GestureDetectorOnGestureListenerC4476xi view, To windowInsetListener, InterfaceC4466x9 interfaceC4466x9) {
        this((Activity) null, windowInsetListener, interfaceC4466x9);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetListener, "windowInsetListener");
        F5.a.getClass();
        if (!F5.w()) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = view;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = g;
        Object obj = weakHashMap.get(view);
        if (obj == null) {
            obj = new So(view);
            weakHashMap.put(view, obj);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((So) obj).a.add(this);
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            So so = (So) weakHashMap.get(view);
            if (so != null) {
                Intrinsics.checkNotNullParameter(this, "listener");
                so.a.remove(this);
                if (so.a.isEmpty()) {
                    so.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
