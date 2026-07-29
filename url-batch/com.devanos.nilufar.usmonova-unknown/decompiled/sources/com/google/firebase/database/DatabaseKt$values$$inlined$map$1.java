package com.google.firebase.database;

import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1494mO;
import o.AbstractC2367ze;
import o.C0782bY;
import o.InterfaceC0986eg;
import o.InterfaceC2235xe;
import o.InterfaceC2243xm;
import o.InterfaceC2309ym;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/xm;", "Lo/ym;", "collector", "Lo/bY;", "collect", "(Lo/ym;Lo/xe;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class DatabaseKt$values$$inlined$map$1 implements InterfaceC2243xm {
    final /* synthetic */ InterfaceC2243xm $this_unsafeTransform$inlined;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lo/bY;", "emit", "(Ljava/lang/Object;Lo/xe;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements InterfaceC2309ym {
        final /* synthetic */ InterfaceC2309ym $this_unsafeFlow;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
        @InterfaceC0986eg(c = "com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2", f = "Database.kt", l = {223}, m = "emit")
        /* renamed from: com.google.firebase.database.DatabaseKt$values$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC2367ze {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC2235xe interfaceC2235xe) {
                super(interfaceC2235xe);
            }

            @Override // o.Y7
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC2309ym interfaceC2309ym) {
            this.$this_unsafeFlow = interfaceC2309ym;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // o.InterfaceC2309ym
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
            AnonymousClass1 anonymousClass1;
            int i;
            if (interfaceC2235xe instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC2235xe;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.result;
                    i = anonymousClass1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1494mO.l(obj2);
                        return C0782bY.a;
                    }
                    AbstractC1494mO.l(obj2);
                    AbstractC0048Bt.h0();
                    throw null;
                }
            }
            anonymousClass1 = new AnonymousClass1(interfaceC2235xe);
            Object obj22 = anonymousClass1.result;
            i = anonymousClass1.label;
            if (i == 0) {
            }
        }

        public final Object emit$$forInline(Object obj, InterfaceC2235xe interfaceC2235xe) {
            new AnonymousClass1(interfaceC2235xe);
            AbstractC0048Bt.h0();
            throw null;
        }
    }

    public DatabaseKt$values$$inlined$map$1(InterfaceC2243xm interfaceC2243xm) {
        this.$this_unsafeTransform$inlined = interfaceC2243xm;
    }

    @Override // o.InterfaceC2243xm
    public Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        AbstractC0048Bt.h0();
        throw null;
    }

    public Object collect$$forInline(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        new AbstractC2367ze(interfaceC2235xe) { // from class: com.google.firebase.database.DatabaseKt$values$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // o.Y7
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return DatabaseKt$values$$inlined$map$1.this.collect(null, this);
            }
        };
        AbstractC0048Bt.h0();
        throw null;
    }
}
