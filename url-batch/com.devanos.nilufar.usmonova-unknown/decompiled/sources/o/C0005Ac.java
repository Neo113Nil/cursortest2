package o;

/* renamed from: o.Ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005Ac implements InterfaceC2235xe {
    public static final C0005Ac i = new C0005Ac(0);
    public static final C0005Ac j = new C0005Ac(1);
    public final /* synthetic */ int h;

    public /* synthetic */ C0005Ac(int i2) {
        this.h = i2;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        switch (this.h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C1188hk.h;
        }
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        switch (this.h) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.h) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
