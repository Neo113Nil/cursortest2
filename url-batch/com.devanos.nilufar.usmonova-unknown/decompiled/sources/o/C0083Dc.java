package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: o.Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0083Dc implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0083Dc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$2;
        Object lambda$intoSet$4;
        Object lambda$intoSet$3;
        Object lambda$of$0;
        Object lambda$of$1;
        switch (this.a) {
            case 0:
                lambda$of$2 = Component.lambda$of$2(this.b, componentContainer);
                return lambda$of$2;
            case 1:
                lambda$intoSet$4 = Component.lambda$intoSet$4(this.b, componentContainer);
                return lambda$intoSet$4;
            case 2:
                lambda$intoSet$3 = Component.lambda$intoSet$3(this.b, componentContainer);
                return lambda$intoSet$3;
            case 3:
                lambda$of$0 = Component.lambda$of$0(this.b, componentContainer);
                return lambda$of$0;
            default:
                lambda$of$1 = Component.lambda$of$1(this.b, componentContainer);
                return lambda$of$1;
        }
    }
}
