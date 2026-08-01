package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f552c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f550a = i2;
        this.f551b = str;
        this.f552c = context;
        this.d = eVar;
        this.f553e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f550a) {
            case 0:
                return i.a(this.f551b, this.f552c, this.d, this.f553e);
            default:
                try {
                    return i.a(this.f551b, this.f552c, this.d, this.f553e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
