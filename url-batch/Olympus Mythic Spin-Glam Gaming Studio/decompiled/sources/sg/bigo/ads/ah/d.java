package sg.bigo.ads.ah;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Iterator;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.SplashAd;

/* loaded from: classes4.dex */
public final class d extends b {
    public static float l = 20.0f;
    private sg.bigo.ads.bk.b m;
    private boolean n;
    private float o;
    private float p;
    private final float q;
    private final float[] r;
    private long s;
    private boolean t;
    private View.OnTouchListener u;

    public d(sg.bigo.ads.api.core.g gVar, @NonNull o oVar, o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, oVar, oVar2, bVar);
        this.n = true;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = -1.0f;
        this.r = new float[]{-1.0f, -1.0f, -1.0f};
        this.s = 0L;
        this.u = new View.OnTouchListener() { // from class: sg.bigo.ads.ah.d.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    d.this.o = motionEvent.getX();
                    d.this.p = motionEvent.getY();
                    return true;
                }
                if (action != 1) {
                    return false;
                }
                if (d.a(Math.round(d.this.o), Math.round(d.this.p), Math.round(motionEvent.getX()), Math.round(motionEvent.getY())) <= 30) {
                    return false;
                }
                d.c(d.this);
                return true;
            }
        };
    }

    static /* synthetic */ float a(int i) {
        if (i != 4) {
            return (i == 9 || i == 1) ? 4.0f : 20.0f;
        }
        return 20.0f;
    }

    static /* synthetic */ int a(int i, int i2, int i3, int i4) {
        return Math.max(Math.abs(i - i3), Math.abs(i2 - i4));
    }

    static /* synthetic */ void c(d dVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - dVar.s;
        if (!dVar.n || j <= 2000) {
            return;
        }
        dVar.s = elapsedRealtime;
        dVar.h.z.a((sg.bigo.ads.an.i) null, 8, 22);
    }

    private int l() {
        return sg.bigo.ads.ad.splash.a.b(this.b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m() {
        o oVar = this.c;
        if (oVar == null) {
            return 0;
        }
        return oVar.a("video_play_page.interactive_method", 0);
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void a(boolean z) {
        super.a(z);
        this.n = z;
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        super.a(z, viewGroup, i);
        if (!z || this.t) {
            return;
        }
        sg.bigo.ads.ad.splash.a.a = true;
        this.t = true;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_fl_interaction_container);
        int i2 = R.layout.bigo_ad_item_interaction_vertical;
        if (this.h.getStyle() == SplashAd.Style.HORIZONTAL) {
            i2 = R.layout.bigo_ad_item_interaction_horizontal;
        }
        if (viewGroup2 != null) {
            View a = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), i2, viewGroup2, false);
            viewGroup2.removeAllViews();
            viewGroup2.addView(a);
            ImageView imageView = (ImageView) a.findViewById(R.id.inter_iv_interaction_arrow);
            ImageView imageView2 = (ImageView) a.findViewById(R.id.inter_iv_interaction_phone);
            TextView textView = (TextView) a.findViewById(R.id.inter_tv_interaction_type);
            if (imageView != null && imageView2 != null && textView != null) {
                int m = m();
                int i3 = R.drawable.bigo_ad_interaction_shake_arrow;
                int i4 = R.drawable.bigo_ad_interaction_shake_phone;
                String string = a.getContext().getString(R.string.bigo_ad_interaction_shake);
                if (m != 1) {
                    if (m == 2) {
                        i4 = R.drawable.bigo_ad_interaction_slide_hand;
                        i3 = R.drawable.bigo_ad_interaction_slide_line;
                        string = a.getContext().getString(R.string.bigo_ad_interaction_slide);
                    } else if (m == 3) {
                        i3 = R.drawable.bigo_ad_interaction_twist_arrow;
                        string = a.getContext().getString(R.string.bigo_ad_interaction_twist);
                        i4 = sg.bigo.ads.ad.splash.a.b() ? R.drawable.bigo_ad_interaction_twist_landscape_phone : R.drawable.bigo_ad_interaction_twist_phone;
                    }
                } else if (sg.bigo.ads.ad.splash.a.b()) {
                    i4 = R.drawable.bigo_ad_interaction_shake_landscape_phone;
                }
                imageView.setImageResource(i3);
                imageView2.setImageResource(i4);
                textView.setText(string);
                if (m == 1) {
                    sg.bigo.ads.ad.splash.a.b(imageView2);
                } else if (m == 2) {
                    imageView2.setTranslationY(sg.bigo.ads.common.utils.f.a(imageView2.getContext(), 60));
                    sg.bigo.ads.ad.splash.a.a(imageView2, imageView2.getTranslationY());
                } else if (m == 3) {
                    sg.bigo.ads.ad.splash.a.a(imageView2);
                }
            }
        }
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (2 == m()) {
            if (findViewById != null) {
                findViewById.setOnTouchListener(this.u);
            }
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(this.u);
            }
        }
        Context context = viewGroup.getContext();
        int m2 = m();
        int i5 = 4;
        if (this.m == null && context != null && (1 == m2 || 3 == m2)) {
            this.m = new sg.bigo.ads.bk.b(context, Arrays.asList(4, 9, 1), new sg.bigo.ads.bk.a() { // from class: sg.bigo.ads.ah.d.2
                @Override // sg.bigo.ads.bk.a
                public final void a(int i6, @NonNull float[] fArr, @NonNull float[] fArr2) {
                    char c;
                    if (i6 == 4) {
                        c = 2;
                        fArr = fArr2;
                    } else {
                        c = 0;
                    }
                    if (fArr.length == 3) {
                        int m3 = d.this.m();
                        if (m3 != 1) {
                            if (m3 != 3) {
                                return;
                            }
                            float f = fArr[c];
                            if (-1.0f == d.this.r[c]) {
                                d.this.r[c] = f;
                            }
                            if (Math.abs(f - d.this.r[c]) > d.a(i6)) {
                                d.this.r[c] = f;
                                d.c(d.this);
                                return;
                            }
                            return;
                        }
                        for (int i7 = 0; i7 < fArr.length; i7++) {
                            float f2 = fArr[i7];
                            if (-1.0f == d.this.r[i7]) {
                                d.this.r[i7] = f2;
                            }
                            if (Math.abs(f2 - d.this.r[i7]) > d.a(i6)) {
                                d.this.r[i7] = f2;
                                d.c(d.this);
                                return;
                            }
                        }
                    }
                }
            });
        }
        sg.bigo.ads.bk.b bVar = this.m;
        if (bVar != null) {
            try {
                bVar.c = (SensorManager) bVar.a.get().getApplicationContext().getSystemService("sensor");
                Iterator<Integer> it = bVar.f.iterator();
                Sensor sensor = null;
                while (it.hasNext() && (sensor = bVar.c.getDefaultSensor((i5 = it.next().intValue()))) == null) {
                }
                bVar.c.registerListener(bVar.g, sensor, i5);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void c() {
        super.c();
        sg.bigo.ads.bk.b bVar = this.m;
        if (bVar != null) {
            SensorManager sensorManager = bVar.c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(bVar.g);
                bVar.g = null;
                bVar.c = null;
            }
            bVar.b = null;
            this.m = null;
        }
        this.u = null;
    }

    @Override // sg.bigo.ads.ah.b
    protected final int e() {
        if (this.c != null && f()) {
            return sg.bigo.ads.ad.splash.a.b(this.b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction_immersive;
        }
        return l();
    }

    @Override // sg.bigo.ads.ah.b
    protected final boolean g() {
        return false;
    }
}
