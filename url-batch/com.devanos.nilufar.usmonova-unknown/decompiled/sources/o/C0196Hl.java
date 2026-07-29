package o;

import java.io.Serializable;

/* renamed from: o.Hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196Hl extends AbstractC2367ze {
    public Serializable h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0274Kl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196Hl(C0274Kl c0274Kl, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c0274Kl;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
