package o;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class SL extends AbstractC1166hO {
    public final /* synthetic */ int h;
    public final long i;
    public final Object j;
    public final N8 k;

    public /* synthetic */ SL(Object obj, long j, N8 n8, int i) {
        this.h = i;
        this.j = obj;
        this.i = j;
        this.k = n8;
    }

    @Override // o.AbstractC1166hO
    public final long contentLength() {
        switch (this.h) {
        }
        return this.i;
    }

    @Override // o.AbstractC1166hO
    public final NB contentType() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = NB.d;
                try {
                    return AbstractC0868ct.v(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (NB) obj;
        }
    }

    @Override // o.AbstractC1166hO
    public final N8 source() {
        switch (this.h) {
            case 0:
                return (JL) this.k;
            default:
                return this.k;
        }
    }
}
