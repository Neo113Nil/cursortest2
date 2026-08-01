package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f30a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f31b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f30a = colorStateList;
        this.f31b = configuration;
        this.f32c = theme == null ? 0 : theme.hashCode();
    }
}
