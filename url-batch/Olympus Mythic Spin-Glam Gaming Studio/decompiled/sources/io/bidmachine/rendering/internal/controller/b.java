package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.internal.view.f;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.Tag;
import io.bidmachine.util.Utils;
import io.bidmachine.util.cache.MediaFileCacheManager;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class b implements io.bidmachine.rendering.internal.controller.a {
    private final Tag a;
    private final Context b;
    private final AdParams c;
    private final io.bidmachine.rendering.internal.controller.c d;
    private final io.bidmachine.rendering.internal.animation.b e;
    private final io.bidmachine.rendering.internal.state.a f;
    final Queue g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final AtomicBoolean j;
    private final AtomicBoolean k;
    io.bidmachine.rendering.internal.view.f l;
    volatile e m;
    volatile e n;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CacheType.values().length];
            a = iArr;
            try {
                iArr[CacheType.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CacheType.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CacheType.StreamLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class c implements g {
        private final io.bidmachine.rendering.internal.controller.c a;

        public c(io.bidmachine.rendering.internal.controller.c cVar) {
            this.a = cVar;
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(SystemComponent systemComponent) {
            this.a.a(systemComponent);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void b() {
            b.this.s();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void c() {
            b.this.t();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void d() {
            if (!b.this.k()) {
                a();
            } else {
                b.this.y();
                b.this.z();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void e() {
            this.a.e();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void f() {
            this.a.f();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a() {
            b.this.h();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(PrivacySheetParams privacySheetParams) {
            this.a.a(privacySheetParams);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }
    }

    private class d implements f.c {
        private d() {
        }

        @Override // io.bidmachine.rendering.internal.view.f.c
        public void a() {
            b.this.r();
        }

        @Override // io.bidmachine.rendering.internal.view.f.c
        public void onLoaded() {
            b.this.v();
        }

        /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // io.bidmachine.rendering.internal.view.f.c
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            b.this.a(brokenCreativeEvent);
        }
    }

    public b(Context context, AdParams adParams, io.bidmachine.rendering.internal.controller.c cVar, io.bidmachine.rendering.internal.animation.b bVar) {
        Tag tag = new Tag(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a);
        this.a = tag;
        this.f = new io.bidmachine.rendering.internal.state.d(tag.toString());
        this.b = context.getApplicationContext();
        this.c = adParams;
        this.d = cVar;
        this.e = bVar;
        this.g = new ConcurrentLinkedQueue();
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void g(e eVar) {
        eVar.c();
        k(eVar);
    }

    private void k(e eVar) {
        if (this.f.h()) {
            eVar.a(true);
        }
        if (this.f.p()) {
            eVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Utils.ifNotNull(this.m, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda4
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.f((e) obj);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void destroy() {
        k.b(this.a, "destroy", new Object[0]);
        this.e.a();
        b(this.m);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            b((e) it.next());
        }
        a();
        Utils.ifNotNull(this.l, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda2
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((io.bidmachine.rendering.internal.view.f) obj).b();
            }
        });
        this.l = null;
        Utils.ifNotNull(Rendering.getMediaFileCacheManagerProvider(), new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda3
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.a((Function0) obj);
            }
        });
        this.f.destroy();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void e() {
        k.b(this.a, "performHide", new Object[0]);
        Utils.ifNotNull(this.m, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda5
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((e) obj).b(false);
            }
        });
        u();
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void f() {
        k.b(this.a, "onExpanded", new Object[0]);
        Utils.ifNotNull(this.m, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda8
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((e) obj).f();
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public Orientation g() {
        return this.c.getOrientation();
    }

    CacheType i() {
        return this.c.getCacheType();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d(e eVar) {
        k.b(this.a, "removeAndDestroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda6
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.i((e) obj);
            }
        });
        b(eVar);
    }

    boolean l() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        return this.f.a();
    }

    void n() {
        if (this.h.compareAndSet(false, true)) {
            for (e eVar : this.g) {
                k.b(this.a, "loadAdPhase (%s)", eVar);
                eVar.b();
            }
        }
    }

    void o() {
        final AdPhaseParams placeholderParams = this.c.getPlaceholderParams();
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda1
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                b.this.a(placeholderParams);
            }
        });
    }

    void p() {
        if (this.f.n()) {
            this.d.a(this);
        }
    }

    boolean q() {
        if (!this.f.a(true)) {
            return false;
        }
        this.d.b(this);
        return true;
    }

    void r() {
        this.d.h();
    }

    void s() {
        if (this.k.compareAndSet(true, false)) {
            this.d.b();
        }
    }

    void t() {
        if (this.k.compareAndSet(false, true)) {
            this.d.c();
        }
    }

    public String toString() {
        return this.a.toString();
    }

    void u() {
        io.bidmachine.rendering.internal.view.f fVar = this.l;
        if (fVar != null && this.j.compareAndSet(true, false)) {
            fVar.g();
            this.d.b(fVar);
        }
    }

    void v() {
        q();
    }

    void w() {
        io.bidmachine.rendering.internal.view.f fVar = this.l;
        if (fVar != null && this.j.compareAndSet(true, false)) {
            fVar.g();
            this.d.c(fVar);
        }
    }

    void x() {
        io.bidmachine.rendering.internal.view.f fVar = this.l;
        if (fVar != null && this.j.compareAndSet(false, true)) {
            this.d.a(fVar);
            fVar.h();
        }
    }

    void y() {
        if (this.i.compareAndSet(false, true)) {
            this.d.g();
            this.n = this.m;
            e j = j();
            if (j == null) {
                b(this.n, this.n == null ? new Error("No ad phase to show") : null);
            } else {
                if (this.n != j) {
                    i(j);
                    j.a(new c(this.d));
                    this.m = j;
                    this.e.a(j.e(), AnimationEventType.Appear);
                }
                this.d.a(j);
                w();
            }
            this.i.set(false);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void a(final boolean z) {
        k.b(this.a, "onShown (isViewability - %s)", Boolean.valueOf(z));
        Utils.ifNotNull(this.m, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda7
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.a(z, (e) obj);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void b() {
        k.b(this.a, "load (cacheType - %s)", i());
        Queue<AdPhaseParams> adPhaseParamsQueue = this.c.getAdPhaseParamsQueue();
        if (adPhaseParamsQueue.isEmpty()) {
            this.d.a(this, new Error("Ad phase queue is empty"));
            return;
        }
        if (m()) {
            this.d.b(this);
            return;
        }
        if (this.f.b()) {
            for (AdPhaseParams adPhaseParams : adPhaseParamsQueue) {
                Tag tag = new Tag("AdPhaseController");
                a(new h(this.b, adPhaseParams, this.a, tag, new io.bidmachine.rendering.internal.state.c(tag.toString(), io.bidmachine.rendering.internal.f.f()), new C1788b(), this.e));
            }
            int i = a.a[i().ordinal()];
            if (i == 1) {
                n();
                return;
            }
            if (i == 2) {
                o();
                n();
            } else {
                if (i != 3) {
                    return;
                }
                o();
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public boolean c() {
        k.b(this.a, "performShow", new Object[0]);
        this.f.o();
        e eVar = this.m;
        if (eVar == null) {
            x();
            n();
            return false;
        }
        if (!this.f.h()) {
            return true;
        }
        g(eVar);
        return true;
    }

    @Override // io.bidmachine.rendering.internal.controller.a
    public void d() {
        k.b(this.a, "onCollapsed", new Object[0]);
        Utils.ifNotNull(this.m, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda11
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((e) obj).d();
            }
        });
    }

    boolean i(e eVar) {
        return this.g.remove(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        final io.bidmachine.rendering.internal.controller.c cVar = this.d;
        Objects.requireNonNull(cVar);
        j jVar = new j() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                c.this.a();
            }
        };
        e eVar = this.m;
        if (eVar != null) {
            eVar.b(true);
            this.e.a(eVar.e(), AnimationEventType.Disappear, false, (Runnable) null, (Runnable) jVar);
        } else {
            jVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(e eVar) {
        a(eVar, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, e eVar) {
        if (z && this.f.f()) {
            z();
            this.d.c(this);
        }
        if (z) {
            return;
        }
        this.f.k();
    }

    e j() {
        return (e) this.g.peek();
    }

    boolean k() {
        return j() != null;
    }

    /* renamed from: io.bidmachine.rendering.internal.controller.b$b, reason: collision with other inner class name */
    class C1788b implements f {
        C1788b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar) {
            k.b(b.this.a, "onAdPhaseLoaded (%s)", eVar);
            if (b.this.l()) {
                b.this.y();
                b.this.q();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(e eVar, Error error) {
            k.a(b.this.a, "onAdPhaseFailToLoad (%s) - %s", eVar, error);
            b.this.d(eVar);
            if (b.this.m()) {
                if (b.this.f.c()) {
                    b.this.b(eVar, new Error("Fail to load after show (CacheType - " + b.this.i() + ") - " + error));
                    return;
                }
                b.this.p();
                return;
            }
            b.this.a(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Function0 function0) {
        ((MediaFileCacheManager) function0.mo4828invoke()).unholdMediaFiles(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdPhaseParams adPhaseParams) {
        if (this.l != null) {
            return;
        }
        io.bidmachine.rendering.internal.view.f fVar = new io.bidmachine.rendering.internal.view.f(this.b, adPhaseParams, this.e);
        this.l = fVar;
        fVar.setListener(new d(this, null));
        this.l.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final e eVar) {
        j jVar = new j() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda14
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                b.this.d(eVar);
            }
        };
        eVar.b(true);
        this.e.a(eVar.e(), AnimationEventType.Disappear, false, (Runnable) null, (Runnable) jVar);
    }

    private void a(final e eVar, e eVar2) {
        Utils.ifNotNull(eVar2, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda9
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.c((e) obj);
            }
        });
        this.e.a(eVar.e(), AnimationEventType.Appear, false, (Runnable) null, (Runnable) new j() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda10
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                b.this.g(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, Error error) {
        this.d.a(eVar, error);
    }

    boolean a(e eVar) {
        return this.g.add(eVar);
    }

    void a() {
        this.g.clear();
    }

    boolean a(Error error) {
        if (!this.f.a(false)) {
            return false;
        }
        this.d.a(this, error);
        return true;
    }

    void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (this.f.j()) {
            return;
        }
        this.d.a(brokenCreativeEvent);
    }

    void b(e eVar) {
        k.b(this.a, "destroyAdPhaseController (%s)", eVar);
        Utils.ifNotNull(eVar, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda12
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                ((e) obj).destroy();
            }
        });
        if (this.m == eVar) {
            this.m = null;
        }
        if (this.n == eVar) {
            this.n = null;
        }
    }

    void b(final e eVar, Error error) {
        Utils.ifNotNull(error, new Executable() { // from class: io.bidmachine.rendering.internal.controller.b$$ExternalSyntheticLambda13
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                b.this.a(eVar, (Error) obj);
            }
        });
        h();
    }
}
