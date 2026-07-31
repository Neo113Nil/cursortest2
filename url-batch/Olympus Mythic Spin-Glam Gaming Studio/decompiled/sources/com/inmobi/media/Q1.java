package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes12.dex */
public final class Q1 implements FlowCollector {
    public final CoroutineScope a;
    public final ViewGroup b;
    public final MutableStateFlow c;
    public final long d;
    public final InterfaceC4466x9 e;
    public Job f;

    public Q1(long j, ViewGroup observableView, InterfaceC4466x9 interfaceC4466x9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.a = coroutineScope;
        this.b = observableView;
        this.c = visibilityStateFlow;
        this.d = j;
        this.e = interfaceC4466x9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r14.collect(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Q1 q1, ViewGroup viewGroup, CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        O1 o1;
        int i;
        q1.getClass();
        if (continuationImpl instanceof O1) {
            o1 = (O1) continuationImpl;
            int i2 = o1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1.c = i2 - Integer.MIN_VALUE;
                Object obj = o1.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = o1.c;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                F5.a.getClass();
                if (F5.B()) {
                    InterfaceC4466x9 interfaceC4466x9 = q1.e;
                    if (interfaceC4466x9 != null) {
                        ((C4493y9) interfaceC4466x9).a("WindowLifecycleHandler", "startObservingVisibility - Using window visibility observer (UDC+)");
                    }
                    StateFlow stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new dp(viewGroup, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.Companion.getEagerly(), Boxing.boxBoolean(viewGroup.getWindowVisibility() == 0));
                    P1 p1 = new P1(q1);
                    o1.c = 1;
                } else {
                    InterfaceC4466x9 interfaceC4466x92 = q1.e;
                    if (interfaceC4466x92 != null) {
                        ((C4493y9) interfaceC4466x92).a("WindowLifecycleHandler", "startObservingVisibility - Using window focus observer (pre-UDC)");
                    }
                    StateFlow stateIn2 = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new bp(viewGroup, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.Companion.getEagerly(), Boxing.boxBoolean(viewGroup.isFocused()));
                    C3936d7 c3936d7 = new C3936d7(q1.d, viewGroup, q1.e, coroutineScope, q1.c);
                    o1.c = 2;
                }
                return coroutine_suspended;
            }
        }
        o1 = new O1(q1, continuationImpl);
        Object obj2 = o1.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o1.c;
        if (i == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }

    public final Unit a(boolean z) {
        Job launch$default;
        InterfaceC4466x9 interfaceC4466x9 = this.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z);
        }
        if (z) {
            InterfaceC4466x9 interfaceC4466x92 = this.e;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new N1(this, null), 3, null);
            this.f = launch$default;
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.e;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.c.setValue(Boxing.boxBoolean(false));
            P6.a(this.f);
            this.f = null;
        }
        return Unit.INSTANCE;
    }
}
