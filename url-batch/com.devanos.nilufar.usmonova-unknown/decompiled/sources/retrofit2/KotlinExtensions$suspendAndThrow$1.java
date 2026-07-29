package retrofit2;

import kotlin.Metadata;
import o.AbstractC2367ze;
import o.InterfaceC0986eg;
import o.InterfaceC2235xe;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@InterfaceC0986eg(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
/* loaded from: classes.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends AbstractC2367ze {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(InterfaceC2235xe<? super KotlinExtensions$suspendAndThrow$1> interfaceC2235xe) {
        super(interfaceC2235xe);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
