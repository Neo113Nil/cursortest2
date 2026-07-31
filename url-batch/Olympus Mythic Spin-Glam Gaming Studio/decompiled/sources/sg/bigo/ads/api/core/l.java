package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l implements sg.bigo.ads.ai.g {
    private int a = 2;
    private int b = 3;
    private int c = 5;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.a + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c);
    }

    @Override // sg.bigo.ads.ai.g
    public final void a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optInt("id_show_loading", 2);
            this.b = jSONObject.optInt("loading_timeout", 3);
            this.c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.ai.g
    public final boolean a() {
        return this.a == 2;
    }

    @Override // sg.bigo.ads.ai.g
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        String[] split;
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString) || (split = readString.split(StringUtils.COMMA)) == null || split.length != 3) {
                return;
            }
            this.a = sg.bigo.ads.common.utils.r.a(split[0], 2);
            this.b = sg.bigo.ads.common.utils.r.a(split[1], 3);
            this.c = sg.bigo.ads.common.utils.r.a(split[2], 5);
        }
    }

    @Override // sg.bigo.ads.ai.g
    public final int c() {
        return this.c;
    }
}
