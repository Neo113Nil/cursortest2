package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 i;
    public final /* synthetic */ Callback j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.h = i;
        this.i = anonymousClass1;
        this.j = callback;
        this.k = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                this.i.lambda$onResponse$0(this.j, (Response) this.k);
                break;
            default:
                this.i.lambda$onFailure$1(this.j, (Throwable) this.k);
                break;
        }
    }
}
