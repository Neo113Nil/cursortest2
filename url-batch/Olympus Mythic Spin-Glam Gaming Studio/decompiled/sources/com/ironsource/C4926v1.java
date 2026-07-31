package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4926v1 {

    /* renamed from: com.ironsource.v1$a */
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ Continuation a;

        a(Continuation continuation) {
            this.a = continuation;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(error)));
        }

        public void onResult(@Nullable Object obj) {
            Continuation continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }

    @RequiresApi
    @NotNull
    public static final OutcomeReceiver a(@NotNull Continuation continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new a(continuation);
    }
}
