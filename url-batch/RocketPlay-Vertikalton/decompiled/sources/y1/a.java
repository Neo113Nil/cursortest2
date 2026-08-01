package y1;

import i1.f;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4647b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f4646a = str;
        this.f4647b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f4646a;
        f.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f4647b);
        return thread;
    }
}
