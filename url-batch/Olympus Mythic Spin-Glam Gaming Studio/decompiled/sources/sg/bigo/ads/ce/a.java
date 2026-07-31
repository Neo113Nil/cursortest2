package sg.bigo.ads.ce;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.core.g;

/* loaded from: classes13.dex */
public final class a implements c {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // sg.bigo.ads.ce.e
    public final void a(int i, int i2, int i3, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, n> pair) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(i, i2, i3, str, pair);
        }
    }

    @Override // sg.bigo.ads.ce.e
    public final /* bridge */ /* synthetic */ void a(int i, @NonNull sg.bigo.ads.api.b bVar, @NonNull g[] gVarArr) {
        sg.bigo.ads.api.b bVar2 = bVar;
        g[] gVarArr2 = gVarArr;
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(i, bVar2, gVarArr2);
        }
    }
}
