package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.punchtowin.balls.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2543f;

    /* renamed from: a, reason: collision with root package name */
    public int f2544a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2545b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2546c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2547e;

    public C0139c(Context context, int i) {
        super(context);
        this.f2544a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2547e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2545b == null) {
            this.f2545b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2545b.setTo(theme);
            }
        }
        this.f2545b.applyStyle(this.f2544a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2547e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2543f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2543f = configuration2;
                }
                if (!configuration.equals(f2543f)) {
                    this.f2547e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2547e = super.getResources();
        }
        return this.f2547e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2546c == null) {
            this.f2546c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2546c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2545b;
        if (theme != null) {
            return theme;
        }
        if (this.f2544a == 0) {
            this.f2544a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2545b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2544a != i) {
            this.f2544a = i;
            b();
        }
    }
}
