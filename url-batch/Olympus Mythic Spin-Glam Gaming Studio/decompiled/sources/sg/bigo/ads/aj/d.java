package sg.bigo.ads.aj;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;

/* loaded from: classes12.dex */
public interface d<T extends Ad> {

    public interface a<T extends Ad> {
        void a(T t);

        void a(T t, int i, int i2, String str);

        void a(T t, boolean z, int i, int i2, String str, boolean z2);
    }

    void a(@NonNull a<T> aVar);
}
