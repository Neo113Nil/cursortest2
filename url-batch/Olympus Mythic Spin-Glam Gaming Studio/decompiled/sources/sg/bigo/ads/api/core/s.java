package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class s implements sg.bigo.ads.ai.p {
    private int a = 0;
    private long b = 5000;
    private long c = 21600000;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.a + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c);
    }

    @Override // sg.bigo.ads.ai.p
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optInt("duration_on", 0);
            this.b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.ai.p
    public final boolean a() {
        return this.a == 1;
    }

    @Override // sg.bigo.ads.ai.p
    public final long b() {
        return this.b;
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(StringUtils.COMMA);
            if (split.length >= 3) {
                this.a = sg.bigo.ads.common.utils.r.a(split[0], 0);
                this.b = sg.bigo.ads.common.utils.r.a(split[1], 5000L);
                this.c = sg.bigo.ads.common.utils.r.a(split[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.ai.p
    public final long c() {
        return this.c;
    }
}
