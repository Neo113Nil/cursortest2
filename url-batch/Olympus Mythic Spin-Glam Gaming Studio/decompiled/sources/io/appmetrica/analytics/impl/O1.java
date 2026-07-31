package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes8.dex */
public final class O1 implements C1, InterfaceC5709u0 {
    public boolean a;
    public final Context b;
    public final B1 c;
    public final C5635r4 d;
    public final W1 e;
    public C5234bh f;
    public final Ba g;
    public final C5685t2 h;
    public final P1 i;
    public final C5623qh j;

    @MainThread
    public O1(@NonNull Context context, @NonNull B1 b1) {
        this(context, b1, new C5688t5(context));
    }

    public static void e(Intent intent) {
        Qo qo = Ka.I.D().c.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
    }

    public final void a() {
        this.e.c(new V1() { // from class: io.appmetrica.analytics.impl.O1$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.V1
            public final void a(Intent intent) {
                O1.this.d(intent);
            }
        });
        this.e.a(new V1() { // from class: io.appmetrica.analytics.impl.O1$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.V1
            public final void a(Intent intent) {
                O1.e(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void b(Intent intent) {
        this.e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void c(Intent intent) {
        W1 w1 = this.e;
        if (intent == null) {
            w1.getClass();
            return;
        }
        w1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            w1.a.a(action, Integer.valueOf(W1.a(intent)));
        }
        for (Map.Entry entry : w1.b.entrySet()) {
            V1 v1 = (V1) entry.getKey();
            if (((U1) entry.getValue()).a(intent)) {
                v1.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        Ka.I.v().a(Cb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        Ka.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void onCreate() {
        if (this.a) {
            Ka.I.v().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            Ka ka = Ka.I;
            synchronized (ka) {
                ka.B.initAsync();
                ka.u.a(ka.a);
                ka.u.a(new Bo(ka.B));
                NetworkServiceLocator.init(ka.a, new C5740v5(new Ci(ka.h()), new F5(ka.a)));
                ka.l().a(ka.q);
                ka.E();
            }
            AbstractC5547nk.a.e();
            C5835ym c5835ym = Ka.I.u;
            c5835ym.a();
            C5783wm a = c5835ym.a();
            Ok p = Ka.I.p();
            p.a(new C5703tk(new C5722ud(this.e)), a);
            c5835ym.a(p);
            ((Rl) Ka.I.z()).getClass();
            a();
            Ka.I.m().init();
            Ka.I.c().init();
            P1 p1 = this.i;
            Context context = this.b;
            C5635r4 c5635r4 = this.d;
            p1.getClass();
            this.f = new C5234bh(context, c5635r4);
            Context context2 = this.b;
            AbstractC5762w1.a.c(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.b;
            C5234bh c5234bh = this.f;
            C5412ie r = Ka.k().r();
            IHandlerExecutor f = Ka.k().w().f();
            C5767w6 c5767w6 = new C5767w6(context3, c5234bh, EnumC5798xb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Z(), new BlockingExecutor(), "previous", new C5693ta());
            C5767w6 c5767w62 = new C5767w6(context3, c5234bh, EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Ib(), f, "actual", new C5693ta());
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC5715u6 fileObserverC5715u6 = new FileObserverC5715u6(crashesDirectory, c5767w62, new C5771wa());
                f.execute(new RunnableC5595pg(crashesDirectory, c5767w6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC5715u6.startWatching();
                Ka.I.E.storeReference(fileObserverC5715u6);
            }
            r.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r.a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r.a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    C5283de b = r.b.b(context3, c5234bh);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b.newCrash((NativeCrash) it.next());
                    }
                }
                r.a.setDefaultCrashHandler(r.b.a(context3, c5234bh));
            }
            new Y5(CollectionsKt.listOf(new RunnableC5414ih())).run();
            this.a = true;
        }
        Ka.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.C1
    @MainThread
    public final void onDestroy() {
        C5229bc l = Ka.I.l();
        synchronized (l) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                ((Ck) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Wf wf;
        bundle.setClassLoader(Wf.class.getClassLoader());
        String str = Wf.c;
        try {
            wf = (Wf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            wf = null;
        }
        Integer asInteger = wf != null ? wf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void reportData(int i, Bundle bundle) {
        this.j.getClass();
        List list = (List) Ka.I.v.a.get(Integer.valueOf(i));
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5729uk) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Wf wf;
        bundle.setClassLoader(Wf.class.getClassLoader());
        String str = Wf.c;
        try {
            wf = (Wf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            wf = null;
        }
        Integer asInteger = wf != null ? wf.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.c(asInteger.intValue());
        }
    }

    public O1(Context context, B1 b1, C5688t5 c5688t5) {
        this(context, b1, new C5635r4(context, c5688t5), new W1(), Ba.d, Ka.k().e(), new P1());
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void a(Intent intent) {
        W1 w1 = this.e;
        if (intent != null) {
            w1.getClass();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                w1.a.a(action, Integer.valueOf(W1.a(intent)));
            }
            for (Map.Entry entry : w1.b.entrySet()) {
                V1 v1 = (V1) entry.getKey();
                if (((U1) entry.getValue()).a(intent)) {
                    v1.a(intent);
                }
            }
            return;
        }
        w1.getClass();
    }

    public O1(Context context, B1 b1, C5635r4 c5635r4, W1 w1, Ba ba, C5685t2 c5685t2, P1 p1) {
        this.a = false;
        this.b = context;
        this.c = b1;
        this.d = c5635r4;
        this.e = w1;
        this.g = ba;
        this.h = c5685t2;
        this.i = p1;
        this.j = new C5623qh();
    }

    @WorkerThread
    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C5326f6.b(bundle);
        C5234bh c5234bh = this.f;
        if (c5234bh != null) {
            c5234bh.a(C5326f6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void a(Intent intent, int i) {
        ((C5761w0) this.c).a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.C1
    @WorkerThread
    public final void a(Intent intent, int i, int i2) {
        ((C5761w0) this.c).a.stopSelf(i2);
    }
}
