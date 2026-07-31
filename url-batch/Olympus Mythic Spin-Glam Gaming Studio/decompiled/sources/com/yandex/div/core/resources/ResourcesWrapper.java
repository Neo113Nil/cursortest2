package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import com.yandex.div.core.dagger.Names;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0017¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0017J\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0017J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0017J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0017J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\rH\u0017J \u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0016J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rH\u0017J(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rH\u0017J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\rH\u0017J \u0010$\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016J&\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\f\u001a\u00020\rH\u0017J\u0018\u00102\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0016J5\u00102\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0016\u00104\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001050\u0007\"\u0004\u0018\u000105H\u0016¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0002082\u0006\u0010\f\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0016J\u0012\u00109\u001a\u0004\u0018\u00010)2\u0006\u0010:\u001a\u00020\rH\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010)2\u0006\u0010:\u001a\u00020\rH\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010)2\u0006\u0010:\u001a\u00020\rH\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010)2\u0006\u0010:\u001a\u00020\rH\u0016J\u0010\u0010>\u001a\u00020)2\u0006\u0010\f\u001a\u00020\rH\u0016J-\u0010>\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0016\u00104\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001050\u0007\"\u0004\u0018\u000105H\u0016¢\u0006\u0002\u0010?J\u001d\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u0002082\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010B\u001a\u0004\u0018\u0001082\u0006\u0010\f\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u000108H\u0016J\u001d\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u0002080\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010EJ\"\u0010F\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u000fH\u0016J$\u0010F\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u000fH\u0016J*\u0010J\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u000fH\u0016J\u0010\u0010K\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010Q\u001a\u00020M2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010R\u001a\u00020S2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010R\u001a\u00020S2\u0006\u0010\f\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010W\u001a\u00020\u00052\b\u0010X\u001a\u0004\u0018\u00010)2\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u001c\u0010[\u001a\u00020\u00052\b\u0010\\\u001a\u0004\u0018\u00010\u000b2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J%\u0010]\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0017¢\u0006\u0002\u0010\tJ\u001c\u0010^\u001a\u00020\u00052\b\u0010_\u001a\u0004\u0018\u00010\u00162\b\u0010`\u001a\u0004\u0018\u00010\u001cH\u0017R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;)V", "addLoaders", "", "loaders", "", "Landroid/content/res/loader/ResourcesLoader;", "([Landroid/content/res/loader/ResourcesLoader;)V", "getAnimation", "Landroid/content/res/XmlResourceParser;", "id", "", "getBoolean", "", "getColor", Names.THEME, "Landroid/content/res/Resources$Theme;", "getColorStateList", "Landroid/content/res/ColorStateList;", "getConfiguration", "Landroid/content/res/Configuration;", "getDimension", "", "getDimensionPixelOffset", "getDimensionPixelSize", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getDrawableForDensity", "density", "getFloat", "getFont", "Landroid/graphics/Typeface;", "getFraction", "base", "pbase", "getIdentifier", "name", "", "defType", "defPackage", "getIntArray", "", "getInteger", "getLayout", "getMovie", "Landroid/graphics/Movie;", "getQuantityString", "quantity", "formatArgs", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getQuantityText", "", "getResourceEntryName", "resid", "getResourceName", "getResourcePackageName", "getResourceTypeName", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "getText", "def", "getTextArray", "(I)[Ljava/lang/CharSequence;", "getValue", "outValue", "Landroid/util/TypedValue;", "resolveRefs", "getValueForDensity", "getXml", "obtainAttributes", "Landroid/content/res/TypedArray;", "set", "Landroid/util/AttributeSet;", "attrs", "obtainTypedArray", "openRawResource", "Ljava/io/InputStream;", "value", "openRawResourceFd", "Landroid/content/res/AssetFileDescriptor;", "parseBundleExtra", "tagName", "outBundle", "Landroid/os/Bundle;", "parseBundleExtras", "parser", "removeLoaders", "updateConfiguration", "config", "metrics", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ResourcesWrapper extends Resources {

    @NotNull
    private final Resources resources;

    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public void addLoaders(@NotNull ResourcesLoader... loaders) {
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException {
        return this.resources.getAnimation(id);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id) throws Resources.NotFoundException {
        return this.resources.getBoolean(id);
    }

    @Override // android.content.res.Resources
    @Deprecated
    public int getColor(int id) throws Resources.NotFoundException {
        return this.resources.getColor(id);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public int getColor(int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColor(id, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    @NotNull
    public ColorStateList getColorStateList(int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id, theme);
    }

    @Override // android.content.res.Resources
    @Deprecated
    @NotNull
    public ColorStateList getColorStateList(int id) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int id) throws Resources.NotFoundException {
        return this.resources.getDimension(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelOffset(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelSize(id);
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int id, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getDrawable(id, theme);
    }

    @Override // android.content.res.Resources
    @Deprecated
    @Nullable
    public Drawable getDrawable(int id) throws Resources.NotFoundException {
        return this.resources.getDrawable(id);
    }

    @Override // android.content.res.Resources
    @Deprecated
    @Nullable
    public Drawable getDrawableForDensity(int id, int density) throws Resources.NotFoundException {
        return this.resources.getDrawableForDensity(id, density);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int id, int density, @Nullable Resources.Theme theme) {
        return this.resources.getDrawableForDensity(id, density, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public float getFloat(int id) throws Resources.NotFoundException {
        float f;
        f = this.resources.getFloat(id);
        return f;
    }

    @Override // android.content.res.Resources
    @RequiresApi
    @NotNull
    public Typeface getFont(int id) throws Resources.NotFoundException {
        Typeface font;
        font = this.resources.getFont(id);
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int id, int base, int pbase) throws Resources.NotFoundException {
        return this.resources.getFraction(id, base, pbase);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String name, @Nullable String defType, @Nullable String defPackage) {
        return this.resources.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int id) throws Resources.NotFoundException {
        return this.resources.getIntArray(id);
    }

    @Override // android.content.res.Resources
    public int getInteger(int id) throws Resources.NotFoundException {
        return this.resources.getInteger(id);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int id) throws Resources.NotFoundException {
        return this.resources.getLayout(id);
    }

    @Override // android.content.res.Resources
    @Deprecated
    @Nullable
    public Movie getMovie(int id) throws Resources.NotFoundException {
        return this.resources.getMovie(id);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id, int quantity, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id, quantity);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityText(id, quantity);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceEntryName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourcePackageName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceTypeName(resid);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getString(id, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id) throws Resources.NotFoundException {
        return this.resources.getString(id);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int id) throws Resources.NotFoundException {
        return this.resources.getStringArray(id);
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int id, @Nullable CharSequence def) {
        return this.resources.getText(id, def);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int id) throws Resources.NotFoundException {
        return this.resources.getText(id);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int id) throws Resources.NotFoundException {
        return this.resources.getTextArray(id);
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String name, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(name, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValue(int id, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(id, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id, int density, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValueForDensity(id, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int id) throws Resources.NotFoundException {
        return this.resources.getXml(id);
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet set, @Nullable int[] attrs) {
        return this.resources.obtainAttributes(set, attrs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException {
        return this.resources.obtainTypedArray(id);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id, @Nullable TypedValue value) throws Resources.NotFoundException {
        return this.resources.openRawResource(id, value);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id) throws Resources.NotFoundException {
        return this.resources.openRawResource(id);
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException {
        return this.resources.openRawResourceFd(id);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String tagName, @Nullable AttributeSet attrs, @Nullable Bundle outBundle) throws XmlPullParserException {
        this.resources.parseBundleExtra(tagName, attrs, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser parser, @Nullable Bundle outBundle) throws XmlPullParserException, IOException {
        this.resources.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    @RequiresApi
    public void removeLoaders(@NotNull ResourcesLoader... loaders) {
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @Deprecated
    public void updateConfiguration(@Nullable Configuration config, @Nullable DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }
}
