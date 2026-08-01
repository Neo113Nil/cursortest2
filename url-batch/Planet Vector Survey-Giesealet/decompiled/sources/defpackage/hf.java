package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hf implements kj {
    public static final hf e = new hf(0);
    public static final hf f = new hf(1);
    public final /* synthetic */ int d;

    public /* synthetic */ hf(int i) {
        this.d = i;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return up.d;
        }
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
