package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* loaded from: classes6.dex */
public final class un0 implements cj3, bk, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, vj, pj, l43, on0 {
    public final /* synthetic */ xn0 a;

    public un0(xn0 xn0Var) {
        this.a = xn0Var;
    }

    public final void a(final mj3 mj3Var) {
        this.a.getClass();
        rf1 rf1Var = this.a.k;
        rf1Var.a(25, new of1() { // from class: yads.un0$$ExternalSyntheticLambda6
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).a(mj3.this);
            }
        });
        rf1Var.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(surfaceTexture);
        this.a.a(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.a((Surface) null);
        this.a.a(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        xn0 xn0Var = this.a;
        if (xn0Var.O) {
            xn0Var.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        xn0 xn0Var = this.a;
        if (xn0Var.O) {
            xn0Var.a((Surface) null);
        }
        this.a.a(0, 0);
    }

    public final void a(Object obj, long j) {
        ((wb0) this.a.p).a(obj, j);
        xn0 xn0Var = this.a;
        if (xn0Var.K == obj) {
            rf1 rf1Var = xn0Var.k;
            rf1Var.a(26, new of1() { // from class: yads.un0$$ExternalSyntheticLambda7
                @Override // yads.of1
                public final void invoke(Object obj2) {
                    ((we2) obj2).onRenderedFirstFrame();
                }
            });
            rf1Var.a();
        }
    }

    public final void a(final boolean z) {
        xn0 xn0Var = this.a;
        if (xn0Var.W == z) {
            return;
        }
        xn0Var.W = z;
        rf1 rf1Var = xn0Var.k;
        rf1Var.a(23, new of1() { // from class: yads.un0$$ExternalSyntheticLambda8
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).onSkipSilenceEnabledChanged(z);
            }
        });
        rf1Var.a();
    }

    public final void a(final List list) {
        rf1 rf1Var = this.a.k;
        rf1Var.a(27, new of1() { // from class: yads.un0$$ExternalSyntheticLambda0
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).onCues(list);
            }
        });
        rf1Var.a();
    }

    public final void a(final u20 u20Var) {
        this.a.getClass();
        rf1 rf1Var = this.a.k;
        rf1Var.a(27, new of1() { // from class: yads.un0$$ExternalSyntheticLambda2
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).a(u20.this);
            }
        });
        rf1Var.a();
    }

    public final void a(final ht1 ht1Var) {
        xn0 xn0Var = this.a;
        am1 am1Var = xn0Var.a0;
        am1Var.getClass();
        zl1 zl1Var = new zl1(am1Var);
        int i = 0;
        while (true) {
            gt1[] gt1VarArr = ht1Var.b;
            if (i >= gt1VarArr.length) {
                break;
            }
            gt1VarArr[i].a(zl1Var);
            i++;
        }
        xn0Var.a0 = new am1(zl1Var);
        am1 c = this.a.c();
        if (!c.equals(this.a.I)) {
            xn0 xn0Var2 = this.a;
            xn0Var2.I = c;
            xn0Var2.k.a(14, new of1() { // from class: yads.un0$$ExternalSyntheticLambda4
                @Override // yads.of1
                public final void invoke(Object obj) {
                    un0.this.a((we2) obj);
                }
            });
        }
        this.a.k.a(28, new of1() { // from class: yads.un0$$ExternalSyntheticLambda5
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).a(ht1.this);
            }
        });
        this.a.k.a();
    }

    public final /* synthetic */ void a(we2 we2Var) {
        we2Var.a(this.a.I);
    }

    public final void a() {
        n43 n43Var = this.a.x;
        final qg0 qg0Var = new qg0(0, n43Var.a(), n43Var.d.getStreamMaxVolume(n43Var.g));
        if (qg0Var.equals(this.a.Z)) {
            return;
        }
        xn0 xn0Var = this.a;
        xn0Var.Z = qg0Var;
        rf1 rf1Var = xn0Var.k;
        rf1Var.a(29, new of1() { // from class: yads.un0$$ExternalSyntheticLambda3
            @Override // yads.of1
            public final void invoke(Object obj) {
                ((we2) obj).a(qg0.this);
            }
        });
        rf1Var.a();
    }

    public final void a(final boolean z, final int i) {
        rf1 rf1Var = this.a.k;
        rf1Var.a(30, new of1() { // from class: yads.un0$$ExternalSyntheticLambda1
            @Override // yads.of1
            public final void invoke(Object obj) {
                we2 we2Var = (we2) obj;
                we2Var.a(z, i);
            }
        });
        rf1Var.a();
    }
}
