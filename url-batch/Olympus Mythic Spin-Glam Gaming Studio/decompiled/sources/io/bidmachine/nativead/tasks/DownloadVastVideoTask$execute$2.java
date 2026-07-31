package io.bidmachine.nativead.tasks;

import android.net.Uri;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.rendering.Repository;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
final class DownloadVastVideoTask$execute$2 extends SuspendLambda implements Function2 {
    Object a;
    int b;
    final /* synthetic */ DownloadVastVideoTask c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadVastVideoTask$execute$2(DownloadVastVideoTask downloadVastVideoTask, Continuation continuation) {
        super(2, continuation);
        this.c = downloadVastVideoTask;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DownloadVastVideoTask$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadVastVideoTask$execute$2(this.c, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7852getVideoUrld1pmJ48;
        Object obj2;
        Repository repository;
        Object m7854executeIoAF18A;
        Pair pair;
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m7852getVideoUrld1pmJ48 = this.c.m7852getVideoUrld1pmJ48();
            Pair pair2 = (Pair) (Result.m8028isFailureimpl(m7852getVideoUrld1pmJ48) ? null : m7852getVideoUrld1pmJ48);
            if (pair2 == null) {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m7852getVideoUrld1pmJ48);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = new Exception("Unknown error");
                }
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                return Result.m8022boximpl(m8023constructorimpl);
            }
            DownloadVideoTask.OnLoadedListener onLoadedListener = new DownloadVideoTask.OnLoadedListener() { // from class: io.bidmachine.nativead.tasks.DownloadVastVideoTask$execute$2$emptyListener$1
            };
            obj2 = this.c.assetsHolder;
            repository = this.c.repository;
            DownloadVideoTask downloadVideoTask = new DownloadVideoTask(obj2, repository, onLoadedListener, (String) pair2.getFirst(), this.c.dispatchers);
            this.a = pair2;
            this.b = 1;
            m7854executeIoAF18A = downloadVideoTask.m7854executeIoAF18A(this);
            if (m7854executeIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            pair = pair2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (Pair) this.a;
            ResultKt.throwOnFailure(obj);
            m7854executeIoAF18A = ((Result) obj).getValue();
        }
        Uri uri = (Uri) (Result.m8028isFailureimpl(m7854executeIoAF18A) ? null : m7854executeIoAF18A);
        if (uri != null) {
            m8023constructorimpl = Result.m8023constructorimpl(new Pair(uri, pair.getSecond()));
        } else {
            Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m7854executeIoAF18A);
            if (m8026exceptionOrNullimpl2 == null) {
                m8026exceptionOrNullimpl2 = new Exception("Unknown error");
            }
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl2));
        }
        return Result.m8022boximpl(m8023constructorimpl);
    }
}
