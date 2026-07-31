package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4272q {
    public static AudioManager b;
    public static C4114k c;
    public static Job f;
    public static Function1 i;
    public static final C4272q a = new C4272q();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicReference e = new AtomicReference(null);
    public static final CoroutineScope g = L9.d;
    public static final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public static final Unit a(long j, N2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 101) {
            if (i2 == 102) {
                Job job = f;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                f = null;
            }
        } else if (f == null && d.get()) {
            f = N3.a(g, 0L, j, new C4220o(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        try {
            F5.a.getClass();
            if (F5.y()) {
                AudioManager audioManager = b;
                if (audioManager != null && audioManager.isStreamMute(3)) {
                }
                return !AbstractC4002fj.f;
            }
            AudioManager audioManager2 = b;
            if (audioManager2 != null && audioManager2.getStreamVolume(3) == 0) {
            }
            if (!AbstractC4002fj.f) {
            }
        } catch (Throwable unused) {
            return AbstractC4002fj.f;
        }
    }

    public static void a(final long j) {
        Function1 function1 = new Function1() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4272q.a(j, (N2) obj);
            }
        };
        i = function1;
        ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final InterfaceC4466x9 interfaceC4466x9) {
        final Context context = AbstractC4002fj.a;
        if (context == null) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getMraid3().getMuteChangeInterval();
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(P3.a(new Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4272q.a(InterfaceC4466x9.this, context, muteChangeInterval);
            }
        }));
        if (m8026exceptionOrNullimpl != null) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("AdAudioTracker", "Error starting audio volume tracking - " + m8026exceptionOrNullimpl.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC4466x9 interfaceC4466x9, Context context, long j) {
        Job launch$default;
        if (d.compareAndSet(false, true)) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(g, null, null, new C4246p(interfaceC4466x9, context, j, null), 3, null);
            return launch$default;
        }
        if (interfaceC4466x9 == null) {
            return null;
        }
        ((C4493y9) interfaceC4466x9).c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.INSTANCE;
    }

    public static void a(final Context context, InterfaceC4466x9 interfaceC4466x9) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(P3.a(new Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4272q.a(context);
            }
        }));
        if (m8026exceptionOrNullimpl == null || interfaceC4466x9 == null) {
            return;
        }
        ((C4493y9) interfaceC4466x9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + m8026exceptionOrNullimpl.getMessage());
    }

    public static final Unit a(final Context context) {
        final C4114k c4114k = c;
        if (c4114k != null) {
            P3.a(new Function0() { // from class: com.inmobi.media.q$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return C4272q.a(context, c4114k);
                }
            });
            c = null;
        }
        Job job = f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Function1 function1 = i;
        if (function1 != null) {
            ((Kc) AbstractC4002fj.e.getValue()).a(function1);
        }
        i = null;
        f = null;
        return Unit.INSTANCE;
    }

    public static final Unit a(Context context, C4114k c4114k) {
        context.unregisterReceiver(c4114k);
        return Unit.INSTANCE;
    }

    public final synchronized float a() {
        try {
            boolean b2 = b();
            AudioManager audioManager = b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (b2) {
                return 0.0f;
            }
            if (streamVolume < 0) {
                return 0.0f;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void a(Float f2) {
        if (Intrinsics.areEqual((Float) e.getAndSet(f2), f2)) {
            return;
        }
        Iterator it = h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC4088j interfaceC4088j = (InterfaceC4088j) ((WeakReference) it.next()).get();
            if (interfaceC4088j != null) {
                ((C4029gi) interfaceC4088j).a(f2 != null ? Float.valueOf(N3.a(f2.floatValue() * 100.0f)) : null);
            }
        }
    }
}
