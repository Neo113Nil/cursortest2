package sg.bigo.ads.bw;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* loaded from: classes12.dex */
public final class c {

    public static final class a {
        private static a a;
        private final C1859a b = new C1859a();

        /* renamed from: sg.bigo.ads.bw.c$a$a, reason: collision with other inner class name */
        static class C1859a {
            C1859a() {
            }

            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (a == null) {
                a = new a();
            }
            return a;
        }
    }
}
