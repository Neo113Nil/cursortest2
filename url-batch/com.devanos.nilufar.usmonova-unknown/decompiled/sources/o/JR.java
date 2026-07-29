package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class JR extends AbstractC2097vY implements MR, NW {
    @Override // o.AbstractC2097vY
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public abstract JR F0(boolean z);

    @Override // o.AbstractC2097vY
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract JR H0(OW ow);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C2304yh.e.x((InterfaceC0948e4) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(B0());
        if (!w0().isEmpty()) {
            AbstractC0720ac.s0(w0(), sb, ", ", "<", ">", null, 112);
        }
        if (C0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
