package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f74a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f75b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f74a = colorStateList;
        this.f75b = configuration;
        this.f76c = theme == null ? 0 : theme.hashCode();
    }
}
