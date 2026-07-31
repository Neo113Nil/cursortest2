package com.inmobi.media;

import android.content.Context;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes11.dex */
public final class B0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final HashMap c = new HashMap();
    public final A0 d = new A0(this);

    public B0() {
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.B0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                B0.a(B0.this);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final Unit b(B0 b0) {
        b0.a.set(true);
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C4510z0(b0, (AdConfig) AbstractC4015g4.a.a(AdConfig.class), null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void a(B0 b0) {
        I0 i0 = (I0) F0.a.getValue();
        A0 listener = b0.d;
        i0.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        i0.b = new WeakReference(listener);
    }

    public final void a() {
        AbstractC3928d.a(new Function0() { // from class: com.inmobi.media.B0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return B0.b(B0.this);
            }
        });
    }

    public static void a(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new C4484y0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            new File(result.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}
