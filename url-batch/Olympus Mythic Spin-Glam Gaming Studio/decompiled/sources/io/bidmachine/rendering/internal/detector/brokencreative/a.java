package io.bidmachine.rendering.internal.detector.brokencreative;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmResult;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.StopDetectorAfter;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.taskmanager.CancelableTask;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.handler.HandlerTaskManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes12.dex */
public final class a {
    private final int a;
    private final String b;
    private final BrokenCreativeDetectorParams c;
    private final io.bidmachine.rendering.internal.detector.brokencreative.b d;
    private final Lazy e;
    private final List f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final Object j;
    private volatile long k;
    private b l;

    /* renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$a, reason: collision with other inner class name */
    private static final class C1794a extends CancelableTask {
        private final io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a a;
        private final Bitmap b;
        private final Function2 c;

        public C1794a(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a algorithm, Bitmap image, Function2 callback) {
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a = algorithm;
            this.b = image;
            this.c = callback;
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            long currentTimeMillis = System.currentTimeMillis();
            Boolean b = this.a.b(this.b);
            if (b != null) {
                this.c.invoke(this, new BrokenCreativeAlgorithmResult(b.booleanValue(), this.a.a(), System.currentTimeMillis() - currentTimeMillis));
            } else {
                this.c.invoke(this, null);
            }
        }
    }

    private static final class b extends CancelableTask {
        private final Handler a;
        private final double b;
        private final List c;
        private final Function1 d;
        private final CoroutineTaskManager e;
        private final WeakReference f;
        private final List g;
        private final List h;

        /* renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$a, reason: collision with other inner class name */
        private final class C1795a implements io.bidmachine.rendering.internal.screenshot.b {
            public C1795a() {
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                b.this.a(bitmap);
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a() {
                b.this.c();
            }
        }

        /* renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$b, reason: collision with other inner class name */
        static final class C1796b extends Lambda implements Function2 {
            C1796b() {
                super(2);
            }

            public final void a(C1794a algorithmTask, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
                Intrinsics.checkNotNullParameter(algorithmTask, "algorithmTask");
                b.this.a(algorithmTask, brokenCreativeAlgorithmResult);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1794a) obj, (BrokenCreativeAlgorithmResult) obj2);
                return Unit.INSTANCE;
            }
        }

