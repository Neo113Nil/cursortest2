package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f3055f;

    /* renamed from: a, reason: collision with root package name */
    public int f3056a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f3057b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f3058c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f3059e;

    public C0177c(Context context, int i) {
        super(context);
        this.f3056a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f3059e != null) {
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
        if (this.f3057b == null) {
            this.f3057b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3057b.setTo(theme);
            }
        }
        this.f3057b.applyStyle(this.f3056a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f3059e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f3055f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = RecyclerView.f1949A0;
                    f3055f = configuration2;
                }
                if (!configuration.equals(f3055f)) {
                    this.f3059e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f3059e = super.getResources();
        }
        return this.f3059e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3058c == null) {
            this.f3058c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3058c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3057b;
        if (theme != null) {
            return theme;
        }
        if (this.f3056a == 0) {
            this.f3056a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f3057b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3056a != i) {
            this.f3056a = i;
            b();
        }
    }
}
