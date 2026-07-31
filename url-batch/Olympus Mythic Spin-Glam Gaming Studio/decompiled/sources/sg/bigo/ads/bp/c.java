package sg.bigo.ads.bp;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.util.network.NetworkUtils;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.an.g;
import sg.bigo.ads.bo.f;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes14.dex */
public final class c {
    final sg.bigo.ads.bs.c<? extends sg.bigo.ads.bo.a> a;
    URL b;
    boolean c;
    private final b d;
    private final g e;

    @Nullable
    private final URL f;
    private int g;
    private HttpURLConnection h;

    private c(@NonNull sg.bigo.ads.bs.c cVar, @Nullable URL url, @Nullable URL url2, @NonNull b bVar, @Nullable g gVar) {
        this.c = false;
        this.a = cVar;
        this.b = url;
        this.f = url2;
        this.d = bVar;
        this.e = gVar;
        Objects.toString(cVar);
        Objects.toString(url2);
        cVar.d();
    }

    public c(@NonNull sg.bigo.ads.bs.c cVar, @NonNull b bVar, @Nullable g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    public final HttpURLConnection a() {
        URL a;
        HttpURLConnection httpURLConnection;
        String l;
        URL url = this.f;
        String str = null;
        if (url != null) {
            a = url == null ? null : sg.bigo.ads.br.b.a(Uri.parse(url.toString()), this.a, this.e);
        } else {
            this.a.a("PreHost");
            T t = this.a.k;
            String a2 = t.a();
            String f = t.f();
            String d = t.d();
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(d) && !TextUtils.equals(f, d)) {
                this.a.a("PreHost", f);
            }
            if (t.e()) {
                this.a.a("Host", d);
            }
            this.a.h();
            a = sg.bigo.ads.br.b.a(Uri.parse(a2), this.a, this.e);
            this.b = a;
        }
        boolean equalsIgnoreCase = "HTTPS".equalsIgnoreCase(a.getProtocol());
        URLConnection openConnection = a.openConnection();
        this.h = equalsIgnoreCase ? (HttpsURLConnection) openConnection : (HttpURLConnection) openConnection;
        this.h.setInstanceFollowRedirects(false);
        this.h.setDoInput(true);
        this.h.setUseCaches(false);
        this.h.setConnectTimeout((int) this.a.m);
        this.h.setReadTimeout((int) this.a.m);
        this.h.setRequestMethod(this.a.a());
        Map<String, Set<String>> map = this.a.n;
        this.c = sg.bigo.ads.br.b.a(map);
        if (!map.containsKey("Host")) {
            try {
                b bVar = this.d;
                String host = this.h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.a.get(host);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("Host", new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !l.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] a3 = sg.bigo.ads.br.b.a(this.a, this.e);
        if (a3 != null) {
            f b = this.a.b();
            if (b != null) {
                this.h.setRequestProperty("Content-Type", b.toString());
            }
            this.h.setDoOutput(true);
            if (sg.bigo.ads.br.b.b(this.a, this.e)) {
                this.h.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection = this.h;
                l = String.valueOf(a3.length);
            } else {
                httpURLConnection = this.h;
                l = Long.toString(this.a.e());
            }
            httpURLConnection.setRequestProperty(NetworkUtils.HEADER_CONTENT_LENGTH, l);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.h.getOutputStream());
            bufferedOutputStream.write(a3);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.h;
    }

    @NonNull
    public final c a(@NonNull URL url) {
        c cVar = new c(this.a, this.b, url, this.d, this.e);
        cVar.g = this.g + 1;
        return cVar;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f != null) {
            sb.append("originUrl=");
            sb.append(this.a.g());
            sb.append(", redirectURL=");
            sb.append(this.f);
            sb.append(", redirectCount=");
            sb.append(this.g);
        } else {
            sb.append("requestUrl=");
            sb.append(this.a.g());
        }
        return sb.toString();
    }
}
