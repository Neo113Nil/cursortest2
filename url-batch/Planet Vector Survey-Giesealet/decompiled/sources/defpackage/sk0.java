package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class sk0 extends h9 {
    public sk0(kj kjVar) {
        super(kjVar);
        if (kjVar == null || kjVar.getContext() == up.d) {
            return;
        }
        g8.r("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return up.d;
    }
}
