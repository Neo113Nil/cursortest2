package sg.bigo.ads.bp;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.util.network.NetworkUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.br.a;
import sg.bigo.ads.common.utils.i;

/* loaded from: classes14.dex */
public final class d {

    @NonNull
    final HttpURLConnection a;
    final int b;
    final i<List<String>> c;
    private final c d;
    private final String e;
    private final boolean f;

    public static class a extends a.C1855a {
        public a(@Nullable URL url, @Nullable String str, int i, @NonNull String str2, int i2) {
            super(url, str, i, str2, i2);
        }
    }

    public d(@NonNull c cVar) {
        this.d = cVar;
        HttpURLConnection a2 = cVar.a();
        this.a = a2;
        this.b = a2.getResponseCode();
        this.e = a2.getRequestMethod();
        i<List<String>> iVar = new i<>();
        this.c = iVar;
        Map<String, List<String>> headerFields = a2.getHeaderFields();
        if (headerFields != null) {
            iVar.a(headerFields);
        }
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(a2.getContentEncoding());
        this.f = equalsIgnoreCase;
        if (equalsIgnoreCase && cVar.c) {
            iVar.b("Content-Encoding");
            iVar.b(NetworkUtils.HEADER_CONTENT_LENGTH);
        }
    }

    @Nullable
    private String a(String str) {
        List<String> a2 = this.c.a(str);
        int size = a2 != null ? a2.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = a2.get(0);
        }
        return str2;
    }

    public final InputStream a() {
        InputStream inputStream = this.a.getInputStream();
        return (this.f && this.d.c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    public final a b() {
        int i = this.b;
        if (i != 307 && i != 308) {
            switch (i) {
            }
            return null;
        }
        a.C1855a a2 = sg.bigo.ads.br.a.a(this.b, a(NetworkUtils.HEADER_LOCATION), this.e, this.a.getURL(), this.d.b);
        if (a2 == null) {
            return null;
        }
        return new a(a2.a, a2.b, a2.c, a2.d, a2.e);
    }
}
