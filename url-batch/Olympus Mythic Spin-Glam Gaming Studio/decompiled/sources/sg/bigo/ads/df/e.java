package sg.bigo.ads.df;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.k;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes3.dex */
public final class e {
    int a;
    String b;
    int c;
    int d;
    public boolean e;
    JSONObject f;
    private String g;
    private String h;
    private String[] i;
    private String[] j;
    private String k;
    private int l;
    private final Map<String, String> m;
    private sg.bigo.ads.an.g n;

    e(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public e(JSONObject jSONObject, sg.bigo.ads.an.g gVar) {
        this.n = gVar;
        this.f = jSONObject;
        this.m = new HashMap();
        this.a = jSONObject.optInt("type", 0);
        this.g = jSONObject.optString("value", "");
        this.b = jSONObject.optString("name", "");
        this.h = jSONObject.optString(CommonUrlParts.UUID, "");
        this.l = jSONObject.optInt("expired");
        this.c = jSONObject.optInt("replace", 0);
        this.d = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray != null) {
            this.i = new String[optJSONArray.length()];
            this.j = new String[optJSONArray.length()];
            a(optJSONArray);
        }
        this.k = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.optJSONObject(i) != null) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                this.i[i] = optJSONObject.optString("token", "");
                this.j[i] = optJSONObject.optString("value", "");
            }
        }
    }

    private boolean f() {
        return this.c == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String g() {
        char c;
        long a;
        int d;
        if (TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.b)) {
            return "";
        }
        String trim = this.g.trim();
        if (this.i != null && this.j != null && this.n != null) {
            for (int i = 0; i < this.i.length; i++) {
                String str = this.j[i];
                switch (str.hashCode()) {
                    case -2138759690:
                        if (str.equals("regist_time")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2076227591:
                        if (str.equals("timezone")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1795462070:
                        if (str.equals("express_id")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1600030548:
                        if (str.equals("resolution")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1273393189:
                        if (str.equals("sec_price")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1229750878:
                        if (str.equals("sec_bidder")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1182905495:
                        if (str.equals("os_lang")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1174888717:
                        if (str.equals("gps_adid")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1029004888:
                        if (str.equals("ad_imp_indx")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1007979832:
                        if (str.equals("os_ver")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522696:
                        if (str.equals("pkg_ch")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -986522112:
                        if (str.equals("pkg_vc")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -934795532:
                        if (str.equals("region")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case -906980142:
                        if (str.equals("sdk_vc")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -820075192:
                        if (str.equals(VastAttributes.VENDOR)) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -793620671:
                        if (str.equals(MBridgeConstans.APP_KEY)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -777008198:
                        if (str.equals("click_prop")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -693230854:
                        if (str.equals("first_price")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case -613897138:
                        if (str.equals("support_om")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case -517414224:
                        if (str.equals("pkg_ver")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -424587677:
                        if (str.equals("first_bidder")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3556:
                        if (str.equals("os")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99677:
                        if (str.equals("dpi")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104582:
                        if (str.equals("isp")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106905:
                        if (str.equals("lan")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106911:
                        if (str.equals("lat")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107301:
                        if (str.equals("lng")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107855:
                        if (str.equals("mac")) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108957:
                        if (str.equals("net")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115792:
                        if (str.equals("uid")) {
                            c = '3';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3053931:
                        if (str.equals(POBConstants.KEY_CITY)) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3165045:
                        if (str.equals(O6.X0)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3184265:
                        if (str.equals("guid")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3197719:
                        if (str.equals("hdid")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236040:
                        if (str.equals("imei")) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3236474:
                        if (str.equals("imsi")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 25209764:
                        if (str.equals("device_id")) {
                            c = '4';
                            break;
                        }
                        c = 65535;
                        break;
                    case 55126294:
                        if (str.equals("timestamp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 92714869:
                        if (str.equals("af_id")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104069929:
                        if (str.equals("model")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757585:
                        if (str.equals("state")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 440309782:
                        if (str.equals("advertising_id")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 530453763:
                        if (str.equals("click_module")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 702731954:
                        if (str.equals("click_source")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 957831062:
                        if (str.equals("country")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139786014:
                        if (str.equals("pkg_name")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1139954915:
                        if (str.equals("pkg_sver")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1505024451:
                        if (str.equals("local_timestamp_ms")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1583758243:
                        if (str.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1793985248:
                        if (str.equals("loss_reason")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1845546289:
                        if (str.equals("new_uid")) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1939141228:
                        if (str.equals("ad_click_indx")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1948386846:
                        if (str.equals("sdk_ver")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str2 = "0";
                switch (c) {
                    case 0:
                        a = s.a();
                        str2 = String.valueOf(a);
                        break;
                    case 1:
                        a = System.currentTimeMillis();
                        str2 = String.valueOf(a);
                        break;
                    case 2:
                        str2 = this.n.C();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str2 = this.n.A();
                        break;
                    case 6:
                        str2 = this.n.a();
                        break;
                    case 7:
                        str2 = this.n.b();
                        break;
                    case '\b':
                        str2 = String.valueOf(this.n.c());
                        break;
                    case '\t':
                        d = this.n.d();
                        str2 = String.valueOf(d);
                        break;
                    case '\n':
                        str2 = this.n.e();
                        break;
                    case 11:
                        str2 = this.n.i();
                        break;
                    case '\f':
                        str2 = this.n.j();
                        break;
                    case '\r':
                    case 19:
                        str2 = this.n.k();
                        break;
                    case 14:
                        str2 = this.n.l();
                        break;
                    case 15:
                        str2 = this.n.m();
                        break;
                    case 16:
                        str2 = this.n.n();
                        break;
                    case 17:
                        str2 = this.n.o();
                        break;
                    case 18:
                        d = this.n.p();
                        str2 = String.valueOf(d);
                        break;
                    case 20:
                        str2 = this.n.r();
                        break;
                    case 21:
                        str2 = this.n.s();
                        break;
                    case 22:
                        str2 = this.n.y();
                        break;
                    case 23:
                        str2 = "50900";
                        break;
                    case 24:
                        str2 = this.n.t();
                        break;
                    case 25:
                        str2 = this.n.w();
                        break;
                    case 26:
                        str2 = this.n.x();
                        break;
                    case 27:
                    case 28:
                        break;
                    case 29:
                        str2 = this.n.B();
                        break;
                    case 30:
                        str2 = "1";
                        break;
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                        if (this.m.containsKey(str)) {
                            str2 = this.m.get(str);
                            break;
                        }
                    default:
                        str2 = "";
                        break;
                }
                String str3 = this.i[i];
                if (str2 == null) {
                    str2 = "";
                }
                trim = trim.replace(str3, str2);
            }
        }
        j jVar = k.a;
        if (trim == null || jVar == null || !jVar.n().a(8)) {
            return trim;
        }
        try {
            return trim.replace("{", "%7B").replace("}", "%7D");
        } catch (Exception unused) {
            return trim;
        }
    }

    public final void a(@NonNull String str, @NonNull String str2) {
        this.m.put(str, str2);
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.h);
    }

    public final boolean b() {
        return this.l != 0 && s.a() / 1000 > ((long) this.l);
    }

    public final boolean c() {
        return this.a == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sg.bigo.ads.bo.a d() {
        k.b bVar;
        if (TextUtils.isEmpty(this.k)) {
            e();
        }
        if (c() && f()) {
            sg.bigo.ads.an.k kVar = d.a().d;
            if (kVar != null) {
                bVar = kVar.a(this.k);
                bVar.a();
                if (bVar == null) {
                    bVar = new k.a(this.k);
                }
                return new sg.bigo.ads.de.a(bVar);
            }
            sg.bigo.ads.bn.a.a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
        }
        bVar = null;
        if (bVar == null) {
        }
        return new sg.bigo.ads.de.a(bVar);
    }

    public final void e() {
        this.k = g();
        String str = this.k;
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", str);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.a + ",name=" + this.b + ",url=" + this.k;
    }
}
