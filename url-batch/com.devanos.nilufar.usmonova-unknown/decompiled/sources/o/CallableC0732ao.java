package o;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: o.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0732ao implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C1216i8 d;
    public final /* synthetic */ int e;

    public /* synthetic */ CallableC0732ao(String str, Context context, C1216i8 c1216i8, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = c1216i8;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return AbstractC0994eo.a(this.b, this.c, this.d, this.e);
            default:
                try {
                    return AbstractC0994eo.a(this.b, this.c, this.d, this.e);
                } catch (Throwable unused) {
                    return new C0863co(-3);
                }
        }
    }
}
