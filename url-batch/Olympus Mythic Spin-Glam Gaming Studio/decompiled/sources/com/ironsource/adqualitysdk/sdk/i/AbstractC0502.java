package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ι, reason: contains not printable characters */
/* loaded from: classes11.dex */
public abstract class AbstractC0502 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0954 m4026(C0785 c0785, C0880 c0880) {
        try {
            c0785.f1845.add(this);
            C0954 mo3961 = mo3961(c0785, c0880);
            c0785.f1844.remove(this);
            int lastIndexOf = c0785.f1845.lastIndexOf(this);
            if (lastIndexOf >= 0) {
                c0785.f1845 = new ArrayList(c0785.f1845.subList(0, lastIndexOf));
            }
            return mo3961;
        } catch (AbstractC0441 e) {
            throw e;
        } catch (Throwable th) {
            throw new C1262(c0880, c0785, th.getMessage() != null ? th.getMessage() : StringFog.decrypt("ofz/r/RrxCqC2trg3w==\n", "8q6zj7ETp08=\n"), th);
        }
    }

    /* renamed from: ﾒ */
    public int mo3960() {
        return 1;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public int mo4027(C0785 c0785) {
        return 1;
    }

    /* renamed from: ﾒ */
    public abstract C0954 mo3961(C0785 c0785, C0880 c0880);
}
