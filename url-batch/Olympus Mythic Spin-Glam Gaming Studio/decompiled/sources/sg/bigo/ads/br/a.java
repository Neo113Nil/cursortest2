package sg.bigo.ads.br;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4701ic;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.pubmatic.sdk.video.POBVastError;
import java.net.URL;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: sg.bigo.ads.br.a$a, reason: collision with other inner class name */
    public static class C1855a {

        @Nullable
        public final URL a;

        @Nullable
        public final String b;
        public final int c;

        @NonNull
        public final String d;
        public final int e;

        public C1855a(@Nullable URL url, @Nullable String str, int i, @NonNull String str2, int i2) {
            this.a = url;
            this.b = str;
            this.c = i;
            this.d = str2;
            this.e = i2;
        }
    }

    @Nullable
    private static URL a(@Nullable URL url, @NonNull String str) {
        try {
            return new URL(url, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static C1855a a(int i, @Nullable String str, @NonNull String str2, @Nullable URL url, @Nullable URL url2) {
        if (i == 307 || i == 308) {
            if (str2.equalsIgnoreCase(C4701ic.a) || str2.equalsIgnoreCase("HEAD")) {
                return new C1855a(null, str, 0, "", i);
            }
            return new C1855a(null, str, IronSourceError.ERROR_NT_LOAD_NO_FILL, "redirect code(" + i + ") is only available for GET or HEAD method, current request method is " + str2, i);
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case POBVastError.NO_VAST_RESPONSE /* 303 */:
                if (TextUtils.isEmpty(str)) {
                    return new C1855a(null, str, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "empty location.", i);
                }
                URL a = a(url, str);
                if (a == null) {
                    return new C1855a(null, str, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + str + "\" is not a network url.", i);
                }
                String url3 = a.toString();
                if (url != null && TextUtils.equals(url3, url.toString())) {
                    return new C1855a(a, str, IronSourceError.ERROR_NT_LOAD_EXCEPTION, "redirect to the same url, location is " + str + ", redirectURL is " + url3, i);
                }
                if (url2 == null || !TextUtils.equals(url3, url2.toString())) {
                    return new C1855a(a, str, 0, "", i);
                }
                return new C1855a(a, str, 704, "redirect to origin url, location is " + str + ", redirectURL is " + url3, i);
            default:
                return null;
        }
    }
}
