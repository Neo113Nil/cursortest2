package o;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: o.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183hf implements InterfaceC1412l8 {
    public long h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public final Object m;

    public C1183hf() {
        this.h = -1L;
        this.m = new C1042fW(this);
        this.j = new ArrayList();
    }

    @Override // o.InterfaceC1412l8
    public void R(String str, InterfaceC1280j8 interfaceC1280j8) {
        ((Y1) this.m).R(str, interfaceC1280j8);
    }

    public void a() {
        if (this.i) {
            Iterator it = ((ArrayList) this.j).iterator();
            while (it.hasNext()) {
                ((C0942e00) it.next()).b();
            }
            this.i = false;
        }
    }

    public void b(C1117gf c1117gf, List list) {
        if (this.i) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC1568nW.c("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c1117gf);
            ((FlutterJNI) this.j).runBundleAndSnapshotFromLibrary(c1117gf.a, c1117gf.c, c1117gf.b, (AssetManager) this.k, list, this.h);
            this.i = true;
            Trace.endSection();
        } finally {
        }
    }

    public void c() {
        View view;
        if (this.i) {
            return;
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            C0942e00 c0942e00 = (C0942e00) it.next();
            long j = this.h;
            if (j >= 0) {
                c0942e00.c(j);
            }
            Interpolator interpolator = (Interpolator) this.k;
            if (interpolator != null && (view = (View) c0942e00.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((InterfaceC1008f00) this.l) != null) {
                c0942e00.d((C1042fW) this.m);
            }
            View view2 = (View) c0942e00.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.i = true;
    }

    @Override // o.InterfaceC1412l8
    public void g(String str, ByteBuffer byteBuffer, InterfaceC1346k8 interfaceC1346k8) {
        ((Y1) this.m).g(str, byteBuffer, interfaceC1346k8);
    }

    public C1183hf(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.i = false;
        C1097gL c1097gL = new C1097gL(this, 26);
        this.j = flutterJNI;
        this.k = assetManager;
        this.h = j;
        C1577nf c1577nf = new C1577nf(flutterJNI);
        this.l = c1577nf;
        c1577nf.b("flutter/isolate", c1097gL);
        this.m = new Y1(18, c1577nf);
        if (flutterJNI.isAttached()) {
            this.i = true;
        }
    }
}
