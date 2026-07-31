package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* loaded from: classes14.dex */
public final class xh0 implements f31 {
    public final /* synthetic */ DivImageDownloadCallback a;
    public final /* synthetic */ String b;

    public xh0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.a = divImageDownloadCallback;
        this.b = str;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        this.a.onError();
    }

    @Override // yads.f31
    public final void a(e31 e31Var, boolean z) {
        Bitmap bitmap = e31Var.a;
        if (bitmap != null) {
            this.a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.b), z ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }
}
