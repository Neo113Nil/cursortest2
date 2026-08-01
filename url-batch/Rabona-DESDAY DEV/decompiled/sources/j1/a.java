package j1;

import X0.d;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2605b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f2604a = str;
        this.f2605b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2604a;
        d.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2605b);
        return thread;
    }
}
