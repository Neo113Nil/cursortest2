package sg.bigo.ads.br;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import sg.bigo.ads.an.g;
import sg.bigo.ads.bs.c;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes5.dex */
public final class b {
    @Nullable
    public static URL a(@Nullable Uri uri, @NonNull c<?> cVar, @Nullable g gVar) {
        if (uri == null) {
            return null;
        }
        if (gVar == null || !cVar.o) {
            return new URL(uri.toString());
        }
        Uri.Builder buildUpon = uri.buildUpon();
        a(buildUpon, "sdk_ver", gVar.y());
        a(buildUpon, "sdk_vc", "50900");
        a(buildUpon, "country", gVar.U());
        a(buildUpon, MBridgeConstans.APP_KEY, gVar.a());
        a(buildUpon, "pkg_ver", gVar.c());
        a(buildUpon, "pkg_vc", String.valueOf(gVar.d()));
        a(buildUpon, "os", gVar.i());
        a(buildUpon, "os_ver", gVar.j());
        a(buildUpon, "os_lang", gVar.k());
        a(buildUpon, VastAttributes.VENDOR, gVar.l());
        a(buildUpon, "model", gVar.m());
        a(buildUpon, "dpi", String.valueOf(gVar.p()));
        a(buildUpon, "dpi_f", gVar.q());
        a(buildUpon, "resolution", gVar.o());
        a(buildUpon, "net", gVar.r());
        a(buildUpon, "tz", gVar.s());
        if (cVar.f()) {
            a(buildUpon, "enc", "1");
        }
        return new URL(buildUpon.build().toString());
    }

    private static void a(@Nullable Uri.Builder builder, @Nullable String str, @Nullable String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static boolean a(@NonNull Map<String, Set<String>> map) {
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList("Keep-Alive")));
        }
        Set<String> set = map.get(Command.HTTP_HEADER_RANGE);
        Set<String> set2 = map.get("Accept-Encoding");
        if (!l.a(set) || !l.a(set2)) {
            return false;
        }
        map.put("Accept-Encoding", new HashSet(Collections.singletonList("gzip")));
        return true;
    }

    @Nullable
    public static byte[] a(@NonNull c<?> cVar, @Nullable g gVar) {
        byte[] c = cVar.c();
        if (c == null || c.length == 0) {
            return null;
        }
        if (!(cVar instanceof sg.bigo.ads.bs.b) || gVar == null || !gVar.ay() || sg.bigo.ads.bw.a.G()) {
            return c;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(c);
        gZIPOutputStream.flush();
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ((sg.bigo.ads.bs.b) cVar).i = byteArray.length;
        return byteArray;
    }

    public static boolean b(@NonNull c<?> cVar, @Nullable g gVar) {
        return (cVar instanceof sg.bigo.ads.bs.b) && gVar != null && gVar.ay() && !sg.bigo.ads.bw.a.G();
    }
}
