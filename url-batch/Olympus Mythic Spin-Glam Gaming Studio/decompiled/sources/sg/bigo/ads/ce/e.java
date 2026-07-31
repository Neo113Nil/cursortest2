package sg.bigo.ads.ce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public interface e<Request, Response, U> {
    void a(int i, int i2, int i3, @NonNull String str, @Nullable U u);

    void a(int i, @NonNull Request request, @NonNull Response... responseArr);
}
