package yads;

import android.location.Location;
import android.net.Uri;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.B5;
import com.ironsource.T3;
import com.ironsource.X3;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.sequences.Sequence;

/* loaded from: classes15.dex */
public final class wt0 {
    public final vm0 a;
    public final Sequence b;
    public final Sequence c;
    public final Lazy d;

    public wt0(st0 st0Var) {
        vw2 vw2Var;
        h8 h8Var = new h8();
        this.a = new vm0();
        Map createMapBuilder = MapsKt.createMapBuilder();
        a(createMapBuilder, "ad_unit_id", st0Var.A);
        a(createMapBuilder, "width", st0Var.C);
        a(createMapBuilder, "height", st0Var.D);
        a(createMapBuilder, "ad_size_type", st0Var.E);
        a(createMapBuilder, X3.i.n, st0Var.F);
        a(createMapBuilder, "ads_count", st0Var.s);
        a(createMapBuilder, CommonUrlParts.SCREEN_WIDTH, st0Var.H);
        a(createMapBuilder, CommonUrlParts.SCREEN_HEIGHT, st0Var.I);
        a(createMapBuilder, CommonUrlParts.SCALE_FACTOR, st0Var.J);
        a(createMapBuilder, "ad_type", st0Var.B);
        a(createMapBuilder, "network_type", st0Var.M);
        a(createMapBuilder, "carrier", st0Var.N);
        a(createMapBuilder, "dnt", st0Var.S);
        a(createMapBuilder, "gaid_reset", st0Var.T);
        a(createMapBuilder, "huawei_dnt", st0Var.V);
        a(createMapBuilder, "image_sizes", st0Var.b0);
        a(createMapBuilder, "response_ad_format", st0Var.c0);
        a(createMapBuilder, "open_bidding_data", st0Var.f0);
        a(createMapBuilder, "session_random", st0Var.d0);
        a(createMapBuilder, B5.N, st0Var.e0);
        a(createMapBuilder, h8Var.b(), st0Var.j0);
        a(createMapBuilder, h8Var.f(), st0Var.k0);
        a(createMapBuilder, h8Var.g(), st0Var.l0);
        a(createMapBuilder, h8Var.d(), st0Var.m0);
        a(createMapBuilder, h8Var.e(), st0Var.n0);
        a(createMapBuilder, h8Var.c(), st0Var.Y);
        a(createMapBuilder, CommonUrlParts.LOCALE, st0Var.o0);
        a(createMapBuilder, "content_language", st0Var.p0);
        List list = st0Var.q0;
        a(createMapBuilder, "device_languages", list != null ? CollectionsKt.joinToString$default(list, ":", null, null, 0, null, null, 62, null) : null);
        a(createMapBuilder, "app_id", st0Var.r0);
        a(createMapBuilder, "app_version_code", st0Var.s0);
        a(createMapBuilder, CommonUrlParts.APP_VERSION, st0Var.t0);
        a(createMapBuilder, "appmetrica_version", st0Var.G0);
        a(createMapBuilder, CommonUrlParts.SCREEN_DPI, Integer.valueOf(st0Var.v0));
        a(createMapBuilder, "safe_area_inset_left", Float.valueOf(st0Var.w0));
        a(createMapBuilder, "safe_area_inset_top", Float.valueOf(st0Var.x0));
        a(createMapBuilder, "safe_area_inset_right", Float.valueOf(st0Var.y0));
        a(createMapBuilder, "safe_area_inset_bottom", Float.valueOf(st0Var.z0));
        a(createMapBuilder, "cutout_safe_area_inset_top", Float.valueOf(st0Var.A0));
        a(createMapBuilder, "cutout_safe_area_inset_bottom", Float.valueOf(st0Var.B0));
        a(createMapBuilder, "user_consent", st0Var.o);
        a(createMapBuilder, "gdpr", st0Var.u);
        a(createMapBuilder, InMobiSdk.IM_GDPR_CONSENT_IAB, st0Var.v);
        a(createMapBuilder, "cmp_present", Integer.valueOf(st0Var.t ? 1 : 0));
        a(createMapBuilder, "parsed_purpose_consents", st0Var.w);
        a(createMapBuilder, "parsed_vendor_consents", st0Var.x);
        a(createMapBuilder, "addtl_consent", st0Var.y);
        a(createMapBuilder, "bidding_data", st0Var.g0);
        a(createMapBuilder, "prefetched_mediation_data", st0Var.h0);
        a(createMapBuilder, "connected_network_ids", st0Var.i0);
        a(createMapBuilder, "sdk_version", st0Var.E0);
        a(createMapBuilder, "sdk_version_name", st0Var.F0);
        a(createMapBuilder, "sdk_vendor", "yandex");
        a(createMapBuilder, "preferred_theme", st0Var.H0);
        a(createMapBuilder, "device_theme", st0Var.I0);
        a(createMapBuilder, "age_restricted_user", st0Var.p);
        a(createMapBuilder, "view_size_info", st0Var.J0);
        a(createMapBuilder, "web_view_available", st0Var.K0);
        a(createMapBuilder, "startup_version", st0Var.L0);
        a(createMapBuilder, "session-data", st0Var.O0);
        a(createMapBuilder, "user-agent", st0Var.N0);
        a(createMapBuilder, "stub_reason", st0Var.R0);
        a(createMapBuilder, "gms_available", st0Var.S0);
        a(createMapBuilder, "opt_out", st0Var.T0);
        a(createMapBuilder, "ram", st0Var.U0);
        a(createMapBuilder, "cpu_cores", st0Var.V0);
        a(createMapBuilder, "timezone", st0Var.W0);
        a(createMapBuilder, "hour_format", st0Var.X0);
        a(createMapBuilder, "disk_free", st0Var.Y0);
        a(createMapBuilder, "disk_total", st0Var.Z0);
        a(createMapBuilder, "time_since_booted", st0Var.a1);
        a(createMapBuilder, "video_decoders", st0Var.b1);
        for (Map.Entry entry : st0Var.M0.entrySet()) {
            a(createMapBuilder, (String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : st0Var.n.entrySet()) {
            a(createMapBuilder, (String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!st0Var.l || st0Var.k) {
            a(createMapBuilder, CommonUrlParts.UUID, st0Var.z);
        }
        if (!st0Var.l) {
            a(createMapBuilder, "age", st0Var.C0);
            a(createMapBuilder, "gender", st0Var.D0);
            a(createMapBuilder, "context_query", st0Var.Z);
            a(createMapBuilder, "context_taglist", st0Var.a0);
            a(createMapBuilder, "google_aid", st0Var.U);
            a(createMapBuilder, CommonUrlParts.APP_SET_ID, st0Var.q);
            a(createMapBuilder, "huawei_oaid", st0Var.W);
            a(createMapBuilder, "mauid", st0Var.r);
            a(createMapBuilder, h8Var.a(), st0Var.u0);
            a(createMapBuilder, "mcc", st0Var.K);
            a(createMapBuilder, "mnc", st0Var.L);
            a(createMapBuilder, "cellid", st0Var.P);
            a(createMapBuilder, "lac", st0Var.Q);
            a(createMapBuilder, T3.b, st0Var.R);
            a(createMapBuilder, "battery_charge", st0Var.X);
            a(createMapBuilder, "server_side_client_ip", st0Var.P0);
            a(createMapBuilder, "ipv6", st0Var.Q0);
        }
        if (!st0Var.a) {
            d8 d8Var = st0Var.O;
            Location location = (d8Var == null || (location = d8Var.f) == null) ? st0Var.G : location;
            if (location != null) {
                vw2 vw2Var2 = vw2.l;
                if (vw2Var2 == null) {
                    synchronized (vw2.k) {
                        vw2Var = vw2.l;
                        if (vw2Var == null) {
                            vw2Var = new vw2();
                            vw2.l = vw2Var;
                        }
                    }
                    vw2Var2 = vw2Var;
                }
                if (vw2Var2.b()) {
                    a(createMapBuilder, "lat", String.valueOf(location.getLatitude()));
                    a(createMapBuilder, POBConstants.KEY_LONGITUDE, String.valueOf(location.getLongitude()));
                    a(createMapBuilder, "location_timestamp", String.valueOf(location.getTime()));
                    a(createMapBuilder, "precision", String.valueOf((int) location.getAccuracy()));
                }
            }
        }
        this.b = MapsKt.asSequence(MapsKt.build(createMapBuilder));
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        for (Map.Entry entry3 : st0Var.m.entrySet()) {
            a(createMapBuilder2, (String) entry3.getKey(), entry3.getValue());
        }
        this.c = MapsKt.asSequence(MapsKt.build(createMapBuilder2));
        this.d = LazyKt.lazy(new vt0(this));
    }

    public final void a(Map map, String str, Object obj) {
        if (obj != null) {
            map.put(Uri.encode(str), !this.a.a.contains(str) ? Uri.encode(obj.toString()) : Uri.encode(obj.toString(), ":"));
        }
    }

    public final String toString() {
        return (String) this.d.getValue();
    }

    public final void a(Map map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }
}
