package sg.bigo.ads.bt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.h;

/* loaded from: classes15.dex */
public final class d implements c<String> {
    public final a a;
    protected final String b;

    public d(@NonNull a aVar) {
        this.a = aVar;
        this.b = h.a(aVar.b);
    }

    @NonNull
    public final String a() {
        return this.b;
    }

    @Nullable
    public final String a(String str) {
        return this.a.a(str);
    }
}
