package sg.bigo.ads.an;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public interface k {

    public static class a implements b {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String a() {
            return this.a;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String b() {
            return this.a;
        }

        @Override // sg.bigo.ads.an.k.b
        @Nullable
        public final String c() {
            return "";
        }

        @Override // sg.bigo.ads.an.k.b
        public final boolean d() {
            return false;
        }
    }

    public interface b {
        @Nullable
        String a();

        @Nullable
        String b();

        @Nullable
        String c();

        boolean d();
    }

    @NonNull
    b a(@Nullable String str);
}
