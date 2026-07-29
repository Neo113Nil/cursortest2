package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.gX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC1109gX {
    public static final C0977eX h;
    public static final C0846cX i;
    public static final C1043fX j;
    public static final C0912dX k;
    public static final /* synthetic */ EnumC1109gX[] l;

    static {
        C0977eX c0977eX = new C0977eX();
        h = c0977eX;
        C0846cX c0846cX = new C0846cX();
        i = c0846cX;
        C1043fX c1043fX = new C1043fX();
        j = c1043fX;
        C0912dX c0912dX = new C0912dX();
        k = c0912dX;
        l = new EnumC1109gX[]{c0977eX, c0846cX, c1043fX, c0912dX};
    }

    public static EnumC1109gX b(AbstractC2097vY abstractC2097vY) {
        AbstractC0048Bt.n(abstractC2097vY, "<this>");
        if (abstractC2097vY.C0()) {
            return i;
        }
        if (abstractC2097vY instanceof C0632Yg) {
        }
        return AbstractC1473m3.J(AbstractC1305jX.n(false, null, 24), AbstractC0868ct.M(abstractC2097vY), QW.b) ? k : j;
    }

    public static EnumC1109gX valueOf(String str) {
        return (EnumC1109gX) Enum.valueOf(EnumC1109gX.class, str);
    }

    public static EnumC1109gX[] values() {
        return (EnumC1109gX[]) l.clone();
    }

    public abstract EnumC1109gX a(AbstractC2097vY abstractC2097vY);
}
