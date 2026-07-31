package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.o;

/* loaded from: classes11.dex */
public final class j implements o.b {
    private final int a;
    private final long b;
    private final int c;
    private final long d;

    public j(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt("video_impression_area_rate", 0);
        this.b = jSONObject.optLong("video_impression_time", 0L);
        this.c = jSONObject.optInt("image_impression_area_rate", 0);
        this.d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final int c() {
        return this.c;
    }

    @Override // sg.bigo.ads.api.core.o.b
    public final long d() {
        return this.d;
    }
}
