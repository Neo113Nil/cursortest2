package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3967ec {
    public static void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new C3863ac(runnable, null), 3, null);
    }

    public static Object a(Function0 run) {
        Semaphore semaphore;
        Intrinsics.checkNotNullParameter(run, "run");
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                try {
                    semaphore = AbstractC3995fc.b;
                    semaphore.acquire();
                    run.mo4828invoke();
                } catch (Throwable th) {
                    AbstractC3995fc.b.release();
                    throw th;
                }
            } catch (Exception e) {
                Lazy lazy = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(e));
                semaphore = AbstractC3995fc.b;
            }
            semaphore.release();
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static String a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j + ".txt";
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + "/logging";
    }
}
