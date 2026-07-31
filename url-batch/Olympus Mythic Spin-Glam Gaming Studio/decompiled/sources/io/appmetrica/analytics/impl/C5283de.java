package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5283de implements NativeCrashHandler {
    public final Function1 a;
    public final IHandlerExecutor b = Ka.k().w().f();
    public final C5360ge c;

    public C5283de(@NotNull Context context, @NotNull C5234bh c5234bh, @NotNull Function1 function1, @NotNull InterfaceC5515me interfaceC5515me, @NotNull EnumC5798xb enumC5798xb, @NotNull String str, @NotNull InterfaceC5437je interfaceC5437je) {
        this.a = function1;
        this.c = new C5360ge(context, c5234bh, interfaceC5515me, enumC5798xb, interfaceC5437je);
    }

    public static final void a(C5283de c5283de, NativeCrash nativeCrash, File file) {
        c5283de.a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        I0 i0;
        C5745va c5745va;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            J0 a = K0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(a);
            i0 = new I0(source, handlerVersion, str, dumpFile, creationTime, a);
        } catch (Throwable unused) {
            i0 = null;
        }
        if (i0 == null) {
            this.a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(i0.f.a).info("Detected native crash with uuid = " + i0.c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.b;
        C5360ge c5360ge = this.c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.de$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C5283de.a(C5283de.this, nativeCrash, (File) obj);
            }
        };
        c5360ge.getClass();
        Zd zd = new Zd(new C5231be(i0.a, i0.b), c5360ge.g);
        Wd wd = new Wd(c5360ge.b, i0.f, new C5334fe(i0, c5360ge.d, c5360ge.e));
        C5771wa c5771wa = c5360ge.f;
        String str2 = i0.d;
        c5771wa.getClass();
        File file = new File(str2);
        Context context = c5360ge.a;
        if (C5745va.c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C5745va.class)) {
                try {
                    if (C5745va.c == null) {
                        C5745va.c = new C5745va(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C5745va c5745va2 = C5745va.c;
        if (c5745va2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c5745va = null;
        } else {
            c5745va = c5745va2;
        }
        iHandlerExecutor.execute(new RunnableC5569og(file, zd, consumer, wd, c5745va, c5360ge.c.a(i0)));
    }
}
