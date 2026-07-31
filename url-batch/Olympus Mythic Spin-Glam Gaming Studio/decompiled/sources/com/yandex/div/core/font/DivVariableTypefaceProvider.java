package com.yandex.div.core.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.graphics.TypefaceCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVariableTypefaceProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/font/DivVariableTypefaceProvider;", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "supportFontVariations", "", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "createTypefaceFor", "weight", "", "getBold", "getLight", "getMedium", "getRegular", "getTypefaceFor", "isVariable", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DivVariableTypefaceProvider implements DivTypefaceProvider {

    @NotNull
    private final Context context;
    private final boolean supportFontVariations;

    @Nullable
    protected abstract Typeface getTypeface();

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public boolean isVariable() {
        return true;
    }

    public DivVariableTypefaceProvider(@NotNull Context context) {
        this.context = context;
        this.supportFontVariations = Build.VERSION.SDK_INT >= 26;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public Typeface getRegular() {
        return createTypefaceFor(400);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public Typeface getMedium() {
        return createTypefaceFor(500);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public Typeface getLight() {
        return createTypefaceFor(300);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public Typeface getBold() {
        return createTypefaceFor(700);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @Nullable
    public Typeface getTypefaceFor(int weight) {
        return this.supportFontVariations ? getTypeface() : createTypefaceFor(weight);
    }

    private final Typeface createTypefaceFor(int weight) {
        return TypefaceCompat.create(this.context, getTypeface(), weight, false);
    }
}
