package io.bidmachine.analytics.internal.t;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes15.dex */
public final class b {
    private final e a;
    private final f b;
    private final CoroutineScope c;
    private Job d;

    public interface a {
        b a();
    }

    /* renamed from: io.bidmachine.analytics.internal.t.b$b, reason: collision with other inner class name */
    static final class C1759b extends SuspendLambda implements Function2 {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1759b(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1759b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1759b c1759b = b.this.new C1759b(this.d, continuation);
            c1759b.b = obj;
            return c1759b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            f fVar = b.this.b;
            b bVar = b.this;
            String str = this.d;
            synchronized (fVar) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    InputStream a = bVar.b.a(StringsKt.split$default((CharSequence) io.bidmachine.analytics.internal.I.g.b(str), new String[]{" "}, false, 0, 6, (Object) null));
                    Unit unit = null;
                    BufferedReader bufferedReader = a != null ? new BufferedReader(new InputStreamReader(a, Charsets.UTF_8), 8192) : null;
                    if (bufferedReader != null) {
                        try {
                            bVar.a(str, TextStreamsKt.lineSequence(bufferedReader));
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(bufferedReader, null);
                        } finally {
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        unit = Unit.INSTANCE;
                    }
                    Result.m8023constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public b(e eVar, f fVar, CoroutineScope coroutineScope) {
        this.a = eVar;
        this.b = fVar;
        this.c = coroutineScope;
    }

    private final boolean b() {
        Job job = this.d;
        return job != null && job.isActive();
    }

    public final void a(String str) {
        Job launch$default;
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new C1759b(str, null), 3, null);
        this.d = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Sequence sequence) {
        Iterator it = sequence.iterator();
        while (b() && it.hasNext()) {
            this.a.a(str, (String) it.next());
        }
    }

    public final void a() {
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.d = null;
        synchronized (this.b) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.b.a();
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
