package sg.bigo.ads.cj;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.o;

/* loaded from: classes11.dex */
public final class s implements o.d {
    private final boolean a;
    private final int b;
    private boolean c = false;
    private final long d;
    private final long e;
    private long f;

    public s(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.b = jSONObject.optInt("play_ad_threshold", 50);
        this.d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final long a() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final void a(long j) {
        this.f = j;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final void a(boolean z) {
        this.c = z;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final boolean b() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.o.d
    @IntRange
    public final int c() {
        if (!this.a) {
            return 100;
        }
        long j = this.f;
        if (j <= this.d) {
            return 100;
        }
        long j2 = this.e;
        return j <= j2 ? this.b : j < (3 * j2) / 2 ? (int) ((this.b * j2) / j) : (this.b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.o.d
    public final boolean d() {
        return this.c;
    }
}
