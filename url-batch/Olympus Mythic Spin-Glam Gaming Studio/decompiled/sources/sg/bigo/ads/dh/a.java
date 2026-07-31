package sg.bigo.ads.dh;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.bidmachine.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public final List<C1889a> a = new ArrayList();
    public final List<C1889a> b = new ArrayList();

    /* renamed from: sg.bigo.ads.dh.a$a, reason: collision with other inner class name */
    public static final class C1889a {
        public final String a;
        public final String b;
        public final int c;
        public final int d;

        @Nullable
        public final String e;

        public C1889a(String str, int i, int i2, @Nullable String str2, String str3) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.e) || "image/png".equalsIgnoreCase(this.e);
        }

        public final boolean c() {
            return MimeTypes.IMAGE_GIF.equalsIgnoreCase(this.e);
        }
    }

    public static C1889a a(List<C1889a> list) {
        if (list == null) {
            return null;
        }
        for (C1889a c1889a : list) {
            if (c1889a != null) {
                return c1889a;
            }
        }
        return null;
    }

    @Nullable
    public final C1889a a() {
        return a(this.a);
    }
}
