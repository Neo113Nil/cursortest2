package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.appevents.AppEventsConstants;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.u;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.MethodParams;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.rendering.utils.NetworkRequestBuilder;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.Tag;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class h implements io.bidmachine.rendering.internal.controller.e {
    public static final d u = new d(null);
    private final Object a;
    private final Tag b;
    private final io.bidmachine.rendering.internal.state.c c;
    private final io.bidmachine.rendering.internal.controller.f d;
    private final io.bidmachine.rendering.internal.animation.b e;
    private final Context f;
    private final Lazy g;
    private final Lazy h;
    private io.bidmachine.rendering.internal.controller.g i;
    private final io.bidmachine.rendering.internal.event.f j;
    private final io.bidmachine.rendering.internal.detector.brokencreative.b k;
    private final Lazy l;
    private final Lazy m;
    private final TaskManager n;
    private final Map o;
    private final List p;
    private final List q;
    private final List r;
    private final Lazy s;
    private final AtomicBoolean t;

    private abstract class b implements io.bidmachine.rendering.internal.adform.c {
        public b() {
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            io.bidmachine.rendering.internal.k.b(h.this.b, "AdsElement (" + adForm + ") - onAdFormShown", new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            io.bidmachine.rendering.internal.k.b(h.this.b, "AdsElement (" + adForm + ") - onAdFormLoaded", new Object[0]);
            h.this.o.remove(adForm);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            io.bidmachine.rendering.internal.k.a(h.this.b, "AdsElement (" + adForm + ") - onAdFormFailToLoad - " + error, new Object[0]);
            h.this.o.remove(adForm);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            io.bidmachine.rendering.internal.k.a(h.this.b, "AdsElement (" + adForm + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            io.bidmachine.rendering.internal.k.a(h.this.b, "AdsElement (" + adForm + ") - onAdFormExpired - " + error, new Object[0]);
        }
    }

    private final class c implements io.bidmachine.rendering.internal.detector.brokencreative.b {
        public c() {
        }

        @Override // io.bidmachine.rendering.internal.detector.brokencreative.b
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            h.this.a(brokenCreativeEvent);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class f implements io.bidmachine.rendering.internal.event.f {
        private final Context a;
        final /* synthetic */ h b;

        public static final class a implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public a(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.e) this.a).a();
            }
        }

        public static final class b implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public b(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.e) this.a).a();
            }
        }

        public static final class c implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public c(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.e) this.a).a();
            }
        }

        public static final class d implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public d(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.e) this.a).a();
            }
        }

        public static final class e extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ h g;
            final /* synthetic */ Integer h;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ h b;
                final /* synthetic */ Integer c;

                public a(Object obj, h hVar, Integer num) {
                    this.a = obj;
                    this.b = hVar;
                    this.c = num;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.a;
                    this.b.a(visibilityChanger, false, this.c != null, (Runnable) new C1789f(visibilityChanger));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, h hVar2, Integer num) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = hVar2;
                this.h = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(this.b, this.c, this.d, this.e, this.f, continuation, this.g, this.h);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g, this.h));
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: io.bidmachine.rendering.internal.controller.h$f$f, reason: collision with other inner class name */
        static final class C1789f implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ VisibilityChanger a;

            C1789f(VisibilityChanger visibilityChanger) {
                this.a = visibilityChanger;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.a.setVisibility(false);
            }
        }

        public static final class g extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ boolean g;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ boolean b;

                public a(Object obj, boolean z) {
                    this.a = obj;
                    this.b = z;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.a).lockVisibility(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, boolean z) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new g(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: io.bidmachine.rendering.internal.controller.h$f$h, reason: collision with other inner class name */
        public static final class C1790h extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ Integer g;

            /* renamed from: io.bidmachine.rendering.internal.controller.h$f$h$a */
            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ Integer b;

                public a(Object obj, Integer num) {
                    this.a = obj;
                    this.b = num;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.m) this.a).b(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1790h(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, Integer num) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1790h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1790h(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class i implements io.bidmachine.rendering.internal.i {
            final /* synthetic */ h a;
            final /* synthetic */ String b;

            public static final class a extends SuspendLambda implements Function2 {
                int a;
                final /* synthetic */ h b;
                final /* synthetic */ String c;
                final /* synthetic */ String d;
                final /* synthetic */ Class e;
                final /* synthetic */ String f;
                final /* synthetic */ ProcessUrlResult g;

                /* renamed from: io.bidmachine.rendering.internal.controller.h$f$i$a$a, reason: collision with other inner class name */
                public static final class C1791a implements io.bidmachine.rendering.internal.j {
                    final /* synthetic */ Object a;
                    final /* synthetic */ ProcessUrlResult b;

                    public C1791a(Object obj, ProcessUrlResult processUrlResult) {
                        this.a = obj;
                        this.b = processUrlResult;
                    }

                    @Override // io.bidmachine.util.SafeRunnable
                    public final void onRun() {
                        ((io.bidmachine.rendering.internal.u) this.a).a(this.b.getSystemComponent());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, ProcessUrlResult processUrlResult) {
                    super(2, continuation);
                    this.b = hVar;
                    this.c = str;
                    this.d = str2;
                    this.e = cls;
                    this.f = str3;
                    this.g = processUrlResult;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new a(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Object b = this.b.b(this.c);
                    if (b == null) {
                        this.b.a(this.d, this.c);
                    } else if (!this.e.isInstance(b)) {
                        this.b.a(this.d, this.c, this.f);
                    } else if (this.e.isInstance(b)) {
                        UiUtils.onUiThread(new C1791a(b, this.g));
                    }
                    return Unit.INSTANCE;
                }
            }

            i(h hVar, String str) {
                this.a = hVar;
                this.b = str;
            }

            @Override // io.bidmachine.util.SafeExecutable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onExecute(ProcessUrlResult input) {
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.getIsSuccess()) {
                    h hVar = this.a;
                    BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new a(hVar, this.b, "onClickResolved", io.bidmachine.rendering.internal.u.class, "TargetObject", null, input), 2, null);
                }
                io.bidmachine.rendering.internal.controller.g n = this.a.n();
                if (n != null) {
                    n.f();
                }
            }
        }

        public static final class j extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ long g;
            final /* synthetic */ long h;
            final /* synthetic */ float i;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ long b;
                final /* synthetic */ long c;
                final /* synthetic */ float d;

                public a(Object obj, long j, long j2, float f) {
                    this.a = obj;
                    this.b = j;
                    this.c = j2;
                    this.d = f;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.o) this.a).a(this.b, this.c, this.d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, long j, long j2, float f) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = j;
                this.h = j2;
                this.i = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.b, this.c, this.d, this.e, this.f, continuation, this.g, this.h, this.i);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g, this.h, this.i));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class k extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;

                public a(Object obj) {
                    this.a = obj;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.p) this.a).j();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(h hVar, String str, String str2, Class cls, String str3, Continuation continuation) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new k(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class l extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ long g;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ long b;

                public a(Object obj, long j) {
                    this.a = obj;
                    this.b = j;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.r) this.a).a(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, long j) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new l(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class m extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ h g;
            final /* synthetic */ Integer h;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ h b;
                final /* synthetic */ Integer c;

                public a(Object obj, h hVar, Integer num) {
                    this.a = obj;
                    this.b = hVar;
                    this.c = num;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.a;
                    this.b.a(visibilityChanger, true, this.c != null, (Runnable) new n(visibilityChanger));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, h hVar2, Integer num) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = hVar2;
                this.h = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new m(this.b, this.c, this.d, this.e, this.f, continuation, this.g, this.h);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g, this.h));
                }
                return Unit.INSTANCE;
            }
        }

        static final class n implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ VisibilityChanger a;

            n(VisibilityChanger visibilityChanger) {
                this.a = visibilityChanger;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.a.setVisibility(true);
            }
        }

        public static final class o extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ ClickAreaFactory g;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ ClickAreaFactory b;

                public a(Object obj, ClickAreaFactory clickAreaFactory) {
                    this.a = obj;
                    this.b = clickAreaFactory;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.b) this.a).a(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, ClickAreaFactory clickAreaFactory) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = clickAreaFactory;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new o(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class p implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public p(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.s) this.a).d();
            }
        }

        public static final class q implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public q(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.s) this.a).d();
            }
        }

        public static final class r implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public r(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.s) this.a).d();
            }
        }

        public static final class s implements io.bidmachine.rendering.internal.j {
            final /* synthetic */ Object a;

            public s(Object obj) {
                this.a = obj;
            }

            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.s) this.a).d();
            }
        }

        public static final class t extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ String g;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ String b;

                public a(Object obj, String str) {
                    this.a = obj;
                    this.b = str;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.t) this.a).a(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, String str4) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = str4;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new t(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class u extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;

                public a(Object obj) {
                    this.a = obj;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.a).unlockVisibility();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(h hVar, String str, String str2, Class cls, String str3, Continuation continuation) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new u(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b));
                }
                return Unit.INSTANCE;
            }
        }

        public static final class v extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ Class e;
            final /* synthetic */ String f;
            final /* synthetic */ Integer g;

            public static final class a implements io.bidmachine.rendering.internal.j {
                final /* synthetic */ Object a;
                final /* synthetic */ Integer b;

                public a(Object obj, Integer num) {
                    this.a = obj;
                    this.b = num;
                }

                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.m) this.a).a(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(h hVar, String str, String str2, Class cls, String str3, Continuation continuation, Integer num) {
                super(2, continuation);
                this.b = hVar;
                this.c = str;
                this.d = str2;
                this.e = cls;
                this.f = str3;
                this.g = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new v(this.b, this.c, this.d, this.e, this.f, continuation, this.g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object b = this.b.b(this.c);
                if (b == null) {
                    this.b.a(this.d, this.c);
                } else if (!this.e.isInstance(b)) {
                    this.b.a(this.d, this.c, this.f);
                } else if (this.e.isInstance(b)) {
                    UiUtils.onUiThread(new a(b, this.g));
                }
                return Unit.INSTANCE;
            }
        }

        public f(h hVar, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.b = hVar;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.a = applicationContext;
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a() {
            h hVar = this.b;
            for (io.bidmachine.rendering.internal.b bVar : hVar.j()) {
                if (io.bidmachine.rendering.internal.e.class.isInstance(bVar)) {
                    UiUtils.onUiThread(new a(bVar));
                }
            }
            for (io.bidmachine.rendering.internal.b bVar2 : hVar.k()) {
                if (io.bidmachine.rendering.internal.e.class.isInstance(bVar2)) {
                    UiUtils.onUiThread(new b(bVar2));
                }
            }
            for (io.bidmachine.rendering.internal.l lVar : hVar.m()) {
                if (io.bidmachine.rendering.internal.e.class.isInstance(lVar)) {
                    UiUtils.onUiThread(new c(lVar));
                }
            }
            io.bidmachine.rendering.internal.u l2 = hVar.l();
            if (io.bidmachine.rendering.internal.e.class.isInstance(l2)) {
                UiUtils.onUiThread(new d(l2));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b(String sourceName, String url) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            Intrinsics.checkNotNullParameter(url, "url");
            d(sourceName, url);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c(String sourceName, String url) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            Intrinsics.checkNotNullParameter(url, "url");
            d(sourceName, url);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void d(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            new NetworkRequest.Builder(url, NetworkRequest.Method.Get).setUserAgent(Rendering.getUserAgent()).send();
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b(String targetElementName) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new k(hVar, targetElementName, "repeat", io.bidmachine.rendering.internal.p.class, "Repeatable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new C1790h(hVar, targetElementName, "mute", io.bidmachine.rendering.internal.m.class, "Mutable", null, num), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new m(hVar, targetElementName, "show", VisibilityChanger.class, "VisibilityChanger", null, hVar, num), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c(String targetElementName) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new u(hVar, targetElementName, "unlockVisibility", VisibilityChanger.class, "VisibilityChanger", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void d() {
            h hVar = this.b;
            for (io.bidmachine.rendering.internal.b bVar : hVar.j()) {
                if (io.bidmachine.rendering.internal.s.class.isInstance(bVar)) {
                    UiUtils.onUiThread(new p(bVar));
                }
            }
            for (io.bidmachine.rendering.internal.b bVar2 : hVar.k()) {
                if (io.bidmachine.rendering.internal.s.class.isInstance(bVar2)) {
                    UiUtils.onUiThread(new q(bVar2));
                }
            }
            for (io.bidmachine.rendering.internal.l lVar : hVar.m()) {
                if (io.bidmachine.rendering.internal.s.class.isInstance(lVar)) {
                    UiUtils.onUiThread(new r(lVar));
                }
            }
            io.bidmachine.rendering.internal.u l2 = hVar.l();
            if (io.bidmachine.rendering.internal.s.class.isInstance(l2)) {
                UiUtils.onUiThread(new s(l2));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b() {
            io.bidmachine.rendering.internal.controller.g n2 = this.b.n();
            if (n2 != null) {
                n2.b();
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c() {
            io.bidmachine.rendering.internal.controller.g n2 = this.b.n();
            if (n2 != null) {
                n2.c();
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new e(hVar, targetElementName, "hide", VisibilityChanger.class, "VisibilityChanger", null, hVar, num), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, long j2, long j3, float f) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new j(hVar, targetElementName, "progress", io.bidmachine.rendering.internal.o.class, VastTagName.PROGRESS, null, j2, j3, f), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void d(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new v(hVar, targetElementName, "unmute", io.bidmachine.rendering.internal.m.class, "Mutable", null, num), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, long j2) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new l(hVar, targetElementName, "schedule", io.bidmachine.rendering.internal.r.class, AppEventsConstants.EVENT_NAME_SCHEDULE, null, j2), 2, null);
        }

        private final void d(String str, String str2) {
            io.bidmachine.rendering.internal.controller.g n2 = this.b.n();
            if (n2 != null) {
                n2.e();
            }
            UrlHandler.openUrl(this.a, str2, new i(this.b, str));
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, String str) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new t(hVar, targetElementName, "start", io.bidmachine.rendering.internal.t.class, "Startable", null, str), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, boolean z) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new g(hVar, targetElementName, "lockVisibility", VisibilityChanger.class, "VisibilityChanger", null, z), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String targetElementName, ClickAreaFactory clickAreaFactory) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            Intrinsics.checkNotNullParameter(clickAreaFactory, "clickAreaFactory");
            h hVar = this.b;
            BuildersKt__Builders_commonKt.launch$default(hVar.i(hVar), hVar.h(hVar).b(), null, new o(hVar, targetElementName, "simulateClick", io.bidmachine.rendering.internal.b.class, "AdElement", null, clickAreaFactory), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(PrivacySheetParams privacySheetParams) {
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            io.bidmachine.rendering.internal.controller.g n2 = this.b.n();
            if (n2 != null) {
                n2.a(privacySheetParams);
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String stateGroups) {
            Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
            this.b.p().a(stateGroups);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String sourceName, EventType eventType, String str, List eventTaskParamsList, String url, Function1 callback) {
            io.bidmachine.util.network.NetworkRequest<?> createRequestPermissionRequest;
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(callback, "callback");
            NetworkRequestBuilder networkRequestBuilder = Rendering.getNetworkRequestBuilder();
            if (networkRequestBuilder == null || (createRequestPermissionRequest = networkRequestBuilder.createRequestPermissionRequest(sourceName, eventType, str, eventTaskParamsList, url, callback)) == null) {
                io.bidmachine.rendering.internal.k.a(this.b.b, "Can't request PermissionRequest. NetworkRequestBuilder is null", new Object[0]);
                callback.invoke(null);
            } else {
                io.bidmachine.util.network.NetworkRequest.send$default(createRequestPermissionRequest, null, 1, null);
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(SystemComponent systemComponent) {
            io.bidmachine.rendering.internal.controller.g n2 = this.b.n();
            if (n2 != null) {
                n2.a(systemComponent);
            }
        }
    }

    private final class g extends io.bidmachine.rendering.internal.u {
        final /* synthetic */ h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar, io.bidmachine.rendering.internal.event.b eventCallback) {
            super(eventCallback);
            Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
            this.c = hVar;
        }

        @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.m
        public void a(Integer num) {
            n().a(num);
        }

        @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.m
        public void b(Integer num) {
            n().b(num);
        }

        @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.s
        public void d() {
            io.bidmachine.rendering.internal.controller.g n = this.c.n();
            if (n != null) {
                n.d();
            }
        }

        @Override // io.bidmachine.rendering.internal.u
        public String o() {
            return n().g();
        }

        @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.e
        public void a() {
            io.bidmachine.rendering.internal.controller.g n = this.c.n();
            if (n != null) {
                n.a();
            }
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.controller.h$h, reason: collision with other inner class name */
    static final class C1792h extends Lambda implements Function0 {
        C1792h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.adform.b mo4828invoke() {
            Context applicationContext = h.this.f;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new io.bidmachine.rendering.internal.adform.b(applicationContext, h.this.o());
        }
    }

    static final class i extends Lambda implements Function0 {
        final /* synthetic */ AdPhaseParams b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AdPhaseParams adPhaseParams) {
            super(0);
            this.b = adPhaseParams;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.c mo4828invoke() {
            Object obj = h.this.a;
            Context applicationContext = h.this.f;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new io.bidmachine.rendering.internal.c(obj, applicationContext, h.this.o(), this.b);
        }
    }

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo4828invoke() {
            ViewGroup c = h.this.e().c();
            if (c != null) {
                return Integer.valueOf(c.getId());
            }
            return null;
        }
    }

    static final class k extends Lambda implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g mo4828invoke() {
            h hVar = h.this;
            return new g(hVar, hVar.a("system"));
        }
    }

    static final class l extends SuspendLambda implements Function2 {
        int a;

        l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return h.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (h.this.q()) {
                h.this.r();
                h.this.s();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public m(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.b) this.a).m();
        }
    }

    public static final class n implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public n(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.b) this.a).m();
        }
    }

    public static final class o implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public o(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.b) this.a).m();
        }
    }

    public static final class p implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public p(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.b) this.a).m();
        }
    }

    public static final class q implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public q(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).pause();
        }
    }

    public static final class r implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public r(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).pause();
        }
    }

    public static final class s implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public s(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).pause();
        }
    }

    public static final class t implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public t(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).pause();
        }
    }

    public static final class u implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public u(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).k();
        }
    }

    public static final class v implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public v(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).k();
        }
    }

    public static final class w implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public w(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).k();
        }
    }

    public static final class x implements io.bidmachine.rendering.internal.j {
        final /* synthetic */ Object a;

        public x(Object obj) {
            this.a = obj;
        }

        @Override // io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((io.bidmachine.rendering.internal.r) this.a).k();
        }
    }

    static final class y extends Lambda implements Function0 {

        static final class a extends Lambda implements Function0 {
            public static final a a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MediaFileCacheManager mo4828invoke() {
                Function0 mediaFileCacheManagerProvider = Rendering.getMediaFileCacheManagerProvider();
                if (mediaFileCacheManagerProvider != null) {
                    return (MediaFileCacheManager) mediaFileCacheManagerProvider.mo4828invoke();
                }
                return null;
            }
        }

        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.repository.a mo4828invoke() {
            a aVar = a.a;
            h hVar = h.this;
            CoroutineScope i = hVar.i(hVar);
            h hVar2 = h.this;
            return new io.bidmachine.rendering.internal.repository.a(aVar, i, hVar2.h(hVar2));
        }
    }

    static final class z extends Lambda implements Function0 {
        final /* synthetic */ AdPhaseParams a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(AdPhaseParams adPhaseParams) {
            super(0);
            this.a = adPhaseParams;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.groups.a mo4828invoke() {
            return new io.bidmachine.rendering.internal.groups.a(this.a.getStateGroups());
        }
    }

    public h(Context context, AdPhaseParams adPhaseParams, Object assetsHolder, Tag tag, io.bidmachine.rendering.internal.state.c adState, io.bidmachine.rendering.internal.controller.f adPhaseControllerListener, io.bidmachine.rendering.internal.animation.b adAnimationController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(adState, "adState");
        Intrinsics.checkNotNullParameter(adPhaseControllerListener, "adPhaseControllerListener");
        Intrinsics.checkNotNullParameter(adAnimationController, "adAnimationController");
        this.a = assetsHolder;
        this.b = tag;
        this.c = adState;
        this.d = adPhaseControllerListener;
        this.e = adAnimationController;
        this.f = context.getApplicationContext();
        this.g = LazyKt.lazy(new y());
        this.h = LazyKt.lazy(new i(adPhaseParams));
        this.j = new f(this, context);
        this.k = new c();
        this.l = LazyKt.lazy(new z(adPhaseParams));
        this.m = LazyKt.lazy(new k());
        this.n = new CoroutineTaskManager(i(this).getCoroutineContext().plus(h(this).c()));
        this.o = new ConcurrentHashMap();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = LazyKt.lazy(new C1792h());
        this.t = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.u l() {
        return (io.bidmachine.rendering.internal.u) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Repository o() {
        return (Repository) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.groups.b p() {
        return (io.bidmachine.rendering.internal.groups.b) this.l.getValue();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void destroy() {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - destroy", new Object[0]);
        g();
        a(this.p);
        a(this.q);
        h();
        b(this.r);
        a(this, l(), (List) null, 2, (Object) null);
        a((io.bidmachine.rendering.internal.controller.g) null);
        this.c.destroy();
    }

    public final void h() {
        io.bidmachine.rendering.internal.k.b(this.b, "Destroy AdPhase", new Object[0]);
        this.e.a(e());
        final io.bidmachine.rendering.internal.c e2 = e();
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.internal.controller.h$$ExternalSyntheticLambda2
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.c.this.a();
            }
        });
    }

    public final io.bidmachine.rendering.internal.adform.b i() {
        return (io.bidmachine.rendering.internal.adform.b) this.s.getValue();
    }

    public final List j() {
        return this.p;
    }

    public final List k() {
        return this.q;
    }

    public final List m() {
        return this.r;
    }

    public io.bidmachine.rendering.internal.controller.g n() {
        return this.i;
    }

    public final boolean q() {
        List<AdElementParams> adsList = e().b().getAdsList();
        if (adsList.isEmpty()) {
            a(new Error("AdPhase does not contain any ads part"));
            return false;
        }
        if (a()) {
            t();
            return false;
        }
        if (!this.c.b()) {
            return false;
        }
        this.p.addAll(a(adsList, new a()));
        if (!this.p.isEmpty()) {
            return true;
        }
        a(new Error("No supported ads found for the given parameters"));
        return false;
    }

    public final void r() {
        this.q.addAll(a(e().b().getControlsList(), new e()));
    }

    public final void s() {
        List<MethodParams> methodParamsList = e().b().getMethodParamsList();
        List list = this.r;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(methodParamsList, 10));
        for (MethodParams methodParams : methodParamsList) {
            arrayList.add(new io.bidmachine.rendering.internal.l(methodParams, a(methodParams.getName())));
        }
        list.addAll(arrayList);
    }

    public final void t() {
        if (this.c.a(true)) {
            this.d.a(this);
        }
    }

    public String toString() {
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope i(h hVar) {
        return hVar.c.r();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void c() {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - performShow", new Object[0]);
        for (io.bidmachine.rendering.internal.b bVar : j()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(bVar)) {
                UiUtils.onUiThread(new u(bVar));
            }
        }
        for (io.bidmachine.rendering.internal.b bVar2 : k()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(bVar2)) {
                UiUtils.onUiThread(new v(bVar2));
            }
        }
        for (io.bidmachine.rendering.internal.l lVar : m()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(lVar)) {
                UiUtils.onUiThread(new w(lVar));
            }
        }
        io.bidmachine.rendering.internal.u l2 = l();
        if (io.bidmachine.rendering.internal.r.class.isInstance(l2)) {
            UiUtils.onUiThread(new x(l2));
        }
        if (this.c.h()) {
            d(false);
        }
        this.c.o();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void d() {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - onCollapsed", new Object[0]);
        l().n().i();
        for (io.bidmachine.rendering.internal.b bVar : j()) {
            if (io.bidmachine.rendering.internal.b.class.isInstance(bVar)) {
                UiUtils.onUiThread(new m(bVar));
            }
        }
        for (io.bidmachine.rendering.internal.b bVar2 : k()) {
            if (io.bidmachine.rendering.internal.b.class.isInstance(bVar2)) {
                UiUtils.onUiThread(new n(bVar2));
            }
        }
        for (io.bidmachine.rendering.internal.l lVar : m()) {
            if (io.bidmachine.rendering.internal.b.class.isInstance(lVar)) {
                UiUtils.onUiThread(new o(lVar));
            }
        }
        io.bidmachine.rendering.internal.u l2 = l();
        if (io.bidmachine.rendering.internal.b.class.isInstance(l2)) {
            UiUtils.onUiThread(new p(l2));
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public io.bidmachine.rendering.internal.c e() {
        return (io.bidmachine.rendering.internal.c) this.h.getValue();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void f() {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - onExpanded", new Object[0]);
        l().n().f();
    }

    public final void g() {
        io.bidmachine.rendering.internal.k.b(this.b, "Cancel loading AdElements", new Object[0]);
        Iterator it = this.o.entrySet().iterator();
        while (it.hasNext()) {
            this.n.cancel((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.o.clear();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void b() {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - load", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(i(this), h(this).c(), null, new l(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.f h(h hVar) {
        return hVar.c.q();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void b(boolean z2) {
        io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - performHide, isFinishing: " + z2, new Object[0]);
        for (io.bidmachine.rendering.internal.b bVar : j()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(bVar)) {
                UiUtils.onUiThread(new q(bVar));
            }
        }
        for (io.bidmachine.rendering.internal.b bVar2 : k()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(bVar2)) {
                UiUtils.onUiThread(new r(bVar2));
            }
        }
        for (io.bidmachine.rendering.internal.l lVar : m()) {
            if (io.bidmachine.rendering.internal.r.class.isInstance(lVar)) {
                UiUtils.onUiThread(new s(lVar));
            }
        }
        io.bidmachine.rendering.internal.u l2 = l();
        if (io.bidmachine.rendering.internal.r.class.isInstance(l2)) {
            UiUtils.onUiThread(new t(l2));
        }
        c(z2);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean a() {
        return this.c.a();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(io.bidmachine.rendering.internal.controller.g gVar) {
        this.i = gVar;
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean a(ViewGroup rootContainer, ViewGroup container) {
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        Intrinsics.checkNotNullParameter(container, "container");
        return e().a(rootContainer, container, this.p, this.q);
    }

    private final class e extends b {
        public e() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.b(adForm);
            if (!h.this.a(adForm, true)) {
                c(adForm, new Error("Failed to setup ad element (" + adForm + ')'));
            }
            if (h.this.o.isEmpty()) {
                h.this.t();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.c(adForm, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.b) adForm, hVar.k());
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.b(adForm, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.b) adForm, hVar.k());
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(boolean z2) {
        boolean z3 = false;
        boolean z4 = z2 && this.c.f();
        if (!z2 && this.c.k()) {
            z3 = true;
        }
        if (z4) {
            io.bidmachine.rendering.internal.k.b(this.b, "AdPhase - onShown (isViewability - %s)", Boolean.valueOf(z2));
            d(true);
        }
        if (z4) {
            l().n().e();
        }
        if (z3) {
            l().n().n();
        }
    }

    private final class a extends b {
        public a() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.a(adForm);
            h.this.e().a(adForm);
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.b(adForm);
            if (h.a(h.this, adForm, false, 2, (Object) null)) {
                if (h.this.o.isEmpty()) {
                    h.this.t();
                }
            } else {
                c(adForm, new Error("Failed to setup ad element (" + adForm + ')'));
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.c(adForm, error);
            h.this.a(error);
            h.this.e().a(adForm);
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a adForm, Error error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.b(adForm, error);
            h.this.a(error);
            h.this.e().a(adForm);
        }
    }

    public final io.bidmachine.rendering.internal.event.b a(String sourceName) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        return new io.bidmachine.rendering.internal.event.c(sourceName, new io.bidmachine.rendering.internal.groups.c(p()), new io.bidmachine.rendering.internal.animation.c(this.e, new j()), new io.bidmachine.rendering.internal.event.a(this.j, sourceName), i(this), h(this), e().b().getEventTypeMap(sourceName));
    }

    public final void d(boolean z2) {
        if (this.t.compareAndSet(false, true)) {
            b(this.p, z2);
            b(this.q, z2);
        }
    }

    private final io.bidmachine.rendering.internal.detector.brokencreative.a a(AdElementParams adElementParams) {
        BrokenCreativeDetectorParams brokenCreativeDetectorParams = adElementParams.getBrokenCreativeDetectorParams();
        if (brokenCreativeDetectorParams != null) {
            return new io.bidmachine.rendering.internal.detector.brokencreative.a(e().b().getSequence(), adElementParams.getName(), brokenCreativeDetectorParams, this.k);
        }
        return null;
    }

    public final void b(List adElements, boolean z2) {
        Intrinsics.checkNotNullParameter(adElements, "adElements");
        io.bidmachine.rendering.internal.k.b(this.b, "Show AdElements, animated: " + z2, new Object[0]);
        Iterator it = adElements.iterator();
        while (it.hasNext()) {
            b((io.bidmachine.rendering.internal.b) it.next(), z2);
        }
    }

    public final void c(boolean z2) {
        if (this.t.compareAndSet(true, false)) {
            a(this.p, z2);
            a(this.q, z2);
        }
    }

    public final io.bidmachine.rendering.internal.adform.a a(AdElementParams elementParams, io.bidmachine.rendering.internal.adform.c adFormListener) {
        Intrinsics.checkNotNullParameter(elementParams, "elementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        io.bidmachine.rendering.internal.k.b(this.b, "Create AdElement - " + elementParams.getName(), new Object[0]);
        return i().a(this.a, elementParams, adFormListener, a(elementParams.getName()), a(elementParams));
    }

    public final void a(io.bidmachine.rendering.internal.adform.a adForm, io.bidmachine.rendering.internal.adform.c adFormListener) {
        Intrinsics.checkNotNullParameter(adForm, "adForm");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        io.bidmachine.rendering.internal.k.b(this.b, "Load AdElement - " + adForm.g().getName(), new Object[0]);
        io.bidmachine.rendering.internal.controller.d dVar = new io.bidmachine.rendering.internal.controller.d(adForm);
        this.o.put(adForm, dVar);
        try {
            this.n.execute(dVar);
        } catch (Throwable th) {
            adFormListener.c(adForm, Error.INSTANCE.create(th));
        }
    }

    public static /* synthetic */ boolean a(h hVar, io.bidmachine.rendering.internal.adform.a aVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return hVar.a(aVar, z2);
    }

    public final boolean a(io.bidmachine.rendering.internal.adform.a item, boolean z2) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean B = item.B();
        if (B) {
            this.e.a(item, z2, AnimationEventType.Appear);
        }
        return B;
    }

    public final void a(List adElements, boolean z2) {
        Intrinsics.checkNotNullParameter(adElements, "adElements");
        io.bidmachine.rendering.internal.k.b(this.b, "Hide AdElements, animated: " + z2, new Object[0]);
        Iterator it = adElements.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.b) it.next(), z2);
        }
    }

    public final void a(final io.bidmachine.rendering.internal.b adElement, boolean z2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        io.bidmachine.rendering.internal.k.b(this.b, "Hide AdElement - " + adElement.g().getName() + ", animated: " + z2, new Object[0]);
        io.bidmachine.rendering.internal.j jVar = new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.internal.controller.h$$ExternalSyntheticLambda1
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                h.a(io.bidmachine.rendering.internal.b.this);
            }
        };
        if (z2) {
            io.bidmachine.rendering.internal.animation.b.a(this.e, adElement, AnimationEventType.Disappear, false, null, jVar, 12, null);
        } else {
            jVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(io.bidmachine.rendering.internal.b adElement) {
        Intrinsics.checkNotNullParameter(adElement, "$adElement");
        adElement.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(VisibilityChanger visibilityChanger, boolean z2, boolean z3, Runnable runnable) {
        if ((visibilityChanger instanceof io.bidmachine.rendering.internal.b) && this.c.c() && !this.c.j()) {
            this.e.b((io.bidmachine.rendering.internal.b) visibilityChanger, z2 ? AnimationEventType.Appear : AnimationEventType.Disappear, z3, z2 ? runnable : null, z2 ? null : runnable);
        } else {
            runnable.run();
        }
    }

    public final void b(final io.bidmachine.rendering.internal.b adElement, boolean z2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        io.bidmachine.rendering.internal.k.b(this.b, "Show AdElement - " + adElement.g().getName() + ", animated: " + z2, new Object[0]);
        io.bidmachine.rendering.internal.j jVar = new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.internal.controller.h$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                h.b(io.bidmachine.rendering.internal.b.this);
            }
        };
        if (z2) {
            io.bidmachine.rendering.internal.animation.b.a(this.e, adElement, AnimationEventType.Appear, false, jVar, null, 20, null);
        } else {
            jVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(io.bidmachine.rendering.internal.b adElement) {
        Intrinsics.checkNotNullParameter(adElement, "$adElement");
        adElement.c();
    }

    public final void a(final io.bidmachine.rendering.internal.b item, List list) {
        Intrinsics.checkNotNullParameter(item, "item");
        io.bidmachine.rendering.internal.k.b(this.b, "Destroy AdElement - " + item.g().getName(), new Object[0]);
        this.e.a(item);
        if (list != null) {
            list.remove(item);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.internal.controller.h$$ExternalSyntheticLambda4
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.b.this.destroy();
            }
        });
    }

    public final void b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        io.bidmachine.rendering.internal.k.b(this.b, "Destroy TargetObjects", new Object[0]);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.u) it.next(), items);
        }
        items.clear();
    }

    public final void a(List item) {
        Intrinsics.checkNotNullParameter(item, "item");
        io.bidmachine.rendering.internal.k.b(this.b, "Destroy AdElements", new Object[0]);
        Iterator it = item.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.b) it.next(), item);
        }
        item.clear();
    }

    public final Object b(String name) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.isBlank(name)) {
            return null;
        }
        Iterator it = this.p.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals(((io.bidmachine.rendering.internal.b) obj).g().getName(), name, true)) {
                break;
            }
        }
        Object obj3 = (io.bidmachine.rendering.internal.b) obj;
        if (obj3 == null) {
            Iterator it2 = this.q.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (StringsKt.equals(((io.bidmachine.rendering.internal.b) obj2).g().getName(), name, true)) {
                    break;
                }
            }
            obj3 = (io.bidmachine.rendering.internal.b) obj2;
            if (obj3 == null) {
                Iterator it3 = this.r.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (StringsKt.equals(((io.bidmachine.rendering.internal.l) obj3).p().getName(), name, true)) {
                        break;
                    }
                }
            }
        }
        if (obj3 != null) {
            return obj3;
        }
        if (Intrinsics.areEqual(l().o(), name)) {
            return l();
        }
        return null;
    }

    public static /* synthetic */ void a(h hVar, io.bidmachine.rendering.internal.u uVar, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        hVar.a(uVar, list);
    }

    public final void a(final io.bidmachine.rendering.internal.u item, List list) {
        Intrinsics.checkNotNullParameter(item, "item");
        io.bidmachine.rendering.internal.k.b(this.b, "Destroy TargetObject - " + item.o(), new Object[0]);
        if (list != null) {
            TypeIntrinsics.asMutableCollection(list).remove(item);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.internal.controller.h$$ExternalSyntheticLambda3
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                u.this.destroy();
            }
        });
    }

    public final void a(Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.c.a(false)) {
            this.d.a(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(BrokenCreativeEvent brokenCreativeEvent) {
        io.bidmachine.rendering.internal.controller.g n2;
        if (this.c.j() || (n2 = n()) == null) {
            return;
        }
        n2.a(brokenCreativeEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2) {
        io.bidmachine.rendering.internal.k.a(this.b, "EventTask - " + str + ", target object (" + str2 + ") not found", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, String str3) {
        io.bidmachine.rendering.internal.k.a(this.b, "EventTask - " + str + ", target object (" + str2 + ") not " + str3, new Object[0]);
    }

    public final List a(List elementsParams, io.bidmachine.rendering.internal.adform.c adFormListener) {
        Intrinsics.checkNotNullParameter(elementsParams, "elementsParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elementsParams, 10));
        Iterator it = elementsParams.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AdElementParams) it.next(), adFormListener));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((io.bidmachine.rendering.internal.adform.a) it2.next(), adFormListener);
        }
        return arrayList;
    }
}
