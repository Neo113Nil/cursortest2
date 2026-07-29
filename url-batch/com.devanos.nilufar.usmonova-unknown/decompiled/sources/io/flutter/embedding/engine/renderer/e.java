package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import o.AV;
import o.C0586Wm;
import o.InterfaceC2244xn;

/* loaded from: classes.dex */
public final class e {
    public final FlutterJNI a;
    public Surface b;
    public boolean c;
    public final Handler d;
    public final HashSet e;
    public final ArrayList f;
    public final C0586Wm g;

    public e(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.c = false;
        this.d = new Handler();
        this.e = new HashSet();
        this.f = new ArrayList();
        C0586Wm c0586Wm = new C0586Wm(1, this);
        this.g = c0586Wm;
        this.a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0586Wm);
    }

    public final void a(InterfaceC2244xn interfaceC2244xn) {
        this.a.addIsDisplayingFlutterUiListener(interfaceC2244xn);
        if (this.c) {
            interfaceC2244xn.b();
        }
    }

    public final void b(int i) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            AV av = (AV) ((WeakReference) it.next()).get();
            if (av != null) {
                av.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    public final void c(InterfaceC2244xn interfaceC2244xn) {
        this.a.removeIsDisplayingFlutterUiListener(interfaceC2244xn);
    }

    public final void d() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.b != null) {
            this.a.onSurfaceDestroyed();
            if (this.c) {
                this.g.a();
            }
            this.c = false;
            this.b = null;
        }
    }
}
