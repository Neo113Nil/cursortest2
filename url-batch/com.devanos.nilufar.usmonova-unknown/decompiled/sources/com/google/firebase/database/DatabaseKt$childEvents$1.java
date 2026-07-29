package com.google.firebase.database;

import kotlin.Metadata;
import o.AbstractC0022At;
import o.AbstractC0048Bt;
import o.AbstractC1494mO;
import o.AbstractC1596ny;
import o.AbstractC2225xU;
import o.C0782bY;
import o.EnumC0448Re;
import o.InterfaceC0986eg;
import o.InterfaceC1455lp;
import o.InterfaceC2214xJ;
import o.InterfaceC2235xe;
import o.InterfaceC2312yp;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/xJ;", "Lcom/google/firebase/database/ChildEvent;", "Lo/bY;", "<anonymous>", "(Lo/xJ;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC0986eg(c = "com.google.firebase.database.DatabaseKt$childEvents$1", f = "Database.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatabaseKt$childEvents$1 extends AbstractC2225xU implements InterfaceC2312yp {
    final /* synthetic */ Query $this_childEvents;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/bY;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.firebase.database.DatabaseKt$childEvents$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC1596ny implements InterfaceC1455lp {
        final /* synthetic */ ChildEventListener $listener;
        final /* synthetic */ Query $this_childEvents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Query query, ChildEventListener childEventListener) {
            super(0);
            this.$this_childEvents = query;
            this.$listener = childEventListener;
        }

        @Override // o.InterfaceC1455lp
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return C0782bY.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            this.$this_childEvents.removeEventListener(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseKt$childEvents$1(Query query, InterfaceC2235xe<? super DatabaseKt$childEvents$1> interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.$this_childEvents = query;
    }

    @Override // o.Y7
    public final InterfaceC2235xe<C0782bY> create(Object obj, InterfaceC2235xe<?> interfaceC2235xe) {
        DatabaseKt$childEvents$1 databaseKt$childEvents$1 = new DatabaseKt$childEvents$1(this.$this_childEvents, interfaceC2235xe);
        databaseKt$childEvents$1.L$0 = obj;
        return databaseKt$childEvents$1;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2214xJ interfaceC2214xJ = (InterfaceC2214xJ) this.L$0;
            Query query = this.$this_childEvents;
            ChildEventListener addChildEventListener = query.addChildEventListener(new DatabaseKt$childEvents$1$listener$1(query, interfaceC2214xJ));
            AbstractC0048Bt.m(addChildEventListener, "Query.childEvents\n  get(…  }\n          }\n        )");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_childEvents, addChildEventListener);
            this.label = 1;
            Object g = AbstractC0022At.g(interfaceC2214xJ, anonymousClass1, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (g == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(InterfaceC2214xJ interfaceC2214xJ, InterfaceC2235xe<? super C0782bY> interfaceC2235xe) {
        return ((DatabaseKt$childEvents$1) create(interfaceC2214xJ, interfaceC2235xe)).invokeSuspend(C0782bY.a);
    }
}
