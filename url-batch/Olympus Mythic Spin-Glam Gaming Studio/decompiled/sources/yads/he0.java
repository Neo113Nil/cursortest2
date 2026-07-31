package yads;

import com.monetization.ads.exo.source.dash.DashMediaSource$Factory;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class he0 {
    public final sd0 a;
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public p30 e;
    public ld0 f;

    public he0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i53 a(int i) {
        i53 i53Var;
        i53 i53Var2;
        if (this.b.containsKey(Integer.valueOf(i))) {
            return (i53) this.b.get(Integer.valueOf(i));
        }
        final p30 p30Var = this.e;
        p30Var.getClass();
        if (i == 0) {
            final Class asSubclass = DashMediaSource$Factory.class.asSubclass(om1.class);
            i53Var2 = new i53() { // from class: yads.he0$$ExternalSyntheticLambda4
                @Override // yads.i53
                public final Object get() {
                    om1 a;
                    a = ie0.a(asSubclass, p30Var);
                    return a;
                }
            };
        } else if (i == 1) {
            final Class<? extends U> asSubclass2 = Class.forName("com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory").asSubclass(om1.class);
            i53Var2 = new i53() { // from class: yads.he0$$ExternalSyntheticLambda3
                @Override // yads.i53
                public final Object get() {
                    om1 a;
                    a = ie0.a(asSubclass2, p30Var);
                    return a;
                }
            };
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        i53Var = new i53() { // from class: yads.he0$$ExternalSyntheticLambda0
                            @Override // yads.i53
                            public final Object get() {
                                return he0.this.a(p30Var);
                            }
                        };
                    }
                    i53Var = null;
                } else {
                    final Class<? extends U> asSubclass3 = Class.forName("com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory").asSubclass(om1.class);
                    i53Var = new i53() { // from class: yads.he0$$ExternalSyntheticLambda1
                        @Override // yads.i53
                        public final Object get() {
                            return he0.a(asSubclass3);
                        }
                    };
                }
                this.b.put(Integer.valueOf(i), i53Var);
                if (i53Var != null) {
                    this.c.add(Integer.valueOf(i));
                }
                return i53Var;
            }
            final Class<? extends U> asSubclass4 = Class.forName("com.monetization.ads.exo.source.hls.HlsMediaSource$Factory").asSubclass(om1.class);
            i53Var2 = new i53() { // from class: yads.he0$$ExternalSyntheticLambda2
                @Override // yads.i53
                public final Object get() {
                    om1 a;
                    a = ie0.a(asSubclass4, p30Var);
                    return a;
                }
            };
        }
        i53Var = i53Var2;
        this.b.put(Integer.valueOf(i), i53Var);
        if (i53Var != null) {
        }
        return i53Var;
    }

    public final /* synthetic */ om1 a(p30 p30Var) {
        return new kk2(p30Var, this.a);
    }

    public static om1 a(Class cls) {
        try {
            return (om1) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
