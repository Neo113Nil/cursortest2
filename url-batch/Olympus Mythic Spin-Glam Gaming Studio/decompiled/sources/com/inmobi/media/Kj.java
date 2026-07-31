package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes12.dex */
public final class Kj extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3897bk b;
    public final /* synthetic */ Mj c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Bitmap.Config e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kj(C3897bk c3897bk, Mj mj, String str, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.b = c3897bk;
        this.c = mj;
        this.d = str;
        this.e = config;
    }

    public static final void a(C3897bk c3897bk, Bitmap bitmap) {
        c3897bk.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Kj kj = new Kj(this.b, this.c, this.d, this.e, continuation);
        kj.a = obj;
        return kj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Kj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        C4493y9 c4493y9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Mj mj = this.c;
        String str = this.d;
        Bitmap.Config config = this.e;
        try {
            Result.Companion companion = Result.INSTANCE;
            Picasso picasso = C4027gg.a;
            m8023constructorimpl = Result.m8023constructorimpl(C4027gg.b(mj.a).load(str).tag(mj.c).transform(new C3893bg(config)).get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Mj mj2 = this.c;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && (c4493y9 = mj2.b) != null) {
            c4493y9.b("StaticCompanionLoader", "Companion Load Exception: " + m8026exceptionOrNullimpl.getMessage());
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        final Bitmap bitmap = (Bitmap) m8023constructorimpl;
        if (bitmap == null) {
            throw new C4259pc("Companion Load Error");
        }
        final C3897bk c3897bk = this.b;
        return Boxing.boxBoolean(c3897bk.post(new Runnable() { // from class: com.inmobi.media.Kj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Kj.a(C3897bk.this, bitmap);
            }
        }));
    }
}
