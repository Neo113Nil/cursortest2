package sg.bigo.ads.dm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.ai.k;

/* loaded from: classes3.dex */
public class b extends e {
    private final a a;

    @Nullable
    private sg.bigo.ads.dm.c b;
    boolean g;
    public final C1891b h;
    public c i;

    static class a {

        @NonNull
        private final b a;

        @NonNull
        private final C1891b b;

        public a(@NonNull b bVar, @NonNull C1891b c1891b) {
            this.a = bVar;
            this.b = c1891b;
        }

        @JavascriptInterface
        public final void onCustomJSEventCallback(String str, String str2) {
            sg.bigo.ads.dm.c customWebChromeClient = this.a.getCustomWebChromeClient();
            if (customWebChromeClient != null) {
                customWebChromeClient.a(this.a, str, str2);
            }
        }

        @JavascriptInterface
        public final void webCollect(String str) {
            C1891b c1891b = this.b;
            if (c1891b.a == null) {
                c1891b.a = new ArrayList();
            }
            if (str.contains("notify") && !str.startsWith(X3.j.d)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                    str = jSONObject.toString();
                } catch (Exception unused) {
                }
            }
            c1891b.a.add(str);
        }

        @JavascriptInterface
        public final void webStat(String str, String str2) {
        }
    }

    /* renamed from: sg.bigo.ads.dm.b$b, reason: collision with other inner class name */
    public static class C1891b {
        List<String> a;
        List<String> b;

        @Nullable
        public Boolean c;

        @Nullable
        public Boolean d;
        public long e = -1;
        public long f = -1;
        public long g = -1;

        final boolean a(String str) {
            List<String> list = this.b;
            if (str != null && list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class c {
        private Boolean b;

        private c() {
        }

        public /* synthetic */ c(b bVar, byte b) {
            this();
        }

        private static boolean a(int[] iArr) {
            if (iArr.length <= 0) {
                return false;
            }
            int length = iArr.length;
            int i = length - 1;
            int i2 = 0;
            while (true) {
                int i3 = length / 2;
                if (i2 >= i3 || i < i3) {
                    return true;
                }
                if (iArr[i2] != iArr[i]) {
                    return false;
                }
                i2++;
                i--;
            }
        }

        public final Boolean a() {
            Boolean bool = this.b;
            if (bool != null) {
                return bool;
            }
            if (b.this.j) {
                return null;
            }
            int width = b.this.getWidth();
            int height = b.this.getHeight();
            if (width > 0 && height > 0) {
                try {
                    int[] iArr = new int[width * height];
                    Bitmap a = sg.bigo.ads.common.utils.e.a(width, height, Bitmap.Config.RGB_565);
                    if (a == null) {
                        return null;
                    }
                    b.this.draw(new Canvas(a));
                    a.getPixels(iArr, 0, width, 0, 0, width, height);
                    a.recycle();
                    this.b = Boolean.valueOf(!a(iArr));
                    return this.b;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public b(Context context) {
        super(context);
        this.g = false;
        C1891b c1891b = new C1891b();
        this.h = c1891b;
        a aVar = new a(this, c1891b);
        this.a = aVar;
        addJavascriptInterface(aVar, "bigossp");
    }

    public static void a(@NonNull C1891b c1891b) {
        List<String> list;
        JSONObject optJSONObject;
        if (!k.a.n().a(0) || (list = c1891b.a) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (str.startsWith(X3.j.d)) {
                sb.append(str.substring(1, str.length() - 1));
                sb.append(StringUtils.COMMA);
            }
            sb.append(str);
            sb.append(StringUtils.COMMA);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(X3.j.d + sb.substring(0, sb.length() - 1) + X3.j.e);
            int length = jSONArray2.length();
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = jSONArray2.optJSONObject(i);
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("type");
                    if ("render_start".equals(optString)) {
                        jSONObject = optJSONObject2;
                    }
                    if ("render".equals(optString) && jSONObject2 == null) {
                        jSONObject2 = optJSONObject2;
                    }
                    if (!"mayError".equals(optString) || ((optJSONObject = optJSONObject2.optJSONObject("params")) != null && c1891b.a(optJSONObject.optString("url")))) {
                        jSONArray.put(optJSONObject2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sg.bigo.ads.da.b.a(3002, 10113, jSONArray.toString());
            }
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    c1891b.c = Boolean.TRUE;
                    c1891b.e = jSONObject2.optLong(BidResponsed.KEY_CUR);
                } else {
                    c1891b.c = Boolean.FALSE;
                    c1891b.e = SystemClock.elapsedRealtime();
                }
            }
        } catch (Exception unused) {
        }
    }

    final void a(int i, WebResourceRequest webResourceRequest, int i2, CharSequence charSequence) {
        if (webResourceRequest != null) {
            Objects.toString(webResourceRequest.getUrl());
            Objects.toString(charSequence);
            C1891b c1891b = this.h;
            String valueOf = String.valueOf(webResourceRequest.getUrl());
            if (c1891b.b == null) {
                c1891b.b = new ArrayList();
            }
            c1891b.b.add(valueOf);
        }
    }

    @Nullable
    public sg.bigo.ads.dm.c getCustomWebChromeClient() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.b = webChromeClient instanceof sg.bigo.ads.dm.c ? (sg.bigo.ads.dm.c) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }
}
