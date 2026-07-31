package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.controller.landing.d;

/* loaded from: classes3.dex */
public class AdSplashActivity extends Activity {
    private static final Map<Integer, b> a = new HashMap();
    private b b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public static void a(@NonNull Context context, @NonNull b bVar) {
        Intent intent = new Intent(context, (Class<?>) (bVar.getStyle() == SplashAd.Style.HORIZONTAL ? LandscapeAdSplashActivity.class : AdSplashActivity.class));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        int hashCode = bVar.hashCode();
        intent.putExtra("splash_hash", hashCode);
        a.put(Integer.valueOf(hashCode), bVar);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            if (this.b == null || !this.c.compareAndSet(false, true)) {
                return;
            }
            this.b.B.onAdClosed();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            int intExtra = intent.getIntExtra("splash_hash", -1);
            Map<Integer, b> map = a;
            b bVar = map.get(Integer.valueOf(intExtra));
            if (bVar == null) {
                finish();
                return;
            }
            map.remove(Integer.valueOf(intExtra));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(-1);
            setContentView(frameLayout);
            this.b = bVar;
            bVar.B.c = new SplashAdInteractionListener() { // from class: sg.bigo.ads.ad.splash.AdSplashActivity.1
                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClicked() {
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClosed() {
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdError(@NonNull AdError adError) {
                    if (adError == null) {
                        return;
                    }
                    adError.getCode();
                    adError.getMessage();
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdFinished() {
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdImpression() {
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdOpened() {
                }

                @Override // sg.bigo.ads.api.SplashAdInteractionListener
                public final void onAdSkipped() {
                    AdSplashActivity.this.finish();
                }
            };
            bVar.a(frameLayout, this);
            b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.B.onAdOpened();
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            if (this.b != null && this.c.compareAndSet(false, true)) {
                this.b.B.onAdClosed();
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.destroy();
                this.b = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        b bVar = this.b;
        if (bVar == null || !bVar.isSkippable()) {
            return true;
        }
        this.b.a(8);
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        sg.bigo.ads.y.b bVar = this.b.z;
        if (bVar != null) {
            d.a((Activity) this, (sg.bigo.ads.d.c) bVar);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        View decorView;
        super.onResume();
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(4098);
            }
            sg.bigo.ads.api.core.d z = this.b.z.z();
            if (z == null || z.a != 4 || z.d) {
                return;
            }
            this.b.z.z().d = true;
            d.a((Activity) this, (sg.bigo.ads.d.c) this.b.z);
            sg.bigo.ads.core.landing.a.a(this, z.b, getPackageName(), z.c);
        } catch (Throwable unused) {
            finish();
        }
    }
}
