package sg.bigo.ads.ck;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.an.k;
import sg.bigo.ads.cf.i;

/* loaded from: classes15.dex */
public final class e implements k {

    @Nullable
    protected final sg.bigo.ads.cf.b a;

    static class a implements k.b {

        @Nullable
        private final String a;

        @Nullable
        private final String b;
        private final boolean c;

        @Nullable
        private final String d;

        public a(@Nullable String str, @Nullable i iVar) {
            this.a = str;
            if (iVar != null) {
                boolean c = iVar.c();
                this.c = c;
                this.b = iVar.a();
                str = sg.bigo.ads.common.utils.c.a(str, c ? iVar.b() : iVar.a());
            } else {
                this.c = false;
                this.b = "";
            }
            this.d = str;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String a() {
            return this.d;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String b() {
            return this.a;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String c() {
            return this.b;
        }

        @Override // sg.bigo.ads.an.k.b
        public final boolean d() {
            return this.c;
        }
    }

    public e(@Nullable sg.bigo.ads.cf.b bVar) {
        this.a = bVar;
    }

    @Override // sg.bigo.ads.an.k
    @NonNull
    public final k.b a(@Nullable String str) {
        sg.bigo.ads.cf.b bVar = this.a;
        return new a(str, bVar != null ? bVar.a.i.b : null);
    }
}
