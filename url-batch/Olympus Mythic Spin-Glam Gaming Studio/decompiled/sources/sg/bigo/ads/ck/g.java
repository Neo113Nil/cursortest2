package sg.bigo.ads.ck;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.an.j;
import sg.bigo.ads.cn.n;

/* loaded from: classes15.dex */
public final class g extends a {
    public g(@NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar) {
        super(gVar, bVar);
    }

    @Override // sg.bigo.ads.an.j
    public final void a(@NonNull Map<String, Object> map, final j.a aVar) {
        new n(map, this.a, this.b, new sg.bigo.ads.ce.b() { // from class: sg.bigo.ads.ck.g.1
            @Override // sg.bigo.ads.ce.e
            public final void a(int i, int i2, int i3, @NonNull String str, @Nullable Object obj) {
                aVar.a(i2, i3, str);
            }

            @Override // sg.bigo.ads.ce.b
            public final void a(int i, @NonNull String str) {
                aVar.a();
            }
        }).b();
    }
}
