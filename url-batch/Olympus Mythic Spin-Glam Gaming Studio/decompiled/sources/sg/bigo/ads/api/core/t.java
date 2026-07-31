package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class t implements sg.bigo.ads.ai.q {
    private int a = 0;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(String.valueOf(this.a));
    }

    @Override // sg.bigo.ads.ai.q
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optInt("ll_on", 0);
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(StringUtils.COMMA);
            if (split.length > 0) {
                this.a = sg.bigo.ads.common.utils.r.a(split[0], 0);
            }
        }
    }
}
