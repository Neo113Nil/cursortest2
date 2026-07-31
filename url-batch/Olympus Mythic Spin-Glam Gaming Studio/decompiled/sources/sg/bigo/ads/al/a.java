package sg.bigo.ads.al;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class a {
    public final String a;

    @ColorInt
    private final int b;

    @ColorInt
    private final int c;
    private final boolean d;
    private final Bitmap e;
    private final c f;
    private final b g;

    /* renamed from: sg.bigo.ads.al.a$a, reason: collision with other inner class name */
    public static class C1837a {
        public String a;
        public c b;
        public b c;

        @ColorInt
        private int d = 0;

        @ColorInt
        private int e = 0;
        private boolean f = true;
        private Bitmap g;

        public final a a() {
            return new a(this.a, this.d, this.e, this.f, this.g, this.b, this.c);
        }
    }

    public interface b {
        void a(Context context, String str, int i, @Nullable String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i, int i2, boolean z, Bitmap bitmap, c cVar, b bVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = bitmap;
        this.f = cVar;
        this.g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.al.c.a(context, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
