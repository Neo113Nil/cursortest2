package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes11.dex */
public final class d extends b implements sg.bigo.ads.api.core.i {

    @Nullable
    protected i.b A;

    @NonNull
    protected final i.a B;
    private boolean C;
    private boolean D;

    protected d(long j, @NonNull sg.bigo.ads.api.core.h hVar, @NonNull sg.bigo.ads.ai.n nVar, @NonNull JSONObject jSONObject) {
        super(j, hVar, nVar, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("display");
        if (optJSONObject != null) {
            this.A = new h(optJSONObject);
        }
        this.B = new e(jSONObject);
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean aD() {
        return a(32);
    }

    @Override // sg.bigo.ads.api.core.i
    @Nullable
    public final i.b aE() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.i
    @NonNull
    public final i.a aF() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.i
    public final void aG() {
        this.C = true;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean aH() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.i
    public final void aI() {
        this.D = true;
    }

    @Override // sg.bigo.ads.api.core.i
    public final boolean aJ() {
        return this.D;
    }
}
