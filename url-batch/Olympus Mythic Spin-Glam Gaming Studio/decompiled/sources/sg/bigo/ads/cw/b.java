package sg.bigo.ads.cw;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sg.bigo.ads.an.m;

/* loaded from: classes12.dex */
final class b {
    private static final Pattern d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    private static final Pattern e = Pattern.compile("GET /(.*) HTTP");
    public final String a;
    public final long b;
    public final boolean c;

    private b(String str) {
        m.a(str);
        Matcher matcher = d.matcher(str);
        long parseLong = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
        this.b = Math.max(0L, parseLong);
        this.c = parseLong >= 0;
        Matcher matcher2 = e.matcher(str);
        this.a = matcher2.find() ? matcher2.group(1) : new String();
    }

    public static b a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    return new b(sb.toString());
                }
                sb.append(readLine);
                sb.append('\n');
            }
        } catch (IOException e2) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "GetRequest#read, error message is : " + e2.toString());
            return null;
        }
    }

    public final String toString() {
        return "GetRequest{rangeOffset=" + this.b + ", partial=" + this.c + ", uri='" + this.a + "'}";
    }
}
