package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3936d7 implements FlowCollector {
    public final CoroutineScope a;
    public final ViewGroup b;
    public final long c;
    public final MutableStateFlow d;
    public final InterfaceC4466x9 e;
    public Job f;

    public C3936d7(long j, ViewGroup view, InterfaceC4466x9 interfaceC4466x9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.a = coroutineScope;
        this.b = view;
        this.c = j;
        this.d = visibilityStateFlow;
        this.e = interfaceC4466x9;
    }

    public final Unit a(boolean z) {
        Job launch$default;
        InterfaceC4466x9 interfaceC4466x9 = this.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z);
        }
        if (z) {
            InterfaceC4466x9 interfaceC4466x92 = this.e;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            P6.a(this.f);
            this.f = null;
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.e;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new C3910c7(this, null), 3, null);
            this.f = launch$default;
        }
        boolean z2 = this.b.getWindowVisibility() == 0;
        InterfaceC4466x9 interfaceC4466x94 = this.e;
        if (interfaceC4466x94 != null) {
            ((C4493y9) interfaceC4466x94).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z2);
        }
        this.d.setValue(Boxing.boxBoolean(z2));
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
