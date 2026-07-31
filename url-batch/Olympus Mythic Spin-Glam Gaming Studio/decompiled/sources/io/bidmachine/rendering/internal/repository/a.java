package io.bidmachine.rendering.internal.repository;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.model.Base64MediaSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.UrlMediaSource;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.util.ImageUtils;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes11.dex */
public final class a implements Repository {
    private final Function0 a;
    private final CoroutineScope b;
    private final io.bidmachine.rendering.internal.f c;
    private final Lazy d;

    static final class A extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Object obj, Continuation continuation) {
            super(2, continuation);
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((A) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new A(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MediaFileCacheManager b = a.this.b();
            if (b != null) {
                b.unholdMediaFiles(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.repository.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1808a implements NetworkRequest.Listener {
        private final Repository.ResultCallback a;
        private final CoroutineScope b;
        private final io.bidmachine.rendering.internal.f c;

        /* renamed from: io.bidmachine.rendering.internal.repository.a$a$a, reason: collision with other inner class name */
        static final class C1809a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ Error c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1809a(Error error, Continuation continuation) {
                super(2, continuation);
                this.c = error;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1809a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return AbstractC1808a.this.new C1809a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AbstractC1808a.this.a.onError(this.c);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: io.bidmachine.rendering.internal.repository.a$a$b */
        static final class b extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ Object c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, Continuation continuation) {
                super(2, continuation);
                this.c = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return AbstractC1808a.this.new b(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AbstractC1808a.this.a.onSuccess(this.c);
                return Unit.INSTANCE;
            }
        }

        public AbstractC1808a(Repository.ResultCallback resultCallback, CoroutineScope coroutineScope, io.bidmachine.rendering.internal.f coroutineDispatchers) {
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            this.a = resultCallback;
            this.b = coroutineScope;
            this.c = coroutineDispatchers;
        }

        public abstract Error a();

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onError(Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(this.b, this.c.d(), null, new C1809a(error, null), 2, null);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onSuccess(Object obj) {
            if (obj != null) {
                BuildersKt__Builders_commonKt.launch$default(this.b, this.c.d(), null, new b(obj, null), 2, null);
            } else {
                onError(a());
            }
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaSource.DeliveryType.values().length];
            try {
                iArr[MediaSource.DeliveryType.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSource.DeliveryType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Repository.ResultCallback b;
        final /* synthetic */ Error c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Repository.ResultCallback resultCallback, Error error, Continuation continuation) {
            super(2, continuation);
            this.b = resultCallback;
            this.c = error;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.onError(this.c);
            return Unit.INSTANCE;
        }
    }

    static final class d extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Repository.ResultCallback b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Repository.ResultCallback resultCallback, Object obj, Continuation continuation) {
            super(2, continuation);
            this.b = resultCallback;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.onSuccess(this.c);
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource c;
        final /* synthetic */ Object d;
        final /* synthetic */ Repository.ResultCallback e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MediaSource mediaSource, Object obj, Repository.ResultCallback resultCallback, Continuation continuation) {
            super(2, continuation);
            this.c = mediaSource;
            this.d = obj;
            this.e = resultCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new e(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object mo7894getImage0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                MediaSource mediaSource = this.c;
                Object obj2 = this.d;
                this.a = 1;
                mo7894getImage0E7RQCE = aVar.mo7894getImage0E7RQCE(mediaSource, obj2, this);
                if (mo7894getImage0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                mo7894getImage0E7RQCE = ((Result) obj).getValue();
            }
            Bitmap bitmap = (Bitmap) (Result.m8028isFailureimpl(mo7894getImage0E7RQCE) ? null : mo7894getImage0E7RQCE);
            if (bitmap != null) {
                a aVar2 = a.this;
                Repository.ResultCallback resultCallback = this.e;
                this.a = 2;
                if (aVar2.a(resultCallback, bitmap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a aVar3 = a.this;
                Repository.ResultCallback resultCallback2 = this.e;
                Error.Companion companion = Error.INSTANCE;
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(mo7894getImage0E7RQCE);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = a.this.a();
                }
                Error create = companion.create(m8026exceptionOrNullimpl);
                this.a = 3;
                if (aVar3.a(resultCallback2, create, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class f extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object mo7894getImage0E7RQCE = a.this.mo7894getImage0E7RQCE(null, null, this);
            return mo7894getImage0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo7894getImage0E7RQCE : Result.m8022boximpl(mo7894getImage0E7RQCE);
        }
    }

    static final class g extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource b;
        final /* synthetic */ a c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MediaSource mediaSource, a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.b = mediaSource;
            this.c = aVar;
            this.d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BitmapFactory.Options createDefaultBitmapFactoryOptions = ImageUtils.createDefaultBitmapFactoryOptions();
                createDefaultBitmapFactoryOptions.inJustDecodeBounds = false;
                MediaSource mediaSource = this.b;
                if (mediaSource instanceof UrlMediaSource) {
                    Object obj2 = this.d;
                    this.a = 1;
                    a = this.c.a((UrlMediaSource) mediaSource, obj2, createDefaultBitmapFactoryOptions, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(mediaSource instanceof Base64MediaSource)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.a = 2;
                    a = this.c.a((Base64MediaSource) mediaSource, createDefaultBitmapFactoryOptions, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(a);
        }
    }

    static final class h extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a((UrlMediaSource) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class i extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ UrlMediaSource c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(UrlMediaSource urlMediaSource, Continuation continuation) {
            super(2, continuation);
            this.c = urlMediaSource;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new i(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m7945getMediaFilegIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaFileCacheManager b = a.this.b();
                if (b == null) {
                    Result.Companion companion = Result.INSTANCE;
                    m7945getMediaFilegIAlus = Result.m8023constructorimpl(ResultKt.createFailure(new IllegalStateException("`MediaFileCacheManager` not found, check initialization")));
                } else {
                    List<String> urls = this.c.getUrls();
                    this.a = 1;
                    m7945getMediaFilegIAlus = b.m7945getMediaFilegIAlus(urls, this);
                    if (m7945getMediaFilegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m7945getMediaFilegIAlus = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(m7945getMediaFilegIAlus);
        }
    }

    static final class j extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a((Base64MediaSource) null, (BitmapFactory.Options) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class k extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Base64MediaSource c;
        final /* synthetic */ BitmapFactory.Options d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Base64MediaSource base64MediaSource, BitmapFactory.Options options, Continuation continuation) {
            super(2, continuation);
            this.c = base64MediaSource;
            this.d = options;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new k(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8023constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap a = a.this.a(this.c.getBase64(), this.d);
            if (a != null) {
                m8023constructorimpl = Result.m8023constructorimpl(a);
            } else {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Can't decode image from base64")));
            }
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    static final class l extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a((UrlMediaSource) null, (Object) null, (BitmapFactory.Options) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class m extends SuspendLambda implements Function2 {
        Object a;
        Object b;
        int c;
        final /* synthetic */ UrlMediaSource e;
        final /* synthetic */ Object f;
        final /* synthetic */ BitmapFactory.Options g;

        /* renamed from: io.bidmachine.rendering.internal.repository.a$m$a, reason: collision with other inner class name */
        static final class C1810a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ File b;
            final /* synthetic */ BitmapFactory.Options c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1810a(File file, BitmapFactory.Options options, Continuation continuation) {
                super(2, continuation);
                this.b = file;
                this.c = options;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1810a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1810a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                File file = this.b;
                if (file != null) {
                    return ImageUtilsKt.decodeToBitmapSafely(file, this.c);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(UrlMediaSource urlMediaSource, Object obj, BitmapFactory.Options options, Continuation continuation) {
            super(2, continuation);
            this.e = urlMediaSource;
            this.f = obj;
            this.g = options;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new m(this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object obj2;
            File file;
            Throwable m8026exceptionOrNullimpl;
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                UrlMediaSource urlMediaSource = this.e;
                this.c = 1;
                a = aVar.a(urlMediaSource, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (File) this.b;
                    obj2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    Bitmap bitmap = (Bitmap) obj;
                    if (file != null || bitmap == null) {
                        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj2);
                        if (m8026exceptionOrNullimpl == null) {
                            m8026exceptionOrNullimpl = a.this.a();
                        }
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
                    } else {
                        MediaFileCacheManager b = a.this.b();
                        if (b != null) {
                            b.holdMediaFile(file, this.f);
                        }
                        m8023constructorimpl = Result.m8023constructorimpl(bitmap);
                    }
                    return Result.m8022boximpl(m8023constructorimpl);
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            obj2 = a;
            File file2 = (File) (Result.m8028isFailureimpl(obj2) ? null : obj2);
            CoroutineDispatcher b2 = a.this.c.b();
            C1810a c1810a = new C1810a(file2, this.g, null);
            this.a = obj2;
            this.b = file2;
            this.c = 2;
            Object withContext = BuildersKt.withContext(b2, c1810a, this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = file2;
            obj = withContext;
            Bitmap bitmap2 = (Bitmap) obj;
            if (file != null) {
            }
            m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj2);
            if (m8026exceptionOrNullimpl == null) {
            }
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ UrlMediaSource c;
        final /* synthetic */ Object d;
        final /* synthetic */ Repository.ResultCallback e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(UrlMediaSource urlMediaSource, Object obj, Repository.ResultCallback resultCallback, Continuation continuation) {
            super(2, continuation);
            this.c = urlMediaSource;
            this.d = obj;
            this.e = resultCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new n(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object mo7895getImageUri0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                UrlMediaSource urlMediaSource = this.c;
                Object obj2 = this.d;
                this.a = 1;
                mo7895getImageUri0E7RQCE = aVar.mo7895getImageUri0E7RQCE(urlMediaSource, obj2, this);
                if (mo7895getImageUri0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                mo7895getImageUri0E7RQCE = ((Result) obj).getValue();
            }
            Uri uri = (Uri) (Result.m8028isFailureimpl(mo7895getImageUri0E7RQCE) ? null : mo7895getImageUri0E7RQCE);
            if (uri != null) {
                a aVar2 = a.this;
                Repository.ResultCallback resultCallback = this.e;
                this.a = 2;
                if (aVar2.a(resultCallback, uri, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a aVar3 = a.this;
                Repository.ResultCallback resultCallback2 = this.e;
                Error.Companion companion = Error.INSTANCE;
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(mo7895getImageUri0E7RQCE);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = a.this.a();
                }
                Error create = companion.create(m8026exceptionOrNullimpl);
                this.a = 3;
                if (aVar3.a(resultCallback2, create, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class o extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object mo7895getImageUri0E7RQCE = a.this.mo7895getImageUri0E7RQCE(null, null, this);
            return mo7895getImageUri0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo7895getImageUri0E7RQCE : Result.m8022boximpl(mo7895getImageUri0E7RQCE);
        }
    }

    static final class p extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ UrlMediaSource c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(UrlMediaSource urlMediaSource, Object obj, Continuation continuation) {
            super(2, continuation);
            this.c = urlMediaSource;
            this.d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new p(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                UrlMediaSource urlMediaSource = this.c;
                this.a = 1;
                a = aVar.a(urlMediaSource, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            File file = (File) (Result.m8028isFailureimpl(a) ? null : a);
            if (file != null) {
                MediaFileCacheManager b = a.this.b();
                if (b != null) {
                    b.holdMediaFile(file, this.d);
                }
                m8023constructorimpl = Result.m8023constructorimpl(FileUtilsKt.toUri(file));
            } else {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = a.this.a();
                }
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
            }
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    static final class q extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource c;
        final /* synthetic */ Repository.ResultCallback d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(MediaSource mediaSource, Repository.ResultCallback resultCallback, Continuation continuation) {
            super(2, continuation);
            this.c = mediaSource;
            this.d = resultCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new q(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                MediaSource mediaSource = this.c;
                Repository.ResultCallback resultCallback = this.d;
                this.a = 1;
                if (aVar.a(mediaSource, resultCallback, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class r extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource b;
        final /* synthetic */ a c;
        final /* synthetic */ Repository.ResultCallback d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(MediaSource mediaSource, a aVar, Repository.ResultCallback resultCallback, Continuation continuation) {
            super(2, continuation);
            this.b = mediaSource;
            this.c = aVar;
            this.d = resultCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaSource mediaSource = this.b;
                if (mediaSource instanceof UrlMediaSource) {
                    this.c.a((String) CollectionsKt.first((List) ((UrlMediaSource) mediaSource).getUrls()), new NetworkRequest.StringProcessor(), this.d, new Error("Uri is null"));
                } else if (mediaSource instanceof Base64MediaSource) {
                    String decodeBase64ToString$default = Utils.decodeBase64ToString$default(((Base64MediaSource) mediaSource).getBase64(), 0, 2, (Object) null);
                    if (decodeBase64ToString$default != null) {
                        a aVar = this.c;
                        Repository.ResultCallback resultCallback = this.d;
                        this.a = 1;
                        if (aVar.a(resultCallback, decodeBase64ToString$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        a aVar2 = this.c;
                        Repository.ResultCallback resultCallback2 = this.d;
                        Error error = new Error("Can't decode string from base64");
                        this.a = 2;
                        if (aVar2.a(resultCallback2, error, (Continuation) this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class s extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource c;
        final /* synthetic */ Object d;
        final /* synthetic */ Repository.ResultCallback e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(MediaSource mediaSource, Object obj, Repository.ResultCallback resultCallback, Continuation continuation) {
            super(2, continuation);
            this.c = mediaSource;
            this.d = obj;
            this.e = resultCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new s(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object mo7896getVideo0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                MediaSource mediaSource = this.c;
                Object obj2 = this.d;
                this.a = 1;
                mo7896getVideo0E7RQCE = aVar.mo7896getVideo0E7RQCE(mediaSource, obj2, this);
                if (mo7896getVideo0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                mo7896getVideo0E7RQCE = ((Result) obj).getValue();
            }
            Uri uri = (Uri) (Result.m8028isFailureimpl(mo7896getVideo0E7RQCE) ? null : mo7896getVideo0E7RQCE);
            if (uri != null) {
                a aVar2 = a.this;
                Repository.ResultCallback resultCallback = this.e;
                this.a = 2;
                if (aVar2.a(resultCallback, uri, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a aVar3 = a.this;
                Repository.ResultCallback resultCallback2 = this.e;
                Error.Companion companion = Error.INSTANCE;
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(mo7896getVideo0E7RQCE);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = a.this.a();
                }
                Error create = companion.create(m8026exceptionOrNullimpl);
                this.a = 3;
                if (aVar3.a(resultCallback2, create, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class t extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object mo7896getVideo0E7RQCE = a.this.mo7896getVideo0E7RQCE(null, null, this);
            return mo7896getVideo0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo7896getVideo0E7RQCE : Result.m8022boximpl(mo7896getVideo0E7RQCE);
        }
    }

    static final class u extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaSource b;
        final /* synthetic */ a c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(MediaSource mediaSource, a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.b = mediaSource;
            this.c = aVar;
            this.d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaSource mediaSource = this.b;
                if (mediaSource instanceof UrlMediaSource) {
                    Object obj2 = this.d;
                    this.a = 1;
                    m8023constructorimpl = this.c.a((UrlMediaSource) mediaSource, obj2, this);
                    if (m8023constructorimpl == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Unsupported media source type: " + this.b)));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m8023constructorimpl = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    static final class v extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a((List) null, (Object) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class w extends SuspendLambda implements Function2 {
        Object a;
        int b;
        final /* synthetic */ List d;
        final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(List list, Object obj, Continuation continuation) {
            super(2, continuation);
            this.d = list;
            this.e = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new w(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MediaFileCacheManager mediaFileCacheManager;
            Object obj2;
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaFileCacheManager b = a.this.b();
                if (b == null) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new Exception("`MediaFileCacheManager` not found, check initialization"))));
                }
                List<String> list = this.d;
                this.a = b;
                this.b = 1;
                Object m7945getMediaFilegIAlus = b.m7945getMediaFilegIAlus(list, this);
                if (m7945getMediaFilegIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mediaFileCacheManager = b;
                obj2 = m7945getMediaFilegIAlus;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediaFileCacheManager = (MediaFileCacheManager) this.a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).getValue();
            }
            File file = (File) (Result.m8028isFailureimpl(obj2) ? null : obj2);
            Uri uriSafely = file != null ? FileUtilsKt.toUriSafely(file) : null;
            if (uriSafely != null) {
                mediaFileCacheManager.holdMediaFile(file, this.e);
                m8023constructorimpl = Result.m8023constructorimpl(uriSafely);
            } else {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj2);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = a.this.a();
                }
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
            }
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    static final class x extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a((UrlMediaSource) null, (Object) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class y extends Lambda implements Function0 {
        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaFileCacheManager mo4828invoke() {
            return (MediaFileCacheManager) a.this.a.mo4828invoke();
        }
    }

    public static final class z extends AbstractC1808a {
        final /* synthetic */ Error d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Repository.ResultCallback resultCallback, Error error, CoroutineScope coroutineScope, io.bidmachine.rendering.internal.f fVar) {
            super(resultCallback, coroutineScope, fVar);
            this.d = error;
        }

        @Override // io.bidmachine.rendering.internal.repository.a.AbstractC1808a
        public Error a() {
            return this.d;
        }
    }

    public a(Function0 mediaFileCacheManagerProvider, CoroutineScope coroutineScope, io.bidmachine.rendering.internal.f coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(mediaFileCacheManagerProvider, "mediaFileCacheManagerProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.a = mediaFileCacheManagerProvider;
        this.b = coroutineScope;
        this.c = coroutineDispatchers;
        this.d = LazyKt.lazy(new y());
    }

    @Override // io.bidmachine.rendering.Repository
    public void getImage(MediaSource mediaSource, Object mediaSourceHolder, Repository.ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new e(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.bidmachine.rendering.Repository
    /* renamed from: getImage-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7894getImage0E7RQCE(MediaSource mediaSource, Object obj, Continuation continuation) {
        f fVar;
        int i2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i3 = fVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = fVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = fVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher c2 = this.c.c();
                    g gVar = new g(mediaSource, this, obj, null);
                    fVar.c = 1;
                    obj2 = BuildersKt.withContext(c2, gVar, fVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        fVar = new f(continuation);
        Object obj22 = fVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = fVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj22).getValue();
    }

    @Override // io.bidmachine.rendering.Repository
    public void getImageUri(UrlMediaSource mediaSource, Object mediaSourceHolder, Repository.ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new n(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.bidmachine.rendering.Repository
    /* renamed from: getImageUri-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7895getImageUri0E7RQCE(UrlMediaSource urlMediaSource, Object obj, Continuation continuation) {
        o oVar;
        int i2;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i3 = oVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = oVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = oVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher c2 = this.c.c();
                    p pVar = new p(urlMediaSource, obj, null);
                    oVar.c = 1;
                    obj2 = BuildersKt.withContext(c2, pVar, oVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        oVar = new o(continuation);
        Object obj22 = oVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = oVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj22).getValue();
    }

    @Override // io.bidmachine.rendering.Repository
    public void getString(MediaSource mediaSource, Object mediaSourceHolder, Repository.ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new q(mediaSource, resultCallback, null), 3, null);
    }

    @Override // io.bidmachine.rendering.Repository
    public void getVideo(MediaSource mediaSource, Object mediaSourceHolder, Repository.ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new s(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.bidmachine.rendering.Repository
    /* renamed from: getVideo-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7896getVideo0E7RQCE(MediaSource mediaSource, Object obj, Continuation continuation) {
        t tVar;
        int i2;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i3 = tVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = tVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = tVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher c2 = this.c.c();
                    u uVar = new u(mediaSource, this, obj, null);
                    tVar.c = 1;
                    obj2 = BuildersKt.withContext(c2, uVar, tVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        tVar = new t(continuation);
        Object obj22 = tVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = tVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj22).getValue();
    }

    @Override // io.bidmachine.rendering.Repository
    public void unholdMediaFiles(Object mediaSourceHolder) {
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new A(mediaSourceHolder, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFileCacheManager b() {
        return (MediaFileCacheManager) this.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UrlMediaSource urlMediaSource, Continuation continuation) {
        h hVar;
        int i2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.c = i3 - Integer.MIN_VALUE;
                Object obj = hVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher c2 = this.c.c();
                    i iVar = new i(urlMediaSource, null);
                    hVar.c = 1;
                    obj = BuildersKt.withContext(c2, iVar, hVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UrlMediaSource urlMediaSource, Object obj, BitmapFactory.Options options, Continuation continuation) {
        l lVar;
        int i2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i3 = lVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = lVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher c2 = this.c.c();
                    m mVar = new m(urlMediaSource, obj, options, null);
                    lVar.c = 1;
                    obj2 = BuildersKt.withContext(c2, mVar, lVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        lVar = new l(continuation);
        Object obj22 = lVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj22).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Base64MediaSource base64MediaSource, BitmapFactory.Options options, Continuation continuation) {
        j jVar;
        int i2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.c = i3 - Integer.MIN_VALUE;
                Object obj = jVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = jVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher b2 = this.c.b();
                    k kVar = new k(base64MediaSource, options, null);
                    jVar.c = 1;
                    obj = BuildersKt.withContext(b2, kVar, jVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = jVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final Bitmap a(String base64, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(options, "options");
        byte[] decodeBase64$default = UtilsKt.decodeBase64$default(base64, 0, 1, (Object) null);
        if (decodeBase64$default != null) {
            return ImageUtils.decodeBytesToBitmapSafely(decodeBase64$default, options);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UrlMediaSource urlMediaSource, Object obj, Continuation continuation) {
        x xVar;
        int i2;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i3 = xVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = xVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = xVar.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return ((Result) obj2).getValue();
                }
                ResultKt.throwOnFailure(obj2);
                List urls = urlMediaSource.getUrls();
                int i4 = b.$EnumSwitchMapping$0[urlMediaSource.getDeliveryType().ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return a((String) CollectionsKt.first(urls));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xVar.c = 1;
                Object a = a(urls, obj, xVar);
                return a == coroutine_suspended ? coroutine_suspended : a;
            }
        }
        xVar = new x(continuation);
        Object obj22 = xVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = xVar.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Object obj, Continuation continuation) {
        v vVar;
        int i2;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i3 = vVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.c = i3 - Integer.MIN_VALUE;
                Object obj2 = vVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = vVar.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    CoroutineDispatcher c2 = this.c.c();
                    w wVar = new w(list, obj, null);
                    vVar.c = 1;
                    obj2 = BuildersKt.withContext(c2, wVar, vVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        vVar = new v(continuation);
        Object obj22 = vVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = vVar.c;
        if (i2 != 0) {
        }
        return ((Result) obj22).getValue();
    }

    public final Object a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri validUri = Utils.getValidUri(url);
            if (validUri != null) {
                return Result.m8023constructorimpl(validUri);
            }
            throw new Exception("Can't parse video stream url - " + url);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final Object a(MediaSource mediaSource, Repository.ResultCallback resultCallback, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.c.c(), new r(mediaSource, this, resultCallback, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void a(String url, NetworkRequest.ResponseProcessor processor, Repository.ResultCallback resultCallback, Error error) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        Intrinsics.checkNotNullParameter(error, "error");
        new NetworkRequest.Builder(url, NetworkRequest.Method.Get).setResponseTransformer(processor).setListener(new z(resultCallback, error, this.b, this.c)).send();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Repository.ResultCallback resultCallback, Object obj, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.c.d(), new d(resultCallback, obj, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Repository.ResultCallback resultCallback, Error error, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.c.d(), new c(resultCallback, error, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Exception a() {
        return new Exception("Unknown error");
    }
}
