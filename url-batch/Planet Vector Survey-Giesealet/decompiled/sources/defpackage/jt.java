package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jt {
    public final /* synthetic */ int a;
    public final ContentProviderClient b;

    public jt(Context context, Uri uri, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i = this.a;
        ContentProviderClient contentProviderClient = this.b;
        switch (i) {
            case 0:
                if (contentProviderClient != 0) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            r0.l((ExecutorService) contentProviderClient);
                            break;
                        }
                    } else {
                        contentProviderClient.close();
                        break;
                    }
                }
                break;
        }
    }
}
