package sg.bigo.ads.api.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class g {

    @NonNull
    public final b a;

    @NonNull
    public final sg.bigo.ads.ai.n b;

    @NonNull
    public final sg.bigo.ads.api.b c;

    @Nullable
    public sg.bigo.ads.an.g d;
    public final Context e;
    public final Context f;

    public static class a {

        @Nullable
        public sg.bigo.ads.an.g a;

        @NonNull
        private final b b;

        @NonNull
        private final sg.bigo.ads.ai.n c;

        @NonNull
        private final sg.bigo.ads.api.b d;

        @NonNull
        private final Context e;
        private final Context f;

        public a(@NonNull b bVar, @NonNull sg.bigo.ads.ai.n nVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
            this.b = bVar;
            this.c = nVar;
            this.d = bVar2;
            this.e = context;
            this.f = context2;
        }

        public final g a() {
            g gVar = new g(this.b, this.c, this.d, this.e, this.f, (byte) 0);
            gVar.d = this.a;
            return gVar;
        }
    }

    private g(@NonNull b bVar, @NonNull sg.bigo.ads.ai.n nVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
        this.a = bVar;
        this.b = nVar;
        this.c = bVar2;
        this.e = context;
        this.f = context2;
    }

    /* synthetic */ g(b bVar, sg.bigo.ads.ai.n nVar, sg.bigo.ads.api.b bVar2, Context context, Context context2, byte b) {
        this(bVar, nVar, bVar2, context, context2);
    }

    public final g a(b bVar) {
        g gVar = new g(bVar, this.b, this.c, this.e, this.f);
        gVar.d = this.d;
        return gVar;
    }
}
