package io.bidmachine.util.gradient;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultShaderHolder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/bidmachine/util/gradient/DefaultShaderHolder;", "Lio/bidmachine/util/gradient/ShaderHolder;", "shader", "Landroid/graphics/Shader;", "(Landroid/graphics/Shader;)V", "getShader", "isHardwareAccelerated", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultShaderHolder implements ShaderHolder {

    @NotNull
    private final Shader shader;

    public DefaultShaderHolder(@NotNull Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        this.shader = shader;
    }

    @Override // io.bidmachine.util.gradient.ShaderHolder
    @NotNull
    public Shader getShader(boolean isHardwareAccelerated) {
        return this.shader;
    }
}
