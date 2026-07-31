package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.p;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class InstreamResearch extends BaseAd {
    private final int f;
    private final Context g;
    private int h;
    private int i;
    private InstreamResearchListener j;
    private bg k;
    private fg l;
    private u6 m;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface InstreamResearchListener {
        void onLoad(@NonNull InstreamResearch instreamResearch);

        void onNoData(@NonNull InstreamResearch instreamResearch, @Nullable IAdLoadingError iAdLoadingError);
    }

    private InstreamResearch(int i, int i2, Context context) {
        super(i, "instreamresearch", context);
        this.h = 0;
        this.i = -1;
        this.f = i2;
        this.g = context;
        mi.c("Instream research ad created. Version - " + MyTargetVersion.VERSION);
    }

    @NonNull
    public static InstreamResearch newResearch(int i, int i2, @NonNull Context context) {
        return new InstreamResearch(i, i2, context);
    }

    void a(x6 x6Var, s sVar) {
        if (x6Var != null) {
            u6 c = x6Var.c();
            this.m = c;
            if (c != null) {
                this.k = bg.a(c.H());
                this.l = fg.a(this.m.H());
                InstreamResearchListener instreamResearchListener = this.j;
                if (instreamResearchListener != null) {
                    instreamResearchListener.onLoad(this);
                    return;
                }
                return;
            }
        }
        InstreamResearchListener instreamResearchListener2 = this.j;
        if (instreamResearchListener2 != null) {
            instreamResearchListener2.onNoData(this, sVar.a());
        }
    }

    public void load() {
        v6.a(this.a, this.b, this.f).a(new p.b() { // from class: com.my.target.InstreamResearch$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                InstreamResearch.this.a((x6) xVar, sVar);
            }
        }).a(this.b.a(), this.g);
    }

    public void registerPlayerView(@NonNull View view) {
        fg fgVar = this.l;
        if (fgVar != null) {
            fgVar.a(view);
        }
    }

    public void setListener(@Nullable InstreamResearchListener instreamResearchListener) {
        this.j = instreamResearchListener;
    }

    public void trackFullscreen(boolean z) {
        a(z ? "fullscreenOn" : "fullscreenOff");
    }

    public void trackMute(boolean z) {
        a(z ? "volumeOff" : "volumeOn");
    }

    public void trackPause() {
        if (this.h == 1) {
            a("playbackPaused");
            this.h = 2;
        } else {
            mi.b("InstreamResearch: Unable to track pause, wrong state " + a(this.h));
        }
    }

    public void trackProgress(float f) {
        if (this.h < 1) {
            a("playbackStarted");
            this.h = 1;
        }
        if (this.h > 1) {
            mi.a("InstreamResearch: Unable to track progress while state is - " + a(this.h));
            return;
        }
        int round = Math.round(f);
        int i = this.i;
        if (round < i) {
            a("rewind");
        } else if (round == i) {
            return;
        }
        this.i = round;
        fg fgVar = this.l;
        if (fgVar != null) {
            fgVar.b(round);
        }
        bg bgVar = this.k;
        if (bgVar != null) {
            bgVar.a(round, this.f);
        }
    }

    public void trackResume() {
        if (this.h == 2) {
            a("playbackResumed");
            this.h = 1;
        } else {
            mi.b("InstreamResearch: VideoAdTracker error - unable to track resume, wrong state " + a(this.h));
        }
    }

    public void unregisterPlayerView() {
        fg fgVar = this.l;
        if (fgVar != null) {
            fgVar.a((View) null);
        }
    }

    private String a(int i) {
        if (i == 0) {
            return "idle";
        }
        if (i == 1) {
            return X3.i.d0;
        }
        if (i == 2) {
            return "paused";
        }
        if (i != 3) {
            return "unknown";
        }
        return "completed";
    }

    private void a(String str) {
        u6 u6Var = this.m;
        if (u6Var != null) {
            wh.c(u6Var.H(), str, 999);
        }
    }
}
