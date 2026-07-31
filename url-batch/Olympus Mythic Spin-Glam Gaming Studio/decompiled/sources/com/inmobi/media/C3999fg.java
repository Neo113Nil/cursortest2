package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3999fg implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:11:0x004a, B:13:0x004e, B:15:0x0057, B:19:0x006b, B:21:0x0079, B:22:0x0082, B:24:0x0092, B:25:0x0095, B:17:0x0074), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Activity activity, ContinuationImpl continuationImpl) {
        C3945dg c3945dg;
        int i;
        Mutex mutex;
        WeakReference weakReference;
        try {
            if (continuationImpl instanceof C3945dg) {
                c3945dg = (C3945dg) continuationImpl;
                int i2 = c3945dg.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3945dg.e = i2 - Integer.MIN_VALUE;
                    Object obj = c3945dg.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3945dg.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = C4027gg.b;
                        c3945dg.a = activity;
                        c3945dg.b = mutex;
                        c3945dg.e = 1;
                        if (mutex.lock(null, c3945dg) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = c3945dg.b;
                        Activity activity2 = c3945dg.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        activity = activity2;
                    }
                    if (C4027gg.a != null) {
                        int size = C4027gg.c.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                weakReference = null;
                                break;
                            }
                            ArrayList arrayList = C4027gg.c;
                            if (Intrinsics.areEqual((Context) ((WeakReference) arrayList.get(i3)).get(), activity)) {
                                weakReference = (WeakReference) arrayList.get(i3);
                                break;
                            }
                            i3++;
                        }
                        if (weakReference != null) {
                            Boxing.boxBoolean(C4027gg.c.remove(weakReference));
                        }
                        ArrayList arrayList2 = C4027gg.c;
                        CollectionsKt.removeAll((List) arrayList2, new Function1() { // from class: com.inmobi.media.fg$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(C3999fg.a((WeakReference) obj2));
                            }
                        });
                        if (arrayList2.isEmpty()) {
                            a(activity);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (C4027gg.a != null) {
            }
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        c3945dg = new C3945dg(this, continuationImpl);
        Object obj2 = c3945dg.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3945dg.e;
        if (i != 0) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C3971eg(this, activity, null), 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public static final boolean a(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public final void a(Activity activity) {
        Picasso picasso = C4027gg.a;
        Intrinsics.checkNotNullExpressionValue("gg", "access$getTAG$p(...)");
        Objects.toString(C4027gg.a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = C4027gg.a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        C4027gg.a = null;
    }
}