        public b(View view, Handler screenshotCallbackHandler, double d, List algorithms, Function1 callback) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(screenshotCallbackHandler, "screenshotCallbackHandler");
            Intrinsics.checkNotNullParameter(algorithms, "algorithms");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a = screenshotCallbackHandler;
            this.b = d;
            this.c = algorithms;
            this.d = callback;
            this.e = new CoroutineTaskManager(CoroutineScopeKt.CoroutineScope(new CoroutineName("DetectorTaskManager").plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(Dispatchers.getDefault())));
            this.f = new WeakReference(view);
            this.g = new CopyOnWriteArrayList();
            this.h = new CopyOnWriteArrayList();
        }

        private final void b() {
            if (a()) {
                this.d.invoke(this.h);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            b();
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            View view = (View) this.f.get();
            if (view == null) {
                return;
            }
            io.bidmachine.rendering.internal.screenshot.a.a.a(view, this.a, Bitmap.Config.ARGB_8888, new C1795a());
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask, io.bidmachine.util.Cancelable
        public void setCancel(boolean z) {
            super.setCancel(z);
            if (z) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    this.e.cancel((C1794a) it.next());
                }
                this.g.clear();
            }
        }

        private final boolean a() {
            return !isCanceled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Bitmap bitmap) {
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            Bitmap createDownscaledBitmapSafely = ImageUtilsKt.createDownscaledBitmapSafely(bitmap, this.b);
            if (!Intrinsics.areEqual(createDownscaledBitmapSafely, bitmap)) {
                ImageUtilsKt.recycleSafely(bitmap);
            }
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            List list = this.c;
            ArrayList<C1794a> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1794a((io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a) it.next(), createDownscaledBitmapSafely, new C1796b()));
            }
            this.g.addAll(arrayList);
            for (C1794a c1794a : arrayList) {
                if (!this.e.executeSafely(c1794a)) {
                    a(c1794a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(C1794a c1794a, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
            if (brokenCreativeAlgorithmResult != null) {
                this.h.add(brokenCreativeAlgorithmResult);
            }
            a(c1794a);
        }

        private final void a(C1794a c1794a) {
            this.g.remove(c1794a);
            if (this.g.isEmpty()) {
                b();
            }
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerTaskManager mo4828invoke() {
            HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
            handlerThread.start();
            return new HandlerTaskManager(new Handler(handlerThread.getLooper()));
        }
    }

    static final class d extends Lambda implements Function1 {
        d() {
            super(1);
        }

        public final void a(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a.this.a(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.INSTANCE;
        }
    }

    public a(int i, String adElementName, BrokenCreativeDetectorParams brokenCreativeDetectorParams, io.bidmachine.rendering.internal.detector.brokencreative.b brokenCreativeDetectorListener) {
        Intrinsics.checkNotNullParameter(adElementName, "adElementName");
        Intrinsics.checkNotNullParameter(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        Intrinsics.checkNotNullParameter(brokenCreativeDetectorListener, "brokenCreativeDetectorListener");
        this.a = i;
        this.b = adElementName;
        this.c = brokenCreativeDetectorParams;
        this.d = brokenCreativeDetectorListener;
        this.e = LazyKt.lazy(c.a);
        this.f = new CopyOnWriteArrayList();
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new Object();
    }

    private final void b() {
        synchronized (this.j) {
            b bVar = this.l;
            if (bVar != null) {
                d().cancel(bVar);
            }
        }
    }

    private final HandlerTaskManager d() {
        return (HandlerTaskManager) this.e.getValue();
    }

    private final boolean e() {
        return this.h.get();
    }

    private final boolean f() {
        return this.g.get();
    }

    private final boolean g() {
        return this.i.get();
    }

    private final void h() {
        synchronized (this.j) {
            b();
            if (a()) {
                b bVar = this.l;
                if (bVar != null) {
                    d().scheduleSafely(bVar, this.c.getTimeout());
                }
            }
        }
    }

    public final void c() {
        this.h.set(true);
        i();
    }

    public final void i() {
        synchronized (this.j) {
            this.g.set(false);
            b();
            this.l = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (g() || e()) {
            return;
        }
        synchronized (this.j) {
            try {
                if (this.g.compareAndSet(false, true)) {
                    List<BrokenCreativeAlgorithmParams> algorithms = this.c.getAlgorithms();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(algorithms, 10));
                    Iterator<T> it = algorithms.iterator();
                    while (it.hasNext()) {
                        arrayList.add(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.b.a.a((BrokenCreativeAlgorithmParams) it.next()));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    this.k = System.currentTimeMillis();
                    this.l = new b(view, d().getHandler(), this.c.getDownscaleFactor(), arrayList, new d());
                    h();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean a() {
        return (!f() || g() || e()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List list) {
        if (a()) {
            Iterator it = list.iterator();
            double d2 = 0.0d;
            double d3 = 0.0d;
            while (it.hasNext()) {
                BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult = (BrokenCreativeAlgorithmResult) it.next();
                float weight = brokenCreativeAlgorithmResult.getAlgorithmParams().getWeight();
                if (brokenCreativeAlgorithmResult.getIsBroken()) {
                    d3 += weight;
                }
                d2 += weight;
            }
            boolean z = (d2 != 0.0d ? d3 / d2 : 0.0d) >= this.c.getWeightThreshold();
            if (!this.c.getIsErrorOnly() || z) {
                BrokenCreativeEvent brokenCreativeEvent = new BrokenCreativeEvent(io.bidmachine.rendering.internal.detector.brokencreative.c.a.a(z), this.a, this.b, System.currentTimeMillis() - this.k, list);
                if (this.c.getIsAllowDuplicate() || !this.f.contains(brokenCreativeEvent)) {
                    this.f.add(brokenCreativeEvent);
                    a(brokenCreativeEvent);
                }
            }
            StopDetectorAfter stopAfter = this.c.getStopAfter();
            if ((stopAfter == StopDetectorAfter.ValidCreative && z) || ((stopAfter == StopDetectorAfter.BrokenCreative && !z) || stopAfter == StopDetectorAfter.Never)) {
                h();
            } else {
                this.i.set(true);
            }
        }
    }

    private final void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (a()) {
            k.b("BrokenCreativeDetector", "Notify detector result: %s", brokenCreativeEvent);
            this.d.a(brokenCreativeEvent);
        }
    }
}
